package com.appodeal.ads;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, d2 = {"Lcom/appodeal/ads/BannerCallbacks;", "", "onBannerLoaded", "", "height", "", "isPrecache", "", "onBannerFailedToLoad", "onBannerShown", "onBannerShowFailed", "onBannerClicked", "onBannerExpired", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BannerCallbacks {
    void onBannerClicked();

    void onBannerExpired();

    void onBannerFailedToLoad();

    void onBannerLoaded(int height, boolean isPrecache);

    void onBannerShowFailed();

    void onBannerShown();
}
