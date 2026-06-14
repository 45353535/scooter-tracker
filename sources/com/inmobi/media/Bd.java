package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Bd extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dd f36622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36623c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bd(Dd dd2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f36622b = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36621a = obj;
        this.f36623c |= Integer.MIN_VALUE;
        return this.f36622b.a(null, this);
    }
}
