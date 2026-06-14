package com.bytedance.sdk.component.adexpress.mo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.tvp.mml.b;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"AppCompatCustomView"})
public class exu extends ImageView {
    private boolean exu;
    private volatile boolean fs;
    private float jpc;
    private int lnr;
    private AnimatedImageDrawable mml;
    private boolean mo;
    private boolean mzz;
    private Movie qdl;
    private boolean rdp;
    private int rq;
    private int to;
    private float tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private long f16414ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private float f16415wd;

    public exu(Context context) {
        super(context);
        this.mzz = Build.VERSION.SDK_INT >= 28;
        this.mo = false;
        this.exu = true;
        this.rdp = true;
        qdl();
    }

    private void lnr() {
        if (this.qdl == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f16414ud == 0) {
            this.f16414ud = jUptimeMillis;
        }
        int iDuration = this.qdl.duration();
        if (iDuration == 0) {
            iDuration = 1000;
        }
        if (this.rdp || Math.abs(iDuration - this.lnr) >= 60) {
            this.lnr = (int) ((jUptimeMillis - this.f16414ud) % ((long) iDuration));
        } else {
            this.lnr = iDuration;
            this.fs = true;
        }
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && com.bytedance.adsdk.ugeno.tvp.mml.a.a(drawable)) {
            AnimatedImageDrawable animatedImageDrawableA = b.a(drawable);
            this.mml = animatedImageDrawableA;
            if (!this.fs) {
                animatedImageDrawableA.start();
            }
            if (!this.rdp) {
                animatedImageDrawableA.setRepeatCount(0);
            }
        }
        ud();
    }

    private void ud() {
        if (this.qdl == null || this.mzz || !this.exu) {
            return;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.qdl == null || this.mzz) {
            super.onDraw(canvas);
            return;
        }
        try {
            if (this.fs) {
                qdl(canvas);
                return;
            }
            lnr();
            qdl(canvas);
            ud();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.qdl != null && !this.mzz) {
            this.f16415wd = (getWidth() - this.to) / 2.0f;
            this.jpc = (getHeight() - this.rq) / 2.0f;
        }
        this.exu = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i10, i11);
        if (this.mzz || (movie = this.qdl) == null) {
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.qdl.height();
        float fMax = 1.0f / Math.max((View.MeasureSpec.getMode(i10) == 0 || iWidth <= (size2 = View.MeasureSpec.getSize(i10))) ? 1.0f : iWidth / size2, (View.MeasureSpec.getMode(i11) == 0 || iHeight <= (size = View.MeasureSpec.getSize(i11))) ? 1.0f : iHeight / size);
        this.tvp = fMax;
        int i12 = (int) (iWidth * fMax);
        this.to = i12;
        int i13 = (int) (iHeight * fMax);
        this.rq = i13;
        setMeasuredDimension(i12, i13);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        if (this.qdl != null) {
            this.exu = i10 == 1;
            ud();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (this.qdl != null) {
            this.exu = i10 == 0;
            ud();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.qdl != null) {
            this.exu = i10 == 0;
            ud();
        }
    }

    void qdl() {
        if (this.mzz) {
            return;
        }
        setLayerType(1, null);
    }

    public void setRepeatConfig(boolean z10) {
        AnimatedImageDrawable animatedImageDrawable;
        this.rdp = z10;
        if (z10) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.mml) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception unused) {
        }
    }

    private void qdl(Canvas canvas) {
        Movie movie = this.qdl;
        if (movie == null) {
            return;
        }
        movie.setTime(this.lnr);
        float f10 = this.tvp;
        if (f10 == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.qdl.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f10, f10);
            Movie movie2 = this.qdl;
            float f11 = this.f16415wd;
            float f12 = this.tvp;
            movie2.draw(canvas, f11 / f12, this.jpc / f12);
        }
        canvas.restore();
    }
}
