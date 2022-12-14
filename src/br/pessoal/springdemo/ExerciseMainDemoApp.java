package br.pessoal.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExerciseMainDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExerciseConfiguration.class);

        Coach coach = context.getBean("artisticGymnasticsCoach", ArtisticGymnasticsCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
