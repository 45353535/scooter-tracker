package com.pubmatic.sdk.video.player;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.video.vastmodels.POBVastAd;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;

/* JADX INFO: loaded from: classes11.dex */
public interface POBVastPlayerListener {
    void onClose();

    void onDsaInfoIconClick();

    void onEndCardWillLeaveApp();

    void onFailedToPlay(@NonNull POBError pOBError);

    void onIndustryIconClick(@Nullable String str);

    void onOpenLandingPage(@Nullable String str);

    void onPlaybackCompleted(float f10);

    void onReadyToPlay(@Nullable POBVastAd pOBVastAd, float f10);

    void onSkip();

    void onVideoEventOccurred(@NonNull POBVastCreative.POBEventTypes pOBEventTypes);

    void onVideoStarted(float f10, float f11);

    void shouldForwardClickEvent();
}
