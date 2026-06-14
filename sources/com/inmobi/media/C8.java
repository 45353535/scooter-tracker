package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class C8 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rf f36660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F8 f36662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8(F8 f82, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f36662c = f82;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36661b = obj;
        this.f36663d |= Integer.MIN_VALUE;
        return this.f36662c.a((Rf) null, this);
    }
}
