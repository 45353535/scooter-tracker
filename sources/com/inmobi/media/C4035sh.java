package com.inmobi.media;

import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.inmobi.media.sh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4035sh extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC3948p4 f39541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4060th f39543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4035sh(C4060th c4060th, Continuation continuation) {
        super(continuation);
        this.f39543c = c4060th;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39542b = obj;
        this.f39544d |= Integer.MIN_VALUE;
        return this.f39543c.emit(null, this);
    }
}
