package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.mo.mml;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes6.dex */
public class NiceImageView extends mml {
    private RectF aaj;
    private Path bch;
    private int bjy;
    private final float[] exc;
    private int exu;
    private int fs;
    private final float[] jl;
    private int jpc;
    private int jtx;
    private final RectF jyq;
    private final Path ljh;
    private boolean lnr;
    private int mml;
    private int mo;
    private int mzz;
    private final Paint oth;
    private final Context qdl;
    private final Xfermode rdp;
    private int rq;
    private int to;
    private int tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private boolean f16908ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f16909wd;
    private float yt;

    public NiceImageView(Context context) {
        this(context, null);
    }

    private void lnr() {
        if (this.f16908ud) {
            return;
        }
        int i10 = 0;
        if (this.jpc <= 0) {
            float[] fArr = this.jl;
            int i11 = this.tvp;
            float f10 = i11;
            fArr[1] = f10;
            fArr[0] = f10;
            int i12 = this.to;
            float f11 = i12;
            fArr[3] = f11;
            fArr[2] = f11;
            int i13 = this.fs;
            float f12 = i13;
            fArr[5] = f12;
            fArr[4] = f12;
            int i14 = this.rq;
            float f13 = i14;
            fArr[7] = f13;
            fArr[6] = f13;
            float[] fArr2 = this.exc;
            int i15 = this.mml;
            float f14 = i11 - (i15 / 2.0f);
            fArr2[1] = f14;
            fArr2[0] = f14;
            float f15 = i12 - (i15 / 2.0f);
            fArr2[3] = f15;
            fArr2[2] = f15;
            float f16 = i13 - (i15 / 2.0f);
            fArr2[5] = f16;
            fArr2[4] = f16;
            float f17 = i14 - (i15 / 2.0f);
            fArr2[7] = f17;
            fArr2[6] = f17;
            return;
        }
        while (true) {
            float[] fArr3 = this.jl;
            if (i10 >= fArr3.length) {
                return;
            }
            int i16 = this.jpc;
            fArr3[i10] = i16;
            this.exc[i10] = i16 - (this.mml / 2.0f);
            i10++;
        }
    }

    private void mml() {
        if (this.f16908ud) {
            return;
        }
        this.mo = 0;
    }

    private void qdl(Canvas canvas) {
        if (!this.f16908ud) {
            int i10 = this.mml;
            if (i10 > 0) {
                qdl(canvas, i10, this.mzz, this.jyq, this.jl);
                return;
            }
            return;
        }
        int i11 = this.mml;
        if (i11 > 0) {
            qdl(canvas, i11, this.mzz, this.yt - (i11 / 2.0f));
        }
        int i12 = this.mo;
        if (i12 > 0) {
            qdl(canvas, i12, this.f16909wd, (this.yt - this.mml) - (i12 / 2.0f));
        }
    }

    private void ud() {
        if (!this.f16908ud) {
            this.aaj.set(0.0f, 0.0f, this.bjy, this.jtx);
            if (this.lnr) {
                this.aaj = this.jyq;
                return;
            }
            return;
        }
        float fMin = Math.min(this.bjy, this.jtx) / 2.0f;
        this.yt = fMin;
        RectF rectF = this.aaj;
        int i10 = this.bjy;
        int i11 = this.jtx;
        rectF.set((i10 / 2.0f) - fMin, (i11 / 2.0f) - fMin, (i10 / 2.0f) + fMin, (i11 / 2.0f) + fMin);
    }

    public void isCircle(boolean z10) {
        this.f16908ud = z10;
        mml();
        ud();
        invalidate();
    }

    public void isCoverSrc(boolean z10) {
        this.lnr = z10;
        ud();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.saveLayer(this.aaj, null, 31);
        if (!this.lnr) {
            int i10 = this.bjy;
            int i11 = this.mml;
            int i12 = this.mo;
            int i13 = this.jtx;
            canvas.scale((((i10 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i10, (((i13 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i13, i10 / 2.0f, i13 / 2.0f);
        }
        super.onDraw(canvas);
        this.oth.reset();
        this.ljh.reset();
        if (this.f16908ud) {
            this.ljh.addCircle(this.bjy / 2.0f, this.jtx / 2.0f, this.yt, Path.Direction.CCW);
        } else {
            this.ljh.addRoundRect(this.aaj, this.exc, Path.Direction.CCW);
        }
        this.oth.setAntiAlias(true);
        this.oth.setStyle(Paint.Style.FILL);
        this.oth.setXfermode(this.rdp);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.ljh, this.oth);
        } else {
            this.bch.addRect(this.aaj, Path.Direction.CCW);
            this.bch.op(this.ljh, Path.Op.DIFFERENCE);
            canvas.drawPath(this.bch, this.oth);
        }
        this.oth.setXfermode(null);
        int i14 = this.exu;
        if (i14 != 0) {
            this.oth.setColor(i14);
            canvas.drawPath(this.ljh, this.oth);
        }
        canvas.restore();
        qdl(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.bjy = i10;
        this.jtx = i11;
        qdl();
        ud();
    }

    public void setBorderColor(@ColorInt int i10) {
        this.mzz = i10;
        invalidate();
    }

    public void setBorderWidth(int i10) {
        this.mml = ax.ud(this.qdl, i10);
        qdl(false);
    }

    public void setCornerBottomLeftRadius(int i10) {
        this.rq = ax.ud(this.qdl, i10);
        qdl(true);
    }

    public void setCornerBottomRightRadius(int i10) {
        this.fs = ax.ud(this.qdl, i10);
        qdl(true);
    }

    public void setCornerRadius(int i10) {
        this.jpc = ax.ud(this.qdl, i10);
        qdl(false);
    }

    public void setCornerTopLeftRadius(int i10) {
        this.tvp = ax.ud(this.qdl, i10);
        qdl(true);
    }

    public void setCornerTopRightRadius(int i10) {
        this.to = ax.ud(this.qdl, i10);
        qdl(true);
    }

    public void setInnerBorderColor(@ColorInt int i10) {
        this.f16909wd = i10;
        invalidate();
    }

    public void setInnerBorderWidth(int i10) {
        this.mo = ax.ud(this.qdl, i10);
        mml();
        invalidate();
    }

    public void setMaskColor(@ColorInt int i10) {
        this.exu = i10;
        invalidate();
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mzz = -1;
        this.f16909wd = -1;
        this.qdl = context;
        this.jpc = ax.ud(context, 10.0f);
        this.jl = new float[8];
        this.exc = new float[8];
        this.jyq = new RectF();
        this.aaj = new RectF();
        this.oth = new Paint();
        this.ljh = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.rdp = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.rdp = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.bch = new Path();
        }
        lnr();
        mml();
    }

    private void qdl(Canvas canvas, int i10, int i11, float f10) {
        qdl(i10, i11);
        this.ljh.addCircle(this.bjy / 2.0f, this.jtx / 2.0f, f10, Path.Direction.CCW);
        canvas.drawPath(this.ljh, this.oth);
    }

    private void qdl(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        qdl(i10, i11);
        this.ljh.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.ljh, this.oth);
    }

    private void qdl(int i10, int i11) {
        this.ljh.reset();
        this.oth.setStrokeWidth(i10);
        this.oth.setColor(i11);
        this.oth.setStyle(Paint.Style.STROKE);
    }

    private void qdl() {
        if (this.f16908ud) {
            return;
        }
        RectF rectF = this.jyq;
        int i10 = this.mml;
        rectF.set(i10 / 2.0f, i10 / 2.0f, this.bjy - (i10 / 2.0f), this.jtx - (i10 / 2.0f));
    }

    private void qdl(boolean z10) {
        if (z10) {
            this.jpc = 0;
        }
        lnr();
        qdl();
        invalidate();
    }
}
