package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5595zc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bi f78618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Id f78619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T9 f78620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I8 f78621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Kh f78622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C5286n2 f78623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5564y6 f78624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C5358q f78625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Oe f78626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Tn f78627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Jg f78628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C6 f78629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C5028d0 f78630n;

    public C5595zc(Context context, Gf gf2, Bi bi2, Sl sl) {
        this.f78617a = context;
        this.f78618b = bi2;
        this.f78619c = new Id(gf2);
        T9 t92 = new T9(context);
        this.f78620d = t92;
        I8 i82 = new I8(new C5504vl(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.f78621e = i82;
        this.f78622f = new Kh(gf2, new CounterConfiguration(CounterConfigurationReporterType.MAIN), i82);
        this.f78623g = new C5286n2();
        this.f78624h = C5186j4.l().n();
        this.f78625i = new C5358q();
        this.f78626j = new Oe(t92);
        this.f78627k = new Tn();
        this.f78628l = new Jg();
        this.f78629m = new C6();
        this.f78630n = new C5028d0();
    }

    public final C5028d0 a() {
        return this.f78630n;
    }

    public final Context b() {
        return this.f78617a;
    }

    public final C6 c() {
        return this.f78629m;
    }

    public final T9 d() {
        return this.f78620d;
    }

    public final Oe e() {
        return this.f78626j;
    }

    public final C5564y6 f() {
        return this.f78624h;
    }

    public final Jg g() {
        return this.f78628l;
    }

    public final Kh h() {
        return this.f78622f;
    }

    public final Bi i() {
        return this.f78618b;
    }

    public final Tn j() {
        return this.f78627k;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        publicLogger.info("Update config with value " + appMetricaConfig.toJson(), new Object[0]);
        this.f78622f.f76218b.applyFromConfig(appMetricaConfig);
        Kh kh2 = this.f78622f;
        String str = appMetricaConfig.userProfileID;
        synchronized (kh2) {
            kh2.f76027f = str;
        }
        Kh kh3 = this.f78622f;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        kh3.f76025d = new C5598zf(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb2 = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb2.append(num.intValue());
        publicLogger.info(sb2.toString(), new Object[0]);
    }
}
