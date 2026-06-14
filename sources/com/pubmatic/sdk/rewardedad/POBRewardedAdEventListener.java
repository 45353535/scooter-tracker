package com.pubmatic.sdk.rewardedad;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBBidsProvider;
import com.pubmatic.sdk.openwrap.core.POBAdEventListener;
import com.pubmatic.sdk.openwrap.core.POBReward;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public interface POBRewardedAdEventListener extends POBAdEventListener {
    @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
    @Nullable
    /* synthetic */ POBBidsProvider getBidsProvider();

    @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
    /* synthetic */ void onAdClick();

    @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
    /* synthetic */ void onAdClosed();

    void onAdExpired();

    @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
    /* synthetic */ void onAdImpression();

    @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
    /* synthetic */ void onAdLeftApplication();

    @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
    /* synthetic */ void onAdOpened();

    void onAdServerWin();

    void onFailedToLoad(@NonNull POBError pOBError);

    void onFailedToShow(@NonNull POBError pOBError);

    void onOpenWrapPartnerWin(@Nullable String str);

    void onReceiveReward(@NonNull POBReward pOBReward);
}
