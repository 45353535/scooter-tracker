package com.yandex.div.internal.widget.indicator;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.yandex.div.internal.widget.indicator.IndicatorParams$Style, reason: from toString */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"com/yandex/div/internal/widget/indicator/IndicatorParams$Style", "", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Animation;", "animation", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "activeShape", "inactiveShape", "minimumShape", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement;", "itemsPlacement", "<init>", "(Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Animation;Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Animation;", "getAnimation", "()Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Animation;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "getActiveShape", "()Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "getInactiveShape", "getMinimumShape", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement;", "getItemsPlacement", "()Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Style {

    @NotNull
    private final IndicatorParams$Shape activeShape;

    @NotNull
    private final IndicatorParams$Animation animation;

    @NotNull
    private final IndicatorParams$Shape inactiveShape;

    @NotNull
    private final IndicatorParams$ItemPlacement itemsPlacement;

    @NotNull
    private final IndicatorParams$Shape minimumShape;

    public Style(@NotNull IndicatorParams$Animation indicatorParams$Animation, @NotNull IndicatorParams$Shape indicatorParams$Shape, @NotNull IndicatorParams$Shape indicatorParams$Shape2, @NotNull IndicatorParams$Shape indicatorParams$Shape3, @NotNull IndicatorParams$ItemPlacement indicatorParams$ItemPlacement) {
        this.animation = indicatorParams$Animation;
        this.activeShape = indicatorParams$Shape;
        this.inactiveShape = indicatorParams$Shape2;
        this.minimumShape = indicatorParams$Shape3;
        this.itemsPlacement = indicatorParams$ItemPlacement;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Style)) {
            return false;
        }
        Style style = (Style) other;
        return this.animation == style.animation && Intrinsics.areEqual(this.activeShape, style.activeShape) && Intrinsics.areEqual(this.inactiveShape, style.inactiveShape) && Intrinsics.areEqual(this.minimumShape, style.minimumShape) && Intrinsics.areEqual(this.itemsPlacement, style.itemsPlacement);
    }

    @NotNull
    public final IndicatorParams$Shape getActiveShape() {
        return this.activeShape;
    }

    @NotNull
    public final IndicatorParams$Animation getAnimation() {
        return this.animation;
    }

    @NotNull
    public final IndicatorParams$Shape getInactiveShape() {
        return this.inactiveShape;
    }

    @NotNull
    public final IndicatorParams$ItemPlacement getItemsPlacement() {
        return this.itemsPlacement;
    }

    @NotNull
    public final IndicatorParams$Shape getMinimumShape() {
        return this.minimumShape;
    }

    public int hashCode() {
        return (((((((this.animation.hashCode() * 31) + this.activeShape.hashCode()) * 31) + this.inactiveShape.hashCode()) * 31) + this.minimumShape.hashCode()) * 31) + this.itemsPlacement.hashCode();
    }

    @NotNull
    public String toString() {
        return "Style(animation=" + this.animation + ", activeShape=" + this.activeShape + ", inactiveShape=" + this.inactiveShape + ", minimumShape=" + this.minimumShape + ", itemsPlacement=" + this.itemsPlacement + ')';
    }
}
