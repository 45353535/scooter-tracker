package com.appodeal.ads.regulator.usecases;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f14393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14394t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, kotlin.coroutines.jvm.internal.d dVar2) {
        super(dVar2);
        this.f14393s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14392r = obj;
        this.f14394t |= Integer.MIN_VALUE;
        Object objA = this.f14393s.a(null, this);
        return objA == pf.b.g() ? objA : Result.a(objA);
    }
}
