package com.fyber.inneractive.sdk.dv.handler;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdFormat f20530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f20531b;

    public c(e eVar, AdFormat adFormat) {
        this.f20531b = eVar;
        this.f20530a = adFormat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            QueryInfo.generate(o.f23888a, this.f20530a, e.a(this.f20531b), new b(this));
        } catch (Throwable th2) {
            IAlog.a("Error in resolveDVTokens", th2, new Object[0]);
        }
    }
}
