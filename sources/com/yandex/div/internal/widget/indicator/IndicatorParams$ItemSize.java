package com.yandex.div.internal.widget.indicator;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"com/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize", "", "<init>", "()V", "", "getWidth", "()F", "width", "getHeight", "height", "Circle", "RoundedRect", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$Circle;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$RoundedRect;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class IndicatorParams$ItemSize {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0005¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$Circle;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "", "radius", "<init>", "(F)V", MenuActionType.COPY, "(F)Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$Circle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getRadius", "()F", "setRadius", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Circle extends IndicatorParams$ItemSize {
        private float radius;

        public Circle(float f10) {
            super(null);
            this.radius = f10;
        }

        @NotNull
        public final Circle copy(float radius) {
            return new Circle(radius);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Circle) && Float.compare(this.radius, ((Circle) other).radius) == 0;
        }

        public final float getRadius() {
            return this.radius;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.radius);
        }

        @NotNull
        public String toString() {
            return "Circle(radius=" + this.radius + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$RoundedRect;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "", "itemWidth", "itemHeight", "cornerRadius", "<init>", "(FFF)V", MenuActionType.COPY, "(FFF)Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$RoundedRect;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getItemWidth", "()F", "setItemWidth", "(F)V", "getItemHeight", "setItemHeight", "getCornerRadius", "setCornerRadius", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RoundedRect extends IndicatorParams$ItemSize {
        private float cornerRadius;
        private float itemHeight;
        private float itemWidth;

        public RoundedRect(float f10, float f11, float f12) {
            super(null);
            this.itemWidth = f10;
            this.itemHeight = f11;
            this.cornerRadius = f12;
        }

        public static /* synthetic */ RoundedRect copy$default(RoundedRect roundedRect, float f10, float f11, float f12, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = roundedRect.itemWidth;
            }
            if ((i10 & 2) != 0) {
                f11 = roundedRect.itemHeight;
            }
            if ((i10 & 4) != 0) {
                f12 = roundedRect.cornerRadius;
            }
            return roundedRect.copy(f10, f11, f12);
        }

        @NotNull
        public final RoundedRect copy(float itemWidth, float itemHeight, float cornerRadius) {
            return new RoundedRect(itemWidth, itemHeight, cornerRadius);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoundedRect)) {
                return false;
            }
            RoundedRect roundedRect = (RoundedRect) other;
            return Float.compare(this.itemWidth, roundedRect.itemWidth) == 0 && Float.compare(this.itemHeight, roundedRect.itemHeight) == 0 && Float.compare(this.cornerRadius, roundedRect.cornerRadius) == 0;
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        public final float getItemHeight() {
            return this.itemHeight;
        }

        public final float getItemWidth() {
            return this.itemWidth;
        }

        public int hashCode() {
            return (((Float.floatToIntBits(this.itemWidth) * 31) + Float.floatToIntBits(this.itemHeight)) * 31) + Float.floatToIntBits(this.cornerRadius);
        }

        @NotNull
        public String toString() {
            return "RoundedRect(itemWidth=" + this.itemWidth + ", itemHeight=" + this.itemHeight + ", cornerRadius=" + this.cornerRadius + ')';
        }
    }

    public /* synthetic */ IndicatorParams$ItemSize(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final float getHeight() {
        double dCeil;
        if (this instanceof RoundedRect) {
            dCeil = Math.ceil(((RoundedRect) this).getItemHeight());
        } else {
            if (!(this instanceof Circle)) {
                throw new m();
            }
            dCeil = Math.ceil(((Circle) this).getRadius() * 2);
        }
        return (float) dCeil;
    }

    public final float getWidth() {
        double dCeil;
        if (this instanceof RoundedRect) {
            dCeil = Math.ceil(((RoundedRect) this).getItemWidth());
        } else {
            if (!(this instanceof Circle)) {
                throw new m();
            }
            dCeil = Math.ceil(((Circle) this).getRadius() * 2);
        }
        return (float) dCeil;
    }

    private IndicatorParams$ItemSize() {
    }
}
