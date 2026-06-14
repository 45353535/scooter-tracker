package com.mobilefuse.sdk;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mobilefuse.sdk.internal.SdkInitializer;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.telemetry.Telemetry;

/* JADX INFO: loaded from: classes10.dex */
public class MobileFuse {
    static final String SDK_NAME = "MobileFuse Ads";
    static MobileFuseImpl sdkImpl;

    static {
        try {
            SdkInitializer.ensureSdkSetup(true);
            Telemetry.onAppLaunchInternally("MobileFuseSDK");
            sdkImpl = new MobileFuseImpl();
        } catch (Throwable th2) {
            StabilityHelper.logException((Class<?>) MobileFuse.class, th2);
        }
    }

    public static /* synthetic */ void a(SdkInitListener sdkInitListener) {
        try {
            sdkImpl.initSdk(sdkInitListener);
        } catch (Throwable th2) {
            StabilityHelper.logException((Class<?>) MobileFuse.class, th2);
            if (sdkInitListener != null) {
                sdkInitListener.onInitError();
            }
        }
    }

    @NonNull
    public static MobileFusePrivacyPreferences getPrivacyPreferences() {
        return sdkImpl.getPrivacyPreferences();
    }

    public static String getSdkVersion() {
        return "1.9.3";
    }

    @Deprecated
    public static synchronized void init(Context context, int i10, int i11) {
        init(context, i10, i11, null);
    }

    @Deprecated
    public static synchronized void initSdkServices(Context context) {
        MobileFuseServices.requireAllServices();
    }

    static boolean isEnabled() {
        return sdkImpl.isEnabled();
    }

    public static void logDebug(@NonNull String str) {
        try {
            Log.d("MobileFuse SDK", str);
        } catch (Throwable unused) {
        }
    }

    public static void logError(@NonNull String str) {
        try {
            Log.e("MobileFuse SDK", str);
        } catch (Throwable unused) {
        }
    }

    public static void logWarning(@NonNull String str) {
        try {
            Log.w("MobileFuse SDK", str);
        } catch (Throwable unused) {
        }
    }

    public static void setPrivacyPreferences(@NonNull MobileFusePrivacyPreferences mobileFusePrivacyPreferences) {
        sdkImpl.setPrivacyPreferences(mobileFusePrivacyPreferences);
    }

    public static void logError(@NonNull String str, Throwable th2) {
        try {
            Log.e("MobileFuse SDK", str, th2);
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    public static synchronized void init(Context context, int i10, int i11, SdkInitListener sdkInitListener) {
        init(context, i10 + "_" + i11, sdkInitListener);
    }

    @Deprecated
    public static synchronized void init(Context context, String str) {
        init(context, str, (SdkInitListener) null);
    }

    @Deprecated
    public static synchronized void init(Context context, String str, SdkInitListener sdkInitListener) {
        init(sdkInitListener);
    }

    public static synchronized void init() {
        init(null);
    }

    public static synchronized void init(@Nullable final SdkInitListener sdkInitListener) {
        try {
            Telemetry.startLoggingSystem();
            Utils.getHandler().post(new Runnable() { // from class: com.mobilefuse.sdk.n
                @Override // java.lang.Runnable
                public final void run() {
                    MobileFuse.a(sdkInitListener);
                }
            });
        } finally {
        }
    }
}
