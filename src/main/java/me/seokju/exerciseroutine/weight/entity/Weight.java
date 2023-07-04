package me.seokju.exerciseroutine.weight.entity;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import me.seokju.exerciseroutine.common.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Weight extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double weight;

    private Long userId;

    public Weight(Double weight, Long userId) {
        this.weight = weight;
        this.userId = userId;
    }
}
