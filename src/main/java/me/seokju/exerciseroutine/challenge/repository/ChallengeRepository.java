package me.seokju.exerciseroutine.challenge.repository;

import me.seokju.exerciseroutine.challenge.entity.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChallengeRepository extends JpaRepository<Challenge, Long> {
}
