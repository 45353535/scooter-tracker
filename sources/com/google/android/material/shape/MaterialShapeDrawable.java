package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.collection.ScatterMapKt;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.math.MathUtils;
import com.google.android.material.shadow.ShadowRenderer;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.ShapePath;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable, Shapeable {
    private static final String G = "MaterialShapeDrawable";
    static final ShapeAppearanceModel H = ShapeAppearanceModel.builder().setAllCorners(0, 0.0f).build();
    private static final Paint I;
    private static final SpringAnimatedCornerSizeProperty[] J;
    public static final int SHADOW_COMPAT_MODE_ALWAYS = 2;
    public static final int SHADOW_COMPAT_MODE_DEFAULT = 0;
    public static final int SHADOW_COMPAT_MODE_NEVER = 1;
    private ShapeAppearanceModel A;
    private SpringForce B;
    SpringAnimation[] C;
    private float[] D;
    private float[] E;
    private OnCornerSizeChangeListener F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ShapeAppearanceModel.CornerSizeUnaryOperator f27471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MaterialShapeDrawableState f27472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ShapePath.ShadowCompatOperation[] f27473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ShapePath.ShadowCompatOperation[] f27474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BitSet f27475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Matrix f27478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f27479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f27480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final RectF f27481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final RectF f27482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Region f27483n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Region f27484o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Paint f27485p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Paint f27486q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ShadowRenderer f27487r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ShapeAppearancePathProvider.PathListener f27488s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ShapeAppearancePathProvider f27489t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuffColorFilter f27490u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private PorterDuffColorFilter f27491v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f27492w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final RectF f27493x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f27494y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f27495z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OnCornerSizeChangeListener {
        void onCornerSizeChange(float f10);
    }

    private static class SpringAnimatedCornerSizeProperty extends FloatPropertyCompat<MaterialShapeDrawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27521a;

        SpringAnimatedCornerSizeProperty(int i10) {
            super("cornerSizeAtIndex" + i10);
            this.f27521a = i10;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(@NonNull MaterialShapeDrawable materialShapeDrawable) {
            if (materialShapeDrawable.D != null) {
                return materialShapeDrawable.D[this.f27521a];
            }
            return 0.0f;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(@NonNull MaterialShapeDrawable materialShapeDrawable, float f10) {
            if (materialShapeDrawable.D == null || materialShapeDrawable.D[this.f27521a] == f10) {
                return;
            }
            materialShapeDrawable.D[this.f27521a] = f10;
            if (materialShapeDrawable.F != null) {
                materialShapeDrawable.F.onCornerSizeChange(materialShapeDrawable.getCornerSizeDiffX());
            }
            materialShapeDrawable.invalidateSelf();
        }
    }

    static {
        int i10 = 0;
        Paint paint = new Paint(1);
        I = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        J = new SpringAnimatedCornerSizeProperty[4];
        while (true) {
            SpringAnimatedCornerSizeProperty[] springAnimatedCornerSizePropertyArr = J;
            if (i10 >= springAnimatedCornerSizePropertyArr.length) {
                return;
            }
            springAnimatedCornerSizePropertyArr[i10] = new SpringAnimatedCornerSizeProperty(i10);
            i10++;
        }
    }

    public MaterialShapeDrawable() {
        this(new ShapeAppearanceModel());
    }

    private boolean A() {
        Paint.Style style = this.f27472c.f27520w;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f27486q.getStrokeWidth() > 0.0f;
    }

    private void B() {
        super.invalidateSelf();
    }

    private void C(Canvas canvas) {
        if (y()) {
            canvas.save();
            E(canvas);
            if (!this.f27494y) {
                q(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f27493x.width() - getBounds().width());
            int iHeight = (int) (this.f27493x.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f27493x.width()) + (this.f27472c.f27516s * 2) + iWidth, ((int) this.f27493x.height()) + (this.f27472c.f27516s * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f27472c.f27516s) - iWidth;
            float f11 = (getBounds().top - this.f27472c.f27516s) - iHeight;
            canvas2.translate(-f10, -f11);
            q(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int D(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void E(Canvas canvas) {
        canvas.translate(getShadowOffsetX(), getShadowOffsetY());
    }

    private boolean F(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f27472c.f27502e == null || color2 == (colorForState2 = this.f27472c.f27502e.getColorForState(iArr, (color2 = this.f27485p.getColor())))) {
            z10 = false;
        } else {
            this.f27485p.setColor(colorForState2);
            z10 = true;
        }
        if (this.f27472c.f27503f == null || color == (colorForState = this.f27472c.f27503f.getColorForState(iArr, (color = this.f27486q.getColor())))) {
            return z10;
        }
        this.f27486q.setColor(colorForState);
        return true;
    }

    private void G(int[] iArr) {
        H(iArr, false);
    }

    private void H(int[] iArr, boolean z10) {
        RectF rectFV = v();
        if (this.f27472c.f27499b == null || rectFV.isEmpty()) {
            return;
        }
        boolean z11 = z10 | (this.B == null);
        if (this.D == null) {
            this.D = new float[4];
        }
        ShapeAppearanceModel shapeAppearanceModelB = this.f27472c.f27499b.b(iArr);
        for (int i10 = 0; i10 < 4; i10++) {
            float cornerSize = this.f27489t.e(i10, shapeAppearanceModelB).getCornerSize(rectFV);
            if (z11) {
                this.D[i10] = cornerSize;
            }
            SpringAnimation springAnimation = this.C[i10];
            if (springAnimation != null) {
                springAnimation.animateToFinalPosition(cornerSize);
                if (z11) {
                    this.C[i10].skipToEnd();
                }
            }
        }
        if (z11) {
            invalidateSelf();
        }
    }

    private void I() {
        this.A = getShapeAppearanceModel().withTransformedCornerSizes(this.f27471b);
        float[] fArr = this.D;
        if (fArr == null) {
            this.E = null;
            return;
        }
        if (this.E == null) {
            this.E = new float[fArr.length];
        }
        float fX = x();
        int i10 = 0;
        while (true) {
            float[] fArr2 = this.D;
            if (i10 >= fArr2.length) {
                return;
            }
            this.E[i10] = Math.max(0.0f, fArr2[i10] - fX);
            i10++;
        }
    }

    private boolean J() {
        PorterDuffColorFilter porterDuffColorFilter = this.f27490u;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f27491v;
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        this.f27490u = o(materialShapeDrawableState.f27505h, materialShapeDrawableState.f27506i, this.f27485p, true);
        MaterialShapeDrawableState materialShapeDrawableState2 = this.f27472c;
        this.f27491v = o(materialShapeDrawableState2.f27504g, materialShapeDrawableState2.f27506i, this.f27486q, false);
        MaterialShapeDrawableState materialShapeDrawableState3 = this.f27472c;
        if (materialShapeDrawableState3.f27519v) {
            this.f27487r.setShadowColor(materialShapeDrawableState3.f27505h.getColorForState(getState(), 0));
        }
        return (ObjectsCompat.equals(porterDuffColorFilter, this.f27490u) && ObjectsCompat.equals(porterDuffColorFilter2, this.f27491v)) ? false : true;
    }

    private void K() {
        float z10 = getZ();
        this.f27472c.f27516s = (int) Math.ceil(0.75f * z10);
        this.f27472c.f27517t = (int) Math.ceil(z10 * 0.25f);
        J();
        B();
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(Context context) {
        return createWithElevationOverlay(context, 0.0f);
    }

    private PorterDuffColorFilter i(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iP = p(color);
        this.f27492w = iP;
        if (iP != color) {
            return new PorterDuffColorFilter(iP, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void j(RectF rectF, Path path) {
        k(rectF, path);
        if (this.f27472c.f27508k != 1.0f) {
            this.f27478i.reset();
            Matrix matrix = this.f27478i;
            float f10 = this.f27472c.f27508k;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f27478i);
        }
        path.computeBounds(this.f27493x, true);
    }

    private float l(RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float[] fArr) {
        if (fArr == null) {
            if (shapeAppearanceModel.isRoundRect(rectF)) {
                return shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF);
            }
            return -1.0f;
        }
        if (MathUtils.areAllElementsEqual(fArr) && shapeAppearanceModel.hasRoundedCorners()) {
            return fArr[0];
        }
        return -1.0f;
    }

    private void m() {
        I();
        this.f27489t.calculatePath(this.A, this.E, this.f27472c.f27509l, w(), null, this.f27480k);
    }

    private PorterDuffColorFilter n(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = p(colorForState);
        }
        this.f27492w = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter o(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? i(paint, z10) : n(colorStateList, mode, z10);
    }

    private void q(Canvas canvas) {
        if (this.f27475f.cardinality() > 0) {
            Log.w(G, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f27472c.f27517t != 0) {
            canvas.drawPath(this.f27479j, this.f27487r.getShadowPaint());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f27473d[i10].draw(this.f27487r, this.f27472c.f27516s, canvas);
            this.f27474e[i10].draw(this.f27487r, this.f27472c.f27516s, canvas);
        }
        if (this.f27494y) {
            int shadowOffsetX = getShadowOffsetX();
            int shadowOffsetY = getShadowOffsetY();
            canvas.translate(-shadowOffsetX, -shadowOffsetY);
            canvas.drawPath(this.f27479j, I);
            canvas.translate(shadowOffsetX, shadowOffsetY);
        }
    }

    private void r(Canvas canvas) {
        t(canvas, this.f27485p, this.f27479j, this.f27472c.f27498a, this.D, v());
    }

    private void t(Canvas canvas, Paint paint, Path path, ShapeAppearanceModel shapeAppearanceModel, float[] fArr, RectF rectF) {
        float fL = l(rectF, shapeAppearanceModel, fArr);
        if (fL < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f10 = fL * this.f27472c.f27509l;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    private RectF w() {
        this.f27482m.set(v());
        float fX = x();
        this.f27482m.inset(fX, fX);
        return this.f27482m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float x() {
        if (A()) {
            return this.f27486q.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean y() {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        int i10 = materialShapeDrawableState.f27515r;
        if (i10 == 1 || materialShapeDrawableState.f27516s <= 0) {
            return false;
        }
        return i10 == 2 || requiresCompatShadow();
    }

    private boolean z() {
        Paint.Style style = this.f27472c.f27520w;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f27485p.setColorFilter(this.f27490u);
        int alpha = this.f27485p.getAlpha();
        this.f27485p.setAlpha(D(alpha, this.f27472c.f27511n));
        this.f27486q.setColorFilter(this.f27491v);
        this.f27486q.setStrokeWidth(this.f27472c.f27510m);
        int alpha2 = this.f27486q.getAlpha();
        this.f27486q.setAlpha(D(alpha2, this.f27472c.f27511n));
        if (z()) {
            if (this.f27476g) {
                j(v(), this.f27479j);
                this.f27476g = false;
            }
            C(canvas);
            r(canvas);
        }
        if (A()) {
            if (this.f27477h) {
                m();
                this.f27477h = false;
            }
            u(canvas);
        }
        this.f27485p.setAlpha(alpha);
        this.f27486q.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f27472c.f27511n;
    }

    public float getBottomLeftCornerResolvedSize() {
        float[] fArr = this.D;
        return fArr != null ? fArr[2] : this.f27472c.f27498a.getBottomLeftCornerSize().getCornerSize(v());
    }

    public float getBottomRightCornerResolvedSize() {
        float[] fArr = this.D;
        return fArr != null ? fArr[1] : this.f27472c.f27498a.getBottomRightCornerSize().getCornerSize(v());
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f27472c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getCornerSizeDiffX() {
        float cornerSize;
        float cornerSize2;
        float[] fArr = this.D;
        if (fArr != null) {
            cornerSize = (fArr[3] + fArr[2]) - fArr[1];
            cornerSize2 = fArr[0];
        } else {
            RectF rectFV = v();
            cornerSize = (this.f27489t.e(3, getShapeAppearanceModel()).getCornerSize(rectFV) + this.f27489t.e(2, getShapeAppearanceModel()).getCornerSize(rectFV)) - this.f27489t.e(1, getShapeAppearanceModel()).getCornerSize(rectFV);
            cornerSize2 = this.f27489t.e(0, getShapeAppearanceModel()).getCornerSize(rectFV);
        }
        return (cornerSize - cornerSize2) / 2.0f;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SpringForce getCornerSpringForce() {
        return this.B;
    }

    public float getElevation() {
        return this.f27472c.f27513p;
    }

    @Nullable
    public ColorStateList getFillColor() {
        return this.f27472c.f27502e;
    }

    public float getInterpolation() {
        return this.f27472c.f27509l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        if (this.f27472c.f27515r == 2) {
            return;
        }
        RectF rectFV = v();
        if (rectFV.isEmpty()) {
            return;
        }
        float fL = l(rectFV, this.f27472c.f27498a, this.D);
        if (fL >= 0.0f) {
            outline.setRoundRect(getBounds(), fL * this.f27472c.f27509l);
            return;
        }
        if (this.f27476g) {
            j(rectFV, this.f27479j);
            this.f27476g = false;
        }
        DrawableUtils.setOutlineToPath(outline, this.f27479j);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f27472c.f27507j;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Paint.Style getPaintStyle() {
        return this.f27472c.f27520w;
    }

    public float getParentAbsoluteElevation() {
        return this.f27472c.f27512o;
    }

    @Deprecated
    public void getPathForSize(int i10, int i11, @NonNull Path path) {
        k(new RectF(0.0f, 0.0f, i10, i11), path);
    }

    @ColorInt
    public int getResolvedTintColor() {
        return this.f27492w;
    }

    public float getScale() {
        return this.f27472c.f27508k;
    }

    public int getShadowCompatRotation() {
        return this.f27472c.f27518u;
    }

    public int getShadowCompatibilityMode() {
        return this.f27472c.f27515r;
    }

    @Deprecated
    public int getShadowElevation() {
        return (int) getElevation();
    }

    public int getShadowOffsetX() {
        return (int) (((double) this.f27472c.f27517t) * Math.sin(Math.toRadians(r0.f27518u)));
    }

    public int getShadowOffsetY() {
        return (int) (((double) this.f27472c.f27517t) * Math.cos(Math.toRadians(r0.f27518u)));
    }

    public int getShadowRadius() {
        return this.f27472c.f27516s;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getShadowVerticalOffset() {
        return this.f27472c.f27517t;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f27472c.f27498a;
    }

    @Nullable
    @Deprecated
    public ShapePathModel getShapedViewModel() {
        ShapeAppearanceModel shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof ShapePathModel) {
            return (ShapePathModel) shapeAppearanceModel;
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListShapeAppearanceModel getStateListShapeAppearanceModel() {
        return this.f27472c.f27499b;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.f27472c.f27503f;
    }

    @Nullable
    public ColorStateList getStrokeTintList() {
        return this.f27472c.f27504g;
    }

    public float getStrokeWidth() {
        return this.f27472c.f27510m;
    }

    @Nullable
    public ColorStateList getTintList() {
        return this.f27472c.f27505h;
    }

    public float getTopLeftCornerResolvedSize() {
        float[] fArr = this.D;
        return fArr != null ? fArr[3] : this.f27472c.f27498a.getTopLeftCornerSize().getCornerSize(v());
    }

    public float getTopRightCornerResolvedSize() {
        float[] fArr = this.D;
        return fArr != null ? fArr[0] : this.f27472c.f27498a.getTopRightCornerSize().getCornerSize(v());
    }

    public float getTranslationZ() {
        return this.f27472c.f27514q;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f27483n.set(getBounds());
        j(v(), this.f27479j);
        this.f27484o.setPath(this.f27479j, this.f27483n);
        this.f27483n.op(this.f27484o, Region.Op.DIFFERENCE);
        return this.f27483n;
    }

    public float getZ() {
        return getElevation() + getTranslationZ();
    }

    public void initializeElevationOverlay(Context context) {
        this.f27472c.f27500c = new ElevationOverlayProvider(context);
        K();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f27476g = true;
        this.f27477h = true;
        super.invalidateSelf();
    }

    public boolean isElevationOverlayEnabled() {
        ElevationOverlayProvider elevationOverlayProvider = this.f27472c.f27500c;
        return elevationOverlayProvider != null && elevationOverlayProvider.isThemeElevationOverlayEnabled();
    }

    public boolean isElevationOverlayInitialized() {
        return this.f27472c.f27500c != null;
    }

    public boolean isPointInTransparentRegion(int i10, int i11) {
        return getTransparentRegion().contains(i10, i11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRoundRect() {
        if (this.f27472c.f27498a.isRoundRect(v())) {
            return true;
        }
        float[] fArr = this.D;
        return fArr != null && MathUtils.areAllElementsEqual(fArr) && this.f27472c.f27498a.hasRoundedCorners();
    }

    @Deprecated
    public boolean isShadowEnabled() {
        int i10 = this.f27472c.f27515r;
        return i10 == 0 || i10 == 2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f27472c.f27505h;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f27472c.f27504g;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f27472c.f27503f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f27472c.f27502e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.f27472c.f27499b;
        return stateListShapeAppearanceModel != null && stateListShapeAppearanceModel.isStateful();
    }

    protected final void k(RectF rectF, Path path) {
        ShapeAppearancePathProvider shapeAppearancePathProvider = this.f27489t;
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        shapeAppearancePathProvider.calculatePath(materialShapeDrawableState.f27498a, this.D, materialShapeDrawableState.f27509l, rectF, this.f27488s, path);
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f27472c = new MaterialShapeDrawableState(this.f27472c);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f27476g = true;
        this.f27477h = true;
        super.onBoundsChange(rect);
        if (this.f27472c.f27499b != null && !rect.isEmpty()) {
            H(getState(), this.f27495z);
        }
        this.f27495z = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    protected boolean onStateChange(int[] iArr) {
        if (this.f27472c.f27499b != null) {
            G(iArr);
        }
        boolean z10 = F(iArr) || J();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    protected int p(int i10) {
        float z10 = getZ() + getParentAbsoluteElevation();
        ElevationOverlayProvider elevationOverlayProvider = this.f27472c.f27500c;
        return elevationOverlayProvider != null ? elevationOverlayProvider.compositeOverlayIfNeeded(i10, z10) : i10;
    }

    public boolean requiresCompatShadow() {
        return (isRoundRect() || this.f27479j.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    protected void s(Canvas canvas, Paint paint, Path path, RectF rectF) {
        t(canvas, paint, path, this.f27472c.f27498a, this.D, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i10) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        if (materialShapeDrawableState.f27511n != i10) {
            materialShapeDrawableState.f27511n = i10;
            B();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f27472c.f27501d = colorFilter;
        B();
    }

    public void setCornerSize(float f10) {
        setShapeAppearanceModel(this.f27472c.f27498a.withCornerSize(f10));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setCornerSpringForce(@NonNull SpringForce springForce) {
        if (this.B == springForce) {
            return;
        }
        this.B = springForce;
        int i10 = 0;
        while (true) {
            SpringAnimation[] springAnimationArr = this.C;
            if (i10 >= springAnimationArr.length) {
                H(getState(), true);
                invalidateSelf();
                return;
            } else {
                if (springAnimationArr[i10] == null) {
                    springAnimationArr[i10] = new SpringAnimation(this, J[i10]);
                }
                this.C[i10].setSpring(new SpringForce().setDampingRatio(springForce.getDampingRatio()).setStiffness(springForce.getStiffness()));
                i10++;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setEdgeIntersectionCheckEnable(boolean z10) {
        this.f27489t.k(z10);
    }

    public void setElevation(float f10) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        if (materialShapeDrawableState.f27513p != f10) {
            materialShapeDrawableState.f27513p = f10;
            K();
        }
    }

    public void setFillColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        if (materialShapeDrawableState.f27502e != colorStateList) {
            materialShapeDrawableState.f27502e = colorStateList;
            onStateChange(getState());
        }
    }

    public void setInterpolation(float f10) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        if (materialShapeDrawableState.f27509l != f10) {
            materialShapeDrawableState.f27509l = f10;
            this.f27476g = true;
            this.f27477h = true;
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setOnCornerSizeChangeListener(@Nullable OnCornerSizeChangeListener onCornerSizeChangeListener) {
        this.F = onCornerSizeChangeListener;
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        if (materialShapeDrawableState.f27507j == null) {
            materialShapeDrawableState.f27507j = new Rect();
        }
        this.f27472c.f27507j.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void setPaintStyle(Paint.Style style) {
        this.f27472c.f27520w = style;
        B();
    }

    public void setParentAbsoluteElevation(float f10) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        if (materialShapeDrawableState.f27512o != f10) {
            materialShapeDrawableState.f27512o = f10;
            K();
        }
    }

    public void setScale(float f10) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        if (materialShapeDrawableState.f27508k != f10) {
            materialShapeDrawableState.f27508k = f10;
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowBitmapDrawingEnable(boolean z10) {
        this.f27494y = z10;
    }

    public void setShadowColor(int i10) {
        this.f27487r.setShadowColor(i10);
        this.f27472c.f27519v = false;
        B();
    }

    public void setShadowCompatRotation(int i10) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        if (materialShapeDrawableState.f27518u != i10) {
            materialShapeDrawableState.f27518u = i10;
            B();
        }
    }

    public void setShadowCompatibilityMode(int i10) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        if (materialShapeDrawableState.f27515r != i10) {
            materialShapeDrawableState.f27515r = i10;
            B();
        }
    }

    @Deprecated
    public void setShadowElevation(int i10) {
        setElevation(i10);
    }

    @Deprecated
    public void setShadowEnabled(boolean z10) {
        setShadowCompatibilityMode(!z10 ? 1 : 0);
    }

    @Deprecated
    public void setShadowRadius(int i10) {
        this.f27472c.f27516s = i10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowVerticalOffset(int i10) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        if (materialShapeDrawableState.f27517t != i10) {
            materialShapeDrawableState.f27517t = i10;
            B();
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        materialShapeDrawableState.f27498a = shapeAppearanceModel;
        materialShapeDrawableState.f27499b = null;
        this.D = null;
        this.E = null;
        invalidateSelf();
    }

    @Deprecated
    public void setShapedViewModel(@NonNull ShapePathModel shapePathModel) {
        setShapeAppearanceModel(shapePathModel);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStateListShapeAppearanceModel(@NonNull StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        if (materialShapeDrawableState.f27499b != stateListShapeAppearanceModel) {
            materialShapeDrawableState.f27499b = stateListShapeAppearanceModel;
            H(getState(), true);
            invalidateSelf();
        }
    }

    public void setStroke(float f10, @ColorInt int i10) {
        setStrokeWidth(f10);
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        if (materialShapeDrawableState.f27503f != colorStateList) {
            materialShapeDrawableState.f27503f = colorStateList;
            onStateChange(getState());
        }
    }

    public void setStrokeTint(ColorStateList colorStateList) {
        this.f27472c.f27504g = colorStateList;
        J();
        B();
    }

    public void setStrokeWidth(float f10) {
        this.f27472c.f27510m = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f27472c.f27505h = colorStateList;
        J();
        B();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        if (materialShapeDrawableState.f27506i != mode) {
            materialShapeDrawableState.f27506i = mode;
            J();
            B();
        }
    }

    public void setTranslationZ(float f10) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        if (materialShapeDrawableState.f27514q != f10) {
            materialShapeDrawableState.f27514q = f10;
            K();
        }
    }

    public void setUseTintColorForShadow(boolean z10) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f27472c;
        if (materialShapeDrawableState.f27519v != z10) {
            materialShapeDrawableState.f27519v = z10;
            invalidateSelf();
        }
    }

    public void setZ(float f10) {
        setTranslationZ(f10 - getElevation());
    }

    protected void u(Canvas canvas) {
        t(canvas, this.f27486q, this.f27480k, this.A, this.E, w());
    }

    protected RectF v() {
        this.f27481l.set(getBounds());
        return this.f27481l;
    }

    public MaterialShapeDrawable(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        this(ShapeAppearanceModel.builder(context, attributeSet, i10, i11).build());
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(@NonNull Context context, float f10) {
        return createWithElevationOverlay(context, f10, null);
    }

    public void setCornerSize(@NonNull CornerSize cornerSize) {
        setShapeAppearanceModel(this.f27472c.f27498a.withCornerSize(cornerSize));
    }

    @Deprecated
    public MaterialShapeDrawable(@NonNull ShapePathModel shapePathModel) {
        this((ShapeAppearanceModel) shapePathModel);
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(@NonNull Context context, float f10, @Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(MaterialColors.getColor(context, R.attr.colorSurface, MaterialShapeDrawable.class.getSimpleName()));
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(colorStateList);
        materialShapeDrawable.setElevation(f10);
        return materialShapeDrawable;
    }

    public void setStroke(float f10, @Nullable ColorStateList colorStateList) {
        setStrokeWidth(f10);
        setStrokeColor(colorStateList);
    }

    public MaterialShapeDrawable(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this(new MaterialShapeDrawableState(shapeAppearanceModel, null));
    }

    public void setStrokeTint(@ColorInt int i10) {
        setStrokeTint(ColorStateList.valueOf(i10));
    }

    protected MaterialShapeDrawable(MaterialShapeDrawableState materialShapeDrawableState) {
        ShapeAppearancePathProvider shapeAppearancePathProvider;
        this.f27471b = new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.shape.MaterialShapeDrawable.1
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            @NonNull
            public CornerSize apply(@NonNull CornerSize cornerSize) {
                return cornerSize instanceof RelativeCornerSize ? cornerSize : new AdjustedCornerSize(-MaterialShapeDrawable.this.x(), cornerSize);
            }
        };
        this.f27473d = new ShapePath.ShadowCompatOperation[4];
        this.f27474e = new ShapePath.ShadowCompatOperation[4];
        this.f27475f = new BitSet(8);
        this.f27478i = new Matrix();
        this.f27479j = new Path();
        this.f27480k = new Path();
        this.f27481l = new RectF();
        this.f27482m = new RectF();
        this.f27483n = new Region();
        this.f27484o = new Region();
        Paint paint = new Paint(1);
        this.f27485p = paint;
        Paint paint2 = new Paint(1);
        this.f27486q = paint2;
        this.f27487r = new ShadowRenderer();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            shapeAppearancePathProvider = ShapeAppearancePathProvider.getInstance();
        } else {
            shapeAppearancePathProvider = new ShapeAppearancePathProvider();
        }
        this.f27489t = shapeAppearancePathProvider;
        this.f27493x = new RectF();
        this.f27494y = true;
        this.f27495z = true;
        this.C = new SpringAnimation[4];
        this.f27472c = materialShapeDrawableState;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        J();
        F(getState());
        this.f27488s = new ShapeAppearancePathProvider.PathListener() { // from class: com.google.android.material.shape.MaterialShapeDrawable.2
            @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
            public void onCornerPathCreated(@NonNull ShapePath shapePath, Matrix matrix, int i10) {
                MaterialShapeDrawable.this.f27475f.set(i10, shapePath.c());
                MaterialShapeDrawable.this.f27473d[i10] = shapePath.d(matrix);
            }

            @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
            public void onEdgePathCreated(@NonNull ShapePath shapePath, Matrix matrix, int i10) {
                MaterialShapeDrawable.this.f27475f.set(i10 + 4, shapePath.c());
                MaterialShapeDrawable.this.f27474e[i10] = shapePath.d(matrix);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class MaterialShapeDrawableState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ShapeAppearanceModel f27498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        StateListShapeAppearanceModel f27499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ElevationOverlayProvider f27500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ColorFilter f27501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ColorStateList f27502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ColorStateList f27503f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f27504g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ColorStateList f27505h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        PorterDuff.Mode f27506i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Rect f27507j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f27508k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f27509l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f27510m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f27511n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float f27512o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f27513p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f27514q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f27515r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f27516s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f27517t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f27518u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f27519v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Paint.Style f27520w;

        public MaterialShapeDrawableState(@NonNull ShapeAppearanceModel shapeAppearanceModel, @Nullable ElevationOverlayProvider elevationOverlayProvider) {
            this.f27502e = null;
            this.f27503f = null;
            this.f27504g = null;
            this.f27505h = null;
            this.f27506i = PorterDuff.Mode.SRC_IN;
            this.f27507j = null;
            this.f27508k = 1.0f;
            this.f27509l = 1.0f;
            this.f27511n = 255;
            this.f27512o = 0.0f;
            this.f27513p = 0.0f;
            this.f27514q = 0.0f;
            this.f27515r = 0;
            this.f27516s = 0;
            this.f27517t = 0;
            this.f27518u = 0;
            this.f27519v = false;
            this.f27520w = Paint.Style.FILL_AND_STROKE;
            this.f27498a = shapeAppearanceModel;
            this.f27500c = elevationOverlayProvider;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.f27476g = true;
            materialShapeDrawable.f27477h = true;
            return materialShapeDrawable;
        }

        public MaterialShapeDrawableState(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
            this.f27502e = null;
            this.f27503f = null;
            this.f27504g = null;
            this.f27505h = null;
            this.f27506i = PorterDuff.Mode.SRC_IN;
            this.f27507j = null;
            this.f27508k = 1.0f;
            this.f27509l = 1.0f;
            this.f27511n = 255;
            this.f27512o = 0.0f;
            this.f27513p = 0.0f;
            this.f27514q = 0.0f;
            this.f27515r = 0;
            this.f27516s = 0;
            this.f27517t = 0;
            this.f27518u = 0;
            this.f27519v = false;
            this.f27520w = Paint.Style.FILL_AND_STROKE;
            this.f27498a = materialShapeDrawableState.f27498a;
            this.f27499b = materialShapeDrawableState.f27499b;
            this.f27500c = materialShapeDrawableState.f27500c;
            this.f27510m = materialShapeDrawableState.f27510m;
            this.f27501d = materialShapeDrawableState.f27501d;
            this.f27502e = materialShapeDrawableState.f27502e;
            this.f27503f = materialShapeDrawableState.f27503f;
            this.f27506i = materialShapeDrawableState.f27506i;
            this.f27505h = materialShapeDrawableState.f27505h;
            this.f27511n = materialShapeDrawableState.f27511n;
            this.f27508k = materialShapeDrawableState.f27508k;
            this.f27517t = materialShapeDrawableState.f27517t;
            this.f27515r = materialShapeDrawableState.f27515r;
            this.f27519v = materialShapeDrawableState.f27519v;
            this.f27509l = materialShapeDrawableState.f27509l;
            this.f27512o = materialShapeDrawableState.f27512o;
            this.f27513p = materialShapeDrawableState.f27513p;
            this.f27514q = materialShapeDrawableState.f27514q;
            this.f27516s = materialShapeDrawableState.f27516s;
            this.f27518u = materialShapeDrawableState.f27518u;
            this.f27504g = materialShapeDrawableState.f27504g;
            this.f27520w = materialShapeDrawableState.f27520w;
            if (materialShapeDrawableState.f27507j != null) {
                this.f27507j = new Rect(materialShapeDrawableState.f27507j);
            }
        }
    }
}
