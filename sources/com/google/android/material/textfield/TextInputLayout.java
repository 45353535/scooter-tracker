package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.internal.StaticLayoutBuilderConfigurer;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes9.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private ColorStateList A;
    private ValueAnimator A0;
    private ColorStateList B;
    private boolean B0;
    private ColorStateList C;
    private boolean C0;
    private ColorStateList D;
    private boolean D0;
    private boolean E;
    private CharSequence F;
    private boolean G;
    private MaterialShapeDrawable H;
    private MaterialShapeDrawable I;
    private StateListDrawable J;
    private boolean K;
    private MaterialShapeDrawable L;
    private MaterialShapeDrawable M;
    private ShapeAppearanceModel N;
    private boolean O;
    private final int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final Rect f28044a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FrameLayout f28045b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final Rect f28046b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final StartCompoundLayout f28047c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final RectF f28048c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EndCompoundLayout f28049d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Typeface f28050d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f28051e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private Drawable f28052e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    EditText f28053f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f28054f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f28055g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final LinkedHashSet f28056g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28057h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Drawable f28058h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28059i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f28060i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f28061j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private Drawable f28062j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f28063k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private ColorStateList f28064k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final IndicatorViewController f28065l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private ColorStateList f28066l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f28067m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f28068m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28069n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f28070n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f28071o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f28072o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LengthCounter f28073p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private ColorStateList f28074p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f28075q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f28076q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f28077r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f28078r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f28079s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f28080s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f28081t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f28082t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f28083u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f28084u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TextView f28085v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    int f28086v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ColorStateList f28087w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f28088w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f28089x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    final CollapsingTextHelper f28090x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Fade f28091y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f28092y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Fade f28093z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f28094z0;
    private static final int E0 = R.style.Widget_Design_TextInputLayout;
    private static final int[][] F0 = {new int[]{android.R.attr.state_pressed}, new int[0]};

    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextInputLayout f28101a;

        public AccessibilityDelegate(@NonNull TextInputLayout textInputLayout) {
            this.f28101a = textInputLayout;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            EditText editText = this.f28101a.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f28101a.getHint();
            CharSequence error = this.f28101a.getError();
            CharSequence placeholderText = this.f28101a.getPlaceholderText();
            int counterMaxLength = this.f28101a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f28101a.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zM = this.f28101a.M();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f28101a.f28047c.B(accessibilityNodeInfoCompat);
            if (!zIsEmpty) {
                accessibilityNodeInfoCompat.setText(text);
            } else if (!TextUtils.isEmpty(string)) {
                accessibilityNodeInfoCompat.setText(string);
                if (!zM && placeholderText != null) {
                    accessibilityNodeInfoCompat.setText(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat.setHintText(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    accessibilityNodeInfoCompat.setText(string);
                }
                accessibilityNodeInfoCompat.setShowingHintText(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfoCompat.setMaxTextLength(counterMaxLength);
            if (z10) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.setError(error);
            }
            View viewT = this.f28101a.f28065l.t();
            if (viewT != null) {
                accessibilityNodeInfoCompat.setLabelFor(viewT);
            }
            this.f28101a.f28049d.o().onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.f28101a.f28049d.o().onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface EndIconMode {
    }

    public interface LengthCounter {
        int countLength(@Nullable Editable editable);
    }

    public interface OnEditTextAttachedListener {
        void onEditTextAttached(@NonNull TextInputLayout textInputLayout);
    }

    public interface OnEndIconChangedListener {
        void onEndIconChanged(@NonNull TextInputLayout textInputLayout, int i10);
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.textfield.TextInputLayout.SavedState.1
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
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f28102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f28103c;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f28102b) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f28102b, parcel, i10);
            parcel.writeInt(this.f28103c ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f28102b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f28103c = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(@NonNull Context context) {
        this(context, null);
    }

    private Fade A() {
        Fade fade = new Fade();
        fade.setDuration(MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationShort2, 87));
        fade.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR));
        return fade;
    }

    private boolean B() {
        return this.E && !TextUtils.isEmpty(this.F) && (this.H instanceof CutoutDrawable);
    }

    private void C() {
        Iterator it = this.f28056g0.iterator();
        while (it.hasNext()) {
            ((OnEditTextAttachedListener) it.next()).onEditTextAttached(this);
        }
    }

    private void D(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        if (this.M == null || (materialShapeDrawable = this.L) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.f28053f.isFocused()) {
            Rect bounds = this.M.getBounds();
            Rect bounds2 = this.L.getBounds();
            float expansionFraction = this.f28090x0.getExpansionFraction();
            int iCenterX = bounds2.centerX();
            bounds.left = AnimationUtils.lerp(iCenterX, bounds2.left, expansionFraction);
            bounds.right = AnimationUtils.lerp(iCenterX, bounds2.right, expansionFraction);
            this.M.draw(canvas);
        }
    }

    private void E(Canvas canvas) {
        if (this.E) {
            this.f28090x0.draw(canvas);
        }
    }

    private void F(boolean z10) {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.A0.cancel();
        }
        if (z10 && this.f28094z0) {
            l(0.0f);
        } else {
            this.f28090x0.setExpansionFraction(0.0f);
        }
        if (B() && ((CutoutDrawable) this.H).O()) {
            y();
        }
        this.f28088w0 = true;
        L();
        this.f28047c.m(true);
        this.f28049d.L(true);
    }

    private MaterialShapeDrawable G(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f28053f;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setTopLeftCornerSize(f10).setTopRightCornerSize(f10).setBottomLeftCornerSize(dimensionPixelOffset).setBottomRightCornerSize(dimensionPixelOffset).build();
        EditText editText2 = this.f28053f;
        MaterialShapeDrawable materialShapeDrawableCreateWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        materialShapeDrawableCreateWithElevationOverlay.setShapeAppearanceModel(shapeAppearanceModelBuild);
        materialShapeDrawableCreateWithElevationOverlay.setPadding(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return materialShapeDrawableCreateWithElevationOverlay;
    }

    private static Drawable H(MaterialShapeDrawable materialShapeDrawable, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{MaterialColors.layer(i11, i10, 0.1f), i10}), materialShapeDrawable, materialShapeDrawable);
    }

    private int I(int i10, boolean z10) {
        return i10 + ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f28053f.getCompoundPaddingLeft() : this.f28049d.A() : this.f28047c.c());
    }

    private int J(int i10, boolean z10) {
        return i10 - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f28053f.getCompoundPaddingRight() : this.f28047c.c() : this.f28049d.A());
    }

    private static Drawable K(Context context, MaterialShapeDrawable materialShapeDrawable, int i10, int[][] iArr) {
        int color = MaterialColors.getColor(context, R.attr.colorSurface, "TextInputLayout");
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        int iLayer = MaterialColors.layer(i10, color, 0.1f);
        materialShapeDrawable2.setFillColor(new ColorStateList(iArr, new int[]{iLayer, 0}));
        materialShapeDrawable2.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iLayer, color});
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        materialShapeDrawable3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
    }

    private void L() {
        TextView textView = this.f28085v;
        if (textView == null || !this.f28083u) {
            return;
        }
        textView.setText((CharSequence) null);
        TransitionManager.beginDelayedTransition(this.f28045b, this.f28093z);
        this.f28085v.setVisibility(4);
    }

    private boolean N() {
        return getHintMaxLines() == 1;
    }

    private boolean O() {
        if (X()) {
            return true;
        }
        return this.f28075q != null && this.f28071o;
    }

    private boolean P() {
        return this.Q == 1 && this.f28053f.getMinLines() <= 1;
    }

    private void Q() {
        p();
        m0();
        w0();
        b0();
        k();
        if (this.Q != 0) {
            p0();
        }
        V();
    }

    private void R() {
        if (B()) {
            RectF rectF = this.f28048c0;
            this.f28090x0.getCollapsedTextBottomTextBounds(rectF, this.f28053f.getWidth(), this.f28053f.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.S);
            rectF.top = 0.0f;
            ((CutoutDrawable) this.H).R(rectF);
        }
    }

    private void S() {
        if (!B() || this.f28088w0) {
            return;
        }
        y();
        R();
    }

    private static void T(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                T((ViewGroup) childAt, z10);
            }
        }
    }

    private void U() {
        TextView textView = this.f28085v;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void V() {
        EditText editText = this.f28053f;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.Q;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private boolean Y() {
        return (this.f28049d.J() || ((this.f28049d.C() && isEndIconVisible()) || this.f28049d.y() != null)) && this.f28049d.getMeasuredWidth() > 0;
    }

    private boolean Z() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f28047c.getMeasuredWidth() > 0;
    }

    private void a0() {
        if (this.f28085v == null || !this.f28083u || TextUtils.isEmpty(this.f28081t)) {
            return;
        }
        this.f28085v.setText(this.f28081t);
        TransitionManager.beginDelayedTransition(this.f28045b, this.f28091y);
        this.f28085v.setVisibility(0);
        this.f28085v.bringToFront();
    }

    private void b0() {
        if (this.Q == 1) {
            if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
                this.R = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
                this.R = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    public static /* synthetic */ int c(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private void c0(Rect rect) {
        MaterialShapeDrawable materialShapeDrawable = this.L;
        if (materialShapeDrawable != null) {
            int i10 = rect.bottom;
            materialShapeDrawable.setBounds(rect.left, i10 - this.T, rect.right, i10);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.M;
        if (materialShapeDrawable2 != null) {
            int i11 = rect.bottom;
            materialShapeDrawable2.setBounds(rect.left, i11 - this.U, rect.right, i11);
        }
    }

    private void d0(int i10) {
        this.f28090x0.updateTextHeights(i10);
        Rect rect = this.f28044a0;
        DescendantOffsetUtils.getDescendantRect(this, this.f28053f, rect);
        this.f28090x0.setCollapsedBounds(r(rect));
        p0();
        k();
        n0(i10);
    }

    private void e0() {
        if (this.f28075q != null) {
            EditText editText = this.f28053f;
            f0(editText == null ? null : editText.getText());
        }
    }

    private static void g0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f28053f;
        if (!(editText instanceof AutoCompleteTextView) || EditTextUtils.a(editText)) {
            return this.H;
        }
        int color = MaterialColors.getColor(this.f28053f, androidx.appcompat.R.attr.colorControlHighlight);
        int i10 = this.Q;
        if (i10 == 2) {
            return K(getContext(), this.H, color, F0);
        }
        if (i10 == 1) {
            return H(this.H, this.W, color, F0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.J == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.J = stateListDrawable;
            stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.J.addState(new int[0], G(false));
        }
        return this.J;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.I == null) {
            this.I = G(true);
        }
        return this.I;
    }

    private void h0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f28075q;
        if (textView != null) {
            W(textView, this.f28071o ? this.f28077r : this.f28079s);
            if (!this.f28071o && (colorStateList2 = this.A) != null) {
                this.f28075q.setTextColor(colorStateList2);
            }
            if (!this.f28071o || (colorStateList = this.B) == null) {
                return;
            }
            this.f28075q.setTextColor(colorStateList);
        }
    }

    private void i0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListOrNull = this.C;
        if (colorStateListOrNull == null) {
            colorStateListOrNull = MaterialColors.getColorStateListOrNull(getContext(), androidx.appcompat.R.attr.colorControlActivated);
        }
        EditText editText = this.f28053f;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = DrawableCompat.wrap(this.f28053f.getTextCursorDrawable()).mutate();
        if (O() && (colorStateList = this.D) != null) {
            colorStateListOrNull = colorStateList;
        }
        drawableMutate.setTintList(colorStateListOrNull);
    }

    private void j() {
        TextView textView = this.f28085v;
        if (textView != null) {
            this.f28045b.addView(textView);
            this.f28085v.setVisibility(0);
        }
    }

    private void k() {
        if (this.f28053f == null || this.Q != 1) {
            return;
        }
        if (!N()) {
            EditText editText = this.f28053f;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f28090x0.getCollapsedTextHeight() + this.f28051e), this.f28053f.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
            EditText editText2 = this.f28053f;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), this.f28053f.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            EditText editText3 = this.f28053f;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), this.f28053f.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private void l0() {
        this.f28053f.setBackground(getEditTextBoxBackground());
    }

    private void m() {
        MaterialShapeDrawable materialShapeDrawable = this.H;
        if (materialShapeDrawable == null) {
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        ShapeAppearanceModel shapeAppearanceModel2 = this.N;
        if (shapeAppearanceModel != shapeAppearanceModel2) {
            this.H.setShapeAppearanceModel(shapeAppearanceModel2);
        }
        if (w()) {
            this.H.setStroke(this.S, this.V);
        }
        int iQ = q();
        this.W = iQ;
        this.H.setFillColor(ColorStateList.valueOf(iQ));
        n();
        m0();
    }

    private void n() {
        if (this.L == null || this.M == null) {
            return;
        }
        if (x()) {
            this.L.setFillColor(this.f28053f.isFocused() ? ColorStateList.valueOf(this.f28068m0) : ColorStateList.valueOf(this.V));
            this.M.setFillColor(ColorStateList.valueOf(this.V));
        }
        invalidate();
    }

    private void n0(int i10) {
        if (this.f28053f == null) {
            return;
        }
        float expandedTextHeight = this.f28090x0.getExpandedTextHeight();
        float height = 0.0f;
        if (this.f28081t != null) {
            TextPaint textPaint = new TextPaint(129);
            textPaint.set(this.f28085v.getPaint());
            textPaint.setTextSize(this.f28085v.getTextSize());
            textPaint.setTypeface(this.f28085v.getTypeface());
            textPaint.setLetterSpacing(this.f28085v.getLetterSpacing());
            try {
                height = StaticLayoutBuilderCompat.obtain(this.f28081t, textPaint, i10).setIsRtl(getLayoutDirection() == 1).setIncludePad(true).setLineSpacing(this.f28085v.getLineSpacingExtra(), this.f28085v.getLineSpacingMultiplier()).setStaticLayoutBuilderConfigurer(new StaticLayoutBuilderConfigurer() { // from class: com.google.android.material.textfield.w
                    @Override // com.google.android.material.internal.StaticLayoutBuilderConfigurer
                    public final void configure(StaticLayout.Builder builder) {
                        builder.setBreakStrategy(this.f28118a.f28085v.getBreakStrategy());
                    }
                }).build().getHeight() + (this.Q == 1 ? this.f28090x0.getCollapsedTextHeight() + this.R + this.f28051e : 0.0f);
            } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e10) {
                Log.e("TextInputLayout", e10.getCause().getMessage(), e10);
            }
        }
        float fMax = Math.max(expandedTextHeight, height);
        if (this.f28053f.getMeasuredHeight() < fMax) {
            this.f28053f.setMinimumHeight(Math.round(fMax));
        }
    }

    private void o(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.P;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private boolean o0() {
        int iMax;
        if (this.f28053f == null || this.f28053f.getMeasuredHeight() >= (iMax = Math.max(this.f28049d.getMeasuredHeight(), this.f28047c.getMeasuredHeight()))) {
            return false;
        }
        this.f28053f.setMinimumHeight(iMax);
        return true;
    }

    private void p() {
        int i10 = this.Q;
        if (i10 == 0) {
            this.H = null;
            this.L = null;
            this.M = null;
            return;
        }
        if (i10 == 1) {
            this.H = new MaterialShapeDrawable(this.N);
            this.L = new MaterialShapeDrawable();
            this.M = new MaterialShapeDrawable();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.Q + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.E || (this.H instanceof CutoutDrawable)) {
                this.H = new MaterialShapeDrawable(this.N);
            } else {
                this.H = CutoutDrawable.M(this.N);
            }
            this.L = null;
            this.M = null;
        }
    }

    private void p0() {
        if (this.Q != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f28045b.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.f28045b.requestLayout();
            }
        }
    }

    private int q() {
        return this.Q == 1 ? MaterialColors.layer(MaterialColors.getColor(this, R.attr.colorSurface, 0), this.W) : this.W;
    }

    private Rect r(Rect rect) {
        if (this.f28053f == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f28046b0;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        rect2.bottom = rect.bottom;
        int i10 = this.Q;
        if (i10 == 1) {
            rect2.left = I(rect.left, zIsLayoutRtl);
            rect2.top = rect.top + this.R;
            rect2.right = J(rect.right, zIsLayoutRtl);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = I(rect.left, zIsLayoutRtl);
            rect2.top = getPaddingTop();
            rect2.right = J(rect.right, zIsLayoutRtl);
            return rect2;
        }
        rect2.left = rect.left + this.f28053f.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f28053f.getPaddingRight();
        return rect2;
    }

    private void r0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f28053f;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f28053f;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        ColorStateList colorStateList2 = this.f28064k0;
        if (colorStateList2 != null) {
            this.f28090x0.setCollapsedAndExpandedTextColor(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f28064k0;
            this.f28090x0.setCollapsedAndExpandedTextColor(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f28084u0) : this.f28084u0));
        } else if (X()) {
            this.f28090x0.setCollapsedAndExpandedTextColor(this.f28065l.r());
        } else if (this.f28071o && (textView = this.f28075q) != null) {
            this.f28090x0.setCollapsedAndExpandedTextColor(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f28066l0) != null) {
            this.f28090x0.setCollapsedTextColor(colorStateList);
        }
        if (z13 || !this.f28092y0 || (isEnabled() && z12)) {
            if (z11 || this.f28088w0) {
                z(z10);
                return;
            }
            return;
        }
        if (z11 || !this.f28088w0) {
            F(z10);
        }
    }

    private int s(Rect rect, Rect rect2, float f10) {
        return P() ? (int) (rect2.top + f10) : rect.bottom - this.f28053f.getCompoundPaddingBottom();
    }

    private void s0() {
        EditText editText;
        if (this.f28085v == null || (editText = this.f28053f) == null) {
            return;
        }
        this.f28085v.setGravity(editText.getGravity());
        this.f28085v.setPadding(this.f28053f.getCompoundPaddingLeft(), this.f28053f.getCompoundPaddingTop(), this.f28053f.getCompoundPaddingRight(), this.f28053f.getCompoundPaddingBottom());
    }

    private void setEditText(EditText editText) {
        if (this.f28053f != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f28053f = editText;
        int i10 = this.f28057h;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f28061j);
        }
        int i11 = this.f28059i;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f28063k);
        }
        this.K = false;
        Q();
        setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
        this.f28090x0.setTypefaces(this.f28053f.getTypeface());
        this.f28090x0.setExpandedTextSize(this.f28053f.getTextSize());
        this.f28090x0.setExpandedLetterSpacing(this.f28053f.getLetterSpacing());
        int gravity = this.f28053f.getGravity();
        this.f28090x0.setCollapsedTextGravity((gravity & (-113)) | 48);
        this.f28090x0.setExpandedTextGravity(gravity);
        this.f28086v0 = editText.getMinimumHeight();
        this.f28053f.addTextChangedListener(new TextWatcher(editText) { // from class: com.google.android.material.textfield.TextInputLayout.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f28095b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ EditText f28096c;

            {
                this.f28096c = editText;
                this.f28095b = editText.getLineCount();
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(@NonNull Editable editable) {
                TextInputLayout.this.q0(!r0.C0);
                TextInputLayout textInputLayout = TextInputLayout.this;
                if (textInputLayout.f28067m) {
                    textInputLayout.f0(editable);
                }
                if (TextInputLayout.this.f28083u) {
                    TextInputLayout.this.u0(editable);
                }
                int lineCount = this.f28096c.getLineCount();
                int i12 = this.f28095b;
                if (lineCount != i12) {
                    if (lineCount < i12) {
                        int minimumHeight = this.f28096c.getMinimumHeight();
                        int i13 = TextInputLayout.this.f28086v0;
                        if (minimumHeight != i13) {
                            this.f28096c.setMinimumHeight(i13);
                        }
                    }
                    this.f28095b = lineCount;
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            }
        });
        if (this.f28064k0 == null) {
            this.f28064k0 = this.f28053f.getHintTextColors();
        }
        if (this.E) {
            if (TextUtils.isEmpty(this.F)) {
                CharSequence hint = this.f28053f.getHint();
                this.f28055g = hint;
                setHint(hint);
                this.f28053f.setHint((CharSequence) null);
            }
            this.G = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            i0();
        }
        if (this.f28075q != null) {
            f0(this.f28053f.getText());
        }
        k0();
        this.f28065l.f();
        this.f28047c.bringToFront();
        this.f28049d.bringToFront();
        C();
        this.f28049d.D0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        r0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.F)) {
            return;
        }
        this.F = charSequence;
        this.f28090x0.setText(charSequence);
        if (this.f28088w0) {
            return;
        }
        R();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f28083u == z10) {
            return;
        }
        if (z10) {
            j();
        } else {
            U();
            this.f28085v = null;
        }
        this.f28083u = z10;
    }

    private int t(Rect rect, float f10) {
        if (P()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return (rect.top + this.f28053f.getCompoundPaddingTop()) - ((this.Q != 0 || N()) ? 0 : (int) (this.f28090x0.getExpandedTextSingleLineHeight() / 2.0f));
    }

    private void t0() {
        EditText editText = this.f28053f;
        u0(editText == null ? null : editText.getText());
    }

    private Rect u(Rect rect) {
        if (this.f28053f == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f28046b0;
        float expandedTextSingleLineHeight = N() ? this.f28090x0.getExpandedTextSingleLineHeight() : this.f28090x0.getExpandedTextFullSingleLineHeight() * this.f28090x0.getExpandedLineCount();
        rect2.left = rect.left + this.f28053f.getCompoundPaddingLeft();
        rect2.top = t(rect, expandedTextSingleLineHeight);
        rect2.right = rect.right - this.f28053f.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, expandedTextSingleLineHeight);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(Editable editable) {
        if (this.f28073p.countLength(editable) != 0 || this.f28088w0) {
            L();
        } else {
            a0();
        }
    }

    private int v() {
        if (!this.E) {
            return 0;
        }
        int i10 = this.Q;
        if (i10 == 0) {
            return (int) this.f28090x0.getCollapsedTextHeight();
        }
        if (i10 != 2) {
            return 0;
        }
        return N() ? (int) (this.f28090x0.getCollapsedTextHeight() / 2.0f) : Math.max(0, (int) (this.f28090x0.getCollapsedTextHeight() - (this.f28090x0.getCollapsedSingleLineHeight() / 2.0f)));
    }

    private void v0(boolean z10, boolean z11) {
        int defaultColor = this.f28074p0.getDefaultColor();
        int colorForState = this.f28074p0.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f28074p0.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.V = colorForState2;
        } else if (z11) {
            this.V = colorForState;
        } else {
            this.V = defaultColor;
        }
    }

    private boolean w() {
        return this.Q == 2 && x();
    }

    private boolean x() {
        return this.S > -1 && this.V != 0;
    }

    private void y() {
        if (B()) {
            ((CutoutDrawable) this.H).P();
        }
    }

    private void z(boolean z10) {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.A0.cancel();
        }
        if (z10 && this.f28094z0) {
            l(1.0f);
        } else {
            this.f28090x0.setExpansionFraction(1.0f);
        }
        this.f28088w0 = false;
        if (B()) {
            R();
        }
        t0();
        this.f28047c.m(false);
        this.f28049d.L(false);
    }

    final boolean M() {
        return this.f28088w0;
    }

    void W(TextView textView, int i10) {
        try {
            TextViewCompat.setTextAppearance(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        TextViewCompat.setTextAppearance(textView, androidx.appcompat.R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(ContextCompat.getColor(getContext(), R.color.design_error));
    }

    boolean X() {
        return this.f28065l.l();
    }

    public void addOnEditTextAttachedListener(@NonNull OnEditTextAttachedListener onEditTextAttachedListener) {
        this.f28056g0.add(onEditTextAttachedListener);
        if (this.f28053f != null) {
            onEditTextAttachedListener.onEditTextAttached(this);
        }
    }

    public void addOnEndIconChangedListener(@NonNull OnEndIconChangedListener onEndIconChangedListener) {
        this.f28049d.g(onEndIconChangedListener);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i10, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f28045b.addView(view, layoutParams2);
        this.f28045b.setLayoutParams(layoutParams);
        p0();
        setEditText((EditText) view);
    }

    public void clearOnEditTextAttachedListeners() {
        this.f28056g0.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.f28049d.j();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i10) {
        EditText editText = this.f28053f;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f28055g != null) {
            boolean z10 = this.G;
            this.G = false;
            CharSequence hint = editText.getHint();
            this.f28053f.setHint(this.f28055g);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f28053f.setHint(hint);
                this.G = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f28045b.getChildCount());
        for (int i11 = 0; i11 < this.f28045b.getChildCount(); i11++) {
            View childAt = this.f28045b.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f28053f) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.C0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.C0 = false;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.B0) {
            return;
        }
        this.B0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        CollapsingTextHelper collapsingTextHelper = this.f28090x0;
        boolean state = collapsingTextHelper != null ? collapsingTextHelper.setState(drawableState) : false;
        if (this.f28053f != null) {
            q0(isLaidOut() && isEnabled());
        }
        k0();
        w0();
        if (state) {
            invalidate();
        }
        this.B0 = false;
    }

    void f0(Editable editable) {
        int iCountLength = this.f28073p.countLength(editable);
        boolean z10 = this.f28071o;
        int i10 = this.f28069n;
        if (i10 == -1) {
            this.f28075q.setText(String.valueOf(iCountLength));
            this.f28075q.setContentDescription(null);
            this.f28071o = false;
        } else {
            this.f28071o = iCountLength > i10;
            g0(getContext(), this.f28075q, iCountLength, this.f28069n, this.f28071o);
            if (z10 != this.f28071o) {
                h0();
            }
            this.f28075q.setText(BidiFormatter.getInstance().unicodeWrap(getContext().getString(R.string.character_counter_pattern, Integer.valueOf(iCountLength), Integer.valueOf(this.f28069n))));
        }
        if (this.f28053f == null || z10 == this.f28071o) {
            return;
        }
        q0(false);
        w0();
        k0();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f28053f;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    @NonNull
    MaterialShapeDrawable getBoxBackground() {
        int i10 = this.Q;
        if (i10 == 1 || i10 == 2) {
            return this.H;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.W;
    }

    public int getBoxBackgroundMode() {
        return this.Q;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.R;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return ViewUtils.isLayoutRtl(this) ? this.N.getBottomLeftCornerSize().getCornerSize(this.f28048c0) : this.N.getBottomRightCornerSize().getCornerSize(this.f28048c0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return ViewUtils.isLayoutRtl(this) ? this.N.getBottomRightCornerSize().getCornerSize(this.f28048c0) : this.N.getBottomLeftCornerSize().getCornerSize(this.f28048c0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return ViewUtils.isLayoutRtl(this) ? this.N.getTopLeftCornerSize().getCornerSize(this.f28048c0) : this.N.getTopRightCornerSize().getCornerSize(this.f28048c0);
    }

    public float getBoxCornerRadiusTopStart() {
        return ViewUtils.isLayoutRtl(this) ? this.N.getTopRightCornerSize().getCornerSize(this.f28048c0) : this.N.getTopLeftCornerSize().getCornerSize(this.f28048c0);
    }

    public int getBoxStrokeColor() {
        return this.f28072o0;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f28074p0;
    }

    public int getBoxStrokeWidth() {
        return this.T;
    }

    public int getBoxStrokeWidthFocused() {
        return this.U;
    }

    public int getCounterMaxLength() {
        return this.f28069n;
    }

    @Nullable
    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f28067m && this.f28071o && (textView = this.f28075q) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.B;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.A;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorColor() {
        return this.C;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorErrorColor() {
        return this.D;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f28064k0;
    }

    @Nullable
    public EditText getEditText() {
        return this.f28053f;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f28049d.n();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f28049d.p();
    }

    public int getEndIconMinSize() {
        return this.f28049d.q();
    }

    public int getEndIconMode() {
        return this.f28049d.r();
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f28049d.s();
    }

    @NonNull
    CheckableImageButton getEndIconView() {
        return this.f28049d.t();
    }

    @Nullable
    public CharSequence getError() {
        if (this.f28065l.A()) {
            return this.f28065l.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f28065l.n();
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f28065l.o();
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        return this.f28065l.q();
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f28049d.u();
    }

    @Nullable
    public CharSequence getHelperText() {
        if (this.f28065l.B()) {
            return this.f28065l.s();
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        return this.f28065l.u();
    }

    @Nullable
    public CharSequence getHint() {
        if (this.E) {
            return this.F;
        }
        return null;
    }

    @VisibleForTesting
    final float getHintCollapsedTextHeight() {
        return this.f28090x0.getCollapsedTextHeight();
    }

    @VisibleForTesting
    final int getHintCurrentCollapsedTextColor() {
        return this.f28090x0.getCurrentCollapsedTextColor();
    }

    public int getHintMaxLines() {
        return this.f28090x0.getExpandedMaxLines();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f28066l0;
    }

    @NonNull
    public LengthCounter getLengthCounter() {
        return this.f28073p;
    }

    public int getMaxEms() {
        return this.f28059i;
    }

    @Px
    public int getMaxWidth() {
        return this.f28063k;
    }

    public int getMinEms() {
        return this.f28057h;
    }

    @Px
    public int getMinWidth() {
        return this.f28061j;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f28049d.w();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f28049d.x();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.f28083u) {
            return this.f28081t;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.f28089x;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f28087w;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f28047c.a();
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f28047c.b();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f28047c.d();
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.N;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f28047c.e();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f28047c.f();
    }

    public int getStartIconMinSize() {
        return this.f28047c.g();
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f28047c.h();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f28049d.y();
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f28049d.z();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f28049d.B();
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f28050d0;
    }

    public boolean isCounterEnabled() {
        return this.f28067m;
    }

    public boolean isEndIconCheckable() {
        return this.f28049d.G();
    }

    public boolean isEndIconVisible() {
        return this.f28049d.I();
    }

    public boolean isErrorEnabled() {
        return this.f28065l.A();
    }

    public boolean isExpandedHintEnabled() {
        return this.f28092y0;
    }

    public boolean isHelperTextEnabled() {
        return this.f28065l.B();
    }

    public boolean isHintAnimationEnabled() {
        return this.f28094z0;
    }

    public boolean isHintEnabled() {
        return this.E;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.f28049d.K();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isProvidingHint() {
        return this.G;
    }

    public boolean isStartIconCheckable() {
        return this.f28047c.k();
    }

    public boolean isStartIconVisible() {
        return this.f28047c.l();
    }

    boolean j0() {
        boolean z10;
        if (this.f28053f == null) {
            return false;
        }
        boolean z11 = true;
        if (Z()) {
            int measuredWidth = this.f28047c.getMeasuredWidth() - this.f28053f.getPaddingLeft();
            if (this.f28052e0 == null || this.f28054f0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f28052e0 = colorDrawable;
                this.f28054f0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f28053f.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.f28052e0;
            if (drawable != drawable2) {
                this.f28053f.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f28052e0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f28053f.getCompoundDrawablesRelative();
                this.f28053f.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f28052e0 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (Y()) {
            int measuredWidth2 = this.f28049d.B().getMeasuredWidth() - this.f28053f.getPaddingRight();
            CheckableImageButton checkableImageButtonM = this.f28049d.m();
            if (checkableImageButtonM != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonM.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButtonM.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.f28053f.getCompoundDrawablesRelative();
            Drawable drawable3 = this.f28058h0;
            if (drawable3 != null && this.f28060i0 != measuredWidth2) {
                this.f28060i0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f28053f.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f28058h0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f28058h0 = colorDrawable2;
                this.f28060i0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.f28058h0;
            if (drawable4 != drawable5) {
                this.f28062j0 = drawable4;
                this.f28053f.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f28058h0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f28053f.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f28058h0) {
                this.f28053f.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f28062j0, compoundDrawablesRelative4[3]);
            } else {
                z11 = z10;
            }
            this.f28058h0 = null;
            return z11;
        }
        return z10;
    }

    void k0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f28053f;
        if (editText == null || this.Q != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (DrawableUtils.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (X()) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f28071o && (textView = this.f28075q) != null) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            DrawableCompat.clearColorFilter(background);
            this.f28053f.refreshDrawableState();
        }
    }

    void l(float f10) {
        if (this.f28090x0.getExpansionFraction() == f10) {
            return;
        }
        if (this.A0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.A0 = valueAnimator;
            valueAnimator.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            this.A0.setDuration(MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationMedium4, 167));
            this.A0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.TextInputLayout.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                    TextInputLayout.this.f28090x0.setExpansionFraction(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.A0.setFloatValues(this.f28090x0.getExpansionFraction(), f10);
        this.A0.start();
    }

    void m0() {
        EditText editText = this.f28053f;
        if (editText == null || this.H == null) {
            return;
        }
        if ((this.K || editText.getBackground() == null) && this.Q != 0) {
            l0();
            this.K = true;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f28090x0.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f28049d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.D0 = false;
        boolean zO0 = o0();
        boolean zJ0 = j0();
        if (zO0 || zJ0) {
            this.f28053f.post(new Runnable() { // from class: com.google.android.material.textfield.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28117b.f28053f.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f28053f;
        if (editText != null) {
            Rect rect = this.f28044a0;
            DescendantOffsetUtils.getDescendantRect(this, editText, rect);
            c0(rect);
            if (this.E) {
                this.f28090x0.setExpandedTextSize(this.f28053f.getTextSize());
                int gravity = this.f28053f.getGravity();
                this.f28090x0.setCollapsedTextGravity((gravity & (-113)) | 48);
                this.f28090x0.setExpandedTextGravity(gravity);
                this.f28090x0.setCollapsedBounds(r(rect));
                this.f28090x0.setExpandedBounds(u(rect));
                this.f28090x0.recalculate();
                if (!B() || this.f28088w0) {
                    return;
                }
                R();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.D0) {
            this.f28049d.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.D0 = true;
        }
        s0();
        this.f28049d.D0();
        if (N()) {
            return;
        }
        d0((this.f28053f.getMeasuredWidth() - this.f28053f.getCompoundPaddingLeft()) - this.f28053f.getCompoundPaddingRight());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.f28102b);
        if (savedState.f28103c) {
            post(new Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    TextInputLayout.this.f28049d.i();
                }
            });
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.O) {
            float cornerSize = this.N.getTopLeftCornerSize().getCornerSize(this.f28048c0);
            float cornerSize2 = this.N.getTopRightCornerSize().getCornerSize(this.f28048c0);
            ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setTopLeftCorner(this.N.getTopRightCorner()).setTopRightCorner(this.N.getTopLeftCorner()).setBottomLeftCorner(this.N.getBottomRightCorner()).setBottomRightCorner(this.N.getBottomLeftCorner()).setTopLeftCornerSize(cornerSize2).setTopRightCornerSize(cornerSize).setBottomLeftCornerSize(this.N.getBottomRightCornerSize().getCornerSize(this.f28048c0)).setBottomRightCornerSize(this.N.getBottomLeftCornerSize().getCornerSize(this.f28048c0)).build();
            this.O = z10;
            setShapeAppearanceModel(shapeAppearanceModelBuild);
        }
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (X()) {
            savedState.f28102b = getError();
        }
        savedState.f28103c = this.f28049d.H();
        return savedState;
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z10) {
        this.f28049d.A0(z10);
    }

    void q0(boolean z10) {
        r0(z10, false);
    }

    public void refreshEndIconDrawableState() {
        this.f28049d.N();
    }

    public void refreshErrorIconDrawableState() {
        this.f28049d.O();
    }

    public void refreshStartIconDrawableState() {
        this.f28047c.n();
    }

    public void removeOnEditTextAttachedListener(@NonNull OnEditTextAttachedListener onEditTextAttachedListener) {
        this.f28056g0.remove(onEditTextAttachedListener);
    }

    public void removeOnEndIconChangedListener(@NonNull OnEndIconChangedListener onEndIconChangedListener) {
        this.f28049d.Q(onEndIconChangedListener);
    }

    public void setBoxBackgroundColor(@ColorInt int i10) {
        if (this.W != i10) {
            this.W = i10;
            this.f28076q0 = i10;
            this.f28080s0 = i10;
            this.f28082t0 = i10;
            m();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i10) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f28076q0 = defaultColor;
        this.W = defaultColor;
        this.f28078r0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f28080s0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.f28082t0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.Q) {
            return;
        }
        this.Q = i10;
        if (this.f28053f != null) {
            Q();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.R = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.N = this.N.toBuilder().setTopLeftCorner(i10, this.N.getTopLeftCornerSize()).setTopRightCorner(i10, this.N.getTopRightCornerSize()).setBottomLeftCorner(i10, this.N.getBottomLeftCornerSize()).setBottomRightCorner(i10, this.N.getBottomRightCornerSize()).build();
        m();
    }

    public void setBoxCornerRadii(float f10, float f11, float f12, float f13) {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        this.O = zIsLayoutRtl;
        float f14 = zIsLayoutRtl ? f11 : f10;
        if (!zIsLayoutRtl) {
            f10 = f11;
        }
        float f15 = zIsLayoutRtl ? f13 : f12;
        if (!zIsLayoutRtl) {
            f12 = f13;
        }
        MaterialShapeDrawable materialShapeDrawable = this.H;
        if (materialShapeDrawable != null && materialShapeDrawable.getTopLeftCornerResolvedSize() == f14 && this.H.getTopRightCornerResolvedSize() == f10 && this.H.getBottomLeftCornerResolvedSize() == f15 && this.H.getBottomRightCornerResolvedSize() == f12) {
            return;
        }
        this.N = this.N.toBuilder().setTopLeftCornerSize(f14).setTopRightCornerSize(f10).setBottomLeftCornerSize(f15).setBottomRightCornerSize(f12).build();
        m();
    }

    public void setBoxCornerRadiiResources(@DimenRes int i10, @DimenRes int i11, @DimenRes int i12, @DimenRes int i13) {
        setBoxCornerRadii(getContext().getResources().getDimension(i10), getContext().getResources().getDimension(i11), getContext().getResources().getDimension(i13), getContext().getResources().getDimension(i12));
    }

    public void setBoxStrokeColor(@ColorInt int i10) {
        if (this.f28072o0 != i10) {
            this.f28072o0 = i10;
            w0();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f28068m0 = colorStateList.getDefaultColor();
            this.f28084u0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f28070n0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.f28072o0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.f28072o0 != colorStateList.getDefaultColor()) {
            this.f28072o0 = colorStateList.getDefaultColor();
        }
        w0();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f28074p0 != colorStateList) {
            this.f28074p0 = colorStateList;
            w0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.T = i10;
        w0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.U = i10;
        w0();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f28067m != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f28075q = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.f28050d0;
                if (typeface != null) {
                    this.f28075q.setTypeface(typeface);
                }
                this.f28075q.setMaxLines(1);
                this.f28065l.e(this.f28075q, 2);
                ((ViewGroup.MarginLayoutParams) this.f28075q.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                h0();
                e0();
            } else {
                this.f28065l.C(this.f28075q, 2);
                this.f28075q = null;
            }
            this.f28067m = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f28069n != i10) {
            if (i10 > 0) {
                this.f28069n = i10;
            } else {
                this.f28069n = -1;
            }
            if (this.f28067m) {
                e0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f28077r != i10) {
            this.f28077r = i10;
            h0();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            h0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f28079s != i10) {
            this.f28079s = i10;
            h0();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            h0();
        }
    }

    @RequiresApi(29)
    public void setCursorColor(@Nullable ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            i0();
        }
    }

    @RequiresApi(29)
    public void setCursorErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (O()) {
                i0();
            }
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f28064k0 = colorStateList;
        this.f28066l0 = colorStateList;
        if (this.f28053f != null) {
            q0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        T(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f28049d.S(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f28049d.T(z10);
    }

    public void setEndIconContentDescription(@StringRes int i10) {
        this.f28049d.U(i10);
    }

    public void setEndIconDrawable(@DrawableRes int i10) {
        this.f28049d.W(i10);
    }

    public void setEndIconMinSize(@IntRange(from = 0) int i10) {
        this.f28049d.Y(i10);
    }

    public void setEndIconMode(int i10) {
        this.f28049d.Z(i10);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f28049d.a0(onClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f28049d.b0(onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f28049d.c0(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        this.f28049d.d0(colorStateList);
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.f28049d.e0(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f28049d.f0(z10);
    }

    public void setError(@Nullable CharSequence charSequence) {
        if (!this.f28065l.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f28065l.w();
        } else {
            this.f28065l.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f28065l.E(i10);
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        this.f28065l.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f28065l.G(z10);
    }

    public void setErrorIconDrawable(@DrawableRes int i10) {
        this.f28049d.g0(i10);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f28049d.i0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f28049d.j0(onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        this.f28049d.k0(colorStateList);
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.f28049d.l0(mode);
    }

    public void setErrorTextAppearance(@StyleRes int i10) {
        this.f28065l.H(i10);
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        this.f28065l.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f28092y0 != z10) {
            this.f28092y0 = z10;
            q0(false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!isHelperTextEnabled()) {
                setHelperTextEnabled(true);
            }
            this.f28065l.R(charSequence);
        }
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        this.f28065l.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f28065l.K(z10);
    }

    public void setHelperTextTextAppearance(@StyleRes int i10) {
        this.f28065l.J(i10);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.E) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f28094z0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.E) {
            this.E = z10;
            if (z10) {
                CharSequence hint = this.f28053f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.F)) {
                        setHint(hint);
                    }
                    this.f28053f.setHint((CharSequence) null);
                }
                this.G = true;
            } else {
                this.G = false;
                if (!TextUtils.isEmpty(this.F) && TextUtils.isEmpty(this.f28053f.getHint())) {
                    this.f28053f.setHint(this.F);
                }
                setHintInternal(null);
            }
            if (this.f28053f != null) {
                p0();
            }
        }
    }

    public void setHintMaxLines(int i10) {
        this.f28090x0.setCollapsedMaxLines(i10);
        this.f28090x0.setExpandedMaxLines(i10);
        requestLayout();
    }

    public void setHintTextAppearance(@StyleRes int i10) {
        this.f28090x0.setCollapsedTextAppearance(i10);
        this.f28066l0 = this.f28090x0.getCollapsedTextColor();
        if (this.f28053f != null) {
            q0(false);
            p0();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f28066l0 != colorStateList) {
            if (this.f28064k0 == null) {
                this.f28090x0.setCollapsedTextColor(colorStateList);
            }
            this.f28066l0 = colorStateList;
            if (this.f28053f != null) {
                q0(false);
            }
        }
    }

    public void setLengthCounter(@NonNull LengthCounter lengthCounter) {
        this.f28073p = lengthCounter;
    }

    public void setMaxEms(int i10) {
        this.f28059i = i10;
        EditText editText = this.f28053f;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(@Px int i10) {
        this.f28063k = i10;
        EditText editText = this.f28053f;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(@DimenRes int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f28057h = i10;
        EditText editText = this.f28053f;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(@Px int i10) {
        this.f28061j = i10;
        EditText editText = this.f28053f;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(@DimenRes int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i10) {
        this.f28049d.n0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i10) {
        this.f28049d.p0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f28049d.r0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.f28049d.s0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.f28049d.t0(mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.f28085v == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f28085v = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            this.f28085v.setImportantForAccessibility(1);
            this.f28085v.setAccessibilityLiveRegion(1);
            Fade fadeA = A();
            this.f28091y = fadeA;
            fadeA.setStartDelay(67L);
            this.f28093z = A();
            setPlaceholderTextAppearance(this.f28089x);
            setPlaceholderTextColor(this.f28087w);
            ViewCompat.setAccessibilityDelegate(this.f28085v, new AccessibilityDelegateCompat() { // from class: com.google.android.material.textfield.TextInputLayout.2
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setVisibleToUser(false);
                }
            });
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f28083u) {
                setPlaceholderTextEnabled(true);
            }
            this.f28081t = charSequence;
        }
        t0();
    }

    public void setPlaceholderTextAppearance(@StyleRes int i10) {
        this.f28089x = i10;
        TextView textView = this.f28085v;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i10);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f28087w != colorStateList) {
            this.f28087w = colorStateList;
            TextView textView = this.f28085v;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        this.f28047c.o(charSequence);
    }

    public void setPrefixTextAppearance(@StyleRes int i10) {
        this.f28047c.p(i10);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f28047c.q(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.H;
        if (materialShapeDrawable == null || materialShapeDrawable.getShapeAppearanceModel() == shapeAppearanceModel) {
            return;
        }
        this.N = shapeAppearanceModel;
        m();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f28047c.r(z10);
    }

    public void setStartIconContentDescription(@StringRes int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(@DrawableRes int i10) {
        setStartIconDrawable(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }

    public void setStartIconMinSize(@IntRange(from = 0) int i10) {
        this.f28047c.u(i10);
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f28047c.v(onClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f28047c.w(onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f28047c.x(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        this.f28047c.y(colorStateList);
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.f28047c.z(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f28047c.A(z10);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        this.f28049d.u0(charSequence);
    }

    public void setSuffixTextAppearance(@StyleRes int i10) {
        this.f28049d.v0(i10);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f28049d.w0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable AccessibilityDelegate accessibilityDelegate) {
        EditText editText = this.f28053f;
        if (editText != null) {
            ViewCompat.setAccessibilityDelegate(editText, accessibilityDelegate);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.f28050d0) {
            this.f28050d0 = typeface;
            this.f28090x0.setTypefaces(typeface);
            this.f28065l.N(typeface);
            TextView textView = this.f28075q;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void w0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.H == null || this.Q == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f28053f) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f28053f) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.V = this.f28084u0;
        } else if (X()) {
            if (this.f28074p0 != null) {
                v0(z11, z10);
            } else {
                this.V = getErrorCurrentTextColors();
            }
        } else if (!this.f28071o || (textView = this.f28075q) == null) {
            if (z11) {
                this.V = this.f28072o0;
            } else if (z10) {
                this.V = this.f28070n0;
            } else {
                this.V = this.f28068m0;
            }
        } else if (this.f28074p0 != null) {
            v0(z11, z10);
        } else {
            this.V = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            i0();
        }
        this.f28049d.M();
        refreshStartIconDrawableState();
        if (this.Q == 2) {
            int i10 = this.S;
            if (z11 && isEnabled()) {
                this.S = this.U;
            } else {
                this.S = this.T;
            }
            if (this.S != i10) {
                S();
            }
        }
        if (this.Q == 1) {
            if (!isEnabled()) {
                this.W = this.f28078r0;
            } else if (z10 && !z11) {
                this.W = this.f28082t0;
            } else if (z11) {
                this.W = this.f28080s0;
            } else {
                this.W = this.f28076q0;
            }
        }
        m();
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        this.f28049d.V(charSequence);
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.f28049d.X(drawable);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f28049d.h0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f28049d.o0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f28049d.q0(drawable);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        this.f28047c.s(charSequence);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f28047c.t(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = E0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f28057h = -1;
        this.f28059i = -1;
        this.f28061j = -1;
        this.f28063k = -1;
        this.f28065l = new IndicatorViewController(this);
        this.f28073p = new LengthCounter() { // from class: com.google.android.material.textfield.v
            @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
            public final int countLength(Editable editable) {
                return TextInputLayout.c(editable);
            }
        };
        this.f28044a0 = new Rect();
        this.f28046b0 = new Rect();
        this.f28048c0 = new RectF();
        this.f28056g0 = new LinkedHashSet();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.f28090x0 = collapsingTextHelper;
        this.D0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f28045b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        collapsingTextHelper.setTextSizeInterpolator(timeInterpolator);
        collapsingTextHelper.setPositionInterpolator(timeInterpolator);
        collapsingTextHelper.setCollapsedTextGravity(8388659);
        int[] iArr = R.styleable.TextInputLayout;
        int i12 = R.styleable.TextInputLayout_counterTextAppearance;
        int i13 = R.styleable.TextInputLayout_counterOverflowTextAppearance;
        int i14 = R.styleable.TextInputLayout_errorTextAppearance;
        int i15 = R.styleable.TextInputLayout_helperTextTextAppearance;
        int i16 = R.styleable.TextInputLayout_hintTextAppearance;
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, iArr, i10, i11, i12, i13, i14, i15, i16);
        StartCompoundLayout startCompoundLayout = new StartCompoundLayout(this, tintTypedArrayObtainTintedStyledAttributes);
        this.f28047c = startCompoundLayout;
        this.E = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_hintEnabled, true);
        setHint(tintTypedArrayObtainTintedStyledAttributes.getText(R.styleable.TextInputLayout_android_hint));
        this.f28094z0 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_hintAnimationEnabled, true);
        this.f28092y0 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_expandedHintEnabled, true);
        int i17 = R.styleable.TextInputLayout_android_minEms;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i17)) {
            setMinEms(tintTypedArrayObtainTintedStyledAttributes.getInt(i17, -1));
        } else {
            int i18 = R.styleable.TextInputLayout_android_minWidth;
            if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i18)) {
                setMinWidth(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i18, -1));
            }
        }
        int i19 = R.styleable.TextInputLayout_android_maxEms;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i19)) {
            setMaxEms(tintTypedArrayObtainTintedStyledAttributes.getInt(i19, -1));
        } else {
            int i20 = R.styleable.TextInputLayout_android_maxWidth;
            if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i20)) {
                setMaxWidth(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i20, -1));
            }
        }
        this.N = ShapeAppearanceModel.builder(context2, attributeSet, i10, i11).build();
        this.P = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.R = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelOffset(R.styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f28051e = getResources().getDimensionPixelSize(R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.T = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.U = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.S = this.T;
        float dimension = tintTypedArrayObtainTintedStyledAttributes.getDimension(R.styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = tintTypedArrayObtainTintedStyledAttributes.getDimension(R.styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = tintTypedArrayObtainTintedStyledAttributes.getDimension(R.styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = tintTypedArrayObtainTintedStyledAttributes.getDimension(R.styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        ShapeAppearanceModel.Builder builder = this.N.toBuilder();
        if (dimension >= 0.0f) {
            builder.setTopLeftCornerSize(dimension);
        }
        if (dimension2 >= 0.0f) {
            builder.setTopRightCornerSize(dimension2);
        }
        if (dimension3 >= 0.0f) {
            builder.setBottomRightCornerSize(dimension3);
        }
        if (dimension4 >= 0.0f) {
            builder.setBottomLeftCornerSize(dimension4);
        }
        this.N = builder.build();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, R.styleable.TextInputLayout_boxBackgroundColor);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            this.f28076q0 = defaultColor;
            this.W = defaultColor;
            if (colorStateList.isStateful()) {
                this.f28078r0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f28080s0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.f28082t0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.f28080s0 = this.f28076q0;
                ColorStateList colorStateList2 = AppCompatResources.getColorStateList(context2, R.color.mtrl_filled_background_color);
                this.f28078r0 = colorStateList2.getColorForState(new int[]{-16842910}, -1);
                this.f28082t0 = colorStateList2.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
        } else {
            this.W = 0;
            this.f28076q0 = 0;
            this.f28078r0 = 0;
            this.f28080s0 = 0;
            this.f28082t0 = 0;
        }
        int i21 = R.styleable.TextInputLayout_android_textColorHint;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i21)) {
            ColorStateList colorStateList3 = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i21);
            this.f28066l0 = colorStateList3;
            this.f28064k0 = colorStateList3;
        }
        int i22 = R.styleable.TextInputLayout_boxStrokeColor;
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, i22);
        this.f28072o0 = tintTypedArrayObtainTintedStyledAttributes.getColor(i22, 0);
        this.f28068m0 = ContextCompat.getColor(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.f28084u0 = ContextCompat.getColor(context2, R.color.mtrl_textinput_disabled_color);
        this.f28070n0 = ContextCompat.getColor(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateList4 != null) {
            setBoxStrokeColorStateList(colorStateList4);
        }
        int i23 = R.styleable.TextInputLayout_boxStrokeErrorColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i23)) {
            setBoxStrokeErrorColor(MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, i23));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.getResourceId(i16, -1) != -1) {
            setHintTextAppearance(tintTypedArrayObtainTintedStyledAttributes.getResourceId(i16, 0));
        }
        this.C = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.TextInputLayout_cursorColor);
        this.D = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.TextInputLayout_cursorErrorColor);
        int resourceId = tintTypedArrayObtainTintedStyledAttributes.getResourceId(i14, 0);
        CharSequence text = tintTypedArrayObtainTintedStyledAttributes.getText(R.styleable.TextInputLayout_errorContentDescription);
        int i24 = tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean z10 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_errorEnabled, false);
        int resourceId2 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(i15, 0);
        boolean z11 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_helperTextEnabled, false);
        CharSequence text2 = tintTypedArrayObtainTintedStyledAttributes.getText(R.styleable.TextInputLayout_helperText);
        int resourceId3 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence text3 = tintTypedArrayObtainTintedStyledAttributes.getText(R.styleable.TextInputLayout_placeholderText);
        boolean z12 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.TextInputLayout_counterMaxLength, -1));
        this.f28079s = tintTypedArrayObtainTintedStyledAttributes.getResourceId(i12, 0);
        this.f28077r = tintTypedArrayObtainTintedStyledAttributes.getResourceId(i13, 0);
        setBoxBackgroundMode(tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i24);
        setCounterOverflowTextAppearance(this.f28077r);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f28079s);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        int i25 = R.styleable.TextInputLayout_errorTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i25)) {
            setErrorTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i25));
        }
        int i26 = R.styleable.TextInputLayout_helperTextTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i26)) {
            setHelperTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i26));
        }
        int i27 = R.styleable.TextInputLayout_hintTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i27)) {
            setHintTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i27));
        }
        int i28 = R.styleable.TextInputLayout_counterTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i28)) {
            setCounterTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i28));
        }
        int i29 = R.styleable.TextInputLayout_counterOverflowTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i29)) {
            setCounterOverflowTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i29));
        }
        int i30 = R.styleable.TextInputLayout_placeholderTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i30)) {
            setPlaceholderTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i30));
        }
        EndCompoundLayout endCompoundLayout = new EndCompoundLayout(this, tintTypedArrayObtainTintedStyledAttributes);
        this.f28049d = endCompoundLayout;
        boolean z13 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_android_enabled, true);
        setHintMaxLines(tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.TextInputLayout_hintMaxLines, 1));
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(startCompoundLayout);
        frameLayout.addView(endCompoundLayout);
        addView(frameLayout);
        setEnabled(z13);
        setHelperTextEnabled(z11);
        setErrorEnabled(z10);
        setCounterEnabled(z12);
        setHelperText(text2);
    }

    public void setHint(@StringRes int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
