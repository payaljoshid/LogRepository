package com.trial.model;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoSimpleTypes;

/**
 * Created by chaithra on 2/3/17.
 */
//@Document(collection = "students")
@NoArgsConstructor
public class Student {

    @Id
    public String id;

    public String name;
    public String course;
    public double gpa;

    public Student(String name, String course, double gpa) {
        this.name = name;
        this.course = course;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
