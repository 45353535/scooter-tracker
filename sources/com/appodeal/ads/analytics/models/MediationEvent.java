package com.appodeal.ads.analytics.models;

import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/analytics/models/MediationEvent;", "Lcom/appodeal/ads/analytics/models/Event;", "WaterfallStart", "WaterfallFinish", "WaterfallCancel", "WaterfallRoundStart", "WaterfallRoundFinish", "Lcom/appodeal/ads/analytics/models/MediationEvent$WaterfallCancel;", "Lcom/appodeal/ads/analytics/models/MediationEvent$WaterfallFinish;", "Lcom/appodeal/ads/analytics/models/MediationEvent$WaterfallRoundFinish;", "Lcom/appodeal/ads/analytics/models/MediationEvent$WaterfallRoundStart;", "Lcom/appodeal/ads/analytics/models/MediationEvent$WaterfallStart;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MediationEvent extends Event {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006 "}, d2 = {"Lcom/appodeal/ads/analytics/models/MediationEvent$WaterfallCancel;", "Lcom/appodeal/ads/analytics/models/MediationEvent;", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "impressionId", "", "mainId", "result", "Lcom/appodeal/ads/analytics/models/WaterfallResult;", "<init>", "(Lcom/appodeal/ads/modules/common/internal/adtype/AdType;Ljava/lang/String;Ljava/lang/String;Lcom/appodeal/ads/analytics/models/WaterfallResult;)V", "getAdType", "()Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "getImpressionId", "()Ljava/lang/String;", "getMainId", "getResult", "()Lcom/appodeal/ads/analytics/models/WaterfallResult;", "name", "getName", "component1", "component2", "component3", "component4", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WaterfallCancel implements MediationEvent {
        private final AdType adType;
        private final String impressionId;
        private final String mainId;
        private final String name;
        private final WaterfallResult result;

        public WaterfallCancel(AdType adType, String impressionId, String mainId, WaterfallResult result) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(impressionId, "impressionId");
            Intrinsics.checkNotNullParameter(mainId, "mainId");
            Intrinsics.checkNotNullParameter(result, "result");
            this.adType = adType;
            this.impressionId = impressionId;
            this.mainId = mainId;
            this.result = result;
            this.name = "waterfall_cancel";
        }

        public static /* synthetic */ WaterfallCancel copy$default(WaterfallCancel waterfallCancel, AdType adType, String str, String str2, WaterfallResult waterfallResult, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adType = waterfallCancel.adType;
            }
            if ((i10 & 2) != 0) {
                str = waterfallCancel.impressionId;
            }
            if ((i10 & 4) != 0) {
                str2 = waterfallCancel.mainId;
            }
            if ((i10 & 8) != 0) {
                waterfallResult = waterfallCancel.result;
            }
            return waterfallCancel.copy(adType, str, str2, waterfallResult);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AdType getAdType() {
            return this.adType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getImpressionId() {
            return this.impressionId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMainId() {
            return this.mainId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final WaterfallResult getResult() {
            return this.result;
        }

        public final WaterfallCancel copy(AdType adType, String impressionId, String mainId, WaterfallResult result) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(impressionId, "impressionId");
            Intrinsics.checkNotNullParameter(mainId, "mainId");
            Intrinsics.checkNotNullParameter(result, "result");
            return new WaterfallCancel(adType, impressionId, mainId, result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaterfallCancel)) {
                return false;
            }
            WaterfallCancel waterfallCancel = (WaterfallCancel) other;
            return this.adType == waterfallCancel.adType && Intrinsics.areEqual(this.impressionId, waterfallCancel.impressionId) && Intrinsics.areEqual(this.mainId, waterfallCancel.mainId) && Intrinsics.areEqual(this.result, waterfallCancel.result);
        }

        public final AdType getAdType() {
            return this.adType;
        }

        public final String getImpressionId() {
            return this.impressionId;
        }

        public final String getMainId() {
            return this.mainId;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public final WaterfallResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode() + ((this.mainId.hashCode() + ((this.impressionId.hashCode() + (this.adType.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            return "WaterfallCancel(adType=" + this.adType + ", impressionId=" + this.impressionId + ", mainId=" + this.mainId + ", result=" + this.result + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006 "}, d2 = {"Lcom/appodeal/ads/analytics/models/MediationEvent$WaterfallFinish;", "Lcom/appodeal/ads/analytics/models/MediationEvent;", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "impressionId", "", "mainId", "result", "Lcom/appodeal/ads/analytics/models/WaterfallResult;", "<init>", "(Lcom/appodeal/ads/modules/common/internal/adtype/AdType;Ljava/lang/String;Ljava/lang/String;Lcom/appodeal/ads/analytics/models/WaterfallResult;)V", "getAdType", "()Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "getImpressionId", "()Ljava/lang/String;", "getMainId", "getResult", "()Lcom/appodeal/ads/analytics/models/WaterfallResult;", "name", "getName", "component1", "component2", "component3", "component4", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WaterfallFinish implements MediationEvent {
        private final AdType adType;
        private final String impressionId;
        private final String mainId;
        private final String name;
        private final WaterfallResult result;

        public WaterfallFinish(AdType adType, String impressionId, String mainId, WaterfallResult result) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(impressionId, "impressionId");
            Intrinsics.checkNotNullParameter(mainId, "mainId");
            Intrinsics.checkNotNullParameter(result, "result");
            this.adType = adType;
            this.impressionId = impressionId;
            this.mainId = mainId;
            this.result = result;
            this.name = "waterfall_finish";
        }

        public static /* synthetic */ WaterfallFinish copy$default(WaterfallFinish waterfallFinish, AdType adType, String str, String str2, WaterfallResult waterfallResult, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adType = waterfallFinish.adType;
            }
            if ((i10 & 2) != 0) {
                str = waterfallFinish.impressionId;
            }
            if ((i10 & 4) != 0) {
                str2 = waterfallFinish.mainId;
            }
            if ((i10 & 8) != 0) {
                waterfallResult = waterfallFinish.result;
            }
            return waterfallFinish.copy(adType, str, str2, waterfallResult);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AdType getAdType() {
            return this.adType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getImpressionId() {
            return this.impressionId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMainId() {
            return this.mainId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final WaterfallResult getResult() {
            return this.result;
        }

        public final WaterfallFinish copy(AdType adType, String impressionId, String mainId, WaterfallResult result) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(impressionId, "impressionId");
            Intrinsics.checkNotNullParameter(mainId, "mainId");
            Intrinsics.checkNotNullParameter(result, "result");
            return new WaterfallFinish(adType, impressionId, mainId, result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaterfallFinish)) {
                return false;
            }
            WaterfallFinish waterfallFinish = (WaterfallFinish) other;
            return this.adType == waterfallFinish.adType && Intrinsics.areEqual(this.impressionId, waterfallFinish.impressionId) && Intrinsics.areEqual(this.mainId, waterfallFinish.mainId) && Intrinsics.areEqual(this.result, waterfallFinish.result);
        }

        public final AdType getAdType() {
            return this.adType;
        }

        public final String getImpressionId() {
            return this.impressionId;
        }

        public final String getMainId() {
            return this.mainId;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public final WaterfallResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode() + ((this.mainId.hashCode() + ((this.impressionId.hashCode() + (this.adType.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            return "WaterfallFinish(adType=" + this.adType + ", impressionId=" + this.impressionId + ", mainId=" + this.mainId + ", result=" + this.result + ")";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006%"}, d2 = {"Lcom/appodeal/ads/analytics/models/MediationEvent$WaterfallRoundFinish;", "Lcom/appodeal/ads/analytics/models/MediationEvent;", "waterfallType", "Lcom/appodeal/ads/analytics/models/WaterfallType;", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "impressionId", "", "mainId", "result", "Lcom/appodeal/ads/analytics/models/WaterfallResult;", "<init>", "(Lcom/appodeal/ads/analytics/models/WaterfallType;Lcom/appodeal/ads/modules/common/internal/adtype/AdType;Ljava/lang/String;Ljava/lang/String;Lcom/appodeal/ads/analytics/models/WaterfallResult;)V", "getWaterfallType", "()Lcom/appodeal/ads/analytics/models/WaterfallType;", "getAdType", "()Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "getImpressionId", "()Ljava/lang/String;", "getMainId", "getResult", "()Lcom/appodeal/ads/analytics/models/WaterfallResult;", "name", "getName", "component1", "component2", "component3", "component4", "component5", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WaterfallRoundFinish implements MediationEvent {
        private final AdType adType;
        private final String impressionId;
        private final String mainId;
        private final String name;
        private final WaterfallResult result;
        private final WaterfallType waterfallType;

        public WaterfallRoundFinish(WaterfallType waterfallType, AdType adType, String impressionId, String mainId, WaterfallResult result) {
            Intrinsics.checkNotNullParameter(waterfallType, "waterfallType");
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(impressionId, "impressionId");
            Intrinsics.checkNotNullParameter(mainId, "mainId");
            Intrinsics.checkNotNullParameter(result, "result");
            this.waterfallType = waterfallType;
            this.adType = adType;
            this.impressionId = impressionId;
            this.mainId = mainId;
            this.result = result;
            this.name = "waterfall_round_finish";
        }

        public static /* synthetic */ WaterfallRoundFinish copy$default(WaterfallRoundFinish waterfallRoundFinish, WaterfallType waterfallType, AdType adType, String str, String str2, WaterfallResult waterfallResult, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                waterfallType = waterfallRoundFinish.waterfallType;
            }
            if ((i10 & 2) != 0) {
                adType = waterfallRoundFinish.adType;
            }
            if ((i10 & 4) != 0) {
                str = waterfallRoundFinish.impressionId;
            }
            if ((i10 & 8) != 0) {
                str2 = waterfallRoundFinish.mainId;
            }
            if ((i10 & 16) != 0) {
                waterfallResult = waterfallRoundFinish.result;
            }
            WaterfallResult waterfallResult2 = waterfallResult;
            String str3 = str;
            return waterfallRoundFinish.copy(waterfallType, adType, str3, str2, waterfallResult2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final WaterfallType getWaterfallType() {
            return this.waterfallType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AdType getAdType() {
            return this.adType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getImpressionId() {
            return this.impressionId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMainId() {
            return this.mainId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final WaterfallResult getResult() {
            return this.result;
        }

        public final WaterfallRoundFinish copy(WaterfallType waterfallType, AdType adType, String impressionId, String mainId, WaterfallResult result) {
            Intrinsics.checkNotNullParameter(waterfallType, "waterfallType");
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(impressionId, "impressionId");
            Intrinsics.checkNotNullParameter(mainId, "mainId");
            Intrinsics.checkNotNullParameter(result, "result");
            return new WaterfallRoundFinish(waterfallType, adType, impressionId, mainId, result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaterfallRoundFinish)) {
                return false;
            }
            WaterfallRoundFinish waterfallRoundFinish = (WaterfallRoundFinish) other;
            return Intrinsics.areEqual(this.waterfallType, waterfallRoundFinish.waterfallType) && this.adType == waterfallRoundFinish.adType && Intrinsics.areEqual(this.impressionId, waterfallRoundFinish.impressionId) && Intrinsics.areEqual(this.mainId, waterfallRoundFinish.mainId) && Intrinsics.areEqual(this.result, waterfallRoundFinish.result);
        }

        public final AdType getAdType() {
            return this.adType;
        }

        public final String getImpressionId() {
            return this.impressionId;
        }

        public final String getMainId() {
            return this.mainId;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public final WaterfallResult getResult() {
            return this.result;
        }

        public final WaterfallType getWaterfallType() {
            return this.waterfallType;
        }

        public int hashCode() {
            return this.result.hashCode() + ((this.mainId.hashCode() + ((this.impressionId.hashCode() + ((this.adType.hashCode() + (this.waterfallType.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "WaterfallRoundFinish(waterfallType=" + this.waterfallType + ", adType=" + this.adType + ", impressionId=" + this.impressionId + ", mainId=" + this.mainId + ", result=" + this.result + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006 "}, d2 = {"Lcom/appodeal/ads/analytics/models/MediationEvent$WaterfallRoundStart;", "Lcom/appodeal/ads/analytics/models/MediationEvent;", "waterfallType", "Lcom/appodeal/ads/analytics/models/WaterfallType;", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "impressionId", "", "mainId", "<init>", "(Lcom/appodeal/ads/analytics/models/WaterfallType;Lcom/appodeal/ads/modules/common/internal/adtype/AdType;Ljava/lang/String;Ljava/lang/String;)V", "getWaterfallType", "()Lcom/appodeal/ads/analytics/models/WaterfallType;", "getAdType", "()Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "getImpressionId", "()Ljava/lang/String;", "getMainId", "name", "getName", "component1", "component2", "component3", "component4", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WaterfallRoundStart implements MediationEvent {
        private final AdType adType;
        private final String impressionId;
        private final String mainId;
        private final String name;
        private final WaterfallType waterfallType;

        public WaterfallRoundStart(WaterfallType waterfallType, AdType adType, String impressionId, String mainId) {
            Intrinsics.checkNotNullParameter(waterfallType, "waterfallType");
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(impressionId, "impressionId");
            Intrinsics.checkNotNullParameter(mainId, "mainId");
            this.waterfallType = waterfallType;
            this.adType = adType;
            this.impressionId = impressionId;
            this.mainId = mainId;
            this.name = "waterfall_round_start";
        }

        public static /* synthetic */ WaterfallRoundStart copy$default(WaterfallRoundStart waterfallRoundStart, WaterfallType waterfallType, AdType adType, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                waterfallType = waterfallRoundStart.waterfallType;
            }
            if ((i10 & 2) != 0) {
                adType = waterfallRoundStart.adType;
            }
            if ((i10 & 4) != 0) {
                str = waterfallRoundStart.impressionId;
            }
            if ((i10 & 8) != 0) {
                str2 = waterfallRoundStart.mainId;
            }
            return waterfallRoundStart.copy(waterfallType, adType, str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final WaterfallType getWaterfallType() {
            return this.waterfallType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AdType getAdType() {
            return this.adType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getImpressionId() {
            return this.impressionId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMainId() {
            return this.mainId;
        }

        public final WaterfallRoundStart copy(WaterfallType waterfallType, AdType adType, String impressionId, String mainId) {
            Intrinsics.checkNotNullParameter(waterfallType, "waterfallType");
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(impressionId, "impressionId");
            Intrinsics.checkNotNullParameter(mainId, "mainId");
            return new WaterfallRoundStart(waterfallType, adType, impressionId, mainId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaterfallRoundStart)) {
                return false;
            }
            WaterfallRoundStart waterfallRoundStart = (WaterfallRoundStart) other;
            return Intrinsics.areEqual(this.waterfallType, waterfallRoundStart.waterfallType) && this.adType == waterfallRoundStart.adType && Intrinsics.areEqual(this.impressionId, waterfallRoundStart.impressionId) && Intrinsics.areEqual(this.mainId, waterfallRoundStart.mainId);
        }

        public final AdType getAdType() {
            return this.adType;
        }

        public final String getImpressionId() {
            return this.impressionId;
        }

        public final String getMainId() {
            return this.mainId;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public final WaterfallType getWaterfallType() {
            return this.waterfallType;
        }

        public int hashCode() {
            return this.mainId.hashCode() + ((this.impressionId.hashCode() + ((this.adType.hashCode() + (this.waterfallType.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            return "WaterfallRoundStart(waterfallType=" + this.waterfallType + ", adType=" + this.adType + ", impressionId=" + this.impressionId + ", mainId=" + this.mainId + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/appodeal/ads/analytics/models/MediationEvent$WaterfallStart;", "Lcom/appodeal/ads/analytics/models/MediationEvent;", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "impressionId", "", "mainId", "<init>", "(Lcom/appodeal/ads/modules/common/internal/adtype/AdType;Ljava/lang/String;Ljava/lang/String;)V", "getAdType", "()Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "getImpressionId", "()Ljava/lang/String;", "getMainId", "name", "getName", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WaterfallStart implements MediationEvent {
        private final AdType adType;
        private final String impressionId;
        private final String mainId;
        private final String name;

        public WaterfallStart(AdType adType, String impressionId, String mainId) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(impressionId, "impressionId");
            Intrinsics.checkNotNullParameter(mainId, "mainId");
            this.adType = adType;
            this.impressionId = impressionId;
            this.mainId = mainId;
            this.name = "waterfall_start";
        }

        public static /* synthetic */ WaterfallStart copy$default(WaterfallStart waterfallStart, AdType adType, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adType = waterfallStart.adType;
            }
            if ((i10 & 2) != 0) {
                str = waterfallStart.impressionId;
            }
            if ((i10 & 4) != 0) {
                str2 = waterfallStart.mainId;
            }
            return waterfallStart.copy(adType, str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AdType getAdType() {
            return this.adType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getImpressionId() {
            return this.impressionId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMainId() {
            return this.mainId;
        }

        public final WaterfallStart copy(AdType adType, String impressionId, String mainId) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(impressionId, "impressionId");
            Intrinsics.checkNotNullParameter(mainId, "mainId");
            return new WaterfallStart(adType, impressionId, mainId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaterfallStart)) {
                return false;
            }
            WaterfallStart waterfallStart = (WaterfallStart) other;
            return this.adType == waterfallStart.adType && Intrinsics.areEqual(this.impressionId, waterfallStart.impressionId) && Intrinsics.areEqual(this.mainId, waterfallStart.mainId);
        }

        public final AdType getAdType() {
            return this.adType;
        }

        public final String getImpressionId() {
            return this.impressionId;
        }

        public final String getMainId() {
            return this.mainId;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.mainId.hashCode() + ((this.impressionId.hashCode() + (this.adType.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "WaterfallStart(adType=" + this.adType + ", impressionId=" + this.impressionId + ", mainId=" + this.mainId + ")";
        }
    }
}
