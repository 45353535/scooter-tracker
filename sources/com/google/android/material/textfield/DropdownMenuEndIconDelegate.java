package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: loaded from: classes9.dex */
class DropdownMenuEndIconDelegate extends EndIconDelegate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f27936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f27937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f27938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AutoCompleteTextView f27939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f27940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f27941j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f27942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f27943l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f27944m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f27945n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f27946o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AccessibilityManager f27947p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator f27948q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator f27949r;

    DropdownMenuEndIconDelegate(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f27940i = new View.OnClickListener() { // from class: com.google.android.material.textfield.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28112b.E();
            }
        };
        this.f27941j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                DropdownMenuEndIconDelegate.t(this.f28113a, view, z10);
            }
        };
        this.f27942k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.k
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                DropdownMenuEndIconDelegate.r(this.f28114a, z10);
            }
        };
        this.f27946o = Long.MAX_VALUE;
        Context context = endCompoundLayout.getContext();
        int i10 = R.attr.motionDurationShort3;
        this.f27937f = MotionUtils.resolveThemeDuration(context, i10, 67);
        this.f27936e = MotionUtils.resolveThemeDuration(endCompoundLayout.getContext(), i10, 50);
        this.f27938g = MotionUtils.resolveThemeInterpolator(endCompoundLayout.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
    }

    private void A() {
        this.f27949r = z(this.f27937f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorZ = z(this.f27936e, 1.0f, 0.0f);
        this.f27948q = valueAnimatorZ;
        valueAnimatorZ.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DropdownMenuEndIconDelegate.this.m();
                DropdownMenuEndIconDelegate.this.f27949r.start();
            }
        });
    }

    private boolean B() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f27946o;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    private void C(boolean z10) {
        if (this.f27945n != z10) {
            this.f27945n = z10;
            this.f27949r.cancel();
            this.f27948q.start();
        }
    }

    private void D() {
        this.f27939h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.g
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DropdownMenuEndIconDelegate.u(this.f28110b, view, motionEvent);
            }
        });
        this.f27939h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.h
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                DropdownMenuEndIconDelegate.v(this.f28111a);
            }
        });
        this.f27939h.setThreshold(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        if (this.f27939h == null) {
            return;
        }
        if (B()) {
            this.f27944m = false;
        }
        if (this.f27944m) {
            this.f27944m = false;
            return;
        }
        C(!this.f27945n);
        if (!this.f27945n) {
            this.f27939h.dismissDropDown();
        } else {
            this.f27939h.requestFocus();
            this.f27939h.showDropDown();
        }
    }

    private void F() {
        this.f27944m = true;
        this.f27946o = SystemClock.uptimeMillis();
    }

    public static /* synthetic */ void q(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        boolean zIsPopupShowing = dropdownMenuEndIconDelegate.f27939h.isPopupShowing();
        dropdownMenuEndIconDelegate.C(zIsPopupShowing);
        dropdownMenuEndIconDelegate.f27944m = zIsPopupShowing;
    }

    public static /* synthetic */ void r(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, boolean z10) {
        AutoCompleteTextView autoCompleteTextView = dropdownMenuEndIconDelegate.f27939h;
        if (autoCompleteTextView == null || EditTextUtils.a(autoCompleteTextView)) {
            return;
        }
        dropdownMenuEndIconDelegate.f27984d.setImportantForAccessibility(z10 ? 2 : 1);
    }

    public static /* synthetic */ void s(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, ValueAnimator valueAnimator) {
        dropdownMenuEndIconDelegate.getClass();
        dropdownMenuEndIconDelegate.f27984d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void t(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, View view, boolean z10) {
        dropdownMenuEndIconDelegate.f27943l = z10;
        dropdownMenuEndIconDelegate.m();
        if (z10) {
            return;
        }
        dropdownMenuEndIconDelegate.C(false);
        dropdownMenuEndIconDelegate.f27944m = false;
    }

    public static /* synthetic */ boolean u(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, View view, MotionEvent motionEvent) {
        dropdownMenuEndIconDelegate.getClass();
        if (motionEvent.getAction() == 1) {
            if (dropdownMenuEndIconDelegate.B()) {
                dropdownMenuEndIconDelegate.f27944m = false;
            }
            dropdownMenuEndIconDelegate.E();
            dropdownMenuEndIconDelegate.F();
        }
        return false;
    }

    public static /* synthetic */ void v(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        dropdownMenuEndIconDelegate.F();
        dropdownMenuEndIconDelegate.C(false);
    }

    private static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator z(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f27938g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DropdownMenuEndIconDelegate.s(this.f28109b, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void afterEditTextChanged(Editable editable) {
        if (this.f27947p.isTouchExplorationEnabled() && EditTextUtils.a(this.f27939h) && !this.f27984d.hasFocus()) {
            this.f27939h.dismissDropDown();
        }
        this.f27939h.post(new Runnable() { // from class: com.google.android.material.textfield.l
            @Override // java.lang.Runnable
            public final void run() {
                DropdownMenuEndIconDelegate.q(this.f28115b);
            }
        });
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int b() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int c() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    View.OnFocusChangeListener d() {
        return this.f27941j;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    View.OnClickListener e() {
        return this.f27940i;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean g(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public AccessibilityManager.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
        return this.f27942k;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean h() {
        return true;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean i() {
        return this.f27943l;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean k() {
        return this.f27945n;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void n() {
        A();
        this.f27947p = (AccessibilityManager) this.f27983c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean o() {
        return true;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(@Nullable EditText editText) {
        this.f27939h = y(editText);
        D();
        this.f27981a.setErrorIconDrawable((Drawable) null);
        if (!EditTextUtils.a(editText) && this.f27947p.isTouchExplorationEnabled()) {
            this.f27984d.setImportantForAccessibility(2);
        }
        this.f27981a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!EditTextUtils.a(this.f27939h)) {
            accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.isShowingHintText()) {
            accessibilityNodeInfoCompat.setHintText(null);
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @SuppressLint({"WrongConstant"})
    public void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
        if (!this.f27947p.isEnabled() || EditTextUtils.a(this.f27939h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f27945n && !this.f27939h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            E();
            F();
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void p() {
        AutoCompleteTextView autoCompleteTextView = this.f27939h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f27939h.setOnDismissListener(null);
        }
    }
}
