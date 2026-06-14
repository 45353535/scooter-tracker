package com.bytedance.adsdk.ud.lnr;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private final PointF lnr;
    private final PointF qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final PointF f16014ud;

    public qdl() {
        this.qdl = new PointF();
        this.f16014ud = new PointF();
        this.lnr = new PointF();
    }

    public void lnr(float f10, float f11) {
        this.lnr.set(f10, f11);
    }

    public void qdl(float f10, float f11) {
        this.qdl.set(f10, f11);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.lnr.x), Float.valueOf(this.lnr.y), Float.valueOf(this.qdl.x), Float.valueOf(this.qdl.y), Float.valueOf(this.f16014ud.x), Float.valueOf(this.f16014ud.y));
    }

    public void ud(float f10, float f11) {
        this.f16014ud.set(f10, f11);
    }

    public PointF lnr() {
        return this.lnr;
    }

    public PointF qdl() {
        return this.qdl;
    }

    public PointF ud() {
        return this.f16014ud;
    }

    public qdl(PointF pointF, PointF pointF2, PointF pointF3) {
        this.qdl = pointF;
        this.f16014ud = pointF2;
        this.lnr = pointF3;
    }
}
