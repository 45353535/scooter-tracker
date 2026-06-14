package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.flow.c0;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f20158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.global.r f20159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f20160c;

    public t(y yVar, c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f20160c = yVar;
        this.f20158a = c0Var;
        this.f20159b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20160c.a(this.f20158a, this.f20159b);
    }
}
