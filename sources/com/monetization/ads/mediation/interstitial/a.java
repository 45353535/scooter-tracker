package com.monetization.ads.mediation.interstitial;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KProperty;
import yads.f41;
import yads.gk2;
import yads.hk2;
import yads.pm1;
import yads.rw0;
import yads.ub;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f59041e = {v0.f(new g0(a.class, "contentController", "getContentController()Lcom/monetization/ads/fullscreen/FullscreenContentController;", 0)), ub.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm1 f59042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f41 f59043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gk2 f59044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gk2 f59045d;

    public /* synthetic */ a(rw0 rw0Var, pm1 pm1Var) {
        this(rw0Var, pm1Var, new f41(pm1Var));
    }

    public a(rw0 rw0Var, pm1 pm1Var, f41 f41Var) {
        this.f59042a = pm1Var;
        this.f59043b = f41Var;
        this.f59044c = hk2.a(null);
        this.f59045d = hk2.a(rw0Var);
    }
}
