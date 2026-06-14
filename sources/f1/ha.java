package f1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.VisibleForTesting;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ha extends View {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f70026i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f70027j = -436207617;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f70028k = -1711276033;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f70029l = -15262682;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xb f70030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f70031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f70032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f70033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f70034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f70035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f70036h;

    public static final class a {
        public a() {
        }

        public final int a() {
            return ha.f70027j;
        }

        public final int b() {
            return ha.f70028k;
        }

        public final int c() {
            return ha.f70029l;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint(1);
            ha haVar = ha.this;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(haVar.f70030b.a(2));
            paint.setColor(ha.f70026i.b());
            paint.setStrokeCap(Paint.Cap.ROUND);
            return paint;
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f70038f = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(ha.f70026i.c());
            return paint;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint(1);
            ha haVar = ha.this;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(haVar.f70030b.a(2));
            paint.setColor(ha.f70026i.a());
            paint.setStrokeCap(Paint.Cap.ROUND);
            return paint;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(Context context, AttributeSet attributeSet, int i10, xb densityProvider) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.f70030b = densityProvider;
        this.f70031c = lf.i.a(c.f70038f);
        this.f70032d = lf.i.a(new b());
        this.f70033e = lf.i.a(new d());
        this.f70034f = new RectF();
        this.f70035g = 1.0f;
        this.f70036h = -1.0f;
    }

    private final Paint getArcBackgroundPaint() {
        return (Paint) this.f70032d.getValue();
    }

    @ColorInt
    public final int getArcColor() {
        return getProgressPaint().getColor();
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final Paint getBackgroundPaint() {
        return (Paint) this.f70031c.getValue();
    }

    @ColorInt
    public final int getBackgroundPaintColor() {
        return getBackgroundPaint().getColor();
    }

    @VisibleForTesting(otherwise = 2)
    public final float getProgress() {
        return this.f70035g;
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final Paint getProgressPaint() {
        return (Paint) this.f70033e.getValue();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawCircle(this.f70034f.centerX(), this.f70034f.centerY(), this.f70034f.width() / 2, getBackgroundPaint());
        canvas.drawArc(this.f70034f, 0.0f, 360.0f, false, getArcBackgroundPaint());
        float f10 = this.f70035g;
        if (f10 > 0.0f) {
            canvas.drawArc(this.f70034f, -90.0f, f10 * 360.0f, false, getProgressPaint());
        }
        this.f70036h = this.f70035g;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float strokeWidth = getProgressPaint().getStrokeWidth() / 2;
        this.f70034f.set(strokeWidth, strokeWidth, i10 - strokeWidth, i11 - strokeWidth);
    }

    public final void setArcColor(int i10) {
        getProgressPaint().setColor(i10);
        invalidate();
    }

    public final void setBackgroundPaintColor(int i10) {
        getBackgroundPaint().setColor(i10);
        invalidate();
    }

    public final void setProgress(float f10) {
        float fM = kotlin.ranges.g.m(f10, 0.0f, 1.0f);
        if (fM != this.f70035g || this.f70036h == -1.0f) {
            this.f70035g = fM;
            this.f70036h = fM;
            invalidate();
        }
    }
}
