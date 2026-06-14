package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class oth extends mo implements com.bytedance.sdk.component.adexpress.dynamic.lnr {
    private int aaj;
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16329ud;

    public oth(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        qdl();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz
    public void mo() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i10 = this.tvp;
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = this.to;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.aaj == 0) {
            setMeasuredDimension(this.f16329ud, this.jpc);
        } else {
            setMeasuredDimension(this.qdl, this.jpc);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr
    public void qdl(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        this.aaj = i10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        setBackground(getBackgroundDrawable());
        setPadding((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), this.fs.lnr()), (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), this.fs.ud()), (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), this.fs.mml()), (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), this.fs.qdl()));
        return true;
    }

    private void qdl() {
        List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> listRq = this.exu.rq();
        if (listRq == null || listRq.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar : listRq) {
            if (jpcVar.to().qdl() == 21) {
                this.qdl = (int) (this.f16328wd - com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, jpcVar.jpc()));
            }
            if (jpcVar.to().qdl() == 20) {
                this.f16329ud = (int) (this.f16328wd - com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, jpcVar.jpc()));
            }
        }
    }
}
