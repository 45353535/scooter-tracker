package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5421sd extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5471ud f78226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f78227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f78228c;

    public C5421sd(C5471ud c5471ud, String str, byte[] bArr) {
        this.f78226a = c5471ud;
        this.f78227b = str;
        this.f78228c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5471ud.a(this.f78226a).setSessionExtra(this.f78227b, this.f78228c);
    }
}
