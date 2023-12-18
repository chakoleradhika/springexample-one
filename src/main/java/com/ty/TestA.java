package com.ty;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class TestA
{
	public static void main(String[] args) {
		
		//creating the object of Resource 
		Resource res =new ClassPathResource("my_config.xml");
		
		//Creating the object of BeanFactory 
		BeanFactory factory = new XmlBeanFactory(res);
		
		Person person =(Person)factory.getBean("myPerson");
		person.message();
		
		//Creating J2EE container which is a IOC container
		
		ApplicationContext context = new ClassPathXmlApplicationContext("my_config.xml");
		
		Animal animal =(Animal)context.getBean("myAnimal");
		
		animal.sound();
		
		//cresting a J2EE container
		
		ConfigurableApplicationContext con= new ClassPathXmlApplicationContext("my_config.xml");
		
		Dog dog = (Dog)con.getBean("myDog");
		dog.sound();
		
	}

}
