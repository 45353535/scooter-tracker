package com.appodeal.ads;

/* JADX INFO: loaded from: classes6.dex */
public final class w7 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n8 f15190r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f15191s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n8 f15192t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15193u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(n8 n8Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f15192t = n8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15191s = obj;
        this.f15193u |= Integer.MIN_VALUE;
        return this.f15192t.a(null, null, this);
    }
}
