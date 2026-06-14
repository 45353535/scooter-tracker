package com.bytedance.sdk.openadsdk.qdl.ud;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr;
import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.exu.ud.mo;
import com.bytedance.sdk.openadsdk.core.jtx;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.multipro.ud.qdl;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends jpc implements lnr.InterfaceC0200lnr, lnr.mml, qdl.InterfaceC0295qdl {
    private long exu;
    private AdSlot fs;
    private lnr jpc;
    private boolean rq;
    private boolean to;
    private final com.bytedance.sdk.openadsdk.multipro.ud.qdl tvp;

    public ud(@NonNull Context context, @NonNull ljh ljhVar, int i10, AdSlot adSlot) {
        super(context, ljhVar, i10, true);
        this.to = false;
        this.rq = true;
        this.mzz = i10;
        this.fs = adSlot;
        this.tvp = new com.bytedance.sdk.openadsdk.multipro.ud.qdl();
        qdl(this.mo);
        qdl("embeded_ad");
        this.mml.qdl(this);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0200lnr
    public void e_() {
        lnr lnrVar = this.jpc;
        if (lnrVar != null) {
            lnrVar.qdl(this);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0200lnr
    public void f_() {
        lnr lnrVar = this.jpc;
        if (lnrVar != null) {
            lnrVar.ud(this);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0200lnr
    public void g_() {
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0200lnr
    public void h_() {
        lnr lnrVar = this.jpc;
        if (lnrVar != null) {
            lnrVar.lnr(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ud.qdl.InterfaceC0295qdl
    public com.bytedance.sdk.openadsdk.multipro.ud.qdl mo() {
        return this.tvp;
    }

    public View mzz() {
        com.bytedance.sdk.openadsdk.core.exu.ud.mo moVar;
        ljh ljhVar = this.f17797ud;
        if (ljhVar != null && this.lnr != null) {
            if (ljh.mzz(ljhVar)) {
                try {
                    moVar = new com.bytedance.sdk.openadsdk.core.exu.ud.mo(this.lnr, this.f17797ud, this.qdl.qdl());
                    ljh ljhVar2 = this.f17797ud;
                    if (ljhVar2 != null && ljhVar2.uj()) {
                        com.bytedance.sdk.openadsdk.core.fs.mo moVarQdl = moVar.qdl((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        qdl qdlVar = this.mml;
                        if (qdlVar != null) {
                            qdlVar.qdl(moVarQdl);
                        }
                    }
                    this.qdl.qdl(moVar.getNativeVideoController());
                    qdl qdlVar2 = this.mml;
                    if (qdlVar2 != null) {
                        qdlVar2.qdl(moVar);
                    }
                    moVar.setVideoAdClickListenerTTNativeAd(this);
                    moVar.setAdCreativeClickListener(new mo.qdl() { // from class: com.bytedance.sdk.openadsdk.qdl.ud.ud.1
                        @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo.qdl
                        public void qdl(View view, int i10) {
                            jtx jtxVar = ud.this.qdl;
                            if (jtxVar != null) {
                                jtxVar.qdl(view, i10);
                            }
                        }
                    });
                    moVar.setControllerStatusCallBack(new mo.ud() { // from class: com.bytedance.sdk.openadsdk.qdl.ud.ud.2
                        @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo.ud
                        public void qdl(boolean z10, long j10, long j11, long j12, boolean z11) {
                            ud.this.tvp.qdl = z10;
                            ud.this.tvp.mzz = j10;
                            ud.this.tvp.mo = j11;
                            ud.this.tvp.f17775wd = j12;
                            ud.this.tvp.mml = z11;
                        }
                    });
                    moVar.setVideoAdLoadListener(this);
                    moVar.setVideoAdInteractionListener(this);
                    if (5 == this.mzz) {
                        moVar.setIsAutoPlay(this.to ? this.fs.isAutoPlay() : this.rq);
                    } else {
                        moVar.setIsAutoPlay(this.rq);
                    }
                    moVar.qdl(yt.mml().lnr(String.valueOf(this.mo)), "feedGetAdView");
                } catch (Exception e10) {
                    ApmHelper.reportCustomError("", "getAdView null", e10);
                    moVar = null;
                }
                if (!ljh.mzz(this.f17797ud) && moVar != null && moVar.qdl(0L, true, false)) {
                    return moVar;
                }
                ApmHelper.reportCustomError(this.f17797ud.vxg() + StringUtils.COMMA + moVar, "getAdView null", new RuntimeException());
            } else {
                moVar = null;
                if (!ljh.mzz(this.f17797ud)) {
                }
                ApmHelper.reportCustomError(this.f17797ud.vxg() + StringUtils.COMMA + moVar, "getAdView null", new RuntimeException());
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.ud.jpc, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
        qdl qdlVar = this.mml;
        if (qdlVar != null) {
            qdlVar.fs();
        }
    }

    private void qdl(int i10) {
        int iUd = yt.mml().ud(i10);
        int iLnr = jl.lnr(yt.qdl());
        if (3 == iUd) {
            this.to = false;
            this.rq = false;
        } else {
            if (1 == iUd && gy.mml(iLnr)) {
                this.to = false;
            } else if (2 == iUd) {
                if (gy.mzz(iLnr) || gy.mml(iLnr) || gy.mo(iLnr)) {
                    this.to = false;
                }
            } else if (4 == iUd) {
                this.to = true;
            } else if (5 == iUd && (gy.mml(iLnr) || gy.mo(iLnr))) {
            }
            this.rq = true;
        }
        qdl qdlVar = this.mml;
        if (qdlVar != null) {
            qdlVar.qdl(this.to);
        }
    }

    public ud(@NonNull Context context, @NonNull ljh ljhVar, int i10, AdSlot adSlot, qdl qdlVar, jtx jtxVar) {
        super(context, ljhVar, i10, false);
        this.to = false;
        this.rq = true;
        this.mml = qdlVar;
        this.qdl = jtxVar;
        this.mzz = i10;
        this.fs = adSlot;
        this.tvp = new com.bytedance.sdk.openadsdk.multipro.ud.qdl();
        qdl(this.mo);
        qdl("embeded_ad");
        qdlVar.qdl(this);
    }

    public void qdl(lnr lnrVar) {
        this.jpc = lnrVar;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.mml
    public void qdl(int i10, int i11) {
        lnr lnrVar = this.jpc;
        if (lnrVar != null) {
            lnrVar.qdl(i10, i11);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0200lnr
    public void qdl(long j10, long j11) {
        this.exu = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.ud.jpc
    protected void qdl(String str) {
        super.qdl(str);
    }
}
