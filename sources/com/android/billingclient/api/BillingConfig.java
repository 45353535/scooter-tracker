package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@zzm
public final class BillingConfig {
    private final String countryCode;

    private BillingConfig(@Nullable String str, String str2) {
        this.countryCode = str2;
    }

    static BillingConfig forCountryCode(String str) {
        return new BillingConfig(null, str);
    }

    @NonNull
    public String getCountryCode() {
        return this.countryCode;
    }

    BillingConfig(String str) throws JSONException {
        this.countryCode = new JSONObject(str).optString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
    }
}
