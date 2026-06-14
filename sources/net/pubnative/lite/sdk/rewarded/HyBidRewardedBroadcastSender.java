package net.pubnative.lite.sdk.rewarded;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastReceiver;
import net.pubnative.lite.sdk.utils.PNLocalBroadcastManager;

/* JADX INFO: loaded from: classes3.dex */
public class HyBidRewardedBroadcastSender {
    private final long mBroadcastId;
    private final PNLocalBroadcastManager mLocalBroadcastManager;

    public HyBidRewardedBroadcastSender(Context context, long j10) {
        this(j10, PNLocalBroadcastManager.getInstance(context));
    }

    public long getBroadcastId() {
        return this.mBroadcastId;
    }

    public void sendBroadcast(HyBidRewardedBroadcastReceiver.Action action, Bundle bundle) {
        Intent intent = new Intent(action.getId());
        intent.putExtra(HyBidRewardedBroadcastReceiver.BROADCAST_ID, this.mBroadcastId);
        if (bundle != null && !bundle.isEmpty()) {
            intent.putExtras(bundle);
        }
        this.mLocalBroadcastManager.sendBroadcast(intent);
    }

    HyBidRewardedBroadcastSender(long j10, PNLocalBroadcastManager pNLocalBroadcastManager) {
        this.mBroadcastId = j10;
        this.mLocalBroadcastManager = pNLocalBroadcastManager;
    }

    public void sendBroadcast(HyBidRewardedBroadcastReceiver.Action action) {
        Intent intent = new Intent(action.getId());
        intent.putExtra(HyBidRewardedBroadcastReceiver.BROADCAST_ID, this.mBroadcastId);
        this.mLocalBroadcastManager.sendBroadcast(intent);
    }
}
