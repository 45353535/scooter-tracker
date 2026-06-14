package com.appodeal.ads.modules.common.internal.service.impl;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ServiceInitializationAwaiterImpl f13771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ServiceInitializationAwaiterImpl f13773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ServiceInitializationAwaiterImpl serviceInitializationAwaiterImpl, Continuation continuation) {
        super(continuation);
        this.f13773c = serviceInitializationAwaiterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13772b = obj;
        this.f13774d |= Integer.MIN_VALUE;
        return this.f13773c.await(this);
    }
}
