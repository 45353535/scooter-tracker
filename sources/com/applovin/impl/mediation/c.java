package com.applovin.impl.mediation;

import com.applovin.impl.c3;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f9563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f9564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.g0 f9565d;

    public interface a {
        void a(c3 c3Var);
    }

    c(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f9562a = kVar;
        this.f9563b = kVar.O();
        this.f9564c = aVar;
    }

    public void a(final c3 c3Var, long j10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9563b.a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j10 + "ms...");
        }
        this.f9565d = com.applovin.impl.g0.a(j10, this.f9562a, new Runnable() { // from class: com.applovin.impl.mediation.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f9806b.a(c3Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9563b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f9564c.a(c3Var);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9563b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        com.applovin.impl.g0 g0Var = this.f9565d;
        if (g0Var != null) {
            g0Var.a();
            this.f9565d = null;
        }
    }
}
