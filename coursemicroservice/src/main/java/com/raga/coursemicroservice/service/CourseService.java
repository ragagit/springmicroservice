package com.raga.coursemicroservice.service;

import com.raga.coursemicroservice.model.Course;
import com.raga.coursemicroservice.model.Transaction;

import java.util.List;

public interface CourseService {
    List<Course> allCourses();

    Course findCourseById(Long courseId);

    List<Transaction> findTransactionsOfUser(Long userId);

    List<Transaction> findTransactionsOfCourse(Long courseId);

    Transaction saveTransaction(Transaction transaction);
}
