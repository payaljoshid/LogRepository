package com.trial.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by chaithra on 21/3/17.
 */
@Document
public class roomType {
    String url;
    String requestBody;

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
