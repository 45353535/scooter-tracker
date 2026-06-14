package com.yandex.mobile.ads.common;

import android.location.Location;
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

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00010J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u001f\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR%\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010)\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\b(\u0010\rR\u0019\u0010/\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/yandex/mobile/ads/common/AdRequest;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "a", "Ljava/lang/String;", "getAge", "()Ljava/lang/String;", "age", "b", "getGender", "gender", "Landroid/location/Location;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "location", "d", "getContextQuery", "contextQuery", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/util/List;", "getContextTags", "()Ljava/util/List;", "contextTags", "", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "parameters", "g", "getBiddingData", "biddingData", "Lcom/yandex/mobile/ads/common/AdTheme;", "h", "Lcom/yandex/mobile/ads/common/AdTheme;", "getPreferredTheme", "()Lcom/yandex/mobile/ads/common/AdTheme;", "preferredTheme", "Builder", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class AdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String age;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String gender;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Location location;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String contextQuery;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List contextTags;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map parameters;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String biddingData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AdTheme preferredTheme;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\u00002\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/mobile/ads/common/AdRequest$Builder;", "", "<init>", "()V", "Lcom/yandex/mobile/ads/common/AdRequest;", "build", "()Lcom/yandex/mobile/ads/common/AdRequest;", "Landroid/location/Location;", "location", "setLocation", "(Landroid/location/Location;)Lcom/yandex/mobile/ads/common/AdRequest$Builder;", "", "", "parameters", "setParameters", "(Ljava/util/Map;)Lcom/yandex/mobile/ads/common/AdRequest$Builder;", "biddingData", "setBiddingData", "(Ljava/lang/String;)Lcom/yandex/mobile/ads/common/AdRequest$Builder;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f68192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f68193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Location f68194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f68195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f68196e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f68197f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f68198g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private AdTheme f68199h;

        @NotNull
        public final AdRequest build() {
            return new AdRequest(this.f68192a, this.f68193b, this.f68194c, this.f68195d, this.f68196e, this.f68197f, this.f68198g, this.f68199h, null);
        }

        @NotNull
        public final Builder setBiddingData(@Nullable String biddingData) {
            this.f68198g = biddingData;
            return this;
        }

        @NotNull
        public final Builder setLocation(@Nullable Location location) {
            this.f68194c = location;
            return this;
        }

        @NotNull
        public final Builder setParameters(@Nullable Map<String, String> parameters) {
            this.f68197f = parameters;
            return this;
        }
    }

    public /* synthetic */ AdRequest(String str, String str2, Location location, String str3, List list, Map map, String str4, AdTheme adTheme, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, location, str3, list, map, str4, adTheme);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Intrinsics.areEqual(AdRequest.class, other.getClass())) {
            AdRequest adRequest = (AdRequest) other;
            if (Intrinsics.areEqual(this.age, adRequest.age) && Intrinsics.areEqual(this.gender, adRequest.gender) && Intrinsics.areEqual(this.contextQuery, adRequest.contextQuery) && Intrinsics.areEqual(this.contextTags, adRequest.contextTags) && Intrinsics.areEqual(this.location, adRequest.location) && Intrinsics.areEqual(this.parameters, adRequest.parameters) && Intrinsics.areEqual(this.biddingData, adRequest.biddingData) && this.preferredTheme == adRequest.preferredTheme) {
                return true;
            }
        }
        return false;
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
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.gender;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.contextQuery;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List list = this.contextTags;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.location;
        int iHashCode5 = (iHashCode4 + (location != null ? location.hashCode() : 0)) * 31;
        Map map = this.parameters;
        int iHashCode6 = (iHashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.biddingData;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.preferredTheme;
        return iHashCode7 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    private AdRequest(String str, String str2, Location location, String str3, List list, Map map, String str4, AdTheme adTheme) {
        this.age = str;
        this.gender = str2;
        this.location = location;
        this.contextQuery = str3;
        this.contextTags = list;
        this.parameters = map;
        this.biddingData = str4;
        this.preferredTheme = adTheme;
    }
}
