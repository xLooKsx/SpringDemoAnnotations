package br.pessoal.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasketballConfigDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach theCoach = context.getBean("basketballCoach", BasketballCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        context.close();

    }
}
