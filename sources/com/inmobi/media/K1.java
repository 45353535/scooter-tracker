package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class K1 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M1 f37182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1(M1 m12, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37182b = m12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37181a = obj;
        this.f37183c |= Integer.MIN_VALUE;
        return M1.a(this.f37182b, null, null, this);
    }
}
