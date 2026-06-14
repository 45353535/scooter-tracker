package com.bytedance.adsdk.ud.mzz;

import android.graphics.Color;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class bjy implements wc<com.bytedance.adsdk.ud.lnr.ud.mml> {
    private int qdl;

    public bjy(int i10) {
        this.qdl = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    @Override // com.bytedance.adsdk.ud.mzz.wc
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.adsdk.ud.lnr.ud.mml ud(android.util.JsonReader r18, float r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ud.mzz.bjy.ud(android.util.JsonReader, float):com.bytedance.adsdk.ud.lnr.ud.mml");
    }

    private com.bytedance.adsdk.ud.lnr.ud.mml qdl(com.bytedance.adsdk.ud.lnr.ud.mml mmlVar, List<Float> list) {
        int i10 = this.qdl * 4;
        if (list.size() <= i10) {
            return mmlVar;
        }
        float[] fArrQdl = mmlVar.qdl();
        int[] iArrUd = mmlVar.ud();
        int size = (list.size() - i10) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i11 = 0;
        while (i10 < list.size()) {
            if (i10 % 2 == 0) {
                fArr[i11] = list.get(i10).floatValue();
            } else {
                fArr2[i11] = list.get(i10).floatValue();
                i11++;
            }
            i10++;
        }
        float[] fArrQdl2 = qdl(mmlVar.qdl(), fArr);
        int length = fArrQdl2.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            float f10 = fArrQdl2[i12];
            int iBinarySearch = Arrays.binarySearch(fArrQdl, f10);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f10);
            if (iBinarySearch >= 0 && iBinarySearch2 <= 0) {
                iArr[i12] = qdl(f10, iArrUd[iBinarySearch], fArr, fArr2);
            } else {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i12] = qdl(f10, fArr2[iBinarySearch2], fArrQdl, iArrUd);
            }
        }
        return new com.bytedance.adsdk.ud.lnr.ud.mml(fArrQdl2, iArr);
    }

    int qdl(float f10, float f11, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f10 != fArr[0]) {
            for (int i10 = 1; i10 < fArr.length; i10++) {
                float f12 = fArr[i10];
                if (f12 >= f10 || i10 == fArr.length - 1) {
                    int i11 = i10 - 1;
                    float f13 = fArr[i11];
                    float f14 = (f10 - f13) / (f12 - f13);
                    int i12 = iArr[i10];
                    int i13 = iArr[i11];
                    return Color.argb((int) (f11 * 255.0f), com.bytedance.adsdk.ud.mo.ud.qdl(f14, Color.red(i13), Color.red(i12)), com.bytedance.adsdk.ud.mo.ud.qdl(f14, Color.green(i13), Color.green(i12)), com.bytedance.adsdk.ud.mo.ud.qdl(f14, Color.blue(i13), Color.blue(i12)));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    private int qdl(float f10, int i10, float[] fArr, float[] fArr2) {
        float fQdl;
        if (fArr2.length >= 2 && f10 > fArr[0]) {
            for (int i11 = 1; i11 < fArr.length; i11++) {
                float f11 = fArr[i11];
                if (f11 >= f10 || i11 == fArr.length - 1) {
                    if (f11 <= f10) {
                        fQdl = fArr2[i11];
                    } else {
                        int i12 = i11 - 1;
                        float f12 = fArr[i12];
                        fQdl = com.bytedance.adsdk.ud.mo.mzz.qdl(fArr2[i12], fArr2[i11], (f10 - f12) / (f11 - f12));
                    }
                    return Color.argb((int) (fQdl * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    protected static float[] qdl(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            float f10 = i11 < fArr.length ? fArr[i11] : Float.NaN;
            float f11 = i12 < fArr2.length ? fArr2[i12] : Float.NaN;
            if (!Float.isNaN(f11) && f10 >= f11) {
                if (!Float.isNaN(f10) && f11 >= f10) {
                    fArr3[i13] = f10;
                    i11++;
                    i12++;
                    i10++;
                } else {
                    fArr3[i13] = f11;
                    i12++;
                }
            } else {
                fArr3[i13] = f10;
                i11++;
            }
        }
        return i10 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i10);
    }
}
