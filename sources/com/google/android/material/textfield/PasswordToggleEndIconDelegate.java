package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes9.dex */
class PasswordToggleEndIconDelegate extends EndIconDelegate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EditText f28030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View.OnClickListener f28031g;

    PasswordToggleEndIconDelegate(EndCompoundLayout endCompoundLayout, int i10) {
        super(endCompoundLayout);
        this.f28029e = R.drawable.design_password_eye;
        this.f28031g = new View.OnClickListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordToggleEndIconDelegate.q(this.f28116b, view);
            }
        };
        if (i10 != 0) {
            this.f28029e = i10;
        }
    }

    public static /* synthetic */ void q(PasswordToggleEndIconDelegate passwordToggleEndIconDelegate, View view) {
        EditText editText = passwordToggleEndIconDelegate.f28030f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (passwordToggleEndIconDelegate.r()) {
            passwordToggleEndIconDelegate.f28030f.setTransformationMethod(null);
        } else {
            passwordToggleEndIconDelegate.f28030f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            passwordToggleEndIconDelegate.f28030f.setSelection(selectionEnd);
        }
        passwordToggleEndIconDelegate.m();
    }

    private boolean r() {
        EditText editText = this.f28030f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean s(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void a(CharSequence charSequence, int i10, int i11, int i12) {
        m();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int b() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int c() {
        return this.f28029e;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    View.OnClickListener e() {
        return this.f28031g;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean k() {
        return !r();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void n() {
        if (s(this.f28030f)) {
            this.f28030f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void onEditTextAttached(EditText editText) {
        this.f28030f = editText;
        m();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void p() {
        EditText editText = this.f28030f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
