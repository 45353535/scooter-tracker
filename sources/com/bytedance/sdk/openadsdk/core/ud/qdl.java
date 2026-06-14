package com.bytedance.sdk.openadsdk.core.ud;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.oth;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.yt.lnr;
import com.bytedance.sdk.openadsdk.yt.mml;
import com.vungle.ads.internal.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class qdl implements oth.qdl {
    private final boolean lnr;
    private final oth.qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final AdSlot f17542ud;

    public qdl(oth.qdl qdlVar, AdSlot adSlot, boolean z10) {
        this.qdl = qdlVar;
        this.f17542ud = adSlot;
        this.lnr = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
    public void qdl(final int i10, final String str) {
        AdSlot adSlot;
        if (this.qdl != null) {
            if (fco.mo() || !((adSlot = this.f17542ud) == null || adSlot.getDurationSlotType() == 5 || com.bytedance.sdk.openadsdk.jyq.qdl.qdl("getads_callback_async", 0) != 1)) {
                this.qdl.qdl(i10, str);
            } else {
                fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ud.qdl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        qdl.this.qdl.qdl(i10, str);
                    }
                });
            }
            if (!this.lnr || this.f17542ud == null) {
                return;
            }
            lnr.lnr(new mml() { // from class: com.bytedance.sdk.openadsdk.core.ud.qdl.2
                @Override // com.bytedance.sdk.openadsdk.yt.mml
                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                    qdlVar.ud(Constants.LOAD_AD);
                    qdlVar.lnr(qdl.this.f17542ud.getCodeId());
                    qdlVar.mml(gy.lnr(qdl.this.f17542ud.getDurationSlotType()));
                    qdlVar.qdl(BuildConfig.VERSION_NAME);
                    qdlVar.wd(gy.qdl(qdl.this.f17542ud).toString());
                    return qdlVar;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
    public void qdl(final com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, final com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
        AdSlot adSlot;
        if (this.qdl != null) {
            if (!fco.mo() && ((adSlot = this.f17542ud) == null || adSlot.getDurationSlotType() == 5 || com.bytedance.sdk.openadsdk.jyq.qdl.qdl("getads_callback_async", 0) != 1)) {
                fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ud.qdl.3
                    @Override // java.lang.Runnable
                    public void run() {
                        qdl.this.qdl.qdl(qdlVar, lnrVar);
                    }
                });
            } else {
                this.qdl.qdl(qdlVar, lnrVar);
            }
            if (!this.lnr || this.f17542ud == null) {
                return;
            }
            lnr.ud(new mml() { // from class: com.bytedance.sdk.openadsdk.core.ud.qdl.4
                @Override // com.bytedance.sdk.openadsdk.yt.mml
                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                    qdlVar2.ud(Constants.LOAD_AD);
                    qdlVar2.lnr(qdl.this.f17542ud.getCodeId());
                    qdlVar2.mml(gy.lnr(qdl.this.f17542ud.getDurationSlotType()));
                    qdlVar2.qdl(BuildConfig.VERSION_NAME);
                    qdlVar2.wd(gy.qdl(qdl.this.f17542ud).toString());
                    return qdlVar2;
                }
            });
        }
    }
}
