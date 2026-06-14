package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class D3 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36700b;

    public D3(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36699a = obj;
        this.f36700b |= Integer.MIN_VALUE;
        return F3.a((C3986qh) null, (Function1) null, this);
    }
}
