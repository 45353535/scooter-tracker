package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import androidx.compose.material.OutlinedTextFieldKt;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawerKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import io.appmetrica.analytics.impl.H2;
import k8.ar;
import k8.gq;
import k8.st;
import k8.xt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0016\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u0018\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J!\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010 \u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b \u0010\u001fJ-\u0010!\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\u001fJ-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/yandex/div/core/util/text/BackgroundDrawer;", "", "Landroid/util/DisplayMetrics;", "metrics", "Lk8/xt;", OutlinedTextFieldKt.BorderId, "Lk8/st;", H2.f75840g, "Landroid/graphics/Canvas;", "canvas", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "<init>", "(Landroid/util/DisplayMetrics;Lk8/xt;Lk8/st;Landroid/graphics/Canvas;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "", "radii", "", "start", "top", "end", "bottom", "", "drawBackground", "([FFFFF)V", "drawBorder", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/Path;", "getPath", "([FLandroid/graphics/RectF;)Landroid/graphics/Path;", "drawBackgroundEnd", "(FFFF)V", "drawBackgroundStart", "drawBackgroundMiddle", "Landroid/util/DisplayMetrics;", "Lk8/xt;", "Lk8/st;", "Landroid/graphics/Canvas;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Landroid/graphics/Paint;", "borerPaint", "Landroid/graphics/Paint;", "getBorerPaint", "()Landroid/graphics/Paint;", "[F", "getRadii", "()[F", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class BackgroundDrawer {

    @Nullable
    private final st background;

    @Nullable
    private final xt border;

    @NotNull
    private final Paint borerPaint;

    @NotNull
    private final Canvas canvas;

    @NotNull
    private final DisplayMetrics metrics;

    @Nullable
    private final float[] radii;

    @NotNull
    private final ExpressionResolver resolver;

    public BackgroundDrawer(@NotNull DisplayMetrics displayMetrics, @Nullable xt xtVar, @Nullable st stVar, @NotNull Canvas canvas, @NotNull ExpressionResolver expressionResolver) {
        Expression expression;
        this.metrics = displayMetrics;
        this.border = xtVar;
        this.background = stVar;
        this.canvas = canvas;
        this.resolver = expressionResolver;
        Paint paint = new Paint();
        this.borerPaint = paint;
        if (xtVar == null) {
            this.radii = null;
            return;
        }
        this.radii = DivTextRangesBackgroundRendererKt.getCornerRadii(xtVar, displayMetrics, expressionResolver);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(DivBorderDrawerKt.widthPx(xtVar.f92416b, expressionResolver, displayMetrics));
        ar arVar = xtVar.f92416b;
        if (arVar == null || (expression = arVar.f86313a) == null) {
            return;
        }
        paint.setColor(((Number) expression.evaluate(expressionResolver)).intValue());
    }

    private final void drawBorder(float[] radii, float start, float top, float end, float bottom) {
        xt xtVar = this.border;
        if ((xtVar != null ? xtVar.f92416b : null) == null) {
            return;
        }
        RectF rectF = new RectF();
        ar arVar = this.border.f92416b;
        Intrinsics.checkNotNull(arVar);
        float fWidthPx = DivBorderDrawerKt.widthPx(arVar, this.resolver, this.metrics) / 2.0f;
        rectF.set(Math.max(0.0f, start + fWidthPx), Math.max(0.0f, top + fWidthPx), Math.max(0.0f, end - fWidthPx), Math.max(0.0f, bottom - fWidthPx));
        float[] fArr = radii != null ? (float[]) radii.clone() : null;
        if (fArr != null) {
            int length = fArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                fArr[i10] = Math.max(0.0f, radii[i10] - fWidthPx);
            }
        }
        this.canvas.drawPath(getPath(fArr, rectF), this.borerPaint);
    }

    private final Path getPath(float[] radii, RectF rect) {
        Path path = new Path();
        path.reset();
        if (radii == null) {
            path.addRect(rect, Path.Direction.CW);
        } else {
            path.addRoundRect(rect, radii, Path.Direction.CW);
        }
        path.close();
        return path;
    }

    public final void drawBackground(float start, float top, float end, float bottom) {
        drawBackground(this.radii, start, top, end, bottom);
    }

    public final void drawBackgroundEnd(float start, float top, float end, float bottom) {
        float[] fArr = new float[8];
        float[] fArr2 = this.radii;
        if (fArr2 != null) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = fArr2[2];
            fArr[3] = fArr2[3];
            fArr[4] = fArr2[4];
            fArr[5] = fArr2[5];
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
        }
        drawBackground(fArr, start, top, end, bottom);
    }

    public final void drawBackgroundMiddle(float start, float top, float end, float bottom) {
        drawBackground(new float[8], start, top, end, bottom);
    }

    public final void drawBackgroundStart(float start, float top, float end, float bottom) {
        float[] fArr = new float[8];
        float[] fArr2 = this.radii;
        if (fArr2 != null) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
        }
        drawBackground(fArr, start, top, end, bottom);
    }

    private final void drawBackground(float[] radii, float start, float top, float end, float bottom) {
        RectF rectF = new RectF();
        rectF.set(start, top, end, bottom);
        st stVar = this.background;
        Object objB = stVar != null ? stVar.b() : null;
        if (objB instanceof gq) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(((Number) ((gq) objB).f87894a.evaluate(this.resolver)).intValue());
            this.canvas.drawPath(getPath(radii, rectF), paint);
        }
        drawBorder(radii, start, top, end, bottom);
    }
}
