package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

/* JADX INFO: loaded from: classes6.dex */
public class PAGBiddingRequest {
    private PAGBannerSize qdl = null;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private String f16912ud = null;
    private String lnr = null;

    public String getAdxId() {
        return this.lnr;
    }

    public PAGBannerSize getBannerSize() {
        return this.qdl;
    }

    public String getSlotId() {
        return this.f16912ud;
    }

    public void setAdxId(String str) {
        this.lnr = str;
    }

    public void setBannerSize(PAGBannerSize pAGBannerSize) {
        this.qdl = pAGBannerSize;
    }

    public void setSlotId(String str) {
        this.f16912ud = str;
    }
}
