package com.yandex.mobile.ads.nativeads;

import android.location.Location;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR%\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u0019\u0010+\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAdRequestConfiguration;", "", "", "a", "Ljava/lang/String;", "getAdUnitId", "()Ljava/lang/String;", "adUnitId", "b", "getAge", "age", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getGender", "gender", "d", "getContextQuery", "contextQuery", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/util/List;", "getContextTags", "()Ljava/util/List;", "contextTags", "Landroid/location/Location;", InneractiveMediationDefs.GENDER_FEMALE, "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "location", "", "g", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "parameters", "h", "getBiddingData", "biddingData", "Lcom/yandex/mobile/ads/common/AdTheme;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/yandex/mobile/ads/common/AdTheme;", "getPreferredTheme", "()Lcom/yandex/mobile/ads/common/AdTheme;", "preferredTheme", "", "j", "Z", "getShouldLoadImagesAutomatically", "()Z", "shouldLoadImagesAutomatically", "Builder", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class NativeAdRequestConfiguration {

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

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldLoadImagesAutomatically;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAdRequestConfiguration$Builder;", "", "", "adUnitId", "<init>", "(Ljava/lang/String;)V", "Lcom/yandex/mobile/ads/nativeads/NativeAdRequestConfiguration;", "build", "()Lcom/yandex/mobile/ads/nativeads/NativeAdRequestConfiguration;", "", "shouldLoadImagesAutomatically", "setShouldLoadImagesAutomatically", "(Z)Lcom/yandex/mobile/ads/nativeads/NativeAdRequestConfiguration$Builder;", "Landroid/location/Location;", "location", "setLocation", "(Landroid/location/Location;)Lcom/yandex/mobile/ads/nativeads/NativeAdRequestConfiguration$Builder;", "", "parameters", "setParameters", "(Ljava/util/Map;)Lcom/yandex/mobile/ads/nativeads/NativeAdRequestConfiguration$Builder;", "biddingData", "setBiddingData", "(Ljava/lang/String;)Lcom/yandex/mobile/ads/nativeads/NativeAdRequestConfiguration$Builder;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f68272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f68273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f68274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Location f68275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f68276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f68277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f68278g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f68279h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private AdTheme f68280i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f68281j = true;

        public Builder(@NotNull String str) {
            this.f68272a = str;
        }

        @NotNull
        public final NativeAdRequestConfiguration build() {
            return new NativeAdRequestConfiguration(this.f68272a, this.f68273b, this.f68274c, this.f68276e, this.f68277f, this.f68275d, this.f68278g, this.f68279h, this.f68280i, this.f68281j, null);
        }

        @NotNull
        public final Builder setBiddingData(@NotNull String biddingData) {
            this.f68279h = biddingData;
            return this;
        }

        @NotNull
        public final Builder setLocation(@NotNull Location location) {
            this.f68275d = location;
            return this;
        }

        @NotNull
        public final Builder setParameters(@NotNull Map<String, String> parameters) {
            this.f68278g = parameters;
            return this;
        }

        @NotNull
        public final Builder setShouldLoadImagesAutomatically(boolean shouldLoadImagesAutomatically) {
            this.f68281j = shouldLoadImagesAutomatically;
            return this;
        }
    }

    public /* synthetic */ NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme, z10);
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

    public final boolean getShouldLoadImagesAutomatically() {
        return this.shouldLoadImagesAutomatically;
    }

    private NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, boolean z10) {
        this.adUnitId = str;
        this.age = str2;
        this.gender = str3;
        this.contextQuery = str4;
        this.contextTags = list;
        this.location = location;
        this.parameters = map;
        this.biddingData = str5;
        this.preferredTheme = adTheme;
        this.shouldLoadImagesAutomatically = z10;
    }
}
