package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;

/* JADX INFO: loaded from: classes9.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Calendar f26354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26355c;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    private void a(int i10, Rect rect) {
        if (i10 == 33) {
            setSelection(getAdapter().k());
        } else if (i10 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    private View b(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    private static int c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean d(Long l10, Long l11, Long l12, Long l13) {
        return l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int iA;
        int iC;
        int iA2;
        int iC2;
        int width;
        int i10;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter adapter = materialCalendarGridView.getAdapter();
        DateSelector dateSelector = adapter.f26422c;
        CalendarStyle calendarStyle = adapter.f26424e;
        int iMax = Math.max(adapter.b(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(adapter.k(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        for (Pair<Long, Long> pair : dateSelector.getSelectedRanges()) {
            Long l10 = pair.first;
            if (l10 == null) {
                materialCalendarGridView = this;
            } else if (pair.second != null) {
                Long l11 = l10;
                long jLongValue = l11.longValue();
                Long l12 = pair.second;
                long jLongValue2 = l12.longValue();
                if (!d(item, item2, l11, l12)) {
                    boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(materialCalendarGridView);
                    if (jLongValue < item.longValue()) {
                        iC = adapter.f(iMax) ? 0 : !zIsLayoutRtl ? materialCalendarGridView.b(iMax - 1).getRight() : materialCalendarGridView.b(iMax - 1).getLeft();
                        iA = iMax;
                    } else {
                        materialCalendarGridView.f26354b.setTimeInMillis(jLongValue);
                        iA = adapter.a(materialCalendarGridView.f26354b.get(5));
                        iC = c(materialCalendarGridView.b(iA));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iC2 = adapter.g(iMin) ? materialCalendarGridView.getWidth() : !zIsLayoutRtl ? materialCalendarGridView.b(iMin).getRight() : materialCalendarGridView.b(iMin).getLeft();
                        iA2 = iMin;
                    } else {
                        materialCalendarGridView.f26354b.setTimeInMillis(jLongValue2);
                        iA2 = adapter.a(materialCalendarGridView.f26354b.get(5));
                        iC2 = c(materialCalendarGridView.b(iA2));
                    }
                    int itemId = (int) adapter.getItemId(iA);
                    int i11 = iMax;
                    int i12 = iMin;
                    int itemId2 = (int) adapter.getItemId(iA2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        int numColumns2 = (numColumns + materialCalendarGridView.getNumColumns()) - 1;
                        View viewB = materialCalendarGridView.b(numColumns);
                        int top = viewB.getTop() + calendarStyle.f26290a.c();
                        MonthAdapter monthAdapter = adapter;
                        int bottom = viewB.getBottom() - calendarStyle.f26290a.b();
                        if (zIsLayoutRtl) {
                            int i13 = iA2 > numColumns2 ? 0 : iC2;
                            width = numColumns > iA ? getWidth() : iC;
                            i10 = i13;
                        } else {
                            i10 = numColumns > iA ? 0 : iC;
                            width = iA2 > numColumns2 ? getWidth() : iC2;
                        }
                        canvas.drawRect(i10, top, width, bottom, calendarStyle.f26297h);
                        itemId++;
                        materialCalendarGridView = this;
                        adapter = monthAdapter;
                    }
                    materialCalendarGridView = this;
                    iMax = i11;
                    iMin = i12;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= getAdapter().b() && selectedItemPosition <= getAdapter().k())) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f26355c) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i10);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof MonthAdapter)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f26354b = UtcDates.s();
        if (MaterialDatePicker.l(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f26355c = MaterialDatePicker.n(getContext());
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendarGridView.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo(null);
            }
        });
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    public MonthAdapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }
}
