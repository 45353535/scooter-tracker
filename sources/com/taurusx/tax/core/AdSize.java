package com.taurusx.tax.core;

/* JADX INFO: loaded from: classes11.dex */
public enum AdSize {
    Banner_320_50(320, 50),
    Banner_300_250(300, 250);


    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f65986w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f65987z;

    AdSize(int i10, int i11) {
        this.f65987z = i10;
        this.f65986w = i11;
    }

    public int getHeight() {
        return this.f65986w;
    }

    public int getWidth() {
        return this.f65987z;
    }
}
