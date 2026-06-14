package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5372qd extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5471ud f78071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f78073c;

    public C5372qd(C5471ud c5471ud, int i10, String str) {
        this.f78071a = c5471ud;
        this.f78072b = i10;
        this.f78073c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5471ud.a(this.f78071a).a(new M9(this.f78072b, this.f78073c));
    }
}
