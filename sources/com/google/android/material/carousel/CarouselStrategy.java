package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
public abstract class CarouselStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f25855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f25856b;

    enum StrategyType {
        CONTAINED,
        UNCONTAINED
    }

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public static float getChildMaskPercentage(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    StrategyType b() {
        return StrategyType.CONTAINED;
    }

    void c(Context context) {
        float fH = this.f25855a;
        if (fH <= 0.0f) {
            fH = CarouselStrategyHelper.h(context);
        }
        this.f25855a = fH;
        float fG = this.f25856b;
        if (fG <= 0.0f) {
            fG = CarouselStrategyHelper.g(context);
        }
        this.f25856b = fG;
    }

    public float getSmallItemSizeMax() {
        return this.f25856b;
    }

    public float getSmallItemSizeMin() {
        return this.f25855a;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view);

    public void setSmallItemSizeMax(float f10) {
        this.f25856b = f10;
    }

    public void setSmallItemSizeMin(float f10) {
        this.f25855a = f10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i10) {
        return false;
    }
}
