package com.appodeal.advertising;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AppSetIdReceiver f15344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15345t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AppSetIdReceiver appSetIdReceiver, Continuation continuation) {
        super(continuation);
        this.f15344s = appSetIdReceiver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15343r = obj;
        this.f15345t |= Integer.MIN_VALUE;
        return this.f15344s.getAppSetId(null, this);
    }
}
