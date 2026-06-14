package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialSwitch extends SwitchCompat {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f26922o = R.style.Widget_Material3_CompoundButton_MaterialSwitch;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f26923p = {R.attr.state_with_icon};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f26924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f26925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f26927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f26928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f26929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorStateList f26930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f26931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f26932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f26933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f26934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f26935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f26936n;

    public MaterialSwitch(@NonNull Context context) {
        this(context, null);
    }

    private void a() {
        this.f26924b = DrawableUtils.createTintableDrawableIfNeeded(this.f26924b, this.f26929g, getThumbTintMode());
        this.f26925c = DrawableUtils.createTintableDrawableIfNeeded(this.f26925c, this.f26930h, this.f26931i);
        d();
        Drawable drawable = this.f26924b;
        Drawable drawable2 = this.f26925c;
        int i10 = this.f26926d;
        super.setThumbDrawable(DrawableUtils.compositeTwoLayeredDrawable(drawable, drawable2, i10, i10));
        refreshDrawableState();
    }

    private void b() {
        this.f26927e = DrawableUtils.createTintableDrawableIfNeeded(this.f26927e, this.f26932j, getTrackTintMode());
        this.f26928f = DrawableUtils.createTintableDrawableIfNeeded(this.f26928f, this.f26933k, this.f26934l);
        d();
        Drawable layerDrawable = this.f26927e;
        if (layerDrawable != null && this.f26928f != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f26927e, this.f26928f});
        } else if (layerDrawable == null) {
            layerDrawable = this.f26928f;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    private static void c(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f10) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(ColorUtils.blendARGB(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f10));
    }

    private void d() {
        if (this.f26929g == null && this.f26930h == null && this.f26932j == null && this.f26933k == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f26929g;
        if (colorStateList != null) {
            c(this.f26924b, colorStateList, this.f26935m, this.f26936n, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f26930h;
        if (colorStateList2 != null) {
            c(this.f26925c, colorStateList2, this.f26935m, this.f26936n, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f26932j;
        if (colorStateList3 != null) {
            c(this.f26927e, colorStateList3, this.f26935m, this.f26936n, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f26933k;
        if (colorStateList4 != null) {
            c(this.f26928f, colorStateList4, this.f26935m, this.f26936n, thumbPosition);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getThumbDrawable() {
        return this.f26924b;
    }

    @Nullable
    public Drawable getThumbIconDrawable() {
        return this.f26925c;
    }

    @Px
    public int getThumbIconSize() {
        return this.f26926d;
    }

    @Nullable
    public ColorStateList getThumbIconTintList() {
        return this.f26930h;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f26931i;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f26929g;
    }

    @Nullable
    public Drawable getTrackDecorationDrawable() {
        return this.f26928f;
    }

    @Nullable
    public ColorStateList getTrackDecorationTintList() {
        return this.f26933k;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f26934l;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getTrackDrawable() {
        return this.f26927e;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f26932j;
    }

    @Override // android.view.View
    public void invalidate() {
        d();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.f26925c != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f26923p);
        }
        this.f26935m = DrawableUtils.getUncheckedState(iArrOnCreateDrawableState);
        this.f26936n = DrawableUtils.getCheckedState(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@Nullable Drawable drawable) {
        this.f26924b = drawable;
        a();
    }

    public void setThumbIconDrawable(@Nullable Drawable drawable) {
        this.f26925c = drawable;
        a();
    }

    public void setThumbIconResource(@DrawableRes int i10) {
        setThumbIconDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setThumbIconSize(@Px int i10) {
        if (this.f26926d != i10) {
            this.f26926d = i10;
            a();
        }
    }

    public void setThumbIconTintList(@Nullable ColorStateList colorStateList) {
        this.f26930h = colorStateList;
        a();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.f26931i = mode;
        a();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f26929g = colorStateList;
        a();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        a();
    }

    public void setTrackDecorationDrawable(@Nullable Drawable drawable) {
        this.f26928f = drawable;
        b();
    }

    public void setTrackDecorationResource(@DrawableRes int i10) {
        setTrackDecorationDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setTrackDecorationTintList(@Nullable ColorStateList colorStateList) {
        this.f26933k = colorStateList;
        b();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.f26934l = mode;
        b();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@Nullable Drawable drawable) {
        this.f26927e = drawable;
        b();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f26932j = colorStateList;
        b();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        b();
    }

    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f26922o;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f26926d = -1;
        Context context2 = getContext();
        this.f26924b = super.getThumbDrawable();
        this.f26929g = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f26927e = super.getTrackDrawable();
        this.f26932j = super.getTrackTintList();
        super.setTrackTintList(null);
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.MaterialSwitch, i10, i11, new int[0]);
        this.f26925c = tintTypedArrayObtainTintedStyledAttributes.getDrawable(R.styleable.MaterialSwitch_thumbIcon);
        this.f26926d = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.MaterialSwitch_thumbIconSize, -1);
        this.f26930h = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.MaterialSwitch_thumbIconTint);
        int i12 = tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.MaterialSwitch_thumbIconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f26931i = ViewUtils.parseTintMode(i12, mode);
        this.f26928f = tintTypedArrayObtainTintedStyledAttributes.getDrawable(R.styleable.MaterialSwitch_trackDecoration);
        this.f26933k = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.MaterialSwitch_trackDecorationTint);
        this.f26934l = ViewUtils.parseTintMode(tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.MaterialSwitch_trackDecorationTintMode, -1), mode);
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        setEnforceSwitchWidth(false);
        a();
        b();
    }
}
