package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
public class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_CircularProgressIndicator;
    public static final int INDETERMINATE_ANIMATION_TYPE_ADVANCE = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_RETREAT = 1;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndeterminateAnimationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndicatorDirection {
    }

    public CircularProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    private void s() {
        CircularDrawingDelegate circularDrawingDelegate = new CircularDrawingDelegate((CircularProgressIndicatorSpec) this.f27122b);
        setIndeterminateDrawable(IndeterminateDrawable.p(getContext(), (CircularProgressIndicatorSpec) this.f27122b, circularDrawingDelegate));
        setProgressDrawable(DeterminateDrawable.u(getContext(), (CircularProgressIndicatorSpec) this.f27122b, circularDrawingDelegate));
    }

    public int getIndeterminateAnimationType() {
        return ((CircularProgressIndicatorSpec) this.f27122b).indeterminateAnimationType;
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f27122b).indicatorDirection;
    }

    @Px
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f27122b).indicatorInset;
    }

    @Px
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f27122b).indicatorSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public CircularProgressIndicatorSpec i(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i10) {
        if (((CircularProgressIndicatorSpec) this.f27122b).indeterminateAnimationType == i10) {
            return;
        }
        if (q() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indeterminateAnimationType = i10;
        ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).c();
        getIndeterminateDrawable().u(i10 == 1 ? new CircularIndeterminateRetreatAnimatorDelegate(getContext(), (CircularProgressIndicatorSpec) this.f27122b) : new CircularIndeterminateAdvanceAnimatorDelegate((CircularProgressIndicatorSpec) this.f27122b));
        o();
        invalidate();
    }

    public void setIndicatorDirection(int i10) {
        ((CircularProgressIndicatorSpec) this.f27122b).indicatorDirection = i10;
        invalidate();
    }

    public void setIndicatorInset(@Px int i10) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        if (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorInset != i10) {
            ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorInset = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(@Px int i10) {
        int iMax = Math.max(i10, getTrackThickness() * 2);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        if (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorSize != iMax) {
            ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorSize = iMax;
            ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).c();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((CircularProgressIndicatorSpec) this.f27122b).c();
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10, DEF_STYLE_RES);
        s();
        this.f27132l = true;
    }
}
