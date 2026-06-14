package com.appodeal.ads;

/* JADX INFO: loaded from: classes6.dex */
public final class c8 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f13166r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n8 f13167s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13168t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(n8 n8Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f13167s = n8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13166r = obj;
        this.f13168t |= Integer.MIN_VALUE;
        return this.f13167s.f(null, null, this);
    }
}
