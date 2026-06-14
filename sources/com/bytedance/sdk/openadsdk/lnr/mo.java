package com.bytedance.sdk.openadsdk.lnr;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class mo extends ScrollView {
    private final to qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.mo.mzz f17621ud;

    public mo(Context context, to toVar) {
        super(context);
        this.qdl = toVar;
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        this.f17621ud = mzzVar;
        mzzVar.setOrientation(1);
        addView(mzzVar, new FrameLayout.LayoutParams(-1, -2));
        if (toVar.jpc() == 0) {
            qdl();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    private static List<FilterWord> lnr(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i10 = 0;
        int i11 = -1;
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (list.get(i12).hasSecondOptions()) {
                i11 = i12;
            }
        }
        if (i11 != -1 && i11 <= list.size()) {
            i10 = i11;
        }
        FilterWord filterWord = list.get(i10);
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            FilterWord next = it.next();
            if (!next.hasSecondOptions()) {
                filterWord.addOption(next);
                it.remove();
            }
        }
        return list;
    }

    private void qdl() {
        if (this.qdl.jpc() != 0) {
            return;
        }
        this.qdl.qdl(ax.lnr(getContext()), ax.mzz(getContext()));
    }

    private void ud(List<FilterWord> list) {
        this.f17621ud.removeAllViews();
        for (int i10 = 0; i10 < list.size(); i10++) {
            FilterWord filterWord = list.get(i10);
            if (filterWord != null) {
                this.f17621ud.addView(new wd(getContext(), filterWord, this.qdl));
            }
            if (i10 < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int iUd = ax.ud(getContext(), this.qdl.tvp() ? 16.0f : 8.0f);
                layoutParams.topMargin = iUd;
                layoutParams.bottomMargin = iUd;
                this.f17621ud.addView(new rq(getContext()), layoutParams);
            }
        }
    }

    public void qdl(List<FilterWord> list) {
        List<FilterWord> listLnr = lnr(list);
        if (listLnr == null) {
            return;
        }
        ud(listLnr);
    }
}
