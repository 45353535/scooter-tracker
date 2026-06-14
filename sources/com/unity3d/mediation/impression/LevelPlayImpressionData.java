package com.unity3d.mediation.impression;

import java.text.DecimalFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class LevelPlayImpressionData {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f67897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final DecimalFormat f67898b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public LevelPlayImpressionData(@NotNull JSONObject allData) {
        Intrinsics.checkNotNullParameter(allData, "allData");
        this.f67897a = allData;
        this.f67898b = new DecimalFormat("#.#####");
    }

    @Nullable
    public final String getAb() {
        String it = this.f67897a.optString("ab", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getAdFormat() {
        String it = this.f67897a.optString("adFormat", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getAdNetwork() {
        String it = this.f67897a.optString("adNetwork", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @NotNull
    public final JSONObject getAllData() {
        return this.f67897a;
    }

    @Nullable
    public final String getAuctionId() {
        String it = this.f67897a.optString("auctionId", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getCountry() {
        String it = this.f67897a.optString("country", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getCreativeId() {
        String it = this.f67897a.optString("creativeId", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getEncryptedCPM() {
        String it = this.f67897a.optString("encryptedCPM", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getInstanceId() {
        String it = this.f67897a.optString("instanceId", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getInstanceName() {
        String it = this.f67897a.optString("instanceName", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getMediationAdUnitId() {
        String it = this.f67897a.optString("mediationAdUnitId", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getMediationAdUnitName() {
        String it = this.f67897a.optString("mediationAdUnitName", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getPlacement() {
        String it = this.f67897a.optString("placement", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final String getPrecision() {
        String it = this.f67897a.optString("precision", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @Nullable
    public final Double getRevenue() {
        double dOptDouble = this.f67897a.optDouble("revenue");
        Double dValueOf = Double.valueOf(dOptDouble);
        if (Double.isNaN(dOptDouble)) {
            return null;
        }
        return dValueOf;
    }

    @Nullable
    public final String getSegmentName() {
        String it = this.f67897a.optString("segmentName", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @NotNull
    public String toString() {
        LevelPlayImpressionData levelPlayImpressionData;
        String str;
        String auctionId = getAuctionId();
        String mediationAdUnitName = getMediationAdUnitName();
        String mediationAdUnitId = getMediationAdUnitId();
        String adFormat = getAdFormat();
        String country = getCountry();
        String ab2 = getAb();
        String segmentName = getSegmentName();
        String placement = getPlacement();
        String adNetwork = getAdNetwork();
        String instanceName = getInstanceName();
        String instanceId = getInstanceId();
        if (getRevenue() == null) {
            str = null;
            levelPlayImpressionData = this;
        } else {
            levelPlayImpressionData = this;
            str = levelPlayImpressionData.f67898b.format(levelPlayImpressionData.getRevenue());
        }
        return "auctionId: '" + auctionId + "', mediationAdUnitName: '" + mediationAdUnitName + "', mediationAdUnitId: '" + mediationAdUnitId + "', adFormat: '" + adFormat + "', country: '" + country + "', ab: '" + ab2 + "', segmentName: '" + segmentName + "', placement: '" + placement + "', adNetwork: '" + adNetwork + "', instanceName: '" + instanceName + "', instanceId: '" + instanceId + "', revenue: " + str + ", precision: '" + levelPlayImpressionData.getPrecision() + "', encryptedCPM: '" + levelPlayImpressionData.getEncryptedCPM() + "', creativeId: '" + levelPlayImpressionData.getCreativeId() + "'";
    }
}
