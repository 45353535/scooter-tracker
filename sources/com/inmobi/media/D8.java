package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class D8 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rf f36713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3710fg f36714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f36715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F8 f36716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36717e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8(F8 f82, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f36716d = f82;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36715c = obj;
        this.f36717e |= Integer.MIN_VALUE;
        return this.f36716d.b(null, this);
    }
}
