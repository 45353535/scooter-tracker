package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.widget.CompoundButtonCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import e.c;
import e.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int STATE_CHECKED = 1;
    public static final int STATE_INDETERMINATE = 2;
    public static final int STATE_UNCHECKED = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f25907v = R.style.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int[] f25908w = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int[] f25909x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int[][] f25910y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f25911z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f25912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashSet f25913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f25914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f25916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CharSequence f25918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f25919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f25920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ColorStateList f25922l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ColorStateList f25923m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private PorterDuff.Mode f25924n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f25925o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int[] f25926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f25927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f25928r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f25929s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AnimatedVectorDrawableCompat f25930t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Animatable2Compat.AnimationCallback f25931u;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface CheckedState {
    }

    public interface OnCheckedStateChangedListener {
        void onCheckedStateChangedListener(@NonNull MaterialCheckBox materialCheckBox, int i10);
    }

    public interface OnErrorChangedListener {
        void onErrorChanged(@NonNull MaterialCheckBox materialCheckBox, boolean z10);
    }

    static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.checkbox.MaterialCheckBox.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25933b;

        private String c() {
            int i10 = this.f25933b;
            return i10 != 1 ? i10 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        @NonNull
        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + c() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f25933b));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f25933b = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i10 = R.attr.state_error;
        f25909x = new int[]{i10};
        f25910y = new int[][]{new int[]{android.R.attr.state_enabled, i10}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f25911z = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private boolean b(TintTypedArray tintTypedArray) {
        return tintTypedArray.getResourceId(R.styleable.MaterialCheckBox_android_button, 0) == f25911z && tintTypedArray.getResourceId(R.styleable.MaterialCheckBox_buttonCompat, 0) == 0;
    }

    private void c() {
        this.f25919i = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.f25919i, this.f25922l, CompoundButtonCompat.getButtonTintMode(this));
        this.f25920j = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.f25920j, this.f25923m, this.f25924n);
        e();
        f();
        super.setButtonDrawable(DrawableUtils.compositeTwoLayeredDrawable(this.f25919i, this.f25920j));
        refreshDrawableState();
    }

    private void d() {
        if (Build.VERSION.SDK_INT < 30 || this.f25928r != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void e() {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat;
        if (this.f25921k) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = this.f25930t;
            if (animatedVectorDrawableCompat2 != null) {
                animatedVectorDrawableCompat2.unregisterAnimationCallback(this.f25931u);
                this.f25930t.registerAnimationCallback(this.f25931u);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.f25919i;
                if (!(drawable instanceof AnimatedStateListDrawable) || (animatedVectorDrawableCompat = this.f25930t) == null) {
                    return;
                }
                int i10 = R.id.checked;
                int i11 = R.id.unchecked;
                ((AnimatedStateListDrawable) drawable).addTransition(i10, i11, animatedVectorDrawableCompat, false);
                ((AnimatedStateListDrawable) this.f25919i).addTransition(R.id.indeterminate, i11, this.f25930t, false);
            }
        }
    }

    private void f() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f25919i;
        if (drawable != null && (colorStateList2 = this.f25922l) != null) {
            drawable.setTintList(colorStateList2);
        }
        Drawable drawable2 = this.f25920j;
        if (drawable2 == null || (colorStateList = this.f25923m) == null) {
            return;
        }
        drawable2.setTintList(colorStateList);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i10 = this.f25925o;
        return i10 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i10 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f25914d == null) {
            int[][] iArr = f25910y;
            int[] iArr2 = new int[iArr.length];
            int color = MaterialColors.getColor(this, androidx.appcompat.R.attr.colorControlActivated);
            int color2 = MaterialColors.getColor(this, androidx.appcompat.R.attr.colorError);
            int color3 = MaterialColors.getColor(this, R.attr.colorSurface);
            int color4 = MaterialColors.getColor(this, R.attr.colorOnSurface);
            iArr2[0] = MaterialColors.layer(color3, color2, 1.0f);
            iArr2[1] = MaterialColors.layer(color3, color, 1.0f);
            iArr2[2] = MaterialColors.layer(color3, color4, 0.54f);
            iArr2[3] = MaterialColors.layer(color3, color4, 0.38f);
            iArr2[4] = MaterialColors.layer(color3, color4, 0.38f);
            this.f25914d = new ColorStateList(iArr, iArr2);
        }
        return this.f25914d;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f25922l;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public void addOnCheckedStateChangedListener(@NonNull OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.f25913c.add(onCheckedStateChangedListener);
    }

    public void addOnErrorChangedListener(@NonNull OnErrorChangedListener onErrorChangedListener) {
        this.f25912b.add(onErrorChangedListener);
    }

    public void clearOnCheckedStateChangedListeners() {
        this.f25913c.clear();
    }

    public void clearOnErrorChangedListeners() {
        this.f25912b.clear();
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.f25919i;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.f25920j;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.f25923m;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f25924n;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.f25922l;
    }

    public int getCheckedState() {
        return this.f25925o;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.f25918h;
    }

    public boolean isCenterIfNoTextEnabled() {
        return this.f25916f;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f25925o == 1;
    }

    public boolean isErrorShown() {
        return this.f25917g;
    }

    public boolean isUseMaterialThemeColors() {
        return this.f25915e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f25915e && this.f25922l == null && this.f25923m == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f25908w);
        }
        if (isErrorShown()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f25909x);
        }
        this.f25926p = DrawableUtils.getCheckedState(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f25916f || !TextUtils.isEmpty(getText()) || (buttonDrawable = CompoundButtonCompat.getButtonDrawable(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (ViewUtils.isLayoutRtl(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@Nullable AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && isErrorShown()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f25918h));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f25933b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f25933b = getCheckedState();
        return savedState;
    }

    public void removeOnCheckedStateChangedListener(@NonNull OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.f25913c.remove(onCheckedStateChangedListener);
    }

    public void removeOnErrorChangedListener(@NonNull OnErrorChangedListener onErrorChangedListener) {
        this.f25912b.remove(onErrorChangedListener);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i10) {
        setButtonDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable) {
        this.f25920j = drawable;
        c();
    }

    public void setButtonIconDrawableResource(@DrawableRes int i10) {
        setButtonIconDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f25923m == colorStateList) {
            return;
        }
        this.f25923m = colorStateList;
        c();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f25924n == mode) {
            return;
        }
        this.f25924n = mode;
        c();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.f25922l == colorStateList) {
            return;
        }
        this.f25922l = colorStateList;
        c();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        c();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f25916f = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManagerA;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f25925o != i10) {
            this.f25925o = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            d();
            if (this.f25927q) {
                return;
            }
            this.f25927q = true;
            LinkedHashSet linkedHashSet = this.f25913c;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((OnCheckedStateChangedListener) it.next()).onCheckedStateChangedListener(this, this.f25925o);
                }
            }
            if (this.f25925o != 2 && (onCheckedChangeListener = this.f25929s) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerA = d.a(getContext().getSystemService(c.a()))) != null) {
                autofillManagerA.notifyValueChanged(this);
            }
            this.f25927q = false;
        }
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence) {
        this.f25918h = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@StringRes int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f25917g == z10) {
            return;
        }
        this.f25917g = z10;
        refreshDrawableState();
        Iterator it = this.f25912b.iterator();
        while (it.hasNext()) {
            ((OnErrorChangedListener) it.next()).onErrorChanged(this, this.f25917g);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f25929s = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @RequiresApi(30)
    public void setStateDescription(@Nullable CharSequence charSequence) {
        this.f25928r = charSequence;
        if (charSequence == null) {
            d();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f25915e = z10;
        if (z10) {
            CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.setButtonTintList(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@Nullable Drawable drawable) {
        this.f25919i = drawable;
        this.f25921k = false;
        c();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f25907v;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f25912b = new LinkedHashSet();
        this.f25913c = new LinkedHashSet();
        this.f25930t = AnimatedVectorDrawableCompat.create(getContext(), R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.f25931u = new Animatable2Compat.AnimationCallback() { // from class: com.google.android.material.checkbox.MaterialCheckBox.1
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                super.onAnimationEnd(drawable);
                ColorStateList colorStateList = MaterialCheckBox.this.f25922l;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
            }

            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                super.onAnimationStart(drawable);
                MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
                ColorStateList colorStateList = materialCheckBox.f25922l;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(materialCheckBox.f25926p, MaterialCheckBox.this.f25922l.getDefaultColor()));
                }
            }
        };
        Context context2 = getContext();
        this.f25919i = CompoundButtonCompat.getButtonDrawable(this);
        this.f25922l = getSuperButtonTintList();
        setSupportButtonTintList(null);
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.MaterialCheckBox, i10, i11, new int[0]);
        this.f25920j = tintTypedArrayObtainTintedStyledAttributes.getDrawable(R.styleable.MaterialCheckBox_buttonIcon);
        if (this.f25919i != null && ThemeEnforcement.isMaterial3Theme(context2) && b(tintTypedArrayObtainTintedStyledAttributes)) {
            super.setButtonDrawable((Drawable) null);
            this.f25919i = AppCompatResources.getDrawable(context2, R.drawable.mtrl_checkbox_button);
            this.f25921k = true;
            if (this.f25920j == null) {
                this.f25920j = AppCompatResources.getDrawable(context2, R.drawable.mtrl_checkbox_button_icon);
            }
        }
        this.f25923m = MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, R.styleable.MaterialCheckBox_buttonIconTint);
        this.f25924n = ViewUtils.parseTintMode(tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f25915e = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.MaterialCheckBox_useMaterialThemeColors, false);
        this.f25916f = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.f25917g = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.MaterialCheckBox_errorShown, false);
        this.f25918h = tintTypedArrayObtainTintedStyledAttributes.getText(R.styleable.MaterialCheckBox_errorAccessibilityLabel);
        int i12 = R.styleable.MaterialCheckBox_checkedState;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i12)) {
            setCheckedState(tintTypedArrayObtainTintedStyledAttributes.getInt(i12, 0));
        }
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        c();
    }
}
