package com.ironsource.mediationsdk.adunit.adapter;

import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseInterstitial<NetworkAdapter extends BaseAdapter> extends BaseAdInteractionAdapter<NetworkAdapter, InterstitialAdListener> {
    public BaseInterstitial(NetworkSettings networkSettings) {
        super(LevelPlay.AdFormat.INTERSTITIAL, networkSettings);
    }
}
