package me.seokju.exerciseroutine.weight.repository;

import me.seokju.exerciseroutine.weight.entity.Weight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeightRepository extends JpaRepository<Weight, Long> {

    List<Weight> findAllByUserId(Long userId);
}
