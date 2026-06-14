package io.bidmachine.core;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f80048a = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f80049b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f80050c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f80051d = false;

    public float a() {
        return this.f80049b;
    }

    public long b() {
        return this.f80048a;
    }

    public boolean c() {
        return this.f80051d;
    }

    public boolean d() {
        return this.f80050c;
    }

    public void e(boolean z10) {
        this.f80051d = z10;
    }

    public void f(boolean z10) {
        this.f80050c = z10;
    }

    public void g(float f10) {
        this.f80049b = f10;
    }

    public void h(long j10) {
        this.f80048a = j10;
    }

    public void i(long j10) {
        h(TimeUnit.SECONDS.toMillis(j10));
    }
}
