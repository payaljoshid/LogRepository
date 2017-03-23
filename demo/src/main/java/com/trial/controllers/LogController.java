package com.trial.controllers;

import com.trial.model.Log;
import com.trial.services.LogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * Created by chaithra on 20/3/17.
 */
@RestController
@RequestMapping(value = "/")
public class LogController
{
    @Autowired
    LogServices logServices;

    @RequestMapping(value = "/saveByUrl", method = RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public String saveByUrl(@RequestBody Log log) {
        return logServices.saveByUrl(log);
    }

}
