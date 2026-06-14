package com.yandex.div.core.view2.spannable;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J`\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/view2/spannable/LineMetricsSpan;", "Landroid/text/style/LineBackgroundSpan;", "()V", "linePaint", "Landroid/graphics/Paint;", "drawBackground", "", "canvas", "Landroid/graphics/Canvas;", "paint", "left", "", "right", "top", "baseline", "bottom", "text", "", "start", "end", "lineNumber", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LineMetricsSpan implements LineBackgroundSpan {

    @NotNull
    private final Paint linePaint;

    public LineMetricsSpan() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(false);
        paint.setStrokeWidth(0.0f);
        this.linePaint = paint;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(@NotNull Canvas canvas, @NotNull Paint paint, int left, int right, int top, int baseline, int bottom, @NotNull CharSequence text, int start, int end, int lineNumber) {
        this.linePaint.setColor(-16764855);
        float f10 = top;
        float f11 = left;
        float f12 = right;
        canvas.drawLine(f11, f10, f12, f10, this.linePaint);
        this.linePaint.setColor(-557312);
        this.linePaint.setPathEffect(new DashPathEffect(new float[]{8.0f, 4.0f, 1.0f, 4.0f}, 0.0f));
        float f13 = f10 + ((bottom - top) / 2.0f);
        canvas.drawLine(f11, f13, f12, f13, this.linePaint);
        this.linePaint.setColor(-2742232);
        this.linePaint.setPathEffect(null);
        float f14 = baseline - 1;
        canvas.drawLine(f11, f14, f12, f14, this.linePaint);
        this.linePaint.setColor(-213175);
        float f15 = bottom - 1;
        canvas.drawLine(f11, f15, f12, f15, this.linePaint);
    }
}
