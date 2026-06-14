package com.appodeal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class e3 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f13264r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f13265s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l4 f13266t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13267u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(l4 l4Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f13266t = l4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13265s = obj;
        this.f13267u |= Integer.MIN_VALUE;
        return l4.j(this.f13266t, null, this);
    }
}
