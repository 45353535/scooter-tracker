package com.inmobi.media;

import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.inmobi.media.vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4106vd extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4131wd f39773c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4106vd(C4131wd c4131wd, Continuation continuation) {
        super(continuation);
        this.f39773c = c4131wd;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39771a = obj;
        this.f39772b |= Integer.MIN_VALUE;
        return this.f39773c.emit(null, this);
    }
}
