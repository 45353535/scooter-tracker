package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f78960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f78961b;

    public J(boolean z10, W w10) {
        this.f78960a = z10;
        this.f78961b = w10;
    }

    public final W a() {
        return this.f78961b;
    }

    public final boolean b() {
        return this.f78960a;
    }

    public final String toString() {
        return "RemoteScreenshotConfig(enabled=" + this.f78960a + ", config=" + this.f78961b + ')';
    }

    public J() {
        this(new S().f78980a, new W());
    }
}
