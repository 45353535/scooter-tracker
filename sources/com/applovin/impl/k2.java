package com.applovin.impl;

import com.applovin.impl.d6;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f9163a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.k kVar) {
        if (f9163a) {
            return;
        }
        kVar.D().a(d2.S0, "no_ads_loaded");
    }

    public static void b(final com.applovin.impl.sdk.k kVar) {
        Long l10 = (Long) kVar.a(r3.f10323n8);
        if (l10.longValue() <= 0) {
            return;
        }
        kVar.q0().a(new r6(kVar, true, "submitIntegrationErrorReport", new Runnable() { // from class: com.applovin.impl.ib
            @Override // java.lang.Runnable
            public final void run() {
                k2.a(kVar);
            }
        }), d6.b.OTHER, TimeUnit.SECONDS.toMillis(l10.longValue()));
    }

    public static void a() {
        f9163a = true;
    }
}
