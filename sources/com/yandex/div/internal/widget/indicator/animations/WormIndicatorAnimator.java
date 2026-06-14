package com.yandex.div.internal.widget.indicator.animations;

import android.graphics.RectF;
import c8.a;
import com.ironsource.C4240b4;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.internal.widget.indicator.Style;
import kotlin.Metadata;
import kotlin.ranges.g;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/animations/WormIndicatorAnimator;", "Lcom/yandex/div/internal/widget/indicator/animations/IndicatorAnimator;", "styleParams", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Style;", "(Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Style;)V", "inactiveItemSizeWithBorders", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "itemRect", "Landroid/graphics/RectF;", "itemWidthOverride", "", "selectedPositionOffset", "spaceBetweenCenters", "getBorderColorAt", "", C4240b4.i.L, "getBorderWidthAt", "getColorAt", "getItemSizeAt", "getSelectedItemRect", "xOffset", "yOffset", "viewportWidth", "isLayoutRtl", "", "onPageScrolled", "", "positionOffset", "overrideItemWidth", "width", "updateSpaceBetweenCenters", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WormIndicatorAnimator implements IndicatorAnimator {

    @NotNull
    private final IndicatorParams$ItemSize inactiveItemSizeWithBorders;

    @NotNull
    private final RectF itemRect = new RectF();
    private float itemWidthOverride;
    private float selectedPositionOffset;
    private float spaceBetweenCenters;

    @NotNull
    private final Style styleParams;

    public WormIndicatorAnimator(@NotNull Style style) {
        IndicatorParams$ItemSize indicatorParams$ItemSizeCopy$default;
        this.styleParams = style;
        IndicatorParams$Shape inactiveShape = style.getInactiveShape();
        if (inactiveShape instanceof IndicatorParams$Shape.Circle) {
            indicatorParams$ItemSizeCopy$default = ((IndicatorParams$Shape.Circle) inactiveShape).getItemSize();
        } else {
            if (!(inactiveShape instanceof IndicatorParams$Shape.RoundedRect)) {
                throw new m();
            }
            IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) inactiveShape;
            indicatorParams$ItemSizeCopy$default = IndicatorParams$ItemSize.RoundedRect.copy$default(roundedRect.getItemSize(), roundedRect.getItemSize().getItemWidth() + roundedRect.getStrokeWidth(), roundedRect.getItemSize().getItemHeight() + roundedRect.getStrokeWidth(), 0.0f, 4, null);
        }
        this.inactiveItemSizeWithBorders = indicatorParams$ItemSizeCopy$default;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getBorderColorAt(int position) {
        return this.styleParams.getInactiveShape().getBorderColor();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public float getBorderWidthAt(int position) {
        return this.styleParams.getInactiveShape().getBorderWidth();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getColorAt(int position) {
        return this.styleParams.getInactiveShape().getColor();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    @NotNull
    public IndicatorParams$ItemSize getItemSizeAt(int position) {
        return this.inactiveItemSizeWithBorders;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    @NotNull
    public RectF getSelectedItemRect(float xOffset, float yOffset, float viewportWidth, boolean isLayoutRtl) {
        float width = this.itemWidthOverride;
        if (width == 0.0f) {
            width = this.styleParams.getActiveShape().getItemSize().getWidth();
        }
        this.itemRect.top = yOffset - (this.styleParams.getActiveShape().getItemSize().getHeight() / 2.0f);
        if (isLayoutRtl) {
            float f10 = width / 2.0f;
            this.itemRect.right = (xOffset - g.d((this.spaceBetweenCenters * (this.selectedPositionOffset - 0.5f)) * 2.0f, 0.0f)) + f10;
            RectF rectF = this.itemRect;
            float f11 = this.spaceBetweenCenters;
            rectF.left = (xOffset - g.i((this.selectedPositionOffset * f11) * 2.0f, f11)) - f10;
        } else {
            RectF rectF2 = this.itemRect;
            float f12 = this.spaceBetweenCenters;
            float f13 = width / 2.0f;
            rectF2.right = g.i(this.selectedPositionOffset * f12 * 2.0f, f12) + xOffset + f13;
            this.itemRect.left = (xOffset + g.d((this.spaceBetweenCenters * (this.selectedPositionOffset - 0.5f)) * 2.0f, 0.0f)) - f13;
        }
        this.itemRect.bottom = yOffset + (this.styleParams.getActiveShape().getItemSize().getHeight() / 2.0f);
        RectF rectF3 = this.itemRect;
        float f14 = rectF3.left;
        if (f14 < 0.0f) {
            rectF3.offset(-f14, 0.0f);
        }
        RectF rectF4 = this.itemRect;
        float f15 = rectF4.right;
        if (f15 > viewportWidth) {
            rectF4.offset(-(f15 - viewportWidth), 0.0f);
        }
        return this.itemRect;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void onPageScrolled(int position, float positionOffset) {
        this.selectedPositionOffset = positionOffset;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public /* synthetic */ void onPageSelected(int i10) {
        a.a(this, i10);
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void overrideItemWidth(float width) {
        this.itemWidthOverride = width;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public /* synthetic */ void setItemsCount(int i10) {
        a.c(this, i10);
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void updateSpaceBetweenCenters(float spaceBetweenCenters) {
        this.spaceBetweenCenters = spaceBetweenCenters;
    }
}
