package com.pubmatic.sdk.common.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.models.POBAdResponse;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public abstract class POBBaseBidder<T extends POBAdDescriptor> implements POBBidding<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f62241a;

    @Nullable
    protected POBBidderListener<T> bidderListener;

    public interface CountryFilterConfig {
        @Nullable
        String getCountryFilteringMode();

        @Nullable
        Set<String> getFilteringCountries();
    }

    @Override // com.pubmatic.sdk.common.base.POBBidding
    public abstract /* synthetic */ void destroy();

    @Override // com.pubmatic.sdk.common.base.POBBidding
    @Nullable
    public abstract /* synthetic */ POBAdResponse getAdResponse();

    @Override // com.pubmatic.sdk.common.base.POBBidding
    @NonNull
    public abstract /* synthetic */ Map getBidderResults();

    @Override // com.pubmatic.sdk.common.base.POBBidding
    @Nullable
    public String getIdentifier() {
        return this.f62241a;
    }

    @Override // com.pubmatic.sdk.common.base.POBBidding
    public abstract /* synthetic */ void requestBid();

    @Override // com.pubmatic.sdk.common.base.POBBidding
    public void setBidderListener(@Nullable POBBidderListener<T> pOBBidderListener) {
        this.bidderListener = pOBBidderListener;
    }

    public void setCountryFilterConfig(@Nullable CountryFilterConfig countryFilterConfig) {
    }

    public void setIdentifier(@Nullable String str) {
        this.f62241a = str;
    }
}
