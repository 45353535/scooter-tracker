package com.appodeal.ads;

/* JADX INFO: loaded from: classes6.dex */
public final class c6 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f13163r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k7 f13164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13165t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(k7 k7Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f13164s = k7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13163r = obj;
        this.f13165t |= Integer.MIN_VALUE;
        return this.f13164s.c(null, this);
    }
}
