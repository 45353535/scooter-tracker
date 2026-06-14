package com.appodeal.ads;

/* JADX INFO: loaded from: classes6.dex */
public final class s8 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z8 f14459r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.appodeal.ads.networking.binders.s[] f14460s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.appodeal.ads.networking.binders.s f14461t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14462u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14463v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f14464w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z8 f14465x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14466y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(z8 z8Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f14465x = z8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14464w = obj;
        this.f14466y |= Integer.MIN_VALUE;
        return this.f14465x.a(null, this);
    }
}
