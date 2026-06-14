package com.appodeal.ads.networking.usecases;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f14177r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f14178s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f14179t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14180u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, d dVar) {
        super(dVar);
        this.f14179t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14178s = obj;
        this.f14180u |= Integer.MIN_VALUE;
        Object objB = this.f14179t.b(this);
        return objB == pf.b.g() ? objB : Result.a(objB);
    }
}
