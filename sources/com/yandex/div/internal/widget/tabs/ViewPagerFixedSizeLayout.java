package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001%B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014J\u0010\u0010 \u001a\u00020\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0016\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/yandex/div/internal/widget/tabs/ViewPagerFixedSizeLayout;", "Landroid/widget/FrameLayout;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_collapsiblePaddingBottom", "animateOnScroll", "", "getAnimateOnScroll", "()Z", "setAnimateOnScroll", "(Z)V", "padding", "collapsiblePaddingBottom", "getCollapsiblePaddingBottom", "()I", "setCollapsiblePaddingBottom", "(I)V", "heightCalculator", "Lcom/yandex/div/internal/widget/tabs/ViewPagerFixedSizeLayout$HeightCalculator;", "lastHeightMeasureSpec", "Ljava/lang/Integer;", "visibleRect", "Landroid/graphics/Rect;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setHeightCalculator", "shouldRequestLayoutOnScroll", C4240b4.i.L, "positionOffset", "", "HeightCalculator", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewPagerFixedSizeLayout extends FrameLayout {
    private int _collapsiblePaddingBottom;
    private boolean animateOnScroll;

    @Nullable
    private HeightCalculator heightCalculator;

    @Nullable
    private Integer lastHeightMeasureSpec;

    @Nullable
    private Rect visibleRect;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/yandex/div/internal/widget/tabs/ViewPagerFixedSizeLayout$HeightCalculator;", "", "", C4240b4.i.L, "", "positionOffset", "", "setPositionAndOffsetForMeasure", "(IF)V", "widthMeasureSpec", "heightMeasureSpec", "measureHeight", "(II)I", "", "shouldRequestLayoutOnScroll", "(IF)Z", "dropMeasureCache", "()V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface HeightCalculator {
        void dropMeasureCache();

        int measureHeight(int widthMeasureSpec, int heightMeasureSpec);

        void setPositionAndOffsetForMeasure(int position, float positionOffset);

        boolean shouldRequestLayoutOnScroll(int position, float positionOffset);
    }

    public /* synthetic */ ViewPagerFixedSizeLayout(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final boolean getAnimateOnScroll() {
        return this.animateOnScroll;
    }

    /* JADX INFO: renamed from: getCollapsiblePaddingBottom, reason: from getter */
    public final int get_collapsiblePaddingBottom() {
        return this._collapsiblePaddingBottom;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.lastHeightMeasureSpec = Integer.valueOf(heightMeasureSpec);
        HeightCalculator heightCalculator = this.heightCalculator;
        if (heightCalculator != null) {
            Intrinsics.checkNotNull(heightCalculator);
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(heightCalculator.measureHeight(widthMeasureSpec, heightMeasureSpec), 1073741824);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setAnimateOnScroll(boolean z10) {
        this.animateOnScroll = z10;
    }

    public final void setCollapsiblePaddingBottom(int i10) {
        if (this._collapsiblePaddingBottom != i10) {
            this._collapsiblePaddingBottom = i10;
        }
    }

    public final void setHeightCalculator(@Nullable HeightCalculator heightCalculator) {
        this.heightCalculator = heightCalculator;
    }

    public final boolean shouldRequestLayoutOnScroll(int position, float positionOffset) {
        HeightCalculator heightCalculator;
        if (this.animateOnScroll && (heightCalculator = this.heightCalculator) != null && heightCalculator.shouldRequestLayoutOnScroll(position, positionOffset)) {
            Rect rect = this.visibleRect;
            if (rect == null) {
                rect = new Rect();
                this.visibleRect = rect;
            }
            getLocalVisibleRect(rect);
            if (rect.height() == getHeight()) {
                return true;
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824);
            Integer num = this.lastHeightMeasureSpec;
            int iMeasureHeight = heightCalculator.measureHeight(iMakeMeasureSpec, num != null ? num.intValue() : View.MeasureSpec.makeMeasureSpec(0, 0));
            if (iMeasureHeight != getHeight()) {
                int i10 = rect.top;
                if (iMeasureHeight <= rect.bottom && i10 <= iMeasureHeight) {
                    return true;
                }
            }
        }
        return false;
    }

    public ViewPagerFixedSizeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.animateOnScroll = true;
    }
}
