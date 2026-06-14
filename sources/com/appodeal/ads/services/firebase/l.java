package com.appodeal.ads.services.firebase;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f14685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14686t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f14685s = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14684r = obj;
        this.f14686t |= Integer.MIN_VALUE;
        Object objA = this.f14685s.a(null, this);
        return objA == pf.b.g() ? objA : Result.a(objA);
    }
}
