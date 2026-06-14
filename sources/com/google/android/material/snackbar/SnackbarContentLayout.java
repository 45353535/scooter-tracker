package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f27824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Button f27825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f27826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27827e;

    public SnackbarContentLayout(@NonNull Context context) {
        this(context, null);
    }

    private static void b(View view, int i10, int i11) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), i10, view.getPaddingEnd(), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean c(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f27824b.getPaddingTop() == i11 && this.f27824b.getPaddingBottom() == i12) {
            return z10;
        }
        b(this.f27824b, i11, i12);
        return true;
    }

    void a(float f10) {
        if (f10 != 1.0f) {
            this.f27825c.setTextColor(MaterialColors.layer(MaterialColors.getColor(this, R.attr.colorSurface), this.f27825c.getCurrentTextColor(), f10));
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int i10, int i11) {
        this.f27824b.setAlpha(0.0f);
        long j10 = i11;
        long j11 = i10;
        this.f27824b.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f27826d).setStartDelay(j11).start();
        if (this.f27825c.getVisibility() == 0) {
            this.f27825c.setAlpha(0.0f);
            this.f27825c.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f27826d).setStartDelay(j11).start();
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int i10, int i11) {
        this.f27824b.setAlpha(1.0f);
        long j10 = i11;
        long j11 = i10;
        this.f27824b.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f27826d).setStartDelay(j11).start();
        if (this.f27825c.getVisibility() == 0) {
            this.f27825c.setAlpha(1.0f);
            this.f27825c.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f27826d).setStartDelay(j11).start();
        }
    }

    public Button getActionView() {
        return this.f27825c;
    }

    public TextView getMessageView() {
        return this.f27824b;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f27824b = (TextView) findViewById(R.id.snackbar_text);
        this.f27825c = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f27824b.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f27827e <= 0 || this.f27825c.getMeasuredWidth() <= this.f27827e) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!c(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!c(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f27827e = i10;
    }

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27826d = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
    }
}
