package com.appodeal.ads.adapters.mobilefuse;

import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.utils.Log;
import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.WinningBidInfo;
import com.mobilefuse.sdk.WinningBidInfoSource;
import kotlin.jvm.internal.Intrinsics;
import lf.m;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public static final ImpressionLevelData a(WinningBidInfoSource winningBidInfoSource) {
        WinningBidInfo winningBidInfo;
        if (winningBidInfoSource != null) {
            try {
                winningBidInfo = winningBidInfoSource.getWinningBidInfo();
            } catch (Exception e10) {
                Log.log(e10);
                return null;
            }
        } else {
            winningBidInfo = null;
        }
        if (winningBidInfo == null) {
            return null;
        }
        return new ImpressionLevelData(null, Double.valueOf(((double) winningBidInfo.getCpmPrice()) * 1000.0d), Double.valueOf(winningBidInfo.getCpmPrice()), winningBidInfo.getCurrency(), null, null, null, false, 241, null);
    }

    public static final LoadingError b(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "<this>");
        switch (c.f12523a[adError.ordinal()]) {
            case 1:
                return LoadingError.ShowFailed;
            case 2:
            case 3:
                return LoadingError.InternalError;
            case 4:
                return LoadingError.InvalidAssets;
            case 5:
            case 6:
                return LoadingError.NoFill;
            default:
                throw new m();
        }
    }
}
