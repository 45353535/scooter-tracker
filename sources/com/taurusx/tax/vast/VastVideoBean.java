package com.taurusx.tax.vast;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class VastVideoBean implements Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f67032w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f67033y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f67034z;

    public VastVideoBean(String str, int i10, int i11) {
        this.f67034z = str;
        this.f67032w = i10;
        this.f67033y = i11;
    }

    public int getHeight() {
        return this.f67033y;
    }

    public String getUrl() {
        return this.f67034z;
    }

    public int getWidth() {
        return this.f67032w;
    }
}
