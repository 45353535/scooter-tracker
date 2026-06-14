package com.mbridge.msdk.config.manager.callback;

import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* JADX INFO: loaded from: classes10.dex */
public interface b {
    void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo);

    void onAdShow(MBridgeIds mBridgeIds);

    void onEndCardShow(MBridgeIds mBridgeIds);

    void onLoadSuccess(MBridgeIds mBridgeIds);

    void onShowFail(MBridgeIds mBridgeIds, String str);

    void onVideoAdClicked(MBridgeIds mBridgeIds);

    void onVideoComplete(MBridgeIds mBridgeIds);

    void onVideoLoadFail(MBridgeIds mBridgeIds, String str);

    void onVideoLoadSuccess(MBridgeIds mBridgeIds);
}
