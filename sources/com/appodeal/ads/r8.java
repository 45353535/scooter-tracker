package com.appodeal.ads;

/* JADX INFO: loaded from: classes6.dex */
public final class r8 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public w8 f14336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f14337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w8 f14338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14339u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(w8 w8Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f14338t = w8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14337s = obj;
        this.f14339u |= Integer.MIN_VALUE;
        return w8.g(this.f14338t, this);
    }
}
