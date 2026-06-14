package com.taurusx.tax.o;

/* JADX INFO: loaded from: classes11.dex */
public class e0 extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f66419c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f66420o;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f66421w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f66422y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f66423z;

    public e0 c(boolean z10) {
        this.f66419c = z10;
        return this;
    }

    public e0 o(boolean z10) {
        this.f66421w = z10;
        return this;
    }

    public e0 w(boolean z10) {
        this.f66420o = z10;
        return this;
    }

    public e0 y(boolean z10) {
        this.f66423z = z10;
        return this;
    }

    @Override // com.taurusx.tax.o.b0
    public String z() {
        return "supports: {sms: " + String.valueOf(this.f66423z) + ", tel: " + String.valueOf(this.f66421w) + ", calendar: " + String.valueOf(this.f66422y) + ", storePicture: " + String.valueOf(this.f66419c) + ", inlineVideo: " + String.valueOf(this.f66420o) + "}";
    }

    public e0 z(boolean z10) {
        this.f66422y = z10;
        return this;
    }
}
