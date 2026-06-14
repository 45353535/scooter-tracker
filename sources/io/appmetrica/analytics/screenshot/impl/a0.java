package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f78997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78998b;

    public a0(boolean z10, long j10) {
        this.f78997a = z10;
        this.f78998b = j10;
    }

    public final long a() {
        return this.f78998b;
    }

    public final boolean b() {
        return this.f78997a;
    }

    public final String toString() {
        return "ServiceCaptorConfig(enabled=" + this.f78997a + ", delaySeconds=" + this.f78998b + ')';
    }

    public a0() {
        this(new P().f78973a, new P().f78974b);
    }
}
