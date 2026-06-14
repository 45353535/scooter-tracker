package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.d6;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class k5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f9175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Activity f9176h;

    public k5(List list, Activity activity, com.applovin.impl.sdk.k kVar) {
        super("TaskAutoInitAdapters", kVar, true);
        this.f9175g = list;
        this.f9176h = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(k3 k3Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Auto-initing adapter: " + k3Var);
        }
        this.f9071a.S().a(k3Var, this.f9176h);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f9175g.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f9073c;
                String str = this.f9072b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Auto-initing ");
                sb2.append(this.f9175g.size());
                sb2.append(" adapters");
                sb2.append(this.f9071a.s0().c() ? " in test mode" : "");
                sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
                oVar.a(str, sb2.toString());
            }
            if (TextUtils.isEmpty(this.f9071a.V())) {
                this.f9071a.O0();
            } else if (!this.f9071a.G0()) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f9071a.V());
            }
            if (this.f9176h == null) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (final k3 k3Var : this.f9175g) {
                if (k3Var.s()) {
                    this.f9071a.q0().a(new Runnable() { // from class: com.applovin.impl.kb
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9188b.a(k3Var);
                        }
                    }, d6.b.MEDIATION);
                } else {
                    this.f9071a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9071a.O().a(this.f9072b, "Skipping eager auto-init for adapter " + k3Var);
                    }
                }
            }
        }
    }
}
