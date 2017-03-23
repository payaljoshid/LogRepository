package com.trial.services;

import com.trial.model.*;
import com.trial.utils.*;
import com.trial.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


/**
 * Created by chaithra on 20/3/17.
 */
@Service
public class LogServices extends regexLog{

    @Autowired
    LogRepository logRepository;
    @Autowired
    propertyRepository propertyRepository;
    @Autowired
    chainRepository chainRepository;
    @Autowired
    mealPlanRepository mealPlanRepository;
    @Autowired
    pricesRepository pricesRepository;
    @Autowired
    reservationRepository reservationRepository;
    @Autowired
    roomsRepository roomsRepository;
    @Autowired
    roomTypeRepository roomTypeRepository;
    @Autowired
    surchargePlansRepository surchargePlansRepository;


    property property=new property();
    chain chain=new chain();
    mealPlans mealPlans=new mealPlans();
    prices prices=new prices();
    reservations reservations=new reservations();
    rooms rooms=new rooms();
    roomType roomType=new roomType();
    surchargePlans surchargePlans=new surchargePlans();

    public String saveByUrl(Log log) {
        // String utils = "<\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]>";
        // Pattern pattern = Pattern.compile(utils);
        // Matcher matcher = pattern.matcher(log.getUrl());

        String url=log.getUrl();
        try {
            if (Pattern.matches(regexProperty, log.getUrl())) {
                property.setUrl(log.getUrl());
                property.setRequestBody(log.getRequestBody());
                propertyRepository.save(property);
            } else if (Pattern.matches(regexChain, log.getUrl())) {
                chain.setUrl(log.getUrl());
                chain.setRequestBody(log.getRequestBody());
                chainRepository.save(chain);
            } else if (Pattern.matches(regexRoom, log.getUrl())) {
                rooms.setUrl(log.getUrl());
                rooms.setRequestBody(log.getRequestBody());
                roomsRepository.save(rooms);
            } else if (Pattern.matches(regexRoomType, log.getUrl())) {
                roomType.setUrl(log.getUrl());
                roomType.setRequestBody(log.getRequestBody());
                roomTypeRepository.save(roomType);
            } else if (Pattern.matches(regexMealPlans, log.getUrl())) {
                mealPlans.setUrl(log.getUrl());
                mealPlans.setRequestBody(log.getRequestBody());
                mealPlanRepository.save(mealPlans);
            } else if (Pattern.matches(regexSurchargePlans, log.getUrl())) {
                surchargePlans.setUrl(log.getUrl());
                surchargePlans.setRequestBody(log.getRequestBody());
                surchargePlansRepository.save(surchargePlans);
            } else if (Pattern.matches(regexReservations, log.getUrl())) {
                reservations.setUrl(log.getUrl());
                reservations.setRequestBody(log.getRequestBody());
                reservationRepository.save(reservations);
            } else if (Pattern.matches(regexPrices, log.getUrl())) {
                prices.setUrl(log.getUrl());
                prices.setRequestBody(log.getRequestBody());
                pricesRepository.save(prices);
            }
             else {
                return "Url not matched";
            }
        } catch (PatternSyntaxException e) {
            System.out.println(e);
        }
        return "Saved successsfully ";
    }

}