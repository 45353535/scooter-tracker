package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes6.dex */
public class rq extends FrameLayout {
    private String jpc;
    private TextView lnr;
    private jtx mml;
    private com.bytedance.sdk.openadsdk.core.mo.jpc mo;
    private PAGLogoView mzz;
    private boolean qdl;
    private com.bytedance.sdk.openadsdk.core.lnr.qdl tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private yt f17579ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private ljh f17580wd;

    public rq(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.jtx.ew);
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar) {
        this.tvp = qdlVar;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            qdl();
        }
    }

    private void ud() {
        Context context = getContext();
        boolean z10 = this.f17580wd.jb() == 1;
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setGravity(1);
        mzzVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z10 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(ax.ud(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iUd = ax.ud(context, 24.0f);
        layoutParams.rightMargin = iUd;
        layoutParams.leftMargin = iUd;
        addView(mzzVar, layoutParams);
        yt ytVar = new yt(context);
        this.f17579ud = ytVar;
        ytVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ax.ud(context, 80.0f), ax.ud(context, 80.0f));
        layoutParams2.bottomMargin = ax.ud(context, 12.0f);
        mzzVar.addView(this.f17579ud, layoutParams2);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.lnr = jpcVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        jpcVar.setEllipsize(truncateAt);
        this.lnr.setGravity(17);
        this.lnr.setMaxLines(2);
        this.lnr.setMaxWidth(ax.ud(context, 180.0f));
        this.lnr.setTextColor(-1);
        this.lnr.setTextSize(2, 24.0f);
        mzzVar.addView(this.lnr, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar2 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.mo = jpcVar2;
        jpcVar2.setEllipsize(truncateAt);
        this.mo.setGravity(17);
        this.mo.setMaxLines(2);
        this.mo.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.mo.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = ax.ud(context, 8.0f);
        mzzVar.addView(this.mo, layoutParams3);
        this.mml = new jtx(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, ax.ud(context, 16.0f));
        layoutParams4.topMargin = ax.ud(context, 12.0f);
        this.mml.setVisibility(8);
        mzzVar.addView(this.mml, layoutParams4);
        this.mzz = PAGLogoView.createPAGLogoViewByMaterial(context, this.f17580wd);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, ax.ud(context, 14.0f));
        layoutParams5.gravity = 8388691;
        layoutParams5.leftMargin = ax.ud(context, 18.0f);
        if (z10) {
            layoutParams5.bottomMargin = ax.ud(context, 61.0f);
        } else {
            layoutParams5.bottomMargin = ax.ud(context, 24.0f);
        }
        addView(this.mzz, layoutParams5);
    }

    public void qdl(ljh ljhVar, String str, com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar) {
        this.f17580wd = ljhVar;
        this.jpc = str;
        this.tvp = qdlVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void qdl() {
        if (this.qdl) {
            return;
        }
        this.qdl = true;
        ud();
        if (this.f17579ud != null && this.f17580wd.hcs() != null && !TextUtils.isEmpty(this.f17580wd.hcs().qdl())) {
            com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.f17580wd.hcs(), this.f17579ud, this.f17580wd);
        }
        jtx jtxVar = this.mml;
        if (jtxVar != null) {
            ax.qdl((TextView) null, jtxVar, this.f17580wd);
            if (this.f17580wd.fhs() != null) {
                this.mml.setVisibility(0);
            }
        }
        if (this.lnr != null) {
            if (this.f17580wd.fhs() != null && !TextUtils.isEmpty(this.f17580wd.fhs().ud())) {
                this.lnr.setText(this.f17580wd.fhs().ud());
            } else if (!TextUtils.isEmpty(this.f17580wd.ca())) {
                this.lnr.setText(this.f17580wd.ca());
            } else {
                this.lnr.setVisibility(8);
            }
        }
        if (this.mo != null) {
            String strGsv = this.f17580wd.gsv();
            if (!TextUtils.isEmpty(strGsv)) {
                this.mo.setText(strGsv);
            } else {
                this.mo.setVisibility(8);
            }
        }
        this.mzz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.rq.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.qdl(rq.this.getContext(), rq.this.f17580wd, rq.this.jpc);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
