package br.pessoal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationPostConstructorDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("footballCoach", FootballCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
    }
}
