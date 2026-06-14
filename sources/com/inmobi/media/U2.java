package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class U2 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W2 f37816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37817c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(W2 w22, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37816b = w22;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37815a = obj;
        this.f37817c |= Integer.MIN_VALUE;
        return this.f37816b.a(this);
    }
}
