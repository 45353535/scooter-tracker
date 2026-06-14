package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
class DaysOfWeekAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f26312e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Calendar f26313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f26315d;

    static {
        f26312e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public DaysOfWeekAdapter() {
        Calendar calendarS = UtcDates.s();
        this.f26313b = calendarS;
        this.f26314c = calendarS.getMaximum(7);
        this.f26315d = calendarS.getFirstDayOfWeek();
    }

    private int a(int i10) {
        int i11 = i10 + this.f26315d;
        int i12 = this.f26314c;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f26314c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @Nullable
    @SuppressLint({"WrongConstant"})
    public View getView(int i10, @Nullable View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f26313b.set(7, a(i10));
        textView.setText(this.f26313b.getDisplayName(7, f26312e, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f26313b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    @Override // android.widget.Adapter
    @Nullable
    public Integer getItem(int i10) {
        if (i10 >= this.f26314c) {
            return null;
        }
        return Integer.valueOf(a(i10));
    }

    public DaysOfWeekAdapter(int i10) {
        Calendar calendarS = UtcDates.s();
        this.f26313b = calendarS;
        this.f26314c = calendarS.getMaximum(7);
        this.f26315d = i10;
    }
}
