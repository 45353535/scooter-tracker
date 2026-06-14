package com.appodeal.ads.networking;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14183s;

    public x(kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14182r = obj;
        this.f14183s |= Integer.MIN_VALUE;
        Object objA = a0.a(null, null, this);
        return objA == pf.b.g() ? objA : Result.a(objA);
    }
}
