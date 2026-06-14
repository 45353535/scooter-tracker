package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;

/* JADX INFO: loaded from: classes6.dex */
public class rq extends fs {
    public rq(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        super(qdlVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.fs
    protected boolean qdl() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.fs
    public void qdl(int i10, int i11) {
        super.qdl(i10, i11);
        if (ljh.mzz(this.mml) && this.mml.fzn() == 3 && this.mml.gg() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.lnr.ax.findViewById(jtx.to);
                frameLayout.setBackgroundColor(Color.parseColor(POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR));
                if (this.mml.jb() == 1) {
                    int iUd = ax.ud(yt.qdl(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = iUd;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
