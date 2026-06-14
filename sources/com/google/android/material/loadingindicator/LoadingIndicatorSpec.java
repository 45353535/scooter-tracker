package com.google.android.material.loadingindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;

/* JADX INFO: loaded from: classes9.dex */
public final class LoadingIndicatorSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f26916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f26917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f26919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f26920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f26921f;

    public LoadingIndicatorSpec(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.loadingIndicatorStyle);
    }

    private void a(Context context, TypedArray typedArray) {
        int i10 = R.styleable.LoadingIndicator_indicatorColor;
        if (!typedArray.hasValue(i10)) {
            this.f26920e = new int[]{MaterialColors.getColor(context, androidx.appcompat.R.attr.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(i10).type != 1) {
            this.f26920e = new int[]{typedArray.getColor(i10, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i10, -1));
        this.f26920e = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    public void setScaleToFit(boolean z10) {
        this.f26916a = z10;
    }

    public LoadingIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        this(context, attributeSet, i10, LoadingIndicator.f26886d);
    }

    public LoadingIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        this.f26916a = false;
        this.f26920e = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.m3_loading_indicator_shape_size);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.m3_loading_indicator_container_size);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.LoadingIndicator, i10, i11, new int[0]);
        this.f26917b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.LoadingIndicator_indicatorSize, dimensionPixelSize);
        this.f26918c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.LoadingIndicator_containerWidth, dimensionPixelSize2);
        this.f26919d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.LoadingIndicator_containerHeight, dimensionPixelSize2);
        a(context, typedArrayObtainStyledAttributes);
        this.f26921f = typedArrayObtainStyledAttributes.getColor(R.styleable.LoadingIndicator_containerColor, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
