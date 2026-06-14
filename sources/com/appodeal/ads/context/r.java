package com.appodeal.ads.context;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public t f13208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f13209s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f13210t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13211u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, Continuation continuation) {
        super(continuation);
        this.f13210t = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13209s = obj;
        this.f13211u |= Integer.MIN_VALUE;
        return this.f13210t.awaitResumedActivity(this);
    }
}
