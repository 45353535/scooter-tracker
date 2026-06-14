package com.appodeal.ads;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class y5 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f15276r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f15277s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k7 f15278t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15279u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(k7 k7Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f15278t = k7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15277s = obj;
        this.f15279u |= Integer.MIN_VALUE;
        Object objN = this.f15278t.n(this);
        return objN == pf.b.g() ? objN : Result.a(objN);
    }
}
