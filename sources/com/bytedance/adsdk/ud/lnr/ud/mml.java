package com.bytedance.adsdk.ud.lnr.ud;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class mml {
    private final float[] qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final int[] f16035ud;

    public mml(float[] fArr, int[] iArr) {
        this.qdl = fArr;
        this.f16035ud = iArr;
    }

    public int lnr() {
        return this.f16035ud.length;
    }

    public float[] qdl() {
        return this.qdl;
    }

    public int[] ud() {
        return this.f16035ud;
    }

    public void qdl(mml mmlVar, mml mmlVar2, float f10) {
        if (mmlVar.f16035ud.length == mmlVar2.f16035ud.length) {
            for (int i10 = 0; i10 < mmlVar.f16035ud.length; i10++) {
                this.qdl[i10] = com.bytedance.adsdk.ud.mo.mzz.qdl(mmlVar.qdl[i10], mmlVar2.qdl[i10], f10);
                this.f16035ud[i10] = com.bytedance.adsdk.ud.mo.ud.qdl(f10, mmlVar.f16035ud[i10], mmlVar2.f16035ud[i10]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + mmlVar.f16035ud.length + " vs " + mmlVar2.f16035ud.length + ")");
    }

    public mml qdl(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = qdl(fArr[i10]);
        }
        return new mml(fArr, iArr);
    }

    private int qdl(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.qdl, f10);
        if (iBinarySearch >= 0) {
            return this.f16035ud[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        if (i10 == 0) {
            return this.f16035ud[0];
        }
        int[] iArr = this.f16035ud;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.qdl;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return com.bytedance.adsdk.ud.mo.ud.qdl((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }
}
