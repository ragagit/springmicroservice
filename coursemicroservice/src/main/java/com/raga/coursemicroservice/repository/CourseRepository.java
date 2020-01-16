package com.raga.coursemicroservice.repository;

import com.raga.coursemicroservice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
