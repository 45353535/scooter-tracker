package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3797j3 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S2 f38786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3822k3 f38788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3797j3(C3822k3 c3822k3, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38788c = c3822k3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38787b = obj;
        this.f38789d |= Integer.MIN_VALUE;
        return this.f38788c.a(null, this);
    }
}
