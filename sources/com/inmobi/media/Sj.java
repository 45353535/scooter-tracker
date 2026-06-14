package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Sj extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3688ek f37733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Wj f37736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37737e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sj(Wj wj, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37736d = wj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37735c = obj;
        this.f37737e |= Integer.MIN_VALUE;
        return this.f37736d.a(null, this);
    }
}
