package net.pubnative.lite.sdk.api;

import net.pubnative.lite.sdk.models.AdRequestFactory;
import net.pubnative.lite.sdk.models.AdSize;

/* JADX INFO: loaded from: classes3.dex */
public class LeaderboardRequestManager extends RequestManager {
    public LeaderboardRequestManager() {
    }

    @Override // net.pubnative.lite.sdk.api.RequestManager
    public AdSize getAdSize() {
        return AdSize.SIZE_728x90;
    }

    public LeaderboardRequestManager(ApiClient apiClient, AdRequestFactory adRequestFactory) {
        super(apiClient, adRequestFactory);
    }
}
