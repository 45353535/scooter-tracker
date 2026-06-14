package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;

/* JADX INFO: loaded from: classes10.dex */
public class b extends d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MBridgeVideoView f52751n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MBridgeContainerView f52752o;

    public b(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f52751n = mBridgeVideoView;
        this.f52752o = mBridgeContainerView;
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f52762a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.d, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        if (this.f52762a) {
            if (i10 == 8) {
                MBridgeContainerView mBridgeContainerView = this.f52752o;
                if (mBridgeContainerView == null) {
                    MBridgeVideoView mBridgeVideoView = this.f52751n;
                    if (mBridgeVideoView != null) {
                        mBridgeVideoView.showAlertView();
                    }
                } else if (mBridgeContainerView.showAlertWebView()) {
                    MBridgeVideoView mBridgeVideoView2 = this.f52751n;
                    if (mBridgeVideoView2 != null) {
                        mBridgeVideoView2.alertWebViewShowed();
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView3 = this.f52751n;
                    if (mBridgeVideoView3 != null) {
                        mBridgeVideoView3.showAlertView();
                    }
                }
            } else if (i10 == 107) {
                this.f52752o.showVideoClickView(-1);
                this.f52751n.setCover(false);
                this.f52751n.setMiniEndCardState(false);
                this.f52751n.videoOperate(1);
            } else if (i10 == 112) {
                this.f52751n.setCover(true);
                this.f52751n.setMiniEndCardState(true);
                this.f52751n.videoOperate(2);
            } else if (i10 == 115) {
                this.f52752o.resizeMiniCard(this.f52751n.getBorderViewWidth(), this.f52751n.getBorderViewHeight(), this.f52751n.getBorderViewRadius());
            }
        }
        super.a(i10, obj);
    }
}
