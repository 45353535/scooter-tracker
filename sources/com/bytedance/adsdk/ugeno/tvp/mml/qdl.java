package com.bytedance.adsdk.ugeno.tvp.mml;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.mml;
import com.bytedance.adsdk.ugeno.qdl.jpc;
import com.bytedance.adsdk.ugeno.qdl.wd;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends ImageView implements IAnimation, wd {

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    static final /* synthetic */ boolean f16233ud = true;
    private mml aaj;
    private int bjy;
    private Shader.TileMode exc;
    private boolean exu;
    private boolean fs;
    private Shader.TileMode jl;
    private float jpc;
    private int jtx;
    private jpc jyq;
    private float lnr;
    private Drawable mo;
    private final float[] mzz;
    private boolean rdp;
    private Drawable rq;
    private boolean to;
    private ColorFilter tvp;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private ColorStateList f16234wd;
    private ImageView.ScaleType yt;
    public static final Shader.TileMode qdl = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] mml = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.tvp.mml.qdl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            qdl = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                qdl[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                qdl[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                qdl[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                qdl[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public qdl(Context context) {
        super(context);
        this.mzz = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f16234wd = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.jpc = 0.0f;
        this.tvp = null;
        this.to = false;
        this.fs = false;
        this.exu = false;
        this.rdp = false;
        Shader.TileMode tileMode = qdl;
        this.jl = tileMode;
        this.exc = tileMode;
        this.jyq = new jpc(this);
    }

    private void lnr() {
        qdl(this.rq, this.yt);
    }

    private void mml() {
        Drawable drawable = this.rq;
        if (drawable == null || !this.to) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.rq = drawableMutate;
        if (this.fs) {
            drawableMutate.setColorFilter(this.tvp);
        }
    }

    private Drawable qdl() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.bjy;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e10) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.bjy, e10);
                this.bjy = 0;
            }
        }
        return ud.qdl(drawable);
    }

    private Drawable ud() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.jtx;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e10) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.jtx, e10);
                this.jtx = 0;
            }
        }
        return ud.qdl(drawable);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        mml mmlVar = this.aaj;
        if (mmlVar != null) {
            mmlVar.ud(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.f16234wd.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f16234wd;
    }

    public float getBorderRadius() {
        return this.jyq.qdl();
    }

    public float getBorderWidth() {
        return this.jpc;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f10 : this.mzz) {
            fMax = Math.max(f10, fMax);
        }
        return fMax;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.qdl.wd
    public float getRipple() {
        return this.lnr;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getRubIn() {
        return this.jyq.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.yt;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getShine() {
        return this.jyq.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getStretch() {
        return this.jyq.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.jl;
    }

    public Shader.TileMode getTileModeY() {
        return this.exc;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mml mmlVar = this.aaj;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mml mmlVar = this.aaj;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mml mmlVar = this.aaj;
        if (mmlVar != null) {
            mmlVar.qdl(canvas, this);
            this.aaj.qdl(canvas);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mml mmlVar = this.aaj;
        if (mmlVar != null) {
            mmlVar.qdl(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        mml mmlVar = this.aaj;
        if (mmlVar == null) {
            super.onMeasure(i10, i11);
        } else {
            int[] iArrQdl = mmlVar.qdl(i10, i11);
            super.onMeasure(iArrQdl[0], iArrQdl[1]);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        mml mmlVar = this.aaj;
        if (mmlVar != null) {
            mmlVar.ud(i10, i11, i12, i12);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        ColorDrawable colorDrawable = new ColorDrawable(i10);
        this.mo = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.mo = drawable;
        qdl(true);
        super.setBackgroundDrawable(this.mo);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        if (this.jtx != i10) {
            this.jtx = i10;
            Drawable drawableUd = ud();
            this.mo = drawableUd;
            setBackgroundDrawable(drawableUd);
        }
    }

    public void setBorderColor(int i10) {
        setBorderColor(ColorStateList.valueOf(i10));
    }

    public void setBorderRadius(float f10) {
        jpc jpcVar = this.jyq;
        if (jpcVar != null) {
            jpcVar.qdl(f10);
        }
    }

    public void setBorderWidth(int i10) {
        setBorderWidth(getResources().getDimension(i10));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.tvp != colorFilter) {
            this.tvp = colorFilter;
            this.fs = true;
            this.to = true;
            mml();
            invalidate();
        }
    }

    public void setCornerRadius(float f10) {
        qdl(f10, f10, f10, f10);
    }

    public void setCornerRadiusDimen(int i10) {
        float dimension = getResources().getDimension(i10);
        qdl(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.bjy = 0;
        this.rq = ud.qdl(bitmap);
        lnr();
        super.setImageDrawable(this.rq);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.bjy = 0;
        this.rq = ud.qdl(drawable);
        lnr();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.bjy != i10) {
            this.bjy = i10;
            this.rq = qdl();
            lnr();
            super.setImageDrawable(this.rq);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z10) {
        this.exu = z10;
        lnr();
        qdl(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.lnr = f10;
        jpc jpcVar = this.jyq;
        if (jpcVar != null) {
            jpcVar.ud(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        jpc jpcVar = this.jyq;
        if (jpcVar != null) {
            jpcVar.mzz(f10);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!f16233ud && scaleType == null) {
            throw new AssertionError();
        }
        if (this.yt != scaleType) {
            this.yt = scaleType;
            int i10 = AnonymousClass1.qdl[scaleType.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            lnr();
            qdl(false);
            invalidate();
        }
    }

    public void setShine(float f10) {
        jpc jpcVar = this.jyq;
        if (jpcVar != null) {
            jpcVar.lnr(f10);
        }
    }

    public void setStretch(float f10) {
        jpc jpcVar = this.jyq;
        if (jpcVar != null) {
            jpcVar.mml(f10);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.jl == tileMode) {
            return;
        }
        this.jl = tileMode;
        lnr();
        qdl(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.exc == tileMode) {
            return;
        }
        this.exc = tileMode;
        lnr();
        qdl(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f16234wd.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        }
        this.f16234wd = colorStateList;
        lnr();
        qdl(false);
        if (this.jpc > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f10) {
        if (this.jpc == f10) {
            return;
        }
        this.jpc = f10;
        lnr();
        qdl(false);
        invalidate();
    }

    private void qdl(boolean z10) {
        if (this.rdp) {
            if (z10) {
                this.mo = ud.qdl(this.mo);
            }
            qdl(this.mo, ImageView.ScaleType.FIT_XY);
        }
    }

    private void qdl(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof ud) {
            ud udVar = (ud) drawable;
            udVar.qdl(scaleType).qdl(this.jpc).qdl(this.f16234wd).qdl(this.exu).qdl(this.jl).ud(this.exc);
            float[] fArr = this.mzz;
            if (fArr != null) {
                udVar.qdl(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            mml();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                qdl(layerDrawable.getDrawable(i10), scaleType);
            }
        }
    }

    public void qdl(float f10, float f11, float f12, float f13) {
        float[] fArr = this.mzz;
        if (fArr[0] == f10 && fArr[1] == f11 && fArr[2] == f13 && fArr[3] == f12) {
            return;
        }
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[3] = f12;
        fArr[2] = f13;
        lnr();
        qdl(false);
        invalidate();
    }

    public void qdl(mml mmlVar) {
        this.aaj = mmlVar;
    }
}
