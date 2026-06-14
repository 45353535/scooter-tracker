package com.fyber.inneractive.sdk.util;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeUnit f23916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t1 f23918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u1 f23920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23921f;

    public v1(TimeUnit timeUnit, long j10) {
        this.f23919d = false;
        this.f23921f = 0L;
        this.f23917b = j10;
        this.f23916a = timeUnit;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j10));
    }

    public final void a(long j10) {
        long jUptimeMillis = (SystemClock.uptimeMillis() - j10) + 50 + this.f23921f;
        this.f23921f = jUptimeMillis;
        if (this.f23920e != null && jUptimeMillis > this.f23916a.toMillis(this.f23917b)) {
            this.f23920e.a();
            return;
        }
        t1 t1Var = this.f23918c;
        if (t1Var == null || this.f23920e == null) {
            return;
        }
        t1Var.removeMessages(1932593528);
        this.f23918c.sendEmptyMessageDelayed(1932593528, 50L);
    }

    public v1(TimeUnit timeUnit, long j10, long j11) {
        this.f23919d = false;
        this.f23917b = j10;
        this.f23916a = timeUnit;
        this.f23921f = j11;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j10));
    }
}
