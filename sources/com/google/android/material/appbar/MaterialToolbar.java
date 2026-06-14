package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f25396g = R.style.Widget_MaterialComponents_Toolbar;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ImageView.ScaleType[] f25397h = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f25398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView.ScaleType f25401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f25402f;

    public MaterialToolbar(@NonNull Context context) {
        this(context, null);
    }

    private Pair a(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void b(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : DrawableUtils.getColorStateListOrNull(background);
        if (colorStateListValueOf != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(colorStateListValueOf);
            materialShapeDrawable.initializeElevationOverlay(context);
            materialShapeDrawable.setElevation(getElevation());
            setBackground(materialShapeDrawable);
        }
    }

    private void c(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void d() {
        if (this.f25399c || this.f25400d) {
            TextView titleTextView = ToolbarUtils.getTitleTextView(this);
            TextView subtitleTextView = ToolbarUtils.getSubtitleTextView(this);
            if (titleTextView == null && subtitleTextView == null) {
                return;
            }
            Pair pairA = a(titleTextView, subtitleTextView);
            if (this.f25399c && titleTextView != null) {
                c(titleTextView, pairA);
            }
            if (!this.f25400d || subtitleTextView == null) {
                return;
            }
            c(subtitleTextView, pairA);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable == null || this.f25398b == null) {
            return drawable;
        }
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        drawableWrap.setTint(this.f25398b.intValue());
        return drawableWrap;
    }

    private void f() {
        ImageView logoImageView = ToolbarUtils.getLogoImageView(this);
        if (logoImageView != null) {
            Boolean bool = this.f25402f;
            if (bool != null) {
                logoImageView.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f25401e;
            if (scaleType != null) {
                logoImageView.setScaleType(scaleType);
            }
        }
    }

    public void clearNavigationIconTint() {
        this.f25398b = null;
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            DrawableCompat.wrap(navigationIcon.mutate()).setTintList(null);
            setNavigationIcon(navigationIcon);
        }
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.f25401e;
    }

    @Nullable
    @ColorInt
    public Integer getNavigationIconTint() {
        return this.f25398b;
    }

    public boolean isLogoAdjustViewBounds() {
        Boolean bool = this.f25402f;
        return bool != null && bool.booleanValue();
    }

    public boolean isSubtitleCentered() {
        return this.f25400d;
    }

    public boolean isTitleCentered() {
        return this.f25399c;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d();
        f();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        MaterialShapeUtils.setElevation(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f25402f;
        if (bool == null || bool.booleanValue() != z10) {
            this.f25402f = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.f25401e != scaleType) {
            this.f25401e = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(e(drawable));
    }

    public void setNavigationIconTint(@ColorInt int i10) {
        this.f25398b = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f25400d != z10) {
            this.f25400d = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f25399c != z10) {
            this.f25399c = z10;
            requestLayout();
        }
    }

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f25396g;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialToolbar, i10, i11, new int[0]);
        int i12 = R.styleable.MaterialToolbar_navigationIconTint;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            setNavigationIconTint(typedArrayObtainStyledAttributes.getColor(i12, -1));
        }
        this.f25399c = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialToolbar_titleCentered, false);
        this.f25400d = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialToolbar_subtitleCentered, false);
        int i13 = typedArrayObtainStyledAttributes.getInt(R.styleable.MaterialToolbar_logoScaleType, -1);
        if (i13 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f25397h;
            if (i13 < scaleTypeArr.length) {
                this.f25401e = scaleTypeArr[i13];
            }
        }
        int i14 = R.styleable.MaterialToolbar_logoAdjustViewBounds;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f25402f = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(i14, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        b(context2);
    }
}
