package com.bytedance.sdk.openadsdk.lnr;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes6.dex */
public class rq extends View {
    private final int qdl;

    public rq(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(getMeasuredWidth(), this.qdl);
    }

    public rq(Context context, int i10) {
        super(context);
        setBackgroundColor(i10);
        this.qdl = ax.ud(getContext(), 0.66f);
    }
}
