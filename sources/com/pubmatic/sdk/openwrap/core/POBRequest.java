package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class POBRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final POBImpression[] f62795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f62797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62798d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f62799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f62800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f62801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final POBAdFormat f62802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f62803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f62804j;

    public enum API {
        VPAID1(1),
        VPAID2(2),
        MRAID1(3),
        ORMMA(4),
        MRAID2(5),
        MRAID3(6),
        OMSDK(7);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62806a;

        API(int i10) {
            this.f62806a = i10;
        }

        public int getValue() {
            return this.f62806a;
        }
    }

    public enum AdPosition {
        UNKNOWN(0),
        ABOVE_THE_FOLD(1),
        BELOW_THE_FOLD(3),
        HEADER(4),
        FOOTER(5),
        SIDEBAR(6),
        FULL_SCREEN(7);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62808a;

        AdPosition(int i10) {
            this.f62808a = i10;
        }

        public int getValue() {
            return this.f62808a;
        }
    }

    private POBRequest(String str, int i10, POBAdFormat pOBAdFormat, POBImpression... pOBImpressionArr) {
        this.f62797c = str;
        this.f62796b = i10;
        this.f62802h = pOBAdFormat;
        this.f62795a = pOBImpressionArr;
    }

    @Nullable
    public static POBRequest createInstance(@NonNull String str, int i10, @NonNull POBAdFormat pOBAdFormat, @NonNull POBImpression... pOBImpressionArr) {
        if (POBUtils.isNullOrEmpty(str) || POBUtils.isNull(pOBImpressionArr) || pOBImpressionArr.length <= 0) {
            return null;
        }
        return new POBRequest(str, i10, pOBAdFormat, pOBImpressionArr);
    }

    boolean a() {
        return this.f62799e;
    }

    public void enableDebugState(boolean z10) {
        this.f62801g = z10;
    }

    public void enableReturnAllBidStatus(boolean z10) {
        this.f62799e = z10;
    }

    public void enableTestMode(boolean z10) {
        this.f62803i = Boolean.valueOf(z10);
    }

    @Nullable
    public String getAdServerUrl() {
        return this.f62804j;
    }

    @NonNull
    public String getAdUnitId() {
        POBImpression[] impressions = getImpressions();
        return (impressions == null || impressions.length <= 0) ? "" : impressions[0].getAdUnitId();
    }

    @Nullable
    public POBImpression[] getImpressions() {
        POBImpression[] pOBImpressionArr = this.f62795a;
        if (pOBImpressionArr == null || pOBImpressionArr.length <= 0) {
            return null;
        }
        return (POBImpression[]) Arrays.copyOf(pOBImpressionArr, pOBImpressionArr.length);
    }

    public int getNetworkTimeout() {
        return this.f62798d;
    }

    @NonNull
    public POBAdFormat getPlacementType() {
        return this.f62802h;
    }

    public int getProfileId() {
        return this.f62796b;
    }

    @NonNull
    public String getPubId() {
        return this.f62797c;
    }

    @Nullable
    public Boolean getTestMode() {
        return this.f62803i;
    }

    @Nullable
    @Deprecated
    public Integer getVersionId() {
        return this.f62800f;
    }

    public boolean isDebugStateEnabled() {
        return this.f62801g;
    }

    public void setAdServerUrl(@Nullable String str) {
        this.f62804j = str;
    }

    public void setNetworkTimeout(int i10) {
        if (i10 > 0) {
            this.f62798d = i10;
        }
    }

    @Deprecated
    public void setVersionId(@Nullable Integer num) {
        this.f62800f = num;
    }
}
