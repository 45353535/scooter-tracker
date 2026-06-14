package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4004rb extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4154xb f39463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4004rb(C4154xb c4154xb, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39463b = c4154xb;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39462a = obj;
        this.f39464c |= Integer.MIN_VALUE;
        return this.f39463b.a(0L, 0, this);
    }
}
