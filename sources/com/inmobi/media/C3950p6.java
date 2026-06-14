package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3950p6 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f39247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4074u6 f39248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39249f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3950p6(C4074u6 c4074u6, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39248e = c4074u6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39247d = obj;
        this.f39249f |= Integer.MIN_VALUE;
        return this.f39248e.a(0, this);
    }
}
