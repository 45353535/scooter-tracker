package com.yandex.div.internal.widget.indicator;

import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"com/yandex/div/internal/widget/indicator/IndicatorParams$Shape", "", "<init>", "()V", "", "getColor", "()I", "color", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "getItemSize", "()Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "itemSize", "", "getBorderWidth", "()F", "borderWidth", "getBorderColor", "borderColor", "Circle", "RoundedRect", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape$Circle;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape$RoundedRect;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class IndicatorParams$Shape {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape$Circle;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "", "color", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$Circle;", "itemSize", "<init>", "(ILcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$Circle;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getColor", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$Circle;", "getItemSize", "()Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$Circle;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Circle extends IndicatorParams$Shape {
        private final int color;

        @NotNull
        private final IndicatorParams$ItemSize.Circle itemSize;

        public Circle(int i10, @NotNull IndicatorParams$ItemSize.Circle circle) {
            super(null);
            this.color = i10;
            this.itemSize = circle;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Circle)) {
                return false;
            }
            Circle circle = (Circle) other;
            return this.color == circle.color && Intrinsics.areEqual(this.itemSize, circle.itemSize);
        }

        @Override // com.yandex.div.internal.widget.indicator.IndicatorParams$Shape
        public int getColor() {
            return this.color;
        }

        public int hashCode() {
            return (this.color * 31) + this.itemSize.hashCode();
        }

        @NotNull
        public String toString() {
            return "Circle(color=" + this.color + ", itemSize=" + this.itemSize + ')';
        }

        @Override // com.yandex.div.internal.widget.indicator.IndicatorParams$Shape
        @NotNull
        public IndicatorParams$ItemSize.Circle getItemSize() {
            return this.itemSize;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape$RoundedRect;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "", "color", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$RoundedRect;", "itemSize", "", "strokeWidth", "strokeColor", "<init>", "(ILcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$RoundedRect;FI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getColor", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$RoundedRect;", "getItemSize", "()Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$RoundedRect;", "F", "getStrokeWidth", "()F", "getStrokeColor", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RoundedRect extends IndicatorParams$Shape {
        private final int color;

        @NotNull
        private final IndicatorParams$ItemSize.RoundedRect itemSize;
        private final int strokeColor;
        private final float strokeWidth;

        public RoundedRect(int i10, @NotNull IndicatorParams$ItemSize.RoundedRect roundedRect, float f10, int i11) {
            super(null);
            this.color = i10;
            this.itemSize = roundedRect;
            this.strokeWidth = f10;
            this.strokeColor = i11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoundedRect)) {
                return false;
            }
            RoundedRect roundedRect = (RoundedRect) other;
            return this.color == roundedRect.color && Intrinsics.areEqual(this.itemSize, roundedRect.itemSize) && Float.compare(this.strokeWidth, roundedRect.strokeWidth) == 0 && this.strokeColor == roundedRect.strokeColor;
        }

        @Override // com.yandex.div.internal.widget.indicator.IndicatorParams$Shape
        public int getColor() {
            return this.color;
        }

        public final int getStrokeColor() {
            return this.strokeColor;
        }

        public final float getStrokeWidth() {
            return this.strokeWidth;
        }

        public int hashCode() {
            return (((((this.color * 31) + this.itemSize.hashCode()) * 31) + Float.floatToIntBits(this.strokeWidth)) * 31) + this.strokeColor;
        }

        @NotNull
        public String toString() {
            return "RoundedRect(color=" + this.color + ", itemSize=" + this.itemSize + ", strokeWidth=" + this.strokeWidth + ", strokeColor=" + this.strokeColor + ')';
        }

        @Override // com.yandex.div.internal.widget.indicator.IndicatorParams$Shape
        @NotNull
        public IndicatorParams$ItemSize.RoundedRect getItemSize() {
            return this.itemSize;
        }
    }

    public /* synthetic */ IndicatorParams$Shape(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int getBorderColor() {
        if (this instanceof RoundedRect) {
            return ((RoundedRect) this).getStrokeColor();
        }
        return 0;
    }

    public final float getBorderWidth() {
        if (this instanceof RoundedRect) {
            return ((RoundedRect) this).getStrokeWidth();
        }
        return 0.0f;
    }

    public abstract int getColor();

    @NotNull
    public abstract IndicatorParams$ItemSize getItemSize();

    private IndicatorParams$Shape() {
    }
}
