package com.google.android.material.datepicker;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class e {
    public static boolean a(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    public static /* synthetic */ void b(EditText[] editTextArr, View view, boolean z10) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        ViewUtils.hideKeyboard(view, false);
    }

    public static void d(final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.google.android.material.datepicker.c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                e.b(editTextArr, view, z10);
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        final EditText editText2 = editTextArr[0];
        editText2.postDelayed(new Runnable() { // from class: com.google.android.material.datepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                ViewUtils.requestFocusAndShowKeyboard(editText2, false);
            }
        }, 100L);
    }
}
