package com.trial.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import com.trial.model.Log;
import java.util.HashMap;
import java.util.List;

/**
 * Created by chaithra on 21/3/17.
 */
@Document
@Getter
@Setter
public class property {
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
