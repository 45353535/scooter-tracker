package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialCalendar<S> extends PickerFragment<S> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final Object f26316r = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final Object f26317s = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final Object f26318t = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final Object f26319u = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DateSelector f26321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CalendarConstraints f26322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private DayViewDecorator f26323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Month f26324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CalendarSelector f26325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CalendarStyle f26326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RecyclerView f26327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private RecyclerView f26328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f26329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f26330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f26331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f26332o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private MaterialButton f26333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AccessibilityManager f26334q;

    enum CalendarSelector {
        DAY,
        YEAR
    }

    interface OnDayClickListener {
        void onDayClick(long j10);
    }

    private void l(View view, final MonthsPagerAdapter monthsPagerAdapter) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.month_navigation_fragment_toggle);
        this.f26333p = materialButton;
        materialButton.setTag(f26319u);
        ViewCompat.setAccessibilityDelegate(this.f26333p, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.6
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, MaterialCalendar.this.f26332o.getVisibility() == 0 ? MaterialCalendar.this.getString(R.string.mtrl_picker_toggle_to_year_selection) : MaterialCalendar.this.getString(R.string.mtrl_picker_toggle_to_day_selection)));
            }
        });
        View viewFindViewById = view.findViewById(R.id.month_navigation_previous);
        this.f26329l = viewFindViewById;
        viewFindViewById.setTag(f26317s);
        View viewFindViewById2 = view.findViewById(R.id.month_navigation_next);
        this.f26330m = viewFindViewById2;
        viewFindViewById2.setTag(f26318t);
        this.f26331n = view.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f26332o = view.findViewById(R.id.mtrl_calendar_day_selector_frame);
        w(CalendarSelector.DAY);
        this.f26333p.setText(this.f26324g.h());
        this.f26328k.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.7
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NonNull RecyclerView recyclerView, int i10, int i11) {
                int iFindFirstVisibleItemPosition = i10 < 0 ? MaterialCalendar.this.s().findFirstVisibleItemPosition() : MaterialCalendar.this.s().findLastVisibleItemPosition();
                Month monthB = monthsPagerAdapter.b(iFindFirstVisibleItemPosition);
                MaterialCalendar.this.f26324g = monthB;
                MaterialCalendar.this.f26333p.setText(monthsPagerAdapter.c(iFindFirstVisibleItemPosition));
                MaterialCalendar.this.z(monthsPagerAdapter.d(monthB));
            }
        });
        this.f26333p.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                MaterialCalendar.this.y();
            }
        });
        this.f26330m.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                MaterialCalendar.this.v(monthsPagerAdapter.b(MaterialCalendar.this.s().findFirstVisibleItemPosition() + 1));
            }
        });
        this.f26329l.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                MaterialCalendar.this.v(monthsPagerAdapter.b(MaterialCalendar.this.s().findLastVisibleItemPosition() - 1));
            }
        });
        z(monthsPagerAdapter.d(this.f26324g));
    }

    private RecyclerView.ItemDecoration m() {
        return new RecyclerView.ItemDecoration() { // from class: com.google.android.material.datepicker.MaterialCalendar.5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Calendar f26344b = UtcDates.s();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Calendar f26345c = UtcDates.s();

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
                if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView.getAdapter();
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                    for (Pair<Long, Long> pair : MaterialCalendar.this.f26321d.getSelectedRanges()) {
                        Long l10 = pair.first;
                        if (l10 != null && pair.second != null) {
                            this.f26344b.setTimeInMillis(l10.longValue());
                            this.f26345c.setTimeInMillis(pair.second.longValue());
                            int iC = yearGridAdapter.c(this.f26344b.get(1));
                            int iC2 = yearGridAdapter.c(this.f26345c.get(1));
                            View viewFindViewByPosition = gridLayoutManager.findViewByPosition(iC);
                            View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(iC2);
                            int spanCount = iC / gridLayoutManager.getSpanCount();
                            int spanCount2 = iC2 / gridLayoutManager.getSpanCount();
                            int i10 = spanCount;
                            while (i10 <= spanCount2) {
                                if (gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i10) != null) {
                                    canvas.drawRect((i10 != spanCount || viewFindViewByPosition == null) ? 0 : viewFindViewByPosition.getLeft() + (viewFindViewByPosition.getWidth() / 2), r9.getTop() + MaterialCalendar.this.f26326i.f26293d.c(), (i10 != spanCount2 || viewFindViewByPosition2 == null) ? recyclerView.getWidth() : viewFindViewByPosition2.getLeft() + (viewFindViewByPosition2.getWidth() / 2), r9.getBottom() - MaterialCalendar.this.f26326i.f26293d.b(), MaterialCalendar.this.f26326i.f26297h);
                                }
                                i10++;
                            }
                        }
                    }
                }
            }
        };
    }

    @NonNull
    public static <T> MaterialCalendar<T> newInstance(@NonNull DateSelector<T> dateSelector, @StyleRes int i10, @NonNull CalendarConstraints calendarConstraints) {
        return newInstance(dateSelector, i10, calendarConstraints, null);
    }

    static int q(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    private static int r(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i10 = MonthAdapter.f26419h;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding);
    }

    private void t(final int i10) {
        this.f26328k.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.11
            @Override // java.lang.Runnable
            public void run() {
                MaterialCalendar.this.f26328k.smoothScrollToPosition(i10);
            }
        });
    }

    private void x() {
        ViewCompat.setAccessibilityDelegate(this.f26328k, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.4
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setScrollable(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int i10) {
        this.f26330m.setEnabled(i10 + 1 < this.f26328k.getAdapter().getItemCount());
        this.f26329l.setEnabled(i10 - 1 >= 0);
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public boolean addOnSelectionChangedListener(@NonNull OnSelectionChangedListener<S> onSelectionChangedListener) {
        return super.addOnSelectionChangedListener(onSelectionChangedListener);
    }

    @Nullable
    public DateSelector<S> getDateSelector() {
        return this.f26321d;
    }

    CalendarConstraints n() {
        return this.f26322e;
    }

    CalendarStyle o() {
        return this.f26326i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f26320c = bundle.getInt("THEME_RES_ID_KEY");
        this.f26321d = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f26322e = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f26323f = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f26324g = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i10;
        final int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f26320c);
        this.f26326i = new CalendarStyle(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f26334q = (AccessibilityManager) requireContext().getSystemService("accessibility");
        Month monthK = this.f26322e.k();
        if (MaterialDatePicker.l(contextThemeWrapper)) {
            i10 = R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(r(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo(null);
            }
        });
        int iH = this.f26322e.h();
        gridView.setAdapter((ListAdapter) (iH > 0 ? new DaysOfWeekAdapter(iH) : new DaysOfWeekAdapter()));
        gridView.setNumColumns(monthK.f26415e);
        gridView.setEnabled(false);
        this.f26328k = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        this.f26328k.setLayoutManager(new SmoothCalendarLayoutManager(getContext(), i11, false) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            protected void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
                if (i11 == 0) {
                    iArr[0] = MaterialCalendar.this.f26328k.getWidth();
                    iArr[1] = MaterialCalendar.this.f26328k.getWidth();
                } else {
                    iArr[0] = MaterialCalendar.this.f26328k.getHeight();
                    iArr[1] = MaterialCalendar.this.f26328k.getHeight();
                }
            }
        });
        this.f26328k.setTag(f26316r);
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.f26321d, this.f26322e, this.f26323f, new OnDayClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener
            public void onDayClick(long j10) {
                if (MaterialCalendar.this.f26322e.getDateValidator().isValid(j10)) {
                    MaterialCalendar.this.f26321d.select(j10);
                    Iterator it = MaterialCalendar.this.f26436b.iterator();
                    while (it.hasNext()) {
                        ((OnSelectionChangedListener) it.next()).onSelectionChanged(MaterialCalendar.this.f26321d.getSelection());
                    }
                    MaterialCalendar.this.f26328k.getAdapter().notifyDataSetChanged();
                    if (MaterialCalendar.this.f26327j != null) {
                        MaterialCalendar.this.f26327j.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
        this.f26328k.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f26327j = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f26327j.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f26327j.setAdapter(new YearGridAdapter(this));
            this.f26327j.addItemDecoration(m());
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            l(viewInflate, monthsPagerAdapter);
        }
        if (!MaterialDatePicker.l(contextThemeWrapper)) {
            new PagerSnapHelper().attachToRecyclerView(this.f26328k);
        }
        this.f26328k.scrollToPosition(monthsPagerAdapter.d(this.f26324g));
        x();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f26320c);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f26321d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f26322e);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f26323f);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f26324g);
    }

    Month p() {
        return this.f26324g;
    }

    LinearLayoutManager s() {
        return (LinearLayoutManager) this.f26328k.getLayoutManager();
    }

    void u() {
        MaterialButton materialButton = this.f26333p;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }

    void v(Month month) {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.f26328k.getAdapter();
        int iD = monthsPagerAdapter.d(month);
        AccessibilityManager accessibilityManager = this.f26334q;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iD2 = iD - monthsPagerAdapter.d(this.f26324g);
            boolean z10 = Math.abs(iD2) > 3;
            boolean z11 = iD2 > 0;
            this.f26324g = month;
            if (z10 && z11) {
                this.f26328k.scrollToPosition(iD - 3);
                t(iD);
            } else if (z10) {
                this.f26328k.scrollToPosition(iD + 3);
                t(iD);
            } else {
                t(iD);
            }
        } else {
            this.f26324g = month;
            this.f26328k.scrollToPosition(iD);
        }
        z(iD);
    }

    void w(CalendarSelector calendarSelector) {
        this.f26325h = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f26327j.getLayoutManager().scrollToPosition(((YearGridAdapter) this.f26327j.getAdapter()).c(this.f26324g.f26414d));
            this.f26331n.setVisibility(0);
            this.f26332o.setVisibility(8);
            this.f26329l.setVisibility(8);
            this.f26330m.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.DAY) {
            this.f26331n.setVisibility(8);
            this.f26332o.setVisibility(0);
            this.f26329l.setVisibility(0);
            this.f26330m.setVisibility(0);
            v(this.f26324g);
        }
    }

    void y() {
        CalendarSelector calendarSelector = this.f26325h;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            w(CalendarSelector.DAY);
            this.f26328k.announceForAccessibility(getString(R.string.mtrl_picker_toggled_to_day_selection));
        } else if (calendarSelector == CalendarSelector.DAY) {
            w(calendarSelector2);
            this.f26327j.announceForAccessibility(getString(R.string.mtrl_picker_toggled_to_year_selection));
        }
    }

    @NonNull
    public static <T> MaterialCalendar<T> newInstance(@NonNull DateSelector<T> dateSelector, @StyleRes int i10, @NonNull CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.j());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }
}
