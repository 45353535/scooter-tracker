package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class zh extends e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ge f65695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f65696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bi f65697c;

    public zh(bi biVar, ge geVar, long j10) {
        this.f65697c = biVar;
        this.f65695a = geVar;
        this.f65696b = j10;
    }

    @Override // com.startapp.sdk.internal.e3
    public final void a(cb cbVar) {
        bi biVar = this.f65697c;
        int iAbs = Math.abs(Arrays.hashCode(this.f65695a.f64570a));
        long j10 = this.f65696b;
        synchronized (biVar) {
            biVar.f64321b.put(Integer.valueOf(iAbs), biVar.f64322c.scheduleAtFixedRate(cbVar, j10, j10, TimeUnit.MILLISECONDS));
        }
    }
}
