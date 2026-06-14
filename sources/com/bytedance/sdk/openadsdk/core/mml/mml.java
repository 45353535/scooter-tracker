package com.bytedance.sdk.openadsdk.core.mml;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.bch.ud.mzz;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp.aaj;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes6.dex */
public class mml extends com.bytedance.sdk.openadsdk.core.mo.lnr {
    private int jpc;
    protected ljh lnr;
    protected AdSlot mml;
    protected String mo;
    protected PAGBannerAdWrapperListener mzz;
    protected final Context qdl;
    private boolean tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected aaj f17303ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    protected boolean f17304wd;

    public mml(@NonNull Context context, ljh ljhVar, AdSlot adSlot, boolean z10) {
        super(context);
        this.mo = "banner_ad";
        this.f17304wd = false;
        this.jpc = -1;
        this.tvp = false;
        if (ljhVar != null && ljhVar.dk() != 2) {
            ljhVar.bjy(1);
        }
        this.f17304wd = z10;
        this.qdl = context;
        this.lnr = ljhVar;
        this.mml = adSlot;
        lnr();
        AdSlot adSlot2 = this.mml;
        if (adSlot2 != null) {
            qdl(adSlot2.getExpressViewAcceptedWidth(), this.mml.getExpressViewAcceptedHeight());
        }
    }

    public aaj getCurView() {
        return this.f17303ud;
    }

    protected void lnr() {
        aaj aajVar = new aaj(this.qdl, this.lnr, this.mml, this.mo) { // from class: com.bytedance.sdk.openadsdk.core.mml.mml.1
            @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj
            protected mzz.qdl lnr(int i10) {
                return mml.this.qdl(super.lnr(i10));
            }
        };
        this.f17303ud = aajVar;
        addView(aajVar, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.mzz;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    public void mml() {
        if (this.f17303ud != null) {
            com.bytedance.sdk.openadsdk.core.tvp.ud().mo(this.f17303ud.getClosedListenerKey());
            removeView(this.f17303ud);
            this.f17303ud.fs();
            this.f17303ud = null;
        }
        com.bytedance.sdk.openadsdk.core.tvp.ud().jyq();
    }

    public void mzz() {
        aaj aajVar = this.f17303ud;
        if (aajVar != null) {
            aajVar.exc();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17303ud == null) {
            lnr();
        }
        com.bytedance.sdk.openadsdk.utils.mml.qdl(this, this.lnr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setCurrentIndex(int i10) {
        this.jpc = i10;
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.mzz = pAGBannerAdWrapperListener;
        aaj aajVar = this.f17303ud;
        if (aajVar != null) {
            aajVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.mzz() { // from class: com.bytedance.sdk.openadsdk.core.mml.mml.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.mzz
                public void qdl() {
                    mml.this.mzz.onAdClicked();
                }
            });
            this.f17303ud.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.mml.mml.3
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2;
                    ljh ljhVar = mml.this.lnr;
                    if (ljhVar == null || !ljhVar.vxm() || (pAGBannerAdWrapperListener2 = mml.this.mzz) == null) {
                        return;
                    }
                    pAGBannerAdWrapperListener2.onAdClicked();
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i10) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i10) {
                    mml mmlVar = mml.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = mmlVar.mzz;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderFail(mmlVar, str, i10);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f10, float f11) {
                    aaj aajVar2 = mml.this.f17303ud;
                    if (aajVar2 != null) {
                        aajVar2.setSoundMute(true);
                        if (com.bytedance.sdk.openadsdk.core.rq.mml.qdl(mml.this.f17303ud.getDynamicShowType())) {
                            mml mmlVar = mml.this;
                            AdSlot adSlot = mmlVar.mml;
                            if (adSlot != null) {
                                mmlVar.qdl(adSlot.getExpressViewAcceptedWidth(), mml.this.mml.getExpressViewAcceptedHeight());
                            }
                        } else {
                            mml.this.qdl(f10, f11);
                        }
                    }
                    if (mml.this.tvp) {
                        mml.this.f17303ud.jl();
                    }
                    mml mmlVar2 = mml.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = mmlVar2.mzz;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderSuccess(mmlVar2, f10, f11);
                    }
                }
            });
        }
    }

    public void setIsShow(boolean z10) {
        this.tvp = z10;
    }

    protected mzz.qdl qdl(mzz.qdl qdlVar) {
        int i10;
        if (this.f17304wd && (i10 = this.jpc) >= 0) {
            qdlVar.f16937ud = i10;
        }
        return qdlVar;
    }

    protected void qdl(float f10, float f11) {
        int iUd = ax.ud(this.qdl, f10);
        int iUd2 = ax.ud(this.qdl, f11);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iUd, iUd2);
        }
        layoutParams.width = iUd;
        layoutParams.height = iUd2;
        setLayoutParams(layoutParams);
    }
}
