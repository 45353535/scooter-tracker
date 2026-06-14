package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RangeDateSelector implements DateSelector<Pair<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new Parcelable.Creator<RangeDateSelector>() { // from class: com.google.android.material.datepicker.RangeDateSelector.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public RangeDateSelector createFromParcel(@NonNull Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f26440e = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f26441f = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public RangeDateSelector[] newArray(int i10) {
            return new RangeDateSelector[i10];
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f26437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26439d = " ";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f26440e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Long f26441f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f26442g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f26443h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SimpleDateFormat f26444i;

    private void f(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f26438c.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    private boolean g(long j10, long j11) {
        return j10 <= j11;
    }

    private void h(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f26438c);
        textInputLayout2.setError(" ");
    }

    private void i(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.f26437b = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            this.f26437b = null;
        } else {
            this.f26437b = textInputLayout2.getError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, OnSelectionChangedListener onSelectionChangedListener) {
        Long l10 = this.f26442g;
        if (l10 == null || this.f26443h == null) {
            f(textInputLayout, textInputLayout2);
            onSelectionChangedListener.onIncompleteSelectionChanged();
        } else if (g(l10.longValue(), this.f26443h.longValue())) {
            this.f26440e = this.f26442g;
            this.f26441f = this.f26443h;
            onSelectionChangedListener.onSelectionChanged(getSelection());
        } else {
            h(textInputLayout, textInputLayout2);
            onSelectionChangedListener.onIncompleteSelectionChanged();
        }
        i(textInputLayout, textInputLayout2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(@NonNull Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return MaterialAttributes.resolveOrThrow(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return R.string.mtrl_picker_range_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public String getError() {
        if (TextUtils.isEmpty(this.f26437b)) {
            return null;
        }
        return this.f26437b.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f26440e;
        if (l10 != null) {
            arrayList.add(l10);
        }
        Long l11 = this.f26441f;
        if (l11 != null) {
            arrayList.add(l11);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Pair<Long, Long>> getSelectedRanges() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(this.f26440e, this.f26441f));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionContentDescription(@NonNull Context context) {
        Resources resources = context.getResources();
        Pair pairA = DateStrings.a(this.f26440e, this.f26441f);
        Object obj = pairA.first;
        String string = obj == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : (String) obj;
        Object obj2 = pairA.second;
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, string, obj2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : (String) obj2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionDisplayString(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f26440e;
        if (l10 == null && this.f26441f == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l11 = this.f26441f;
        if (l11 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, DateStrings.c(l10.longValue()));
        }
        if (l10 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, DateStrings.c(l11.longValue()));
        }
        Pair pairA = DateStrings.a(l10, l11);
        return resources.getString(R.string.mtrl_picker_range_header_selected, pairA.first, pairA.second);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        Long l10 = this.f26440e;
        return (l10 == null || this.f26441f == null || !g(l10.longValue(), this.f26441f.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull final OnSelectionChangedListener<Pair<Long, Long>> onSelectionChangedListener) {
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        final TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        Integer colorOrNull = MaterialColors.getColorOrNull(viewInflate.getContext(), R.attr.colorOnSurfaceVariant);
        if (colorOrNull != null) {
            editText.setHintTextColor(colorOrNull.intValue());
            editText2.setHintTextColor(colorOrNull.intValue());
        }
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f26438c = viewInflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormatG = this.f26444i;
        boolean z10 = simpleDateFormatG != null;
        if (!z10) {
            simpleDateFormatG = UtcDates.g();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatG;
        Long l10 = this.f26440e;
        if (l10 != null) {
            editText.setText(simpleDateFormat.format(l10));
            this.f26442g = this.f26440e;
        }
        Long l11 = this.f26441f;
        if (l11 != null) {
            editText2.setText(simpleDateFormat.format(l11));
            this.f26443h = this.f26441f;
        }
        String pattern = z10 ? simpleDateFormat.toPattern() : UtcDates.h(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        textInputLayout2.setPlaceholderText(pattern);
        editText.addTextChangedListener(new DateFormatTextWatcher(pattern, simpleDateFormat, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void d() {
                RangeDateSelector.this.f26442g = null;
                RangeDateSelector.this.j(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void e(Long l12) {
                RangeDateSelector.this.f26442g = l12;
                RangeDateSelector.this.j(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        editText2.addTextChangedListener(new DateFormatTextWatcher(pattern, simpleDateFormat, textInputLayout2, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.2
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void d() {
                RangeDateSelector.this.f26443h = null;
                RangeDateSelector.this.j(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void e(Long l12) {
                RangeDateSelector.this.f26443h = l12;
                RangeDateSelector.this.j(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        if (!e.a(viewInflate.getContext())) {
            e.d(editText, editText2);
        }
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j10) {
        Long l10 = this.f26440e;
        if (l10 == null) {
            this.f26440e = Long.valueOf(j10);
        } else if (this.f26441f == null && g(l10.longValue(), j10)) {
            this.f26441f = Long.valueOf(j10);
        } else {
            this.f26441f = null;
            this.f26440e = Long.valueOf(j10);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat) UtcDates.n(simpleDateFormat);
        }
        this.f26444i = simpleDateFormat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeValue(this.f26440e);
        parcel.writeValue(this.f26441f);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Pair<Long, Long> getSelection() {
        return new Pair<>(this.f26440e, this.f26441f);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(@NonNull Pair<Long, Long> pair) {
        Long l10 = pair.first;
        if (l10 != null && pair.second != null) {
            Preconditions.checkArgument(g(l10.longValue(), pair.second.longValue()));
        }
        Long l11 = pair.first;
        this.f26440e = l11 == null ? null : Long.valueOf(UtcDates.a(l11.longValue()));
        Long l12 = pair.second;
        this.f26441f = l12 != null ? Long.valueOf(UtcDates.a(l12.longValue())) : null;
    }
}
