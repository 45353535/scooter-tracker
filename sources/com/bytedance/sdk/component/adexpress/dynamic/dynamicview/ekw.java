package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes6.dex */
public class ekw extends mo implements com.bytedance.sdk.component.adexpress.dynamic.mzz {
    boolean aaj;
    TextView qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    FrameLayout f16309ud;

    public ekw(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        this.aaj = false;
        View view = new View(context);
        this.bjy = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.qdl = new TextView(context);
        this.f16309ud = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.qdl.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.qdl.setBackground(gradientDrawable);
        this.qdl.setTextSize(10.0f);
        this.qdl.setGravity(17);
        this.qdl.setTextColor(-1);
        this.qdl.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.mml.ud()) {
            addView(this.f16309ud, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.qdl);
        addView(this.bjy, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.mml.ud()) {
            addView(this.f16309ud, getWidgetLayoutParams());
        }
        dynamicRootView.videoView = this.f16309ud;
        dynamicRootView.setVideoListener(this);
    }

    private void lnr(View view) {
        if (view == this.qdl || view == ((mo) this).exc) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.qdl.mo)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i10 = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i10 >= viewGroup.getChildCount()) {
                return;
            }
            lnr(viewGroup.getChildAt(i10));
            i10++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz
    public boolean mzz() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mzz
    public void qdl() {
        this.qdl.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mzz
    public void setTimeUpdate(int i10) {
        if (!this.exu.to().mzz().hr() || i10 <= 0 || this.aaj) {
            this.aaj = true;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                lnr(getChildAt(i11));
            }
            this.qdl.setVisibility(8);
            return;
        }
        String str = (i10 >= 60 ? "0" + (i10 / 60) : "00") + StringUtils.PROCESS_POSTFIX_DELIMITER;
        int i12 = i10 % 60;
        this.qdl.setText(i12 > 9 ? str + i12 : str + "0" + i12);
        this.qdl.setVisibility(0);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        super.tvp();
        double dMzz = 0.0d;
        double dMml = 0.0d;
        for (com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVarFs = this.exu; jpcVarFs != null; jpcVarFs = jpcVarFs.fs()) {
            double dMo = dMml + ((double) jpcVarFs.mo());
            double dWd = dMzz + ((double) jpcVarFs.wd());
            dMml = dMo - ((double) jpcVarFs.mml());
            dMzz = dWd - ((double) jpcVarFs.mzz());
        }
        try {
            float f10 = (float) dMml;
            int iQdl = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), f10);
            int iQdl2 = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), f10 + this.mzz);
            if (com.bytedance.sdk.component.adexpress.mml.ud.qdl(getContext())) {
                int dynamicWidth = ((jl) this.rdp.getChildAt(0)).getDynamicWidth();
                int i10 = dynamicWidth - iQdl2;
                iQdl2 = dynamicWidth - iQdl;
                iQdl = i10;
            }
            if ("open_ad".equals(this.rdp.getRenderRequest().mml())) {
                this.rdp.videoView = this.f16309ud;
            } else {
                float f11 = (float) dMzz;
                ((jl) this.rdp.getChildAt(0)).qdl.qdl(iQdl, (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), f11), iQdl2, (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), f11 + this.mo));
            }
        } catch (Exception unused) {
        }
        this.rdp.updateRenderInfoForVideo(dMml, dMzz, this.mzz, this.mo, this.fs.bjy());
        return true;
    }
}
