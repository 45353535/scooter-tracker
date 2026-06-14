package com.appodeal.ads.networking;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14175r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14176s;

    public u(kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14175r = obj;
        this.f14176s |= Integer.MIN_VALUE;
        Object objB = v.b(null, null, null, this);
        return objB == pf.b.g() ? objB : Result.a(objB);
    }
}
