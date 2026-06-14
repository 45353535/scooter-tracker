package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes9.dex */
abstract class EndIconDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f27981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final EndCompoundLayout f27982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f27983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final CheckableImageButton f27984d;

    EndIconDelegate(EndCompoundLayout endCompoundLayout) {
        this.f27981a = endCompoundLayout.f27951b;
        this.f27982b = endCompoundLayout;
        this.f27983c = endCompoundLayout.getContext();
        this.f27984d = endCompoundLayout.t();
    }

    void a(CharSequence charSequence, int i10, int i11, int i12) {
    }

    void afterEditTextChanged(Editable editable) {
    }

    int b() {
        return 0;
    }

    int c() {
        return 0;
    }

    View.OnFocusChangeListener d() {
        return null;
    }

    View.OnClickListener e() {
        return null;
    }

    View.OnFocusChangeListener f() {
        return null;
    }

    boolean g(int i10) {
        return true;
    }

    AccessibilityManager.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
        return null;
    }

    boolean h() {
        return false;
    }

    boolean i() {
        return false;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    void l(boolean z10) {
    }

    final void m() {
        this.f27982b.P(false);
    }

    void n() {
    }

    boolean o() {
        return false;
    }

    void onEditTextAttached(EditText editText) {
    }

    void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
    }

    void p() {
    }
}
