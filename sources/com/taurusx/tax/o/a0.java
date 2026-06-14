package com.taurusx.tax.o;

import com.taurusx.tax.o.g0;

/* JADX INFO: loaded from: classes11.dex */
public class a0 extends b0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final g0.f f66414z;

    public a0(g0.f fVar) {
        this.f66414z = fVar;
    }

    public static a0 z(g0.f fVar) {
        return new a0(fVar);
    }

    @Override // com.taurusx.tax.o.b0
    public String z() {
        return "placementType: '" + this.f66414z.toString().toLowerCase() + "'";
    }
}
