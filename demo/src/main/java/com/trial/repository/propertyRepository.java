package com.trial.repository;

import com.trial.model.Log;
import com.trial.model.property;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

/**
 * Created by chaithra on 20/3/17.
 */
@Repository
public interface propertyRepository extends MongoRepository<property,String> {

}

