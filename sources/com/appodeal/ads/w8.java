package com.appodeal.ads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public abstract class w8 extends ed implements com.appodeal.ads.networking.o, com.appodeal.ads.networking.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc f15194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final te f15195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.appodeal.ads.segments.o f15196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f15197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.appodeal.ads.networking.binders.s[] f15198g;

    public w8(uc ucVar, te teVar, com.appodeal.ads.segments.o oVar, Double d10) {
        this.f15194c = ucVar;
        this.f15195d = teVar;
        this.f15196e = oVar;
        this.f15197f = d10;
        kotlin.jvm.internal.z0 z0Var = new kotlin.jvm.internal.z0(4);
        com.appodeal.ads.networking.binders.s.f14082b.getClass();
        z0Var.b(com.appodeal.ads.networking.binders.s.f14083c.toArray(new com.appodeal.ads.networking.binders.s[0]));
        z0Var.a(com.appodeal.ads.networking.binders.s.f14084d);
        z0Var.a(com.appodeal.ads.networking.binders.s.f14088h);
        z0Var.a(com.appodeal.ads.networking.binders.s.f14090j);
        this.f15198g = (com.appodeal.ads.networking.binders.s[]) z0Var.d(new com.appodeal.ads.networking.binders.s[z0Var.c()]);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object g(com.appodeal.ads.w8 r7, kotlin.coroutines.jvm.internal.d r8) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.w8.g(com.appodeal.ads.w8, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    @Override // com.appodeal.ads.ed
    public final Object a(Continuation continuation) {
        return g(this, (kotlin.coroutines.jvm.internal.d) continuation);
    }

    @Override // com.appodeal.ads.ed
    public final com.appodeal.ads.networking.binders.s[] d() {
        return this.f15198g;
    }
}
