package ic;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.ui.graphics.a1;
import androidx.core.view.ViewCompat;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends Drawable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f74290p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final c f74291q = c.TOP_BOTTOM;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f74292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f74293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f74294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f74295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Rect f74296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f74297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorFilter f74298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BlendModeColorFilter f74299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f74300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Paint f74301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f74302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Path f74303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f74304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f74305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private zc.g f74306o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public enum c {
        TOP_BOTTOM,
        TR_BL,
        RIGHT_LEFT,
        BR_TL,
        BOTTOM_TOP,
        BL_TR,
        LEFT_RIGHT,
        TL_BR
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74343a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.TR_BL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.BR_TL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.BL_TR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f74343a = iArr;
        }
    }

    public /* synthetic */ n(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    private final int a(int i10) {
        int i11 = this.f74300i;
        return (i10 * (i11 + (i11 >> 7))) >> 8;
    }

    private final BlendModeColorFilter b(BlendModeColorFilter blendModeColorFilter, ColorStateList colorStateList, BlendMode blendMode) {
        if (colorStateList == null || blendMode == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return blendModeColorFilter;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        return (blendModeColorFilter != null && blendModeColorFilter.getColor() == colorForState && blendModeColorFilter.getMode() == blendMode) ? blendModeColorFilter : a1.a(colorForState, blendMode);
    }

    private final Path c(b bVar) {
        Path path = this.f74303l;
        if (path != null && !this.f74304m) {
            return path;
        }
        this.f74304m = false;
        float level = (getLevel() * 360.0f) / 10000.0f;
        RectF rectF = new RectF(this.f74294c);
        float fWidth = rectF.width() / 2.0f;
        float fHeight = rectF.height() / 2.0f;
        float fB = bVar.b() != -1 ? bVar.b() : rectF.width() / bVar.c();
        float fB2 = bVar.B() != -1 ? bVar.B() : rectF.width() / bVar.C();
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(fWidth - fB2, fHeight - fB2);
        RectF rectF3 = new RectF(rectF2);
        float f10 = -fB;
        rectF3.inset(f10, f10);
        Path path2 = this.f74303l;
        if (path2 != null) {
            path2.reset();
        } else {
            path2 = new Path();
            this.f74303l = path2;
        }
        if (level >= 360.0f || level <= -360.0f) {
            path2.addOval(rectF3, Path.Direction.CW);
            path2.addOval(rectF2, Path.Direction.CCW);
        } else {
            path2.setFillType(Path.FillType.EVEN_ODD);
            float f11 = fWidth + fB2;
            path2.moveTo(f11, fHeight);
            path2.lineTo(f11 + fB, fHeight);
            path2.arcTo(rectF3, 0.0f, level, false);
            path2.arcTo(rectF2, level, -level, false);
            path2.close();
        }
        path2.addOval(rectF3, Path.Direction.CW);
        path2.addOval(rectF2, Path.Direction.CCW);
        return path2;
    }

    private final void d() {
        b bVar = this.f74292a;
        if (this.f74304m) {
            l();
            this.f74293b.reset();
            float[] fArrJ = bVar.J();
            if (fArrJ != null) {
                this.f74293b.addRoundRect(this.f74294c, fArrJ, Path.Direction.CW);
            }
            this.f74304m = false;
        }
    }

    public static /* synthetic */ void h(n nVar, float f10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f10 = 0.5f;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        nVar.f(f10, i10);
    }

    public static /* synthetic */ void i(n nVar, int i10, int i11, float f10, float f11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            f10 = 0.0f;
        }
        if ((i12 & 8) != 0) {
            f11 = 0.0f;
        }
        nVar.g(i10, i11, f10, f11);
    }

    private final void k(int i10, int i11, float f10, float f11) {
        Paint paint = this.f74297f;
        if (paint == null) {
            paint = new Paint(1);
            this.f74297f = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        paint.setStrokeWidth(i10);
        paint.setColor(i11);
        paint.setPathEffect(f10 > 0.0f ? new DashPathEffect(new float[]{f10, f11}, 0.0f) : null);
        this.f74302k = true;
        invalidateSelf();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0054. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean l() {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.n.l():boolean");
    }

    private final boolean n() {
        Paint paint = this.f74297f;
        if (this.f74292a.a() < 0 || paint == null || o.a(paint.getColor())) {
            return this.f74292a.w() != null || o.a(this.f74295d.getColor());
        }
        return false;
    }

    private final void o() {
        b bVar = this.f74292a;
        ColorStateList colorStateListL = bVar.L();
        if (colorStateListL != null) {
            this.f74295d.setColor(colorStateListL.getColorForState(getState(), 0));
        } else if (bVar.w() == null) {
            this.f74295d.setColor(0);
        } else {
            this.f74295d.setColor(ViewCompat.MEASURED_STATE_MASK);
        }
        this.f74296e = bVar.G();
        int iA = bVar.a();
        if (iA >= 0) {
            Paint paint = this.f74297f;
            if (paint == null) {
                paint = new Paint(1);
                this.f74297f = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(iA);
            }
            ColorStateList colorStateListM = bVar.M();
            if (colorStateListM != null) {
                paint.setColor(colorStateListM.getColorForState(getState(), 0));
            }
            float fO = bVar.O();
            if (fO != 0.0f) {
                paint.setPathEffect(new DashPathEffect(new float[]{fO, bVar.N()}, 0.0f));
            }
        }
        this.f74299h = b(this.f74299h, bVar.d(), bVar.o());
        this.f74302k = true;
        bVar.f();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f10;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (l()) {
            Paint paint9 = this.f74295d;
            zc.g gVar = this.f74306o;
            paint9.setShader(gVar != null ? gVar.a(canvas.isHardwareAccelerated()) : null);
            int alpha = this.f74295d.getAlpha();
            Paint paint10 = this.f74297f;
            int alpha2 = paint10 != null ? paint10.getAlpha() : 0;
            int iA = a(alpha);
            int iA2 = a(alpha2);
            Paint paint11 = this.f74297f;
            float strokeWidth = paint11 != null ? paint11.getStrokeWidth() : 0.0f;
            boolean z10 = iA2 > 0 && strokeWidth > 0.0f;
            boolean z11 = iA > 0;
            b bVar = this.f74292a;
            ColorFilter colorFilter = this.f74298g;
            if (colorFilter == null) {
                colorFilter = this.f74299h;
            }
            boolean z12 = z10 && z11 && bVar.K() != 2 && iA2 < 255 && (this.f74300i < 255 || colorFilter != null);
            if (z12) {
                Paint paint12 = this.f74301j;
                if (paint12 == null) {
                    paint12 = new Paint();
                    this.f74301j = paint12;
                }
                Paint paint13 = paint12;
                paint13.setDither(bVar.v());
                paint13.setAlpha(this.f74300i);
                paint13.setColorFilter(colorFilter);
                RectF rectF = this.f74294c;
                f10 = 0.0f;
                canvas.saveLayer(rectF.left - strokeWidth, rectF.top - strokeWidth, rectF.right + strokeWidth, strokeWidth + rectF.bottom, paint13);
                this.f74295d.setColorFilter(null);
                Paint paint14 = this.f74297f;
                if (paint14 != null) {
                    paint14.setColorFilter(null);
                }
            } else {
                f10 = 0.0f;
                this.f74295d.setAlpha(iA);
                this.f74295d.setDither(bVar.v());
                this.f74295d.setColorFilter(colorFilter);
                if (colorFilter != null && bVar.L() == null) {
                    this.f74295d.setColor(this.f74300i << 24);
                }
                if (z10 && (paint = this.f74297f) != null) {
                    paint.setAlpha(iA2);
                    paint.setDither(bVar.v());
                    paint.setColorFilter(colorFilter);
                }
            }
            int iK = bVar.K();
            if (iK != 0) {
                if (iK == 1) {
                    canvas.drawOval(this.f74294c, this.f74295d);
                    if (z10 && (paint6 = this.f74297f) != null) {
                        canvas.drawOval(this.f74294c, paint6);
                    }
                } else if (iK == 2) {
                    RectF rectF2 = this.f74294c;
                    float fCenterY = rectF2.centerY();
                    if (z10 && (paint7 = this.f74297f) != null) {
                        canvas.drawLine(rectF2.left, fCenterY, rectF2.right, fCenterY, paint7);
                    }
                } else if (iK == 3) {
                    Path pathC = c(bVar);
                    canvas.drawPath(pathC, this.f74295d);
                    if (z10 && (paint8 = this.f74297f) != null) {
                        canvas.drawPath(pathC, paint8);
                    }
                }
            } else if (bVar.J() != null) {
                d();
                canvas.drawPath(this.f74293b, this.f74295d);
                if (z10 && (paint4 = this.f74297f) != null) {
                    canvas.drawPath(this.f74293b, paint4);
                }
            } else if (bVar.I() > f10) {
                float fMin = (float) Math.min(bVar.I(), Math.min(this.f74294c.width(), this.f74294c.height()) * ((double) 0.5f));
                canvas.drawRoundRect(this.f74294c, fMin, fMin, this.f74295d);
                if (z10 && (paint3 = this.f74297f) != null) {
                    canvas.drawRoundRect(this.f74294c, fMin, fMin, paint3);
                }
            } else {
                if (this.f74295d.getColor() != 0 || colorFilter != null || this.f74295d.getShader() != null) {
                    canvas.drawRect(this.f74294c, this.f74295d);
                }
                if (z10 && (paint2 = this.f74297f) != null) {
                    canvas.drawRect(this.f74294c, paint2);
                }
            }
            if (z12) {
                canvas.restore();
                return;
            }
            this.f74295d.setAlpha(alpha);
            if (!z10 || (paint5 = this.f74297f) == null) {
                return;
            }
            paint5.setAlpha(alpha2);
        }
    }

    public final void e(float f10) {
        this.f74292a.g(f10);
        this.f74304m = true;
        invalidateSelf();
    }

    public final void f(float f10, int i10) {
        this.f74292a.h(f10, i10);
        this.f74302k = true;
        invalidateSelf();
    }

    public final void g(int i10, int i11, float f10, float f11) {
        this.f74292a.j(i10, ColorStateList.valueOf(i11), f10, f11);
        k(i10, i11, f10, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f74300i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f74292a.t();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f74298g;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        b bVar = this.f74292a;
        bVar.i(getChangingConfigurations());
        return bVar;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f74292a.A();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f74292a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (this.f74300i == 255 && this.f74292a.D() && n()) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Intrinsics.checkNotNullParameter(outline, "outline");
        b bVar = this.f74292a;
        Paint paint = this.f74297f;
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds()");
        outline.setAlpha((bVar.E() && (this.f74292a.a() <= 0 || paint == null || paint.getAlpha() == this.f74295d.getAlpha())) ? a(this.f74295d.getAlpha()) / 255.0f : 0.0f);
        int iK = bVar.K();
        if (iK != 0) {
            if (iK == 1) {
                outline.setOval(bounds);
                return;
            } else {
                if (iK != 2) {
                    return;
                }
                float strokeWidth = paint != null ? paint.getStrokeWidth() * 0.5f : 1.0E-4f;
                float fCenterY = bounds.centerY();
                outline.setRect(bounds.left, (int) Math.floor(fCenterY - strokeWidth), bounds.right, (int) Math.ceil(fCenterY + strokeWidth));
                return;
            }
        }
        float[] fArrJ = bVar.J();
        if (fArrJ == null) {
            outline.setRoundRect(bounds, bVar.I() > 0.0f ? (float) Math.min(bVar.I(), Math.min(bounds.width(), bounds.height()) * ((double) 0.5f)) : 0.0f);
            return;
        }
        d();
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(this.f74293b);
        } else {
            outline.setRoundRect(bounds, ArraysKt.sum(fArrJ));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        Rect rect = this.f74296e;
        if (rect == null) {
            return super.getPadding(padding);
        }
        padding.set(rect);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateListL;
        ColorStateList colorStateListM;
        ColorStateList colorStateListD;
        b bVar = this.f74292a;
        return super.isStateful() || ((colorStateListL = bVar.L()) != null && colorStateListL.isStateful()) || (((colorStateListM = bVar.M()) != null && colorStateListM.isStateful()) || ((colorStateListD = bVar.d()) != null && colorStateListD.isStateful()));
    }

    public final void j(int i10) {
        this.f74292a.k(ColorStateList.valueOf(i10));
        this.f74295d.setColor(i10);
        invalidateSelf();
    }

    public final void m(int i10) {
        this.f74292a.p(i10);
        this.f74302k = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (super.mutate() == this) {
            this.f74292a = new b(this.f74292a);
            o();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        super.onBoundsChange(rect);
        this.f74303l = null;
        this.f74304m = true;
        this.f74302k = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        super.onLevelChange(i10);
        this.f74302k = true;
        this.f74304m = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] stateSet) {
        boolean z10;
        ColorStateList colorStateListM;
        int colorForState;
        int colorForState2;
        Intrinsics.checkNotNullParameter(stateSet, "stateSet");
        b bVar = this.f74292a;
        ColorStateList colorStateListL = bVar.L();
        if (colorStateListL == null || this.f74295d.getColor() == (colorForState2 = colorStateListL.getColorForState(stateSet, 0))) {
            z10 = false;
        } else {
            this.f74295d.setColor(colorForState2);
            z10 = true;
        }
        Paint paint = this.f74297f;
        if (paint != null && (colorStateListM = bVar.M()) != null && paint.getColor() != (colorForState = colorStateListM.getColorForState(stateSet, 0))) {
            paint.setColor(colorForState);
            z10 = true;
        }
        if (bVar.d() != null && bVar.o() != null) {
            this.f74299h = b(this.f74299h, bVar.d(), bVar.o());
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f74300i != i10) {
            this.f74300i = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f74298g != colorFilter) {
            this.f74298g = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        if (this.f74292a.v() != z10) {
            this.f74292a.m(z10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        this.f74292a.l(blendMode);
        this.f74299h = b(this.f74299h, this.f74292a.d(), blendMode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f74292a.q(colorStateList);
        this.f74299h = b(this.f74299h, colorStateList, this.f74292a.o());
        invalidateSelf();
    }

    public n() {
        this(new b(f74291q, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(c orientation, int[] iArr) {
        this(new b(orientation, iArr));
        Intrinsics.checkNotNullParameter(orientation, "orientation");
    }

    private n(b bVar) {
        this.f74293b = new Path();
        this.f74294c = new RectF();
        this.f74295d = new Paint(1);
        this.f74300i = 255;
        this.f74304m = true;
        this.f74292a = bVar;
        o();
    }

    public static final class b extends Drawable.ConstantState {
        private boolean A;
        private boolean B;
        private ColorStateList C;
        private BlendMode D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f74307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f74308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f74309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f74310d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f74311e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ColorStateList f74312f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ColorStateList f74313g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ColorStateList[] f74314h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float[] f74315i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f74316j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f74317k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f74318l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f74319m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float[] f74320n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Rect f74321o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f74322p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f74323q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private float f74324r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private float f74325s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f74326t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f74327u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f74328v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private float f74329w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private float f74330x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private float f74331y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f74332z;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f74333f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(ColorStateList colorStateList) {
                if (colorStateList != null) {
                    return Integer.valueOf(colorStateList.getDefaultColor());
                }
                return null;
            }
        }

        public b(c orientation, int[] iArr) {
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            this.f74316j = -1;
            this.f74322p = -1;
            this.f74323q = -1;
            this.f74324r = 3.0f;
            this.f74325s = 9.0f;
            this.f74326t = -1;
            this.f74327u = -1;
            this.f74329w = 0.5f;
            this.f74330x = 0.5f;
            this.f74331y = 0.5f;
            this.D = Build.VERSION.SDK_INT >= 29 ? BlendMode.SRC_IN : null;
            this.f74311e = orientation;
            n(iArr);
        }

        public final int A() {
            return this.f74323q;
        }

        public final int B() {
            return this.f74326t;
        }

        public final float C() {
            return this.f74324r;
        }

        public final boolean D() {
            return this.A;
        }

        public final boolean E() {
            return this.B;
        }

        public final c F() {
            return this.f74311e;
        }

        public final Rect G() {
            return this.f74321o;
        }

        public final float[] H() {
            return this.f74315i;
        }

        public final float I() {
            return this.f74319m;
        }

        public final float[] J() {
            return this.f74320n;
        }

        public final int K() {
            return this.f74308b;
        }

        public final ColorStateList L() {
            return this.f74312f;
        }

        public final ColorStateList M() {
            return this.f74313g;
        }

        public final float N() {
            return this.f74318l;
        }

        public final float O() {
            return this.f74317k;
        }

        public final int a() {
            return this.f74316j;
        }

        public final int b() {
            return this.f74327u;
        }

        public final float c() {
            return this.f74325s;
        }

        public final ColorStateList d() {
            return this.C;
        }

        public final int e() {
            return this.f74322p;
        }

        public final void f() {
            Boolean boolValueOf;
            boolean z10;
            boolean z11 = false;
            this.A = false;
            this.B = false;
            ColorStateList[] colorStateListArr = this.f74314h;
            if (colorStateListArr == null && this.f74312f == null) {
                return;
            }
            if (colorStateListArr != null) {
                int length = colorStateListArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        ColorStateList colorStateList = colorStateListArr[i10];
                        if (colorStateList != null && !o.a(colorStateList.getDefaultColor())) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                boolValueOf = Boolean.valueOf(z10);
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                return;
            }
            this.B = true;
            if (this.f74308b == 0 && this.f74319m <= 0.0f && this.f74320n == null) {
                z11 = true;
            }
            this.A = z11;
        }

        public final void g(float f10) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            this.f74319m = f10;
            this.f74320n = null;
            f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i10 = this.f74307a;
            ColorStateList colorStateList = this.f74313g;
            int changingConfigurations = i10 | (colorStateList != null ? colorStateList.getChangingConfigurations() : 0);
            ColorStateList colorStateList2 = this.f74312f;
            int changingConfigurations2 = changingConfigurations | (colorStateList2 != null ? colorStateList2.getChangingConfigurations() : 0);
            ColorStateList colorStateList3 = this.C;
            return changingConfigurations2 | (colorStateList3 != null ? colorStateList3.getChangingConfigurations() : 0);
        }

        public final void h(float f10, int i10) {
            this.f74331y = f10;
            this.f74332z = i10;
        }

        public final void i(int i10) {
            this.f74307a = i10;
        }

        public final void j(int i10, ColorStateList colorStateList, float f10, float f11) {
            this.f74316j = i10;
            this.f74313g = colorStateList;
            this.f74317k = f10;
            this.f74318l = f11;
            f();
        }

        public final void k(ColorStateList colorStateList) {
            this.f74314h = null;
            this.f74312f = colorStateList;
            f();
        }

        public final void l(BlendMode blendMode) {
            this.D = blendMode;
        }

        public final void m(boolean z10) {
            this.f74328v = z10;
        }

        public final void n(int[] iArr) {
            ColorStateList[] colorStateListArr;
            if (iArr != null) {
                colorStateListArr = this.f74314h;
                if (colorStateListArr == null || colorStateListArr.length != iArr.length) {
                    colorStateListArr = new ColorStateList[iArr.length];
                }
                int length = iArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(iArr[i10]);
                    Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(it)");
                    colorStateListArr[i10] = colorStateListValueOf;
                }
            } else {
                colorStateListArr = null;
            }
            this.f74314h = colorStateListArr;
            this.f74312f = null;
            f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new n(this, (DefaultConstructorMarker) null);
        }

        public final BlendMode o() {
            return this.D;
        }

        public final void p(int i10) {
            this.f74309c = i10;
        }

        public final void q(ColorStateList colorStateList) {
            this.C = colorStateList;
        }

        public final float r() {
            return this.f74329w;
        }

        public final float s() {
            return this.f74330x;
        }

        public final int t() {
            return this.f74307a;
        }

        public final int[] u() {
            ColorStateList[] colorStateListArr = this.f74314h;
            if (colorStateListArr != null) {
                return o.b(colorStateListArr, a.f74333f);
            }
            return null;
        }

        public final boolean v() {
            return this.f74328v;
        }

        public final ColorStateList[] w() {
            return this.f74314h;
        }

        public final float x() {
            return this.f74331y;
        }

        public final int y() {
            return this.f74332z;
        }

        public final int z() {
            return this.f74309c;
        }

        public b(b originalGradientState) {
            Intrinsics.checkNotNullParameter(originalGradientState, "originalGradientState");
            this.f74316j = -1;
            this.f74322p = -1;
            this.f74323q = -1;
            this.f74324r = 3.0f;
            this.f74325s = 9.0f;
            this.f74326t = -1;
            this.f74327u = -1;
            this.f74329w = 0.5f;
            this.f74330x = 0.5f;
            this.f74331y = 0.5f;
            this.D = Build.VERSION.SDK_INT >= 29 ? BlendMode.SRC_IN : null;
            this.f74307a = originalGradientState.f74307a;
            this.f74308b = originalGradientState.f74308b;
            this.f74309c = originalGradientState.f74309c;
            this.f74310d = originalGradientState.f74310d;
            this.f74311e = originalGradientState.f74311e;
            this.f74312f = originalGradientState.f74312f;
            this.f74313g = originalGradientState.f74313g;
            ColorStateList[] colorStateListArr = originalGradientState.f74314h;
            if (colorStateListArr != null) {
                this.f74314h = (ColorStateList[]) colorStateListArr.clone();
            }
            float[] fArr = originalGradientState.f74315i;
            if (fArr != null) {
                this.f74315i = (float[]) fArr.clone();
            }
            this.f74316j = originalGradientState.f74316j;
            this.f74317k = originalGradientState.f74317k;
            this.f74318l = originalGradientState.f74318l;
            this.f74319m = originalGradientState.f74319m;
            float[] fArr2 = originalGradientState.f74320n;
            if (fArr2 != null) {
                this.f74320n = (float[]) fArr2.clone();
            }
            Rect rect = originalGradientState.f74321o;
            if (rect != null) {
                this.f74321o = new Rect(rect);
            }
            this.f74322p = originalGradientState.f74322p;
            this.f74323q = originalGradientState.f74323q;
            this.f74324r = originalGradientState.f74324r;
            this.f74325s = originalGradientState.f74325s;
            this.f74326t = originalGradientState.f74326t;
            this.f74327u = originalGradientState.f74327u;
            this.f74328v = originalGradientState.f74328v;
            this.f74329w = originalGradientState.f74329w;
            this.f74330x = originalGradientState.f74330x;
            this.f74331y = originalGradientState.f74331y;
            this.f74332z = originalGradientState.f74332z;
            this.A = originalGradientState.A;
            this.B = originalGradientState.B;
            this.C = originalGradientState.C;
            this.D = originalGradientState.D;
        }
    }
}
