package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3972q3 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S2 f39338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3565a0 f39339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3878m9 f39340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f39341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4121w3 f39342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39343f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3972q3(C4121w3 c4121w3, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39342e = c4121w3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39341d = obj;
        this.f39343f |= Integer.MIN_VALUE;
        return this.f39342e.a(null, null, null, this);
    }
}
