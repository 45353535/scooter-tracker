package com.adjust.sdk.purchase;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class ADJPConfig {
    private String appToken;
    private String environment;
    private ADJPLogLevel logLevel = ADJPLogLevel.INFO;
    private String sdkPrefix;

    public ADJPConfig(String str, String str2) {
        this.appToken = str;
        this.environment = str2;
    }

    public String getAppToken() {
        return this.appToken;
    }

    public String getClientSdk() {
        String str = this.sdkPrefix;
        return str == null ? ADJPConstants.SDK_VERSION : String.format(Locale.US, "%s@%s", str, ADJPConstants.SDK_VERSION);
    }

    public String getEnvironment() {
        return this.environment;
    }

    public ADJPLogLevel getLogLevel() {
        return this.logLevel;
    }

    public boolean isValid() {
        String str = this.appToken;
        if (str == null) {
            ADJPLogger.getInstance().error("Invalid app token", new Object[0]);
            return false;
        }
        if (str.length() != 12) {
            ADJPLogger.getInstance().error("Invalid app token", new Object[0]);
            return false;
        }
        String str2 = this.environment;
        if (str2 == null) {
            ADJPLogger.getInstance().error("Invalid environment", new Object[0]);
            return false;
        }
        if (!str2.equalsIgnoreCase("sandbox") && !this.environment.equalsIgnoreCase("production")) {
            ADJPLogger.getInstance().error("Invalid environment", new Object[0]);
            return false;
        }
        if (this.environment.equalsIgnoreCase("sandbox")) {
            ADJPLogger.getInstance().Assert("SANDBOX: AdjustPurchase is running in sandbox mode. Use this setting for testing. Don't forget to set the environment to `production` before publishing!", new Object[0]);
            return true;
        }
        if (this.environment.equalsIgnoreCase("production")) {
            ADJPLogger.getInstance().Assert("PRODUCTION: AdjustPurchase is running in production mode. Use this setting only for the build that you want to publish. Set the environment to `sandbox` if you want to test your app!", new Object[0]);
        }
        return true;
    }

    public void setLogLevel(ADJPLogLevel aDJPLogLevel) {
        this.logLevel = aDJPLogLevel;
    }

    public void setSdkPrefix(String str) {
        this.sdkPrefix = str;
    }
}
