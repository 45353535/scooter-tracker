package com.appodeal.advertising;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f15349r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AppSetIdReceiver f15350s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Mutex f15351t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f15352u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AppSetIdReceiver f15353v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15354w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(AppSetIdReceiver appSetIdReceiver, Continuation continuation) {
        super(continuation);
        this.f15353v = appSetIdReceiver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15352u = obj;
        this.f15354w |= Integer.MIN_VALUE;
        return this.f15353v.a(null, this);
    }
}
