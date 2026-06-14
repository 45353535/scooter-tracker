package com.unity3d.mediation.adapters.levelplay;

import android.content.Context;
import com.ironsource.InterfaceC4630y3;
import com.ironsource.mediationsdk.adunit.adapter.BaseBanner;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class LevelPlayBaseBanner<NetworkAdapter extends LevelPlayBaseAdapter> extends BaseBanner<NetworkAdapter> implements InterfaceC4630y3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBaseBanner(@NotNull NetworkSettings networkSettings) {
        super(networkSettings);
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
    }

    @Override // com.ironsource.InterfaceC4630y3
    public void collectBiddingData(@Nullable AdData adData, @NotNull Context context, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
    }
}
