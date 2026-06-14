package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.u1;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f20340a;

    public d(e eVar) {
        this.f20340a = eVar;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        IAlog.a("onVisibleTimeReached: %s", Long.valueOf(System.currentTimeMillis()));
        this.f20340a.f20343b = true;
    }
}
