package com.appodeal.ads;

import com.appodeal.ads.api.h;

/* JADX INFO: loaded from: classes6.dex */
public final class b5 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public w5 f13127r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h.b f13128s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h.b f13129t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h.b f13130u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f13131v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w5 f13132w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13133x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(w5 w5Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f13132w = w5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13131v = obj;
        this.f13133x |= Integer.MIN_VALUE;
        return this.f13132w.b(this);
    }
}
