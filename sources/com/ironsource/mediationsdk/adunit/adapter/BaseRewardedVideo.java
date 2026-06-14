package com.ironsource.mediationsdk.adunit.adapter;

import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseRewardedVideo<NetworkAdapter extends BaseAdapter> extends BaseAdInteractionAdapter<NetworkAdapter, RewardedVideoAdListener> {
    public BaseRewardedVideo(@NotNull NetworkSettings networkSettings) {
        super(LevelPlay.AdFormat.REWARDED, networkSettings);
    }
}
