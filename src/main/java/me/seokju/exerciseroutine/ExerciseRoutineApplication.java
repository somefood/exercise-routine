package me.seokju.exerciseroutine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ExerciseRoutineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseRoutineApplication.class, args);
    }

}
