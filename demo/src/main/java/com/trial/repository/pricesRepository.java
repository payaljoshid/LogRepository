package com.trial.repository;

import com.trial.model.Log;
import com.trial.model.prices;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by chaithra on 20/3/17.
 */
@Repository
public interface pricesRepository extends MongoRepository<prices,String> {
}
