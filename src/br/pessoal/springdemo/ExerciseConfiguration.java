package br.pessoal.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExerciseConfiguration {

    @Bean
    public LazyFortuneService lazyFortuneService(){
        return new LazyFortuneService();
    }

    @Bean
    public ArtisticGymnasticsCoach artisticGymnasticsCoach (){
        return new ArtisticGymnasticsCoach(lazyFortuneService());
    }
}
