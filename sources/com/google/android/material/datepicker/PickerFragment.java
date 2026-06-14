package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes9.dex */
abstract class PickerFragment<S> extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final LinkedHashSet f26436b = new LinkedHashSet();

    PickerFragment() {
    }

    boolean addOnSelectionChangedListener(OnSelectionChangedListener onSelectionChangedListener) {
        return this.f26436b.add(onSelectionChangedListener);
    }

    void b() {
        this.f26436b.clear();
    }
}
