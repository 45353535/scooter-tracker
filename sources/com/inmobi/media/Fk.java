package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Fk extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Jk f36871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fk(Jk jk, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f36871b = jk;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36870a = obj;
        this.f36872c |= Integer.MIN_VALUE;
        return this.f36871b.a((kotlin.coroutines.jvm.internal.d) this);
    }
}
