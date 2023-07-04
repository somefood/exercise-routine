package me.seokju.exerciseroutine.timetable.entity;

import javax.persistence.*;
import java.time.DayOfWeek;

@Entity
public class TimeTable {

    @Id
    @GeneratedValue
    private Long id;

    private Long userId;

    @Enumerated(value = EnumType.STRING)
    private DayOfWeek dayOfWeek;
}
