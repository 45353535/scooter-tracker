package com.yandex.mobile.ads.common;

import android.location.Location;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.j4;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00013J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R%\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010,\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b+\u0010\rR\u0019\u00102\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/yandex/mobile/ads/common/AdRequestConfiguration;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "a", "Ljava/lang/String;", "getAdUnitId", "()Ljava/lang/String;", "adUnitId", "b", "getAge", "age", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getGender", "gender", "d", "getContextQuery", "contextQuery", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/util/List;", "getContextTags", "()Ljava/util/List;", "contextTags", "Landroid/location/Location;", InneractiveMediationDefs.GENDER_FEMALE, "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "location", "", "g", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "parameters", "h", "getBiddingData", "biddingData", "Lcom/yandex/mobile/ads/common/AdTheme;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/yandex/mobile/ads/common/AdTheme;", "getPreferredTheme", "()Lcom/yandex/mobile/ads/common/AdTheme;", "preferredTheme", "Builder", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class AdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String adUnitId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String age;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String gender;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String contextQuery;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List contextTags;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Location location;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map parameters;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String biddingData;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final AdTheme preferredTheme;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u00002\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/mobile/ads/common/AdRequestConfiguration$Builder;", "", "", "adUnitId", "<init>", "(Ljava/lang/String;)V", "Lcom/yandex/mobile/ads/common/AdRequestConfiguration;", "build", "()Lcom/yandex/mobile/ads/common/AdRequestConfiguration;", "Landroid/location/Location;", "location", "setLocation", "(Landroid/location/Location;)Lcom/yandex/mobile/ads/common/AdRequestConfiguration$Builder;", "", "parameters", "setParameters", "(Ljava/util/Map;)Lcom/yandex/mobile/ads/common/AdRequestConfiguration$Builder;", "biddingData", "setBiddingData", "(Ljava/lang/String;)Lcom/yandex/mobile/ads/common/AdRequestConfiguration$Builder;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f68209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f68210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f68211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Location f68212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f68213e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f68214f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f68215g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f68216h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private AdTheme f68217i;

        public Builder(@NotNull String str) {
            this.f68209a = str;
        }

        @NotNull
        public final AdRequestConfiguration build() {
            return new AdRequestConfiguration(this.f68209a, this.f68210b, this.f68211c, this.f68213e, this.f68214f, this.f68212d, this.f68215g, this.f68216h, this.f68217i, null);
        }

        @NotNull
        public final Builder setBiddingData(@Nullable String biddingData) {
            this.f68216h = biddingData;
            return this;
        }

        @NotNull
        public final Builder setLocation(@Nullable Location location) {
            this.f68212d = location;
            return this;
        }

        @NotNull
        public final Builder setParameters(@Nullable Map<String, String> parameters) {
            this.f68215g = parameters;
            return this;
        }
    }

    public /* synthetic */ AdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Intrinsics.areEqual(AdRequestConfiguration.class, other.getClass())) {
            AdRequestConfiguration adRequestConfiguration = (AdRequestConfiguration) other;
            if (Intrinsics.areEqual(this.adUnitId, adRequestConfiguration.adUnitId) && Intrinsics.areEqual(this.age, adRequestConfiguration.age) && Intrinsics.areEqual(this.gender, adRequestConfiguration.gender) && Intrinsics.areEqual(this.contextQuery, adRequestConfiguration.contextQuery) && Intrinsics.areEqual(this.contextTags, adRequestConfiguration.contextTags) && Intrinsics.areEqual(this.location, adRequestConfiguration.location) && Intrinsics.areEqual(this.parameters, adRequestConfiguration.parameters) && Intrinsics.areEqual(this.biddingData, adRequestConfiguration.biddingData) && this.preferredTheme == adRequestConfiguration.preferredTheme) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    public final String getAge() {
        return this.age;
    }

    @Nullable
    public final String getBiddingData() {
        return this.biddingData;
    }

    @Nullable
    public final String getContextQuery() {
        return this.contextQuery;
    }

    @Nullable
    public final List<String> getContextTags() {
        return this.contextTags;
    }

    @Nullable
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    public final Location getLocation() {
        return this.location;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    @Nullable
    public final AdTheme getPreferredTheme() {
        return this.preferredTheme;
    }

    public int hashCode() {
        String str = this.age;
        int iA = j4.a(this.adUnitId, (str != null ? str.hashCode() : 0) * 31, 31);
        String str2 = this.gender;
        int iHashCode = (iA + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.contextQuery;
        int iHashCode2 = (iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        List list = this.contextTags;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.location;
        int iHashCode4 = (iHashCode3 + (location != null ? location.hashCode() : 0)) * 31;
        Map map = this.parameters;
        int iHashCode5 = (iHashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.biddingData;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.preferredTheme;
        return iHashCode6 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    private AdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme) {
        this.adUnitId = str;
        this.age = str2;
        this.gender = str3;
        this.contextQuery = str4;
        this.contextTags = list;
        this.location = location;
        this.parameters = map;
        this.biddingData = str5;
        this.preferredTheme = adTheme;
    }
}
