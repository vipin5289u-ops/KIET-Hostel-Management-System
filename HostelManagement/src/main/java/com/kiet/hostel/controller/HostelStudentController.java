package com.kiet.hostel.controller;

import com.kiet.hostel.entity.HostelStudent;
import com.kiet.hostel.repository.HostelStudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class HostelStudentController {

    @Autowired
    private HostelStudentRepository repository;

    // (b) Add student
    @PostMapping
    public HostelStudent addStudent(
            @RequestBody HostelStudent student) {

        return repository.save(student);
    }

    // (c) Get all students
    @GetMapping
    public List<HostelStudent> getAllStudents() {

        return repository.findAll();
    }

    // (c) Get student by ID
    @GetMapping("/{id}")
    public HostelStudent getStudentById(
            @PathVariable int id) {

        return repository.findById(id).orElse(null);
    }

    // (d) Update student
    @PutMapping("/{id}")
    public HostelStudent updateStudent(
            @PathVariable int id,
            @RequestBody HostelStudent student) {

        HostelStudent existing =
                repository.findById(id).orElse(null);

        if (existing != null) {

            existing.setStudentName(student.getStudentName());
            existing.setRollNumber(student.getRollNumber());
            existing.setHostelName(student.getHostelName());
            existing.setRoomNumber(student.getRoomNumber());
            existing.setFee(student.getFee());

            return repository.save(existing);
        }

        return null;
    }

    // (e) Delete student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {

        repository.deleteById(id);

        return "Student deleted successfully";
    }
}