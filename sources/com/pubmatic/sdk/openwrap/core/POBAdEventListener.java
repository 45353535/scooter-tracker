package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBBidsProvider;

/* JADX INFO: loaded from: classes11.dex */
public interface POBAdEventListener {
    @Nullable
    POBBidsProvider getBidsProvider();

    void onAdClick();

    void onAdClosed();

    void onAdImpression();

    void onAdLeftApplication();

    void onAdOpened();
}
