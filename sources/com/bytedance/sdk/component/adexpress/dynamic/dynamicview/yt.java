package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public class yt extends mo {
    private TextView aaj;
    private TextView jyq;
    private LinearLayout ljh;
    private TextView oth;
    private TextView qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private TextView f16335ud;

    public yt(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        this.qdl = new TextView(this.rq);
        this.f16335ud = new TextView(this.rq);
        this.aaj = new TextView(this.rq);
        this.ljh = new LinearLayout(this.rq);
        this.jyq = new TextView(this.rq);
        this.oth = new TextView(this.rq);
        this.qdl.setTag(9);
        this.f16335ud.setTag(10);
        this.aaj.setTag(12);
        this.ljh.addView(this.aaj);
        this.ljh.addView(this.oth);
        this.ljh.addView(this.f16335ud);
        this.ljh.addView(this.jyq);
        this.ljh.addView(this.qdl);
        addView(this.ljh, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.f16328wd, this.jpc);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz
    protected boolean mml() {
        this.qdl.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.qdl.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.f16335ud.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f16335ud.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.aaj.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.aaj.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        this.aaj.setText("Function");
        this.f16335ud.setText("Permission list");
        this.jyq.setText(" | ");
        this.oth.setText(" | ");
        this.qdl.setText("Privacy policy");
        com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar = this.fs;
        if (wdVar != null) {
            this.aaj.setTextColor(wdVar.wd());
            this.aaj.setTextSize(this.fs.mzz());
            this.f16335ud.setTextColor(this.fs.wd());
            this.f16335ud.setTextSize(this.fs.mzz());
            this.jyq.setTextColor(this.fs.wd());
            this.oth.setTextColor(this.fs.wd());
            this.qdl.setTextColor(this.fs.wd());
            this.qdl.setTextSize(this.fs.mzz());
            return false;
        }
        this.aaj.setTextColor(-1);
        this.aaj.setTextSize(12.0f);
        this.f16335ud.setTextColor(-1);
        this.f16335ud.setTextSize(12.0f);
        this.jyq.setTextColor(-1);
        this.oth.setTextColor(-1);
        this.qdl.setTextColor(-1);
        this.qdl.setTextSize(12.0f);
        return false;
    }
}
