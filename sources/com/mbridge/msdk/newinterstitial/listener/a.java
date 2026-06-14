package com.mbridge.msdk.newinterstitial.listener;

import com.mbridge.msdk.foundation.same.report.metrics.c;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;

/* JADX INFO: loaded from: classes10.dex */
public class a implements InterVideoOutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NewInterstitialListener f49988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49990c;

    public a(NewInterstitialListener newInterstitialListener) {
        this.f49988a = newInterstitialListener;
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        NewInterstitialListener newInterstitialListener = this.f49988a;
        if (newInterstitialListener != null) {
            newInterstitialListener.onAdClose(mBridgeIds, rewardInfo);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        NewInterstitialListener newInterstitialListener = this.f49988a;
        if (newInterstitialListener != null) {
            newInterstitialListener.onAdCloseWithNIReward(mBridgeIds, rewardInfo);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onAdShow(MBridgeIds mBridgeIds) {
        NewInterstitialListener newInterstitialListener = this.f49988a;
        if (newInterstitialListener != null) {
            newInterstitialListener.onAdShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onEndcardShow(MBridgeIds mBridgeIds) {
        NewInterstitialListener newInterstitialListener = this.f49988a;
        if (newInterstitialListener != null) {
            newInterstitialListener.onEndcardShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onLoadSuccess(MBridgeIds mBridgeIds) {
        NewInterstitialListener newInterstitialListener = this.f49988a;
        if (newInterstitialListener != null) {
            newInterstitialListener.onLoadCampaignSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onShowFail(c cVar, MBridgeIds mBridgeIds, String str) {
        NewInterstitialListener newInterstitialListener = this.f49988a;
        if (newInterstitialListener != null) {
            newInterstitialListener.onShowFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onVideoAdClicked(boolean z10, MBridgeIds mBridgeIds) {
        NewInterstitialListener newInterstitialListener = this.f49988a;
        if (newInterstitialListener != null) {
            newInterstitialListener.onAdClicked(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onVideoComplete(MBridgeIds mBridgeIds) {
        NewInterstitialListener newInterstitialListener = this.f49988a;
        if (newInterstitialListener != null) {
            newInterstitialListener.onVideoComplete(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        NewInterstitialListener newInterstitialListener = this.f49988a;
        if (newInterstitialListener != null) {
            newInterstitialListener.onResourceLoadFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        NewInterstitialListener newInterstitialListener = this.f49988a;
        if (newInterstitialListener != null) {
            newInterstitialListener.onResourceLoadSuccess(mBridgeIds);
        }
    }

    public a(NewInterstitialListener newInterstitialListener, String str, boolean z10) {
        this.f49988a = newInterstitialListener;
        this.f49989b = str;
        this.f49990c = z10;
    }
}
