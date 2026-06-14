package com.yandex.div.core.view2.divs.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.widget.DivLayoutParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0014J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0014J0\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0014J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0014J\u0012\u0010\u001b\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemLayout;", "Lcom/yandex/div/core/widget/DivViewWrapper;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "addView", "", "child", "Landroid/view/View;", FirebaseAnalytics.Param.INDEX, "", "params", "Landroid/view/ViewGroup$LayoutParams;", "checkLayoutParams", "", "generateDefaultLayoutParams", "generateLayoutParams", "childLayoutParams", "onLayout", "changed", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setLayoutParams", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivGalleryItemLayout extends DivViewWrapper {
    public DivGalleryItemLayout(@NotNull Context context) {
        super(context, null, 0, 6, null);
    }

    @Override // com.yandex.div.core.widget.DivViewWrapper, android.view.ViewGroup
    public void addView(@Nullable View child, int index, @Nullable ViewGroup.LayoutParams params) {
        super.addView(child, 0, params);
        if (getLayoutParams() == null) {
            if ((child != null ? child.getLayoutParams() : null) != null) {
                setLayoutParams(child.getLayoutParams());
            }
        }
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    protected boolean checkLayoutParams(@Nullable ViewGroup.LayoutParams params) {
        return params == null || !Intrinsics.areEqual(params, getLayoutParams());
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    @NotNull
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return layoutParams instanceof DivLayoutParams ? layoutParams : layoutParams == null ? new DivLayoutParams(-2, -2) : super.generateLayoutParams(layoutParams);
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    @NotNull
    protected ViewGroup.LayoutParams generateLayoutParams(@Nullable ViewGroup.LayoutParams childLayoutParams) {
        return DivGalleryItemLayoutKt.setBy(generateDefaultLayoutParams(), childLayoutParams);
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View child = getChild();
        if (child != null) {
            child.layout(0, 0, right - left, bottom - top);
        }
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        View child = getChild();
        if (child != null) {
            child.measure(widthMeasureSpec, heightMeasureSpec);
            setMeasuredDimension(child.getMeasuredWidthAndState(), child.getMeasuredHeightAndState());
        } else {
            setMeasuredDimension(View.resolveSizeAndState(getPaddingLeft() + getSuggestedMinimumWidth() + getPaddingRight(), widthMeasureSpec, 0), View.resolveSizeAndState(getPaddingTop() + getSuggestedMinimumHeight() + getPaddingBottom(), heightMeasureSpec, 0));
        }
    }

    @Override // android.view.View
    public void setLayoutParams(@Nullable ViewGroup.LayoutParams params) {
        View child = getChild();
        if (child == null) {
            super.setLayoutParams(params);
            return;
        }
        if (params != null) {
            DivGalleryItemLayoutKt.setBy(params, child.getLayoutParams());
        }
        super.setLayoutParams(params);
        child.setLayoutParams(params);
    }
}
