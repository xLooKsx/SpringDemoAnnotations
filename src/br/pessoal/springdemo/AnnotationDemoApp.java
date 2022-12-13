package br.pessoal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");

        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println("Getting swimCoach data and fortune");
        System.out.println("SwimCoach email: "+swimCoach.getEmail());
        System.out.println("SwimCoach team: "+swimCoach.getTeam());
        System.out.println("SwimCoach fortune: "+swimCoach.getDailyFortune());



        context.close();

    }
}
