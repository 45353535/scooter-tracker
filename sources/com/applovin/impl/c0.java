package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f8475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f8476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f8477c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final AtomicBoolean f8479e = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f8478d = com.applovin.impl.sdk.k.o();

    public c0(String str, com.applovin.impl.sdk.k kVar) {
        this.f8476b = str;
        this.f8475a = kVar;
        this.f8477c = kVar.O();
    }

    public Context a() {
        return this.f8478d;
    }

    public void a(boolean z10) {
        this.f8479e.set(z10);
    }
}
