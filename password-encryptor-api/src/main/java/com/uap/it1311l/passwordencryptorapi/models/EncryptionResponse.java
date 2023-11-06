package com.uap.it1311l.passwordencryptorapi.models;

public class EncryptionResponse {
    private String status;
    private String result;


    public EncryptionResponse() {
    }

    // Getters and setters for 'status'
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Getters and setters for 'result'
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

