package io.bidmachine.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n9.i0;

/* JADX INFO: loaded from: classes12.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f81575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LayoutInflater f81576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CheckedTextView f81577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CheckedTextView f81578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f81579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f81580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f81581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f81582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f81583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private yb.l f81584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CheckedTextView[][] f81585l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f81586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Comparator f81587n;

    private class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.c(view);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i0.a f81589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81590b;

        public c(i0.a aVar, int i10) {
            this.f81589a = aVar;
            this.f81590b = i10;
        }

        public io.bidmachine.media3.common.a a() {
            return this.f81589a.b(this.f81590b);
        }
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static Map b(Map map, List list, boolean z10) {
        HashMap map2 = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            n9.g0 g0Var = (n9.g0) map.get(((i0.a) list.get(i10)).a());
            if (g0Var != null && (z10 || map2.isEmpty())) {
                map2.put(g0Var.f95322a, g0Var);
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        if (view == this.f81577d) {
            e();
        } else if (view == this.f81578e) {
            d();
        } else {
            f(view);
        }
        i();
    }

    private void d() {
        this.f81586m = false;
        this.f81581h.clear();
    }

    private void e() {
        this.f81586m = true;
        this.f81581h.clear();
    }

    private void f(View view) {
        this.f81586m = false;
        c cVar = (c) q9.a.e(view.getTag());
        n9.f0 f0VarA = cVar.f81589a.a();
        int i10 = cVar.f81590b;
        n9.g0 g0Var = (n9.g0) this.f81581h.get(f0VarA);
        if (g0Var == null) {
            if (!this.f81583j && this.f81581h.size() > 0) {
                this.f81581h.clear();
            }
            this.f81581h.put(f0VarA, new n9.g0(f0VarA, ImmutableList.of(Integer.valueOf(i10))));
            return;
        }
        ArrayList arrayList = new ArrayList(g0Var.f95323b);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zG = g(cVar.f81589a);
        boolean z10 = zG || h();
        if (zIsChecked && z10) {
            arrayList.remove(Integer.valueOf(i10));
            if (arrayList.isEmpty()) {
                this.f81581h.remove(f0VarA);
                return;
            } else {
                this.f81581h.put(f0VarA, new n9.g0(f0VarA, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zG) {
            this.f81581h.put(f0VarA, new n9.g0(f0VarA, ImmutableList.of(Integer.valueOf(i10))));
        } else {
            arrayList.add(Integer.valueOf(i10));
            this.f81581h.put(f0VarA, new n9.g0(f0VarA, arrayList));
        }
    }

    private boolean g(i0.a aVar) {
        return this.f81582i && aVar.d();
    }

    private boolean h() {
        return this.f81583j && this.f81580g.size() > 1;
    }

    private void i() {
        this.f81577d.setChecked(this.f81586m);
        this.f81578e.setChecked(!this.f81586m && this.f81581h.size() == 0);
        for (int i10 = 0; i10 < this.f81585l.length; i10++) {
            n9.g0 g0Var = (n9.g0) this.f81581h.get(((i0.a) this.f81580g.get(i10)).a());
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f81585l[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (g0Var != null) {
                        this.f81585l[i10][i11].setChecked(g0Var.f95323b.contains(Integer.valueOf(((c) q9.a.e(checkedTextViewArr[i11].getTag())).f81590b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    private void j() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f81580g.isEmpty()) {
            this.f81577d.setEnabled(false);
            this.f81578e.setEnabled(false);
            return;
        }
        this.f81577d.setEnabled(true);
        this.f81578e.setEnabled(true);
        this.f81585l = new CheckedTextView[this.f81580g.size()][];
        boolean zH = h();
        for (int i10 = 0; i10 < this.f81580g.size(); i10++) {
            i0.a aVar = (i0.a) this.f81580g.get(i10);
            boolean zG = g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f81585l;
            int i11 = aVar.f95408a;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            c[] cVarArr = new c[i11];
            for (int i12 = 0; i12 < aVar.f95408a; i12++) {
                cVarArr[i12] = new c(aVar, i12);
            }
            Comparator comparator = this.f81587n;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                if (i13 == 0) {
                    addView(this.f81576c.inflate(R$layout.f81486a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f81576c.inflate((zG || zH) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f81575b);
                checkedTextView.setText(this.f81584k.a(cVarArr[i13].a()));
                checkedTextView.setTag(cVarArr[i13]);
                if (aVar.h(i13)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f81579f);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f81585l[i10][i13] = checkedTextView;
                addView(checkedTextView);
            }
        }
        i();
    }

    public boolean getIsDisabled() {
        return this.f81586m;
    }

    public Map<n9.f0, n9.g0> getOverrides() {
        return this.f81581h;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f81582i != z10) {
            this.f81582i = z10;
            j();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f81583j != z10) {
            this.f81583j = z10;
            if (!z10 && this.f81581h.size() > 1) {
                Map mapB = b(this.f81581h, this.f81580g, false);
                this.f81581h.clear();
                this.f81581h.putAll(mapB);
            }
            j();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f81577d.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(yb.l lVar) {
        this.f81584k = (yb.l) q9.a.e(lVar);
        j();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f81575b = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f81576c = layoutInflaterFrom;
        b bVar = new b();
        this.f81579f = bVar;
        this.f81584k = new yb.e(getResources());
        this.f81580g = new ArrayList();
        this.f81581h = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f81577d = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R$string.f81517x);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(R$layout.f81486a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f81578e = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R$string.f81516w);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
