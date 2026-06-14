package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.timepicker.TimeModel;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
class YearGridAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MaterialCalendar f26464i;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final TextView f26467m;

        ViewHolder(TextView textView) {
            super(textView);
            this.f26467m = textView;
        }
    }

    YearGridAdapter(MaterialCalendar materialCalendar) {
        this.f26464i = materialCalendar;
    }

    private View.OnClickListener b(final int i10) {
        return new View.OnClickListener() { // from class: com.google.android.material.datepicker.YearGridAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                YearGridAdapter.this.f26464i.v(YearGridAdapter.this.f26464i.n().f(Month.a(i10, YearGridAdapter.this.f26464i.p().f26413c)));
                YearGridAdapter.this.f26464i.w(MaterialCalendar.CalendarSelector.DAY);
                YearGridAdapter.this.f26464i.u();
            }
        };
    }

    int c(int i10) {
        return i10 - this.f26464i.n().k().f26414d;
    }

    int d(int i10) {
        return this.f26464i.n().k().f26414d + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f26464i.n().l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i10) {
        int iD = d(i10);
        viewHolder.f26467m.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(iD)));
        TextView textView = viewHolder.f26467m;
        textView.setContentDescription(DateStrings.k(textView.getContext(), iD));
        CalendarStyle calendarStyleO = this.f26464i.o();
        Calendar calendarQ = UtcDates.q();
        CalendarItemStyle calendarItemStyle = calendarQ.get(1) == iD ? calendarStyleO.f26295f : calendarStyleO.f26293d;
        Iterator<Long> it = this.f26464i.getDateSelector().getSelectedDays().iterator();
        while (it.hasNext()) {
            calendarQ.setTimeInMillis(it.next().longValue());
            if (calendarQ.get(1) == iD) {
                calendarItemStyle = calendarStyleO.f26294e;
            }
        }
        calendarItemStyle.d(viewHolder.f26467m);
        viewHolder.f26467m.setSelected(calendarItemStyle == calendarStyleO.f26294e);
        viewHolder.f26467m.setOnClickListener(b(iD));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        return new ViewHolder((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
