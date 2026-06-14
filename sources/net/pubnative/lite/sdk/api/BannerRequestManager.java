package net.pubnative.lite.sdk.api;

import net.pubnative.lite.sdk.models.AdRequestFactory;
import net.pubnative.lite.sdk.models.AdSize;

/* JADX INFO: loaded from: classes3.dex */
public class BannerRequestManager extends RequestManager {
    public BannerRequestManager() {
    }

    @Override // net.pubnative.lite.sdk.api.RequestManager
    public AdSize getAdSize() {
        return AdSize.SIZE_320x50;
    }

    public BannerRequestManager(ApiClient apiClient, AdRequestFactory adRequestFactory) {
        super(apiClient, adRequestFactory);
    }
}
