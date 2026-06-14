package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Z3 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3569a4 f38093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z3(C3569a4 c3569a4, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38093b = c3569a4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38092a = obj;
        this.f38094c |= Integer.MIN_VALUE;
        return this.f38093b.a(this);
    }
}
