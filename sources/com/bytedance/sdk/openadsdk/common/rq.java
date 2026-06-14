package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes6.dex */
public class rq {
    private com.bytedance.sdk.openadsdk.core.widget.jpc lnr;
    private com.bytedance.sdk.openadsdk.core.widget.yt mml;
    private com.bytedance.sdk.openadsdk.core.mo.jpc mzz;
    protected View qdl = mzz();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected Context f16984ud;

    public rq(Context context) {
        this.f16984ud = context;
    }

    private View mzz() {
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(this.f16984ud);
        mzzVar.setGravity(1);
        mzzVar.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.yt ytVar = new com.bytedance.sdk.openadsdk.core.widget.yt(this.f16984ud);
        this.mml = ytVar;
        ytVar.setId(520093745);
        int iUd = ax.ud(this.f16984ud, 64.0f);
        mzzVar.addView(this.mml, new LinearLayout.LayoutParams(iUd, iUd));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(this.f16984ud);
        this.mzz = jpcVar;
        jpcVar.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ax.ud(this.f16984ud, 219.0f), -2);
        layoutParams.topMargin = ax.ud(this.f16984ud, 16.0f);
        this.mzz.setLayoutParams(layoutParams);
        this.mzz.setEllipsize(TextUtils.TruncateAt.END);
        this.mzz.setGravity(17);
        this.mzz.setMaxWidth(ax.ud(this.f16984ud, 150.0f));
        this.mzz.setMaxLines(2);
        this.mzz.setTextColor(-1);
        this.mzz.setTextSize(1, 16.0f);
        mzzVar.addView(this.mzz);
        this.lnr = new com.bytedance.sdk.openadsdk.core.widget.jpc(this.f16984ud);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ax.ud(this.f16984ud, 219.0f), ax.ud(this.f16984ud, 6.0f));
        layoutParams2.topMargin = ax.ud(this.f16984ud, 32.0f);
        mzzVar.addView(this.lnr, layoutParams2);
        return mzzVar;
    }

    public com.bytedance.sdk.openadsdk.core.mo.jpc lnr() {
        return this.mzz;
    }

    public void mml() {
        this.qdl = null;
        this.f16984ud = null;
    }

    public View qdl() {
        return this.qdl;
    }

    public com.bytedance.sdk.openadsdk.core.widget.yt ud() {
        return this.mml;
    }

    public void qdl(int i10) {
        this.lnr.setProgress(i10);
    }
}
