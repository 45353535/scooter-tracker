package com.adjust.sdk.purchase;

/* JADX INFO: loaded from: classes5.dex */
public class ADJPMerchantItem {
    private OnADJPVerificationFinished callback;
    private String developerPayload;
    private String itemSku;
    private String itemToken;

    public ADJPMerchantItem(String str, String str2, String str3, OnADJPVerificationFinished onADJPVerificationFinished) {
        this.itemSku = str;
        this.itemToken = str2;
        this.developerPayload = str3;
        this.callback = onADJPVerificationFinished;
    }

    public OnADJPVerificationFinished getCallback() {
        return this.callback;
    }

    public String getDeveloperPayload() {
        return this.developerPayload;
    }

    public String getItemSku() {
        return this.itemSku;
    }

    public String getItemToken() {
        return this.itemToken;
    }

    public boolean isValid() {
        String str = this.itemSku;
        if (str == null) {
            ADJPLogger.getInstance().error("SKU not set", new Object[0]);
            return false;
        }
        if (str.isEmpty()) {
            ADJPLogger.getInstance().error("SKU not valid", new Object[0]);
            return false;
        }
        String str2 = this.itemToken;
        if (str2 == null) {
            ADJPLogger.getInstance().error("Token not set", new Object[0]);
            return false;
        }
        if (str2.isEmpty()) {
            ADJPLogger.getInstance().error("Token not valid", new Object[0]);
            return false;
        }
        if (this.developerPayload != null) {
            return true;
        }
        ADJPLogger.getInstance().error("Developer payload not set", new Object[0]);
        return false;
    }

    public boolean isValid(String str) {
        String str2 = this.itemSku;
        if (str2 == null) {
            ADJPLogger.getInstance().error("SKU value can't be null", new Object[0]);
            return false;
        }
        if (str2.isEmpty()) {
            ADJPLogger.getInstance().error("SKU value can't be empty string", new Object[0]);
            return false;
        }
        String str3 = this.itemToken;
        if (str3 == null) {
            ADJPLogger.getInstance().error("Token value can't be null", new Object[0]);
            return false;
        }
        if (str3.isEmpty()) {
            ADJPLogger.getInstance().error("Token value can't be empty string", new Object[0]);
            return false;
        }
        if (this.developerPayload != null) {
            return true;
        }
        ADJPLogger.getInstance().error("Developer payload value can't be null", new Object[0]);
        return false;
    }
}
