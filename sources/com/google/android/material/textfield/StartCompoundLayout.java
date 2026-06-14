package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"ViewConstructor"})
class StartCompoundLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextInputLayout f28032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f28033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f28034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CheckableImageButton f28035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f28036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f28037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView.ScaleType f28039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View.OnLongClickListener f28040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f28041k;

    StartCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.f28032b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.START));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f28035e = checkableImageButton;
        IconHelper.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f28033c = appCompatTextView;
        j(tintTypedArray);
        i(tintTypedArray);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void D() {
        int i10 = (this.f28034d == null || this.f28041k) ? 8 : 0;
        setVisibility((this.f28035e.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f28033c.setVisibility(i10);
        this.f28032b.j0();
    }

    private void i(TintTypedArray tintTypedArray) {
        this.f28033c.setVisibility(8);
        this.f28033c.setId(R.id.textinput_prefix_text);
        this.f28033c.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f28033c.setAccessibilityLiveRegion(1);
        p(tintTypedArray.getResourceId(R.styleable.TextInputLayout_prefixTextAppearance, 0));
        int i10 = R.styleable.TextInputLayout_prefixTextColor;
        if (tintTypedArray.hasValue(i10)) {
            q(tintTypedArray.getColorStateList(i10));
        }
        o(tintTypedArray.getText(R.styleable.TextInputLayout_prefixText));
    }

    private void j(TintTypedArray tintTypedArray) {
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.f28035e.getLayoutParams()).setMarginEnd(0);
        }
        v(null);
        w(null);
        int i10 = R.styleable.TextInputLayout_startIconTint;
        if (tintTypedArray.hasValue(i10)) {
            this.f28036f = MaterialResources.getColorStateList(getContext(), tintTypedArray, i10);
        }
        int i11 = R.styleable.TextInputLayout_startIconTintMode;
        if (tintTypedArray.hasValue(i11)) {
            this.f28037g = ViewUtils.parseTintMode(tintTypedArray.getInt(i11, -1), null);
        }
        int i12 = R.styleable.TextInputLayout_startIconDrawable;
        if (tintTypedArray.hasValue(i12)) {
            t(tintTypedArray.getDrawable(i12));
            int i13 = R.styleable.TextInputLayout_startIconContentDescription;
            if (tintTypedArray.hasValue(i13)) {
                s(tintTypedArray.getText(i13));
            }
            r(tintTypedArray.getBoolean(R.styleable.TextInputLayout_startIconCheckable, true));
        }
        u(tintTypedArray.getDimensionPixelSize(R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        int i14 = R.styleable.TextInputLayout_startIconScaleType;
        if (tintTypedArray.hasValue(i14)) {
            x(IconHelper.b(tintTypedArray.getInt(i14, -1)));
        }
    }

    void A(boolean z10) {
        if (l() != z10) {
            this.f28035e.setVisibility(z10 ? 0 : 8);
            C();
            D();
        }
    }

    void B(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.f28033c.getVisibility() != 0) {
            accessibilityNodeInfoCompat.setTraversalAfter(this.f28035e);
        } else {
            accessibilityNodeInfoCompat.setLabelFor(this.f28033c);
            accessibilityNodeInfoCompat.setTraversalAfter(this.f28033c);
        }
    }

    void C() {
        EditText editText = this.f28032b.f28053f;
        if (editText == null) {
            return;
        }
        this.f28033c.setPaddingRelative(l() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    CharSequence a() {
        return this.f28034d;
    }

    ColorStateList b() {
        return this.f28033c.getTextColors();
    }

    int c() {
        return getPaddingStart() + this.f28033c.getPaddingStart() + (l() ? this.f28035e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f28035e.getLayoutParams()).getMarginEnd() : 0);
    }

    TextView d() {
        return this.f28033c;
    }

    CharSequence e() {
        return this.f28035e.getContentDescription();
    }

    Drawable f() {
        return this.f28035e.getDrawable();
    }

    int g() {
        return this.f28038h;
    }

    ImageView.ScaleType h() {
        return this.f28039i;
    }

    boolean k() {
        return this.f28035e.isCheckable();
    }

    boolean l() {
        return this.f28035e.getVisibility() == 0;
    }

    void m(boolean z10) {
        this.f28041k = z10;
        D();
    }

    void n() {
        IconHelper.d(this.f28032b, this.f28035e, this.f28036f);
    }

    void o(CharSequence charSequence) {
        this.f28034d = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f28033c.setText(charSequence);
        D();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        C();
    }

    void p(int i10) {
        TextViewCompat.setTextAppearance(this.f28033c, i10);
    }

    void q(ColorStateList colorStateList) {
        this.f28033c.setTextColor(colorStateList);
    }

    void r(boolean z10) {
        this.f28035e.setCheckable(z10);
    }

    void s(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f28035e.setContentDescription(charSequence);
        }
    }

    void t(Drawable drawable) {
        this.f28035e.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.a(this.f28032b, this.f28035e, this.f28036f, this.f28037g);
            A(true);
            n();
        } else {
            A(false);
            v(null);
            w(null);
            s(null);
        }
    }

    void u(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != this.f28038h) {
            this.f28038h = i10;
            IconHelper.g(this.f28035e, i10);
        }
    }

    void v(View.OnClickListener onClickListener) {
        IconHelper.h(this.f28035e, onClickListener, this.f28040j);
    }

    void w(View.OnLongClickListener onLongClickListener) {
        this.f28040j = onLongClickListener;
        IconHelper.i(this.f28035e, onLongClickListener);
    }

    void x(ImageView.ScaleType scaleType) {
        this.f28039i = scaleType;
        IconHelper.j(this.f28035e, scaleType);
    }

    void y(ColorStateList colorStateList) {
        if (this.f28036f != colorStateList) {
            this.f28036f = colorStateList;
            IconHelper.a(this.f28032b, this.f28035e, colorStateList, this.f28037g);
        }
    }

    void z(PorterDuff.Mode mode) {
        if (this.f28037g != mode) {
            this.f28037g = mode;
            IconHelper.a(this.f28032b, this.f28035e, this.f28036f, mode);
        }
    }
}
