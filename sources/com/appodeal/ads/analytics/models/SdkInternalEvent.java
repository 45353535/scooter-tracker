package com.appodeal.ads.analytics.models;

import androidx.collection.b;
import androidx.compose.foundation.c;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qf.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u0082\u0001\b\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/appodeal/ads/analytics/models/SdkInternalEvent;", "Lcom/appodeal/ads/analytics/models/Event;", "<init>", "()V", "timestampStartMs", "", "getTimestampStartMs", "()J", "timestampFinishMs", "getTimestampFinishMs", "SdkInitializationFinished", "SdkInternalCmp", "SdkInternalConfig", "SdkInternalInit", "SdkInternalGet", "SdkInternalPostBid", "SdkRender", "SdkIldReceived", "Result", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent$SdkIldReceived;", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent$SdkInitializationFinished;", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent$SdkInternalCmp;", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent$SdkInternalConfig;", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent$SdkInternalGet;", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent$SdkInternalInit;", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent$SdkInternalPostBid;", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent$SdkRender;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class SdkInternalEvent implements Event {
    private final long timestampFinishMs;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/appodeal/ads/analytics/models/SdkInternalEvent$Result;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "NOT_VISIBLE", "CONTAINER_ERROR", "NOT_INITIALIZED", "DISABLED", "AD_REQUEST_ERROR", "SHOWING_IN_PROGRESS", "SHOW_PREVIOUS", "ACTIVITY_ERROR", "FULLSCREEN_SHOWING", "PLACEMENT_ERROR", "NOT_READY_ERROR", "CONNECTION_ERROR", "SHOW", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Result {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Result[] $VALUES;
        private final String code;
        public static final Result NOT_VISIBLE = new Result("NOT_VISIBLE", 0, "NOT_VISIBLE");
        public static final Result CONTAINER_ERROR = new Result("CONTAINER_ERROR", 1, "CONTAINER_ERROR");
        public static final Result NOT_INITIALIZED = new Result("NOT_INITIALIZED", 2, "NOT_INITIALIZED");
        public static final Result DISABLED = new Result("DISABLED", 3, "DISABLED");
        public static final Result AD_REQUEST_ERROR = new Result("AD_REQUEST_ERROR", 4, "AD_REQUEST_ERROR");
        public static final Result SHOWING_IN_PROGRESS = new Result("SHOWING_IN_PROGRESS", 5, "SHOWING_IN_PROGRESS");
        public static final Result SHOW_PREVIOUS = new Result("SHOW_PREVIOUS", 6, "SHOW_PREVIOUS");
        public static final Result ACTIVITY_ERROR = new Result("ACTIVITY_ERROR", 7, "ACTIVITY_ERROR");
        public static final Result FULLSCREEN_SHOWING = new Result("FULLSCREEN_SHOWING", 8, "FULLSCREEN_SHOWING");
        public static final Result PLACEMENT_ERROR = new Result("PLACEMENT_ERROR", 9, "PLACEMENT_ERROR");
        public static final Result NOT_READY_ERROR = new Result("NOT_READY_ERROR", 10, "NOT_READY_ERROR");
        public static final Result CONNECTION_ERROR = new Result("CONNECTION_ERROR", 11, "CONNECTION_ERROR");
        public static final Result SHOW = new Result("SHOW", 12, "SHOW");

        private static final /* synthetic */ Result[] $values() {
            return new Result[]{NOT_VISIBLE, CONTAINER_ERROR, NOT_INITIALIZED, DISABLED, AD_REQUEST_ERROR, SHOWING_IN_PROGRESS, SHOW_PREVIOUS, ACTIVITY_ERROR, FULLSCREEN_SHOWING, PLACEMENT_ERROR, NOT_READY_ERROR, CONNECTION_ERROR, SHOW};
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

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J)\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/appodeal/ads/analytics/models/SdkInternalEvent$SdkIldReceived;", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent;", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "impressionLevelData", "Lcom/appodeal/ads/modules/common/internal/adunit/ImpressionLevelData;", "timestampStartMs", "", "<init>", "(Lcom/appodeal/ads/modules/common/internal/adtype/AdType;Lcom/appodeal/ads/modules/common/internal/adunit/ImpressionLevelData;J)V", "getAdType", "()Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "getImpressionLevelData", "()Lcom/appodeal/ads/modules/common/internal/adunit/ImpressionLevelData;", "getTimestampStartMs", "()J", "name", "", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SdkIldReceived extends SdkInternalEvent {
        private final AdType adType;
        private final ImpressionLevelData impressionLevelData;
        private final String name;
        private final long timestampStartMs;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SdkIldReceived(AdType adType, ImpressionLevelData impressionLevelData) {
            this(adType, impressionLevelData, 0L, 4, null);
            Intrinsics.checkNotNullParameter(adType, "adType");
        }

        public static /* synthetic */ SdkIldReceived copy$default(SdkIldReceived sdkIldReceived, AdType adType, ImpressionLevelData impressionLevelData, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adType = sdkIldReceived.adType;
            }
            if ((i10 & 2) != 0) {
                impressionLevelData = sdkIldReceived.impressionLevelData;
            }
            if ((i10 & 4) != 0) {
                j10 = sdkIldReceived.timestampStartMs;
            }
            return sdkIldReceived.copy(adType, impressionLevelData, j10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AdType getAdType() {
            return this.adType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ImpressionLevelData getImpressionLevelData() {
            return this.impressionLevelData;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTimestampStartMs() {
            return this.timestampStartMs;
        }

        public final SdkIldReceived copy(AdType adType, ImpressionLevelData impressionLevelData, long timestampStartMs) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            return new SdkIldReceived(adType, impressionLevelData, timestampStartMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SdkIldReceived)) {
                return false;
            }
            SdkIldReceived sdkIldReceived = (SdkIldReceived) other;
            return this.adType == sdkIldReceived.adType && Intrinsics.areEqual(this.impressionLevelData, sdkIldReceived.impressionLevelData) && this.timestampStartMs == sdkIldReceived.timestampStartMs;
        }

        public final AdType getAdType() {
            return this.adType;
        }

        public final ImpressionLevelData getImpressionLevelData() {
            return this.impressionLevelData;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        @Override // com.appodeal.ads.analytics.models.SdkInternalEvent
        public long getTimestampStartMs() {
            return this.timestampStartMs;
        }

        public int hashCode() {
            int iHashCode = this.adType.hashCode() * 31;
            ImpressionLevelData impressionLevelData = this.impressionLevelData;
            return b.a(this.timestampStartMs) + ((iHashCode + (impressionLevelData == null ? 0 : impressionLevelData.hashCode())) * 31);
        }

        public String toString() {
            return "SdkIldReceived(adType=" + this.adType + ", impressionLevelData=" + this.impressionLevelData + ", timestampStartMs=" + this.timestampStartMs + ")";
        }

        public /* synthetic */ SdkIldReceived(AdType adType, ImpressionLevelData impressionLevelData, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(adType, impressionLevelData, (i10 & 4) != 0 ? System.currentTimeMillis() : j10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdkIldReceived(AdType adType, ImpressionLevelData impressionLevelData, long j10) {
            super(null);
            Intrinsics.checkNotNullParameter(adType, "adType");
            this.adType = adType;
            this.impressionLevelData = impressionLevelData;
            this.timestampStartMs = j10;
            this.name = "sdk_ild_received";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/appodeal/ads/analytics/models/SdkInternalEvent$SdkInitializationFinished;", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent;", "timestampStartMs", "", "<init>", "(J)V", "getTimestampStartMs", "()J", "name", "", "getName", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SdkInitializationFinished extends SdkInternalEvent {
        private final String name;
        private final long timestampStartMs;

        public SdkInitializationFinished(long j10) {
            super(null);
            this.timestampStartMs = j10;
            this.name = "sdk_initialization_finished";
        }

        public static /* synthetic */ SdkInitializationFinished copy$default(SdkInitializationFinished sdkInitializationFinished, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = sdkInitializationFinished.timestampStartMs;
            }
            return sdkInitializationFinished.copy(j10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTimestampStartMs() {
            return this.timestampStartMs;
        }

        public final SdkInitializationFinished copy(long timestampStartMs) {
            return new SdkInitializationFinished(timestampStartMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SdkInitializationFinished) && this.timestampStartMs == ((SdkInitializationFinished) other).timestampStartMs;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        @Override // com.appodeal.ads.analytics.models.SdkInternalEvent
        public long getTimestampStartMs() {
            return this.timestampStartMs;
        }

        public int hashCode() {
            return b.a(this.timestampStartMs);
        }

        public String toString() {
            return "SdkInitializationFinished(timestampStartMs=" + this.timestampStartMs + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/appodeal/ads/analytics/models/SdkInternalEvent$SdkInternalCmp;", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent;", "timestampStartMs", "", "<init>", "(J)V", "getTimestampStartMs", "()J", "name", "", "getName", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SdkInternalCmp extends SdkInternalEvent {
        private final String name;
        private final long timestampStartMs;

        public SdkInternalCmp(long j10) {
            super(null);
            this.timestampStartMs = j10;
            this.name = "sdk_internal_cmp";
        }

        public static /* synthetic */ SdkInternalCmp copy$default(SdkInternalCmp sdkInternalCmp, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = sdkInternalCmp.timestampStartMs;
            }
            return sdkInternalCmp.copy(j10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTimestampStartMs() {
            return this.timestampStartMs;
        }

        public final SdkInternalCmp copy(long timestampStartMs) {
            return new SdkInternalCmp(timestampStartMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SdkInternalCmp) && this.timestampStartMs == ((SdkInternalCmp) other).timestampStartMs;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        @Override // com.appodeal.ads.analytics.models.SdkInternalEvent
        public long getTimestampStartMs() {
            return this.timestampStartMs;
        }

        public int hashCode() {
            return b.a(this.timestampStartMs);
        }

        public String toString() {
            return "SdkInternalCmp(timestampStartMs=" + this.timestampStartMs + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/appodeal/ads/analytics/models/SdkInternalEvent$SdkInternalConfig;", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent;", "timestampStartMs", "", "isRequestSuccessful", "", "<init>", "(JZ)V", "getTimestampStartMs", "()J", "()Z", "name", "", "getName", "()Ljava/lang/String;", "component1", "component2", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SdkInternalConfig extends SdkInternalEvent {
        private final boolean isRequestSuccessful;
        private final String name;
        private final long timestampStartMs;

        public SdkInternalConfig(long j10, boolean z10) {
            super(null);
            this.timestampStartMs = j10;
            this.isRequestSuccessful = z10;
            this.name = "sdk_internal_config";
        }

        public static /* synthetic */ SdkInternalConfig copy$default(SdkInternalConfig sdkInternalConfig, long j10, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = sdkInternalConfig.timestampStartMs;
            }
            if ((i10 & 2) != 0) {
                z10 = sdkInternalConfig.isRequestSuccessful;
            }
            return sdkInternalConfig.copy(j10, z10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTimestampStartMs() {
            return this.timestampStartMs;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsRequestSuccessful() {
            return this.isRequestSuccessful;
        }

        public final SdkInternalConfig copy(long timestampStartMs, boolean isRequestSuccessful) {
            return new SdkInternalConfig(timestampStartMs, isRequestSuccessful);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SdkInternalConfig)) {
                return false;
            }
            SdkInternalConfig sdkInternalConfig = (SdkInternalConfig) other;
            return this.timestampStartMs == sdkInternalConfig.timestampStartMs && this.isRequestSuccessful == sdkInternalConfig.isRequestSuccessful;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        @Override // com.appodeal.ads.analytics.models.SdkInternalEvent
        public long getTimestampStartMs() {
            return this.timestampStartMs;
        }

        public int hashCode() {
            return c.a(this.isRequestSuccessful) + (b.a(this.timestampStartMs) * 31);
        }

        public final boolean isRequestSuccessful() {
            return this.isRequestSuccessful;
        }

        public String toString() {
            return "SdkInternalConfig(timestampStartMs=" + this.timestampStartMs + ", isRequestSuccessful=" + this.isRequestSuccessful + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/appodeal/ads/analytics/models/SdkInternalEvent$SdkInternalGet;", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent;", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "timestampStartMs", "", "isRequestSuccessful", "", "<init>", "(Lcom/appodeal/ads/modules/common/internal/adtype/AdType;JZ)V", "getAdType", "()Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "getTimestampStartMs", "()J", "()Z", "name", "", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SdkInternalGet extends SdkInternalEvent {
        private final AdType adType;
        private final boolean isRequestSuccessful;
        private final String name;
        private final long timestampStartMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdkInternalGet(AdType adType, long j10, boolean z10) {
            super(null);
            Intrinsics.checkNotNullParameter(adType, "adType");
            this.adType = adType;
            this.timestampStartMs = j10;
            this.isRequestSuccessful = z10;
            this.name = "sdk_internal_get";
        }

        public static /* synthetic */ SdkInternalGet copy$default(SdkInternalGet sdkInternalGet, AdType adType, long j10, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adType = sdkInternalGet.adType;
            }
            if ((i10 & 2) != 0) {
                j10 = sdkInternalGet.timestampStartMs;
            }
            if ((i10 & 4) != 0) {
                z10 = sdkInternalGet.isRequestSuccessful;
            }
            return sdkInternalGet.copy(adType, j10, z10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AdType getAdType() {
            return this.adType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestampStartMs() {
            return this.timestampStartMs;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsRequestSuccessful() {
            return this.isRequestSuccessful;
        }

        public final SdkInternalGet copy(AdType adType, long timestampStartMs, boolean isRequestSuccessful) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            return new SdkInternalGet(adType, timestampStartMs, isRequestSuccessful);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SdkInternalGet)) {
                return false;
            }
            SdkInternalGet sdkInternalGet = (SdkInternalGet) other;
            return this.adType == sdkInternalGet.adType && this.timestampStartMs == sdkInternalGet.timestampStartMs && this.isRequestSuccessful == sdkInternalGet.isRequestSuccessful;
        }

        public final AdType getAdType() {
            return this.adType;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        @Override // com.appodeal.ads.analytics.models.SdkInternalEvent
        public long getTimestampStartMs() {
            return this.timestampStartMs;
        }

        public int hashCode() {
            return c.a(this.isRequestSuccessful) + ((b.a(this.timestampStartMs) + (this.adType.hashCode() * 31)) * 31);
        }

        public final boolean isRequestSuccessful() {
            return this.isRequestSuccessful;
        }

        public String toString() {
            return "SdkInternalGet(adType=" + this.adType + ", timestampStartMs=" + this.timestampStartMs + ", isRequestSuccessful=" + this.isRequestSuccessful + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/appodeal/ads/analytics/models/SdkInternalEvent$SdkInternalInit;", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent;", "timestampStartMs", "", "isRequestSuccessful", "", "<init>", "(JZ)V", "getTimestampStartMs", "()J", "()Z", "name", "", "getName", "()Ljava/lang/String;", "component1", "component2", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SdkInternalInit extends SdkInternalEvent {
        private final boolean isRequestSuccessful;
        private final String name;
        private final long timestampStartMs;

        public SdkInternalInit(long j10, boolean z10) {
            super(null);
            this.timestampStartMs = j10;
            this.isRequestSuccessful = z10;
            this.name = "sdk_internal_init";
        }

        public static /* synthetic */ SdkInternalInit copy$default(SdkInternalInit sdkInternalInit, long j10, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = sdkInternalInit.timestampStartMs;
            }
            if ((i10 & 2) != 0) {
                z10 = sdkInternalInit.isRequestSuccessful;
            }
            return sdkInternalInit.copy(j10, z10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTimestampStartMs() {
            return this.timestampStartMs;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsRequestSuccessful() {
            return this.isRequestSuccessful;
        }

        public final SdkInternalInit copy(long timestampStartMs, boolean isRequestSuccessful) {
            return new SdkInternalInit(timestampStartMs, isRequestSuccessful);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SdkInternalInit)) {
                return false;
            }
            SdkInternalInit sdkInternalInit = (SdkInternalInit) other;
            return this.timestampStartMs == sdkInternalInit.timestampStartMs && this.isRequestSuccessful == sdkInternalInit.isRequestSuccessful;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        @Override // com.appodeal.ads.analytics.models.SdkInternalEvent
        public long getTimestampStartMs() {
            return this.timestampStartMs;
        }

        public int hashCode() {
            return c.a(this.isRequestSuccessful) + (b.a(this.timestampStartMs) * 31);
        }

        public final boolean isRequestSuccessful() {
            return this.isRequestSuccessful;
        }

        public String toString() {
            return "SdkInternalInit(timestampStartMs=" + this.timestampStartMs + ", isRequestSuccessful=" + this.isRequestSuccessful + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/appodeal/ads/analytics/models/SdkInternalEvent$SdkInternalPostBid;", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent;", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "timestampStartMs", "", "isRequestSuccessful", "", "<init>", "(Lcom/appodeal/ads/modules/common/internal/adtype/AdType;JZ)V", "getAdType", "()Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "getTimestampStartMs", "()J", "()Z", "name", "", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SdkInternalPostBid extends SdkInternalEvent {
        private final AdType adType;
        private final boolean isRequestSuccessful;
        private final String name;
        private final long timestampStartMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdkInternalPostBid(AdType adType, long j10, boolean z10) {
            super(null);
            Intrinsics.checkNotNullParameter(adType, "adType");
            this.adType = adType;
            this.timestampStartMs = j10;
            this.isRequestSuccessful = z10;
            this.name = "sdk_internal_postbid";
        }

        public static /* synthetic */ SdkInternalPostBid copy$default(SdkInternalPostBid sdkInternalPostBid, AdType adType, long j10, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adType = sdkInternalPostBid.adType;
            }
            if ((i10 & 2) != 0) {
                j10 = sdkInternalPostBid.timestampStartMs;
            }
            if ((i10 & 4) != 0) {
                z10 = sdkInternalPostBid.isRequestSuccessful;
            }
            return sdkInternalPostBid.copy(adType, j10, z10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AdType getAdType() {
            return this.adType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestampStartMs() {
            return this.timestampStartMs;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsRequestSuccessful() {
            return this.isRequestSuccessful;
        }

        public final SdkInternalPostBid copy(AdType adType, long timestampStartMs, boolean isRequestSuccessful) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            return new SdkInternalPostBid(adType, timestampStartMs, isRequestSuccessful);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SdkInternalPostBid)) {
                return false;
            }
            SdkInternalPostBid sdkInternalPostBid = (SdkInternalPostBid) other;
            return this.adType == sdkInternalPostBid.adType && this.timestampStartMs == sdkInternalPostBid.timestampStartMs && this.isRequestSuccessful == sdkInternalPostBid.isRequestSuccessful;
        }

        public final AdType getAdType() {
            return this.adType;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        @Override // com.appodeal.ads.analytics.models.SdkInternalEvent
        public long getTimestampStartMs() {
            return this.timestampStartMs;
        }

        public int hashCode() {
            return c.a(this.isRequestSuccessful) + ((b.a(this.timestampStartMs) + (this.adType.hashCode() * 31)) * 31);
        }

        public final boolean isRequestSuccessful() {
            return this.isRequestSuccessful;
        }

        public String toString() {
            return "SdkInternalPostBid(adType=" + this.adType + ", timestampStartMs=" + this.timestampStartMs + ", isRequestSuccessful=" + this.isRequestSuccessful + ")";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/appodeal/ads/analytics/models/SdkInternalEvent$SdkRender;", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent;", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "result", "Lcom/appodeal/ads/analytics/models/SdkInternalEvent$Result;", "timestampStartMs", "", "<init>", "(Lcom/appodeal/ads/modules/common/internal/adtype/AdType;Lcom/appodeal/ads/analytics/models/SdkInternalEvent$Result;J)V", "getAdType", "()Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "getResult", "()Lcom/appodeal/ads/analytics/models/SdkInternalEvent$Result;", "getTimestampStartMs", "()J", "name", "", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SdkRender extends SdkInternalEvent {
        private final AdType adType;
        private final String name;
        private final Result result;
        private final long timestampStartMs;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SdkRender(AdType adType, Result result) {
            this(adType, result, 0L, 4, null);
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(result, "result");
        }

        public static /* synthetic */ SdkRender copy$default(SdkRender sdkRender, AdType adType, Result result, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adType = sdkRender.adType;
            }
            if ((i10 & 2) != 0) {
                result = sdkRender.result;
            }
            if ((i10 & 4) != 0) {
                j10 = sdkRender.timestampStartMs;
            }
            return sdkRender.copy(adType, result, j10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AdType getAdType() {
            return this.adType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Result getResult() {
            return this.result;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTimestampStartMs() {
            return this.timestampStartMs;
        }

        public final SdkRender copy(AdType adType, Result result, long timestampStartMs) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(result, "result");
            return new SdkRender(adType, result, timestampStartMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SdkRender)) {
                return false;
            }
            SdkRender sdkRender = (SdkRender) other;
            return this.adType == sdkRender.adType && this.result == sdkRender.result && this.timestampStartMs == sdkRender.timestampStartMs;
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

        @Override // com.appodeal.ads.analytics.models.SdkInternalEvent
        public long getTimestampStartMs() {
            return this.timestampStartMs;
        }

        public int hashCode() {
            return b.a(this.timestampStartMs) + ((this.result.hashCode() + (this.adType.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "SdkRender(adType=" + this.adType + ", result=" + this.result + ", timestampStartMs=" + this.timestampStartMs + ")";
        }

        public /* synthetic */ SdkRender(AdType adType, Result result, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(adType, result, (i10 & 4) != 0 ? System.currentTimeMillis() : j10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdkRender(AdType adType, Result result, long j10) {
            super(null);
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(result, "result");
            this.adType = adType;
            this.result = result;
            this.timestampStartMs = j10;
            this.name = "sdk_render";
        }
    }

    public /* synthetic */ SdkInternalEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final long getTimestampFinishMs() {
        return this.timestampFinishMs;
    }

    public abstract long getTimestampStartMs();

    private SdkInternalEvent() {
        this.timestampFinishMs = System.currentTimeMillis();
    }
}
