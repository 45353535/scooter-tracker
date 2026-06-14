package com.appodeal.ads;

/* JADX INFO: loaded from: classes6.dex */
public final class o4 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v4 f14237r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f14238s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v4 f14239t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14240u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(v4 v4Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f14239t = v4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14238s = obj;
        this.f14240u |= Integer.MIN_VALUE;
        return this.f14239t.b(null, this);
    }
}
