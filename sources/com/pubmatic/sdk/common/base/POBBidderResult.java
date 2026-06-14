package com.pubmatic.sdk.common.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.network.POBNetworkResult;

/* JADX INFO: loaded from: classes11.dex */
public class POBBidderResult<T extends POBAdDescriptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private POBAdResponse f62242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private POBError f62243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private POBNetworkResult f62244c;

    @Nullable
    public POBAdResponse<T> getAdResponse() {
        return this.f62242a;
    }

    @Nullable
    public POBError getError() {
        return this.f62243b;
    }

    @Nullable
    public POBNetworkResult getNetworkResult() {
        return this.f62244c;
    }

    public void setAdResponse(@Nullable POBAdResponse<T> pOBAdResponse) {
        this.f62242a = pOBAdResponse;
    }

    public void setError(@Nullable POBError pOBError) {
        this.f62243b = pOBError;
    }

    public void setNetworkResult(@Nullable POBNetworkResult pOBNetworkResult) {
        this.f62244c = pOBNetworkResult;
    }

    @NonNull
    public String toString() {
        return "POBBidderResult{adResponse=" + this.f62242a + ", error=" + this.f62243b + ", networkResult=" + this.f62244c + '}';
    }
}
