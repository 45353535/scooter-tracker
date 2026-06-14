package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5353pj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f78005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f78006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5427sj f78007d;

    public C5353pj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C5427sj c5427sj) {
        this.f78004a = str;
        this.f78005b = context;
        int i10 = AbstractC5328oj.f77920a[counterConfigurationReporterType.ordinal()];
        if (i10 == 1) {
            this.f78006c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i10 != 2) {
            this.f78006c = null;
        } else {
            this.f78006c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f78007d = c5427sj;
    }
}
