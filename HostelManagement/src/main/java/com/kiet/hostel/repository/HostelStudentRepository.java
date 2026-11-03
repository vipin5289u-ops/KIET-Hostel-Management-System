package com.kiet.hostel.repository;

import com.kiet.hostel.entity.HostelStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostelStudentRepository
        extends JpaRepository<HostelStudent, Integer> {
}