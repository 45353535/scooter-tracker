package com.appodeal.ads;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class g6 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f13348r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k7 f13349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13350t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(k7 k7Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f13349s = k7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13348r = obj;
        this.f13350t |= Integer.MIN_VALUE;
        Object objD = this.f13349s.d(null, this);
        return objD == pf.b.g() ? objD : Result.a(objD);
    }
}
