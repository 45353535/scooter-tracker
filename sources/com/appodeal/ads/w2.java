package com.appodeal.ads;

/* JADX INFO: loaded from: classes6.dex */
public final class w2 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15169r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l4 f15170s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15171t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(l4 l4Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f15170s = l4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15169r = obj;
        this.f15171t |= Integer.MIN_VALUE;
        return l4.d(this.f15170s, null, this);
    }
}
