package com.ironsource.mediationsdk.adunit.adapter;

import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseBanner<NetworkAdapter extends BaseAdapter> extends BaseAdAdapter<NetworkAdapter, BannerAdListener> implements AdapterBannerInterface<BannerAdListener> {
    public BaseBanner(NetworkSettings networkSettings) {
        super(LevelPlay.AdFormat.BANNER, networkSettings);
    }
}
