package com.appodeal.ads.utils.debug;

import android.app.Activity;
import android.graphics.Color;
import android.text.Html;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends ArrayAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ boolean f14987e = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f14990d;

    public f(Activity activity, List list) {
        super(activity, -1, list);
        this.f14990d = new c(this);
        this.f14988b = new ArrayList(list);
        this.f14989c = (int) TypedValue.applyDimension(1, 8.0f, activity.getResources().getDisplayMetrics());
    }

    public final void a(int i10) {
        if (i10 == 0) {
            sort(new d());
        } else {
            if (i10 != 1) {
                return;
            }
            sort(new e());
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return this.f14990d;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        r rVar = (r) getItem(i10);
        if (!f14987e && rVar == null) {
            throw new AssertionError();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        int i11 = this.f14989c;
        linearLayout.setPadding(i11, i11, i11, i11);
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView.setTextSize(22.0f);
        textView.setTextColor(-1);
        textView.setText(rVar.f15009b);
        linearLayout.addView(textView);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(5);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        TextView textView2 = new TextView(getContext());
        textView2.setLayoutParams(layoutParams);
        textView2.setText(Html.fromHtml("№ <b>" + rVar.f15008a + "</b>"));
        textView2.setTextSize(16.0f);
        textView2.setGravity(5);
        textView2.setTextColor(Color.parseColor("#B3ffffff"));
        textView2.setPadding(0, 0, this.f14989c, 0);
        linearLayout2.addView(textView2);
        TextView textView3 = new TextView(getContext());
        textView3.setLayoutParams(layoutParams);
        textView3.setText(Html.fromHtml("cid: <b>" + rVar.f15011d + "</b>"));
        textView3.setTextSize(16.0f);
        textView3.setTextColor(Color.parseColor("#B3ffffff"));
        textView3.setGravity(5);
        textView3.setPadding(0, 0, this.f14989c, 0);
        linearLayout2.addView(textView3);
        TextView textView4 = new TextView(getContext());
        textView4.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView4.setGravity(5);
        textView4.setText(Html.fromHtml("ecpm: <b>" + new DecimalFormat("#.##").format(rVar.f15012e) + "</b>"));
        textView4.setTextSize(16.0f);
        textView4.setTextColor(Color.parseColor("#B3ffffff"));
        linearLayout2.addView(textView4);
        if (rVar.f15013f) {
            TextView textView5 = new TextView(getContext());
            textView5.setText(Html.fromHtml("<b><i>(precache)</i></b>"));
            textView5.setTextSize(16.0f);
            textView5.setGravity(5);
            textView5.setTextColor(Color.parseColor("#B3ffffff"));
            textView5.setLayoutParams(layoutParams);
            linearLayout2.addView(textView5);
            textView4.setPadding(0, 0, this.f14989c, 0);
            linearLayout.setBackgroundColor(Color.parseColor("#1A000000"));
        }
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }
}
