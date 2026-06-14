package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.Style;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J@\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/forms/Circle;", "Lcom/yandex/div/internal/widget/indicator/forms/SingleIndicatorDrawer;", "params", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Style;", "(Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Style;)V", "paint", "Landroid/graphics/Paint;", "rect", "Landroid/graphics/RectF;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "x", "", "y", "itemSize", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "color", "", "strokeWidth", "strokeColor", "drawSelected", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Circle implements SingleIndicatorDrawer {

    @NotNull
    private final Style params;

    @NotNull
    private final Paint paint = new Paint();

    @NotNull
    private final RectF rect = new RectF();

    public Circle(@NotNull Style style) {
        this.params = style;
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void draw(@NotNull Canvas canvas, float x10, float y10, @NotNull IndicatorParams$ItemSize itemSize, int color, float strokeWidth, int strokeColor) {
        Intrinsics.checkNotNull(itemSize, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.ItemSize.Circle");
        IndicatorParams$ItemSize.Circle circle = (IndicatorParams$ItemSize.Circle) itemSize;
        this.paint.setColor(color);
        RectF rectF = this.rect;
        rectF.left = x10 - circle.getRadius();
        rectF.top = y10 - circle.getRadius();
        rectF.right = x10 + circle.getRadius();
        rectF.bottom = y10 + circle.getRadius();
        canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), circle.getRadius(), this.paint);
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void drawSelected(@NotNull Canvas canvas, @NotNull RectF rect) {
        this.paint.setColor(this.params.getActiveShape().getColor());
        canvas.drawCircle(rect.centerX(), rect.centerY(), rect.width() / 2, this.paint);
    }
}
