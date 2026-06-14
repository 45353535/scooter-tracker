package com.yandex.div.internal.widget.indicator.animations;

import android.animation.ArgbEvaluator;
import android.graphics.RectF;
import android.util.SparseArray;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c8.a;
import com.ironsource.C4240b4;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.internal.widget.indicator.Style;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0003J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\bH\u0002J*\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0002J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u000bH\u0016J\u0010\u0010%\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0018\u0010&\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u000bH\u0002J\u0010\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/animations/ScaleIndicatorAnimator;", "Lcom/yandex/div/internal/widget/indicator/animations/IndicatorAnimator;", "styleParams", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Style;", "(Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Style;)V", "colorEvaluator", "Landroid/animation/ArgbEvaluator;", "itemsCount", "", "itemsScale", "Landroid/util/SparseArray;", "", "calculateColor", "scaleOffset", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "getBorderColorAt", C4240b4.i.L, "getBorderWidthAt", "getColorAt", "getItemSizeAt", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "getScaleAt", "getSelectedItemRect", "Landroid/graphics/RectF;", "xOffset", "yOffset", "viewportWidth", "isLayoutRtl", "", "interpolate", "src", "dst", "fraction", "onPageScrolled", "", "positionOffset", "onPageSelected", "scaleIndicatorByOffset", "offset", "setItemsCount", "count", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScaleIndicatorAnimator implements IndicatorAnimator {
    private int itemsCount;

    @NotNull
    private final Style styleParams;

    @NotNull
    private final ArgbEvaluator colorEvaluator = new ArgbEvaluator();

    @NotNull
    private final SparseArray<Float> itemsScale = new SparseArray<>();

    public ScaleIndicatorAnimator(@NotNull Style style) {
        this.styleParams = style;
    }

    @ColorInt
    private final int calculateColor(@FloatRange(from = 0.0d, to = 1.0d) float scaleOffset, int from, int to) {
        Object objEvaluate = this.colorEvaluator.evaluate(scaleOffset, Integer.valueOf(from), Integer.valueOf(to));
        Intrinsics.checkNotNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objEvaluate).intValue();
    }

    private final float getScaleAt(int position) {
        return this.itemsScale.get(position, Float.valueOf(0.0f)).floatValue();
    }

    private final float interpolate(float src, float dst, float fraction) {
        return src + ((dst - src) * fraction);
    }

    private final void scaleIndicatorByOffset(int position, float offset) {
        if (offset == 0.0f) {
            this.itemsScale.remove(position);
        } else {
            this.itemsScale.put(position, Float.valueOf(Math.abs(offset)));
        }
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getBorderColorAt(int position) {
        IndicatorParams$Shape activeShape = this.styleParams.getActiveShape();
        if (!(activeShape instanceof IndicatorParams$Shape.RoundedRect)) {
            return 0;
        }
        IndicatorParams$Shape inactiveShape = this.styleParams.getInactiveShape();
        Intrinsics.checkNotNull(inactiveShape, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        return calculateColor(getScaleAt(position), ((IndicatorParams$Shape.RoundedRect) inactiveShape).getStrokeColor(), ((IndicatorParams$Shape.RoundedRect) activeShape).getStrokeColor());
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public float getBorderWidthAt(int position) {
        IndicatorParams$Shape activeShape = this.styleParams.getActiveShape();
        if (!(activeShape instanceof IndicatorParams$Shape.RoundedRect)) {
            return 0.0f;
        }
        IndicatorParams$Shape inactiveShape = this.styleParams.getInactiveShape();
        Intrinsics.checkNotNull(inactiveShape, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) inactiveShape;
        return roundedRect.getStrokeWidth() + ((((IndicatorParams$Shape.RoundedRect) activeShape).getStrokeWidth() - roundedRect.getStrokeWidth()) * getScaleAt(position));
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getColorAt(int position) {
        return calculateColor(getScaleAt(position), this.styleParams.getInactiveShape().getColor(), this.styleParams.getActiveShape().getColor());
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    @NotNull
    public IndicatorParams$ItemSize getItemSizeAt(int position) {
        IndicatorParams$Shape activeShape = this.styleParams.getActiveShape();
        if (activeShape instanceof IndicatorParams$Shape.Circle) {
            IndicatorParams$Shape inactiveShape = this.styleParams.getInactiveShape();
            Intrinsics.checkNotNull(inactiveShape, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.Circle");
            return new IndicatorParams$ItemSize.Circle(interpolate(((IndicatorParams$Shape.Circle) inactiveShape).getItemSize().getRadius(), ((IndicatorParams$Shape.Circle) activeShape).getItemSize().getRadius(), getScaleAt(position)));
        }
        if (!(activeShape instanceof IndicatorParams$Shape.RoundedRect)) {
            throw new m();
        }
        IndicatorParams$Shape inactiveShape2 = this.styleParams.getInactiveShape();
        Intrinsics.checkNotNull(inactiveShape2, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) inactiveShape2;
        IndicatorParams$Shape.RoundedRect roundedRect2 = (IndicatorParams$Shape.RoundedRect) activeShape;
        return new IndicatorParams$ItemSize.RoundedRect(interpolate(roundedRect.getItemSize().getItemWidth() + roundedRect.getStrokeWidth(), roundedRect2.getItemSize().getItemWidth() + roundedRect2.getStrokeWidth(), getScaleAt(position)), interpolate(roundedRect.getItemSize().getItemHeight() + roundedRect.getStrokeWidth(), roundedRect2.getItemSize().getItemHeight() + roundedRect2.getStrokeWidth(), getScaleAt(position)), interpolate(roundedRect.getItemSize().getCornerRadius(), roundedRect2.getItemSize().getCornerRadius(), getScaleAt(position)));
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    @Nullable
    public RectF getSelectedItemRect(float xOffset, float yOffset, float viewportWidth, boolean isLayoutRtl) {
        return null;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void onPageScrolled(int position, float positionOffset) {
        scaleIndicatorByOffset(position, 1.0f - positionOffset);
        int i10 = this.itemsCount;
        if (position < i10 - 1) {
            scaleIndicatorByOffset(position + 1, positionOffset);
        } else if (i10 > 1) {
            scaleIndicatorByOffset(0, positionOffset);
        }
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void onPageSelected(int position) {
        this.itemsScale.clear();
        this.itemsScale.put(position, Float.valueOf(1.0f));
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public /* synthetic */ void overrideItemWidth(float f10) {
        a.b(this, f10);
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void setItemsCount(int count) {
        this.itemsCount = count;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public /* synthetic */ void updateSpaceBetweenCenters(float f10) {
        a.d(this, f10);
    }
}
