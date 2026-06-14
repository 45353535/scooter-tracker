package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f51776d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f51777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f51778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f51779c;

    static class a extends t {
        a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j10) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public void e() throws IOException {
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j10, TimeUnit timeUnit) {
            return this;
        }
    }

    public t a(long j10, TimeUnit timeUnit) {
        if (j10 >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.f51779c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: " + j10);
    }

    public t b() {
        this.f51779c = 0L;
        return this;
    }

    public long c() {
        if (this.f51777a) {
            return this.f51778b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean d() {
        return this.f51777a;
    }

    public void e() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f51777a && this.f51778b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long f() {
        return this.f51779c;
    }

    public t a(long j10) {
        this.f51777a = true;
        this.f51778b = j10;
        return this;
    }

    public t a() {
        this.f51777a = false;
        return this;
    }
}
