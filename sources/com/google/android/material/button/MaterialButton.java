package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.customview.view.AbsSavedState;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import com.google.android.material.shape.StateListSizeChange;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialButton extends AppCompatButton implements Checkable, Shapeable {
    private static final int[] D = {R.attr.state_checkable};
    private static final int[] E = {R.attr.state_checked};
    private static final int F = com.google.android.material.R.style.Widget_MaterialComponents_Button;
    private static final int G = com.google.android.material.R.attr.materialSizeOverlay;
    private static final FloatPropertyCompat H = new FloatPropertyCompat<MaterialButton>("widthIncrease") { // from class: com.google.android.material.button.MaterialButton.1
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(MaterialButton materialButton) {
            return materialButton.getDisplayedWidthIncrease();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(MaterialButton materialButton, float f10) {
            materialButton.setDisplayedWidthIncrease(f10);
        }
    };
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;
    private float A;
    private float B;
    private SpringAnimation C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaterialButtonHelper f25703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashSet f25704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OnPressedChangeListener f25705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f25706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f25707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f25708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f25709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f25712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f25713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f25714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f25715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f25716o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f25717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f25718q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f25719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f25720s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private LinearLayout.LayoutParams f25721t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f25722u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f25723v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f25724w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f25725x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    StateListSizeChange f25726y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f25727z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f25728a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25729b;

        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            this.f25729b = propertyMapper.mapInt("iconPadding", com.google.android.material.R.attr.iconPadding);
            this.f25728a = true;
        }

        public void readProperties(@NonNull MaterialButton materialButton, @NonNull PropertyReader propertyReader) {
            if (!this.f25728a) {
                throw androidx.appcompat.widget.c.a();
            }
            propertyReader.readInt(this.f25729b, materialButton.getIconPadding());
        }
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialButton materialButton, boolean z10);
    }

    interface OnPressedChangeListener {
        void onPressedChanged(MaterialButton materialButton, boolean z10);
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.button.MaterialButton.SavedState.1
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f25730b;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel) {
            this.f25730b = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f25730b ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            a(parcel);
        }
    }

    public MaterialButton(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.f25723v = materialButton.getOpticalCenterShift();
        materialButton.r();
        materialButton.invalidate();
    }

    public static /* synthetic */ void b(MaterialButton materialButton, float f10) {
        int i10 = (int) (f10 * 0.11f);
        if (materialButton.f25723v != i10) {
            materialButton.f25723v = i10;
            materialButton.r();
            materialButton.invalidate();
        }
    }

    private SpringForce e() {
        return MotionUtils.resolveThemeSpringForce(getContext(), com.google.android.material.R.attr.motionSpringFastSpatial, com.google.android.material.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
    }

    private void f() {
        SpringAnimation springAnimation = new SpringAnimation(this, (FloatPropertyCompat<MaterialButton>) H);
        this.C = springAnimation;
        springAnimation.setSpring(e());
    }

    private boolean g() {
        int i10 = this.f25716o;
        return i10 == 3 || i10 == 4;
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.A;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        MaterialShapeDrawable materialShapeDrawableD;
        if (this.f25722u && this.f25724w && (materialShapeDrawableD = this.f25703b.d()) != null) {
            return (int) (materialShapeDrawableD.getCornerSizeDiffX() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    private boolean h() {
        int i10 = this.f25716o;
        return i10 == 1 || i10 == 2;
    }

    private boolean i() {
        int i10 = this.f25716o;
        return i10 == 16 || i10 == 32;
    }

    private boolean j() {
        return (getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getOrientation() == 0;
    }

    private boolean k() {
        return getLayoutDirection() == 1;
    }

    private boolean l() {
        MaterialButtonHelper materialButtonHelper = this.f25703b;
        return (materialButtonHelper == null || materialButtonHelper.n()) ? false : true;
    }

    private void m(boolean z10) {
        if (this.f25726y == null) {
            return;
        }
        if (this.C == null) {
            f();
        }
        if (this.f25724w) {
            this.C.animateToFinalPosition(Math.min(this.f25727z, this.f25726y.getSizeChangeForState(getDrawableState()).widthChange.getChange(getWidth())));
            if (z10) {
                this.C.skipToEnd();
            }
        }
    }

    private void o() {
        if (h()) {
            setCompoundDrawablesRelative(this.f25708g, null, null, null);
        } else if (g()) {
            setCompoundDrawablesRelative(null, null, this.f25708g, null);
        } else if (i()) {
            setCompoundDrawablesRelative(null, this.f25708g, null, null);
        }
    }

    private void p(boolean z10) {
        Drawable drawable = this.f25708g;
        if (drawable != null) {
            Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
            this.f25708g = drawableMutate;
            drawableMutate.setTintList(this.f25707f);
            PorterDuff.Mode mode = this.f25706e;
            if (mode != null) {
                this.f25708g.setTintMode(mode);
            }
            int intrinsicWidth = this.f25710i;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f25708g.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f25710i;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f25708g.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f25708g;
            int i10 = this.f25711j;
            int i11 = this.f25712k;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f25708g.setVisible(true, z10);
        }
        if (z10) {
            o();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!h() || drawable3 == this.f25708g) && ((!g() || drawable5 == this.f25708g) && (!i() || drawable4 == this.f25708g))) {
            return;
        }
        o();
    }

    private void q(int i10, int i11) {
        if (this.f25708g == null || getLayout() == null) {
            return;
        }
        if (!h() && !g()) {
            if (i()) {
                this.f25711j = 0;
                if (this.f25716o == 16) {
                    this.f25712k = 0;
                    p(false);
                    return;
                }
                int intrinsicHeight = this.f25710i;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f25708g.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f25713l) - getPaddingBottom()) / 2);
                if (this.f25712k != iMax) {
                    this.f25712k = iMax;
                    p(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f25712k = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f25716o;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f25711j = 0;
            p(false);
            return;
        }
        int intrinsicWidth = this.f25710i;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f25708g.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.f25713l) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (k() != (this.f25716o == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f25711j != textLayoutWidth) {
            this.f25711j = textLayoutWidth;
            p(false);
        }
    }

    private void r() {
        int i10 = (int) (this.A - this.B);
        int i11 = (i10 / 2) + this.f25723v;
        getLayoutParams().width = (int) (this.f25718q + i10);
        setPaddingRelative(this.f25719r + i11, getPaddingTop(), (this.f25720s + i10) - i11, getPaddingBottom());
    }

    private void setCheckedInternal(boolean z10) {
        if (!isCheckable() || this.f25714m == z10) {
            return;
        }
        this.f25714m = z10;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).t(this, this.f25714m);
        }
        if (this.f25715n) {
            return;
        }
        this.f25715n = true;
        Iterator it = this.f25704c.iterator();
        while (it.hasNext()) {
            ((OnCheckedChangeListener) it.next()).onCheckedChanged(this, this.f25714m);
        }
        this.f25715n = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f10) {
        if (this.A != f10) {
            this.A = f10;
            r();
            invalidate();
            if (getParent() instanceof MaterialButtonGroup) {
                ((MaterialButtonGroup) getParent()).k(this, (int) this.A);
            }
        }
    }

    public void addOnCheckedChangeListener(@NonNull OnCheckedChangeListener onCheckedChangeListener) {
        this.f25704c.add(onCheckedChangeListener);
    }

    public void clearOnCheckedChangeListeners() {
        this.f25704c.clear();
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f25709h)) {
            return (isCheckable() ? CompoundButton.class : Button.class).getName();
        }
        return this.f25709h;
    }

    @Px
    int getAllowedWidthDecrease() {
        return this.f25725x;
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Px
    public int getCornerRadius() {
        if (l()) {
            return this.f25703b.b();
        }
        return 0;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SpringForce getCornerSpringForce() {
        return this.f25703b.c();
    }

    public Drawable getIcon() {
        return this.f25708g;
    }

    public int getIconGravity() {
        return this.f25716o;
    }

    @Px
    public int getIconPadding() {
        return this.f25713l;
    }

    @Px
    public int getIconSize() {
        return this.f25710i;
    }

    public ColorStateList getIconTint() {
        return this.f25707f;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f25706e;
    }

    @Dimension
    public int getInsetBottom() {
        return this.f25703b.getInsetBottom();
    }

    @Dimension
    public int getInsetTop() {
        return this.f25703b.getInsetTop();
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (l()) {
            return this.f25703b.f();
        }
        return null;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        if (l()) {
            return this.f25703b.g();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListShapeAppearanceModel getStateListShapeAppearanceModel() {
        if (l()) {
            return this.f25703b.h();
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (l()) {
            return this.f25703b.i();
        }
        return null;
    }

    @Px
    public int getStrokeWidth() {
        if (l()) {
            return this.f25703b.j();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        return l() ? this.f25703b.k() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return l() ? this.f25703b.l() : super.getSupportBackgroundTintMode();
    }

    public boolean isCheckable() {
        MaterialButtonHelper materialButtonHelper = this.f25703b;
        return materialButtonHelper != null && materialButtonHelper.o();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f25714m;
    }

    public boolean isOpticalCenterEnabled() {
        return this.f25722u;
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.f25703b.p();
    }

    void n() {
        LinearLayout.LayoutParams layoutParams = this.f25721t;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.f25721t = null;
            this.f25718q = -1.0f;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (l()) {
            MaterialShapeUtils.setParentAbsoluteElevation(this, this.f25703b.d());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        q(getMeasuredWidth(), getMeasuredHeight());
        int i15 = getResources().getConfiguration().orientation;
        if (this.f25717p != i15) {
            this.f25717p = i15;
            this.f25718q = -1.0f;
        }
        if (this.f25718q == -1.0f) {
            this.f25718q = getMeasuredWidth();
            if (this.f25721t == null && (getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getButtonSizeChange() != null) {
                this.f25721t = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f25721t);
                layoutParams.width = (int) this.f25718q;
                setLayoutParams(layoutParams);
            }
        }
        if (this.f25725x == -1) {
            if (this.f25708g == null) {
                i14 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f25710i;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f25708g.getIntrinsicWidth();
                }
                i14 = iconPadding + intrinsicWidth;
            }
            this.f25725x = (getMeasuredWidth() - getTextLayoutWidth()) - i14;
        }
        if (this.f25719r == -1) {
            this.f25719r = getPaddingStart();
        }
        if (this.f25720s == -1) {
            this.f25720s = getPaddingEnd();
        }
        this.f25724w = j();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f25730b);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f25730b = this.f25714m;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        q(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (isEnabled() && this.f25703b.p()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f25708g != null) {
            if (this.f25708g.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void removeOnCheckedChangeListener(@NonNull OnCheckedChangeListener onCheckedChangeListener) {
        this.f25704c.remove(onCheckedChangeListener);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setA11yClassName(@Nullable String str) {
        this.f25709h = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i10) {
        if (l()) {
            this.f25703b.r(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!l()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f25703b.s();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i10) {
        setBackgroundDrawable(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (l()) {
            this.f25703b.t(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedInternal(z10);
    }

    public void setCornerRadius(@Px int i10) {
        if (l()) {
            this.f25703b.u(i10);
        }
    }

    public void setCornerRadiusResource(@DimenRes int i10) {
        if (l()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setCornerSpringForce(@NonNull SpringForce springForce) {
        this.f25703b.w(springForce);
    }

    void setDisplayedWidthDecrease(int i10) {
        this.B = Math.min(i10, this.f25725x);
        r();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (l()) {
            this.f25703b.d().setElevation(f10);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.f25708g != drawable) {
            this.f25708g = drawable;
            p(true);
            q(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f25716o != i10) {
            this.f25716o = i10;
            q(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@Px int i10) {
        if (this.f25713l != i10) {
            this.f25713l = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(@DrawableRes int i10) {
        setIcon(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }

    public void setIconSize(@Px int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f25710i != i10) {
            this.f25710i = i10;
            p(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f25707f != colorStateList) {
            this.f25707f = colorStateList;
            p(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f25706e != mode) {
            this.f25706e = mode;
            p(false);
        }
    }

    public void setIconTintResource(@ColorRes int i10) {
        setIconTint(AppCompatResources.getColorStateList(getContext(), i10));
    }

    public void setInsetBottom(@Dimension int i10) {
        this.f25703b.setInsetBottom(i10);
    }

    public void setInsetTop(@Dimension int i10) {
        this.f25703b.setInsetTop(i10);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(@Nullable OnPressedChangeListener onPressedChangeListener) {
        this.f25705d = onPressedChangeListener;
    }

    public void setOpticalCenterEnabled(boolean z10) {
        if (this.f25722u != z10) {
            this.f25722u = z10;
            if (z10) {
                this.f25703b.v(new MaterialShapeDrawable.OnCornerSizeChangeListener() { // from class: com.google.android.material.button.a
                    @Override // com.google.android.material.shape.MaterialShapeDrawable.OnCornerSizeChangeListener
                    public final void onCornerSizeChange(float f10) {
                        MaterialButton.b(this.f25775a, f10);
                    }
                });
            } else {
                this.f25703b.v(null);
            }
            post(new Runnable() { // from class: com.google.android.material.button.b
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialButton.a(this.f25776b);
                }
            });
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        OnPressedChangeListener onPressedChangeListener = this.f25705d;
        if (onPressedChangeListener != null) {
            onPressedChangeListener.onPressedChanged(this, z10);
        }
        super.setPressed(z10);
        m(false);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (l()) {
            this.f25703b.x(colorStateList);
        }
    }

    public void setRippleColorResource(@ColorRes int i10) {
        if (l()) {
            setRippleColor(AppCompatResources.getColorStateList(getContext(), i10));
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (!l()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f25703b.y(shapeAppearanceModel);
    }

    void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (l()) {
            this.f25703b.z(z10);
        }
    }

    void setSizeChange(@NonNull StateListSizeChange stateListSizeChange) {
        if (this.f25726y != stateListSizeChange) {
            this.f25726y = stateListSizeChange;
            m(true);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStateListShapeAppearanceModel(@NonNull StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        if (!l()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        if (this.f25703b.c() == null && stateListShapeAppearanceModel.isStateful()) {
            this.f25703b.w(e());
        }
        this.f25703b.A(stateListShapeAppearanceModel);
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (l()) {
            this.f25703b.B(colorStateList);
        }
    }

    public void setStrokeColorResource(@ColorRes int i10) {
        if (l()) {
            setStrokeColor(AppCompatResources.getColorStateList(getContext(), i10));
        }
    }

    public void setStrokeWidth(@Px int i10) {
        if (l()) {
            this.f25703b.C(i10);
        }
    }

    public void setStrokeWidthResource(@DimenRes int i10) {
        if (l()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (l()) {
            this.f25703b.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (l()) {
            this.f25703b.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        q(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f25703b.F(z10);
    }

    @Override // android.widget.TextView
    public void setWidth(@Px int i10) {
        this.f25718q = -1.0f;
        super.setWidth(i10);
    }

    void setWidthChangeMax(@Px int i10) {
        if (this.f25727z != i10) {
            this.f25727z = i10;
            m(true);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f25714m);
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        ShapeAppearanceModel shapeAppearanceModelBuild;
        int i11 = F;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11, new int[]{G}), attributeSet, i10);
        this.f25704c = new LinkedHashSet();
        this.f25714m = false;
        this.f25715n = false;
        this.f25717p = -1;
        this.f25718q = -1.0f;
        this.f25719r = -1;
        this.f25720s = -1;
        this.f25725x = -1;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.MaterialButton, i10, i11, new int[0]);
        this.f25713l = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_iconPadding, 0);
        this.f25706e = ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f25707f = MaterialResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialButton_iconTint);
        this.f25708g = MaterialResources.getDrawable(getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialButton_icon);
        this.f25716o = typedArrayObtainStyledAttributes.getInteger(com.google.android.material.R.styleable.MaterialButton_iconGravity, 1);
        this.f25710i = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_iconSize, 0);
        StateListShapeAppearanceModel stateListShapeAppearanceModelCreate = StateListShapeAppearanceModel.create(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialButton_shapeAppearance);
        if (stateListShapeAppearanceModelCreate != null) {
            shapeAppearanceModelBuild = stateListShapeAppearanceModelCreate.getDefaultShape(true);
        } else {
            shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context2, attributeSet, i10, i11).build();
        }
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialButton_opticalCenterEnabled, false);
        MaterialButtonHelper materialButtonHelper = new MaterialButtonHelper(this, shapeAppearanceModelBuild);
        this.f25703b = materialButtonHelper;
        materialButtonHelper.q(typedArrayObtainStyledAttributes);
        setCheckedInternal(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialButton_android_checked, false));
        if (stateListShapeAppearanceModelCreate != null) {
            materialButtonHelper.w(e());
            materialButtonHelper.A(stateListShapeAppearanceModelCreate);
        }
        setOpticalCenterEnabled(z10);
        typedArrayObtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.f25713l);
        p(this.f25708g != null);
    }
}
