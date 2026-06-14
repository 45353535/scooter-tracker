package com.bytedance.adsdk.ud.lnr;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    public PointF exu;
    public PointF fs;
    public int jpc;
    public float lnr;
    public qdl mml;
    public float mo;
    public int mzz;
    public String qdl;
    public boolean rq;
    public float to;
    public int tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public String f16019ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    public float f16020wd;

    public enum qdl {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public ud(String str, String str2, float f10, qdl qdlVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        qdl(str, str2, f10, qdlVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.qdl.hashCode() * 31) + this.f16019ud.hashCode()) * 31) + this.lnr)) * 31) + this.mml.ordinal()) * 31) + this.mzz;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.mo);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.jpc;
    }

    public void qdl(String str, String str2, float f10, qdl qdlVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.qdl = str;
        this.f16019ud = str2;
        this.lnr = f10;
        this.mml = qdlVar;
        this.mzz = i10;
        this.mo = f11;
        this.f16020wd = f12;
        this.jpc = i11;
        this.tvp = i12;
        this.to = f13;
        this.rq = z10;
        this.fs = pointF;
        this.exu = pointF2;
    }

    public ud() {
    }
}
