package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.C4456nf;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.c;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseAdAdapter<NetworkAdapter extends AdapterBaseInterface, Listener> {

    @NotNull
    private final LevelPlay.AdFormat mAdFormat;

    @Nullable
    protected final UUID mAdUnitObjectId;

    @NotNull
    protected final NetworkSettings mNetworkSettings;

    public BaseAdAdapter(@NotNull LevelPlay.AdFormat adFormat, @NotNull NetworkSettings networkSettings) {
        this(adFormat, networkSettings, null);
    }

    @Nullable
    public NetworkAdapter getNetworkAdapter() {
        NetworkAdapter networkadapter = (NetworkAdapter) c.b().b(this.mNetworkSettings, C4456nf.b(this.mAdFormat), this.mAdUnitObjectId);
        if (networkadapter != null) {
            return networkadapter;
        }
        return null;
    }

    @NotNull
    protected NetworkSettings getNetworkSettings() {
        return this.mNetworkSettings;
    }

    public BaseAdAdapter(@NotNull LevelPlay.AdFormat adFormat, @NotNull NetworkSettings networkSettings, @NotNull UUID uuid) {
        this.mAdFormat = adFormat;
        this.mNetworkSettings = networkSettings;
        this.mAdUnitObjectId = uuid;
    }
}
