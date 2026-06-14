package com.startapp.sdk.ads.nativead;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public interface NativeAdDisplayListener {
    @Keep
    void adClicked(NativeAdInterface nativeAdInterface);

    @Keep
    void adDisplayed(NativeAdInterface nativeAdInterface);

    @Keep
    void adHidden(NativeAdInterface nativeAdInterface);

    @Keep
    void adNotDisplayed(NativeAdInterface nativeAdInterface);
}
