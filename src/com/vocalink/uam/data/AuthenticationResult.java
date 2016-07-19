package com.vocalink.uam.data;

/**
 * Created by VocaLink on 19/07/2016.
 */
public class AuthenticationResult {
    private String status;
    private String token;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
