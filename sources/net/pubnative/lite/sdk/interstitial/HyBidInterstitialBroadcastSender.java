package net.pubnative.lite.sdk.interstitial;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastReceiver;
import net.pubnative.lite.sdk.utils.PNLocalBroadcastManager;

/* JADX INFO: loaded from: classes3.dex */
public class HyBidInterstitialBroadcastSender {
    private final long mBroadcastId;
    private final PNLocalBroadcastManager mLocalBroadcastManager;

    public HyBidInterstitialBroadcastSender(Context context, long j10) {
        this(j10, PNLocalBroadcastManager.getInstance(context));
    }

    public long getBroadcastId() {
        return this.mBroadcastId;
    }

    public void sendBroadcast(HyBidInterstitialBroadcastReceiver.Action action) {
        sendBroadcast(action, null);
    }

    HyBidInterstitialBroadcastSender(long j10, PNLocalBroadcastManager pNLocalBroadcastManager) {
        this.mBroadcastId = j10;
        this.mLocalBroadcastManager = pNLocalBroadcastManager;
    }

    public void sendBroadcast(HyBidInterstitialBroadcastReceiver.Action action, Bundle bundle) {
        Intent intent = new Intent(action.getId());
        intent.putExtra(HyBidInterstitialBroadcastReceiver.BROADCAST_ID, this.mBroadcastId);
        if (bundle != null && !bundle.isEmpty()) {
            intent.putExtras(bundle);
        }
        this.mLocalBroadcastManager.sendBroadcast(intent);
    }
}
