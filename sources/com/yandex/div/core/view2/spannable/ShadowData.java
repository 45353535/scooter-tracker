package com.yandex.div.core.view2.spannable;

import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/core/view2/spannable/ShadowData;", "", "", "offsetX", "offsetY", "radius", "", "color", "<init>", "(FFFI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getOffsetX", "()F", "getOffsetY", "getRadius", "I", "getColor", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ShadowData {
    private final int color;
    private final float offsetX;
    private final float offsetY;
    private final float radius;

    public ShadowData(@Px float f10, @Px float f11, @Px float f12, @ColorInt int i10) {
        this.offsetX = f10;
        this.offsetY = f11;
        this.radius = f12;
        this.color = i10;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowData)) {
            return false;
        }
        ShadowData shadowData = (ShadowData) other;
        return Float.compare(this.offsetX, shadowData.offsetX) == 0 && Float.compare(this.offsetY, shadowData.offsetY) == 0 && Float.compare(this.radius, shadowData.radius) == 0 && this.color == shadowData.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.offsetX) * 31) + Float.floatToIntBits(this.offsetY)) * 31) + Float.floatToIntBits(this.radius)) * 31) + this.color;
    }

    @NotNull
    public String toString() {
        return "ShadowData(offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", radius=" + this.radius + ", color=" + this.color + ')';
    }
}
