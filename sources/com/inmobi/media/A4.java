package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class A4 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4 f36549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36550c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A4(C4 c42, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f36549b = c42;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36548a = obj;
        this.f36550c |= Integer.MIN_VALUE;
        return this.f36549b.a(this);
    }
}
