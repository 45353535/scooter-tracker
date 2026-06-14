package com.appodeal.ads.analytics.models;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/appodeal/ads/analytics/models/AdImpressionEvent;", "Lcom/appodeal/ads/analytics/models/Event;", "adImpressionParams", "Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;", "getAdImpressionParams", "()Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;", "AdShown", "AdShowFailed", "AdClicked", "AdClosed", "AdViewRender", "AdRewarded", "Lcom/appodeal/ads/analytics/models/AdImpressionEvent$AdClicked;", "Lcom/appodeal/ads/analytics/models/AdImpressionEvent$AdClosed;", "Lcom/appodeal/ads/analytics/models/AdImpressionEvent$AdRewarded;", "Lcom/appodeal/ads/analytics/models/AdImpressionEvent$AdShowFailed;", "Lcom/appodeal/ads/analytics/models/AdImpressionEvent$AdShown;", "Lcom/appodeal/ads/analytics/models/AdImpressionEvent$AdViewRender;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdImpressionEvent extends Event {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/appodeal/ads/analytics/models/AdImpressionEvent$AdClicked;", "Lcom/appodeal/ads/analytics/models/AdImpressionEvent;", "adImpressionParams", "Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;", "<init>", "(Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;)V", "getAdImpressionParams", "()Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;", "name", "", "getName", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AdClicked implements AdImpressionEvent {
        private final GeneralAdImpressionParams adImpressionParams;
        private final String name;

        public AdClicked(GeneralAdImpressionParams adImpressionParams) {
            Intrinsics.checkNotNullParameter(adImpressionParams, "adImpressionParams");
            this.adImpressionParams = adImpressionParams;
            this.name = "ad_clicked";
        }

        public static /* synthetic */ AdClicked copy$default(AdClicked adClicked, GeneralAdImpressionParams generalAdImpressionParams, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                generalAdImpressionParams = adClicked.adImpressionParams;
            }
            return adClicked.copy(generalAdImpressionParams);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GeneralAdImpressionParams getAdImpressionParams() {
            return this.adImpressionParams;
        }

        public final AdClicked copy(GeneralAdImpressionParams adImpressionParams) {
            Intrinsics.checkNotNullParameter(adImpressionParams, "adImpressionParams");
            return new AdClicked(adImpressionParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdClicked) && Intrinsics.areEqual(this.adImpressionParams, ((AdClicked) other).adImpressionParams);
        }

        @Override // com.appodeal.ads.analytics.models.AdImpressionEvent
        public GeneralAdImpressionParams getAdImpressionParams() {
            return this.adImpressionParams;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.adImpressionParams.hashCode();
        }

        public String toString() {
            return "AdClicked(adImpressionParams=" + this.adImpressionParams + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/appodeal/ads/analytics/models/AdImpressionEvent$AdClosed;", "Lcom/appodeal/ads/analytics/models/AdImpressionEvent;", "adImpressionParams", "Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;", "<init>", "(Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;)V", "getAdImpressionParams", "()Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;", "name", "", "getName", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AdClosed implements AdImpressionEvent {
        private final GeneralAdImpressionParams adImpressionParams;
        private final String name;

        public AdClosed(GeneralAdImpressionParams adImpressionParams) {
            Intrinsics.checkNotNullParameter(adImpressionParams, "adImpressionParams");
            this.adImpressionParams = adImpressionParams;
            this.name = "ad_closed";
        }

        public static /* synthetic */ AdClosed copy$default(AdClosed adClosed, GeneralAdImpressionParams generalAdImpressionParams, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                generalAdImpressionParams = adClosed.adImpressionParams;
            }
            return adClosed.copy(generalAdImpressionParams);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GeneralAdImpressionParams getAdImpressionParams() {
            return this.adImpressionParams;
        }

        public final AdClosed copy(GeneralAdImpressionParams adImpressionParams) {
            Intrinsics.checkNotNullParameter(adImpressionParams, "adImpressionParams");
            return new AdClosed(adImpressionParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdClosed) && Intrinsics.areEqual(this.adImpressionParams, ((AdClosed) other).adImpressionParams);
        }

        @Override // com.appodeal.ads.analytics.models.AdImpressionEvent
        public GeneralAdImpressionParams getAdImpressionParams() {
            return this.adImpressionParams;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.adImpressionParams.hashCode();
        }

        public String toString() {
            return "AdClosed(adImpressionParams=" + this.adImpressionParams + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/appodeal/ads/analytics/models/AdImpressionEvent$AdRewarded;", "Lcom/appodeal/ads/analytics/models/AdImpressionEvent;", "adImpressionParams", "Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;", "<init>", "(Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;)V", "getAdImpressionParams", "()Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;", "name", "", "getName", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AdRewarded implements AdImpressionEvent {
        private final GeneralAdImpressionParams adImpressionParams;
        private final String name;

        public AdRewarded(GeneralAdImpressionParams adImpressionParams) {
            Intrinsics.checkNotNullParameter(adImpressionParams, "adImpressionParams");
            this.adImpressionParams = adImpressionParams;
            this.name = "ad_rewarded";
        }

        public static /* synthetic */ AdRewarded copy$default(AdRewarded adRewarded, GeneralAdImpressionParams generalAdImpressionParams, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                generalAdImpressionParams = adRewarded.adImpressionParams;
            }
            return adRewarded.copy(generalAdImpressionParams);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GeneralAdImpressionParams getAdImpressionParams() {
            return this.adImpressionParams;
        }

        public final AdRewarded copy(GeneralAdImpressionParams adImpressionParams) {
            Intrinsics.checkNotNullParameter(adImpressionParams, "adImpressionParams");
            return new AdRewarded(adImpressionParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdRewarded) && Intrinsics.areEqual(this.adImpressionParams, ((AdRewarded) other).adImpressionParams);
        }

        @Override // com.appodeal.ads.analytics.models.AdImpressionEvent
        public GeneralAdImpressionParams getAdImpressionParams() {
            return this.adImpressionParams;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.adImpressionParams.hashCode();
        }

        public String toString() {
            return "AdRewarded(adImpressionParams=" + this.adImpressionParams + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/appodeal/ads/analytics/models/AdImpressionEvent$AdShowFailed;", "Lcom/appodeal/ads/analytics/models/AdImpressionEvent;", "adImpressionParams", "Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;", "networkError", "", "appodealSdkError", "<init>", "(Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;Ljava/lang/String;Ljava/lang/String;)V", "getAdImpressionParams", "()Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;", "getNetworkError", "()Ljava/lang/String;", "getAppodealSdkError", "name", "getName", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AdShowFailed implements AdImpressionEvent {
        private final GeneralAdImpressionParams adImpressionParams;
        private final String appodealSdkError;
        private final String name;
        private final String networkError;

        public AdShowFailed(GeneralAdImpressionParams adImpressionParams, String str, String str2) {
            Intrinsics.checkNotNullParameter(adImpressionParams, "adImpressionParams");
            this.adImpressionParams = adImpressionParams;
            this.networkError = str;
            this.appodealSdkError = str2;
            this.name = "ad_show_failed";
        }

        public static /* synthetic */ AdShowFailed copy$default(AdShowFailed adShowFailed, GeneralAdImpressionParams generalAdImpressionParams, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                generalAdImpressionParams = adShowFailed.adImpressionParams;
            }
            if ((i10 & 2) != 0) {
                str = adShowFailed.networkError;
            }
            if ((i10 & 4) != 0) {
                str2 = adShowFailed.appodealSdkError;
            }
            return adShowFailed.copy(generalAdImpressionParams, str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GeneralAdImpressionParams getAdImpressionParams() {
            return this.adImpressionParams;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getNetworkError() {
            return this.networkError;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAppodealSdkError() {
            return this.appodealSdkError;
        }

        public final AdShowFailed copy(GeneralAdImpressionParams adImpressionParams, String networkError, String appodealSdkError) {
            Intrinsics.checkNotNullParameter(adImpressionParams, "adImpressionParams");
            return new AdShowFailed(adImpressionParams, networkError, appodealSdkError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdShowFailed)) {
                return false;
            }
            AdShowFailed adShowFailed = (AdShowFailed) other;
            return Intrinsics.areEqual(this.adImpressionParams, adShowFailed.adImpressionParams) && Intrinsics.areEqual(this.networkError, adShowFailed.networkError) && Intrinsics.areEqual(this.appodealSdkError, adShowFailed.appodealSdkError);
        }

        @Override // com.appodeal.ads.analytics.models.AdImpressionEvent
        public GeneralAdImpressionParams getAdImpressionParams() {
            return this.adImpressionParams;
        }

        public final String getAppodealSdkError() {
            return this.appodealSdkError;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public final String getNetworkError() {
            return this.networkError;
        }

        public int hashCode() {
            int iHashCode = this.adImpressionParams.hashCode() * 31;
            String str = this.networkError;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.appodealSdkError;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "AdShowFailed(adImpressionParams=" + this.adImpressionParams + ", networkError=" + this.networkError + ", appodealSdkError=" + this.appodealSdkError + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/appodeal/ads/analytics/models/AdImpressionEvent$AdShown;", "Lcom/appodeal/ads/analytics/models/AdImpressionEvent;", "adImpressionParams", "Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;", "<init>", "(Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;)V", "getAdImpressionParams", "()Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;", "name", "", "getName", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AdShown implements AdImpressionEvent {
        private final GeneralAdImpressionParams adImpressionParams;
        private final String name;

        public AdShown(GeneralAdImpressionParams adImpressionParams) {
            Intrinsics.checkNotNullParameter(adImpressionParams, "adImpressionParams");
            this.adImpressionParams = adImpressionParams;
            this.name = "ad_shown";
        }

        public static /* synthetic */ AdShown copy$default(AdShown adShown, GeneralAdImpressionParams generalAdImpressionParams, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                generalAdImpressionParams = adShown.adImpressionParams;
            }
            return adShown.copy(generalAdImpressionParams);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GeneralAdImpressionParams getAdImpressionParams() {
            return this.adImpressionParams;
        }

        public final AdShown copy(GeneralAdImpressionParams adImpressionParams) {
            Intrinsics.checkNotNullParameter(adImpressionParams, "adImpressionParams");
            return new AdShown(adImpressionParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdShown) && Intrinsics.areEqual(this.adImpressionParams, ((AdShown) other).adImpressionParams);
        }

        @Override // com.appodeal.ads.analytics.models.AdImpressionEvent
        public GeneralAdImpressionParams getAdImpressionParams() {
            return this.adImpressionParams;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.adImpressionParams.hashCode();
        }

        public String toString() {
            return "AdShown(adImpressionParams=" + this.adImpressionParams + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/appodeal/ads/analytics/models/AdImpressionEvent$AdViewRender;", "Lcom/appodeal/ads/analytics/models/AdImpressionEvent;", "adImpressionParams", "Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;", "<init>", "(Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;)V", "getAdImpressionParams", "()Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;", "name", "", "getName", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AdViewRender implements AdImpressionEvent {
        private final GeneralAdImpressionParams adImpressionParams;
        private final String name;

        public AdViewRender(GeneralAdImpressionParams adImpressionParams) {
            Intrinsics.checkNotNullParameter(adImpressionParams, "adImpressionParams");
            this.adImpressionParams = adImpressionParams;
            this.name = "ad_view_render";
        }

        public static /* synthetic */ AdViewRender copy$default(AdViewRender adViewRender, GeneralAdImpressionParams generalAdImpressionParams, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                generalAdImpressionParams = adViewRender.adImpressionParams;
            }
            return adViewRender.copy(generalAdImpressionParams);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GeneralAdImpressionParams getAdImpressionParams() {
            return this.adImpressionParams;
        }

        public final AdViewRender copy(GeneralAdImpressionParams adImpressionParams) {
            Intrinsics.checkNotNullParameter(adImpressionParams, "adImpressionParams");
            return new AdViewRender(adImpressionParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdViewRender) && Intrinsics.areEqual(this.adImpressionParams, ((AdViewRender) other).adImpressionParams);
        }

        @Override // com.appodeal.ads.analytics.models.AdImpressionEvent
        public GeneralAdImpressionParams getAdImpressionParams() {
            return this.adImpressionParams;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.adImpressionParams.hashCode();
        }

        public String toString() {
            return "AdViewRender(adImpressionParams=" + this.adImpressionParams + ")";
        }
    }

    GeneralAdImpressionParams getAdImpressionParams();
}
