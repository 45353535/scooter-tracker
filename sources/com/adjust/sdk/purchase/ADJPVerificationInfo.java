package com.adjust.sdk.purchase;

/* JADX INFO: loaded from: classes5.dex */
public class ADJPVerificationInfo {
    private String message;
    private Integer statusCode;
    private ADJPVerificationState verificationState;

    public ADJPVerificationInfo() {
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ADJPVerificationState getVerificationState() {
        return this.verificationState;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public void setVerificationState(ADJPVerificationState aDJPVerificationState) {
        this.verificationState = aDJPVerificationState;
    }

    public ADJPVerificationInfo(String str, Integer num, ADJPVerificationState aDJPVerificationState) {
        this.message = str;
        this.statusCode = num;
        this.verificationState = aDJPVerificationState;
    }
}
