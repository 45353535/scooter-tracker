package com.yandex.mobile.ads.common;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.ironsource.mediationsdk.l;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.taurusx.tax.f.y;
import com.yandex.mobile.ads.banner.BannerAdSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00132\u00020\u0001:\u0007\u0014\u0015\u0016\u0017\u0018\u0019\u001aR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0005\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration;", "", "Lcom/yandex/mobile/ads/common/AdapterIdentity;", "a", "Lcom/yandex/mobile/ads/common/AdapterIdentity;", "getAdapterIdentity", "()Lcom/yandex/mobile/ads/common/AdapterIdentity;", "adapterIdentity", "", "", "b", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "parameters", "Lcom/yandex/mobile/ads/banner/BannerAdSize;", "getBannerAdSize", "()Lcom/yandex/mobile/ads/banner/BannerAdSize;", l.f44068h, y.f66058y, "AppOpenAd", "Banner", "Builder", "com/yandex/mobile/ads/common/b", "Interstitial", LogConstants.KEY_NATIVE, "Rewarded", "Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration$AppOpenAd;", "Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration$Banner;", "Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration$Interstitial;", "Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration$Native;", "Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration$Rewarded;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public abstract class BidderTokenRequestConfiguration {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AdapterIdentity adapterIdentity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map parameters;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration$AppOpenAd;", "Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration;", "Lcom/yandex/mobile/ads/common/AdapterIdentity;", "adapterIdentity", "", "", "parameters", "<init>", "(Lcom/yandex/mobile/ads/common/AdapterIdentity;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/yandex/mobile/ads/common/AdapterIdentity;", "getAdapterIdentity", "()Lcom/yandex/mobile/ads/common/AdapterIdentity;", "d", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class AppOpenAd extends BidderTokenRequestConfiguration {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AdapterIdentity adapterIdentity;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map parameters;

        public AppOpenAd(@NotNull AdapterIdentity adapterIdentity, @NotNull Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.adapterIdentity = adapterIdentity;
            this.parameters = map;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AppOpenAd)) {
                return false;
            }
            AppOpenAd appOpenAd = (AppOpenAd) other;
            return Intrinsics.areEqual(this.adapterIdentity, appOpenAd.adapterIdentity) && Intrinsics.areEqual(this.parameters, appOpenAd.parameters);
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        @NotNull
        public Map<String, String> getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            return this.parameters.hashCode() + (this.adapterIdentity.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AppOpenAd(adapterIdentity=" + this.adapterIdentity + ", parameters=" + this.parameters + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration$Banner;", "Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration;", "Lcom/yandex/mobile/ads/common/AdapterIdentity;", "adapterIdentity", "Lcom/yandex/mobile/ads/banner/BannerAdSize;", l.f44068h, "", "", "parameters", "<init>", "(Lcom/yandex/mobile/ads/common/AdapterIdentity;Lcom/yandex/mobile/ads/banner/BannerAdSize;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/yandex/mobile/ads/common/AdapterIdentity;", "getAdapterIdentity", "()Lcom/yandex/mobile/ads/common/AdapterIdentity;", "d", "Lcom/yandex/mobile/ads/banner/BannerAdSize;", "getBannerAdSize", "()Lcom/yandex/mobile/ads/banner/BannerAdSize;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Banner extends BidderTokenRequestConfiguration {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AdapterIdentity adapterIdentity;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final BannerAdSize bannerAdSize;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map parameters;

        public Banner(@NotNull AdapterIdentity adapterIdentity, @Nullable BannerAdSize bannerAdSize, @NotNull Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.adapterIdentity = adapterIdentity;
            this.bannerAdSize = bannerAdSize;
            this.parameters = map;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return Intrinsics.areEqual(this.adapterIdentity, banner.adapterIdentity) && Intrinsics.areEqual(this.bannerAdSize, banner.bannerAdSize) && Intrinsics.areEqual(this.parameters, banner.parameters);
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        @Nullable
        public BannerAdSize getBannerAdSize() {
            return this.bannerAdSize;
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        @NotNull
        public Map<String, String> getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            int iHashCode = this.adapterIdentity.hashCode() * 31;
            BannerAdSize bannerAdSize = this.bannerAdSize;
            return this.parameters.hashCode() + ((iHashCode + (bannerAdSize == null ? 0 : bannerAdSize.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "Banner(adapterIdentity=" + this.adapterIdentity + ", bannerAdSize=" + this.bannerAdSize + ", parameters=" + this.parameters + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration$Builder;", "", "Lcom/yandex/mobile/ads/common/AdType;", "adType", "<init>", "(Lcom/yandex/mobile/ads/common/AdType;)V", "Lcom/yandex/mobile/ads/banner/BannerAdSize;", l.f44068h, "setBannerAdSize", "(Lcom/yandex/mobile/ads/banner/BannerAdSize;)Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration$Builder;", "", "", "parameters", "setParameters", "(Ljava/util/Map;)Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration$Builder;", "Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration;", "build", "()Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final AdapterIdentity f68237e = new AdapterIdentity("unknown", "0.0.0");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AdType f68238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AdapterIdentity f68239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private BannerAdSize f68240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Map f68241d = MapsKt.emptyMap();

        public Builder(@NotNull AdType adType) {
            this.f68238a = adType;
        }

        @NotNull
        public final BidderTokenRequestConfiguration build() {
            AdapterIdentity adapterIdentity = this.f68239b;
            if (adapterIdentity == null) {
                adapterIdentity = f68237e;
            }
            switch (a.f68251a[this.f68238a.ordinal()]) {
                case 1:
                    return new Banner(adapterIdentity, this.f68240c, this.f68241d);
                case 2:
                    return new Interstitial(adapterIdentity, this.f68241d);
                case 3:
                    return new Rewarded(adapterIdentity, this.f68241d);
                case 4:
                    return new Native(adapterIdentity, this.f68241d);
                case 5:
                    return new AppOpenAd(adapterIdentity, this.f68241d);
                case 6:
                    return new Interstitial(adapterIdentity, this.f68241d);
                default:
                    throw new m();
            }
        }

        @NotNull
        public final Builder setBannerAdSize(@Nullable BannerAdSize bannerAdSize) {
            this.f68240c = bannerAdSize;
            return this;
        }

        @NotNull
        public final Builder setParameters(@NotNull Map<String, String> parameters) {
            this.f68241d = parameters;
            return this;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration$Interstitial;", "Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration;", "Lcom/yandex/mobile/ads/common/AdapterIdentity;", "adapterIdentity", "", "", "parameters", "<init>", "(Lcom/yandex/mobile/ads/common/AdapterIdentity;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/yandex/mobile/ads/common/AdapterIdentity;", "getAdapterIdentity", "()Lcom/yandex/mobile/ads/common/AdapterIdentity;", "d", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Interstitial extends BidderTokenRequestConfiguration {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AdapterIdentity adapterIdentity;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map parameters;

        public Interstitial(@NotNull AdapterIdentity adapterIdentity, @NotNull Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.adapterIdentity = adapterIdentity;
            this.parameters = map;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Interstitial)) {
                return false;
            }
            Interstitial interstitial = (Interstitial) other;
            return Intrinsics.areEqual(this.adapterIdentity, interstitial.adapterIdentity) && Intrinsics.areEqual(this.parameters, interstitial.parameters);
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        @NotNull
        public Map<String, String> getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            return this.parameters.hashCode() + (this.adapterIdentity.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Interstitial(adapterIdentity=" + this.adapterIdentity + ", parameters=" + this.parameters + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration$Native;", "Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration;", "Lcom/yandex/mobile/ads/common/AdapterIdentity;", "adapterIdentity", "", "", "parameters", "<init>", "(Lcom/yandex/mobile/ads/common/AdapterIdentity;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/yandex/mobile/ads/common/AdapterIdentity;", "getAdapterIdentity", "()Lcom/yandex/mobile/ads/common/AdapterIdentity;", "d", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Native extends BidderTokenRequestConfiguration {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AdapterIdentity adapterIdentity;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map parameters;

        public Native(@NotNull AdapterIdentity adapterIdentity, @NotNull Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.adapterIdentity = adapterIdentity;
            this.parameters = map;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Native)) {
                return false;
            }
            Native r52 = (Native) other;
            return Intrinsics.areEqual(this.adapterIdentity, r52.adapterIdentity) && Intrinsics.areEqual(this.parameters, r52.parameters);
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        @NotNull
        public Map<String, String> getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            return this.parameters.hashCode() + (this.adapterIdentity.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Native(adapterIdentity=" + this.adapterIdentity + ", parameters=" + this.parameters + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration$Rewarded;", "Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration;", "Lcom/yandex/mobile/ads/common/AdapterIdentity;", "adapterIdentity", "", "", "parameters", "<init>", "(Lcom/yandex/mobile/ads/common/AdapterIdentity;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/yandex/mobile/ads/common/AdapterIdentity;", "getAdapterIdentity", "()Lcom/yandex/mobile/ads/common/AdapterIdentity;", "d", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Rewarded extends BidderTokenRequestConfiguration {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AdapterIdentity adapterIdentity;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map parameters;

        public Rewarded(@NotNull AdapterIdentity adapterIdentity, @NotNull Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.adapterIdentity = adapterIdentity;
            this.parameters = map;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rewarded)) {
                return false;
            }
            Rewarded rewarded = (Rewarded) other;
            return Intrinsics.areEqual(this.adapterIdentity, rewarded.adapterIdentity) && Intrinsics.areEqual(this.parameters, rewarded.parameters);
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        @NotNull
        public Map<String, String> getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            return this.parameters.hashCode() + (this.adapterIdentity.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Rewarded(adapterIdentity=" + this.adapterIdentity + ", parameters=" + this.parameters + ")";
        }
    }

    public /* synthetic */ BidderTokenRequestConfiguration(AdapterIdentity adapterIdentity, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(adapterIdentity, map);
    }

    @Nullable
    public BannerAdSize getBannerAdSize() {
        return null;
    }

    @NotNull
    public abstract Map<String, String> getParameters();

    private BidderTokenRequestConfiguration(AdapterIdentity adapterIdentity, Map map) {
        this.adapterIdentity = adapterIdentity;
        this.parameters = map;
    }
}
