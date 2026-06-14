package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;

/* JADX INFO: loaded from: classes9.dex */
public final class LinearProgressIndicatorSpec extends BaseProgressIndicatorSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f27263a;
    public boolean hasInnerCornerRadius;
    public int indeterminateAnimationType;
    public int indicatorDirection;

    @Px
    public int trackInnerCornerRadius;
    public float trackInnerCornerRadiusFraction;

    @Nullable
    public Integer trackStopIndicatorPadding;

    @Px
    public int trackStopIndicatorSize;
    public boolean useRelativeTrackInnerCornerRadius;

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    void c() {
        super.c();
        if (this.trackStopIndicatorSize < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.indeterminateAnimationType == 0) {
            if ((getTrackCornerRadiusInPx() > 0 || (this.hasInnerCornerRadius && getTrackInnerCornerRadiusInPx() > 0)) && this.indicatorTrackGapSize == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.indicatorColors.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public int getTrackInnerCornerRadiusInPx() {
        return !this.hasInnerCornerRadius ? getTrackCornerRadiusInPx() : this.useRelativeTrackInnerCornerRadius ? (int) (this.trackThickness * this.trackInnerCornerRadiusFraction) : this.trackInnerCornerRadius;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public boolean useStrokeCap() {
        return super.useStrokeCap() && getTrackInnerCornerRadiusInPx() == getTrackCornerRadiusInPx();
    }

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        this(context, attributeSet, i10, LinearProgressIndicator.DEF_STYLE_RES);
    }

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.LinearProgressIndicator, R.attr.linearProgressIndicatorStyle, LinearProgressIndicator.DEF_STYLE_RES, new int[0]);
        this.indeterminateAnimationType = typedArrayObtainStyledAttributes.getInt(R.styleable.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.indicatorDirection = typedArrayObtainStyledAttributes.getInt(R.styleable.LinearProgressIndicator_indicatorDirectionLinear, 0);
        this.trackStopIndicatorSize = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.LinearProgressIndicator_trackStopIndicatorSize, 0), this.trackThickness);
        int i12 = R.styleable.LinearProgressIndicator_trackStopIndicatorPadding;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.trackStopIndicatorPadding = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, 0));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R.styleable.LinearProgressIndicator_trackInnerCornerRadius);
        if (typedValuePeekValue != null) {
            int i13 = typedValuePeekValue.type;
            if (i13 == 5) {
                this.trackInnerCornerRadius = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), this.trackThickness / 2);
                this.useRelativeTrackInnerCornerRadius = false;
                this.hasInnerCornerRadius = true;
            } else if (i13 == 6) {
                this.trackInnerCornerRadiusFraction = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.useRelativeTrackInnerCornerRadius = true;
                this.hasInnerCornerRadius = true;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c();
        this.f27263a = this.indicatorDirection == 1;
    }
}
