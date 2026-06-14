package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.text.Layout;
import androidx.compose.material.OutlinedTextFieldKt;
import io.appmetrica.analytics.impl.H2;
import k8.st;
import k8.xt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\bJS\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0018\u0010\bJ\u001f\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/core/util/text/DivTextRangesBackgroundRenderer;", "", "<init>", "()V", "Landroid/text/Layout;", "", "line", "getLineBottomWithoutSpacing", "(Landroid/text/Layout;I)I", "getLineHeight", "Landroid/graphics/Canvas;", "canvas", "layout", "startLine", "endLine", "startOffset", "endOffset", "Lk8/xt;", OutlinedTextFieldKt.BorderId, "Lk8/st;", H2.f75840g, "", "draw", "(Landroid/graphics/Canvas;Landroid/text/Layout;IIIILk8/xt;Lk8/st;)V", "getLineTop", "getLineBottom", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DivTextRangesBackgroundRenderer {
    private final int getLineBottomWithoutSpacing(Layout layout, int i10) {
        int lineBottom = layout.getLineBottom(i10);
        boolean z10 = i10 == layout.getLineCount() - 1;
        float spacingAdd = layout.getSpacingAdd();
        float spacingMultiplier = layout.getSpacingMultiplier();
        if ((spacingAdd == 0.0f && spacingMultiplier == 1.0f) || z10) {
            return lineBottom;
        }
        if (Float.compare(spacingMultiplier, 1.0f) != 0) {
            float lineHeight = getLineHeight(layout, i10);
            spacingAdd = lineHeight - ((lineHeight - spacingAdd) / spacingMultiplier);
        }
        return (int) (lineBottom - spacingAdd);
    }

    private final int getLineHeight(Layout layout, int i10) {
        return layout.getLineTop(i10 + 1) - layout.getLineTop(i10);
    }

    public abstract void draw(@NotNull Canvas canvas, @NotNull Layout layout, int startLine, int endLine, int startOffset, int endOffset, @Nullable xt border, @Nullable st background);

    protected final int getLineBottom(@NotNull Layout layout, int line) {
        int lineBottomWithoutSpacing = getLineBottomWithoutSpacing(layout, line);
        return line == layout.getLineCount() + (-1) ? lineBottomWithoutSpacing - layout.getBottomPadding() : lineBottomWithoutSpacing;
    }

    protected final int getLineTop(@NotNull Layout layout, int line) {
        int lineTop = layout.getLineTop(line);
        return line == 0 ? lineTop - layout.getTopPadding() : lineTop;
    }
}
