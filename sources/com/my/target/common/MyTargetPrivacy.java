package com.my.target.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class MyTargetPrivacy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f59426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f59427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f59428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f59429d;

    @Nullable
    public final Boolean ccpaUserConsent;

    @Nullable
    public final Boolean iabUserConsent;
    public final boolean userAgeRestricted;

    @Nullable
    public final Boolean userConsent;

    public MyTargetPrivacy(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, boolean z10) {
        this.userConsent = bool;
        this.ccpaUserConsent = bool2;
        this.iabUserConsent = bool3;
        this.userAgeRestricted = z10;
    }

    @NonNull
    public static MyTargetPrivacy currentPrivacy() {
        return new MyTargetPrivacy(f59426a, f59427b, f59428c, f59429d);
    }

    public static void setCcpaUserConsent(boolean z10) {
        f59427b = Boolean.valueOf(z10);
    }

    public static void setIabUserConsent(boolean z10) {
        f59428c = Boolean.valueOf(z10);
    }

    public static void setUserAgeRestricted(boolean z10) {
        f59429d = z10;
    }

    public static void setUserConsent(boolean z10) {
        f59426a = Boolean.valueOf(z10);
    }

    public boolean isConsent() {
        Boolean bool = Boolean.FALSE;
        return (bool.equals(this.userConsent) || bool.equals(this.ccpaUserConsent) || bool.equals(this.iabUserConsent)) ? false : true;
    }
}
