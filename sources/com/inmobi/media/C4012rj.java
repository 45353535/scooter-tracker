package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.rj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4012rj extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4137wj f39479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4012rj(C4137wj c4137wj, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39479b = c4137wj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39478a = obj;
        this.f39480c |= Integer.MIN_VALUE;
        return this.f39479b.a(this);
    }
}
