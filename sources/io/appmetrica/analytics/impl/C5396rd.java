package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5396rd extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5471ud f78145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f78146b;

    public C5396rd(C5471ud c5471ud, boolean z10) {
        this.f78145a = c5471ud;
        this.f78146b = z10;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5471ud.a(this.f78145a).a(this.f78146b, false);
    }
}
