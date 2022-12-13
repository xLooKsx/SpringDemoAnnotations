package br.pessoal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach mySillyCoach = context.getBean("tennisCoach", TennisCoach.class);
        System.out.println(mySillyCoach.getDailyWorkout());

        context.close();

    }
}
