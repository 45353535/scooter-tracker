package com.appodeal.ads.services;

import com.appodeal.ads.revenue.RevenueInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r f14695r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RevenueInfo f14696s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f14697t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f14698u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14699v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f14698u = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14697t = obj;
        this.f14699v |= Integer.MIN_VALUE;
        return this.f14698u.b(null, this);
    }
}
