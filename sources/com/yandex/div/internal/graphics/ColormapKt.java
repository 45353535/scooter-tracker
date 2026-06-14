package com.yandex.div.internal.graphics;

import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.view2.Div2View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"checkIsNotEmpty", "Lcom/yandex/div/internal/graphics/Colormap;", "divView", "Lcom/yandex/div/core/view2/Div2View;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ColormapKt {
    @NotNull
    public static final Colormap checkIsNotEmpty(@NotNull Colormap colormap, @NotNull Div2View div2View) {
        if (Intrinsics.areEqual(colormap, Colormap.EMPTY)) {
            DivActionTypedUtilsKt.logError(div2View, new IllegalStateException("Colors for linear gradient are not provided. Please check if 'colors' or 'color_map' properties are defined"));
        }
        return colormap;
    }
}
