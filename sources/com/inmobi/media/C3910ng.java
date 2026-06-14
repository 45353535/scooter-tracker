package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3910ng extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3935og f39107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3910ng(C3935og c3935og, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39107b = c3935og;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39106a = obj;
        this.f39108c |= Integer.MIN_VALUE;
        return this.f39107b.a(null, null, 0L, this);
    }
}
