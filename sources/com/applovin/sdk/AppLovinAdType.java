package com.applovin.sdk;

import com.mobilefuse.sdk.MobileFuseNativeAdKt;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class AppLovinAdType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11801a;
    public static final AppLovinAdType REGULAR = new AppLovinAdType("REGULAR");
    public static final AppLovinAdType APP_OPEN = new AppLovinAdType("APPOPEN");
    public static final AppLovinAdType INCENTIVIZED = new AppLovinAdType("VIDEOA");
    public static final AppLovinAdType NATIVE = new AppLovinAdType(MobileFuseNativeAdKt.AD_TYPE);

    private AppLovinAdType(String str) {
        this.f11801a = str;
    }

    public static AppLovinAdType fromString(String str) {
        if ("REGULAR".equalsIgnoreCase(str)) {
            return REGULAR;
        }
        if ("APPOPEN".equalsIgnoreCase(str)) {
            return APP_OPEN;
        }
        if ("VIDEOA".equalsIgnoreCase(str)) {
            return INCENTIVIZED;
        }
        if (MobileFuseNativeAdKt.AD_TYPE.equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException("Unknown Ad Type: " + str);
    }

    public String getLabel() {
        return this.f11801a.toUpperCase(Locale.ENGLISH);
    }

    public String toString() {
        return getLabel();
    }
}
