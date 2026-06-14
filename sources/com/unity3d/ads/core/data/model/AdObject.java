package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import com.my.target.common.menu.MenuActionType;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import hg.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001B¸\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b.\u0010#J\u0010\u0010/\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b/\u00100J\u001b\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016HÆ\u0003¢\u0006\u0004\b3\u00102JÍ\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b6\u0010 J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010;\u001a\u00020\u00072\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010 R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010=\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010CR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010D\u001a\u0004\b\b\u0010#\"\u0004\bE\u0010FR$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010?\u001a\u0004\bG\u0010 \"\u0004\bH\u0010IR$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010?\u001a\u0004\bJ\u0010 \"\u0004\bK\u0010IR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010?\u001a\u0004\bL\u0010 \"\u0004\bM\u0010IR\"\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010D\u001a\u0004\b\f\u0010#\"\u0004\bN\u0010FR$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010?\u001a\u0004\bO\u0010 \"\u0004\bP\u0010IR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010Q\u001a\u0004\bR\u0010*R$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010?\u001a\u0004\bS\u0010 \"\u0004\bT\u0010IR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010U\u001a\u0004\bV\u0010-R\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\b\u0013\u0010#R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010W\u001a\u0004\bX\u00100R-\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0018\u0010Y\u001a\u0004\bZ\u00102\"\u0004\b[\u0010\\R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010Y\u001a\u0004\b]\u00102\"\u0004\b^\u0010\\\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006_"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdObject;", "", "Lcom/google/protobuf/ByteString;", "opportunityId", "", "placementId", HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, "", "isScarAd", "scarQueryId", "scarAdUnitId", "scarAdString", "isOfferwallAd", "offerwallPlacementName", "Lcom/unity3d/ads/adplayer/AdPlayer;", "adPlayer", "playerServerId", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "adType", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/time/b;", "ttl", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "state", "<init>", "(Lcom/google/protobuf/ByteString;Ljava/lang/String;Lcom/google/protobuf/ByteString;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/unity3d/ads/adplayer/AdPlayer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;ZLgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;)V", "component1", "()Lcom/google/protobuf/ByteString;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "component5", "component6", "component7", "component8", "component9", "component10", "()Lcom/unity3d/ads/adplayer/AdPlayer;", "component11", "component12", "()Lcom/unity3d/ads/UnityAdsLoadOptions;", "component13", "component14", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "component15", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "component16", MenuActionType.COPY, "(Lcom/google/protobuf/ByteString;Ljava/lang/String;Lcom/google/protobuf/ByteString;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/unity3d/ads/adplayer/AdPlayer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;ZLgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;)Lcom/unity3d/ads/core/data/model/AdObject;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/protobuf/ByteString;", "getOpportunityId", "Ljava/lang/String;", "getPlacementId", "getTrackingToken", "setTrackingToken", "(Lcom/google/protobuf/ByteString;)V", "Z", "setScarAd", "(Z)V", "getScarQueryId", "setScarQueryId", "(Ljava/lang/String;)V", "getScarAdUnitId", "setScarAdUnitId", "getScarAdString", "setScarAdString", "setOfferwallAd", "getOfferwallPlacementName", "setOfferwallPlacementName", "Lcom/unity3d/ads/adplayer/AdPlayer;", "getAdPlayer", "getPlayerServerId", "setPlayerServerId", "Lcom/unity3d/ads/UnityAdsLoadOptions;", "getLoadOptions", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "getAdType", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getTtl", "setTtl", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "getState", "setState", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AdObject {

    @Nullable
    private final AdPlayer adPlayer;

    @NotNull
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private boolean isScarAd;

    @NotNull
    private final UnityAdsLoadOptions loadOptions;

    @Nullable
    private String offerwallPlacementName;

    @NotNull
    private final ByteString opportunityId;

    @NotNull
    private final String placementId;

    @Nullable
    private String playerServerId;

    @Nullable
    private String scarAdString;

    @Nullable
    private String scarAdUnitId;

    @Nullable
    private String scarQueryId;

    @NotNull
    private MutableStateFlow state;

    @NotNull
    private ByteString trackingToken;

    @NotNull
    private MutableStateFlow ttl;

    public AdObject(@NotNull ByteString opportunityId, @NotNull String placementId, @NotNull ByteString trackingToken, boolean z10, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z11, @Nullable String str4, @Nullable AdPlayer adPlayer, @Nullable String str5, @NotNull UnityAdsLoadOptions loadOptions, boolean z12, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType adType, @NotNull MutableStateFlow ttl, @NotNull MutableStateFlow state) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(trackingToken, "trackingToken");
        Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(ttl, "ttl");
        Intrinsics.checkNotNullParameter(state, "state");
        this.opportunityId = opportunityId;
        this.placementId = placementId;
        this.trackingToken = trackingToken;
        this.isScarAd = z10;
        this.scarQueryId = str;
        this.scarAdUnitId = str2;
        this.scarAdString = str3;
        this.isOfferwallAd = z11;
        this.offerwallPlacementName = str4;
        this.adPlayer = adPlayer;
        this.playerServerId = str5;
        this.loadOptions = loadOptions;
        this.isHeaderBidding = z12;
        this.adType = adType;
        this.ttl = ttl;
        this.state = state;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsHeaderBidding() {
        return this.isHeaderBidding;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final MutableStateFlow getTtl() {
        return this.ttl;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final MutableStateFlow getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsScarAd() {
        return this.isScarAd;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getScarAdString() {
        return this.scarAdString;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsOfferwallAd() {
        return this.isOfferwallAd;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @NotNull
    public final AdObject copy(@NotNull ByteString opportunityId, @NotNull String placementId, @NotNull ByteString trackingToken, boolean isScarAd, @Nullable String scarQueryId, @Nullable String scarAdUnitId, @Nullable String scarAdString, boolean isOfferwallAd, @Nullable String offerwallPlacementName, @Nullable AdPlayer adPlayer, @Nullable String playerServerId, @NotNull UnityAdsLoadOptions loadOptions, boolean isHeaderBidding, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType adType, @NotNull MutableStateFlow ttl, @NotNull MutableStateFlow state) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(trackingToken, "trackingToken");
        Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(ttl, "ttl");
        Intrinsics.checkNotNullParameter(state, "state");
        return new AdObject(opportunityId, placementId, trackingToken, isScarAd, scarQueryId, scarAdUnitId, scarAdString, isOfferwallAd, offerwallPlacementName, adPlayer, playerServerId, loadOptions, isHeaderBidding, adType, ttl, state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) other;
        return Intrinsics.areEqual(this.opportunityId, adObject.opportunityId) && Intrinsics.areEqual(this.placementId, adObject.placementId) && Intrinsics.areEqual(this.trackingToken, adObject.trackingToken) && this.isScarAd == adObject.isScarAd && Intrinsics.areEqual(this.scarQueryId, adObject.scarQueryId) && Intrinsics.areEqual(this.scarAdUnitId, adObject.scarAdUnitId) && Intrinsics.areEqual(this.scarAdString, adObject.scarAdString) && this.isOfferwallAd == adObject.isOfferwallAd && Intrinsics.areEqual(this.offerwallPlacementName, adObject.offerwallPlacementName) && Intrinsics.areEqual(this.adPlayer, adObject.adPlayer) && Intrinsics.areEqual(this.playerServerId, adObject.playerServerId) && Intrinsics.areEqual(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && Intrinsics.areEqual(this.ttl, adObject.ttl) && Intrinsics.areEqual(this.state, adObject.state);
    }

    @Nullable
    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    @NotNull
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    @NotNull
    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    @Nullable
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @NotNull
    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    @Nullable
    public final String getScarAdString() {
        return this.scarAdString;
    }

    @Nullable
    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    @Nullable
    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    @NotNull
    public final MutableStateFlow getState() {
        return this.state;
    }

    @NotNull
    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    @NotNull
    public final MutableStateFlow getTtl() {
        return this.ttl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.opportunityId.hashCode() * 31) + this.placementId.hashCode()) * 31) + this.trackingToken.hashCode()) * 31;
        boolean z10 = this.isScarAd;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        int i10 = (iHashCode + r12) * 31;
        String str = this.scarQueryId;
        int iHashCode2 = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scarAdUnitId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z11 = this.isOfferwallAd;
        ?? r13 = z11;
        if (z11) {
            r13 = 1;
        }
        int i11 = (iHashCode4 + r13) * 31;
        String str4 = this.offerwallPlacementName;
        int iHashCode5 = (i11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int iHashCode6 = (iHashCode5 + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str5 = this.playerServerId;
        int iHashCode7 = (((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.loadOptions.hashCode()) * 31;
        boolean z12 = this.isHeaderBidding;
        return ((((((iHashCode7 + (z12 ? 1 : z12)) * 31) + this.adType.hashCode()) * 31) + this.ttl.hashCode()) * 31) + this.state.hashCode();
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setOfferwallAd(boolean z10) {
        this.isOfferwallAd = z10;
    }

    public final void setOfferwallPlacementName(@Nullable String str) {
        this.offerwallPlacementName = str;
    }

    public final void setPlayerServerId(@Nullable String str) {
        this.playerServerId = str;
    }

    public final void setScarAd(boolean z10) {
        this.isScarAd = z10;
    }

    public final void setScarAdString(@Nullable String str) {
        this.scarAdString = str;
    }

    public final void setScarAdUnitId(@Nullable String str) {
        this.scarAdUnitId = str;
    }

    public final void setScarQueryId(@Nullable String str) {
        this.scarQueryId = str;
    }

    public final void setState(@NotNull MutableStateFlow mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.state = mutableStateFlow;
    }

    public final void setTrackingToken(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public final void setTtl(@NotNull MutableStateFlow mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.ttl = mutableStateFlow;
    }

    @NotNull
    public String toString() {
        return "AdObject(opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdUnitId=" + this.scarAdUnitId + ", scarAdString=" + this.scarAdString + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ", ttl=" + this.ttl + ", state=" + this.state + ')';
    }

    public /* synthetic */ AdObject(ByteString byteString, String str, ByteString byteString2, boolean z10, String str2, String str3, String str4, boolean z11, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z12, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, MutableStateFlow mutableStateFlow, MutableStateFlow mutableStateFlow2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteString, str, byteString2, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? false : z11, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : adPlayer, (i10 & 1024) != 0 ? null : str6, unityAdsLoadOptions, z12, diagnosticAdType, (i10 & 16384) != 0 ? l0.a(null) : mutableStateFlow, (i10 & 32768) != 0 ? l0.a(AdObjectState.INIT) : mutableStateFlow2);
    }
}
