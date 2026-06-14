package com.pubmatic.sdk.common.base;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.models.POBAdResponse;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public interface POBBidderListener<T extends POBAdDescriptor> {
    void onBidsFailed(@NonNull POBBidding<T> pOBBidding, @NonNull POBError pOBError);

    void onBidsFetched(@NonNull POBBidding<T> pOBBidding, @NonNull POBAdResponse<T> pOBAdResponse);
}
