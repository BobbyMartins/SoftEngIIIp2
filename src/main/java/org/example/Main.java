package org.example;
import org.joda.time.DateTime;
import org.university.Course;
import org.university.Lecturer;
import org.university.Module;
import org.university.Student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student bobby = new Student("Bobby Martins", 23, DateTime.parse("2002-02-01"), 111111);
        Student eddie = new Student("Eddie O' Reilly", 21, DateTime.parse("2001-01-19"), 12346);
        Student jack = new Student("Jack Quinn", 25, DateTime.parse("2000-03-12"), 866442);
        Student thomas = new Student("Thomas Fitzmaurice",32, DateTime.parse("1992-03-28"), 345213);

        Lecturer michael = new Lecturer("Michael Schukat", 45, DateTime.parse("1987-02-21"),109742);
        Lecturer david = new Lecturer("David O'Sullivan", 51, DateTime.parse("1984-01-23"), 137821);

        Module database = new Module("Database Systems", "CT456");
        Module maths = new Module("Mathematics", "CT6453");
        Module stats = new Module("Intro to Statistics", "CT1242");

        Course compsci = new Course("GY350", DateTime.parse("2019-09-01"), DateTime.parse("2024-06-01"));
        Course arts = new Course("AY321", DateTime.parse("2017-09-01"), DateTime.parse("2021-06-01"));

        ArrayList<Student> students = new ArrayList<>();
        students.add(bobby);
        students.add(eddie);
        students.add(jack);
        students.add(thomas);

        database.setStudents(students);
        maths.addStudents(jack);
        maths.addStudents(thomas);
        stats.addStudents(bobby);

        database.setLecturer(michael);
        maths.setLecturer(david);
        stats.setLecturer(michael);

        //based off of reasoning that a student can attend module of a course but not be a part of that course
        compsci.addModules(database);
        compsci.addStudent(bobby);
        compsci.addStudent(eddie);

        arts.setStudents(students);
        arts.addModules(maths);
        arts.addModules(stats);

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(compsci);
        courses.add(arts);


        for (Course course : courses){System.out.println(course);}

    }
}