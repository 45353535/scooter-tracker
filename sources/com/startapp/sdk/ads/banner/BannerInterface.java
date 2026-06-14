package com.startapp.sdk.ads.banner;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public interface BannerInterface {
    @Keep
    void hideBanner();

    @Keep
    void setBannerListener(BannerListener bannerListener);

    @Keep
    void showBanner();
}
