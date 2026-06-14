package com.appodeal.ads;

import java.util.Arrays;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class wc extends ed implements com.appodeal.ads.networking.c, com.appodeal.ads.networking.o, com.appodeal.ads.networking.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15218c = "sessions";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.appodeal.ads.networking.binders.s[] f15219d;

    public wc() {
        kotlin.jvm.internal.z0 z0Var = new kotlin.jvm.internal.z0(2);
        com.appodeal.ads.networking.binders.s.f14082b.getClass();
        z0Var.b(com.appodeal.ads.networking.binders.s.f14083c.toArray(new com.appodeal.ads.networking.binders.s[0]));
        z0Var.a(com.appodeal.ads.networking.binders.s.f14088h);
        this.f15219d = (com.appodeal.ads.networking.binders.s[]) z0Var.d(new com.appodeal.ads.networking.binders.s[z0Var.c()]);
    }

    @Override // com.appodeal.ads.ed
    public final Object a(Continuation continuation) {
        z8 z8Var = new z8();
        com.appodeal.ads.networking.binders.s[] sVarArr = this.f15219d;
        return z8Var.a((com.appodeal.ads.networking.binders.s[]) Arrays.copyOf(sVarArr, sVarArr.length), (kotlin.coroutines.jvm.internal.d) continuation);
    }

    @Override // com.appodeal.ads.networking.b0
    public final String c() {
        return this.f15218c;
    }

    @Override // com.appodeal.ads.ed
    public final com.appodeal.ads.networking.binders.s[] d() {
        return this.f15219d;
    }
}
