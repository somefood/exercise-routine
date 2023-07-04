package me.seokju.exerciseroutine.member.repository;

import me.seokju.exerciseroutine.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
