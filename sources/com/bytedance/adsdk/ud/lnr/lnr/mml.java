package com.bytedance.adsdk.ud.lnr.lnr;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes6.dex */
public class mml extends qdl {
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Bitmap, Bitmap> fs;
    private final Paint jpc;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<ColorFilter, ColorFilter> rq;
    private final Rect to;
    private final Rect tvp;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    protected final com.bytedance.adsdk.ud.to f15996wd;

    mml(com.bytedance.adsdk.ud.tvp tvpVar, mzz mzzVar) {
        super(tvpVar, mzzVar);
        this.jpc = new com.bytedance.adsdk.ud.qdl.qdl(3);
        this.tvp = new Rect();
        this.to = new Rect();
        this.f15996wd = tvpVar.mo(mzzVar.wd());
    }

    private Bitmap fs() {
        Bitmap bitmapWd;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Bitmap, Bitmap> qdlVar = this.fs;
        if (qdlVar != null && (bitmapWd = qdlVar.wd()) != null) {
            return bitmapWd;
        }
        Bitmap bitmapMzz = this.f16004ud.mzz(this.lnr.wd());
        if (bitmapMzz != null) {
            return bitmapMzz;
        }
        com.bytedance.adsdk.ud.to toVar = this.f15996wd;
        if (toVar != null) {
            return toVar.rq();
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl, com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(RectF rectF, Matrix matrix, boolean z10) {
        super.qdl(rectF, matrix, z10);
        if (this.f15996wd != null) {
            float fQdl = com.bytedance.adsdk.ud.mo.mo.qdl();
            rectF.set(0.0f, 0.0f, this.f15996wd.qdl() * fQdl, this.f15996wd.ud() * fQdl);
            this.qdl.mapRect(rectF);
        }
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl
    public void ud(Canvas canvas, Matrix matrix, int i10) {
        super.ud(canvas, matrix, i10);
        Bitmap bitmapFs = fs();
        if (bitmapFs == null || bitmapFs.isRecycled() || this.f15996wd == null) {
            return;
        }
        float fQdl = com.bytedance.adsdk.ud.mo.mo.qdl();
        this.jpc.setAlpha(i10);
        com.bytedance.adsdk.ud.qdl.ud.qdl<ColorFilter, ColorFilter> qdlVar = this.rq;
        if (qdlVar != null) {
            this.jpc.setColorFilter(qdlVar.wd());
        }
        canvas.save();
        canvas.concat(matrix);
        this.tvp.set(0, 0, bitmapFs.getWidth(), bitmapFs.getHeight());
        if (this.f16004ud.mzz()) {
            this.to.set(0, 0, (int) (this.f15996wd.qdl() * fQdl), (int) (this.f15996wd.ud() * fQdl));
        } else {
            this.to.set(0, 0, (int) (bitmapFs.getWidth() * fQdl), (int) (bitmapFs.getHeight() * fQdl));
        }
        canvas.drawBitmap(bitmapFs, this.tvp, this.to, this.jpc);
        canvas.restore();
    }
}
