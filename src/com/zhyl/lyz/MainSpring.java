package com.zhyl.lyz;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainSpring {

	public static void main(String[] args) {
		
		/*ApplicationContext context = 
		       new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();*/
		
		/*XmlBeanFactory factory = new XmlBeanFactory
	            (new ClassPathResource("Beans.xml"));
		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
		obj.getMessage();*/
		
		/*ApplicationContext context = new FileSystemXmlApplicationContext
	            ("F:/work/HelloSpring/src/Beans.xml");
	    HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	    obj.getMessage();*/
		
		//作用域
		/*ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
	      objA.setMessage("I'm object A");
	      objA.getMessage();
	      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
	      objB.getMessage(); */
		
		/*AbstractApplicationContext context = 
			       new ClassPathXmlApplicationContext("Beans.xml");
			HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
			obj.getMessage();
			context.registerShutdownHook();	*/
		
		/*ApplicationContext context = 
			       new ClassPathXmlApplicationContext("Beans.xml");
			HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
			objA.getMessage1();
			objA.getMessage2();
			HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
			objB.getMessage1();
			objB.getMessage2();
			objB.getMessage3();*/
		
		//基于构造函数的依赖注入
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//TextEditor te = (TextEditor) context.getBean("textEditor");
		/*te.spelling();*/
		
		//基于设值函数的依赖注入
		/*ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();*/
		
		//注入集合
		/*ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();*/
		
		//自动装配 ByName
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}
}
