package me.seokju.exerciseroutine.exercise.repository;

import me.seokju.exerciseroutine.exercise.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
