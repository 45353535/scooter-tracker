package com.my.target;

import com.my.target.common.models.ImageData;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e4 extends b {
    public ImageData L;
    public float M;
    public boolean N = true;
    public boolean O = true;

    public e4() {
        this.f59222r = d1.f59450q;
    }

    public float L() {
        return this.M;
    }

    public ImageData M() {
        return this.L;
    }

    public boolean N() {
        return this.O;
    }

    public boolean O() {
        return this.N;
    }

    public void c(ImageData imageData) {
        this.L = imageData;
    }

    public void e(boolean z10) {
        this.O = z10;
    }

    public void f(boolean z10) {
        this.N = z10;
    }

    public void c(float f10) {
        this.M = f10;
    }
}
