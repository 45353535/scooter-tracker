package com.taurusx.tax.o;

import com.taurusx.tax.o.g0;

/* JADX INFO: loaded from: classes11.dex */
public class d0 extends b0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final g0.p f66418z;

    public d0(g0.p pVar) {
        this.f66418z = pVar;
    }

    public static d0 z(g0.p pVar) {
        return new d0(pVar);
    }

    @Override // com.taurusx.tax.o.b0
    public String z() {
        return "state: '" + this.f66418z.toString().toLowerCase() + "'";
    }
}
