package com.unity3d.ads.core.domain.scar;

import com.my.target.common.menu.MenuActionType;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.banners.bridge.BannerBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019Jb\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b)\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b*\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b+\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010\u0019¨\u0006."}, d2 = {"Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "", "Lcom/unity3d/scar/adapter/common/c;", "gmaEvent", "Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "bannerEvent", "", "opportunityId", "placementId", HandleInvocationsFromAdViewer.KEY_QUERY_ID, "errorMessage", "", "errorCode", "<init>", "(Lcom/unity3d/scar/adapter/common/c;Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Lcom/unity3d/scar/adapter/common/c;", "component2", "()Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Ljava/lang/Integer;", MenuActionType.COPY, "(Lcom/unity3d/scar/adapter/common/c;Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/unity3d/scar/adapter/common/c;", "getGmaEvent", "Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "getBannerEvent", "Ljava/lang/String;", "getOpportunityId", "getPlacementId", "getQueryId", "getErrorMessage", "Ljava/lang/Integer;", "getErrorCode", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GmaEventData {

    @Nullable
    private final BannerBridge.BannerEvent bannerEvent;

    @Nullable
    private final Integer errorCode;

    @Nullable
    private final String errorMessage;

    @NotNull
    private final c gmaEvent;

    @Nullable
    private final String opportunityId;

    @Nullable
    private final String placementId;

    @Nullable
    private final String queryId;

    public GmaEventData(@NotNull c gmaEvent, @Nullable BannerBridge.BannerEvent bannerEvent, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(gmaEvent, "gmaEvent");
        this.gmaEvent = gmaEvent;
        this.bannerEvent = bannerEvent;
        this.opportunityId = str;
        this.placementId = str2;
        this.queryId = str3;
        this.errorMessage = str4;
        this.errorCode = num;
    }

    public static /* synthetic */ GmaEventData copy$default(GmaEventData gmaEventData, c cVar, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = gmaEventData.gmaEvent;
        }
        if ((i10 & 2) != 0) {
            bannerEvent = gmaEventData.bannerEvent;
        }
        if ((i10 & 4) != 0) {
            str = gmaEventData.opportunityId;
        }
        if ((i10 & 8) != 0) {
            str2 = gmaEventData.placementId;
        }
        if ((i10 & 16) != 0) {
            str3 = gmaEventData.queryId;
        }
        if ((i10 & 32) != 0) {
            str4 = gmaEventData.errorMessage;
        }
        if ((i10 & 64) != 0) {
            num = gmaEventData.errorCode;
        }
        String str5 = str4;
        Integer num2 = num;
        String str6 = str3;
        String str7 = str;
        return gmaEventData.copy(cVar, bannerEvent, str7, str2, str6, str5, num2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final c getGmaEvent() {
        return this.gmaEvent;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BannerBridge.BannerEvent getBannerEvent() {
        return this.bannerEvent;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOpportunityId() {
        return this.opportunityId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getQueryId() {
        return this.queryId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final GmaEventData copy(@NotNull c gmaEvent, @Nullable BannerBridge.BannerEvent bannerEvent, @Nullable String opportunityId, @Nullable String placementId, @Nullable String queryId, @Nullable String errorMessage, @Nullable Integer errorCode) {
        Intrinsics.checkNotNullParameter(gmaEvent, "gmaEvent");
        return new GmaEventData(gmaEvent, bannerEvent, opportunityId, placementId, queryId, errorMessage, errorCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GmaEventData)) {
            return false;
        }
        GmaEventData gmaEventData = (GmaEventData) other;
        return this.gmaEvent == gmaEventData.gmaEvent && this.bannerEvent == gmaEventData.bannerEvent && Intrinsics.areEqual(this.opportunityId, gmaEventData.opportunityId) && Intrinsics.areEqual(this.placementId, gmaEventData.placementId) && Intrinsics.areEqual(this.queryId, gmaEventData.queryId) && Intrinsics.areEqual(this.errorMessage, gmaEventData.errorMessage) && Intrinsics.areEqual(this.errorCode, gmaEventData.errorCode);
    }

    @Nullable
    public final BannerBridge.BannerEvent getBannerEvent() {
        return this.bannerEvent;
    }

    @Nullable
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final c getGmaEvent() {
        return this.gmaEvent;
    }

    @Nullable
    public final String getOpportunityId() {
        return this.opportunityId;
    }

    @Nullable
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final String getQueryId() {
        return this.queryId;
    }

    public int hashCode() {
        int iHashCode = this.gmaEvent.hashCode() * 31;
        BannerBridge.BannerEvent bannerEvent = this.bannerEvent;
        int iHashCode2 = (iHashCode + (bannerEvent == null ? 0 : bannerEvent.hashCode())) * 31;
        String str = this.opportunityId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placementId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.queryId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorMessage;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.errorCode;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GmaEventData(gmaEvent=" + this.gmaEvent + ", bannerEvent=" + this.bannerEvent + ", opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", queryId=" + this.queryId + ", errorMessage=" + this.errorMessage + ", errorCode=" + this.errorCode + ')';
    }

    public /* synthetic */ GmaEventData(c cVar, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i10 & 2) != 0 ? null : bannerEvent, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : num);
    }
}
