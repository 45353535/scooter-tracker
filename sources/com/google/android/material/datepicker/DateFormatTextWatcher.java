package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.R;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
abstract class DateFormatTextWatcher extends TextWatcherAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextInputLayout f26302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final DateFormat f26304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CalendarConstraints f26305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f26306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f26307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Runnable f26308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f26309i = 0;

    DateFormatTextWatcher(final String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f26303c = str;
        this.f26304d = dateFormat;
        this.f26302b = textInputLayout;
        this.f26305e = calendarConstraints;
        this.f26306f = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f26307g = new Runnable() { // from class: com.google.android.material.datepicker.b
            @Override // java.lang.Runnable
            public final void run() {
                DateFormatTextWatcher.b(this.f26470b, str);
            }
        };
    }

    public static /* synthetic */ void a(DateFormatTextWatcher dateFormatTextWatcher, long j10) {
        dateFormatTextWatcher.getClass();
        dateFormatTextWatcher.f26302b.setError(String.format(dateFormatTextWatcher.f26306f, dateFormatTextWatcher.f(DateStrings.c(j10))));
        dateFormatTextWatcher.d();
    }

    public static /* synthetic */ void b(DateFormatTextWatcher dateFormatTextWatcher, String str) {
        TextInputLayout textInputLayout = dateFormatTextWatcher.f26302b;
        DateFormat dateFormat = dateFormatTextWatcher.f26304d;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(R.string.mtrl_picker_invalid_format) + IOUtils.LINE_SEPARATOR_UNIX + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), dateFormatTextWatcher.f(str)) + IOUtils.LINE_SEPARATOR_UNIX + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), dateFormatTextWatcher.f(dateFormat.format(new Date(UtcDates.q().getTimeInMillis())))));
        dateFormatTextWatcher.d();
    }

    private Runnable c(final long j10) {
        return new Runnable() { // from class: com.google.android.material.datepicker.a
            @Override // java.lang.Runnable
            public final void run() {
                DateFormatTextWatcher.a(this.f26468b, j10);
            }
        };
    }

    private String f(String str) {
        return str.replace(' ', (char) 160);
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void afterTextChanged(@NonNull Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.f26303c.length() && editable.length() >= this.f26309i) {
            char cCharAt = this.f26303c.charAt(editable.length());
            if (Character.isLetterOrDigit(cCharAt)) {
                return;
            }
            editable.append(cCharAt);
        }
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void beforeTextChanged(@NonNull CharSequence charSequence, int i10, int i11, int i12) {
        this.f26309i = charSequence.length();
    }

    void d() {
    }

    abstract void e(Long l10);

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(@NonNull CharSequence charSequence, int i10, int i11, int i12) {
        this.f26302b.removeCallbacks(this.f26307g);
        this.f26302b.removeCallbacks(this.f26308h);
        this.f26302b.setError(null);
        e(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f26303c.length()) {
            return;
        }
        try {
            Date date = this.f26304d.parse(charSequence.toString());
            this.f26302b.setError(null);
            long time = date.getTime();
            if (this.f26305e.getDateValidator().isValid(time) && this.f26305e.m(time)) {
                e(Long.valueOf(date.getTime()));
                return;
            }
            Runnable runnableC = c(time);
            this.f26308h = runnableC;
            runValidation(this.f26302b, runnableC);
        } catch (ParseException unused) {
            runValidation(this.f26302b, this.f26307g);
        }
    }

    public void runValidation(View view, Runnable runnable) {
        view.post(runnable);
    }
}
