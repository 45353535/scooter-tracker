package com.appodeal.ads.regulator.usecases;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14397r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f14398s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14399t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f14398s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14397r = obj;
        this.f14399t |= Integer.MIN_VALUE;
        Object objA = this.f14398s.a(null, false, null, null, this);
        return objA == pf.b.g() ? objA : Result.a(objA);
    }
}
