package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3675e7 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f38504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3876m7 f38507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3675e7(C3876m7 c3876m7, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38507d = c3876m7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38506c = obj;
        this.f38508e |= Integer.MIN_VALUE;
        return this.f38507d.c(this);
    }
}
