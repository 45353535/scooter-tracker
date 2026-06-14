package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.cache.FailuresHandler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class o2 extends q2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FailuresHandler f64987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f64988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f64989g;

    public o2(x2 x2Var) {
        super(x2Var);
        this.f64987e = CacheMetaData.b().a().c();
        this.f64988f = 0;
        this.f64989g = false;
    }

    @Override // com.startapp.sdk.internal.q2
    public final boolean a() {
        FailuresHandler failuresHandler;
        jh jhVar = ih.f64695a;
        if (jhVar.f64775c || jhVar.f64777e || (failuresHandler = this.f64987e) == null || failuresHandler.a() == null) {
            return false;
        }
        if (this.f64989g) {
            return this.f64987e.b();
        }
        return true;
    }

    @Override // com.startapp.sdk.internal.q2
    public final long b() {
        Long l10;
        if (this.f64988f >= this.f64987e.a().size() || (l10 = this.f65132c) == null) {
            return -1L;
        }
        long millis = TimeUnit.SECONDS.toMillis(((Integer) this.f64987e.a().get(this.f64988f)).intValue()) - (System.currentTimeMillis() - l10.longValue());
        if (millis >= 0) {
            return millis;
        }
        return 0L;
    }

    @Override // com.startapp.sdk.internal.q2
    public final void c() {
        if (this.f64988f == this.f64987e.a().size() - 1) {
            this.f64989g = true;
        } else {
            this.f64988f++;
        }
        super.c();
    }
}
