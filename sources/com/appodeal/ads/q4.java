package com.appodeal.ads;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class q4 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f14291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f14292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k7 f14293t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14294u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(k7 k7Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f14293t = k7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14292s = obj;
        this.f14294u |= Integer.MIN_VALUE;
        Object objE = this.f14293t.e(this);
        return objE == pf.b.g() ? objE : Result.a(objE);
    }
}
