package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class Ik {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5058e5 f75952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Zk f75953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lk f75954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f75955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f75956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AtomicLong f75957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f75958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Xk f75959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f75960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f75961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f75962k;

    public Ik(C5058e5 c5058e5, Zk zk, Lk lk, SystemTimeProvider systemTimeProvider) {
        this.f75952a = c5058e5;
        this.f75953b = zk;
        this.f75954c = lk;
        this.f75962k = systemTimeProvider;
        a();
    }

    public final void a() {
        Lk lk = this.f75954c;
        long jElapsedRealtime = this.f75962k.elapsedRealtime();
        Long l10 = lk.f76088c;
        if (l10 != null) {
            jElapsedRealtime = l10.longValue();
        }
        this.f75956e = jElapsedRealtime;
        Long l11 = this.f75954c.f76087b;
        this.f75955d = l11 == null ? -1L : l11.longValue();
        Long l12 = this.f75954c.f76090e;
        this.f75957f = new AtomicLong(l12 == null ? 0L : l12.longValue());
        Boolean bool = this.f75954c.f76091f;
        this.f75958g = bool == null ? true : bool.booleanValue();
        Long l13 = this.f75954c.f76092g;
        long jLongValue = l13 != null ? l13.longValue() : 0L;
        this.f75960i = jLongValue;
        Lk lk2 = this.f75954c;
        long jLongValue2 = jLongValue - this.f75956e;
        Long l14 = lk2.f76093h;
        if (l14 != null) {
            jLongValue2 = l14.longValue();
        }
        this.f75961j = jLongValue2;
    }

    public final String toString() {
        return "Session{id=" + this.f75955d + ", creationTime=" + this.f75956e + ", currentReportId=" + this.f75957f + ", sessionRequestParams=" + this.f75959h + ", sleepStart=" + this.f75960i + '}';
    }
}
