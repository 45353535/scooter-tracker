package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3637ck extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3663dk f38405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38406c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3637ck(C3663dk c3663dk, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38405b = c3663dk;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38404a = obj;
        this.f38406c |= Integer.MIN_VALUE;
        return this.f38405b.b(0, this);
    }
}
