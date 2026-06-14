package com.appodeal.ads.utils;

import com.appodeal.ads.uc;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc f15017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f15018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15019d;

    public f(uc ucVar, g gVar) {
        this.f15017b = ucVar;
        this.f15018c = gVar;
        this.f15019d = (ucVar.f14937c.f15230g * 1000) + System.currentTimeMillis();
    }

    @Override // java.lang.Runnable
    public final void run() {
        h.a(this.f15017b);
        g gVar = this.f15018c;
        if (gVar != null) {
            gVar.a(this.f15017b);
        }
    }
}
