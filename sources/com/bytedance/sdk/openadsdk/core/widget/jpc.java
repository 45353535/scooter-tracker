package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class jpc extends View {
    private static final int[] qdl = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private int jpc;
    private final RectF lnr;
    private final ArrayList<qdl> mml;
    private final Paint mo;
    private final Paint mzz;
    private int tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final RectF f17560ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f17561wd;

    private static final class qdl {
        float lnr;
        float mml;
        public Paint qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public float f17562ud;

        public qdl(Paint paint, float f10, float f11, float f12) {
            this.qdl = paint;
            this.f17562ud = f10;
            this.lnr = f11;
            this.mml = f12;
        }
    }

    public jpc(Context context) {
        super(context);
        this.f17560ud = new RectF();
        this.lnr = new RectF();
        this.mml = new ArrayList<>();
        this.mo = new Paint();
        Paint paint = new Paint();
        this.mzz = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    private void qdl() {
        if (this.f17561wd <= 0) {
            return;
        }
        int width = (int) (((this.jpc * 1.0f) / 100.0f) * getWidth());
        this.lnr.right = Math.max(this.tvp, width);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f17560ud;
        int i10 = this.f17561wd;
        canvas.drawRoundRect(rectF, i10, i10, this.mzz);
        RectF rectF2 = this.lnr;
        int i11 = this.f17561wd;
        canvas.drawRoundRect(rectF2, i11, i11, this.mo);
        int iSave = canvas.save();
        canvas.translate(this.lnr.right - this.tvp, 0.0f);
        for (qdl qdlVar : this.mml) {
            canvas.drawCircle(qdlVar.lnr, qdlVar.mml, qdlVar.f17562ud, qdlVar.qdl);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = i11 / 2;
        this.f17561wd = i14;
        this.tvp = i14 * 5;
        float f10 = i10;
        float f11 = i11;
        this.f17560ud.set(0.0f, 0.0f, f10, f11);
        this.lnr.set(0.0f, 0.0f, 0.0f, f11);
        this.mo.setShader(new LinearGradient(0.0f, 0.0f, f10, f11, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.mml.clear();
        float f12 = this.f17561wd / 4.0f;
        for (int i15 : qdl) {
            Paint paint = new Paint();
            paint.setColor(i15);
            this.mml.add(new qdl(paint, this.f17561wd / 2.0f, f12, f11 / 2.0f));
            f12 += (this.f17561wd / 2.0f) * 3.0f;
        }
        qdl();
    }

    public void setProgress(int i10) {
        int i11 = this.jpc;
        if (i11 == i10) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 > 100) {
            i10 = 100;
        }
        if (i11 == i10) {
            return;
        }
        this.jpc = i10;
        qdl();
    }
}
