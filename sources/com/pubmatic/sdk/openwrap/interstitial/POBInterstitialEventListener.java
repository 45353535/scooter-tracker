package com.pubmatic.sdk.openwrap.interstitial;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBBidsProvider;
import com.pubmatic.sdk.openwrap.core.POBAdEventListener;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public interface POBInterstitialEventListener extends POBAdEventListener {
    @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
    @Nullable
    /* synthetic */ POBBidsProvider getBidsProvider();

    @Nullable
    Map<String, Object> getCustomData();

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
}
