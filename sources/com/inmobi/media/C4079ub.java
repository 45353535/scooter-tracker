package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4079ub extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4154xb f39660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39661c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4079ub(C4154xb c4154xb, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39660b = c4154xb;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39659a = obj;
        this.f39661c |= Integer.MIN_VALUE;
        return this.f39660b.b((String) null, this);
    }
}
