package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class T0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U0 f37751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37752c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(U0 u02, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37751b = u02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37750a = obj;
        this.f37752c |= Integer.MIN_VALUE;
        return this.f37751b.a(null, this);
    }
}
