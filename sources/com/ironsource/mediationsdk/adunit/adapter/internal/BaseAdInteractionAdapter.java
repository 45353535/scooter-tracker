package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseAdInteractionAdapter<NetworkAdapter extends AdapterBaseInterface, Listener extends AdapterAdInteractionListener> extends BaseAdAdapter<NetworkAdapter, Listener> implements AdapterAdFullScreenInterface<Listener> {
    public BaseAdInteractionAdapter(@NotNull LevelPlay.AdFormat adFormat, @NotNull NetworkSettings networkSettings) {
        super(adFormat, networkSettings);
    }
}
