package com.menglu;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
  @Test
  public void test1(){
    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    User user = context.getBean("user",User.class);
    System.out.println(user);
    user.add();

  }

  @Test
  public void test2(){
    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    Book book = context.getBean("book",Book.class);
    System.out.println(book.getbAuthor());


  }
}
