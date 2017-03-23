package com.trial.controllers;

/**
 * Created by chaithra on 2/3/17.
 */
import com.trial.model.Student;
import com.trial.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/", method = RequestMethod.GET)
public class StudentController {

    @Autowired
    private StudentService studentService;

    /*@RequestMapping(value = "/", method = RequestMethod.GET)
    public List getstudents() {
        List products = new ArrayList();
        return products;
    }*/

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public List getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/saveStudent", method = RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public String saveStudents(@RequestBody Student student) {
            return studentService.saveStudents(student);
        }

    @RequestMapping(value = "/searchById/{id}", method = RequestMethod.GET)
    public Student getById(@PathVariable("id") String id)
    {
                return studentService.getById(id);

    }

    @RequestMapping(value = "/updateStudent/{id}", method = RequestMethod.PUT)
    public String updateStudent(@PathVariable("id") String id,@RequestBody Student student) {
        return studentService.updateStudent(id,student);
    }

    @RequestMapping(value = "/findByField", method = RequestMethod.GET)
    @ResponseBody
    public List<Student> findByField(@RequestParam("text") String text)
    {
       return studentService.findByField(text);

    }


}

