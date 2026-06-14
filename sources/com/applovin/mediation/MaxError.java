package com.applovin.mediation;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface MaxError {
    @Deprecated
    String getAdLoadFailureInfo();

    int getCode();

    int getMediatedNetworkErrorCode();

    String getMediatedNetworkErrorMessage();

    String getMessage();

    long getRequestLatencyMillis();

    @Nullable
    MaxAdWaterfallInfo getWaterfall();
}
