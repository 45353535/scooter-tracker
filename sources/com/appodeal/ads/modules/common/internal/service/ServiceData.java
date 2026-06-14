package com.appodeal.ads.modules.common.internal.service;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.my.target.common.menu.MenuActionType;
import com.unity3d.services.core.fid.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceData;", "", MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APPSFLYER, "Adjust", "FacebookAnalytics", "Firebase", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData$Adjust;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData$AppsFlyer;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData$FacebookAnalytics;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData$Firebase;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ServiceData {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\f\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceData$Adjust;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData;", "", "attributionId", "", "", "conversionData", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "Ljava/lang/String;", "getAttributionId", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "getConversionData", "()Ljava/util/Map;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Adjust implements ServiceData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String attributionId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final Map conversionData;

        public Adjust(String attributionId, Map<String, ? extends Object> conversionData) {
            Intrinsics.checkNotNullParameter(attributionId, "attributionId");
            Intrinsics.checkNotNullParameter(conversionData, "conversionData");
            this.attributionId = attributionId;
            this.conversionData = conversionData;
        }

        public final String getAttributionId() {
            return this.attributionId;
        }

        public final Map<String, Object> getConversionData() {
            return this.conversionData;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\f\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceData$AppsFlyer;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData;", "", "attributionId", "", "", "conversionData", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "Ljava/lang/String;", "getAttributionId", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "getConversionData", "()Ljava/util/Map;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AppsFlyer implements ServiceData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String attributionId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final Map conversionData;

        public AppsFlyer(String attributionId, Map<String, ? extends Object> conversionData) {
            Intrinsics.checkNotNullParameter(attributionId, "attributionId");
            Intrinsics.checkNotNullParameter(conversionData, "conversionData");
            this.attributionId = attributionId;
            this.conversionData = conversionData;
        }

        public final String getAttributionId() {
            return this.attributionId;
        }

        public final Map<String, Object> getConversionData() {
            return this.conversionData;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceData$FacebookAnalytics;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData;", "", "userId", RemoteConfigConstants.RequestFieldKey.APP_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;)Lcom/appodeal/ads/modules/common/internal/service/ServiceData$FacebookAnalytics;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUserId", "b", "getAppId", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FacebookAnalytics implements ServiceData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final String userId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final String appId;

        public FacebookAnalytics(String str, String appId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            this.userId = str;
            this.appId = appId;
        }

        public static /* synthetic */ FacebookAnalytics copy$default(FacebookAnalytics facebookAnalytics, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = facebookAnalytics.userId;
            }
            if ((i10 & 2) != 0) {
                str2 = facebookAnalytics.appId;
            }
            return facebookAnalytics.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAppId() {
            return this.appId;
        }

        public final FacebookAnalytics copy(String userId, String appId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            return new FacebookAnalytics(userId, appId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FacebookAnalytics)) {
                return false;
            }
            FacebookAnalytics facebookAnalytics = (FacebookAnalytics) other;
            return Intrinsics.areEqual(this.userId, facebookAnalytics.userId) && Intrinsics.areEqual(this.appId, facebookAnalytics.appId);
        }

        public final String getAppId() {
            return this.appId;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            String str = this.userId;
            return this.appId.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return "FacebookAnalytics(userId=" + this.userId + ", appId=" + this.appId + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceData$Firebase;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData;", "", RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, "", "keywords", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", MenuActionType.COPY, "(Ljava/lang/String;Ljava/util/List;)Lcom/appodeal/ads/modules/common/internal/service/ServiceData$Firebase;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", Constants.GET_APP_INSTANCE_ID, "b", "Ljava/util/List;", "getKeywords", "getKeywordsAsString", "keywordsAsString", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Firebase implements ServiceData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final String appInstanceId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final List keywords;

        public Firebase(String appInstanceId, List<String> keywords) {
            Intrinsics.checkNotNullParameter(appInstanceId, "appInstanceId");
            Intrinsics.checkNotNullParameter(keywords, "keywords");
            this.appInstanceId = appInstanceId;
            this.keywords = keywords;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Firebase copy$default(Firebase firebase, String str, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = firebase.appInstanceId;
            }
            if ((i10 & 2) != 0) {
                list = firebase.keywords;
            }
            return firebase.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAppInstanceId() {
            return this.appInstanceId;
        }

        public final List<String> component2() {
            return this.keywords;
        }

        public final Firebase copy(String appInstanceId, List<String> keywords) {
            Intrinsics.checkNotNullParameter(appInstanceId, "appInstanceId");
            Intrinsics.checkNotNullParameter(keywords, "keywords");
            return new Firebase(appInstanceId, keywords);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Firebase)) {
                return false;
            }
            Firebase firebase = (Firebase) other;
            return Intrinsics.areEqual(this.appInstanceId, firebase.appInstanceId) && Intrinsics.areEqual(this.keywords, firebase.keywords);
        }

        public final String getAppInstanceId() {
            return this.appInstanceId;
        }

        public final List<String> getKeywords() {
            return this.keywords;
        }

        public final String getKeywordsAsString() {
            String strJoinToString$default = CollectionsKt.joinToString$default(this.keywords, ", ", null, null, 0, null, null, 62, null);
            if (StringsKt.y0(strJoinToString$default)) {
                return null;
            }
            return strJoinToString$default;
        }

        public int hashCode() {
            return this.keywords.hashCode() + (this.appInstanceId.hashCode() * 31);
        }

        public String toString() {
            return "Firebase(appInstanceId=" + this.appInstanceId + ", keywords=" + this.keywords + ")";
        }
    }
}
