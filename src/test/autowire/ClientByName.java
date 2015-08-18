package test.autowire;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;




import beans.autowire.byname.Categories;

public class ClientByName {

	public static void main(String[] args) {
		/*Resource res=new ClassPathResource("resource/spConfigByname.xml");
		System.out.println("mmmmmmmmmmmmmmmmmm");
		BeanFactory bf=new XmlBeanFactory(res);
		System.out.println("nnnnnnnnnnnnnn");
		Categories bn=(Categories)bf.getBean("bid");
		System.out.println("bbbbbbbbbbbbbbb");
		bn.show();*/
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("ApplicationContext1.xml");
		System.out.println("first ap==="+ap);
		ap.getBean("t");
		
	/*	ApplicationContext ap1=new ClassPathXmlApplicationContext("ApplicationContext1.xml");
		System.out.println("first ap==="+ap1);
		ap1.getBean("t");*/
	}
}