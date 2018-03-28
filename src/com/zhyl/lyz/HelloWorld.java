package com.zhyl.lyz;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
	
	/*private String message;

	public void setMessage(String message) {
		
		this.message = message;
		
	}
	
	public void getMessage() {
		
		System.out.println("你的信息："+message);
		
	}
	
	public void init() {
		System.out.println("init...");
	}
	
	public void destroy() {
		System.out.println("destroy...");
	}*/
	
	/*private String message1;
	private String message2;
	
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	public void getMessage1(){
        System.out.println("World Message1 : " + message1);
    }
    public void getMessage2(){
        System.out.println("World Message2 : " + message2);
    }*/
	
	//JSR-250注解形式
	private String message;
	public void setMessage(String message){
		this.message  = message;
	}
	public String getMessage(){
	    System.out.println("Your Message : " + message);
	    return message;
	}
	@PostConstruct
	public void init(){
	    System.out.println("Bean is going through init.");
	}
    @PreDestroy
	public void destroy(){
	    System.out.println("Bean will destroy now.");
	}
	
	
}
