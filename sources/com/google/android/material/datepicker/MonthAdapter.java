package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
class MonthAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f26419h = UtcDates.s().getMaximum(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f26420i = (UtcDates.s().getMaximum(5) + UtcDates.s().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Month f26421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final DateSelector f26422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Collection f26423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    CalendarStyle f26424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final CalendarConstraints f26425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final DayViewDecorator f26426g;

    MonthAdapter(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f26421b = month;
        this.f26422c = dateSelector;
        this.f26425f = calendarConstraints;
        this.f26426g = dayViewDecorator;
        this.f26423d = dateSelector.getSelectedDays();
    }

    private String c(Context context, long j10) {
        return DateStrings.e(context, j10, j(j10), i(j10), e(j10));
    }

    private void d(Context context) {
        if (this.f26424e == null) {
            this.f26424e = new CalendarStyle(context);
        }
    }

    private boolean h(long j10) {
        Iterator<Long> it = this.f26422c.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (UtcDates.a(j10) == UtcDates.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean j(long j10) {
        return UtcDates.q().getTimeInMillis() == j10;
    }

    private void m(TextView textView, long j10, int i10) {
        boolean zH;
        CalendarItemStyle calendarItemStyle;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String strC = c(context, j10);
        textView.setContentDescription(strC);
        boolean zIsValid = this.f26425f.getDateValidator().isValid(j10);
        if (zIsValid) {
            textView.setEnabled(true);
            zH = h(j10);
            textView.setSelected(zH);
            calendarItemStyle = zH ? this.f26424e.f26291b : j(j10) ? this.f26424e.f26292c : this.f26424e.f26290a;
        } else {
            zH = false;
            textView.setEnabled(false);
            calendarItemStyle = this.f26424e.f26296g;
        }
        boolean z10 = zH;
        DayViewDecorator dayViewDecorator = this.f26426g;
        if (dayViewDecorator == null || i10 == -1) {
            calendarItemStyle.d(textView);
            return;
        }
        Month month = this.f26421b;
        int i11 = month.f26414d;
        int i12 = month.f26413c;
        calendarItemStyle.e(textView, dayViewDecorator.getBackgroundColor(context, i11, i12, i10, zIsValid, z10), this.f26426g.getTextColor(context, i11, i12, i10, zIsValid, z10));
        textView.setCompoundDrawables(this.f26426g.getCompoundDrawableLeft(context, i11, i12, i10, zIsValid, z10), this.f26426g.getCompoundDrawableTop(context, i11, i12, i10, zIsValid, z10), this.f26426g.getCompoundDrawableRight(context, i11, i12, i10, zIsValid, z10), this.f26426g.getCompoundDrawableBottom(context, i11, i12, i10, zIsValid, z10));
        textView.setContentDescription(this.f26426g.getContentDescription(context, i11, i12, i10, zIsValid, z10, strC));
    }

    private void n(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (Month.c(j10).equals(this.f26421b)) {
            int iG = this.f26421b.g(j10);
            m((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iG) - materialCalendarGridView.getFirstVisiblePosition()), j10, iG);
        }
    }

    int a(int i10) {
        return b() + (i10 - 1);
    }

    int b() {
        return this.f26421b.e(this.f26425f.h());
    }

    boolean e(long j10) {
        Iterator<Pair<Long, Long>> it = this.f26422c.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().second;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    boolean f(int i10) {
        return i10 % this.f26421b.f26415e == 0;
    }

    boolean g(int i10) {
        return (i10 + 1) % this.f26421b.f26415e == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f26420i;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f26421b.f26415e;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(long j10) {
        Iterator<Pair<Long, Long>> it = this.f26422c.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().first;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    int k() {
        return (b() + this.f26421b.f26416f) - 1;
    }

    int l(int i10) {
        return (i10 - b()) + 1;
    }

    boolean o(int i10) {
        return i10 >= b() && i10 <= k();
    }

    public void updateSelectedStates(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f26423d.iterator();
        while (it.hasNext()) {
            n(materialCalendarGridView, ((Long) it.next()).longValue());
        }
        DateSelector dateSelector = this.f26422c;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.getSelectedDays().iterator();
            while (it2.hasNext()) {
                n(materialCalendarGridView, it2.next().longValue());
            }
            this.f26423d = this.f26422c.getSelectedDays();
        }
    }

    @Override // android.widget.Adapter
    @Nullable
    public Long getItem(int i10) {
        if (i10 < b() || i10 > k()) {
            return null;
        }
        return Long.valueOf(this.f26421b.f(l(i10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    @Override // android.widget.Adapter
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, @androidx.annotation.Nullable android.view.View r7, @androidx.annotation.NonNull android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = 1
            android.content.Context r1 = r8.getContext()
            r5.d(r1)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            if (r7 != 0) goto L1f
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r1 = com.google.android.material.R.layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r1, r8, r2)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
        L1f:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.Month r8 = r5.f26421b
            int r3 = r8.f26416f
            if (r7 < r3) goto L2e
            goto L54
        L2e:
            int r7 = r7 + r0
            r1.setTag(r8)
            android.content.res.Resources r8 = r1.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r2] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r1.setText(r8)
            r1.setVisibility(r2)
            r1.setEnabled(r0)
            goto L5d
        L54:
            r7 = 8
            r1.setVisibility(r7)
            r1.setEnabled(r2)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r1
        L64:
            long r2 = r6.longValue()
            r5.m(r1, r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.MonthAdapter.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }
}
