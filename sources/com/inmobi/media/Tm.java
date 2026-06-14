package com.inmobi.media;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class Tm extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Um f37798c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tm(Um um, Continuation continuation) {
        super(continuation);
        this.f37798c = um;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37796a = obj;
        this.f37797b |= Integer.MIN_VALUE;
        return this.f37798c.emit(null, this);
    }
}
