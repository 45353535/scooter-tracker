package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4054tb extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4154xb f39588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39589c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4054tb(C4154xb c4154xb, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39588b = c4154xb;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39587a = obj;
        this.f39589c |= Integer.MIN_VALUE;
        return this.f39588b.b(this);
    }
}
