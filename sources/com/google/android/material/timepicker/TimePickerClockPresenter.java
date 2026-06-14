package com.google.android.material.timepicker;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import net.pubnative.lite.sdk.models.Protocol;

/* JADX INFO: loaded from: classes9.dex */
class TimePickerClockPresenter implements ClockHandView.OnRotateListener, TimePickerView.OnSelectionChange, TimePickerView.OnPeriodChangeListener, ClockHandView.OnActionUpListener, TimePickerPresenter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f28212g = {Protocol.VAST_4_1_WRAPPER, "1", "2", "3", Protocol.VAST_1_0_WRAPPER, "5", "6", "7", "8", "9", "10", Protocol.VAST_4_1};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f28213h = {"00", "1", "2", "3", Protocol.VAST_1_0_WRAPPER, "5", "6", "7", "8", "9", "10", Protocol.VAST_4_1, Protocol.VAST_4_1_WRAPPER, Protocol.VAST_4_2, Protocol.VAST_4_2_WRAPPER, "15", "16", "17", "18", "19", "20", "21", "22", "23"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f28214i = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimePickerView f28215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeModel f28216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f28217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f28218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f28219f = false;

    public TimePickerClockPresenter(TimePickerView timePickerView, TimeModel timeModel) {
        this.f28215b = timePickerView;
        this.f28216c = timeModel;
        initialize();
    }

    private String[] b() {
        return this.f28216c.f28207d == 1 ? f28213h : f28212g;
    }

    private int c() {
        return (this.f28216c.getHourForDisplay() * 30) % 360;
    }

    private void d(int i10, int i11) {
        TimeModel timeModel = this.f28216c;
        if (timeModel.f28209f == i11 && timeModel.f28208e == i10) {
            return;
        }
        this.f28215b.performHapticFeedback(4);
    }

    private void f() {
        TimeModel timeModel = this.f28216c;
        int i10 = 1;
        if (timeModel.f28210g == 10 && timeModel.f28207d == 1 && timeModel.f28208e >= 12) {
            i10 = 2;
        }
        this.f28215b.e(i10);
    }

    private void g() {
        TimePickerView timePickerView = this.f28215b;
        TimeModel timeModel = this.f28216c;
        timePickerView.updateTime(timeModel.f28211h, timeModel.getHourForDisplay(), this.f28216c.f28209f);
    }

    private void h() {
        i(f28212g, TimeModel.NUMBER_FORMAT);
        i(f28213h, TimeModel.NUMBER_FORMAT);
        i(f28214i, TimeModel.ZERO_LEADING_NUMBER_FORMAT);
    }

    private void i(String[] strArr, String str) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr[i10] = TimeModel.formatText(this.f28215b.getResources(), strArr[i10], str);
        }
    }

    void e(int i10, boolean z10) {
        boolean z11 = i10 == 12;
        this.f28215b.setAnimateOnTouchUp(z11);
        this.f28216c.f28210g = i10;
        this.f28215b.setValues(z11 ? f28214i : b(), z11 ? R.string.material_minute_suffix : this.f28216c.getHourContentDescriptionResId());
        f();
        this.f28215b.setHandRotation(z11 ? this.f28217d : this.f28218e, z10);
        this.f28215b.setActiveSelection(i10);
        this.f28215b.setMinuteHourDelegate(new ClickActionDelegate(this.f28215b.getContext(), R.string.material_hour_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.1
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(TimePickerClockPresenter.this.f28216c.getHourContentDescriptionResId(), String.valueOf(TimePickerClockPresenter.this.f28216c.getHourForDisplay())));
            }
        });
        this.f28215b.setHourClickDelegate(new ClickActionDelegate(this.f28215b.getContext(), R.string.material_minute_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.2
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(TimePickerClockPresenter.this.f28216c.f28209f)));
            }
        });
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
        this.f28215b.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
        if (this.f28216c.f28207d == 0) {
            this.f28215b.showToggle();
        }
        this.f28215b.addOnRotateListener(this);
        this.f28215b.h(this);
        this.f28215b.g(this);
        this.f28215b.setOnActionUpListener(this);
        h();
        invalidate();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        this.f28218e = c();
        TimeModel timeModel = this.f28216c;
        this.f28217d = timeModel.f28209f * 6;
        e(timeModel.f28210g, false);
        g();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnActionUpListener
    public void onActionUp(float f10, boolean z10) {
        this.f28219f = true;
        TimeModel timeModel = this.f28216c;
        int i10 = timeModel.f28209f;
        int i11 = timeModel.f28208e;
        if (timeModel.f28210g == 10) {
            this.f28215b.setHandRotation(this.f28218e, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(this.f28215b.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                e(12, true);
            }
        } else {
            int iRound = Math.round(f10);
            if (!z10) {
                this.f28216c.setMinute(((iRound + 15) / 30) * 5);
                this.f28217d = this.f28216c.f28209f * 6;
            }
            this.f28215b.setHandRotation(this.f28217d, z10);
        }
        this.f28219f = false;
        g();
        d(i11, i10);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener
    public void onPeriodChange(int i10) {
        this.f28216c.setPeriod(i10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f10, boolean z10) {
        if (this.f28219f || z10) {
            return;
        }
        TimeModel timeModel = this.f28216c;
        int i10 = timeModel.f28208e;
        int i11 = timeModel.f28209f;
        int iRound = Math.round(f10);
        TimeModel timeModel2 = this.f28216c;
        if (timeModel2.f28210g == 12) {
            timeModel2.setMinute((iRound + 3) / 6);
            this.f28217d = (float) Math.floor(this.f28216c.f28209f * 6);
        } else {
            int i12 = (iRound + 15) / 30;
            if (timeModel2.f28207d == 1) {
                i12 %= 12;
                if (this.f28215b.d() == 2) {
                    i12 += 12;
                }
            }
            this.f28216c.setHour(i12);
            this.f28218e = c();
        }
        g();
        d(i10, i11);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i10) {
        e(i10, true);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
        this.f28215b.setVisibility(0);
    }
}
