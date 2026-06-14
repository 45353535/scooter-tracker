package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Ul extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3840kl f37864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wl f37866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ul(Wl wl, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37866c = wl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37865b = obj;
        this.f37867d |= Integer.MIN_VALUE;
        return this.f37866c.a((C3840kl) null, (C3966pm) null, this);
    }
}
