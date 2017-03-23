package com.trial.repository;

import com.trial.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chaithra on 2/3/17.
 */
@Repository
public interface StudentRepository extends MongoRepository<Student,Integer>
{
   public Student findById(String id);
   //public List<Student> updateByID(Query query,String id);

}
