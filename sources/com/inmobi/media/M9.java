package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class M9 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N9 f37358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37359c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M9(N9 n92, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37358b = n92;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37357a = obj;
        this.f37359c |= Integer.MIN_VALUE;
        return this.f37358b.b(0, this);
    }
}
