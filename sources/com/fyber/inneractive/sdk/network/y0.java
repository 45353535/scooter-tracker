package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class y0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f21430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f21431b;

    public y0(String str, long j10) {
        this.f21430a = str;
        this.f21431b = j10;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        IAlog.a("Hit Request: Hitting URL finished: %s", this.f21430a);
        if (exc == null) {
            IAlog.a("Hit Request: Hitting URL response code: %s", str);
        } else {
            IAlog.a("Hit Request: Hitting URL failed: %s", exc);
        }
        IAlog.a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f21431b));
    }
}
