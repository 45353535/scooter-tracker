package com.unity3d.mediation;

import com.ironsource.C4424m2;
import com.ironsource.C4462o4;
import com.ironsource.C4638yb;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.k;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class LevelPlayAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f67861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f67862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final C4424m2 f67863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final LevelPlayAdSize f67864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f67865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f67866g;

    public LevelPlayAdInfo(@NotNull String adId, @NotNull String adUnitId, @NotNull String adFormat, @Nullable C4424m2 c4424m2, @Nullable LevelPlayAdSize levelPlayAdSize, @Nullable String str, @NotNull Map<String, ? extends Object> adapterData) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        this.f67860a = adId;
        this.f67861b = adUnitId;
        this.f67862c = adFormat;
        this.f67863d = c4424m2;
        this.f67864e = levelPlayAdSize;
        this.f67865f = str;
        this.f67866g = adapterData;
    }

    private final String a() {
        return this.f67860a;
    }

    private final String b() {
        return this.f67861b;
    }

    private final String c() {
        return this.f67862c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LevelPlayAdInfo copy$default(LevelPlayAdInfo levelPlayAdInfo, String str, String str2, String str3, C4424m2 c4424m2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = levelPlayAdInfo.f67860a;
        }
        if ((i10 & 2) != 0) {
            str2 = levelPlayAdInfo.f67861b;
        }
        if ((i10 & 4) != 0) {
            str3 = levelPlayAdInfo.f67862c;
        }
        if ((i10 & 8) != 0) {
            c4424m2 = levelPlayAdInfo.f67863d;
        }
        if ((i10 & 16) != 0) {
            levelPlayAdSize = levelPlayAdInfo.f67864e;
        }
        if ((i10 & 32) != 0) {
            str4 = levelPlayAdInfo.f67865f;
        }
        if ((i10 & 64) != 0) {
            map = levelPlayAdInfo.f67866g;
        }
        String str5 = str4;
        Map map2 = map;
        LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        String str6 = str3;
        return levelPlayAdInfo.copy(str, str2, str6, c4424m2, levelPlayAdSize2, str5, map2);
    }

    private final C4424m2 d() {
        return this.f67863d;
    }

    private final LevelPlayAdSize e() {
        return this.f67864e;
    }

    private final String f() {
        return this.f67865f;
    }

    private final Map<String, Object> g() {
        return this.f67866g;
    }

    @NotNull
    public final LevelPlayAdInfo copy(@NotNull String adId, @NotNull String adUnitId, @NotNull String adFormat, @Nullable C4424m2 c4424m2, @Nullable LevelPlayAdSize levelPlayAdSize, @Nullable String str, @NotNull Map<String, ? extends Object> adapterData) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        return new LevelPlayAdInfo(adId, adUnitId, adFormat, c4424m2, levelPlayAdSize, str, adapterData);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayAdInfo)) {
            return false;
        }
        LevelPlayAdInfo levelPlayAdInfo = (LevelPlayAdInfo) obj;
        return Intrinsics.areEqual(this.f67860a, levelPlayAdInfo.f67860a) && Intrinsics.areEqual(this.f67861b, levelPlayAdInfo.f67861b) && Intrinsics.areEqual(this.f67862c, levelPlayAdInfo.f67862c) && Intrinsics.areEqual(this.f67863d, levelPlayAdInfo.f67863d) && Intrinsics.areEqual(this.f67864e, levelPlayAdInfo.f67864e) && Intrinsics.areEqual(this.f67865f, levelPlayAdInfo.f67865f) && Intrinsics.areEqual(this.f67866g, levelPlayAdInfo.f67866g);
    }

    @NotNull
    public final String getAb() {
        JSONObject jSONObjectM;
        C4424m2 c4424m2 = this.f67863d;
        Object objOpt = (c4424m2 == null || (jSONObjectM = c4424m2.m()) == null) ? null : jSONObjectM.opt("ab");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getAdFormat() {
        JSONObject jSONObjectM;
        C4424m2 c4424m2 = this.f67863d;
        Object objOpt = (c4424m2 == null || (jSONObjectM = c4424m2.m()) == null) ? null : jSONObjectM.opt("adFormat");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? this.f67862c : str;
    }

    @NotNull
    public final String getAdId() {
        return this.f67860a;
    }

    @NotNull
    public final String getAdNetwork() {
        JSONObject jSONObjectM;
        C4424m2 c4424m2 = this.f67863d;
        Object objOpt = (c4424m2 == null || (jSONObjectM = c4424m2.m()) == null) ? null : jSONObjectM.opt("adNetwork");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @Nullable
    public final LevelPlayAdSize getAdSize() {
        return this.f67864e;
    }

    @NotNull
    public final String getAdUnitId() {
        JSONObject jSONObjectM;
        C4424m2 c4424m2 = this.f67863d;
        Object objOpt = (c4424m2 == null || (jSONObjectM = c4424m2.m()) == null) ? null : jSONObjectM.opt("mediationAdUnitId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? this.f67861b : str;
    }

    @NotNull
    public final String getAdUnitName() {
        JSONObject jSONObjectM;
        C4424m2 c4424m2 = this.f67863d;
        Object objOpt = (c4424m2 == null || (jSONObjectM = c4424m2.m()) == null) ? null : jSONObjectM.opt("mediationAdUnitName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getAuctionId() {
        JSONObject jSONObjectM;
        C4424m2 c4424m2 = this.f67863d;
        Object objOpt = (c4424m2 == null || (jSONObjectM = c4424m2.m()) == null) ? null : jSONObjectM.opt("auctionId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getCountry() {
        JSONObject jSONObjectM;
        C4424m2 c4424m2 = this.f67863d;
        Object objOpt = (c4424m2 == null || (jSONObjectM = c4424m2.m()) == null) ? null : jSONObjectM.opt("country");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getCreativeId() {
        JSONObject jSONObjectM;
        C4424m2 c4424m2 = this.f67863d;
        Object objOpt = (c4424m2 == null || (jSONObjectM = c4424m2.m()) == null) ? null : jSONObjectM.opt("creativeId");
        if (!(objOpt instanceof String)) {
            objOpt = null;
        }
        String str = (String) objOpt;
        if (str != null) {
            return str;
        }
        Object obj = this.f67866g.get("creativeId");
        String str2 = obj instanceof String ? (String) obj : null;
        return str2 == null ? "" : str2;
    }

    @NotNull
    public final String getEncryptedCPM() {
        JSONObject jSONObjectM;
        C4424m2 c4424m2 = this.f67863d;
        Object objOpt = (c4424m2 == null || (jSONObjectM = c4424m2.m()) == null) ? null : jSONObjectM.opt("encryptedCPM");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getImpressionPrecision$mediationsdk_release() {
        JSONObject jSONObjectM;
        C4424m2 c4424m2 = this.f67863d;
        Object objOpt = (c4424m2 == null || (jSONObjectM = c4424m2.m()) == null) ? null : jSONObjectM.opt("precision");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final double getImpressionRevenue$mediationsdk_release() {
        JSONObject jSONObjectM;
        C4424m2 c4424m2 = this.f67863d;
        Double dValueOf = (c4424m2 == null || (jSONObjectM = c4424m2.m()) == null) ? null : Double.valueOf(jSONObjectM.optDouble("revenue"));
        if (Intrinsics.areEqual(dValueOf, Double.NaN) || dValueOf == null) {
            return 0.0d;
        }
        return dValueOf.doubleValue();
    }

    @NotNull
    public final String getInstanceId() {
        JSONObject jSONObjectM;
        C4424m2 c4424m2 = this.f67863d;
        Object objOpt = (c4424m2 == null || (jSONObjectM = c4424m2.m()) == null) ? null : jSONObjectM.opt("instanceId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getInstanceName() {
        JSONObject jSONObjectM;
        C4424m2 c4424m2 = this.f67863d;
        Object objOpt = (c4424m2 == null || (jSONObjectM = c4424m2.m()) == null) ? null : jSONObjectM.opt("instanceName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPlacementName() {
        String str = this.f67865f;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPrecision() {
        C4638yb c4638ybD;
        String strC;
        C4424m2 c4424m2 = this.f67863d;
        return (c4424m2 == null || (c4638ybD = c4424m2.d()) == null || (strC = c4638ybD.c()) == null) ? getImpressionPrecision$mediationsdk_release() : strC;
    }

    public final double getRevenue() {
        C4638yb c4638ybD;
        C4424m2 c4424m2 = this.f67863d;
        return (c4424m2 == null || (c4638ybD = c4424m2.d()) == null) ? getImpressionRevenue$mediationsdk_release() : c4638ybD.d();
    }

    @NotNull
    public final String getSegmentName() {
        JSONObject jSONObjectM;
        C4424m2 c4424m2 = this.f67863d;
        Object objOpt = (c4424m2 == null || (jSONObjectM = c4424m2.m()) == null) ? null : jSONObjectM.opt("segmentName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public int hashCode() {
        int iHashCode = ((((this.f67860a.hashCode() * 31) + this.f67861b.hashCode()) * 31) + this.f67862c.hashCode()) * 31;
        C4424m2 c4424m2 = this.f67863d;
        int iHashCode2 = (iHashCode + (c4424m2 == null ? 0 : c4424m2.hashCode())) * 31;
        LevelPlayAdSize levelPlayAdSize = this.f67864e;
        int iHashCode3 = (iHashCode2 + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        String str = this.f67865f;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f67866g.hashCode();
    }

    @NotNull
    public final JSONObject impressionData$mediationsdk_release() {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObjectM;
        try {
            C4424m2 c4424m2 = this.f67863d;
            if (c4424m2 == null || (jSONObjectM = c4424m2.m()) == null) {
                jSONObject = new JSONObject();
            } else {
                Iterator<String> itKeys = jSONObjectM.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "it.keys()");
                jSONObject = new JSONObject(jSONObjectM, (String[]) k.c0(k.h(itKeys)).toArray(new String[0]));
            }
        } catch (Exception e10) {
            IronLog.INTERNAL.error("failed to copy impression JSON", e10);
            C4462o4.d().a(e10);
            jSONObject = new JSONObject();
        }
        try {
            String placement = jSONObject.optString("placement");
            Intrinsics.checkNotNullExpressionValue(placement, "placement");
            if (placement.length() > 0 && (str = this.f67865f) != null) {
                jSONObject.put("placement", StringsKt.W(placement, d.f43829r, str, false, 4, null));
            }
            if (getCreativeId().length() > 0) {
                jSONObject.put("creativeId", getCreativeId());
            }
        } catch (Exception e11) {
            IronLog.INTERNAL.error("failed to put impression values", e11);
            C4462o4.d().a(e11);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "adId: " + getAdId() + ", adUnitId: " + getAdUnitId() + ", adUnitName: " + getAdUnitName() + ", adSize: " + this.f67864e + ", adFormat: " + getAdFormat() + ", placementName: " + getPlacementName() + ", auctionId: " + getAuctionId() + ", country: " + getCountry() + ", ab: " + getAb() + ", segmentName: " + getSegmentName() + ", adNetwork: " + getAdNetwork() + ", instanceName: " + getInstanceName() + ", instanceId: " + getInstanceId() + ", revenue: " + getRevenue() + ", precision: " + getPrecision() + ", encryptedCPM: " + getEncryptedCPM() + ", creativeId: " + getCreativeId();
    }

    private final /* synthetic */ <T> T a(String str) {
        JSONObject jSONObjectM;
        C4424m2 c4424m2 = this.f67863d;
        T t10 = (c4424m2 == null || (jSONObjectM = c4424m2.m()) == null) ? null : (T) jSONObjectM.opt(str);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t10;
    }

    public /* synthetic */ LevelPlayAdInfo(String str, String str2, String str3, C4424m2 c4424m2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : c4424m2, (i10 & 16) != 0 ? null : levelPlayAdSize, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdInfo(@NotNull LevelPlayAdInfo adInfo, @Nullable String str) {
        this(adInfo.f67860a, adInfo.f67861b, adInfo.f67862c, adInfo.f67863d, adInfo.f67864e, str, adInfo.f67866g);
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }
}
