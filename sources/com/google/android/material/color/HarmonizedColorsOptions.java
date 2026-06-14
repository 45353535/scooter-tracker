package com.google.android.material.color;

import androidx.annotation.AttrRes;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes9.dex */
public class HarmonizedColorsOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f26099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HarmonizedColorAttributes f26100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26101c;

    public static class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HarmonizedColorAttributes f26103b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[] f26102a = new int[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f26104c = R.attr.colorPrimary;

        @NonNull
        public HarmonizedColorsOptions build() {
            return new HarmonizedColorsOptions(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorAttributeToHarmonizeWith(@AttrRes int i10) {
            this.f26104c = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorAttributes(@Nullable HarmonizedColorAttributes harmonizedColorAttributes) {
            this.f26103b = harmonizedColorAttributes;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorResourceIds(@NonNull @ColorRes int[] iArr) {
            this.f26102a = iArr;
            return this;
        }
    }

    @NonNull
    public static HarmonizedColorsOptions createMaterialDefaults() {
        return new Builder().setColorAttributes(HarmonizedColorAttributes.createMaterialDefaults()).build();
    }

    int a(int i10) {
        HarmonizedColorAttributes harmonizedColorAttributes = this.f26100b;
        return (harmonizedColorAttributes == null || harmonizedColorAttributes.getThemeOverlay() == 0) ? i10 : this.f26100b.getThemeOverlay();
    }

    @AttrRes
    public int getColorAttributeToHarmonizeWith() {
        return this.f26101c;
    }

    @Nullable
    public HarmonizedColorAttributes getColorAttributes() {
        return this.f26100b;
    }

    @NonNull
    @ColorRes
    public int[] getColorResourceIds() {
        return this.f26099a;
    }

    private HarmonizedColorsOptions(Builder builder) {
        this.f26099a = builder.f26102a;
        this.f26100b = builder.f26103b;
        this.f26101c = builder.f26104c;
    }
}
