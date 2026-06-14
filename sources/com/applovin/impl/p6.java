package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* JADX INFO: loaded from: classes6.dex */
class p6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s7 f10113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f10114h;

    p6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskResolveVastWrapper", kVar);
        this.f10114h = appLovinAdLoadListener;
        this.f10113g = s7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strA = a8.a(this.f10113g);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Resolving VAST ad with depth " + this.f10113g.d() + " at " + strA);
        }
        try {
            this.f9071a.q0().a(new a(com.applovin.impl.sdk.network.a.a(this.f9071a).b(strA).c("GET").a(p8.f10120f).a(((Integer) this.f9071a.a(x4.U4)).intValue()).c(((Integer) this.f9071a.a(x4.V4)).intValue()).a(false).a(), this.f9071a));
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Unable to resolve VAST wrapper", th2);
            }
            a(-1);
        }
    }

    class a extends l6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, p8 p8Var, int i10) {
            this.f9071a.q0().a(h6.a(p8Var, p6.this.f10113g, p6.this.f10114h, p6.this.f9071a));
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, p8 p8Var) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Unable to resolve VAST wrapper. Server returned " + i10);
            }
            p6.this.a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.b(this.f9072b, "Failed to resolve VAST wrapper due to error code " + i10);
        }
        if (i10 == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f10114h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i10);
                return;
            }
            return;
        }
        a8.a(this.f10113g, this.f10114h, i10 == -1001 ? t7.TIMED_OUT : t7.GENERAL_WRAPPER_ERROR, i10, this.f9071a);
    }
}
