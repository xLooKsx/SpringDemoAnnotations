package br.pessoal.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class TextFileFortuneService implements FortuneService{

    private List<String> listOfStrings = new ArrayList<String>();
    private final Random random = new Random();

    @PostConstruct
    private void readFortuneFromTextFile() throws IOException {

        System.out.println("PostConstruct annotation called");
        BufferedReader bf = new BufferedReader(new FileReader("src/fortune.txt"));
        String line = bf.readLine();

        while (line != null) {
            listOfStrings.add(line);
            line = bf.readLine();
        }

        bf.close();
    }

    @Override
    public String getFortune() {
        return listOfStrings.get(random.nextInt(listOfStrings.size()));
    }
}
