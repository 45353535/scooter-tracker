package com.applovin.impl;

import com.applovin.impl.v;

/* JADX INFO: loaded from: classes6.dex */
public class o5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f10006g;

    public interface a {
        void a(v.a aVar);
    }

    public o5(com.applovin.impl.sdk.k kVar, a aVar) {
        super("TaskCollectAdvertisingId", kVar, true);
        this.f10006g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f10006g.a(this.f9071a.A().f());
    }
}
