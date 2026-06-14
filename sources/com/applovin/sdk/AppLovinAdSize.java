package com.applovin.sdk;

import com.mobilefuse.sdk.MobileFuseNativeAdKt;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11800c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, "BANNER");
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, 250, "MREC");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, MobileFuseNativeAdKt.AD_TYPE);

    private AppLovinAdSize(int i10, int i11, String str) {
        this.f11799b = i10;
        this.f11800c = i11;
        this.f11798a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if ("BANNER".equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || "INTER".equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if (MobileFuseNativeAdKt.AD_TYPE.equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException("Unknown Ad Size: " + str);
    }

    public int getHeight() {
        return this.f11800c;
    }

    public String getLabel() {
        return this.f11798a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f11799b;
    }

    public String toString() {
        return getLabel();
    }
}
