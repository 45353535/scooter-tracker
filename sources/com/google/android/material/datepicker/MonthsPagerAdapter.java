package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.datepicker.MaterialCalendar;

/* JADX INFO: loaded from: classes9.dex */
class MonthsPagerAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CalendarConstraints f26427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final DateSelector f26428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final DayViewDecorator f26429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final MaterialCalendar.OnDayClickListener f26430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f26431m;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final TextView f26434m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final MaterialCalendarGridView f26435n;

        ViewHolder(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f26434m = textView;
            ViewCompat.setAccessibilityHeading(textView, true);
            this.f26435n = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    MonthsPagerAdapter(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, MaterialCalendar.OnDayClickListener onDayClickListener) {
        Month monthK = calendarConstraints.k();
        Month monthG = calendarConstraints.g();
        Month monthJ = calendarConstraints.j();
        if (monthK.compareTo(monthJ) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthJ.compareTo(monthG) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f26431m = (MonthAdapter.f26419h * MaterialCalendar.q(context)) + (MaterialDatePicker.l(context) ? MaterialCalendar.q(context) : 0);
        this.f26427i = calendarConstraints;
        this.f26428j = dateSelector;
        this.f26429k = dayViewDecorator;
        this.f26430l = onDayClickListener;
        setHasStableIds(true);
    }

    Month b(int i10) {
        return this.f26427i.k().j(i10);
    }

    CharSequence c(int i10) {
        return b(i10).h();
    }

    int d(Month month) {
        return this.f26427i.k().k(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f26427i.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return this.f26427i.k().j(i10).i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i10) {
        Month monthJ = this.f26427i.k().j(i10);
        viewHolder.f26434m.setText(monthJ.h());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder.f26435n.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !monthJ.equals(materialCalendarGridView.getAdapter().f26421b)) {
            MonthAdapter monthAdapter = new MonthAdapter(monthJ, this.f26428j, this.f26427i, this.f26429k);
            materialCalendarGridView.setNumColumns(monthJ.f26415e);
            materialCalendarGridView.setAdapter((ListAdapter) monthAdapter);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().updateSelectedStates(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.datepicker.MonthsPagerAdapter.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j10) {
                if (materialCalendarGridView.getAdapter().o(i11)) {
                    MonthsPagerAdapter.this.f26430l.onDayClick(materialCalendarGridView.getAdapter().getItem(i11).longValue());
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.l(viewGroup.getContext())) {
            return new ViewHolder(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f26431m));
        return new ViewHolder(linearLayout, true);
    }
}
