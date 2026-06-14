package com.appodeal.ads.services.adjust.collector;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e f14537r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f14538s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f14539t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14540u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f14539t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14538s = obj;
        this.f14540u |= Integer.MIN_VALUE;
        return this.f14539t.d(null, null, this);
    }
}
