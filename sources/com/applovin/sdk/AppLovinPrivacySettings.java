package com.applovin.sdk;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.impl.n7;
import com.applovin.impl.p0;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;

/* JADX INFO: loaded from: classes6.dex */
public class AppLovinPrivacySettings {
    @Nullable
    public static Boolean getAdditionalConsentStatus(int i10) {
        k kVarF = n7.f();
        if (kVarF != null) {
            return kVarF.r0().a(i10);
        }
        o.h("AppLovinPrivacySettings", "Unable to retrieve additional consent status");
        return null;
    }

    @Nullable
    public static Boolean getPurposeConsentStatus(int i10) {
        k kVarF = n7.f();
        if (kVarF != null) {
            return kVarF.r0().b(i10);
        }
        o.h("AppLovinPrivacySettings", "Unable to retrieve purpose consent status");
        return null;
    }

    @Nullable
    public static Boolean getSpecialFeatureOptInStatus(int i10) {
        k kVarF = n7.f();
        if (kVarF != null) {
            return kVarF.r0().c(i10);
        }
        o.h("AppLovinPrivacySettings", "Unable to retrieve special feature opt in status");
        return null;
    }

    @Nullable
    public static Boolean getTcfVendorConsentStatus(int i10) {
        k kVarF = n7.f();
        if (kVarF != null) {
            return kVarF.r0().d(i10);
        }
        o.h("AppLovinPrivacySettings", "Unable to retrieve TCF vendor consent status");
        return null;
    }

    public static boolean hasUserConsent() {
        return hasUserConsent(k.o());
    }

    public static boolean isDoNotSell() {
        return isDoNotSell(k.o());
    }

    public static boolean isDoNotSellSet() {
        return isDoNotSellSet(k.o());
    }

    public static boolean isUserConsentSet() {
        return isUserConsentSet(k.o());
    }

    public static void setDoNotSell(boolean z10) {
        setDoNotSell(z10, k.o());
    }

    public static void setHasUserConsent(boolean z10) {
        setHasUserConsent(z10, k.o());
    }

    @Deprecated
    public static boolean hasUserConsent(Context context) {
        Boolean boolB = p0.b().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSell(Context context) {
        Boolean boolB = p0.a().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSellSet(Context context) {
        return p0.a().b(context) != null;
    }

    @Deprecated
    public static boolean isUserConsentSet(Context context) {
        return p0.b().b(context) != null;
    }

    @Deprecated
    public static void setDoNotSell(boolean z10, Context context) {
        o.g("AppLovinPrivacySettings", "setDoNotSell()");
        if (p0.a(z10, context)) {
            AppLovinSdk.getInstance(context).reinitialize(null, Boolean.valueOf(z10));
        }
    }

    @Deprecated
    public static void setHasUserConsent(boolean z10, Context context) {
        o.g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (p0.b(z10, context)) {
            AppLovinSdk.getInstance(context).reinitialize(Boolean.valueOf(z10), null);
        }
    }
}
