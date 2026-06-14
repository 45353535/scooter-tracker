package com.appodeal.ads;

import com.appodeal.ads.ext.LogExtKt;

/* JADX INFO: loaded from: classes6.dex */
public final class b9 implements z7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b9 f13136b = new b9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u8 f13137a = new u8(kotlinx.coroutines.i.a(eg.o0.c().plus(new eg.e0("ApdAdLifecycleTracker"))), com.appodeal.ads.utils.session.r.f15109b, com.appodeal.ads.context.o.f13205b);

    public final void a() {
        u8 u8Var = this.f13137a;
        hg.i.F(hg.i.K(u8Var.f14927b.f15110a.f15108j, new e8(u8Var, null)), u8Var.f14926a);
        LogExtKt.logInternal$default("AdLifecycleTracker", "Initialized", null, 4, null);
    }
}
