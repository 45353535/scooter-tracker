package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes9.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] J;
    private static final int[] K;
    private final AccessibilityManager G;
    private boolean H;
    private BaseTransientBottomBar.BaseCallback I;

    public static class Callback extends BaseTransientBottomBar.BaseCallback<Snackbar> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onDismissed(Snackbar snackbar, int i10) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onShown(Snackbar snackbar) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@Nullable Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@Nullable Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static {
        int i10 = R.attr.snackbarButtonStyle;
        J = new int[]{i10};
        K = new int[]{i10, R.attr.snackbarTextViewStyle};
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback) {
        super(context, viewGroup, view, contentViewCallback);
        this.G = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static /* synthetic */ void Y(Snackbar snackbar, View.OnClickListener onClickListener, View view) {
        snackbar.getClass();
        onClickListener.onClick(view);
        snackbar.y(1);
    }

    private static ViewGroup Z(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button a0() {
        return b0().getActionView();
    }

    private SnackbarContentLayout b0() {
        return (SnackbarContentLayout) this.f27773i.getChildAt(0);
    }

    private TextView c0() {
        return b0().getMessageView();
    }

    private static boolean d0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(K);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    private static Snackbar e0(Context context, View view, CharSequence charSequence, int i10) {
        ViewGroup viewGroupZ = Z(view);
        if (viewGroupZ == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupZ.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(d0(context) ? R.layout.mtrl_layout_snackbar_include : R.layout.design_layout_snackbar_include, viewGroupZ, false);
        Snackbar snackbar = new Snackbar(context, viewGroupZ, snackbarContentLayout, snackbarContentLayout);
        snackbar.setText(charSequence);
        snackbar.setDuration(i10);
        return snackbar;
    }

    @NonNull
    public static Snackbar make(@NonNull View view, @NonNull CharSequence charSequence, int i10) {
        return e0(null, view, charSequence, i10);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void dismiss() {
        super.dismiss();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int getDuration() {
        int duration = super.getDuration();
        if (duration == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.G.getRecommendedTimeoutMillis(duration, (this.H ? 4 : 0) | 3);
        }
        if (this.H && this.G.isTouchExplorationEnabled()) {
            return -2;
        }
        return duration;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean isShown() {
        return super.isShown();
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setAction(@StringRes int i10, View.OnClickListener onClickListener) {
        return setAction(getContext().getText(i10), onClickListener);
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setActionTextColor(ColorStateList colorStateList) {
        a0().setTextColor(colorStateList);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setBackgroundTint(@ColorInt int i10) {
        return setBackgroundTintList(ColorStateList.valueOf(i10));
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.f27773i.setBackgroundTintList(colorStateList);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        this.f27773i.setBackgroundTintMode(mode);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    @Deprecated
    public Snackbar setCallback(@Nullable Callback callback) {
        BaseTransientBottomBar.BaseCallback baseCallback = this.I;
        if (baseCallback != null) {
            removeCallback(baseCallback);
        }
        if (callback != null) {
            addCallback(callback);
        }
        this.I = callback;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setMaxInlineActionWidth(@Dimension int i10) {
        b0().setMaxInlineActionWidth(i10);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setText(@NonNull CharSequence charSequence) {
        c0().setText(charSequence);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setTextColor(ColorStateList colorStateList) {
        c0().setTextColor(colorStateList);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setTextMaxLines(int i10) {
        c0().setMaxLines(i10);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void show() {
        super.show();
    }

    @NonNull
    public static Snackbar make(@NonNull View view, @StringRes int i10, int i11) {
        return make(view, view.getResources().getText(i10), i11);
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setAction(@Nullable CharSequence charSequence, @Nullable final View.OnClickListener onClickListener) {
        Button buttonA0 = a0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            buttonA0.setVisibility(8);
            buttonA0.setOnClickListener(null);
            this.H = false;
            return this;
        }
        this.H = true;
        buttonA0.setVisibility(0);
        buttonA0.setText(charSequence);
        buttonA0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.snackbar.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Snackbar.Y(this.f27837b, onClickListener, view);
            }
        });
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setActionTextColor(@ColorInt int i10) {
        a0().setTextColor(i10);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setText(@StringRes int i10) {
        return setText(getContext().getText(i10));
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setTextColor(@ColorInt int i10) {
        c0().setTextColor(i10);
        return this;
    }

    @NonNull
    public static Snackbar make(@NonNull Context context, @NonNull View view, @NonNull CharSequence charSequence, int i10) {
        return e0(context, view, charSequence, i10);
    }
}
