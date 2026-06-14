package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3993r0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4018s0 f39421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3993r0(C4018s0 c4018s0, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39421b = c4018s0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39420a = obj;
        this.f39422c |= Integer.MIN_VALUE;
        return this.f39421b.b(null, this);
    }
}
