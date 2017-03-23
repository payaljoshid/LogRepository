package com.trial.utils;

import org.springframework.context.annotation.Bean;

/**
 * Created by chaithra on 21/3/17.
 */

public class regexLog {
    public final String regex= "^(https?|ftp|file)://([-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]|((\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3}):(\\d{4})))";
    public String regexProperty = regex.concat("(/api/resources/)(\\d{1,})(/property/)(\\d{1,})(/update)");
    public String regexChain=regex.concat("(/api/resources/)(\\d{1,})(/chain)");
    public String regexRoom=regex.concat("(/api/resources/)(\\d{1,})(/rooms/)(\\d{1,})");
    public String regexRoomType=regex.concat("(/api/resources/)(\\d{1,})(/roomTypes/)(\\d{1,})");
    public String regexMealPlans=regex.concat("(/api/resources/)(\\d{1,})(/mealPlans/)(\\d{1,})");
    public String regexSurchargePlans=regex.concat("(/api/resources/)(\\d{1,})(/surchargePlans/)(\\d{1,})");
    public String regexReservations=regex.concat("(/api/resources/)(\\d{1,})(/reservations)");
    public String regexPrices=regex.concat("(/api/resources/)(\\d{1,})(/prices)");
    //public String utils= "^(https?|ftp|file)://([-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]|((\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3}):(\\d{4})))";

}
