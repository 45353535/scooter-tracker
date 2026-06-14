package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class F0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H0 f36822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(H0 h02, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f36822b = h02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36821a = obj;
        this.f36823c |= Integer.MIN_VALUE;
        return this.f36822b.a(this);
    }
}
