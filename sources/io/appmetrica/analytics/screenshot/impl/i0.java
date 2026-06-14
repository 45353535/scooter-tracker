package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f79016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f79017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f79018c;

    public i0(boolean z10, List list, long j10) {
        this.f79016a = z10;
        this.f79017b = list;
        this.f79018c = j10;
    }

    public final long a() {
        return this.f79018c;
    }

    public final boolean b() {
        return this.f79016a;
    }

    public final List c() {
        return this.f79017b;
    }

    public final String toString() {
        return "ServiceSideContentObserverCaptorConfig(enabled=" + this.f79016a + ", mediaStoreColumnNames=" + this.f79017b + ", detectWindowSeconds=" + this.f79018c + ')';
    }

    public i0(C5622p c5622p) {
        this(c5622p.b(), c5622p.c(), c5622p.a());
    }
}
