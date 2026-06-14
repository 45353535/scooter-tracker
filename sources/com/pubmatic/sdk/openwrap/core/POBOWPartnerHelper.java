package com.pubmatic.sdk.openwrap.core;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBBaseBidder;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class POBOWPartnerHelper {

    private static class a implements POBBaseBidder.CountryFilterConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final POBProfileInfo f62790a;

        a(POBProfileInfo pOBProfileInfo) {
            this.f62790a = pOBProfileInfo;
        }

        @Override // com.pubmatic.sdk.common.base.POBBaseBidder.CountryFilterConfig
        public String getCountryFilteringMode() {
            return this.f62790a.getCountryFilteringMode();
        }

        @Override // com.pubmatic.sdk.common.base.POBBaseBidder.CountryFilterConfig
        public Set getFilteringCountries() {
            return this.f62790a.getFilteringCountries();
        }
    }

    @NonNull
    public static POBManager createPOBManager(@NonNull Context context, @NonNull POBRequest pOBRequest, @Nullable POBProfileInfo pOBProfileInfo) {
        POBManager pOBManager = new POBManager(pOBRequest, context);
        pOBManager.setIdentifier("OpenWrap");
        if (pOBProfileInfo != null) {
            pOBManager.setCountryFilterConfig(new a(pOBProfileInfo));
        }
        return pOBManager;
    }
}
