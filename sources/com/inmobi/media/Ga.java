package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Ga extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q9 f36930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ La f36932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ga(La la2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f36932c = la2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36931b = obj;
        this.f36933d |= Integer.MIN_VALUE;
        return La.a(this.f36932c, null, this);
    }
}
