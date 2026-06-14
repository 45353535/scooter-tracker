package com.appodeal.ads;

/* JADX INFO: loaded from: classes6.dex */
public final class a3 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f11870r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f11871s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l4 f11872t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11873u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(l4 l4Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f11872t = l4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f11871s = obj;
        this.f11873u |= Integer.MIN_VALUE;
        return this.f11872t.e(null, this);
    }
}
