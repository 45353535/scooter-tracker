package com.inmobi.media;

import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.inmobi.media.v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4100v7 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4125w7 f39744c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4100v7(C4125w7 c4125w7, Continuation continuation) {
        super(continuation);
        this.f39744c = c4125w7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39742a = obj;
        this.f39743b |= Integer.MIN_VALUE;
        return this.f39744c.emit(null, this);
    }
}
