package com.yandex.div.internal.widget.indicator;

import androidx.webkit.Profile;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"com/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement", "", Profile.DEFAULT_PROFILE_NAME, "Stretch", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement$Default;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement$Stretch;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IndicatorParams$ItemPlacement {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement$Default;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement;", "", "spaceBetweenCenters", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getSpaceBetweenCenters", "()F", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Default implements IndicatorParams$ItemPlacement {
        private final float spaceBetweenCenters;

        public Default(float f10) {
            this.spaceBetweenCenters = f10;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Default) && Float.compare(this.spaceBetweenCenters, ((Default) other).spaceBetweenCenters) == 0;
        }

        public final float getSpaceBetweenCenters() {
            return this.spaceBetweenCenters;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.spaceBetweenCenters);
        }

        @NotNull
        public String toString() {
            return "Default(spaceBetweenCenters=" + this.spaceBetweenCenters + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement$Stretch;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement;", "", "itemSpacing", "", "maxVisibleItems", "<init>", "(FI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getItemSpacing", "()F", "I", "getMaxVisibleItems", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Stretch implements IndicatorParams$ItemPlacement {
        private final float itemSpacing;
        private final int maxVisibleItems;

        public Stretch(float f10, int i10) {
            this.itemSpacing = f10;
            this.maxVisibleItems = i10;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stretch)) {
                return false;
            }
            Stretch stretch = (Stretch) other;
            return Float.compare(this.itemSpacing, stretch.itemSpacing) == 0 && this.maxVisibleItems == stretch.maxVisibleItems;
        }

        public final float getItemSpacing() {
            return this.itemSpacing;
        }

        public final int getMaxVisibleItems() {
            return this.maxVisibleItems;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.itemSpacing) * 31) + this.maxVisibleItems;
        }

        @NotNull
        public String toString() {
            return "Stretch(itemSpacing=" + this.itemSpacing + ", maxVisibleItems=" + this.maxVisibleItems + ')';
        }
    }
}
