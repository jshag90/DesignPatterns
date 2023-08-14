package com.ji.behavioral_patterns.state.after;

import com.ji.behavioral_patterns.state.after.Student;

public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);

}
