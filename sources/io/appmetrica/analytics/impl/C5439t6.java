package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5439t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bi f78260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Kh f78261b;

    public C5439t6(Gf gf2, I8 i82, Bi bi2, AppMetricaConfig appMetricaConfig) {
        this.f78260a = bi2;
        this.f78261b = new Kh(gf2, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), i82, appMetricaConfig.userProfileID);
    }

    public final Kh a() {
        return this.f78261b;
    }
}
