package com.bytedance.sdk.openadsdk.rdp;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.yt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class to extends com.bytedance.sdk.openadsdk.core.mo.lnr {
    protected yt lnr;
    protected com.bytedance.sdk.openadsdk.core.mo.jpc mml;
    protected com.bytedance.sdk.openadsdk.core.mo.jpc mo;
    protected com.bytedance.sdk.openadsdk.core.mo.jpc mzz;
    protected com.bytedance.sdk.openadsdk.core.mo.lnr qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.mo.mml f17811ud;

    public to(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        qdl(context);
    }

    public FrameLayout getTtAdContainer() {
        return this.qdl;
    }

    public TextView getTtFullAdAppName() {
        return this.mml;
    }

    public TextView getTtFullAdDesc() {
        return this.mzz;
    }

    public TextView getTtFullAdDownload() {
        return this.mo;
    }

    public yt getTtFullAdIcon() {
        return this.lnr;
    }

    public ImageView getTtFullImg() {
        return this.f17811ud;
    }

    protected PAGLogoView jpc(Context context) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.setId(520093739);
        return pAGLogoView;
    }

    protected com.bytedance.sdk.openadsdk.core.mo.jpc lnr(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar.setEllipsize(TextUtils.TruncateAt.END);
        jpcVar.setMaxLines(1);
        jpcVar.setSingleLine();
        jpcVar.setTextColor(Color.parseColor("#FF999999"));
        jpcVar.setTextSize(2, 12.0f);
        return jpcVar;
    }

    protected com.bytedance.sdk.openadsdk.core.mo.jpc mml(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar.setBackground(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_backup_btn_1"));
        jpcVar.setGravity(17);
        jpcVar.setText(ljh.qdl(context, "tt_video_download_apk"));
        jpcVar.setTextColor(-1);
        jpcVar.setTextSize(2, 14.0f);
        return jpcVar;
    }

    protected com.bytedance.sdk.openadsdk.core.mo.mml mo(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        mmlVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return mmlVar;
    }

    protected com.bytedance.sdk.openadsdk.core.mo.lnr mzz(Context context) {
        return new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
    }

    protected abstract void qdl(Context context);

    protected com.bytedance.sdk.openadsdk.core.mo.jpc ud(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar.setEllipsize(TextUtils.TruncateAt.END);
        jpcVar.setMaxLines(1);
        jpcVar.setTextColor(Color.parseColor("#FF999999"));
        jpcVar.setTextSize(2, 16.0f);
        return jpcVar;
    }

    protected yt wd(Context context) {
        yt ytVar = new yt(context);
        ytVar.setScaleType(ImageView.ScaleType.FIT_XY);
        ytVar.setBackgroundColor(0);
        return ytVar;
    }
}
