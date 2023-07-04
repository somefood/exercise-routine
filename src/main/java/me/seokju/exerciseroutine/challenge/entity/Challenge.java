package me.seokju.exerciseroutine.challenge.entity;

import lombok.Getter;
import me.seokju.exerciseroutine.common.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Entity
public class Challenge extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long memberId;

    private Long programId;

    private LocalDate startDate;

    private LocalDate endDate;
}
