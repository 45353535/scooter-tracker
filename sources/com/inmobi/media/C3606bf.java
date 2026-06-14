package com.inmobi.media;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3606bf extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mutex f38277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3632cf f38279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3606bf(C3632cf c3632cf, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38279c = c3632cf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38278b = obj;
        this.f38280d |= Integer.MIN_VALUE;
        return this.f38279c.d(this);
    }
}
