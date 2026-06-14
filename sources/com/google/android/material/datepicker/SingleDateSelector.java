package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
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
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new Parcelable.Creator<SingleDateSelector>() { // from class: com.google.android.material.datepicker.SingleDateSelector.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public SingleDateSelector createFromParcel(@NonNull Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f26454c = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public SingleDateSelector[] newArray(int i10) {
            return new SingleDateSelector[i10];
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f26453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f26454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SimpleDateFormat f26455d;

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f26454c = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(Context context) {
        return MaterialAttributes.resolveOrThrow(context, R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return R.string.mtrl_picker_date_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public String getError() {
        if (TextUtils.isEmpty(this.f26453b)) {
            return null;
        }
        return this.f26453b.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f26454c;
        if (l10 != null) {
            arrayList.add(l10);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Pair<Long, Long>> getSelectedRanges() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionContentDescription(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f26454c;
        return resources.getString(R.string.mtrl_picker_announce_current_selection, l10 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : DateStrings.m(l10.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionDisplayString(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f26454c;
        if (l10 == null) {
            return resources.getString(R.string.mtrl_picker_date_header_unselected);
        }
        return resources.getString(R.string.mtrl_picker_date_header_selected, DateStrings.m(l10.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        return this.f26454c != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull final OnSelectionChangedListener<Long> onSelectionChangedListener) {
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        Integer colorOrNull = MaterialColors.getColorOrNull(viewInflate.getContext(), R.attr.colorOnSurfaceVariant);
        if (colorOrNull != null) {
            editText.setHintTextColor(colorOrNull.intValue());
        }
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatG = this.f26455d;
        boolean z10 = simpleDateFormatG != null;
        if (!z10) {
            simpleDateFormatG = UtcDates.g();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatG;
        String pattern = z10 ? simpleDateFormat.toPattern() : UtcDates.h(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        Long l10 = this.f26454c;
        if (l10 != null) {
            editText.setText(simpleDateFormat.format(l10));
        }
        editText.addTextChangedListener(new DateFormatTextWatcher(pattern, simpleDateFormat, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.SingleDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void d() {
                SingleDateSelector.this.f26453b = textInputLayout.getError();
                onSelectionChangedListener.onIncompleteSelectionChanged();
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void e(Long l11) {
                if (l11 == null) {
                    SingleDateSelector.this.d();
                } else {
                    SingleDateSelector.this.select(l11.longValue());
                }
                SingleDateSelector.this.f26453b = null;
                onSelectionChangedListener.onSelectionChanged(SingleDateSelector.this.getSelection());
            }
        });
        if (!e.a(viewInflate.getContext())) {
            e.d(editText);
        }
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j10) {
        this.f26454c = Long.valueOf(j10);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat) UtcDates.n(simpleDateFormat);
        }
        this.f26455d = simpleDateFormat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeValue(this.f26454c);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public Long getSelection() {
        return this.f26454c;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(@Nullable Long l10) {
        this.f26454c = l10 == null ? null : Long.valueOf(UtcDates.a(l10.longValue()));
    }
}
