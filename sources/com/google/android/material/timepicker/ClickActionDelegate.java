package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes9.dex */
class ClickActionDelegate extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfoCompat.AccessibilityActionCompat f28127a;

    public ClickActionDelegate(Context context, int i10) {
        this.f28127a = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, context.getString(i10));
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(this.f28127a);
    }
}
