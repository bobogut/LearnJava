package com.bobo;

import com.bobo.pobj.Student;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    private List<Student> students;
    private Grader grader;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        var ids = new int[] { 1, 2, 3, 4 };
        var names = new String[] { "Alex", "Bobby", "Cathy", "Dora"};
        var scores = new int[] { 4, 3, 2, 1 };
        students = new ArrayList<Student>();

        for (var i=0; i<ids.length; i++) {
            var s = new Student(ids[i], names[i], scores[i]);
            students.add(s);
        }

        grader = new Grader();
    }

    @org.junit.jupiter.api.Test
    void getHighestScoreStudent() {
        var highestScore = grader.getHighestScoreStudent(students);
        assertEquals(1, highestScore.id);
    }

    @org.junit.jupiter.api.Test
    void getLowestScoreStudent() {
    }

    @org.junit.jupiter.api.Test
    void getAverageScore() {
    }

    @org.junit.jupiter.api.Test
    void getFailedStudents() {
    }

    @org.junit.jupiter.api.Test
    void testGetFailedStudentsWithPredicate() {
        var failed = grader.getFailedStudents(students, p -> p.score < 3);
        for (var s: failed) {
            p(s.toString());
        }
    }

    private void p(String s) {
        System.out.println(s);
    }

    private void testString() {
        var joe = "joe";
        var bob = "bob";

        p("joe == bob " + Boolean.toString(joe == bob));
        bob = "joe";
        p("joe == bob (renamed) " + Boolean.toString(joe == bob));

        var joeBuilder = new StringBuffer("j");
        joeBuilder.append("oe");
        var joeBuilder2 = new StringBuffer("j");
        joeBuilder2.append("oe");

        p("joeBuilder == joeBuilder2 " + Boolean.toString(joeBuilder == joeBuilder2));
        p("joeBuilder == joeBuilder2 " + Boolean.toString(joeBuilder == joeBuilder2));
        p("joeBuilder == joeBuilder2 toString() " + Boolean.toString(joeBuilder.toString() == joeBuilder2.toString()));
        p("joeBuilder == joeBuilder2 toString().equal() " + Boolean.toString(joeBuilder.toString().equals(joeBuilder2.toString())));
        p("joe == joeBuilder2.toString() " + Boolean.toString(joe == joeBuilder2.toString()));

        joe = "bob";
        bob = "bob";
        p("joe == bob (renamed) " + Boolean.toString(joe == bob));
    }

}