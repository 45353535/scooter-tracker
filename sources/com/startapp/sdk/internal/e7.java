package com.startapp.sdk.internal;

import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.PlacementConfig;
import com.startapp.sdk.ads.external.config.StrategyConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e7 {
    public static final boolean a(boolean z10, String str, boolean z11, boolean z12) {
        ExternalAdConfig externalAdConfigV;
        AdUnitConfig adUnitConfig;
        if (str == null || (externalAdConfigV = MetaData.E().v()) == null || (adUnitConfig = externalAdConfigV.getMapping().get(str)) == null || !adUnitConfig.isValid()) {
            return false;
        }
        StrategyConfig strategies = externalAdConfigV.getStrategies();
        PlacementConfig banner = z11 ? strategies.getBanner() : z12 ? strategies.getRewarded() : strategies.getInterstitial();
        return z10 ? banner.isFallbackActive() : vi.a(banner.getRatio());
    }
}
