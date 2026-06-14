package com.appodeal.ads;

import com.appodeal.ads.networking.LoadingError;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ te f13217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uc f13218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f13219d;

    public d(l0 l0Var, te teVar, uc ucVar) {
        this.f13219d = l0Var;
        this.f13217b = teVar;
        this.f13218c = ucVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13219d.f13567g.I(this.f13217b, this.f13218c, LoadingError.TimeoutError);
    }
}
