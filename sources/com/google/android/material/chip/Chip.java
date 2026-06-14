package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import io.appmetrica.analytics.impl.H2;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class Chip extends AppCompatCheckBox implements ChipDrawable.Delegate, Shapeable, MaterialCheckable<Chip> {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f25934u = R.style.Widget_MaterialComponents_Chip_Action;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Rect f25935v = new Rect();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int[] f25936w = {android.R.attr.state_selected};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int[] f25937x = {android.R.attr.state_checkable};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ChipDrawable f25938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InsetDrawable f25939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RippleDrawable f25940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View.OnClickListener f25941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f25942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaterialCheckable.OnCheckedChangeListener f25943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f25944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f25948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f25950n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f25951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ChipTouchHelper f25952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f25953q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f25954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final RectF f25955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TextAppearanceFontCallback f25956t;

    private class ChipTouchHelper extends ExploreByTouchHelper {
        ChipTouchHelper(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected int getVirtualViewAt(float f10, float f11) {
            return (Chip.this.l() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void getVisibleVirtualViews(List list) {
            list.add(0);
            if (Chip.this.l() && Chip.this.isCloseIconVisible() && Chip.this.f25941e != null) {
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected boolean onPerformActionForVirtualView(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.performCloseIconClick();
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onPopulateNodeForHost(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.setCheckable(Chip.this.isCheckable());
            accessibilityNodeInfoCompat.setClickable(Chip.this.isClickable());
            accessibilityNodeInfoCompat.setClassName(Chip.this.getAccessibilityClassName());
            accessibilityNodeInfoCompat.setText(Chip.this.getText());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onPopulateNodeForVirtualView(int i10, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (i10 != 1) {
                accessibilityNodeInfoCompat.setContentDescription("");
                accessibilityNodeInfoCompat.setBoundsInParent(Chip.f25935v);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfoCompat.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                accessibilityNodeInfoCompat.setContentDescription(Chip.this.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfoCompat.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            accessibilityNodeInfoCompat.setEnabled(Chip.this.isEnabled());
            accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onVirtualViewKeyboardFocusChanged(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f25947k = z10;
            }
            if (Chip.this.f25938b.p0(Chip.this.f25947k)) {
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(Chip chip, CompoundButton compoundButton, boolean z10) {
        MaterialCheckable.OnCheckedChangeListener onCheckedChangeListener = chip.f25943g;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(chip, z10);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = chip.f25942f;
        if (onCheckedChangeListener2 != null) {
            onCheckedChangeListener2.onCheckedChanged(compoundButton, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        this.f25955s.setEmpty();
        if (l() && this.f25941e != null) {
            this.f25938b.getCloseIconTouchBounds(this.f25955s);
        }
        return this.f25955s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f25954r.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f25954r;
    }

    @Nullable
    private TextAppearance getTextAppearance() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getTextAppearance();
        }
        return null;
    }

    private void j(ChipDrawable chipDrawable) {
        chipDrawable.setDelegate(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] k() {
        ?? IsEnabled = isEnabled();
        int i10 = IsEnabled;
        if (this.f25947k) {
            i10 = IsEnabled + 1;
        }
        int i11 = i10;
        if (this.f25946j) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f25945i) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f25947k) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f25946j) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f25945i) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        ChipDrawable chipDrawable = this.f25938b;
        return (chipDrawable == null || chipDrawable.getCloseIcon() == null) ? false : true;
    }

    private void m(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Chip, i10, f25934u, new int[0]);
        this.f25948l = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Chip_ensureMinTouchTargetSize, false);
        this.f25950n = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(R.styleable.Chip_chipMinTouchTargetSize, MaterialAttributes.resolveMinimumAccessibleTouchTarget(context)));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void n() {
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.chip.Chip.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, @NonNull Outline outline) {
                if (Chip.this.f25938b != null) {
                    Chip.this.f25938b.getOutline(outline);
                } else {
                    outline.setAlpha(0.0f);
                }
            }
        });
    }

    private void o(int i10, int i11, int i12, int i13) {
        this.f25939c = new InsetDrawable((Drawable) this.f25938b, i10, i11, i12, i13);
    }

    private void p() {
        if (this.f25939c != null) {
            this.f25939c = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            s();
        }
    }

    private void q(ChipDrawable chipDrawable) {
        if (chipDrawable != null) {
            chipDrawable.setDelegate(null);
        }
    }

    private void r() {
        if (l() && isCloseIconVisible() && this.f25941e != null) {
            ViewCompat.setAccessibilityDelegate(this, this.f25952p);
            this.f25953q = true;
        } else {
            ViewCompat.setAccessibilityDelegate(this, null);
            this.f25953q = false;
        }
    }

    private void s() {
        t();
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f25946j != z10) {
            this.f25946j = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f25945i != z10) {
            this.f25945i = z10;
            refreshDrawableState();
        }
    }

    private void t() {
        this.f25940d = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.f25938b.getRippleColor()), getBackgroundDrawable(), null);
        this.f25938b.setUseCompatRipple(false);
        setBackground(this.f25940d);
        u();
    }

    private void u() {
        ChipDrawable chipDrawable;
        if (TextUtils.isEmpty(getText()) || (chipDrawable = this.f25938b) == null) {
            return;
        }
        int chipEndPadding = (int) (chipDrawable.getChipEndPadding() + this.f25938b.getTextEndPadding() + this.f25938b.R());
        int chipStartPadding = (int) (this.f25938b.getChipStartPadding() + this.f25938b.getTextStartPadding() + this.f25938b.N());
        if (this.f25939c != null) {
            Rect rect = new Rect();
            this.f25939c.getPadding(rect);
            chipStartPadding += rect.left;
            chipEndPadding += rect.right;
        }
        setPaddingRelative(chipStartPadding, getPaddingTop(), chipEndPadding, getPaddingBottom());
    }

    private void v() {
        TextPaint paint = getPaint();
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            paint.drawableState = chipDrawable.getState();
        }
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.updateDrawState(getContext(), paint, this.f25956t);
        }
    }

    private void w(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", H2.f75840g) != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", NavigationBarView.ITEM_GRAVITY_START_CENTER) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f25953q ? super.dispatchHoverEvent(motionEvent) : this.f25952p.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f25953q) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f25952p.dispatchKeyEvent(keyEvent) || this.f25952p.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        ChipDrawable chipDrawable = this.f25938b;
        if ((chipDrawable == null || !chipDrawable.isCloseIconStateful()) ? false : this.f25938b.setCloseIconState(k())) {
            invalidate();
        }
    }

    public boolean ensureAccessibleTouchTarget(@Dimension int i10) {
        this.f25950n = i10;
        if (!shouldEnsureMinTouchTargetSize()) {
            if (this.f25939c != null) {
                p();
            } else {
                s();
            }
            return false;
        }
        int iMax = Math.max(0, i10 - this.f25938b.getIntrinsicHeight());
        int iMax2 = Math.max(0, i10 - this.f25938b.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f25939c != null) {
                p();
            } else {
                s();
            }
            return false;
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f25939c != null) {
            Rect rect = new Rect();
            this.f25939c.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                s();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        o(i11, i12, i11, i12);
        s();
        return true;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f25951o)) {
            return this.f25951o;
        }
        if (!isCheckable()) {
            return isClickable() ? "android.widget.Button" : AndroidComposeViewAccessibilityDelegateCompat.ClassName;
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).isSingleSelection()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f25939c;
        return insetDrawable == null ? this.f25938b : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getCheckedIcon();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getCheckedIconTint();
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getChipBackgroundColor();
        }
        return null;
    }

    public float getChipCornerRadius() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return Math.max(0.0f, chipDrawable.getChipCornerRadius());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f25938b;
    }

    public float getChipEndPadding() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getChipEndPadding();
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getChipIcon() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getChipIcon();
        }
        return null;
    }

    public float getChipIconSize() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getChipIconSize();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getChipIconTint();
        }
        return null;
    }

    public float getChipMinHeight() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getChipMinHeight();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getChipStartPadding();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getChipStrokeColor();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getChipStrokeWidth();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIcon();
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconContentDescription();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconEndPadding();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconSize();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconStartPadding();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconTint();
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getEllipsize();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@NonNull Rect rect) {
        if (this.f25953q && (this.f25952p.getKeyboardFocusedVirtualViewId() == 1 || this.f25952p.getAccessibilityFocusedVirtualViewId() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getHideMotionSpec();
        }
        return null;
    }

    public float getIconEndPadding() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getIconEndPadding();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getIconStartPadding();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getRippleColor();
        }
        return null;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f25938b.getShapeAppearanceModel();
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getShowMotionSpec();
        }
        return null;
    }

    public float getTextEndPadding() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getTextEndPadding();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            return chipDrawable.getTextStartPadding();
        }
        return 0.0f;
    }

    public boolean isCheckable() {
        ChipDrawable chipDrawable = this.f25938b;
        return chipDrawable != null && chipDrawable.isCheckable();
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        ChipDrawable chipDrawable = this.f25938b;
        return chipDrawable != null && chipDrawable.isCheckedIconVisible();
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        ChipDrawable chipDrawable = this.f25938b;
        return chipDrawable != null && chipDrawable.isChipIconVisible();
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconVisible() {
        ChipDrawable chipDrawable = this.f25938b;
        return chipDrawable != null && chipDrawable.isCloseIconVisible();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.f25938b);
    }

    @Override // com.google.android.material.chip.ChipDrawable.Delegate
    public void onChipDrawableSizeChange() {
        ensureAccessibleTouchTarget(this.f25950n);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f25936w);
        }
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f25937x);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f25953q) {
            this.f25952p.onFocusChanged(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(chipGroup.getRowIndex(this), 1, chipGroup.isSingleLine() ? chipGroup.e(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @Nullable
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f25949m != i10) {
            this.f25949m = i10;
            u();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.f25945i
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L41
        L2c:
            boolean r0 = r5.f25945i
            if (r0 == 0) goto L35
            r5.performCloseIconClick()
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            return r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @CallSuper
    public boolean performCloseIconClick() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f25941e;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f25953q) {
            this.f25952p.sendEventForVirtualView(1, 1);
        }
        return z10;
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.f25951o = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f25940d) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f25940d) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCheckable(z10);
        }
    }

    public void setCheckableResource(@BoolRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCheckableResource(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable == null) {
            this.f25944h = z10;
        } else if (chipDrawable.isCheckable()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIcon(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(@DrawableRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconResource(i10);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconTint(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconTintResource(i10);
        }
    }

    public void setCheckedIconVisible(@BoolRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconVisible(i10);
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipBackgroundColor(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipBackgroundColorResource(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipCornerRadius(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipCornerRadiusResource(i10);
        }
    }

    public void setChipDrawable(@NonNull ChipDrawable chipDrawable) {
        ChipDrawable chipDrawable2 = this.f25938b;
        if (chipDrawable2 != chipDrawable) {
            q(chipDrawable2);
            this.f25938b = chipDrawable;
            chipDrawable.r0(false);
            j(this.f25938b);
            ensureAccessibleTouchTarget(this.f25950n);
        }
    }

    public void setChipEndPadding(float f10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipEndPadding(f10);
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipEndPaddingResource(i10);
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipIcon(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(@DrawableRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipIconResource(i10);
        }
    }

    public void setChipIconSize(float f10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipIconSize(f10);
        }
    }

    public void setChipIconSizeResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipIconSizeResource(i10);
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipIconTint(colorStateList);
        }
    }

    public void setChipIconTintResource(@ColorRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipIconTintResource(i10);
        }
    }

    public void setChipIconVisible(@BoolRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipIconVisible(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipMinHeight(f10);
        }
    }

    public void setChipMinHeightResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipMinHeightResource(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipStartPadding(f10);
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipStartPaddingResource(i10);
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeColor(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeColorResource(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeWidth(f10);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeWidthResource(i10);
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCloseIcon(drawable);
        }
        r();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconContentDescription(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconEndPadding(f10);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconEndPaddingResource(i10);
        }
    }

    public void setCloseIconResource(@DrawableRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconResource(i10);
        }
        r();
    }

    public void setCloseIconSize(float f10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconSize(f10);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconSizeResource(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconStartPadding(f10);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconStartPaddingResource(i10);
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconTint(colorStateList);
        }
    }

    public void setCloseIconTintResource(@ColorRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconTintResource(i10);
        }
    }

    public void setCloseIconVisible(@BoolRes int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setElevation(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f25938b == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setEllipsize(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f25948l = z10;
        ensureAccessibleTouchTarget(this.f25950n);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setHideMotionSpec(motionSpec);
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setHideMotionSpecResource(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setIconEndPadding(f10);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setIconEndPaddingResource(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setIconStartPadding(f10);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setIconStartPaddingResource(i10);
        }
    }

    @Override // com.google.android.material.internal.MaterialCheckable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@Nullable MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListener) {
        this.f25943g = onCheckedChangeListener;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f25938b == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@Px int i10) {
        super.setMaxWidth(i10);
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setMaxWidth(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f25942f = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f25941e = onClickListener;
        r();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setRippleColor(colorStateList);
        }
        if (this.f25938b.getUseCompatRipple()) {
            return;
        }
        t();
    }

    public void setRippleColorResource(@ColorRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setRippleColorResource(i10);
            if (this.f25938b.getUseCompatRipple()) {
                return;
            }
            t();
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f25938b.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setShowMotionSpec(motionSpec);
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setShowMotionSpecResource(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(chipDrawable.s0() ? null : charSequence, bufferType);
        ChipDrawable chipDrawable2 = this.f25938b;
        if (chipDrawable2 != null) {
            chipDrawable2.setText(charSequence);
        }
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setTextAppearance(textAppearance);
        }
        v();
    }

    public void setTextAppearanceResource(@StyleRes int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setTextEndPadding(f10);
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setTextEndPaddingResource(i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setTextSize(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        v();
    }

    public void setTextStartPadding(float f10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setTextStartPadding(f10);
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setTextStartPaddingResource(i10);
        }
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return this.f25948l;
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    public void setCloseIconVisible(boolean z10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconVisible(z10);
        }
        r();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f25934u;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f25954r = new Rect();
        this.f25955s = new RectF();
        this.f25956t = new TextAppearanceFontCallback() { // from class: com.google.android.material.chip.Chip.1
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrievalFailed(int i12) {
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrieved(@NonNull Typeface typeface, boolean z10) {
                Chip chip = Chip.this;
                chip.setText(chip.f25938b.s0() ? Chip.this.f25938b.getText() : Chip.this.getText());
                Chip.this.requestLayout();
                Chip.this.invalidate();
            }
        };
        Context context2 = getContext();
        w(attributeSet);
        ChipDrawable chipDrawableCreateFromAttributes = ChipDrawable.createFromAttributes(context2, attributeSet, i10, i11);
        m(context2, attributeSet, i10);
        setChipDrawable(chipDrawableCreateFromAttributes);
        chipDrawableCreateFromAttributes.setElevation(getElevation());
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.Chip, i10, i11, new int[0]);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R.styleable.Chip_shapeAppearance);
        typedArrayObtainStyledAttributes.recycle();
        this.f25952p = new ChipTouchHelper(this);
        r();
        if (!zHasValue) {
            n();
        }
        setChecked(this.f25944h);
        setText(chipDrawableCreateFromAttributes.getText());
        setEllipsize(chipDrawableCreateFromAttributes.getEllipsize());
        v();
        if (!this.f25938b.s0()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        u();
        if (shouldEnsureMinTouchTargetSize()) {
            setMinHeight(this.f25950n);
        }
        this.f25949m = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.google.android.material.chip.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                Chip.a(this.f25998a, compoundButton, z10);
            }
        });
    }

    public void setCheckedIconVisible(boolean z10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconVisible(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setChipIconVisible(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setTextAppearanceResource(i10);
        }
        v();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        ChipDrawable chipDrawable = this.f25938b;
        if (chipDrawable != null) {
            chipDrawable.setTextAppearanceResource(i10);
        }
        v();
    }
}
