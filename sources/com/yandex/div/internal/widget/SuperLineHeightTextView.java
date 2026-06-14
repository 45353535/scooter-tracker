package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.widget.FixedLineHeightHelper;
import com.yandex.div.core.widget.FixedLineHeightView;
import com.yandex.div.core.widget.ViewsKt;
import kotlin.Metadata;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR*\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R\u0015\u0010#\u001a\u00020\u00078Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0016R+\u0010*\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00078V@VX\u0096\u008e\u0002¢\u0006\u0012\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010'*\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/yandex/div/internal/widget/SuperLineHeightTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lcom/yandex/div/core/widget/FixedLineHeightView;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "unit", "", "size", "", "setTextSize", "(IF)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "getCompoundPaddingTop", "()I", "getCompoundPaddingBottom", "Lcom/yandex/div/core/widget/FixedLineHeightHelper;", "fixedLineHeightHelper", "Lcom/yandex/div/core/widget/FixedLineHeightHelper;", "", "value", "isTightenWidth", "Z", "()Z", "setTightenWidth", "(Z)V", "getVisibleLineCount", "visibleLineCount", "<set-?>", "getFixedLineHeight", "setFixedLineHeight", "(I)V", "getFixedLineHeight$delegate", "(Lcom/yandex/div/internal/widget/SuperLineHeightTextView;)Ljava/lang/Object;", "fixedLineHeight", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class SuperLineHeightTextView extends AppCompatTextView implements FixedLineHeightView {

    @NotNull
    private final FixedLineHeightHelper fixedLineHeightHelper;
    private boolean isTightenWidth;

    public SuperLineHeightTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.fixedLineHeightHelper = new FixedLineHeightHelper(this);
    }

    private final int getVisibleLineCount() {
        return Math.min(getLineCount(), getMaxLines());
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

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        FixedLineHeightHelper fixedLineHeightHelper = this.fixedLineHeightHelper;
        int iMin = Math.min(getLineCount(), getMaxLines());
        if (fixedLineHeightHelper.getLineHeight() != -1 && !ViewsKt.isExact(heightMeasureSpec)) {
            int iE = g.e(TextViewsKt.textHeight(fixedLineHeightHelper.view, iMin) + (iMin >= fixedLineHeightHelper.view.getLineCount() ? fixedLineHeightHelper.textPaddingTop + fixedLineHeightHelper.textPaddingBottom : 0) + fixedLineHeightHelper.view.getPaddingTop() + fixedLineHeightHelper.view.getPaddingBottom(), fixedLineHeightHelper.view.getMinimumHeight());
            super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE ? ViewsKt.makeAtMostSpec(Math.min(iE, View.MeasureSpec.getSize(heightMeasureSpec))) : ViewsKt.makeExactSpec(iE));
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams != null && this.isTightenWidth && ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -3 && divLayoutParams.getMaxWidth() != Integer.MAX_VALUE) {
            int lineCount = getLayout().getLineCount();
            float fMax = 0.0f;
            for (int i10 = 0; i10 < lineCount; i10++) {
                fMax = Math.max(fMax, getLayout().getLineWidth(i10));
            }
            int iCeil = (int) Math.ceil(fMax + getCompoundPaddingLeft() + getCompoundPaddingRight());
            if (iCeil < getMeasuredWidth()) {
                super.setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(iCeil, View.MeasureSpec.getMode(getMeasuredWidthAndState())), getMeasuredHeightAndState());
            }
        }
    }

    @Override // com.yandex.div.core.widget.FixedLineHeightView
    public void setFixedLineHeight(int i10) {
        this.fixedLineHeightHelper.setLineHeight(i10);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int unit, float size) {
        super.setTextSize(unit, size);
        this.fixedLineHeightHelper.onFontSizeChanged();
    }

    public final void setTightenWidth(boolean z10) {
        boolean z11 = this.isTightenWidth;
        this.isTightenWidth = z10;
        if (z11 != z10) {
            requestLayout();
        }
    }
}
