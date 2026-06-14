package com.adjust.sdk.purchase;

/* JADX INFO: loaded from: classes5.dex */
public class AdjustPurchase {
    private static ADJPMerchant defaultInstance;

    private AdjustPurchase() {
    }

    public static synchronized ADJPMerchant getDefaultInstance() {
        try {
            if (defaultInstance == null) {
                defaultInstance = new ADJPMerchant();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return defaultInstance;
    }

    public static void init(ADJPConfig aDJPConfig) {
        if (defaultInstance != null) {
            ADJPLogger.getInstance().error("AdjustPurchase SDK is already initialised", new Object[0]);
        } else if (aDJPConfig.isValid()) {
            ADJPLogger.getInstance().setLogLevel(aDJPConfig.getLogLevel());
            getDefaultInstance().initialize(aDJPConfig);
        }
    }

    public static void verifyPurchase(String str, String str2, String str3, OnADJPVerificationFinished onADJPVerificationFinished) {
        if (onADJPVerificationFinished == null) {
            ADJPLogger.getInstance().error("Invalid OnADJPVerificationFinished listener", new Object[0]);
            return;
        }
        if (defaultInstance != null) {
            getDefaultInstance().verifyPurchase(str, str2, str3, onADJPVerificationFinished);
            return;
        }
        ADJPLogger.getInstance().error("AdjustPurchase SDK is not initialised", new Object[0]);
        ADJPVerificationInfo aDJPVerificationInfo = new ADJPVerificationInfo();
        aDJPVerificationInfo.setStatusCode(-1);
        aDJPVerificationInfo.setMessage("AdjustPurchase SDK is not initialised");
        aDJPVerificationInfo.setVerificationState(ADJPVerificationState.ADJPVerificationStateNotVerified);
        onADJPVerificationFinished.onVerificationFinished(aDJPVerificationInfo);
    }
}
