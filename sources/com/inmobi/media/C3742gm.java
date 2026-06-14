package com.inmobi.media;

import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.inmobi.media.gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3742gm extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3767hm f38665c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3742gm(C3767hm c3767hm, Continuation continuation) {
        super(continuation);
        this.f38665c = c3767hm;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38663a = obj;
        this.f38664b |= Integer.MIN_VALUE;
        return this.f38665c.emit(null, this);
    }
}
