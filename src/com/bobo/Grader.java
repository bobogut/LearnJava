package com.bobo;

import com.bobo.pobj.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Grader {

    public Student getHighestScoreStudent(List<Student> students) {
        return students.get(0);
    }

    public Student getLowestScoreStudent(List<Student> students) {
        return null;
    }

    public int getAverageScore(List<Student> students) {
        return -1;
    }

    public List<Student> getFailedStudents(List<Student> students) {
        var failedStudents = new ArrayList<Student>();
        return failedStudents;
    }

    public List<Student> getFailedStudents(List<Student> students, Predicate<Student> test) {
        return students.stream().filter(test).collect(Collectors.toList());
    }
}
