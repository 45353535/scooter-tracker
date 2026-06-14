package com.appodeal.ads.services.ua;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14768r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14769s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f14770t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation continuation) {
        super(continuation);
        this.f14770t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14768r = obj;
        this.f14769s |= Integer.MIN_VALUE;
        return this.f14770t.emit(null, this);
    }
}
