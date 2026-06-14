package com.bytedance.sdk.component.adexpress.dynamic.lnr;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.mo.oth;

/* JADX INFO: loaded from: classes6.dex */
public class mml extends yt<com.bytedance.sdk.component.adexpress.mo.wd> {
    public mml(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar) {
        super(context, mzzVar, wdVar);
        qdl(wdVar);
    }

    private void qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar) {
        this.qdl = new com.bytedance.sdk.component.adexpress.mo.wd(this.f16361ud);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.f16361ud, wdVar.wak());
        this.qdl.setLayoutParams(layoutParams);
        this.qdl.setSlideText(this.mml.jjk());
        oth othVar = this.qdl;
        if (othVar instanceof com.bytedance.sdk.component.adexpress.mo.wd) {
            ((com.bytedance.sdk.component.adexpress.mo.wd) othVar).setButtonText(this.mml.to());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.yt
    protected void mml() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.yt, com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public void ud() {
        this.qdl.ud();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.yt, com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public void qdl() {
        this.qdl.qdl();
    }
}
