package com.yandex.div.internal.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.widget.FixedLineHeightHelper;
import com.yandex.div.core.widget.FixedLineHeightView;
import com.yandex.div.core.widget.ViewsKt;
import kotlin.Metadata;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001e\u001a\u00020\bH\u0016J\b\u0010\u001f\u001a\u00020\bH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0014J(\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0014J*\u0010)\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\bH\u0014J\u0010\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u000201H\u0017J\b\u00102\u001a\u00020!H\u0002J\u0010\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\u0016H\u0002J\u0010\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020\u0016H\u0016J\u0018\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020:H\u0016J\u0012\u0010;\u001a\u00020!2\b\b\u0002\u0010&\u001a\u00020\bH\u0002R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b8V@VX\u0096\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012*\u0004\b\r\u0010\u000eR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u001c\u001a\u00020\b8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0010¨\u0006<"}, d2 = {"Lcom/yandex/div/internal/widget/SuperLineHeightEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Lcom/yandex/div/core/widget/FixedLineHeightView;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentLineCount", "<set-?>", "fixedLineHeight", "getFixedLineHeight$delegate", "(Lcom/yandex/div/internal/widget/SuperLineHeightEditText;)Ljava/lang/Object;", "getFixedLineHeight", "()I", "setFixedLineHeight", "(I)V", "fixedLineHeightHelper", "Lcom/yandex/div/core/widget/FixedLineHeightHelper;", "horizontalScrollingEnabled", "", "interceptTouchEventNeeded", "getInterceptTouchEventNeeded", "()Z", "isDisallowInterceptTouchEvent", "isTextFitting", "visibleLineCount", "getVisibleLineCount", "getCompoundPaddingBottom", "getCompoundPaddingTop", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "h", "oldw", "oldh", "onTextChanged", "text", "", "start", "lengthBefore", "lengthAfter", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "remeasureWrapContentConstrained", "requestDisallowInterceptTouchEvent", "enabled", "setHorizontallyScrolling", "whether", "setTextSize", "unit", "size", "", "updateFittingText", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class SuperLineHeightEditText extends AppCompatEditText implements FixedLineHeightView {
    private int currentLineCount;

    @NotNull
    private final FixedLineHeightHelper fixedLineHeightHelper;
    private boolean horizontalScrollingEnabled;
    private boolean isDisallowInterceptTouchEvent;
    private boolean isTextFitting;

    public SuperLineHeightEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.isTextFitting = true;
        this.fixedLineHeightHelper = new FixedLineHeightHelper(this);
    }

    private final boolean getInterceptTouchEventNeeded() {
        return (this.horizontalScrollingEnabled || this.isTextFitting) ? false : true;
    }

    private final int getVisibleLineCount() {
        if (getLineCount() == 0) {
            return 1;
        }
        return getLineCount() > getMaxLines() ? getMaxLines() : getLineCount();
    }

    private final void remeasureWrapContentConstrained() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || layoutParams.height != -3) {
            this.currentLineCount = getLineCount() != 0 ? getLineCount() > getMaxLines() ? getMaxLines() : getLineCount() : 1;
            return;
        }
        if (this.currentLineCount != (getLineCount() == 0 ? 1 : getLineCount() > getMaxLines() ? getMaxLines() : getLineCount())) {
            this.currentLineCount = getLineCount() != 0 ? getLineCount() > getMaxLines() ? getMaxLines() : getLineCount() : 1;
            requestLayout();
        }
    }

    private final void requestDisallowInterceptTouchEvent(boolean enabled) {
        this.isDisallowInterceptTouchEvent = enabled;
        getParent().requestDisallowInterceptTouchEvent(enabled);
    }

    private final void updateFittingText(int h10) {
        if (getLayout() == null || h10 == 0) {
            return;
        }
        this.isTextFitting = (h10 - getCompoundPaddingTop()) - getCompoundPaddingBottom() >= TextViewsKt.textHeight(this, getLayout().getLineCount());
    }

    static /* synthetic */ void updateFittingText$default(SuperLineHeightEditText superLineHeightEditText, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateFittingText");
        }
        if ((i11 & 1) != 0) {
            i10 = superLineHeightEditText.getHeight();
        }
        superLineHeightEditText.updateFittingText(i10);
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.fixedLineHeightHelper.getTextPaddingBottom();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.fixedLineHeightHelper.getTextPaddingTop();
    }

    public int getFixedLineHeight() {
        return this.fixedLineHeightHelper.getLineHeight();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        FixedLineHeightHelper fixedLineHeightHelper = this.fixedLineHeightHelper;
        int maxLines = getLineCount() == 0 ? 1 : getLineCount() > getMaxLines() ? getMaxLines() : getLineCount();
        if (fixedLineHeightHelper.getLineHeight() == -1 || ViewsKt.isExact(heightMeasureSpec)) {
            return;
        }
        int iE = g.e(TextViewsKt.textHeight(fixedLineHeightHelper.view, maxLines) + (maxLines >= fixedLineHeightHelper.view.getLineCount() ? fixedLineHeightHelper.textPaddingTop + fixedLineHeightHelper.textPaddingBottom : 0) + fixedLineHeightHelper.view.getPaddingTop() + fixedLineHeightHelper.view.getPaddingBottom(), fixedLineHeightHelper.view.getMinimumHeight());
        super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE ? ViewsKt.makeAtMostSpec(Math.min(iE, View.MeasureSpec.getSize(heightMeasureSpec))) : ViewsKt.makeExactSpec(iE));
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        updateFittingText(h10);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(@Nullable CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        if (Build.VERSION.SDK_INT < 28) {
            remeasureWrapContentConstrained();
        }
        updateFittingText$default(this, 0, 1, null);
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        if (!getInterceptTouchEventNeeded()) {
            if (this.isDisallowInterceptTouchEvent) {
                requestDisallowInterceptTouchEvent(false);
            }
            return super.onTouchEvent(event);
        }
        int action = event.getAction() & 255;
        if (action == 0) {
            requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(event);
    }

    @Override // com.yandex.div.core.widget.FixedLineHeightView
    public void setFixedLineHeight(int i10) {
        this.fixedLineHeightHelper.setLineHeight(i10);
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean whether) {
        this.horizontalScrollingEnabled = whether;
        super.setHorizontallyScrolling(whether);
    }

    @Override // android.widget.TextView
    public void setTextSize(int unit, float size) {
        super.setTextSize(unit, size);
        this.fixedLineHeightHelper.onFontSizeChanged();
    }
}
