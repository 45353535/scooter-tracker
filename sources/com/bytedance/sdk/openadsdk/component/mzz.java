package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.ironsource.Df;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class mzz implements com.bytedance.sdk.openadsdk.qdl.mml.ud {
    private final PAGAppOpenAdInteractionListener qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final AtomicBoolean f17013ud = new AtomicBoolean(false);
    private final AtomicBoolean lnr = new AtomicBoolean(false);

    public mzz(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.qdl = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.mml.ud
    public void lnr() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.f17013ud.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.qdl) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        aaj.qdl("BVA", Df.f40645f);
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.qdl;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.mml.ud
    public void qdl() {
        if (this.lnr.compareAndSet(false, true)) {
            aaj.qdl("BVA", "onAdShow");
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.qdl;
            if (pAGAppOpenAdInteractionListener != null) {
                pAGAppOpenAdInteractionListener.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.mml.ud
    public void ud() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        aaj.qdl("BVA", "onAdSkip");
        if (this.f17013ud.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.qdl) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }
}
