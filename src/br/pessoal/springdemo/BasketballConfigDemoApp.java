package br.pessoal.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasketballConfigDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        BasketballCoach theCoach = context.getBean("basketballCoach", BasketballCoach.class);

        System.out.println("basketball coach team name is "+theCoach.getTeam());
        System.out.println("basketball coach contact is: "+theCoach.getEmail());


        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        context.close();

    }
}
