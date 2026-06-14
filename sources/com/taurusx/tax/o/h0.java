package com.taurusx.tax.o;

/* JADX INFO: loaded from: classes11.dex */
public class h0 extends b0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f66462z;

    public h0(boolean z10) {
        this.f66462z = z10;
    }

    public static h0 z(boolean z10) {
        return new h0(z10);
    }

    @Override // com.taurusx.tax.o.b0
    public String z() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("viewable: ");
        sb2.append(this.f66462z ? "true" : "false");
        return sb2.toString();
    }
}
