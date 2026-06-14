package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Uk extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Yk f37862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37863c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uk(Yk yk, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37862b = yk;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37861a = obj;
        this.f37863c |= Integer.MIN_VALUE;
        return this.f37862b.b(this);
    }
}
