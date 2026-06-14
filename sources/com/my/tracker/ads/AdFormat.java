package com.my.tracker.ads;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes11.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface AdFormat {

    @NonNull
    public static final String BANNER = "banner";

    @NonNull
    public static final String INTERSTITIAL = "interstitial";

    @NonNull
    public static final String NATIVE = "native";

    @NonNull
    public static final String REWARDED = "rewarded";
}
