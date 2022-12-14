package br.pessoal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("tennisCoach", TennisCoach.class);

        Coach secondCoach = context.getBean("tennisCoach", TennisCoach.class);

        boolean areTheyEqual = coach == secondCoach;

        System.out.println("They are pointing for the same object ? "+areTheyEqual);
        System.out.println("memory location for the first coach "+coach);
        System.out.println("memory location for the second coach "+secondCoach);

        context.close();
    }
}
