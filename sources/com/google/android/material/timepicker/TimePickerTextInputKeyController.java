package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes9.dex */
class TimePickerTextInputKeyController implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ChipTextInputComboView f28222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ChipTextInputComboView f28223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeModel f28224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28225e = false;

    TimePickerTextInputKeyController(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f28222b = chipTextInputComboView;
        this.f28223c = chipTextInputComboView2;
        this.f28224d = timeModel;
    }

    private void a(EditText editText) {
        if (editText.getSelectionStart() == 0 && editText.length() == 2) {
            editText.getText().clear();
        }
    }

    private void b(int i10) {
        this.f28223c.setChecked(i10 == 12);
        this.f28222b.setChecked(i10 == 10);
        this.f28224d.f28210g = i10;
    }

    private boolean c(int i10, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i10 >= 7 && i10 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            b(12);
            return true;
        }
        if (i10 >= 7 && i10 <= 16) {
            a(editText);
        }
        return false;
    }

    private boolean d(int i10, KeyEvent keyEvent, EditText editText) {
        if (i10 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            b(10);
            return true;
        }
        if (i10 < 7 || i10 > 16) {
            return false;
        }
        a(editText);
        return false;
    }

    public void bind() {
        TextInputLayout textInput = this.f28222b.getTextInput();
        TextInputLayout textInput2 = this.f28223c.getTextInput();
        EditText editText = textInput.getEditText();
        EditText editText2 = textInput2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10 = i10 == 5;
        if (z10) {
            b(12);
        }
        return z10;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (this.f28225e) {
            return false;
        }
        this.f28225e = true;
        EditText editText = (EditText) view;
        boolean zD = this.f28224d.f28210g == 12 ? d(i10, keyEvent, editText) : c(i10, keyEvent, editText);
        this.f28225e = false;
        return zD;
    }
}
