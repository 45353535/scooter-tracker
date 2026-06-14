package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.timepicker.TimePickerView;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class MaterialTimePicker extends DialogFragment implements TimePickerView.OnDoubleTapListener {
    public static final int INPUT_MODE_CLOCK = 0;
    public static final int INPUT_MODE_KEYBOARD = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TimePickerView f28171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ViewStub f28172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TimePickerClockPresenter f28173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TimePickerTextInputPresenter f28174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TimePickerPresenter f28175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f28176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f28177l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f28179n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f28181p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f28183r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MaterialButton f28184s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Button f28185t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TimeModel f28187v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f28167b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f28168c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f28169d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f28170e = new LinkedHashSet();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f28178m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f28180o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f28182q = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f28186u = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f28188w = 0;

    public static final class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f28193b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f28195d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CharSequence f28197f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f28199h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TimeModel f28192a = new TimeModel();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f28194c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f28196e = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f28198g = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f28200i = 0;

        @NonNull
        public MaterialTimePicker build() {
            return MaterialTimePicker.m(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setHour(@IntRange(from = 0, to = 23) int i10) {
            this.f28192a.setHourOfDay(i10);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setInputMode(int i10) {
            this.f28193b = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setMinute(@IntRange(from = 0, to = 59) int i10) {
            this.f28192a.setMinute(i10);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(@StringRes int i10) {
            this.f28198g = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(@StringRes int i10) {
            this.f28196e = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTheme(@StyleRes int i10) {
            this.f28200i = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTimeFormat(int i10) {
            TimeModel timeModel = this.f28192a;
            int i11 = timeModel.f28208e;
            int i12 = timeModel.f28209f;
            TimeModel timeModel2 = new TimeModel(i10);
            this.f28192a = timeModel2;
            timeModel2.setMinute(i12);
            this.f28192a.setHourOfDay(i11);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTitleText(@StringRes int i10) {
            this.f28194c = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(@Nullable CharSequence charSequence) {
            this.f28199h = charSequence;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(@Nullable CharSequence charSequence) {
            this.f28197f = charSequence;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTitleText(@Nullable CharSequence charSequence) {
            this.f28195d = charSequence;
            return this;
        }
    }

    public static /* synthetic */ void b(MaterialTimePicker materialTimePicker) {
        TimePickerPresenter timePickerPresenter = materialTimePicker.f28175j;
        if (timePickerPresenter instanceof TimePickerTextInputPresenter) {
            ((TimePickerTextInputPresenter) timePickerPresenter).resetChecked();
        }
    }

    private Pair j(int i10) {
        if (i10 == 0) {
            return new Pair(Integer.valueOf(this.f28176k), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
        }
        if (i10 == 1) {
            return new Pair(Integer.valueOf(this.f28177l), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
        }
        throw new IllegalArgumentException("no icon for mode: " + i10);
    }

    private int k() {
        int i10 = this.f28188w;
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValueResolve = MaterialAttributes.resolve(requireContext(), R.attr.materialTimePickerTheme);
        if (typedValueResolve == null) {
            return 0;
        }
        return typedValueResolve.data;
    }

    private TimePickerPresenter l(int i10, TimePickerView timePickerView, ViewStub viewStub) {
        if (i10 != 0) {
            if (this.f28174i == null) {
                this.f28174i = new TimePickerTextInputPresenter((LinearLayout) viewStub.inflate(), this.f28187v);
            }
            this.f28174i.clearCheck();
            return this.f28174i;
        }
        TimePickerClockPresenter timePickerClockPresenter = this.f28173h;
        if (timePickerClockPresenter == null) {
            timePickerClockPresenter = new TimePickerClockPresenter(timePickerView, this.f28187v);
        }
        this.f28173h = timePickerClockPresenter;
        return timePickerClockPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaterialTimePicker m(Builder builder) {
        MaterialTimePicker materialTimePicker = new MaterialTimePicker();
        Bundle bundle = new Bundle();
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", builder.f28192a);
        if (builder.f28193b != null) {
            bundle.putInt("TIME_PICKER_INPUT_MODE", builder.f28193b.intValue());
        }
        bundle.putInt("TIME_PICKER_TITLE_RES", builder.f28194c);
        if (builder.f28195d != null) {
            bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", builder.f28195d);
        }
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", builder.f28196e);
        if (builder.f28197f != null) {
            bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", builder.f28197f);
        }
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", builder.f28198g);
        if (builder.f28199h != null) {
            bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", builder.f28199h);
        }
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", builder.f28200i);
        materialTimePicker.setArguments(bundle);
        return materialTimePicker;
    }

    private void n(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.f28187v = timeModel;
        if (timeModel == null) {
            this.f28187v = new TimeModel();
        }
        this.f28186u = bundle.getInt("TIME_PICKER_INPUT_MODE", this.f28187v.f28207d != 1 ? 0 : 1);
        this.f28178m = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.f28179n = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.f28180o = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.f28181p = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.f28182q = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.f28183r = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.f28188w = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    private void o() {
        Button button = this.f28185t;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(MaterialButton materialButton) {
        if (materialButton == null || this.f28171f == null || this.f28172g == null) {
            return;
        }
        TimePickerPresenter timePickerPresenter = this.f28175j;
        if (timePickerPresenter != null) {
            timePickerPresenter.hide();
        }
        TimePickerPresenter timePickerPresenterL = l(this.f28186u, this.f28171f, this.f28172g);
        this.f28175j = timePickerPresenterL;
        timePickerPresenterL.show();
        this.f28175j.invalidate();
        Pair pairJ = j(this.f28186u);
        materialButton.setIconResource(((Integer) pairJ.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pairJ.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    public boolean addOnCancelListener(@NonNull DialogInterface.OnCancelListener onCancelListener) {
        return this.f28169d.add(onCancelListener);
    }

    public boolean addOnDismissListener(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.f28170e.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.f28168c.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.f28167b.add(onClickListener);
    }

    public void clearOnCancelListeners() {
        this.f28169d.clear();
    }

    public void clearOnDismissListeners() {
        this.f28170e.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.f28168c.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.f28167b.clear();
    }

    @IntRange(from = 0, to = 23)
    public int getHour() {
        return this.f28187v.f28208e % 24;
    }

    public int getInputMode() {
        return this.f28186u;
    }

    @IntRange(from = 0, to = 59)
    public int getMinute() {
        return this.f28187v.f28209f;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator it = this.f28169d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        n(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), k());
        Context context = dialog.getContext();
        int i10 = R.attr.materialTimePickerStyle;
        int i11 = R.style.Widget_MaterialComponents_TimePicker;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.MaterialTimePicker, i10, i11);
        this.f28177l = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_clockIcon, 0);
        this.f28176k = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_keyboardIcon, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.MaterialTimePicker_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(materialShapeDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        materialShapeDrawable.setElevation(window.getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.f28171f = timePickerView;
        timePickerView.f(this);
        this.f28172g = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.f28184s = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        int i10 = this.f28178m;
        if (i10 != 0) {
            textView.setText(i10);
        } else if (!TextUtils.isEmpty(this.f28179n)) {
            textView.setText(this.f28179n);
        }
        p(this.f28184s);
        Button button = (Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Iterator it = MaterialTimePicker.this.f28167b.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                MaterialTimePicker.this.dismiss();
            }
        });
        int i11 = this.f28180o;
        if (i11 != 0) {
            button.setText(i11);
        } else if (!TextUtils.isEmpty(this.f28181p)) {
            button.setText(this.f28181p);
        }
        Button button2 = (Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button);
        this.f28185t = button2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Iterator it = MaterialTimePicker.this.f28168c.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                MaterialTimePicker.this.dismiss();
            }
        });
        int i12 = this.f28182q;
        if (i12 != 0) {
            this.f28185t.setText(i12);
        } else if (!TextUtils.isEmpty(this.f28183r)) {
            this.f28185t.setText(this.f28183r);
        }
        o();
        this.f28184s.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
                materialTimePicker.f28186u = materialTimePicker.f28186u == 0 ? 1 : 0;
                MaterialTimePicker materialTimePicker2 = MaterialTimePicker.this;
                materialTimePicker2.p(materialTimePicker2.f28184s);
            }
        });
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28175j = null;
        this.f28173h = null;
        this.f28174i = null;
        TimePickerView timePickerView = this.f28171f;
        if (timePickerView != null) {
            timePickerView.f(null);
            this.f28171f = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator it = this.f28170e.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onDoubleTap() {
        this.f28186u = 1;
        p(this.f28184s);
        this.f28174i.resetChecked();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.f28187v);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.f28186u);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.f28178m);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.f28179n);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.f28180o);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.f28181p);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f28182q);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.f28183r);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.f28188w);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f28175j instanceof TimePickerTextInputPresenter) {
            view.postDelayed(new Runnable() { // from class: com.google.android.material.timepicker.c
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialTimePicker.b(this.f28262b);
                }
            }, 100L);
        }
    }

    public boolean removeOnCancelListener(@NonNull DialogInterface.OnCancelListener onCancelListener) {
        return this.f28169d.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.f28170e.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.f28168c.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.f28167b.remove(onClickListener);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        o();
    }

    public void setHour(@IntRange(from = 0, to = 23) int i10) {
        this.f28187v.setHour(i10);
        TimePickerPresenter timePickerPresenter = this.f28175j;
        if (timePickerPresenter != null) {
            timePickerPresenter.invalidate();
        }
    }

    public void setMinute(@IntRange(from = 0, to = 59) int i10) {
        this.f28187v.setMinute(i10);
        TimePickerPresenter timePickerPresenter = this.f28175j;
        if (timePickerPresenter != null) {
            timePickerPresenter.invalidate();
        }
    }
}
