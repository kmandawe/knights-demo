package com.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightAopMain {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("knights-aop.xml");

    Knight knight = context.getBean(Knight.class);

    knight.embarkOnQuest();
  }
}
