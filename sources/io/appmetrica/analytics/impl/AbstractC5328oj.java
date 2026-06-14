package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC5328oj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f77920a;

    static {
        int[] iArr = new int[CounterConfigurationReporterType.values().length];
        f77920a = iArr;
        try {
            iArr[CounterConfigurationReporterType.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f77920a[CounterConfigurationReporterType.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
