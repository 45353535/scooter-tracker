package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
class TimePickerView extends ConstraintLayout implements TimePickerControls {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Chip f28248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Chip f28249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ClockHandView f28250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ClockFaceView f28251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final MaterialButtonToggleGroup f28252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View.OnClickListener f28253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private OnPeriodChangeListener f28254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private OnSelectionChange f28255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private OnDoubleTapListener f28256j;

    interface OnDoubleTapListener {
        void onDoubleTap();
    }

    interface OnPeriodChangeListener {
        void onPeriodChange(int i10);
    }

    interface OnSelectionChange {
        void onSelectionChanged(int i10);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(TimePickerView timePickerView, MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
        if (!z10) {
            timePickerView.getClass();
            return;
        }
        OnPeriodChangeListener onPeriodChangeListener = timePickerView.f28254h;
        if (onPeriodChangeListener != null) {
            onPeriodChangeListener.onPeriodChange(i10 == R.id.material_clock_period_pm_button ? 1 : 0);
        }
    }

    private void i() {
        Chip chip = this.f28248b;
        int i10 = R.id.selection_type;
        chip.setTag(i10, 12);
        this.f28249c.setTag(i10, 10);
        this.f28248b.setOnClickListener(this.f28253g);
        this.f28249c.setOnClickListener(this.f28253g);
        this.f28248b.setAccessibilityClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        this.f28249c.setAccessibilityClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
    }

    private void j() {
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.timepicker.TimePickerView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                OnDoubleTapListener onDoubleTapListener = TimePickerView.this.f28256j;
                if (onDoubleTapListener == null) {
                    return false;
                }
                onDoubleTapListener.onDoubleTap();
                return true;
            }
        });
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.google.android.material.timepicker.TimePickerView.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (((Checkable) view).isChecked()) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.f28248b.setOnTouchListener(onTouchListener);
        this.f28249c.setOnTouchListener(onTouchListener);
    }

    private void k(Chip chip, boolean z10) {
        chip.setChecked(z10);
        chip.setAccessibilityLiveRegion(z10 ? 2 : 0);
    }

    public void addOnRotateListener(ClockHandView.OnRotateListener onRotateListener) {
        this.f28250d.addOnRotateListener(onRotateListener);
    }

    int d() {
        return this.f28251e.l();
    }

    void e(int i10) {
        this.f28251e.p(i10);
    }

    void f(OnDoubleTapListener onDoubleTapListener) {
        this.f28256j = onDoubleTapListener;
    }

    void g(OnPeriodChangeListener onPeriodChangeListener) {
        this.f28254h = onPeriodChangeListener;
    }

    void h(OnSelectionChange onSelectionChange) {
        this.f28255i = onSelectionChange;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f28249c.sendAccessibilityEvent(8);
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setActiveSelection(int i10) {
        k(this.f28248b, i10 == 12);
        k(this.f28249c, i10 == 10);
    }

    public void setAnimateOnTouchUp(boolean z10) {
        this.f28250d.setAnimateOnTouchUp(z10);
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setHandRotation(float f10) {
        this.f28250d.setHandRotation(f10);
    }

    public void setHourClickDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.f28248b, accessibilityDelegateCompat);
    }

    public void setMinuteHourDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.f28249c, accessibilityDelegateCompat);
    }

    public void setOnActionUpListener(ClockHandView.OnActionUpListener onActionUpListener) {
        this.f28250d.setOnActionUpListener(onActionUpListener);
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setValues(String[] strArr, @StringRes int i10) {
        this.f28251e.setValues(strArr, i10);
    }

    public void showToggle() {
        this.f28252f.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    @SuppressLint({"DefaultLocale"})
    public void updateTime(int i10, int i11, int i12) {
        this.f28252f.check(i10 == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button);
        Locale locale = getResources().getConfiguration().locale;
        String str = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i12));
        String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i11));
        if (!TextUtils.equals(this.f28248b.getText(), str)) {
            this.f28248b.setText(str);
        }
        if (TextUtils.equals(this.f28249c.getText(), str2)) {
            return;
        }
        this.f28249c.setText(str2);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setHandRotation(float f10, boolean z10) {
        this.f28250d.setHandRotation(f10, z10);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f28253g = new View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TimePickerView.this.f28255i != null) {
                    TimePickerView.this.f28255i.onSelectionChanged(((Integer) view.getTag(R.id.selection_type)).intValue());
                }
            }
        };
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.f28251e = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f28252f = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() { // from class: com.google.android.material.timepicker.f
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
            public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                TimePickerView.a(this.f28265a, materialButtonToggleGroup2, i11, z10);
            }
        });
        this.f28248b = (Chip) findViewById(R.id.material_minute_tv);
        this.f28249c = (Chip) findViewById(R.id.material_hour_tv);
        this.f28250d = (ClockHandView) findViewById(R.id.material_clock_hand);
        j();
        i();
    }
}
