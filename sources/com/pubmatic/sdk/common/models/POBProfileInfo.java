package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBProfileInfo {
    public static final String COUNTRY_FILTERING_ALLOW_MODE = "include";
    public static final String COUNTRY_FILTERING_BLOCK_MODE = "exclude";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f62407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62408b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f62411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Set f62412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f62413g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f62410d = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f62409c = System.currentTimeMillis();

    public static POBProfileInfo build(@NonNull JSONObject jSONObject) throws JSONException {
        POBProfileInfo pOBProfileInfo = new POBProfileInfo();
        pOBProfileInfo.f62407a = jSONObject.optInt("pid");
        pOBProfileInfo.f62408b = jSONObject.optInt(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER);
        pOBProfileInfo.f62411e = jSONObject.optString("adserver");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ctFiltering");
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
            pOBProfileInfo.f62413g = jSONObjectOptJSONObject.optString(C4240b4.a.f42515t);
            pOBProfileInfo.f62412f = POBUtils.parseJsonArrayToSet(jSONObjectOptJSONObject.optJSONArray("codes"));
        }
        pOBProfileInfo.f62410d = jSONObject.optInt("enableCrashAnalyticAndroid", 1) != 0;
        return pOBProfileInfo;
    }

    @Nullable
    public String getAdServerName() {
        return this.f62411e;
    }

    @Nullable
    public String getCountryFilteringMode() {
        return this.f62413g;
    }

    public long getCreatedDateTime() {
        return this.f62409c;
    }

    @Nullable
    public Set<String> getFilteringCountries() {
        return this.f62412f;
    }

    public int getProfileId() {
        return this.f62407a;
    }

    public int getPublisherId() {
        return this.f62408b;
    }

    public boolean isCrashAnalyticsEnabled() {
        return this.f62410d;
    }

    public boolean isProfileInfoExpired() {
        return System.currentTimeMillis() - this.f62409c > SignalManager.TWENTY_FOUR_HOURS_MILLIS;
    }
}
