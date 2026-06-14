package com.applovin.impl;

import com.applovin.impl.d6;
import com.applovin.impl.o7;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
class k6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s7 f9177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f9178h;

    k6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderVastAd", kVar);
        this.f9178h = appLovinAdLoadListener;
        this.f9177g = s7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Rendering VAST ad...");
        }
        int size = this.f9177g.a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String strA = "";
        x7 x7VarA = null;
        b8 b8VarA = null;
        r7 r7VarA = null;
        q7 q7VarA = null;
        String strA2 = "";
        for (p8 p8Var : this.f9177g.a()) {
            p8 p8VarB = p8Var.b(a8.b(p8Var) ? com.taurusx.tax.f.w.f66049y : com.taurusx.tax.f.w.f66048w);
            if (p8VarB != null) {
                p8 p8VarB2 = p8VarB.b("AdSystem");
                if (p8VarB2 != null) {
                    x7VarA = x7.a(p8VarB2, x7VarA, this.f9071a);
                }
                strA = a8.a(p8VarB, "AdTitle", strA);
                strA2 = a8.a(p8VarB, "Description", strA2);
                a8.a(p8VarB.a(com.taurusx.tax.f.y.f66057w), hashSet, this.f9177g, this.f9071a);
                p8 p8VarC = p8VarB.c("ViewableImpression");
                if (p8VarC != null) {
                    a8.a(p8VarC.a("Viewable"), hashSet, this.f9177g, this.f9071a);
                }
                p8 p8VarB3 = p8VarB.b(com.taurusx.tax.f.z.f66069w);
                if (p8VarB3 != null) {
                    q7VarA = q7.a(p8VarB3, q7VarA, this.f9177g, this.f9071a);
                }
                a8.a(p8VarB.a("Error"), hashSet2, this.f9177g, this.f9071a);
                p8 p8VarC2 = p8VarB.c(com.taurusx.tax.f.y.f66054o);
                if (p8VarC2 != null) {
                    for (p8 p8Var2 : p8VarC2.b()) {
                        p8 p8VarC3 = p8Var2.c(com.taurusx.tax.f.y.f66052c);
                        if (p8VarC3 != null) {
                            b8VarA = b8.a(p8VarC3, b8VarA, this.f9177g, this.f9071a);
                        } else {
                            p8 p8VarB4 = p8Var2.b(com.taurusx.tax.f.y.f66051a);
                            if (p8VarB4 != null) {
                                p8 p8VarB5 = p8VarB4.b(com.taurusx.tax.f.y.f66058y);
                                if (p8VarB5 != null) {
                                    r7VarA = r7.a(p8VarB5, r7VarA, this.f9177g, this.f9071a);
                                }
                            } else if (com.applovin.impl.sdk.o.a()) {
                                this.f9073c.b(this.f9072b, "Received and will skip rendering for an unidentified creative: " + p8Var2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Did not find wrapper or inline response for node: " + p8Var);
            }
        }
        o7 o7VarA = new o7.b().a(this.f9071a).a(this.f9177g.b()).b(this.f9177g.e()).a(this.f9177g.c()).b(strA).a(strA2).a(x7VarA).a(b8VarA).a(r7VarA).a(q7VarA).b(hashSet).a(q7VarA).a(hashSet2).a();
        t7 t7VarC = a8.c(o7VarA);
        if (t7VarC != null) {
            a8.a(this.f9177g, this.f9178h, t7VarC, -6, this.f9071a);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Finished rendering VAST ad: " + o7VarA);
        }
        o7VarA.getAdEventTracker().e();
        this.f9071a.q0().a((i5) new n5(o7VarA, this.f9071a, this.f9178h), d6.b.CACHING);
    }
}
