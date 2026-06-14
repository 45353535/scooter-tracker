package com.apm.insight.j;

import android.os.Handler;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f7856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7857b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f7858c;

    a(Handler handler, long j10) {
        this.f7856a = handler;
        this.f7858c = j10;
    }

    final void a() {
        this.f7856a.post(this);
    }

    final long b() {
        return this.f7858c;
    }

    final void a(long j10) {
        if (j10 > 0) {
            this.f7856a.postDelayed(this, j10);
        } else {
            this.f7856a.post(this);
        }
    }
}
