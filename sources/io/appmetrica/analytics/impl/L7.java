package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class L7 implements Oc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Location f76055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f76056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f76057c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f76059e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f76062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f76063i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f76065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bi f76066l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f76058d = Boolean.FALSE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f76060f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f76061g = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public List<String> f76064j = new ArrayList();

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        this.f76056b = boolValueOf;
        Bi bi2 = this.f76066l;
        if (bi2 != null) {
            bi2.a(boolValueOf, this.f76059e, this.f76057c, this.f76058d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void clearAppEnvironment() {
        this.f76062h = true;
        this.f76060f.clear();
    }

    public final C5234l0 j() {
        return new C5234l0(this.f76064j, this.f76062h);
    }

    public final Location k() {
        return this.f76055a;
    }

    public final Boolean l() {
        return this.f76057c;
    }

    public final Boolean m() {
        return this.f76059e;
    }

    public final Boolean n() {
        return this.f76056b;
    }

    public final boolean o() {
        return this.f76062h;
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f76060f.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void setDataSendingEnabled(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        this.f76059e = boolValueOf;
        Bi bi2 = this.f76066l;
        if (bi2 != null) {
            bi2.a(this.f76056b, boolValueOf, this.f76057c, this.f76058d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void setUserProfileID(@Nullable String str) {
        this.f76063i = str;
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(boolean z10, boolean z11) {
        boolean z12 = this.f76057c == null;
        boolean zBooleanValue = this.f76058d.booleanValue();
        if (z11 || z12 || !zBooleanValue) {
            this.f76057c = Boolean.valueOf(z10);
            Boolean boolValueOf = Boolean.valueOf(z11);
            this.f76058d = boolValueOf;
            Bi bi2 = this.f76066l;
            if (bi2 != null) {
                bi2.a(this.f76056b, this.f76059e, this.f76057c, boolValueOf);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(@Nullable Location location) {
        this.f76055a = location;
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(String str, String str2) {
        this.f76061g.put(str, str2);
    }

    public final AppMetricaConfig a(AppMetricaConfig appMetricaConfig) {
        if (this.f76065k) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        builderNewConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        builderNewConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        builderNewConfigBuilder.withLocation(appMetricaConfig.location);
        if (no.a(appMetricaConfig.appVersion)) {
            builderNewConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (no.a(appMetricaConfig.dispatchPeriodSeconds)) {
            builderNewConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (no.a(appMetricaConfig.appBuildNumber)) {
            builderNewConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (no.a(appMetricaConfig.maxReportsCount)) {
            builderNewConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (no.a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            builderNewConfigBuilder.withLogs();
        }
        if (no.a(appMetricaConfig.sessionTimeout)) {
            builderNewConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (no.a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            builderNewConfigBuilder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (no.a(appMetricaConfig.crashReporting)) {
            builderNewConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (no.a(appMetricaConfig.nativeCrashReporting)) {
            builderNewConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (no.a(appMetricaConfig.locationTracking)) {
            builderNewConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (no.a(appMetricaConfig.advIdentifiersTracking)) {
            builderNewConfigBuilder.withAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue());
        }
        if (no.a(appMetricaConfig.firstActivationAsUpdate)) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (no.a(appMetricaConfig.dataSendingEnabled)) {
            builderNewConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (no.a(appMetricaConfig.anrMonitoring)) {
            builderNewConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (no.a(appMetricaConfig.anrMonitoringTimeout)) {
            builderNewConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (no.a(appMetricaConfig.maxReportsInDatabaseCount)) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (no.a(appMetricaConfig.crashTransformer)) {
            builderNewConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (no.a(appMetricaConfig.userProfileID)) {
            builderNewConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (no.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            builderNewConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (no.a(appMetricaConfig.appOpenTrackingEnabled)) {
            builderNewConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (no.a((Object) appMetricaConfig.customHosts)) {
            builderNewConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        LinkedHashMap linkedHashMap = this.f76060f;
        if (!no.a((Map) linkedHashMap)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                builderNewConfigBuilder.withAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map = appMetricaConfig.appEnvironment;
        if (!no.a((Map) map)) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                builderNewConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = this.f76061g;
        if (!no.a((Map) linkedHashMap2)) {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        Map<String, String> map2 = appMetricaConfig.errorEnvironment;
        if (!no.a((Map) map2)) {
            for (Map.Entry<String, String> entry4 : map2.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        Map<String, Object> map3 = appMetricaConfig.additionalConfig;
        if (!no.a((Map) map3)) {
            for (Map.Entry<String, Object> entry5 : map3.entrySet()) {
                builderNewConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = this.f76056b;
        if (appMetricaConfig.locationTracking == null && no.a(bool)) {
            builderNewConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f76055a;
        if (appMetricaConfig.location == null && no.a(location)) {
            builderNewConfigBuilder.withLocation(location);
        }
        Boolean bool2 = this.f76059e;
        if (appMetricaConfig.dataSendingEnabled == null && no.a(bool2)) {
            builderNewConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!no.a(appMetricaConfig.userProfileID) && no.a(this.f76063i)) {
            builderNewConfigBuilder.withUserProfileID(this.f76063i);
        }
        Boolean bool3 = this.f76057c;
        if (appMetricaConfig.advIdentifiersTracking == null && no.a(bool3)) {
            builderNewConfigBuilder.withAdvIdentifiersTracking(bool3.booleanValue());
        }
        this.f76065k = true;
        this.f76055a = null;
        this.f76056b = null;
        this.f76057c = null;
        this.f76058d = Boolean.FALSE;
        this.f76059e = null;
        this.f76060f.clear();
        this.f76061g.clear();
        this.f76062h = false;
        this.f76063i = null;
        return builderNewConfigBuilder.build();
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(@NonNull String str) {
        this.f76064j.add(str);
    }

    public final void a(Bi bi2) {
        Boolean bool = this.f76056b;
        if (bool != null || this.f76059e != null || this.f76057c != null) {
            bi2.a(bool, this.f76059e, this.f76057c, this.f76058d);
        }
        this.f76066l = bi2;
    }
}
