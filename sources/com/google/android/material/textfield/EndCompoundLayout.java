package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"ViewConstructor"})
class EndCompoundLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final TextInputLayout f27951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FrameLayout f27952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CheckableImageButton f27953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f27954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f27955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View.OnLongClickListener f27956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CheckableImageButton f27957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final EndIconDelegates f27958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final LinkedHashSet f27960k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f27961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private PorterDuff.Mode f27962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27963n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView.ScaleType f27964o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View.OnLongClickListener f27965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f27966q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final TextView f27967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f27968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private EditText f27969t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final AccessibilityManager f27970u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f27971v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final TextWatcher f27972w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final TextInputLayout.OnEditTextAttachedListener f27973x;

    private static class EndIconDelegates {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f27977a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final EndCompoundLayout f27978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f27979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f27980d;

        EndIconDelegates(EndCompoundLayout endCompoundLayout, TintTypedArray tintTypedArray) {
            this.f27978b = endCompoundLayout;
            this.f27979c = tintTypedArray.getResourceId(R.styleable.TextInputLayout_endIconDrawable, 0);
            this.f27980d = tintTypedArray.getResourceId(R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }

        private EndIconDelegate b(int i10) {
            if (i10 == -1) {
                return new CustomEndIconDelegate(this.f27978b);
            }
            if (i10 == 0) {
                return new NoEndIconDelegate(this.f27978b);
            }
            if (i10 == 1) {
                return new PasswordToggleEndIconDelegate(this.f27978b, this.f27980d);
            }
            if (i10 == 2) {
                return new ClearTextEndIconDelegate(this.f27978b);
            }
            if (i10 == 3) {
                return new DropdownMenuEndIconDelegate(this.f27978b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        EndIconDelegate c(int i10) {
            EndIconDelegate endIconDelegate = (EndIconDelegate) this.f27977a.get(i10);
            if (endIconDelegate != null) {
                return endIconDelegate;
            }
            EndIconDelegate endIconDelegateB = b(i10);
            this.f27977a.append(i10, endIconDelegateB);
            return endIconDelegateB;
        }
    }

    EndCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.f27959j = 0;
        this.f27960k = new LinkedHashSet();
        this.f27972w = new TextWatcherAdapter() { // from class: com.google.android.material.textfield.EndCompoundLayout.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                EndCompoundLayout.this.o().afterEditTextChanged(editable);
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                EndCompoundLayout.this.o().a(charSequence, i10, i11, i12);
            }
        };
        TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.2
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(@NonNull TextInputLayout textInputLayout2) {
                if (EndCompoundLayout.this.f27969t == textInputLayout2.getEditText()) {
                    return;
                }
                if (EndCompoundLayout.this.f27969t != null) {
                    EndCompoundLayout.this.f27969t.removeTextChangedListener(EndCompoundLayout.this.f27972w);
                    if (EndCompoundLayout.this.f27969t.getOnFocusChangeListener() == EndCompoundLayout.this.o().d()) {
                        EndCompoundLayout.this.f27969t.setOnFocusChangeListener(null);
                    }
                }
                EndCompoundLayout.this.f27969t = textInputLayout2.getEditText();
                if (EndCompoundLayout.this.f27969t != null) {
                    EndCompoundLayout.this.f27969t.addTextChangedListener(EndCompoundLayout.this.f27972w);
                }
                EndCompoundLayout.this.o().onEditTextAttached(EndCompoundLayout.this.f27969t);
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                endCompoundLayout.m0(endCompoundLayout.o());
            }
        };
        this.f27973x = onEditTextAttachedListener;
        this.f27970u = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f27951b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.END));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f27952c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonK = k(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f27953d = checkableImageButtonK;
        CheckableImageButton checkableImageButtonK2 = k(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f27957h = checkableImageButtonK2;
        this.f27958i = new EndIconDelegates(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f27967r = appCompatTextView;
        E(tintTypedArray);
        D(tintTypedArray);
        F(tintTypedArray);
        frameLayout.addView(checkableImageButtonK2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonK);
        textInputLayout.addOnEditTextAttachedListener(onEditTextAttachedListener);
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                EndCompoundLayout.this.h();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                EndCompoundLayout.this.R();
            }
        });
    }

    private void B0() {
        this.f27952c.setVisibility((this.f27957h.getVisibility() != 0 || J()) ? 8 : 0);
        setVisibility((I() || J() || ((this.f27966q == null || this.f27968s) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void C0() {
        this.f27953d.setVisibility(u() != null && this.f27951b.isErrorEnabled() && this.f27951b.X() ? 0 : 8);
        B0();
        D0();
        if (C()) {
            return;
        }
        this.f27951b.j0();
    }

    private void D(TintTypedArray tintTypedArray) {
        int i10 = R.styleable.TextInputLayout_passwordToggleEnabled;
        if (!tintTypedArray.hasValue(i10)) {
            int i11 = R.styleable.TextInputLayout_endIconTint;
            if (tintTypedArray.hasValue(i11)) {
                this.f27961l = MaterialResources.getColorStateList(getContext(), tintTypedArray, i11);
            }
            int i12 = R.styleable.TextInputLayout_endIconTintMode;
            if (tintTypedArray.hasValue(i12)) {
                this.f27962m = ViewUtils.parseTintMode(tintTypedArray.getInt(i12, -1), null);
            }
        }
        int i13 = R.styleable.TextInputLayout_endIconMode;
        if (tintTypedArray.hasValue(i13)) {
            Z(tintTypedArray.getInt(i13, 0));
            int i14 = R.styleable.TextInputLayout_endIconContentDescription;
            if (tintTypedArray.hasValue(i14)) {
                V(tintTypedArray.getText(i14));
            }
            T(tintTypedArray.getBoolean(R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (tintTypedArray.hasValue(i10)) {
            int i15 = R.styleable.TextInputLayout_passwordToggleTint;
            if (tintTypedArray.hasValue(i15)) {
                this.f27961l = MaterialResources.getColorStateList(getContext(), tintTypedArray, i15);
            }
            int i16 = R.styleable.TextInputLayout_passwordToggleTintMode;
            if (tintTypedArray.hasValue(i16)) {
                this.f27962m = ViewUtils.parseTintMode(tintTypedArray.getInt(i16, -1), null);
            }
            Z(tintTypedArray.getBoolean(i10, false) ? 1 : 0);
            V(tintTypedArray.getText(R.styleable.TextInputLayout_passwordToggleContentDescription));
        }
        Y(tintTypedArray.getDimensionPixelSize(R.styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        int i17 = R.styleable.TextInputLayout_endIconScaleType;
        if (tintTypedArray.hasValue(i17)) {
            c0(IconHelper.b(tintTypedArray.getInt(i17, -1)));
        }
    }

    private void E(TintTypedArray tintTypedArray) {
        int i10 = R.styleable.TextInputLayout_errorIconTint;
        if (tintTypedArray.hasValue(i10)) {
            this.f27954e = MaterialResources.getColorStateList(getContext(), tintTypedArray, i10);
        }
        int i11 = R.styleable.TextInputLayout_errorIconTintMode;
        if (tintTypedArray.hasValue(i11)) {
            this.f27955f = ViewUtils.parseTintMode(tintTypedArray.getInt(i11, -1), null);
        }
        int i12 = R.styleable.TextInputLayout_errorIconDrawable;
        if (tintTypedArray.hasValue(i12)) {
            h0(tintTypedArray.getDrawable(i12));
        }
        this.f27953d.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        this.f27953d.setImportantForAccessibility(2);
        this.f27953d.setClickable(false);
        this.f27953d.setPressable(false);
        this.f27953d.setCheckable(false);
        this.f27953d.setFocusable(false);
    }

    private void E0() {
        int visibility = this.f27967r.getVisibility();
        int i10 = (this.f27966q == null || this.f27968s) ? 8 : 0;
        if (visibility != i10) {
            o().l(i10 == 0);
        }
        B0();
        this.f27967r.setVisibility(i10);
        this.f27951b.j0();
    }

    private void F(TintTypedArray tintTypedArray) {
        this.f27967r.setVisibility(8);
        this.f27967r.setId(R.id.textinput_suffix_text);
        this.f27967r.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.f27967r.setAccessibilityLiveRegion(1);
        v0(tintTypedArray.getResourceId(R.styleable.TextInputLayout_suffixTextAppearance, 0));
        int i10 = R.styleable.TextInputLayout_suffixTextColor;
        if (tintTypedArray.hasValue(i10)) {
            w0(tintTypedArray.getColorStateList(i10));
        }
        u0(tintTypedArray.getText(R.styleable.TextInputLayout_suffixText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f27971v;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.f27970u) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f27971v == null || this.f27970u == null || !isAttachedToWindow()) {
            return;
        }
        this.f27970u.addTouchExplorationStateChangeListener(this.f27971v);
    }

    private CheckableImageButton k(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        IconHelper.e(checkableImageButton);
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private void l(int i10) {
        Iterator it = this.f27960k.iterator();
        while (it.hasNext()) {
            ((TextInputLayout.OnEndIconChangedListener) it.next()).onEndIconChanged(this.f27951b, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(EndIconDelegate endIconDelegate) {
        if (this.f27969t == null) {
            return;
        }
        if (endIconDelegate.d() != null) {
            this.f27969t.setOnFocusChangeListener(endIconDelegate.d());
        }
        if (endIconDelegate.f() != null) {
            this.f27957h.setOnFocusChangeListener(endIconDelegate.f());
        }
    }

    private int v(EndIconDelegate endIconDelegate) {
        int i10 = this.f27958i.f27979c;
        return i10 == 0 ? endIconDelegate.c() : i10;
    }

    private void x0(EndIconDelegate endIconDelegate) {
        endIconDelegate.n();
        this.f27971v = endIconDelegate.getTouchExplorationStateChangeListener();
        h();
    }

    private void y0(EndIconDelegate endIconDelegate) {
        R();
        this.f27971v = null;
        endIconDelegate.p();
    }

    private void z0(boolean z10) {
        if (!z10 || p() == null) {
            IconHelper.a(this.f27951b, this.f27957h, this.f27961l, this.f27962m);
            return;
        }
        Drawable drawableMutate = DrawableCompat.wrap(p()).mutate();
        drawableMutate.setTint(this.f27951b.getErrorCurrentTextColors());
        this.f27957h.setImageDrawable(drawableMutate);
    }

    int A() {
        return getPaddingEnd() + this.f27967r.getPaddingEnd() + ((I() || J()) ? this.f27957h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f27957h.getLayoutParams()).getMarginStart() : 0);
    }

    void A0(boolean z10) {
        if (this.f27959j == 1) {
            this.f27957h.performClick();
            if (z10) {
                this.f27957h.jumpDrawablesToCurrentState();
            }
        }
    }

    TextView B() {
        return this.f27967r;
    }

    boolean C() {
        return this.f27959j != 0;
    }

    void D0() {
        if (this.f27951b.f28053f == null) {
            return;
        }
        this.f27967r.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.f27951b.f28053f.getPaddingTop(), (I() || J()) ? 0 : this.f27951b.f28053f.getPaddingEnd(), this.f27951b.f28053f.getPaddingBottom());
    }

    boolean G() {
        return this.f27957h.isCheckable();
    }

    boolean H() {
        return C() && this.f27957h.isChecked();
    }

    boolean I() {
        return this.f27952c.getVisibility() == 0 && this.f27957h.getVisibility() == 0;
    }

    boolean J() {
        return this.f27953d.getVisibility() == 0;
    }

    boolean K() {
        return this.f27959j == 1;
    }

    void L(boolean z10) {
        this.f27968s = z10;
        E0();
    }

    void M() {
        C0();
        O();
        N();
        if (o().o()) {
            z0(this.f27951b.X());
        }
    }

    void N() {
        IconHelper.d(this.f27951b, this.f27957h, this.f27961l);
    }

    void O() {
        IconHelper.d(this.f27951b, this.f27953d, this.f27954e);
    }

    void P(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        EndIconDelegate endIconDelegateO = o();
        boolean z12 = true;
        if (!endIconDelegateO.j() || (zIsChecked = this.f27957h.isChecked()) == endIconDelegateO.k()) {
            z11 = false;
        } else {
            this.f27957h.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!endIconDelegateO.h() || (zIsActivated = this.f27957h.isActivated()) == endIconDelegateO.i()) {
            z12 = z11;
        } else {
            S(!zIsActivated);
        }
        if (z10 || z12) {
            N();
        }
    }

    void Q(TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.f27960k.remove(onEndIconChangedListener);
    }

    void S(boolean z10) {
        this.f27957h.setActivated(z10);
    }

    void T(boolean z10) {
        this.f27957h.setCheckable(z10);
    }

    void U(int i10) {
        V(i10 != 0 ? getResources().getText(i10) : null);
    }

    void V(CharSequence charSequence) {
        if (n() != charSequence) {
            this.f27957h.setContentDescription(charSequence);
        }
    }

    void W(int i10) {
        X(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }

    void X(Drawable drawable) {
        this.f27957h.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.a(this.f27951b, this.f27957h, this.f27961l, this.f27962m);
            N();
        }
    }

    void Y(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f27963n) {
            this.f27963n = i10;
            IconHelper.g(this.f27957h, i10);
            IconHelper.g(this.f27953d, i10);
        }
    }

    void Z(int i10) {
        if (this.f27959j == i10) {
            return;
        }
        y0(o());
        int i11 = this.f27959j;
        this.f27959j = i10;
        l(i11);
        f0(i10 != 0);
        EndIconDelegate endIconDelegateO = o();
        W(v(endIconDelegateO));
        U(endIconDelegateO.b());
        T(endIconDelegateO.j());
        if (!endIconDelegateO.g(this.f27951b.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f27951b.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        x0(endIconDelegateO);
        a0(endIconDelegateO.e());
        EditText editText = this.f27969t;
        if (editText != null) {
            endIconDelegateO.onEditTextAttached(editText);
            m0(endIconDelegateO);
        }
        IconHelper.a(this.f27951b, this.f27957h, this.f27961l, this.f27962m);
        P(true);
    }

    void a0(View.OnClickListener onClickListener) {
        IconHelper.h(this.f27957h, onClickListener, this.f27965p);
    }

    void b0(View.OnLongClickListener onLongClickListener) {
        this.f27965p = onLongClickListener;
        IconHelper.i(this.f27957h, onLongClickListener);
    }

    void c0(ImageView.ScaleType scaleType) {
        this.f27964o = scaleType;
        IconHelper.j(this.f27957h, scaleType);
        IconHelper.j(this.f27953d, scaleType);
    }

    void d0(ColorStateList colorStateList) {
        if (this.f27961l != colorStateList) {
            this.f27961l = colorStateList;
            IconHelper.a(this.f27951b, this.f27957h, colorStateList, this.f27962m);
        }
    }

    void e0(PorterDuff.Mode mode) {
        if (this.f27962m != mode) {
            this.f27962m = mode;
            IconHelper.a(this.f27951b, this.f27957h, this.f27961l, mode);
        }
    }

    void f0(boolean z10) {
        if (I() != z10) {
            this.f27957h.setVisibility(z10 ? 0 : 8);
            B0();
            D0();
            this.f27951b.j0();
        }
    }

    void g(TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.f27960k.add(onEndIconChangedListener);
    }

    void g0(int i10) {
        h0(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
        O();
    }

    void h0(Drawable drawable) {
        this.f27953d.setImageDrawable(drawable);
        C0();
        IconHelper.a(this.f27951b, this.f27953d, this.f27954e, this.f27955f);
    }

    void i() {
        this.f27957h.performClick();
        this.f27957h.jumpDrawablesToCurrentState();
    }

    void i0(View.OnClickListener onClickListener) {
        IconHelper.h(this.f27953d, onClickListener, this.f27956g);
    }

    void j() {
        this.f27960k.clear();
    }

    void j0(View.OnLongClickListener onLongClickListener) {
        this.f27956g = onLongClickListener;
        IconHelper.i(this.f27953d, onLongClickListener);
    }

    void k0(ColorStateList colorStateList) {
        if (this.f27954e != colorStateList) {
            this.f27954e = colorStateList;
            IconHelper.a(this.f27951b, this.f27953d, colorStateList, this.f27955f);
        }
    }

    void l0(PorterDuff.Mode mode) {
        if (this.f27955f != mode) {
            this.f27955f = mode;
            IconHelper.a(this.f27951b, this.f27953d, this.f27954e, mode);
        }
    }

    CheckableImageButton m() {
        if (J()) {
            return this.f27953d;
        }
        if (C() && I()) {
            return this.f27957h;
        }
        return null;
    }

    CharSequence n() {
        return this.f27957h.getContentDescription();
    }

    void n0(int i10) {
        o0(i10 != 0 ? getResources().getText(i10) : null);
    }

    EndIconDelegate o() {
        return this.f27958i.c(this.f27959j);
    }

    void o0(CharSequence charSequence) {
        this.f27957h.setContentDescription(charSequence);
    }

    Drawable p() {
        return this.f27957h.getDrawable();
    }

    void p0(int i10) {
        q0(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }

    int q() {
        return this.f27963n;
    }

    void q0(Drawable drawable) {
        this.f27957h.setImageDrawable(drawable);
    }

    int r() {
        return this.f27959j;
    }

    void r0(boolean z10) {
        if (z10 && this.f27959j != 1) {
            Z(1);
        } else {
            if (z10) {
                return;
            }
            Z(0);
        }
    }

    ImageView.ScaleType s() {
        return this.f27964o;
    }

    void s0(ColorStateList colorStateList) {
        this.f27961l = colorStateList;
        IconHelper.a(this.f27951b, this.f27957h, colorStateList, this.f27962m);
    }

    CheckableImageButton t() {
        return this.f27957h;
    }

    void t0(PorterDuff.Mode mode) {
        this.f27962m = mode;
        IconHelper.a(this.f27951b, this.f27957h, this.f27961l, mode);
    }

    Drawable u() {
        return this.f27953d.getDrawable();
    }

    void u0(CharSequence charSequence) {
        this.f27966q = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f27967r.setText(charSequence);
        E0();
    }

    void v0(int i10) {
        TextViewCompat.setTextAppearance(this.f27967r, i10);
    }

    CharSequence w() {
        return this.f27957h.getContentDescription();
    }

    void w0(ColorStateList colorStateList) {
        this.f27967r.setTextColor(colorStateList);
    }

    Drawable x() {
        return this.f27957h.getDrawable();
    }

    CharSequence y() {
        return this.f27966q;
    }

    ColorStateList z() {
        return this.f27967r.getTextColors();
    }
}
