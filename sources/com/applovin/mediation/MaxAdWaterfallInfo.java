package com.applovin.mediation;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface MaxAdWaterfallInfo {
    long getLatencyMillis();

    MaxAd getLoadedAd();

    String getName();

    List<MaxNetworkResponseInfo> getNetworkResponses();

    String getTestName();
}
