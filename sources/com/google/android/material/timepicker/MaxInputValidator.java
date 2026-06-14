package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes9.dex */
class MaxInputValidator implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28201a;

    public MaxInputValidator(int i10) {
        this.f28201a = i10;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i12, i13, charSequence.subSequence(i10, i11).toString());
            if (Integer.parseInt(sb2.toString()) <= this.f28201a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public int getMax() {
        return this.f28201a;
    }

    public void setMax(int i10) {
        this.f28201a = i10;
    }
}
