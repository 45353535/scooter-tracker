package com.appodeal.ads.utils.debug;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.TestActivity;
import com.appodeal.ads.j2;
import com.appodeal.ads.modules.common.internal.adtype.AdType;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends ArrayAdapter {
    public a(TestActivity testActivity) {
        super(testActivity, -1);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return AdType.values().length;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setLayoutParams(new AbsListView.LayoutParams(-1, Math.round(j2.t(getContext()) * 48.0f)));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setExitFadeDuration(200);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, new ColorDrawable(-1692651));
        stateListDrawable.addState(new int[0], new ColorDrawable(-1));
        relativeLayout.setBackground(stateListDrawable);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Math.round(j2.t(getContext()) * 48.0f), -2);
        layoutParams.addRule(15);
        textView.setLayoutParams(layoutParams);
        textView.setText(String.valueOf(i10 + 1));
        textView.setTextSize(16.0f);
        textView.setGravity(17);
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{-16842919}, new int[]{R.attr.state_pressed}}, new int[]{Color.parseColor("#212121"), -1}));
        textView.setId(View.generateViewId());
        TextView textView2 = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, textView.getId());
        textView2.setLayoutParams(layoutParams2);
        textView2.setTextSize(16.0f);
        textView2.setTextColor(new ColorStateList(new int[][]{new int[]{-16842919}, new int[]{R.attr.state_pressed}}, new int[]{Color.parseColor("#212121"), -1}));
        textView2.setGravity(16);
        if (Appodeal.isInitialized(AdType.values()[i10].getCode())) {
            textView2.setText(AdType.values()[i10].getDisplayName());
        } else {
            textView2.setText(AdType.values()[i10].getDisplayName() + " (Isn't Initialized)");
            textView.setTextColor(Color.parseColor("#50000000"));
            textView2.setTextColor(Color.parseColor("#50000000"));
        }
        relativeLayout.addView(textView);
        relativeLayout.addView(textView2);
        return relativeLayout;
    }
}
