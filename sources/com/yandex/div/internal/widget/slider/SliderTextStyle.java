package com.yandex.div.internal.widget.slider;

import android.graphics.Typeface;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u0012R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010\u0010¨\u0006$"}, d2 = {"Lcom/yandex/div/internal/widget/slider/SliderTextStyle;", "", "", "fontSize", "spacing", "Landroid/graphics/Typeface;", "fontWeight", "offsetX", "offsetY", "", "textColor", "", "fontVariations", "<init>", "(FFLandroid/graphics/Typeface;FFILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getFontSize", "()F", "getSpacing", "Landroid/graphics/Typeface;", "getFontWeight", "()Landroid/graphics/Typeface;", "getOffsetX", "getOffsetY", "I", "getTextColor", "Ljava/lang/String;", "getFontVariations", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SliderTextStyle {
    private final float fontSize;

    @Nullable
    private final String fontVariations;

    @NotNull
    private final Typeface fontWeight;
    private final float offsetX;
    private final float offsetY;
    private final float spacing;
    private final int textColor;

    public SliderTextStyle(@Px float f10, float f11, @NotNull Typeface typeface, @Px float f12, @Px float f13, @ColorInt int i10, @Nullable String str) {
        this.fontSize = f10;
        this.spacing = f11;
        this.fontWeight = typeface;
        this.offsetX = f12;
        this.offsetY = f13;
        this.textColor = i10;
        this.fontVariations = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderTextStyle)) {
            return false;
        }
        SliderTextStyle sliderTextStyle = (SliderTextStyle) other;
        return Float.compare(this.fontSize, sliderTextStyle.fontSize) == 0 && Float.compare(this.spacing, sliderTextStyle.spacing) == 0 && Intrinsics.areEqual(this.fontWeight, sliderTextStyle.fontWeight) && Float.compare(this.offsetX, sliderTextStyle.offsetX) == 0 && Float.compare(this.offsetY, sliderTextStyle.offsetY) == 0 && this.textColor == sliderTextStyle.textColor && Intrinsics.areEqual(this.fontVariations, sliderTextStyle.fontVariations);
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    @Nullable
    public final String getFontVariations() {
        return this.fontVariations;
    }

    @NotNull
    public final Typeface getFontWeight() {
        return this.fontWeight;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getSpacing() {
        return this.spacing;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int iFloatToIntBits = ((((((((((Float.floatToIntBits(this.fontSize) * 31) + Float.floatToIntBits(this.spacing)) * 31) + this.fontWeight.hashCode()) * 31) + Float.floatToIntBits(this.offsetX)) * 31) + Float.floatToIntBits(this.offsetY)) * 31) + this.textColor) * 31;
        String str = this.fontVariations;
        return iFloatToIntBits + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "SliderTextStyle(fontSize=" + this.fontSize + ", spacing=" + this.spacing + ", fontWeight=" + this.fontWeight + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", textColor=" + this.textColor + ", fontVariations=" + this.fontVariations + ')';
    }
}
