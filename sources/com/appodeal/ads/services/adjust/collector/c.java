package com.appodeal.ads.services.adjust.collector;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e f14533r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f14534s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f14535t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14536u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f14535t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14534s = obj;
        this.f14536u |= Integer.MIN_VALUE;
        return this.f14535t.a(null, null, this);
    }
}
