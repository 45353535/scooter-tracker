package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DateSelector f26409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CalendarConstraints f26410e;

    static MaterialTextInputPicker c(DateSelector dateSelector, int i10, CalendarConstraints calendarConstraints) {
        MaterialTextInputPicker materialTextInputPicker = new MaterialTextInputPicker();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        materialTextInputPicker.setArguments(bundle);
        return materialTextInputPicker;
    }

    @NonNull
    public DateSelector<S> getDateSelector() {
        DateSelector<S> dateSelector = this.f26409d;
        if (dateSelector != null) {
            return dateSelector;
        }
        throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f26408c = bundle.getInt("THEME_RES_ID_KEY");
        this.f26409d = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f26410e = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return this.f26409d.onCreateTextInputView(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f26408c)), viewGroup, bundle, this.f26410e, new OnSelectionChangedListener<S>() { // from class: com.google.android.material.datepicker.MaterialTextInputPicker.1
            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public void onIncompleteSelectionChanged() {
                Iterator it = MaterialTextInputPicker.this.f26436b.iterator();
                while (it.hasNext()) {
                    ((OnSelectionChangedListener) it.next()).onIncompleteSelectionChanged();
                }
            }

            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public void onSelectionChanged(S s10) {
                Iterator it = MaterialTextInputPicker.this.f26436b.iterator();
                while (it.hasNext()) {
                    ((OnSelectionChangedListener) it.next()).onSelectionChanged(s10);
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f26408c);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f26409d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f26410e);
    }
}
