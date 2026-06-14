package com.google.android.material.color;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.color.DynamicColors;
import com.google.android.material.color.utilities.QuantizerCelebi;
import com.google.android.material.color.utilities.Score;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes9.dex */
public class DynamicColorsOptions {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final DynamicColors.Precondition f26084e = new DynamicColors.Precondition() { // from class: com.google.android.material.color.DynamicColorsOptions.1
        @Override // com.google.android.material.color.DynamicColors.Precondition
        public boolean shouldApplyDynamicColors(@NonNull Activity activity, int i10) {
            return true;
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final DynamicColors.OnAppliedCallback f26085f = new DynamicColors.OnAppliedCallback() { // from class: com.google.android.material.color.DynamicColorsOptions.2
        @Override // com.google.android.material.color.DynamicColors.OnAppliedCallback
        public void onApplied(@NonNull Activity activity) {
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DynamicColors.Precondition f26087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DynamicColors.OnAppliedCallback f26088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f26089d;

    private static int c(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return Score.score(QuantizerCelebi.quantize(iArr, 128)).get(0).intValue();
    }

    @Nullable
    public Integer getContentBasedSeedColor() {
        return this.f26089d;
    }

    @NonNull
    public DynamicColors.OnAppliedCallback getOnAppliedCallback() {
        return this.f26088c;
    }

    @NonNull
    public DynamicColors.Precondition getPrecondition() {
        return this.f26087b;
    }

    @StyleRes
    public int getThemeOverlay() {
        return this.f26086a;
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f26090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private DynamicColors.Precondition f26091b = DynamicColorsOptions.f26084e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private DynamicColors.OnAppliedCallback f26092c = DynamicColorsOptions.f26085f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Bitmap f26093d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f26094e;

        @NonNull
        public DynamicColorsOptions build() {
            return new DynamicColorsOptions(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setContentBasedSource(@NonNull Bitmap bitmap) {
            this.f26093d = bitmap;
            this.f26094e = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setOnAppliedCallback(@NonNull DynamicColors.OnAppliedCallback onAppliedCallback) {
            this.f26092c = onAppliedCallback;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPrecondition(@NonNull DynamicColors.Precondition precondition) {
            this.f26091b = precondition;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setThemeOverlay(@StyleRes int i10) {
            this.f26090a = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setContentBasedSource(@ColorInt int i10) {
            this.f26093d = null;
            this.f26094e = Integer.valueOf(i10);
            return this;
        }
    }

    private DynamicColorsOptions(Builder builder) {
        this.f26086a = builder.f26090a;
        this.f26087b = builder.f26091b;
        this.f26088c = builder.f26092c;
        if (builder.f26094e != null) {
            this.f26089d = builder.f26094e;
        } else if (builder.f26093d != null) {
            this.f26089d = Integer.valueOf(c(builder.f26093d));
        }
    }
}
