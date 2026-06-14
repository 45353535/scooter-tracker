package ic;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.HashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends Drawable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f74188u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final ImageView.ScaleType f74189v = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f74190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f74191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f74192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f74193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f74194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f74195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f74196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f74197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f74198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Matrix f74199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RectF f74200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Shader.TileMode f74201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Shader.TileMode f74202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f74203n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f74204o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean[] f74205p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f74206q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f74207r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ColorStateList f74208s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageView.ScaleType f74209t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74210a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f74210a = iArr;
        }
    }

    public b0(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f74190a = bitmap;
        this.f74191b = new RectF();
        this.f74192c = new RectF();
        int width = bitmap.getWidth();
        this.f74193d = width;
        int height = bitmap.getHeight();
        this.f74194e = height;
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, width, height);
        this.f74195f = rectF;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f74196g = paint;
        this.f74197h = new RectF();
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f74198i = paint2;
        this.f74199j = new Matrix();
        this.f74200k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f74201l = tileMode;
        this.f74202m = tileMode;
        this.f74203n = true;
        this.f74205p = new boolean[]{true, true, true, true};
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(DEFAULT_BORDER_COLOR)");
        this.f74208s = colorStateListValueOf;
        this.f74209t = f74189v;
        paint2.setColor(colorStateListValueOf.getColorForState(getState(), 0));
        paint2.setStrokeWidth(this.f74207r);
    }

    private final void f() {
        float fWidth;
        float fWidth2;
        switch (b.f74210a[this.f74209t.ordinal()]) {
            case 1:
                this.f74197h.set(this.f74191b);
                RectF rectF = this.f74197h;
                float f10 = this.f74207r / 2;
                rectF.inset(f10, f10);
                this.f74199j.reset();
                this.f74199j.setTranslate(((this.f74197h.width() - this.f74193d) * 0.5f) + 0.5f, ((this.f74197h.height() - this.f74194e) * 0.5f) + 0.5f);
                break;
            case 2:
                this.f74197h.set(this.f74191b);
                RectF rectF2 = this.f74197h;
                float f11 = 2;
                float f12 = this.f74207r / f11;
                rectF2.inset(f12, f12);
                this.f74199j.reset();
                float fHeight = 0.0f;
                if (this.f74193d * this.f74197h.height() > this.f74197h.width() * this.f74194e) {
                    fWidth = this.f74197h.height() / this.f74194e;
                    fWidth2 = (this.f74197h.width() - (this.f74193d * fWidth)) * 0.5f;
                } else {
                    fWidth = this.f74197h.width() / this.f74193d;
                    fWidth2 = 0.0f;
                    fHeight = (this.f74197h.height() - (this.f74194e * fWidth)) * 0.5f;
                }
                this.f74199j.setScale(fWidth, fWidth);
                Matrix matrix = this.f74199j;
                float f13 = this.f74207r / f11;
                matrix.postTranslate(((int) (fWidth2 + 0.5f)) + f13, ((int) (fHeight + 0.5f)) + f13);
                break;
            case 3:
                this.f74199j.reset();
                float fMin = (((float) this.f74193d) > this.f74191b.width() || ((float) this.f74194e) > this.f74191b.height()) ? Math.min(this.f74191b.width() / this.f74193d, this.f74191b.height() / this.f74194e) : 1.0f;
                float fWidth3 = ((this.f74191b.width() - (this.f74193d * fMin)) * 0.5f) + 0.5f;
                float fHeight2 = ((this.f74191b.height() - (this.f74194e * fMin)) * 0.5f) + 0.5f;
                this.f74199j.setScale(fMin, fMin);
                this.f74199j.postTranslate(fWidth3, fHeight2);
                this.f74197h.set(this.f74195f);
                this.f74199j.mapRect(this.f74197h);
                RectF rectF3 = this.f74197h;
                float f14 = this.f74207r / 2;
                rectF3.inset(f14, f14);
                this.f74199j.setRectToRect(this.f74195f, this.f74197h, Matrix.ScaleToFit.FILL);
                break;
            case 4:
                this.f74197h.set(this.f74195f);
                this.f74199j.setRectToRect(this.f74195f, this.f74191b, Matrix.ScaleToFit.CENTER);
                this.f74199j.mapRect(this.f74197h);
                RectF rectF4 = this.f74197h;
                float f15 = this.f74207r / 2;
                rectF4.inset(f15, f15);
                this.f74199j.setRectToRect(this.f74195f, this.f74197h, Matrix.ScaleToFit.FILL);
                break;
            case 5:
                this.f74197h.set(this.f74195f);
                this.f74199j.setRectToRect(this.f74195f, this.f74191b, Matrix.ScaleToFit.END);
                this.f74199j.mapRect(this.f74197h);
                RectF rectF5 = this.f74197h;
                float f16 = this.f74207r / 2;
                rectF5.inset(f16, f16);
                this.f74199j.setRectToRect(this.f74195f, this.f74197h, Matrix.ScaleToFit.FILL);
                break;
            case 6:
                this.f74197h.set(this.f74195f);
                this.f74199j.setRectToRect(this.f74195f, this.f74191b, Matrix.ScaleToFit.START);
                this.f74199j.mapRect(this.f74197h);
                RectF rectF6 = this.f74197h;
                float f17 = this.f74207r / 2;
                rectF6.inset(f17, f17);
                this.f74199j.setRectToRect(this.f74195f, this.f74197h, Matrix.ScaleToFit.FILL);
                break;
            case 7:
                this.f74197h.set(this.f74191b);
                RectF rectF7 = this.f74197h;
                float f18 = this.f74207r / 2;
                rectF7.inset(f18, f18);
                this.f74199j.reset();
                this.f74199j.setRectToRect(this.f74195f, this.f74197h, Matrix.ScaleToFit.FILL);
                break;
            default:
                this.f74197h.set(this.f74195f);
                this.f74199j.setRectToRect(this.f74195f, this.f74191b, Matrix.ScaleToFit.CENTER);
                this.f74199j.mapRect(this.f74197h);
                RectF rectF8 = this.f74197h;
                float f19 = this.f74207r / 2;
                rectF8.inset(f19, f19);
                this.f74199j.setRectToRect(this.f74195f, this.f74197h, Matrix.ScaleToFit.FILL);
                break;
        }
        this.f74192c.set(this.f74197h);
        this.f74203n = true;
    }

    private final void g(Canvas canvas) {
        if (h(this.f74205p) || this.f74204o == 0.0f) {
            return;
        }
        RectF rectF = this.f74192c;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.width() + f10;
        float fHeight = this.f74192c.height() + f11;
        float f12 = this.f74204o;
        if (!this.f74205p[0]) {
            this.f74200k.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.f74200k, this.f74196g);
        }
        if (!this.f74205p[1]) {
            this.f74200k.set(fWidth - f12, f11, fWidth, f12);
            canvas.drawRect(this.f74200k, this.f74196g);
        }
        if (!this.f74205p[2]) {
            this.f74200k.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
            canvas.drawRect(this.f74200k, this.f74196g);
        }
        if (this.f74205p[3]) {
            return;
        }
        this.f74200k.set(f10, fHeight - f12, f12 + f10, fHeight);
        canvas.drawRect(this.f74200k, this.f74196g);
    }

    private final boolean h(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return false;
            }
        }
        return true;
    }

    private final void j(Canvas canvas) {
        float f10;
        float f11;
        if (h(this.f74205p) || this.f74204o == 0.0f) {
            return;
        }
        RectF rectF = this.f74192c;
        float f12 = rectF.left;
        float f13 = rectF.top;
        float fWidth = rectF.width() + f12;
        float fHeight = f13 + this.f74192c.height();
        float f14 = this.f74204o;
        float f15 = this.f74207r / 2;
        if (this.f74205p[0]) {
            f10 = f13;
        } else {
            f10 = f13;
            canvas.drawLine(f12 - f15, f13, f12 + f14, f10, this.f74198i);
            canvas.drawLine(f12, f10 - f15, f12, f10 + f14, this.f74198i);
        }
        if (!this.f74205p[1]) {
            float f16 = f10;
            canvas.drawLine((fWidth - f14) - f15, f16, fWidth, f10, this.f74198i);
            canvas.drawLine(fWidth, f16 - f15, fWidth, f16 + f14, this.f74198i);
            fWidth = fWidth;
        }
        if (this.f74205p[2]) {
            f11 = fHeight;
        } else {
            canvas.drawLine((fWidth - f14) - f15, fHeight, fWidth + f15, fHeight, this.f74198i);
            canvas.drawLine(fWidth, fHeight - f14, fWidth, fHeight, this.f74198i);
            f11 = fHeight;
        }
        if (this.f74205p[3]) {
            return;
        }
        canvas.drawLine(f12 - f15, f11, f12 + f14, f11, this.f74198i);
        canvas.drawLine(f12, f11 - f14, f12, f11, this.f74198i);
    }

    private final boolean k(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final b0 a(float f10) {
        this.f74207r = f10;
        this.f74198i.setStrokeWidth(f10);
        return this;
    }

    public final b0 b(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (hashSet.isEmpty()) {
                this.f74204o = 0.0f;
            } else {
                float fFloatValue = ((Number) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= 0.0f) {
                    this.f74204o = fFloatValue;
                }
            }
            boolean[] zArr = this.f74205p;
            zArr[0] = f10 > 0.0f;
            zArr[1] = f11 > 0.0f;
            zArr[2] = f12 > 0.0f;
            zArr[3] = f13 > 0.0f;
            return this;
        }
        return this;
    }

    public final b0 c(int i10) {
        return d(ColorStateList.valueOf(i10));
    }

    public final b0 d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(colorStateList, "valueOf(0)");
        }
        this.f74208s = colorStateList;
        this.f74198i.setColor(colorStateList.getColorForState(getState(), 0));
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f74203n) {
            BitmapShader bitmapShader = new BitmapShader(this.f74190a, this.f74201l, this.f74202m);
            Shader.TileMode tileMode = this.f74201l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f74202m == tileMode2) {
                bitmapShader.setLocalMatrix(this.f74199j);
            }
            this.f74196g.setShader(bitmapShader);
            this.f74203n = false;
        }
        if (this.f74206q) {
            if (this.f74207r <= 0.0f) {
                canvas.drawOval(this.f74192c, this.f74196g);
                return;
            } else {
                canvas.drawOval(this.f74192c, this.f74196g);
                canvas.drawOval(this.f74197h, this.f74198i);
                return;
            }
        }
        if (!k(this.f74205p)) {
            canvas.drawRect(this.f74192c, this.f74196g);
            if (this.f74207r > 0.0f) {
                canvas.drawRect(this.f74197h, this.f74198i);
                return;
            }
            return;
        }
        float f10 = this.f74204o;
        if (this.f74207r <= 0.0f) {
            canvas.drawRoundRect(this.f74192c, f10, f10, this.f74196g);
            g(canvas);
        } else {
            canvas.drawRoundRect(this.f74192c, f10, f10, this.f74196g);
            canvas.drawRoundRect(this.f74197h, f10, f10, this.f74198i);
            g(canvas);
            j(canvas);
        }
    }

    public final b0 e(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = f74189v;
        }
        if (this.f74209t != scaleType) {
            this.f74209t = scaleType;
            f();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f74196g.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f74196g.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f74194e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f74193d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final b0 i(float f10) {
        b(f10, f10, f10, f10);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f74208s.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f74191b.set(bounds);
        f();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int colorForState = this.f74208s.getColorForState(state, 0);
        if (this.f74198i.getColor() == colorForState) {
            return super.onStateChange(state);
        }
        this.f74198i.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f74196g.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f74196g.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f74196g.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f74196g.setFilterBitmap(z10);
        invalidateSelf();
    }
}
