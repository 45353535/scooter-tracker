package com.inmobi.media;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes9.dex */
public final class Ze extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mutex f38116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3632cf f38118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38119d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ze(C3632cf c3632cf, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38118c = c3632cf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38117b = obj;
        this.f38119d |= Integer.MIN_VALUE;
        return this.f38118c.c(this);
    }
}
