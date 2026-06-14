package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
class TimePickerTextInputPresenter implements TimePickerView.OnSelectionChange, TimePickerPresenter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinearLayout f28226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeModel f28227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextWatcher f28228d = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.1
        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    TimePickerTextInputPresenter.this.f28227c.setMinute(0);
                } else {
                    TimePickerTextInputPresenter.this.f28227c.setMinute(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TextWatcher f28229e = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.2
        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    TimePickerTextInputPresenter.this.f28227c.setHour(0);
                } else {
                    TimePickerTextInputPresenter.this.f28227c.setHour(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ChipTextInputComboView f28230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ChipTextInputComboView f28231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TimePickerTextInputKeyController f28232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final EditText f28233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final EditText f28234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaterialButtonToggleGroup f28235k;

    public TimePickerTextInputPresenter(LinearLayout linearLayout, final TimeModel timeModel) {
        this.f28226b = linearLayout;
        this.f28227c = timeModel;
        final Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.f28230f = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.f28231g = chipTextInputComboView2;
        int i10 = R.id.material_label;
        TextView textView = (TextView) chipTextInputComboView.findViewById(i10);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(i10);
        int i11 = R.string.material_timepicker_minute;
        textView.setText(resources.getString(i11));
        textView.setImportantForAccessibility(2);
        int i12 = R.string.material_timepicker_hour;
        textView2.setText(resources.getString(i12));
        textView2.setImportantForAccessibility(2);
        int i13 = R.id.selection_type;
        chipTextInputComboView.setTag(i13, 12);
        chipTextInputComboView2.setTag(i13, 10);
        if (timeModel.f28207d == 0) {
            g();
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TimePickerTextInputPresenter.this.onSelectionChanged(((Integer) view.getTag(R.id.selection_type)).intValue());
            }
        };
        chipTextInputComboView2.setOnClickListener(onClickListener);
        chipTextInputComboView.setOnClickListener(onClickListener);
        chipTextInputComboView2.addInputFilter(timeModel.getHourInputValidator());
        chipTextInputComboView.addInputFilter(timeModel.getMinuteInputValidator());
        EditText editText = chipTextInputComboView2.getTextInput().getEditText();
        this.f28233i = editText;
        editText.setAccessibilityDelegate(f(linearLayout.getResources(), i12));
        EditText editText2 = chipTextInputComboView.getTextInput().getEditText();
        this.f28234j = editText2;
        editText2.setAccessibilityDelegate(f(linearLayout.getResources(), i11));
        this.f28232h = new TimePickerTextInputKeyController(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.setChipDelegate(new ClickActionDelegate(linearLayout.getContext(), R.string.material_hour_selection) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.4
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(resources.getString(R.string.material_timepicker_hour) + " " + view.getResources().getString(timeModel.getHourContentDescriptionResId(), String.valueOf(timeModel.getHourForDisplay())));
            }
        });
        chipTextInputComboView.setChipDelegate(new ClickActionDelegate(linearLayout.getContext(), R.string.material_minute_selection) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.5
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(resources.getString(R.string.material_timepicker_minute) + " " + view.getResources().getString(R.string.material_minute_suffix, String.valueOf(timeModel.f28209f)));
            }
        });
        initialize();
    }

    public static /* synthetic */ void a(TimePickerTextInputPresenter timePickerTextInputPresenter, MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
        timePickerTextInputPresenter.getClass();
        if (z10) {
            timePickerTextInputPresenter.f28227c.setPeriod(i10 == R.id.material_clock_period_pm_button ? 1 : 0);
        }
    }

    private void c() {
        this.f28233i.addTextChangedListener(this.f28229e);
        this.f28234j.addTextChangedListener(this.f28228d);
    }

    private void d() {
        this.f28233i.removeTextChangedListener(this.f28229e);
        this.f28234j.removeTextChangedListener(this.f28228d);
    }

    private void e(TimeModel timeModel) {
        d();
        Locale locale = this.f28226b.getResources().getConfiguration().locale;
        String str = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(timeModel.f28209f));
        String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(timeModel.getHourForDisplay()));
        this.f28230f.setText(str);
        this.f28231g.setText(str2);
        c();
        h();
    }

    private View.AccessibilityDelegate f(final Resources resources, final int i10) {
        return new View.AccessibilityDelegate() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.6
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setText(resources.getString(i10));
            }
        };
    }

    private void g() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f28226b.findViewById(R.id.material_clock_period_toggle);
        this.f28235k = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() { // from class: com.google.android.material.timepicker.e
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
            public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup2, int i10, boolean z10) {
                TimePickerTextInputPresenter.a(this.f28264a, materialButtonToggleGroup2, i10, z10);
            }
        });
        this.f28235k.setVisibility(0);
        h();
    }

    private void h() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f28235k;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.check(this.f28227c.f28211h == 0 ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button);
    }

    public void clearCheck() {
        this.f28230f.setChecked(false);
        this.f28231g.setChecked(false);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
        View focusedChild = this.f28226b.getFocusedChild();
        if (focusedChild != null) {
            ViewUtils.hideKeyboard(focusedChild, false);
        }
        this.f28226b.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
        c();
        e(this.f28227c);
        this.f28232h.bind();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        e(this.f28227c);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i10) {
        this.f28227c.f28210g = i10;
        this.f28230f.setChecked(i10 == 12);
        this.f28231g.setChecked(i10 == 10);
        h();
    }

    public void resetChecked() {
        this.f28230f.setChecked(this.f28227c.f28210g == 12);
        this.f28231g.setChecked(this.f28227c.f28210g == 10);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
        this.f28226b.setVisibility(0);
        onSelectionChanged(this.f28227c.f28210g);
    }
}
