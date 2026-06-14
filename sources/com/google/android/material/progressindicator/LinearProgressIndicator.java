package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
public class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_LinearProgressIndicator;
    public static final int INDETERMINATE_ANIMATION_TYPE_CONTIGUOUS = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_DISJOINT = 1;
    public static final int INDICATOR_DIRECTION_END_TO_START = 3;
    public static final int INDICATOR_DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int INDICATOR_DIRECTION_RIGHT_TO_LEFT = 1;
    public static final int INDICATOR_DIRECTION_START_TO_END = 2;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndeterminateAnimationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndicatorDirection {
    }

    public LinearProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    private void s() {
        LinearDrawingDelegate linearDrawingDelegate = new LinearDrawingDelegate((LinearProgressIndicatorSpec) this.f27122b);
        setIndeterminateDrawable(IndeterminateDrawable.q(getContext(), (LinearProgressIndicatorSpec) this.f27122b, linearDrawingDelegate));
        setProgressDrawable(DeterminateDrawable.v(getContext(), (LinearProgressIndicatorSpec) this.f27122b, linearDrawingDelegate));
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f27122b).indeterminateAnimationType;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f27122b).indicatorDirection;
    }

    @Px
    public int getTrackInnerCornerRadius() {
        return ((LinearProgressIndicatorSpec) this.f27122b).trackInnerCornerRadius;
    }

    @Nullable
    public Integer getTrackStopIndicatorPadding() {
        return ((LinearProgressIndicatorSpec) this.f27122b).trackStopIndicatorPadding;
    }

    @Px
    public int getTrackStopIndicatorSize() {
        return ((LinearProgressIndicatorSpec) this.f27122b).trackStopIndicatorSize;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) baseProgressIndicatorSpec;
        boolean z11 = true;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorDirection != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) this.f27122b).indicatorDirection != 2) && (getLayoutDirection() != 0 || ((LinearProgressIndicatorSpec) this.f27122b).indicatorDirection != 3))) {
            z11 = false;
        }
        linearProgressIndicatorSpec.f27263a = z11;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingLeft = i10 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i11 - (getPaddingTop() + getPaddingBottom());
        IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        DeterminateDrawable<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public LinearProgressIndicatorSpec i(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i10) {
        if (((LinearProgressIndicatorSpec) this.f27122b).indeterminateAnimationType == i10) {
            return;
        }
        if (q() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).indeterminateAnimationType = i10;
        ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).c();
        if (i10 == 0) {
            getIndeterminateDrawable().u(new LinearIndeterminateContiguousAnimatorDelegate((LinearProgressIndicatorSpec) this.f27122b));
        } else {
            getIndeterminateDrawable().u(new LinearIndeterminateDisjointAnimatorDelegate(getContext(), (LinearProgressIndicatorSpec) this.f27122b));
        }
        o();
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f27122b).c();
    }

    public void setIndicatorDirection(int i10) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorDirection = i10;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) baseProgressIndicatorSpec;
        boolean z10 = true;
        if (i10 != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) this.f27122b).indicatorDirection != 2) && (getLayoutDirection() != 0 || i10 != 3))) {
            z10 = false;
        }
        linearProgressIndicatorSpec.f27263a = z10;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i10, boolean z10) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        if (baseProgressIndicatorSpec != null && ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).indeterminateAnimationType == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i10, z10);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i10) {
        super.setTrackCornerRadius(i10);
        ((LinearProgressIndicatorSpec) this.f27122b).c();
        invalidate();
    }

    public void setTrackInnerCornerRadius(@Px int i10) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackInnerCornerRadius != i10) {
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackInnerCornerRadius = Math.round(Math.min(i10, ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackThickness / 2.0f));
            BaseProgressIndicatorSpec baseProgressIndicatorSpec2 = this.f27122b;
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec2).useRelativeTrackInnerCornerRadius = false;
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec2).hasInnerCornerRadius = true;
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec2).c();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f10) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackInnerCornerRadiusFraction != f10) {
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackInnerCornerRadiusFraction = Math.min(f10, 0.5f);
            BaseProgressIndicatorSpec baseProgressIndicatorSpec2 = this.f27122b;
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec2).useRelativeTrackInnerCornerRadius = true;
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec2).hasInnerCornerRadius = true;
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec2).c();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(@Nullable Integer num) {
        if (Objects.equals(((LinearProgressIndicatorSpec) this.f27122b).trackStopIndicatorPadding, num)) {
            return;
        }
        ((LinearProgressIndicatorSpec) this.f27122b).trackStopIndicatorPadding = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int i10) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackStopIndicatorSize != i10) {
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackStopIndicatorSize = Math.min(i10, ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackThickness);
            ((LinearProgressIndicatorSpec) this.f27122b).c();
            invalidate();
        }
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10, DEF_STYLE_RES);
        s();
        this.f27132l = true;
    }
}
