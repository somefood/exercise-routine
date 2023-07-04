package me.seokju.exerciseroutine.program.repository;

import me.seokju.exerciseroutine.program.entity.Program;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramRepository extends JpaRepository<Program, Long> {
}
