package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3726g6 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f38613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3850l6 f38615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3726g6(C3850l6 c3850l6, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38615c = c3850l6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38614b = obj;
        this.f38616d |= Integer.MIN_VALUE;
        return this.f38615c.a(0L, this);
    }
}
