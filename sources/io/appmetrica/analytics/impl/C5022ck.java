package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5022ck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f76977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5068ef f76978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeProvider f76979c;

    public static C5022ck c() {
        return AbstractC4996bk.f76918a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.f76977a;
    }

    public final synchronized void b() {
        this.f76978b.d(false);
        this.f76978b.b();
    }

    public final synchronized long d() {
        return this.f76977a;
    }

    public final synchronized void e() {
        a(C5468ua.H.z(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.f76978b.b(true);
    }

    public final synchronized void a(long j10, @Nullable Long l10) {
        try {
            this.f76977a = (j10 - this.f76979c.currentTimeMillis()) / 1000;
            boolean z10 = true;
            if (this.f76978b.b(true)) {
                if (l10 != null) {
                    long jAbs = Math.abs(j10 - this.f76979c.currentTimeMillis());
                    C5068ef c5068ef = this.f76978b;
                    if (jAbs <= TimeUnit.SECONDS.toMillis(l10.longValue())) {
                        z10 = false;
                    }
                    c5068ef.d(z10);
                } else {
                    this.f76978b.d(false);
                }
            }
            this.f76978b.d(this.f76977a);
            this.f76978b.b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @VisibleForTesting
    public final void a(C5068ef c5068ef, TimeProvider timeProvider) {
        this.f76978b = c5068ef;
        this.f76977a = c5068ef.a(0);
        this.f76979c = timeProvider;
    }
}
