package com.mbridge.msdk.out;

import com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener;

/* JADX INFO: loaded from: classes10.dex */
public abstract class InterstitialVideoWithCodeListener implements InterstitialVideoListener {
    @Override // com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener
    public void onShowFail(MBridgeIds mBridgeIds, String str) {
        onShowFailWithCode(mBridgeIds, com.mbridge.msdk.util.a.b(3000, str), str);
    }

    public abstract void onShowFailWithCode(MBridgeIds mBridgeIds, int i10, String str);

    @Override // com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener
    public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        onVideoLoadFailWithCode(mBridgeIds, com.mbridge.msdk.util.a.a(3000, str), str);
    }

    public abstract void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i10, String str);
}
