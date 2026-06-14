package io.appmetrica.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.AbstractC5434t1;
import io.appmetrica.analytics.impl.C5409s1;
import io.appmetrica.analytics.impl.I0;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class AppMetrica {
    public static void activate(@NonNull Context context, @NonNull AppMetricaConfig appMetricaConfig) {
        AbstractC5434t1.f78254a.a(context, appMetricaConfig);
    }

    public static void activateReporter(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        AbstractC5434t1.f78254a.a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        AbstractC5434t1.f78254a.a();
    }

    public static void enableActivityAutoTracking(@NonNull Application application) {
        AbstractC5434t1.f78254a.a(application);
    }

    @Nullable
    public static String getDeviceId(@NonNull Context context) {
        return AbstractC5434t1.f78254a.b();
    }

    public static int getLibraryApiLevel() {
        return 116;
    }

    @NonNull
    public static String getLibraryVersion() {
        return "7.13.0";
    }

    @NonNull
    public static AppMetricaPlugins getPluginExtension() {
        return I0.f75887a;
    }

    @NonNull
    public static IReporter getReporter(@NonNull Context context, @NonNull String str) {
        return AbstractC5434t1.f78254a.a(context, str);
    }

    @Nullable
    public static String getUuid(@NonNull Context context) {
        return AbstractC5434t1.f78254a.a(context).f78675id;
    }

    @MainThread
    public static void initWebViewReporting(@NonNull WebView webView) {
        AbstractC5434t1.f78254a.a(webView);
    }

    public static void pauseSession(@Nullable Activity activity) {
        AbstractC5434t1.f78254a.a(activity);
    }

    public static void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
        AbstractC5434t1.f78254a.a(str, str2);
    }

    public static void putErrorEnvironmentValue(@NonNull String str, @Nullable String str2) {
        AbstractC5434t1.f78254a.b(str, str2);
    }

    public static void registerAnrListener(@NonNull AnrListener anrListener) {
        AbstractC5434t1.f78254a.a(anrListener);
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        AbstractC5434t1.f78254a.a(adRevenue);
    }

    public static void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        AbstractC5434t1.f78254a.a(map);
    }

    public static void reportAppOpen(@NonNull Activity activity) {
        AbstractC5434t1.f78254a.b(activity);
    }

    public static void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        AbstractC5434t1.f78254a.a(eCommerceEvent);
    }

    public static void reportError(@NonNull String str, @Nullable String str2) {
        AbstractC5434t1.f78254a.a(str, str2, (Throwable) null);
    }

    public static void reportEvent(@NonNull String str) {
        AbstractC5434t1.f78254a.b(str);
    }

    public static void reportExternalAdRevenue(@NonNull Object... objArr) {
        AbstractC5434t1.f78254a.b(objArr);
    }

    public static void reportExternalAttribution(@NonNull ExternalAttribution externalAttribution) {
        AbstractC5434t1.f78254a.a(externalAttribution);
    }

    public static void reportReferralUrl(@NonNull String str) {
        AbstractC5434t1.f78254a.d(str);
    }

    public static void reportRevenue(@NonNull Revenue revenue) {
        AbstractC5434t1.f78254a.a(revenue);
    }

    public static void reportUnhandledException(@NonNull Throwable th2) {
        AbstractC5434t1.f78254a.a(th2);
    }

    public static void reportUserProfile(@NonNull UserProfile userProfile) {
        AbstractC5434t1.f78254a.a(userProfile);
    }

    public static void requestDeferredDeeplink(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        AbstractC5434t1.f78254a.a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        AbstractC5434t1.f78254a.a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        C5409s1 c5409s1 = AbstractC5434t1.f78254a;
        if (list.isEmpty()) {
            list = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);
        }
        c5409s1.a(context, startupParamsCallback, list);
    }

    public static void resumeSession(@Nullable Activity activity) {
        AbstractC5434t1.f78254a.c(activity);
    }

    public static void sendEventsBuffer() {
        AbstractC5434t1.f78254a.f();
    }

    public static void setAdvIdentifiersTracking(boolean z10) {
        AbstractC5434t1.f78254a.a(z10);
    }

    public static void setDataSendingEnabled(boolean z10) {
        AbstractC5434t1.f78254a.b(z10);
    }

    public static void setLocation(@Nullable Location location) {
        AbstractC5434t1.f78254a.a(location);
    }

    public static void setLocationTracking(boolean z10) {
        AbstractC5434t1.f78254a.c(z10);
    }

    public static void setUserProfileID(@Nullable String str) {
        AbstractC5434t1.f78254a.e(str);
    }

    public static void reportAppOpen(@NonNull Intent intent) {
        AbstractC5434t1.f78254a.a(intent);
    }

    public static void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th2) {
        AbstractC5434t1.f78254a.a(str, str2, th2);
    }

    public static void reportEvent(@NonNull String str, @Nullable String str2) {
        AbstractC5434t1.f78254a.c(str, str2);
    }

    public static void reportAppOpen(@NonNull String str) {
        AbstractC5434t1.f78254a.a(str);
    }

    public static void reportError(@NonNull String str, @Nullable Throwable th2) {
        AbstractC5434t1.f78254a.a(str, th2);
    }

    public static void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        AbstractC5434t1.f78254a.a(str, map);
    }
}
