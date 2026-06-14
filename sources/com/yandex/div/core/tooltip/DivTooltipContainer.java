package com.yandex.div.core.tooltip;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.Assert;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0017\u001a\u00020\u00162\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/core/tooltip/DivTooltipContainer;", "Lcom/yandex/div/core/widget/DivViewWrapper;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/view/View;", "child", "", "drawingTime", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", FirebaseAnalytics.Param.INDEX, "Landroid/view/ViewGroup$LayoutParams;", "params", "", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "getTooltipView", "()Landroid/view/View;", "tooltipView", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivTooltipContainer extends DivViewWrapper {
    public /* synthetic */ DivTooltipContainer(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // com.yandex.div.core.widget.DivViewWrapper, android.view.ViewGroup
    public void addView(@Nullable View child, int index, @Nullable ViewGroup.LayoutParams params) {
        if (getChildCount() == 1) {
            Assert.fail("Adding more than one child view to DivTooltipContainer is not allowed.");
        } else {
            super.addView(child, index, params);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @Nullable View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @Nullable
    public View getTooltipView() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }

    public DivTooltipContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
    }
}
