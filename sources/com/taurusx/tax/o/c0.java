package com.taurusx.tax.o;

/* JADX INFO: loaded from: classes11.dex */
public class c0 extends b0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f66416w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f66417z;

    public c0(int i10, int i11) {
        this.f66417z = i10;
        this.f66416w = i11;
    }

    public static c0 z(int i10, int i11) {
        return new c0(i10, i11);
    }

    @Override // com.taurusx.tax.o.b0
    public String z() {
        return "screenSize: { width: " + this.f66417z + ", height: " + this.f66416w + " }";
    }
}
