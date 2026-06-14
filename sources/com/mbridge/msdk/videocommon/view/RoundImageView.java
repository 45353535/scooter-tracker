package com.mbridge.msdk.videocommon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.widget.MBImageView;

/* JADX INFO: loaded from: classes10.dex */
public class RoundImageView extends MBImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f53320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f53321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Matrix f53322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BitmapShader f53323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f53324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RectF f53325j;

    public RoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f53322g = new Matrix();
        Paint paint = new Paint();
        this.f53320e = paint;
        paint.setAntiAlias(true);
        this.f53319d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f53318c = 1;
    }

    private Bitmap a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            q0.b("View", th2.getMessage());
            return null;
        }
    }

    private void b() {
        Bitmap bitmapA;
        try {
            Drawable drawable = getDrawable();
            if (drawable == null || (bitmapA = a(drawable)) == null || bitmapA.isRecycled()) {
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f53323h = new BitmapShader(bitmapA, tileMode, tileMode);
            int i10 = this.f53318c;
            float fMax = 1.0f;
            if (i10 == 0) {
                fMax = (this.f53324i * 1.0f) / Math.min(bitmapA.getWidth(), bitmapA.getHeight());
            } else if (i10 == 1) {
                fMax = Math.max((getWidth() * 1.0f) / bitmapA.getWidth(), (getHeight() * 1.0f) / bitmapA.getHeight());
            }
            this.f53322g.setScale(fMax, fMax);
            this.f53323h.setLocalMatrix(this.f53322g);
            this.f53320e.setShader(this.f53323h);
        } catch (Throwable th2) {
            q0.b("RoundImageView", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            if (getDrawable() == null) {
                return;
            }
            b();
            if (this.f53318c != 1) {
                float f10 = this.f53321f;
                canvas.drawCircle(f10, f10, f10, this.f53320e);
            } else {
                RectF rectF = this.f53325j;
                float f11 = this.f53319d;
                canvas.drawRoundRect(rectF, f11, f11, this.f53320e);
            }
        } catch (Throwable th2) {
            q0.b("RoundImageView", th2.getMessage());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f53318c == 0) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f53324i = iMin;
            this.f53321f = iMin / 2;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
        this.f53318c = bundle.getInt("state_type");
        this.f53319d = bundle.getInt("state_border_radius");
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f53318c);
        bundle.putInt("state_border_radius", this.f53319d);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f53318c == 1) {
            this.f53325j = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i10) {
        int iA = v0.a(getContext(), i10);
        if (this.f53319d != iA) {
            this.f53319d = iA;
            invalidate();
        }
    }

    public void setType(int i10) {
        if (this.f53318c != i10) {
            this.f53318c = i10;
            if (i10 != 1 && i10 != 0) {
                this.f53318c = 0;
            }
            requestLayout();
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53322g = new Matrix();
        Paint paint = new Paint();
        this.f53320e = paint;
        paint.setAntiAlias(true);
        this.f53319d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f53318c = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        this.f53322g = new Matrix();
        Paint paint = new Paint();
        this.f53320e = paint;
        paint.setAntiAlias(true);
        this.f53319d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f53318c = 1;
    }
}
