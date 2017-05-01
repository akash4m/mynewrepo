package com.akash.start;

import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Start {

	private static boolean startDb = false;
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
      
/*		 Session session = HibernateSessionManager.getSessionFactory().openSession();

		 session.beginTransaction();
		 User user = new User();

         user.setUserId(2);
         user.setCreatedBy("akash");
         user.setUsername("ashish");
         user.setCreatedDate(new Date());
         
		 session.save(user);
		 session.getTransaction().commit();*/
		
		try {
			
			Document doc = Jsoup.connect("http://www.porn.com/").get();
			
			Elements questions = doc.select("a[href]");
			for(Element link: questions){
			
				if(link.html().toString().split("<")[0].contains(">")){
				     if(link.html().toString().split("<")[0].split(">")[1].contains(">")){
					System.out.println(link.html().toString().split("<")[0].split(">")[1].split("<")[0]);
				
				     }}
				/*if(link.html().toString().matches("[a-zA-Z]+")){
					//if(!link.html().toString().contains("<"))
					PornCategory pornCat = new PornCategory();
					
					if("Amateur".equals(link.html().toString().split("<")[0].split(">")[1].split("<")[0]))
					startDb = true;
					
					if(startDb){
						pornCat.setCategory(link.html().toString().split("<")[0]);
						pornCat.setDomain("http://porn.com");
						pornCat.setUrl("http://www.porn.com"+link.getElementsByAttribute("href").toString().split("\"")[1]);
	                    //save(pornCat);				
						System.out.println("http://www.porn.com"+link.getElementsByAttribute("href").toString().split("\"")[1]+"||"+link.html().toString().split("<")[0].split(">")[1].split("<")[0]);
					}
					if("White Panties".equals(link.html().toString().split("<")[0])){
						
						startDb = false;
					    break;
					}
				}*/
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void save(PornCategory pornCat){
		Session session = HibernateSessionManager.getSessionFactory().openSession();

		 session.beginTransaction();
		 session.save(pornCat);
		 session.getTransaction().commit();
		
	}
	
}
