package com.appodeal.ads;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class m7 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f13643r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n8 f13644s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13645t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(n8 n8Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f13644s = n8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13643r = obj;
        this.f13645t |= Integer.MIN_VALUE;
        Object objB = n8.b(this.f13644s, null, null, null, this);
        return objB == pf.b.g() ? objB : Result.a(objB);
    }
}
