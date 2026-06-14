package com.google.android.material.color;

import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes9.dex */
public class ColorContrastOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26020b;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f26021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f26022b;

        @NonNull
        public ColorContrastOptions build() {
            return new ColorContrastOptions(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setHighContrastThemeOverlay(@StyleRes int i10) {
            this.f26022b = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setMediumContrastThemeOverlay(@StyleRes int i10) {
            this.f26021a = i10;
            return this;
        }
    }

    @StyleRes
    public int getHighContrastThemeOverlay() {
        return this.f26020b;
    }

    @StyleRes
    public int getMediumContrastThemeOverlay() {
        return this.f26019a;
    }

    private ColorContrastOptions(Builder builder) {
        this.f26019a = builder.f26021a;
        this.f26020b = builder.f26022b;
    }
}
