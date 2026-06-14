package com.appodeal.ads.network.httpclients;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f13980r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f13981s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13982t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f13981s = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13980r = obj;
        this.f13982t |= Integer.MIN_VALUE;
        Object objA = this.f13981s.a(null, this);
        return objA == pf.b.g() ? objA : Result.a(objA);
    }
}
