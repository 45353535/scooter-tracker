package com.monetization.ads.mediation.banner;

import kotlin.reflect.KProperty;
import yads.cm;
import yads.f41;
import yads.gk2;
import yads.hk2;
import yads.pm1;
import yads.pn1;
import yads.ub;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f59025f = {ub.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/banner/BannerAdLoadController;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm1 f59026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pn1 f59027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f41 f59028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gk2 f59029d;

    public /* synthetic */ a(cm cmVar, pm1 pm1Var, pn1 pn1Var) {
        this(cmVar, pm1Var, pn1Var, new f41(pm1Var));
    }

    public a(cm cmVar, pm1 pm1Var, pn1 pn1Var, f41 f41Var) {
        this.f59026a = pm1Var;
        this.f59027b = pn1Var;
        this.f59028c = f41Var;
        this.f59029d = hk2.a(cmVar);
    }
}
