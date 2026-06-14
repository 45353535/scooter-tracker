package com.inmobi.media;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class Rj extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wj f37675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37676d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rj(Wj wj, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37675c = wj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37674b = obj;
        this.f37676d |= Integer.MIN_VALUE;
        return this.f37675c.a((Continuation) this);
    }
}
