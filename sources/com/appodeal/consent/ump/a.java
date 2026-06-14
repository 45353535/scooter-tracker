package com.appodeal.consent.ump;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15557r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f15558s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15559t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f15558s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15557r = obj;
        this.f15559t |= Integer.MIN_VALUE;
        Object objB = this.f15558s.b(null, this);
        return objB == pf.b.g() ? objB : Result.a(objB);
    }
}
