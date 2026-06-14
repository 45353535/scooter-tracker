package net.pubnative.lite.sdk.api;

import net.pubnative.lite.sdk.models.AdRequestFactory;
import net.pubnative.lite.sdk.models.AdSize;

/* JADX INFO: loaded from: classes3.dex */
public class MRectRequestManager extends RequestManager {
    public MRectRequestManager() {
    }

    @Override // net.pubnative.lite.sdk.api.RequestManager
    public AdSize getAdSize() {
        return AdSize.SIZE_300x250;
    }

    public MRectRequestManager(ApiClient apiClient, AdRequestFactory adRequestFactory) {
        super(apiClient, adRequestFactory);
    }
}
