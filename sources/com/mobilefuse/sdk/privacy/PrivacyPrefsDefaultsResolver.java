package com.mobilefuse.sdk.privacy;

import android.content.SharedPreferences;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.device.DeviceCache;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0006H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002¨\u0006\b"}, d2 = {"Lcom/mobilefuse/sdk/privacy/PrivacyPrefsDefaultsResolver;", "", "()V", "resolveDefaults", "", "resolveGppConsentString", "Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "resolveUsPrivacyConsentString", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class PrivacyPrefsDefaultsResolver {

    @NotNull
    public static final PrivacyPrefsDefaultsResolver INSTANCE = new PrivacyPrefsDefaultsResolver();

    private PrivacyPrefsDefaultsResolver() {
    }

    public static final void resolveDefaults() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            PrivacyPrefsDefaultsResolver privacyPrefsDefaultsResolver = INSTANCE;
            DebuggingKt.logDebug$default(privacyPrefsDefaultsResolver, "Try to resolve Privacy Prefs Defaults", null, 2, null);
            MobileFusePrivacyPreferences privacyPreferences = MobileFuse.getPrivacyPreferences();
            Intrinsics.checkNotNullExpressionValue(privacyPreferences, "MobileFuse.getPrivacyPreferences()");
            MobileFuse.setPrivacyPreferences(privacyPrefsDefaultsResolver.resolveGppConsentString(privacyPrefsDefaultsResolver.resolveUsPrivacyConsentString(privacyPreferences)));
        } catch (Throwable th2) {
            int i10 = PrivacyPrefsDefaultsResolver$resolveDefaults$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    private final MobileFusePrivacyPreferences resolveGppConsentString(MobileFusePrivacyPreferences mobileFusePrivacyPreferences) {
        MobileFusePrivacyPreferences mobileFusePrivacyPreferences2;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (mobileFusePrivacyPreferences.getGppConsentString() != null) {
                return mobileFusePrivacyPreferences;
            }
            SharedPreferences defaultAppSharedPrefs = DeviceCache.INSTANCE.getDefaultAppSharedPrefs();
            mobileFusePrivacyPreferences2 = mobileFusePrivacyPreferences;
            try {
                return MobileFusePrivacyPreferences.copy$default(mobileFusePrivacyPreferences2, defaultAppSharedPrefs != null ? defaultAppSharedPrefs.getString("IABGPP_HDR_GppString", null) : null, null, false, false, 14, null);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            mobileFusePrivacyPreferences2 = mobileFusePrivacyPreferences;
        }
        if (PrivacyPrefsDefaultsResolver$resolveGppConsentString$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
            StabilityHelper.logException("[Automatically caught]", th);
        }
        return mobileFusePrivacyPreferences2;
    }

    private final MobileFusePrivacyPreferences resolveUsPrivacyConsentString(MobileFusePrivacyPreferences mobileFusePrivacyPreferences) {
        MobileFusePrivacyPreferences mobileFusePrivacyPreferences2;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (mobileFusePrivacyPreferences.getUsPrivacyConsentString() != null) {
                return mobileFusePrivacyPreferences;
            }
            SharedPreferences defaultAppSharedPrefs = DeviceCache.INSTANCE.getDefaultAppSharedPrefs();
            mobileFusePrivacyPreferences2 = mobileFusePrivacyPreferences;
            try {
                return MobileFusePrivacyPreferences.copy$default(mobileFusePrivacyPreferences2, null, defaultAppSharedPrefs != null ? defaultAppSharedPrefs.getString(IabString.IAB_US_PRIVACY_STRING, null) : null, false, false, 13, null);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            mobileFusePrivacyPreferences2 = mobileFusePrivacyPreferences;
        }
        if (PrivacyPrefsDefaultsResolver$resolveUsPrivacyConsentString$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
            StabilityHelper.logException("[Automatically caught]", th);
        }
        return mobileFusePrivacyPreferences2;
    }
}
