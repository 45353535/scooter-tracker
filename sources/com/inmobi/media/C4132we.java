package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.we, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4132we extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4182ye f39847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39848c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4132we(C4182ye c4182ye, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39847b = c4182ye;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39846a = obj;
        this.f39848c |= Integer.MIN_VALUE;
        return this.f39847b.a(this);
    }
}
