package com.appodeal.consent.ump;

import com.appodeal.consent.ConsentUpdateRequestParameters;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ConsentUpdateRequestParameters f15573r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f15574s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f15575t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15576u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f15575t = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15574s = obj;
        this.f15576u |= Integer.MIN_VALUE;
        return this.f15575t.a(null, this);
    }
}
