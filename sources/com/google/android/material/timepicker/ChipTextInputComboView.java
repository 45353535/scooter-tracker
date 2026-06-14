package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Chip f28121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextInputLayout f28122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EditText f28123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextWatcher f28124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f28125f;

    private class TextFormatter extends TextWatcherAdapter {
        private TextFormatter() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f28121b.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String strC = ChipTextInputComboView.this.c(editable);
            Chip chip = ChipTextInputComboView.this.f28121b;
            if (TextUtils.isEmpty(strC)) {
                strC = ChipTextInputComboView.this.c("00");
            }
            chip.setText(strC);
        }
    }

    public ChipTextInputComboView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return TimeModel.formatText(getResources(), charSequence);
    }

    private void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f28123d.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public void addInputFilter(InputFilter inputFilter) {
        InputFilter[] filters = this.f28123d.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f28123d.setFilters(inputFilterArr);
    }

    public TextInputLayout getTextInput() {
        return this.f28122c;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f28121b.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f28121b.setChecked(z10);
        this.f28123d.setVisibility(z10 ? 0 : 4);
        this.f28121b.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            ViewUtils.requestFocusAndShowKeyboard(this.f28123d, false);
        }
    }

    public void setChipDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.f28121b, accessibilityDelegateCompat);
    }

    public void setCursorVisible(boolean z10) {
        this.f28123d.setCursorVisible(z10);
    }

    public void setHelperText(CharSequence charSequence) {
        this.f28125f.setText(charSequence);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f28121b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f28121b.setTag(i10, obj);
    }

    public void setText(CharSequence charSequence) {
        String strC = c(charSequence);
        this.f28121b.setText(strC);
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        this.f28123d.removeTextChangedListener(this.f28124e);
        this.f28123d.setText(strC);
        this.f28123d.addTextChangedListener(this.f28124e);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f28121b.toggle();
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f28121b = chip;
        chip.setAccessibilityClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f28122c = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f28123d = editText;
        editText.setVisibility(4);
        TextFormatter textFormatter = new TextFormatter();
        this.f28124e = textFormatter;
        editText.addTextChangedListener(textFormatter);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f28125f = (TextView) findViewById(R.id.material_label);
        editText.setId(View.generateViewId());
        this.f28125f.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
