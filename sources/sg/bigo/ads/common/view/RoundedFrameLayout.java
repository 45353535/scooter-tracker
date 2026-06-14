package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes4.dex */
public class RoundedFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f102931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f102932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f102933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f102934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f102935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f102936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f102937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RectF f102938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f102939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f102940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Paint f102941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RectF f102942l;

    public RoundedFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    private void a() {
        if (this.f102940j > 0.0f) {
            setLayerType(1, null);
            setWillNotDraw(false);
            Paint paint = new Paint();
            this.f102941k = paint;
            paint.setShadowLayer(this.f102940j, 0.0f, 0.0f, this.f102939i);
        }
    }

    private Path getPath() {
        Path path = new Path();
        float f10 = this.f102931a;
        float f11 = this.f102932b;
        float f12 = this.f102934d;
        float f13 = this.f102933c;
        float[] fArr = {f10, f10, f11, f11, f12, f12, f13, f13};
        RectF rectF = this.f102942l;
        if (rectF == null) {
            rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        return path;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f102941k != null) {
            float f10 = this.f102940j;
            RectF rectF = new RectF(f10, f10, getWidth() - this.f102940j, getHeight() - this.f102940j);
            this.f102942l = rectF;
            float f11 = this.f102931a;
            canvas.drawRoundRect(rectF, f11, f11, this.f102941k);
        }
        canvas.clipPath(getPath());
        super.dispatchDraw(canvas);
        Paint paint = this.f102937g;
        float f12 = this.f102935e;
        RectF rectF2 = this.f102938h;
        if (paint != null && rectF2 != null && f12 > 0.0f) {
            float width = getWidth();
            float height = getHeight();
            if (width > 0.0f && height > 0.0f) {
                paint.setColor(this.f102936f);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(f12);
                paint.setAntiAlias(true);
                rectF2.set(0.0f, 0.0f, width, height);
                float f13 = this.f102931a;
                canvas.drawRoundRect(rectF2, f13, f13, paint);
            }
        }
        canvas.restoreToCount(iSave);
    }

    public float getCornerRadiusBottomLeft() {
        return this.f102933c;
    }

    public float getCornerRadiusBottomRight() {
        return this.f102934d;
    }

    public float getCornerRadiusTopLeft() {
        return this.f102931a;
    }

    public float getCornerRadiusTopRight() {
        return this.f102932b;
    }

    public void setCornerRadius(float f10) {
        a(f10, f10, f10, f10);
    }

    public void setShadowColor(@ColorInt int i10) {
        this.f102939i = i10;
        invalidate();
    }

    public void setShadowRadius(float f10) {
        boolean z10 = this.f102941k == null;
        this.f102940j = f10;
        if (z10) {
            a();
        }
        invalidate();
    }

    public void setStrokeColor(@ColorInt int i10) {
        this.f102936f = i10;
        if (this.f102937g == null) {
            this.f102937g = new Paint();
        }
        if (this.f102938h == null) {
            this.f102938h = new RectF();
        }
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f102935e = f10;
        if (this.f102937g == null) {
            this.f102937g = new Paint();
        }
        if (this.f102938h == null) {
            this.f102938h = new RectF();
        }
        invalidate();
    }

    public RoundedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        this.f102931a = f10;
        this.f102932b = f11;
        this.f102933c = f12;
        this.f102934d = f13;
        invalidate();
    }

    public RoundedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f102936f = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundedFrameLayout);
        try {
            float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_radius, 0.0f);
            this.f102931a = dimension;
            this.f102932b = dimension;
            this.f102933c = dimension;
            this.f102934d = dimension;
            if (dimension == 0.0f) {
                this.f102931a = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_topLeftRadius, 0.0f);
                this.f102932b = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_topRightRadius, 0.0f);
                this.f102933c = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_bottomLeftRadius, 0.0f);
                this.f102934d = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_bottomRightRadius, 0.0f);
            }
            this.f102939i = typedArrayObtainStyledAttributes.getColor(R.styleable.RoundedFrameLayout_bigo_ad_shadowColor, Color.parseColor("#00FFFFFF"));
            this.f102940j = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_shadowRadius, -1.0f);
            a();
            typedArrayObtainStyledAttributes.recycle();
        } catch (Exception unused) {
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
