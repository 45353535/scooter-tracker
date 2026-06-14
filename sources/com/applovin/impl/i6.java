package com.applovin.impl;

import com.applovin.impl.d6;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class i6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference f9077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f9078h;

    protected i6(s4 s4Var, Object obj, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.f9077g = new WeakReference(s4Var);
        this.f9078h = obj;
    }

    public static void a(long j10, s4 s4Var, Object obj, String str, com.applovin.impl.sdk.k kVar) {
        if (j10 <= 0) {
            return;
        }
        kVar.q0().a(new i6(s4Var, obj, str, kVar), d6.b.TIMEOUT, j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        s4 s4Var = (s4) this.f9077g.get();
        if (s4Var == null || s4Var.d()) {
            return;
        }
        this.f9071a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f9071a.O().d(this.f9072b, "Attempting to timeout pending task " + s4Var.c() + " with " + this.f9078h);
        }
        s4Var.c(this.f9078h);
    }
}
