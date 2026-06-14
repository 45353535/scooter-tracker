package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3860lg extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3935og f38982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3860lg(C3935og c3935og, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38982b = c3935og;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38981a = obj;
        this.f38983c |= Integer.MIN_VALUE;
        return this.f38982b.a(null, null, this);
    }
}
