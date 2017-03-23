package com.trial.services;

import com.trial.repository.StudentRepository;
import com.trial.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by chaithra on 2/3/17.
 */
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List getAllStudents() {
        return studentRepository.findAll();
    }

    public String saveStudents(Student student) {

        //studentRepository.deleteAll();
        studentRepository.save(student);
        //studentRepository.save(new Student("Chaithra", "mca", 80.8));
        return "Saved succesfully";
    }

    public Student getById(String id) {
       Student student= studentRepository.findById(id);
        return student;
    }

    public String updateStudent(String id,Student student) {
        Student studentId = studentRepository.findById(id);
        studentId.setName(student.getName());
        studentId.setCourse(student.getCourse());
        studentId.setGpa(student.getGpa());
        studentRepository.save(studentId);
        return "Updated successfully";
    }

    public List<Student> findByField(String text)
    {
        List<Student> studentList= studentRepository.findAll();
        List<Student> studentListResult= studentList.stream().filter(t->t.getCourse().equals(text) || t.getName().equals(text) || t.getId().equals(text) || t.getGpa()==Double.parseDouble(text))
                .collect(Collectors.toList());
        return studentListResult;
    }
}

