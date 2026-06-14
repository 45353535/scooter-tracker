package com.appodeal.advertising;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15346r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AppSetIdReceiver f15347s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15348t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AppSetIdReceiver appSetIdReceiver, Continuation continuation) {
        super(continuation);
        this.f15347s = appSetIdReceiver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15346r = obj;
        this.f15348t |= Integer.MIN_VALUE;
        return this.f15347s.getAppSetIdScope(null, this);
    }
}
