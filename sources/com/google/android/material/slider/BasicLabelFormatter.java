package com.google.android.material.slider;

import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public final class BasicLabelFormatter implements LabelFormatter {
    @Override // com.google.android.material.slider.LabelFormatter
    @NonNull
    public String getFormattedValue(float f10) {
        return f10 >= 1.0E12f ? String.format(Locale.US, "%.1fT", Float.valueOf(f10 / 1.0E12f)) : f10 >= 1.0E9f ? String.format(Locale.US, "%.1fB", Float.valueOf(f10 / 1.0E9f)) : f10 >= 1000000.0f ? String.format(Locale.US, "%.1fM", Float.valueOf(f10 / 1000000.0f)) : f10 >= 1000.0f ? String.format(Locale.US, "%.1fK", Float.valueOf(f10 / 1000.0f)) : String.format(Locale.US, "%.0f", Float.valueOf(f10));
    }
}
