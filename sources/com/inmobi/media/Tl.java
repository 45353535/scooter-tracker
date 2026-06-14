package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Tl extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3990ql f37792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wl f37794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tl(Wl wl, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37794c = wl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37793b = obj;
        this.f37795d |= Integer.MIN_VALUE;
        return this.f37794c.a(this);
    }
}
