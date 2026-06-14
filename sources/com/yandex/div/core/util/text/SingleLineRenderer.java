package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import androidx.compose.material.OutlinedTextFieldKt;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.json.expressions.ExpressionResolver;
import io.appmetrica.analytics.impl.H2;
import k8.st;
import k8.xt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JS\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/core/util/text/SingleLineRenderer;", "Lcom/yandex/div/core/util/text/DivTextRangesBackgroundRenderer;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "<init>", "(Landroid/view/View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/text/Layout;", "layout", "", "startLine", "endLine", "startOffset", "endOffset", "Lk8/xt;", OutlinedTextFieldKt.BorderId, "Lk8/st;", H2.f75840g, "", "draw", "(Landroid/graphics/Canvas;Landroid/text/Layout;IIIILk8/xt;Lk8/st;)V", "Landroid/view/View;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SingleLineRenderer extends DivTextRangesBackgroundRenderer {

    @NotNull
    private final ExpressionResolver resolver;

    @NotNull
    private final View view;

    public SingleLineRenderer(@NotNull View view, @NotNull ExpressionResolver expressionResolver) {
        this.view = view;
        this.resolver = expressionResolver;
    }

    @Override // com.yandex.div.core.util.text.DivTextRangesBackgroundRenderer
    public void draw(@NotNull Canvas canvas, @NotNull Layout layout, int startLine, int endLine, int startOffset, int endOffset, @Nullable xt border, @Nullable st background) {
        new BackgroundDrawer(this.view.getResources().getDisplayMetrics(), border, background, canvas, this.resolver).drawBackground(Math.min(startOffset, endOffset), getLineTop(layout, startLine), Math.max(startOffset, endOffset), getLineBottom(layout, startLine));
    }
}
