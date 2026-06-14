package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Xn extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Yn f38015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xn(Yn yn, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38015b = yn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38014a = obj;
        this.f38016c |= Integer.MIN_VALUE;
        return this.f38015b.a(this);
    }
}
