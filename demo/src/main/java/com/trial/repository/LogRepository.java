package com.trial.repository;

import com.trial.model.Log;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by chaithra on 22/3/17.
 */
@Repository
public interface LogRepository extends MongoRepository<Log,String>{
}
