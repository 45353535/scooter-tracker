package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3934of extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3959pf f39201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3934of(C3959pf c3959pf, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39201b = c3959pf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39200a = obj;
        this.f39202c |= Integer.MIN_VALUE;
        return this.f39201b.a(null, null, this);
    }
}
