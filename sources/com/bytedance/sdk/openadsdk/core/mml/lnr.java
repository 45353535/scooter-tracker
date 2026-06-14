package com.bytedance.sdk.openadsdk.core.mml;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.bch.ud.mzz;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp.aaj;
import com.bytedance.sdk.openadsdk.core.tvp.exc;

/* JADX INFO: loaded from: classes6.dex */
public class lnr extends mml {
    private com.bytedance.sdk.openadsdk.qdl.qdl.ud jpc;
    private int to;
    private int tvp;

    public lnr(@NonNull Context context, ljh ljhVar, AdSlot adSlot, boolean z10) {
        super(context, ljhVar, adSlot, z10);
        this.tvp = 1;
        this.to = -1;
    }

    public com.bytedance.sdk.openadsdk.multipro.ud.qdl getVideoModel() {
        aaj aajVar = this.f17303ud;
        if (aajVar != null) {
            return ((exc) aajVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mml.mml
    protected void lnr() {
        exc excVar = new exc(this.qdl, this.lnr, this.mml, this.mo, this.f17304wd) { // from class: com.bytedance.sdk.openadsdk.core.mml.lnr.1
            @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj
            protected mzz.qdl lnr(int i10) {
                return lnr.this.qdl(super.lnr(i10));
            }
        };
        this.f17303ud = excVar;
        com.bytedance.sdk.openadsdk.core.exu.ud.lnr videoController = excVar.getVideoController();
        if (videoController != null) {
            videoController.mml(this.tvp);
        }
        addView(this.f17303ud, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.mzz;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
        aaj aajVar = this.f17303ud;
        if (aajVar != null) {
            ((exc) aajVar).setVideoAdListener(new com.bytedance.sdk.openadsdk.qdl.ud.lnr() { // from class: com.bytedance.sdk.openadsdk.core.mml.lnr.2
                @Override // com.bytedance.sdk.openadsdk.qdl.ud.lnr
                public void lnr(PAGNativeAd pAGNativeAd) {
                    if (lnr.this.jpc != null) {
                        lnr.this.jpc.qdl();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.qdl.ud.lnr
                public void qdl(int i10, int i11) {
                }

                @Override // com.bytedance.sdk.openadsdk.qdl.ud.lnr
                public void ud(PAGNativeAd pAGNativeAd) {
                }

                @Override // com.bytedance.sdk.openadsdk.qdl.ud.lnr
                public void qdl(PAGNativeAd pAGNativeAd) {
                    if (lnr.this.to == 3) {
                        lnr lnrVar = lnr.this;
                        lnrVar.qdl(lnrVar.jpc);
                    } else if (lnr.this.to == 2) {
                        lnr.this.qdl();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mml.mml
    public void mml() {
        com.bytedance.sdk.openadsdk.core.exu.ud.lnr videoController;
        aaj aajVar = this.f17303ud;
        if ((aajVar instanceof exc) && (videoController = ((exc) aajVar).getVideoController()) != null) {
            this.tvp = videoController.ax();
        }
        super.mml();
    }

    public void qdl(com.bytedance.sdk.openadsdk.qdl.qdl.ud udVar) {
        aaj aajVar = this.f17303ud;
        if (aajVar != null) {
            ((exc) aajVar).jtx();
            this.jpc = udVar;
            this.to = 3;
        }
    }

    public void ud() {
        aaj aajVar = this.f17303ud;
        if (aajVar != null) {
            ((exc) aajVar).yt();
        }
    }

    public void qdl() {
        aaj aajVar = this.f17303ud;
        if (aajVar != null) {
            ((exc) aajVar).bjy();
            this.to = 2;
        }
    }
}
