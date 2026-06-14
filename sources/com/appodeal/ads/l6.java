package com.appodeal.ads;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class l6 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f13611r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k7 f13612s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13613t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(k7 k7Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f13612s = k7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13611r = obj;
        this.f13613t |= Integer.MIN_VALUE;
        Object objP = this.f13612s.p(this);
        return objP == pf.b.g() ? objP : Result.a(objP);
    }
}
