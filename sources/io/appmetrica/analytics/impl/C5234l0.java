package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5234l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f77637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f77638b;

    public C5234l0(List list, boolean z10) {
        this.f77637a = list;
        this.f77638b = z10;
    }

    public final String toString() {
        return "AppMetricaConfigExtension(autoCollectedDataSubscribers=" + this.f77637a + ", needClearEnvironment=" + this.f77638b + ')';
    }
}
