package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\fH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/forms/SingleIndicatorDrawer;", "", "draw", "", "canvas", "Landroid/graphics/Canvas;", "x", "", "y", "itemSize", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "color", "", "strokeWidth", "strokeColor", "drawSelected", "rect", "Landroid/graphics/RectF;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SingleIndicatorDrawer {
    void draw(@NotNull Canvas canvas, float x10, float y10, @NotNull IndicatorParams$ItemSize itemSize, int color, float strokeWidth, int strokeColor);

    void drawSelected(@NotNull Canvas canvas, @NotNull RectF rect);
}
