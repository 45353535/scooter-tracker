package com.bytedance.adsdk.ud.lnr.lnr;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes6.dex */
public class mo extends qdl {
    mo(com.bytedance.adsdk.ud.tvp tvpVar, mzz mzzVar) {
        super(tvpVar, mzzVar);
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl, com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(RectF rectF, Matrix matrix, boolean z10) {
        super.qdl(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl
    public void ud(Canvas canvas, Matrix matrix, int i10) {
        super.ud(canvas, matrix, i10);
    }
}
