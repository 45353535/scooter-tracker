package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4029sb extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4154xb f39522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39523c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4029sb(C4154xb c4154xb, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39522b = c4154xb;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39521a = obj;
        this.f39523c |= Integer.MIN_VALUE;
        return this.f39522b.a(this);
    }
}
