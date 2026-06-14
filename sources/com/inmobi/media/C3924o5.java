package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3924o5 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rf f39158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3949p5 f39160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3924o5(C3949p5 c3949p5, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39160c = c3949p5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39159b = obj;
        this.f39161d |= Integer.MIN_VALUE;
        return this.f39160c.a((Rf) null, this);
    }
}
