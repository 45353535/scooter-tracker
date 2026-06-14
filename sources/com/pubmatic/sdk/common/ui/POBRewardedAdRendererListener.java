package com.pubmatic.sdk.common.ui;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBDataType$POBVideoAdEventType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public interface POBRewardedAdRendererListener {
    void onAdClicked();

    @Deprecated
    void onAdEventOccurred(@NonNull POBDataType$POBVideoAdEventType pOBDataType$POBVideoAdEventType);

    void onAdExpired();

    void onAdImpression();

    void onAdInteractionStarted();

    void onAdInteractionStopped();

    void onAdRender(@Nullable POBAdDescriptor pOBAdDescriptor);

    void onAdRenderingFailed(@NonNull POBError pOBError);

    void onLeavingApplication();

    void onReceiveReward(@Nullable POBCoreReward pOBCoreReward);
}
