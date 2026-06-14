package com.yandex.div.internal.widget.slider;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.R$string;
import com.yandex.div.internal.widget.slider.SliderView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.Metadata;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0014J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\"\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0017H\u0014J\u0018\u0010 \u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010!\u001a\u00020\rH\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\bH\u0002J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\bH\u0002J\f\u0010&\u001a\u00020'*\u00020\bH\u0002J\f\u0010(\u001a\u00020\r*\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006)"}, d2 = {"Lcom/yandex/div/internal/widget/slider/SliderAccessibilityHelper;", "Landroidx/customview/widget/ExploreByTouchHelper;", "slider", "Lcom/yandex/div/internal/widget/slider/SliderView;", "(Lcom/yandex/div/internal/widget/slider/SliderView;)V", "bounds", "Landroid/graphics/Rect;", "step", "", "getStep", "()I", "getVirtualViewAt", "x", "", "y", "getVisibleVirtualViews", "", "virtualViewIds", "", "onInitializeAccessibilityNodeInfo", "host", "Landroid/view/View;", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "onPerformActionForVirtualView", "", "virtualViewId", "action", "arguments", "Landroid/os/Bundle;", "onPopulateNodeForVirtualView", "node", "setThumbValue", "value", "startOrEndDescription", "", "updateBounds", FirebaseAnalytics.Param.INDEX, "toThumb", "Lcom/yandex/div/internal/widget/slider/SliderView$Thumb;", "toThumbValue", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SliderAccessibilityHelper extends ExploreByTouchHelper {

    @NotNull
    private final Rect bounds;

    @NotNull
    private final SliderView slider;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SliderView.Thumb.values().length];
            try {
                iArr[SliderView.Thumb.THUMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SliderView.Thumb.THUMB_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SliderAccessibilityHelper(@NotNull SliderView sliderView) {
        super(sliderView);
        this.slider = sliderView;
        this.bounds = new Rect();
        ViewCompat.setAccessibilityDelegate(sliderView, this);
        sliderView.setAccessibilityLiveRegion(1);
    }

    private final int getStep() {
        return Math.max(zf.a.c(((double) (this.slider.getMaxValue() - this.slider.getMinValue())) * 0.05d), 1);
    }

    private final void setThumbValue(int virtualViewId, float value) {
        this.slider.setValueToAccessibilityThumb$div_release(toThumb(virtualViewId), value);
        sendEventForVirtualView(virtualViewId, 4);
        invalidateVirtualView(virtualViewId);
    }

    private final String startOrEndDescription(int virtualViewId) {
        return this.slider.getThumbSecondaryValue() == null ? "" : virtualViewId == 0 ? this.slider.getContext().getString(R$string.div_slider_range_start) : virtualViewId == 1 ? this.slider.getContext().getString(R$string.div_slider_range_end) : "";
    }

    private final SliderView.Thumb toThumb(int i10) {
        return i10 == 0 ? SliderView.Thumb.THUMB : this.slider.getThumbSecondaryValue() != null ? SliderView.Thumb.THUMB_SECONDARY : SliderView.Thumb.THUMB;
    }

    private final float toThumbValue(int i10) {
        if (i10 == 0) {
            return this.slider.getThumbValue();
        }
        Float thumbSecondaryValue = this.slider.getThumbSecondaryValue();
        return thumbSecondaryValue != null ? thumbSecondaryValue.floatValue() : this.slider.getThumbValue();
    }

    private final void updateBounds(int index) {
        int boundsWidth;
        int boundsHeight;
        if (index == 1) {
            SliderView.Companion companion = SliderView.INSTANCE;
            boundsWidth = companion.getBoundsWidth(this.slider.getThumbSecondaryDrawable());
            boundsHeight = companion.getBoundsHeight(this.slider.getThumbSecondaryDrawable());
        } else {
            SliderView.Companion companion2 = SliderView.INSTANCE;
            boundsWidth = companion2.getBoundsWidth(this.slider.getThumbDrawable());
            boundsHeight = companion2.getBoundsHeight(this.slider.getThumbDrawable());
        }
        int positionInView$div_release = this.slider.getPositionInView$div_release(toThumbValue(index));
        Rect rect = this.bounds;
        rect.left = positionInView$div_release;
        rect.right = positionInView$div_release + boundsWidth;
        rect.top = (((this.slider.getHeight() + this.slider.getPaddingTop()) - this.slider.getPaddingBottom()) - boundsHeight) / 2;
        rect.bottom = (((this.slider.getHeight() + this.slider.getPaddingTop()) - this.slider.getPaddingBottom()) + boundsHeight) / 2;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    protected int getVirtualViewAt(float x10, float y10) {
        if (x10 < this.slider.getPaddingLeft()) {
            return 0;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.slider.getClosestThumb$div_release((int) x10).ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new m();
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    protected void getVisibleVirtualViews(@NotNull List<Integer> virtualViewIds) {
        virtualViewIds.add(0);
        if (this.slider.getThumbSecondaryValue() != null) {
            virtualViewIds.add(1);
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    protected boolean onPerformActionForVirtualView(int virtualViewId, int action, @Nullable Bundle arguments) {
        float thumbValue;
        if (action == 4096) {
            thumbValue = toThumbValue(virtualViewId) + getStep();
        } else if (action == 8192) {
            thumbValue = toThumbValue(virtualViewId) - getStep();
        } else {
            if (action != 16908349 || arguments == null || !arguments.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)) {
                return false;
            }
            thumbValue = arguments.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE);
        }
        setThumbValue(virtualViewId, thumbValue);
        return true;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    protected void onPopulateNodeForVirtualView(int virtualViewId, @NotNull AccessibilityNodeInfoCompat node) {
        node.setClassName(SeekBar.class.getName());
        node.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(0, this.slider.getMinValue(), this.slider.getMaxValue(), toThumbValue(virtualViewId)));
        StringBuilder sb2 = new StringBuilder();
        CharSequence contentDescription = this.slider.getContentDescription();
        if (contentDescription != null) {
            sb2.append(contentDescription);
            sb2.append(StringUtils.COMMA);
        }
        sb2.append(startOrEndDescription(virtualViewId));
        node.setContentDescription(sb2.toString());
        node.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
        node.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
        updateBounds(virtualViewId);
        node.setBoundsInParent(this.bounds);
    }
}
