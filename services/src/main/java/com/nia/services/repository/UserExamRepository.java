package com.nia.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nia.services.entity.UserExam;

public interface UserExamRepository extends JpaRepository<UserExam, Long> {

}
