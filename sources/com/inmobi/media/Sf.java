package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Sf extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uf f37727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37728c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sf(Uf uf2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37727b = uf2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37726a = obj;
        this.f37728c |= Integer.MIN_VALUE;
        return this.f37727b.a(this);
    }
}
