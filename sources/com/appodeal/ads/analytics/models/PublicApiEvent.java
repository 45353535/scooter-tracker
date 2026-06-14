package com.appodeal.ads.analytics.models;

import androidx.compose.foundation.c;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import qf.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/appodeal/ads/analytics/models/PublicApiEvent;", "Lcom/appodeal/ads/analytics/models/Event;", "SdkApiInitialized", "SdkApiCache", "SdkApiShow", "SdkApiHide", "SdkApiCanShow", "SdkApiIsLoaded", "Result", "Lcom/appodeal/ads/analytics/models/PublicApiEvent$SdkApiCache;", "Lcom/appodeal/ads/analytics/models/PublicApiEvent$SdkApiCanShow;", "Lcom/appodeal/ads/analytics/models/PublicApiEvent$SdkApiHide;", "Lcom/appodeal/ads/analytics/models/PublicApiEvent$SdkApiInitialized;", "Lcom/appodeal/ads/analytics/models/PublicApiEvent$SdkApiIsLoaded;", "Lcom/appodeal/ads/analytics/models/PublicApiEvent$SdkApiShow;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PublicApiEvent extends Event {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/appodeal/ads/analytics/models/PublicApiEvent$Result;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "SHOW", "SHOW_ERROR", "NOT_INITIALIZED", "NOT_READY_ERROR", "PLACEMENT_ERROR", "CONNECTION_ERROR", "CAN_SHOW", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Result {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Result[] $VALUES;
        private final String code;
        public static final Result SHOW = new Result("SHOW", 0, "SHOW");
        public static final Result SHOW_ERROR = new Result("SHOW_ERROR", 1, "SHOW_ERROR");
        public static final Result NOT_INITIALIZED = new Result("NOT_INITIALIZED", 2, "NOT_INITIALIZED");
        public static final Result NOT_READY_ERROR = new Result("NOT_READY_ERROR", 3, "NOT_READY_ERROR");
        public static final Result PLACEMENT_ERROR = new Result("PLACEMENT_ERROR", 4, "PLACEMENT_ERROR");
        public static final Result CONNECTION_ERROR = new Result("CONNECTION_ERROR", 5, "CONNECTION_ERROR");
        public static final Result CAN_SHOW = new Result("CAN_SHOW", 6, "CAN_SHOW");

        private static final /* synthetic */ Result[] $values() {
            return new Result[]{SHOW, SHOW_ERROR, NOT_INITIALIZED, NOT_READY_ERROR, PLACEMENT_ERROR, CONNECTION_ERROR, CAN_SHOW};
        }

        static {
            Result[] resultArr$values = $values();
            $VALUES = resultArr$values;
            $ENTRIES = a.a(resultArr$values);
        }

        private Result(String str, int i10, String str2) {
            this.code = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }

        public final String getCode() {
            return this.code;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/appodeal/ads/analytics/models/PublicApiEvent$SdkApiCache;", "Lcom/appodeal/ads/analytics/models/PublicApiEvent;", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "<init>", "(Lcom/appodeal/ads/modules/common/internal/adtype/AdType;)V", "getAdType", "()Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "name", "", "getName", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SdkApiCache implements PublicApiEvent {
        private final AdType adType;
        private final String name;

        public SdkApiCache(AdType adType) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            this.adType = adType;
            this.name = "sdk_api_cache";
        }

        public static /* synthetic */ SdkApiCache copy$default(SdkApiCache sdkApiCache, AdType adType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adType = sdkApiCache.adType;
            }
            return sdkApiCache.copy(adType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AdType getAdType() {
            return this.adType;
        }

        public final SdkApiCache copy(AdType adType) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            return new SdkApiCache(adType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SdkApiCache) && this.adType == ((SdkApiCache) other).adType;
        }

        public final AdType getAdType() {
            return this.adType;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.adType.hashCode();
        }

        public String toString() {
            return "SdkApiCache(adType=" + this.adType + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/appodeal/ads/analytics/models/PublicApiEvent$SdkApiCanShow;", "Lcom/appodeal/ads/analytics/models/PublicApiEvent;", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "result", "Lcom/appodeal/ads/analytics/models/PublicApiEvent$Result;", "<init>", "(Lcom/appodeal/ads/modules/common/internal/adtype/AdType;Lcom/appodeal/ads/analytics/models/PublicApiEvent$Result;)V", "getAdType", "()Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "getResult", "()Lcom/appodeal/ads/analytics/models/PublicApiEvent$Result;", "name", "", "getName", "()Ljava/lang/String;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SdkApiCanShow implements PublicApiEvent {
        private final AdType adType;
        private final String name;
        private final Result result;

        public SdkApiCanShow(AdType adType, Result result) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(result, "result");
            this.adType = adType;
            this.result = result;
            this.name = "sdk_api_can_show";
        }

        public static /* synthetic */ SdkApiCanShow copy$default(SdkApiCanShow sdkApiCanShow, AdType adType, Result result, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adType = sdkApiCanShow.adType;
            }
            if ((i10 & 2) != 0) {
                result = sdkApiCanShow.result;
            }
            return sdkApiCanShow.copy(adType, result);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AdType getAdType() {
            return this.adType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Result getResult() {
            return this.result;
        }

        public final SdkApiCanShow copy(AdType adType, Result result) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(result, "result");
            return new SdkApiCanShow(adType, result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SdkApiCanShow)) {
                return false;
            }
            SdkApiCanShow sdkApiCanShow = (SdkApiCanShow) other;
            return this.adType == sdkApiCanShow.adType && this.result == sdkApiCanShow.result;
        }

        public final AdType getAdType() {
            return this.adType;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public final Result getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode() + (this.adType.hashCode() * 31);
        }

        public String toString() {
            return "SdkApiCanShow(adType=" + this.adType + ", result=" + this.result + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/appodeal/ads/analytics/models/PublicApiEvent$SdkApiHide;", "Lcom/appodeal/ads/analytics/models/PublicApiEvent;", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "<init>", "(Lcom/appodeal/ads/modules/common/internal/adtype/AdType;)V", "getAdType", "()Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "name", "", "getName", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SdkApiHide implements PublicApiEvent {
        private final AdType adType;
        private final String name;

        public SdkApiHide(AdType adType) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            this.adType = adType;
            this.name = "sdk_api_hide";
        }

        public static /* synthetic */ SdkApiHide copy$default(SdkApiHide sdkApiHide, AdType adType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adType = sdkApiHide.adType;
            }
            return sdkApiHide.copy(adType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AdType getAdType() {
            return this.adType;
        }

        public final SdkApiHide copy(AdType adType) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            return new SdkApiHide(adType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SdkApiHide) && this.adType == ((SdkApiHide) other).adType;
        }

        public final AdType getAdType() {
            return this.adType;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.adType.hashCode();
        }

        public String toString() {
            return "SdkApiHide(adType=" + this.adType + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/appodeal/ads/analytics/models/PublicApiEvent$SdkApiInitialized;", "Lcom/appodeal/ads/analytics/models/PublicApiEvent;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SdkApiInitialized implements PublicApiEvent {
        public static final SdkApiInitialized INSTANCE = new SdkApiInitialized();
        private static final String name = "sdk_api_initialize";

        private SdkApiInitialized() {
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return name;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/appodeal/ads/analytics/models/PublicApiEvent$SdkApiIsLoaded;", "Lcom/appodeal/ads/analytics/models/PublicApiEvent;", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "isLoaded", "", "<init>", "(Lcom/appodeal/ads/modules/common/internal/adtype/AdType;Z)V", "getAdType", "()Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "()Z", "name", "", "getName", "()Ljava/lang/String;", "component1", "component2", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SdkApiIsLoaded implements PublicApiEvent {
        private final AdType adType;
        private final boolean isLoaded;
        private final String name;

        public SdkApiIsLoaded(AdType adType, boolean z10) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            this.adType = adType;
            this.isLoaded = z10;
            this.name = "sdk_api_is_loaded";
        }

        public static /* synthetic */ SdkApiIsLoaded copy$default(SdkApiIsLoaded sdkApiIsLoaded, AdType adType, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adType = sdkApiIsLoaded.adType;
            }
            if ((i10 & 2) != 0) {
                z10 = sdkApiIsLoaded.isLoaded;
            }
            return sdkApiIsLoaded.copy(adType, z10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AdType getAdType() {
            return this.adType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsLoaded() {
            return this.isLoaded;
        }

        public final SdkApiIsLoaded copy(AdType adType, boolean isLoaded) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            return new SdkApiIsLoaded(adType, isLoaded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SdkApiIsLoaded)) {
                return false;
            }
            SdkApiIsLoaded sdkApiIsLoaded = (SdkApiIsLoaded) other;
            return this.adType == sdkApiIsLoaded.adType && this.isLoaded == sdkApiIsLoaded.isLoaded;
        }

        public final AdType getAdType() {
            return this.adType;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return c.a(this.isLoaded) + (this.adType.hashCode() * 31);
        }

        public final boolean isLoaded() {
            return this.isLoaded;
        }

        public String toString() {
            return "SdkApiIsLoaded(adType=" + this.adType + ", isLoaded=" + this.isLoaded + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/appodeal/ads/analytics/models/PublicApiEvent$SdkApiShow;", "Lcom/appodeal/ads/analytics/models/PublicApiEvent;", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "result", "Lcom/appodeal/ads/analytics/models/PublicApiEvent$Result;", "<init>", "(Lcom/appodeal/ads/modules/common/internal/adtype/AdType;Lcom/appodeal/ads/analytics/models/PublicApiEvent$Result;)V", "getAdType", "()Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "getResult", "()Lcom/appodeal/ads/analytics/models/PublicApiEvent$Result;", "name", "", "getName", "()Ljava/lang/String;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SdkApiShow implements PublicApiEvent {
        private final AdType adType;
        private final String name;
        private final Result result;

        public SdkApiShow(AdType adType, Result result) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(result, "result");
            this.adType = adType;
            this.result = result;
            this.name = "sdk_api_show";
        }

        public static /* synthetic */ SdkApiShow copy$default(SdkApiShow sdkApiShow, AdType adType, Result result, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adType = sdkApiShow.adType;
            }
            if ((i10 & 2) != 0) {
                result = sdkApiShow.result;
            }
            return sdkApiShow.copy(adType, result);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AdType getAdType() {
            return this.adType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Result getResult() {
            return this.result;
        }

        public final SdkApiShow copy(AdType adType, Result result) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(result, "result");
            return new SdkApiShow(adType, result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SdkApiShow)) {
                return false;
            }
            SdkApiShow sdkApiShow = (SdkApiShow) other;
            return this.adType == sdkApiShow.adType && this.result == sdkApiShow.result;
        }

        public final AdType getAdType() {
            return this.adType;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public final Result getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode() + (this.adType.hashCode() * 31);
        }

        public String toString() {
            return "SdkApiShow(adType=" + this.adType + ", result=" + this.result + ")";
        }
    }
}
