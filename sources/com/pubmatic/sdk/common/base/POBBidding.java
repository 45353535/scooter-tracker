package com.pubmatic.sdk.common.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.models.POBAdResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface POBBidding<T extends POBAdDescriptor> {
    void destroy();

    @Nullable
    POBAdResponse<T> getAdResponse();

    @NonNull
    Map<String, POBBidderResult<T>> getBidderResults();

    @Nullable
    String getIdentifier();

    void requestBid();

    void setBidderListener(@Nullable POBBidderListener<T> pOBBidderListener);
}
