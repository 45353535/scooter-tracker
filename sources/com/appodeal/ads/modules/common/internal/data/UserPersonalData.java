package com.appodeal.ads.modules.common.internal.data;

import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\bH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "", "wasAdIdGenerated", "", "getCachedToken", "Lorg/json/JSONObject;", "getExtraData", "getIfa", "", "getCountry", "isUserHasConsent", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface UserPersonalData {
    JSONObject getCachedToken();

    String getCountry();

    JSONObject getExtraData();

    String getIfa();

    boolean isUserHasConsent();

    boolean wasAdIdGenerated();
}
