package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Tf extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uf f37768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tf(Uf uf2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37768b = uf2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37767a = obj;
        this.f37769c |= Integer.MIN_VALUE;
        return this.f37768b.b(this);
    }
}
