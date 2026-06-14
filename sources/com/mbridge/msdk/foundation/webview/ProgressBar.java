package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public class ProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Runnable f49115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f49116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f49117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f49118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f49119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f49120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f49121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f49122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f49123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f49124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f49125k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f49126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f49127m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f49128n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f49129o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f49130p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Rect f49131q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f49132r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f49133s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f49134t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f49135u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f49136v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f49137w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f49138x;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar.this.invalidate();
        }
    }

    public ProgressBar(Context context) {
        super(context);
        this.f49115a = new a();
        this.f49121g = 25L;
        this.f49122h = new Handler(Looper.getMainLooper());
        this.f49125k = false;
        this.f49128n = 0.95f;
        this.f49129o = false;
        this.f49131q = new Rect();
        a(context);
    }

    private void a(Context context) {
        setWillNotDraw(false);
    }

    private float getVelocity() {
        if (this.f49134t) {
            return this.f49126l ? 1.0f : 0.4f;
        }
        if (this.f49138x < 2000) {
            if (this.f49136v == 1) {
                return this.f49126l ? 1.0f : 0.4f;
            }
            if (this.f49135u == 1) {
                return this.f49126l ? 0.4f : 0.2f;
            }
            if (this.f49126l) {
                return 0.2f;
            }
        }
        return 0.05f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f49125k) {
            this.f49125k = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f49129o ? 0L : jCurrentTimeMillis - this.f49127m;
        this.f49118d = Math.abs(j10 / 1000.0f);
        this.f49127m = jCurrentTimeMillis;
        this.f49138x += j10;
        float velocity = getVelocity();
        this.f49117c = velocity;
        float f10 = this.f49116b + (velocity * this.f49118d);
        this.f49116b = f10;
        if (!this.f49134t) {
            float f11 = this.f49128n;
            if (f10 > f11) {
                this.f49116b = f11;
            }
        }
        this.f49131q.right = (int) (this.f49116b * this.f49133s);
        this.f49122h.removeCallbacksAndMessages(null);
        this.f49122h.postDelayed(this.f49115a, this.f49121g);
        super.draw(canvas);
        a(canvas, this.f49118d);
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z10) {
        return null;
    }

    public float getProgress() {
        return this.f49116b;
    }

    public void initResource(boolean z10) {
        if (z10 || (this.f49123i == null && this.f49130p == null && this.f49132r == null && this.f49119e == null)) {
            Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f49123i = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f49123i.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f49130p = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f49130p.getIntrinsicHeight());
            }
            this.f49132r = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f49119e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f49133s = getMeasuredWidth();
    }

    public void onThemeChange() {
        if (this.f49125k) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Drawable drawable = this.f49123i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f49130p;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public void setPaused(boolean z10) {
        this.f49129o = z10;
        if (z10) {
            return;
        }
        this.f49127m = System.currentTimeMillis();
    }

    public void setProgress(float f10, boolean z10) {
        if (!z10 || f10 < 1.0f) {
            return;
        }
        startEndAnimation();
    }

    public void setProgressBarListener(c cVar) {
    }

    public void setProgressState(int i10) {
        if (i10 == 5) {
            this.f49135u = 1;
            this.f49136v = 0;
            this.f49137w = 0;
            this.f49138x = 0L;
            return;
        }
        if (i10 == 6) {
            this.f49136v = 1;
            if (this.f49137w == 1) {
                startEndAnimation();
            }
            this.f49138x = 0L;
            return;
        }
        if (i10 == 7) {
            startEndAnimation();
        } else {
            if (i10 != 8) {
                return;
            }
            this.f49137w = 1;
            if (this.f49136v == 1) {
                startEndAnimation();
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public void setVisible(boolean z10) {
        if (!z10) {
            setVisibility(4);
            return;
        }
        this.f49126l = true;
        this.f49127m = System.currentTimeMillis();
        this.f49118d = 0.0f;
        this.f49138x = 0L;
        this.f49134t = false;
        this.f49120f = 0.0f;
        this.f49116b = 0.0f;
        this.f49133s = getMeasuredWidth();
        this.f49129o = false;
        this.f49135u = 0;
        this.f49136v = 0;
        this.f49137w = 0;
        Drawable drawable = this.f49123i;
        if (drawable != null) {
            this.f49124j = -drawable.getIntrinsicWidth();
        } else {
            this.f49124j = 0;
        }
        Drawable drawable2 = this.f49132r;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
        }
        Drawable drawable3 = this.f49119e;
        if (drawable3 != null) {
            drawable3.setAlpha(255);
        }
        Drawable drawable4 = this.f49130p;
        if (drawable4 != null) {
            drawable4.setAlpha(255);
        }
        setVisibility(0);
        invalidate();
    }

    public void startEndAnimation() {
        if (this.f49134t) {
            return;
        }
        this.f49134t = true;
        this.f49120f = 0.0f;
    }

    private void a(Canvas canvas, float f10) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f49134t) {
            float f11 = this.f49120f;
            float f12 = this.f49133s * 0.5f;
            int i10 = (int) ((1.0f - (f11 / f12)) * 255.0f);
            if (i10 < 0) {
                i10 = 0;
            }
            if (f11 > f12) {
                setVisible(false);
            }
            Drawable drawable3 = this.f49132r;
            if (drawable3 != null) {
                drawable3.setAlpha(i10);
            }
            Drawable drawable4 = this.f49119e;
            if (drawable4 != null) {
                drawable4.setAlpha(i10);
            }
            Drawable drawable5 = this.f49130p;
            if (drawable5 != null) {
                drawable5.setAlpha(i10);
            }
            canvas.save();
            canvas.translate(this.f49120f, 0.0f);
        }
        if (this.f49132r != null && this.f49130p != null) {
            Drawable drawable6 = this.f49132r;
            drawable6.setBounds(0, 0, (int) (this.f49131q.width() - (this.f49130p.getIntrinsicWidth() * 0.05f)), drawable6.getIntrinsicHeight());
            this.f49132r.draw(canvas);
        }
        if (this.f49134t && (drawable2 = this.f49119e) != null && this.f49130p != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f49119e;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.f49119e.draw(canvas);
            canvas.restore();
        }
        if (this.f49130p != null) {
            canvas.save();
            canvas.translate(this.f49131q.width() - getWidth(), 0.0f);
            this.f49130p.draw(canvas);
            canvas.restore();
        }
        if (!this.f49134t && Math.abs(this.f49116b - this.f49128n) < 1.0E-5f && (drawable = this.f49123i) != null) {
            int i11 = (int) (this.f49124j + (f10 * 0.2f * this.f49133s));
            this.f49124j = i11;
            if (i11 + drawable.getIntrinsicWidth() >= this.f49131q.width()) {
                this.f49124j = -this.f49123i.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f49124j, 0.0f);
            this.f49123i.draw(canvas);
            canvas.restore();
        }
        if (this.f49134t) {
            canvas.restore();
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49115a = new a();
        this.f49121g = 25L;
        this.f49122h = new Handler(Looper.getMainLooper());
        this.f49125k = false;
        this.f49128n = 0.95f;
        this.f49129o = false;
        this.f49131q = new Rect();
        a(context);
    }
}
