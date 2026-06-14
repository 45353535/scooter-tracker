package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4097v4 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4147x4 f39733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39734d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4097v4(C4147x4 c4147x4, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39733c = c4147x4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39732b = obj;
        this.f39734d |= Integer.MIN_VALUE;
        return this.f39733c.a(null, null, null, this);
    }
}
