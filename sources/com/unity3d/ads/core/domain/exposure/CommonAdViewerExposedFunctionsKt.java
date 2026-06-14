package com.unity3d.ads.core.domain.exposure;

import android.util.Base64;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.utils.ContinuationFromCallback;
import com.unity3d.services.core.api.Storage;
import com.unity3d.services.core.network.model.RequestType;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.e0;
import kotlin.time.b;
import kotlin.time.c;
import kotlinx.coroutines.flow.MutableStateFlow;
import of.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u000b\u0010\u0007\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u000b\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u001b\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001aH\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u000b\u0010\u001f\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u0013\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010#\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010$\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010%\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010&\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u000b\u0010'\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u0013\u0010(\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010)\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010*\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010+\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010,\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000ø\u0001\u0000\u001a\u0013\u0010-\u001a\u00020\u00012\u0006\u0010.\u001a\u00020/H\u0000ø\u0001\u0000\u001a\u0013\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u000202H\u0000ø\u0001\u0000\u001a\u001b\u00103\u001a\u00020\u00012\u0006\u00103\u001a\u0002042\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u00105\u001a\u00020\u00012\u0006\u00105\u001a\u0002062\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u00107\u001a\u00020\u00012\u0006\u00108\u001a\u0002092\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010:\u001a\u00020\u00012\u0006\u0010:\u001a\u00020;2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020>H\u0000ø\u0001\u0000\u001a\u001b\u0010?\u001a\u00020\u00012\u0006\u0010@\u001a\u00020A2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010B\u001a\u00020\u00012\u0006\u0010B\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010D\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010E\u001a\u00020FH\u0000ø\u0001\u0000\u001a\u000b\u0010G\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u001b\u0010H\u001a\u00020\u00012\u0006\u0010I\u001a\u00020J2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0000ø\u0001\u0000\u001a\u001b\u0010P\u001a\u00020\u00012\u0006\u0010P\u001a\u00020Q2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010R\u001a\u00020\u00012\u0006\u0010S\u001a\u00020T2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010U\u001a\u00020\u00012\u0006\u0010U\u001a\u00020VH\u0000ø\u0001\u0000\u001a\u0013\u0010W\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010X\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010Y\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010Z\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010[\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u000b\u0010\\\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u000b\u0010]\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u000b\u0010^\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u001b\u0010_\u001a\u00020\u00012\u0006\u00108\u001a\u0002092\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010`\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u000b\u0010a\u001a\u00020\u0001H\u0000ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006b"}, d2 = {"attributionRegisterClick", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "androidAttribution", "Lcom/unity3d/ads/core/domain/attribution/AndroidAttribution;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "attributionRegisterView", "clearStorage", "deleteStorage", NativeAdPresenter.DOWNLOAD, "cacheFile", "Lcom/unity3d/ads/core/domain/CacheFile;", "getAdContext", "getAndroidAdPlayerContext", "Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;", "adData", "Lcom/unity3d/ads/core/data/model/AdData;", HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, "Lcom/unity3d/ads/core/data/model/ImpressionConfig;", HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, "Lcom/unity3d/ads/core/data/model/AdDataRefreshToken;", "isOMActivated", "Lcom/unity3d/ads/core/domain/om/IsOMActivated;", "getAdContext-yLuu4LI", "(Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/domain/om/IsOMActivated;Lcom/unity3d/ads/core/data/model/AdObject;)Lcom/unity3d/ads/adplayer/ExposedFunction;", "getAllowedPii", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "getConnectionType", "getDeviceMaxVolume", "getDeviceVolume", "getKeysStorage", "getPrivacy", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "getPrivacyFsm", "getScreenHeight", "getScreenWidth", "getSessionToken", "getStorage", "hbTokenIncrementStarts", "hbTokenIncrementWins", "hbTokenReset", "incrementBannerImpressionCount", "isAttributionAvailable", "isFileCached", "getIfFileCache", "Lcom/unity3d/ads/core/domain/GetIsFileCache;", "isOfferwallAdReady", "getIsOfferwallAdReady", "Lcom/unity3d/ads/core/domain/offerwall/GetIsOfferwallAdReady;", "loadOfferwallAd", "Lcom/unity3d/ads/core/domain/offerwall/LoadOfferwallAd;", "loadScarAd", "Lcom/unity3d/ads/core/domain/scar/LoadScarAd;", "markCampaignStateShown", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "omFinishSession", "Lcom/unity3d/ads/core/domain/om/OmFinishSession;", "omGetData", "getOmData", "Lcom/unity3d/ads/core/domain/om/GetOmData;", "omImpression", "omImpressionOccurred", "Lcom/unity3d/ads/core/domain/om/OmImpressionOccurred;", "omStartSession", "Lcom/unity3d/ads/core/domain/om/AndroidOmInteraction;", "openUrl", "handleOpenUrl", "Lcom/unity3d/ads/core/domain/HandleOpenUrl;", "readStorage", "refreshAdData", ToolBar.REFRESH, "Lcom/unity3d/ads/core/domain/Refresh;", "request", "type", "Lcom/unity3d/services/core/network/model/RequestType;", "executeAdViewerRequest", "Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendOperativeEvent", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "sendPrivacyUpdateRequest", "Lcom/unity3d/ads/core/domain/SendPrivacyUpdateRequest;", "setAllowedPii", "setOpportunityTTL", "setOrientation", "setPrivacy", "setPrivacyFsm", "setStorage", "showOfferwallAd", "showScarAd", "updateCampaignState", "updateTrackingToken", "writeStorage", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CommonAdViewerExposedFunctionsKt {

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48031 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ CacheFile $cacheFile;

        C48031(CacheFile cacheFile, AdObject adObject) {
            this.$cacheFile = cacheFile;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r9) throws org.json.JSONException {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1
                if (r0 == 0) goto L14
                r0 = r9
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.label = r1
            L12:
                r6 = r0
                goto L1a
            L14:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1
                r0.<init>(r7, r9)
                goto L12
            L1a:
                java.lang.Object r9 = r6.result
                java.lang.Object r0 = pf.b.g()
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L33
                if (r1 != r2) goto L2b
                kotlin.d.b(r9)
                goto L65
            L2b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L33:
                kotlin.d.b(r9)
                r9 = 0
                r1 = r8[r9]
                java.lang.String r3 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r3)
                org.json.JSONObject r1 = (org.json.JSONObject) r1
                java.lang.String r3 = "url"
                r4 = r2
                java.lang.String r2 = r1.getString(r3)
                r5 = 2
                java.lang.Object r8 = kotlin.collections.ArraysKt.getOrNull(r8, r5)
                org.json.JSONArray r8 = (org.json.JSONArray) r8
                java.lang.String r5 = "priority"
                int r5 = r1.optInt(r5, r9)
                com.unity3d.ads.core.domain.CacheFile r1 = r7.$cacheFile
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                com.unity3d.ads.core.data.model.AdObject r3 = r7.$adObject
                r6.label = r4
                r4 = r8
                java.lang.Object r9 = r1.invoke(r2, r3, r4, r5, r6)
                if (r9 != r0) goto L65
                return r0
            L65:
                com.unity3d.ads.core.data.model.CacheResult r9 = (com.unity3d.ads.core.data.model.CacheResult) r9
                boolean r8 = r9 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                if (r8 == 0) goto L87
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "unity-ads-cache://unity.ads.cache/"
                r8.append(r0)
                com.unity3d.ads.core.data.model.CacheResult$Success r9 = (com.unity3d.ads.core.data.model.CacheResult.Success) r9
                com.unity3d.ads.core.data.model.CachedFile r9 = r9.getCachedFile()
                java.lang.String r9 = r9.getName()
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                return r8
            L87:
                boolean r8 = r9 instanceof com.unity3d.ads.core.data.model.CacheResult.Failure
                if (r8 == 0) goto L9f
                com.unity3d.ads.core.data.model.CacheResult$Failure r9 = (com.unity3d.ads.core.data.model.CacheResult.Failure) r9
                com.unity3d.ads.core.data.model.CacheError r8 = r9.getError()
                java.lang.String r8 = r8.name()
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
            L9f:
                lf.m r8 = new lf.m
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48031.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48091 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        C48091(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1
                if (r4 == 0) goto L13
                r4 = r5
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.result
                java.lang.Object r0 = pf.b.g()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L29
                kotlin.d.b(r5)
                goto L3f
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                kotlin.d.b(r5)
                com.unity3d.ads.core.data.repository.SessionRepository r5 = r3.$sessionRepository
                r4.label = r2
                java.lang.Object r5 = r5.getPrivacy(r4)
                if (r5 != r0) goto L3f
                return r0
            L3f:
                com.google.protobuf.ByteString r5 = (com.google.protobuf.ByteString) r5
                r4 = 0
                r0 = 0
                java.lang.String r4 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r5, r4, r2, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48091.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48101 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        C48101(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1
                if (r4 == 0) goto L13
                r4 = r5
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.result
                java.lang.Object r0 = pf.b.g()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L29
                kotlin.d.b(r5)
                goto L3f
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                kotlin.d.b(r5)
                com.unity3d.ads.core.data.repository.SessionRepository r5 = r3.$sessionRepository
                r4.label = r2
                java.lang.Object r5 = r5.getPrivacyFsm(r4)
                if (r5 != r0) goto L3f
                return r0
            L3f:
                com.google.protobuf.ByteString r5 = (com.google.protobuf.ByteString) r5
                r4 = 0
                r0 = 0
                java.lang.String r4 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r5, r4, r2, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48101.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "args", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48221 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ LoadOfferwallAd $loadOfferwallAd;

        C48221(AdObject adObject, LoadOfferwallAd loadOfferwallAd) {
            this.$adObject = adObject;
            this.$loadOfferwallAd = loadOfferwallAd;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.d.b(r6)
                goto L5c
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.d.b(r6)
                r6 = 0
                r5 = r5[r6]
                java.lang.String r6 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r6)
                org.json.JSONObject r5 = (org.json.JSONObject) r5
                java.lang.String r6 = "placementName"
                java.lang.String r5 = r5.optString(r6)
                com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
                r2.setOfferwallAd(r3)
                com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
                r2.setOfferwallPlacementName(r5)
                com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd r2 = r4.$loadOfferwallAd
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                r0.label = r3
                java.lang.Object r5 = r2.invoke(r5, r0)
                if (r5 != r1) goto L5c
                return r1
            L5c:
                kotlin.Unit r5 = kotlin.Unit.f93236a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48221.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "args", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48231 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ LoadScarAd $loadScarAd;

        C48231(AdObject adObject, LoadScarAd loadScarAd) {
            this.$adObject = adObject;
            this.$loadScarAd = loadScarAd;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1
                if (r0 == 0) goto L14
                r0 = r13
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.label = r1
            L12:
                r8 = r0
                goto L1a
            L14:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1
                r0.<init>(r11, r13)
                goto L12
            L1a:
                java.lang.Object r13 = r8.result
                java.lang.Object r0 = pf.b.g()
                int r1 = r8.label
                r2 = 1
                if (r1 == 0) goto L33
                if (r1 != r2) goto L2b
                kotlin.d.b(r13)
                goto L96
            L2b:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L33:
                kotlin.d.b(r13)
                r13 = 0
                r12 = r12[r13]
                java.lang.String r13 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r12, r13)
                org.json.JSONObject r12 = (org.json.JSONObject) r12
                java.lang.String r13 = "type"
                java.lang.String r13 = r12.optString(r13)
                java.lang.String r1 = "adUnitId"
                java.lang.String r4 = r12.optString(r1)
                java.lang.String r3 = "adString"
                java.lang.String r5 = r12.optString(r3)
                java.lang.String r6 = "queryId"
                r7 = r6
                java.lang.String r6 = r12.optString(r7)
                java.lang.String r9 = "videoLength"
                int r12 = r12.optInt(r9)
                com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
                r9.setScarAd(r2)
                com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
                r9.setScarAdUnitId(r4)
                com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
                r9.setScarQueryId(r6)
                com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
                r9.setScarAdString(r5)
                r9 = r1
                com.unity3d.ads.core.domain.scar.LoadScarAd r1 = r11.$loadScarAd
                java.lang.String r10 = "adType"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r10)
                com.unity3d.ads.core.data.model.AdObject r10 = r11.$adObject
                java.lang.String r10 = r10.getPlacementId()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r9)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
                r8.label = r2
                r7 = r12
                r2 = r13
                r3 = r10
                java.lang.Object r12 = r1.invoke(r2, r3, r4, r5, r6, r7, r8)
                if (r12 != r0) goto L96
                return r0
            L96:
                kotlin.Unit r12 = kotlin.Unit.f93236a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48231.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48251 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ OmFinishSession $omFinishSession;

        C48251(OmFinishSession omFinishSession, AdObject adObject) {
            this.$omFinishSession = omFinishSession;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1
                if (r4 == 0) goto L13
                r4 = r5
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.result
                java.lang.Object r0 = pf.b.g()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L29
                kotlin.d.b(r5)
                goto L41
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                kotlin.d.b(r5)
                com.unity3d.ads.core.domain.om.OmFinishSession r5 = r3.$omFinishSession
                com.unity3d.ads.core.data.model.AdObject r1 = r3.$adObject
                r4.label = r2
                java.lang.Object r4 = r5.invoke(r1, r4)
                if (r4 != r0) goto L41
                return r0
            L41:
                kotlin.Unit r4 = kotlin.Unit.f93236a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48251.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48261 implements ExposedFunction {
        final /* synthetic */ GetOmData $getOmData;

        C48261(GetOmData getOmData) {
            this.$getOmData = getOmData;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1
                if (r4 == 0) goto L13
                r4 = r5
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.result
                java.lang.Object r0 = pf.b.g()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L29
                kotlin.d.b(r5)
                goto L3f
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                kotlin.d.b(r5)
                com.unity3d.ads.core.domain.om.GetOmData r5 = r3.$getOmData
                r4.label = r2
                java.lang.Object r5 = r5.invoke(r4)
                if (r5 != r0) goto L3f
                return r0
            L3f:
                com.unity3d.ads.core.data.model.OMData r5 = (com.unity3d.ads.core.data.model.OMData) r5
                java.util.Map r4 = kotlin.collections.MapsKt.createMapBuilder()
                java.lang.String r0 = r5.getVersion()
                java.lang.String r1 = "version"
                r4.put(r1, r0)
                java.lang.String r0 = "partnerName"
                java.lang.String r1 = r5.getPartnerName()
                r4.put(r0, r1)
                java.lang.String r0 = "partnerVersion"
                java.lang.String r5 = r5.getPartnerVersion()
                r4.put(r0, r5)
                java.util.Map r4 = kotlin.collections.MapsKt.build(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48261.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48271 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ OmImpressionOccurred $omImpressionOccurred;

        C48271(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
            this.$omImpressionOccurred = omImpressionOccurred;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.d.b(r6)
                goto L4f
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.d.b(r6)
                r6 = 0
                r5 = r5[r6]
                java.lang.String r6 = "null cannot be cast to non-null type kotlin.Boolean"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r6)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                com.unity3d.ads.core.domain.om.OmImpressionOccurred r6 = r4.$omImpressionOccurred
                com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
                r0.label = r3
                java.lang.Object r5 = r6.invoke(r2, r5, r0)
                if (r5 != r1) goto L4f
                return r1
            L4f:
                kotlin.Unit r5 = kotlin.Unit.f93236a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48271.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48281 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ AndroidOmInteraction $omStartSession;

        C48281(AndroidOmInteraction androidOmInteraction, AdObject adObject) {
            this.$omStartSession = androidOmInteraction;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.d.b(r6)
                goto L4b
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.d.b(r6)
                r6 = 0
                r5 = r5[r6]
                java.lang.String r6 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r6)
                org.json.JSONObject r5 = (org.json.JSONObject) r5
                com.unity3d.ads.core.domain.om.AndroidOmInteraction r6 = r4.$omStartSession
                com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
                r0.label = r3
                java.lang.Object r5 = r6.invoke(r2, r5, r0)
                if (r5 != r1) goto L4b
                return r1
            L4b:
                kotlin.Unit r5 = kotlin.Unit.f93236a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48281.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$openUrl$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48291 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ HandleOpenUrl $handleOpenUrl;

        C48291(HandleOpenUrl handleOpenUrl, AdObject adObject) {
            this.$handleOpenUrl = handleOpenUrl;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$openUrl$1$invoke$1
                if (r0 == 0) goto L14
                r0 = r11
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$openUrl$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$openUrl$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.label = r1
            L12:
                r8 = r0
                goto L1a
            L14:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$openUrl$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$openUrl$1$invoke$1
                r0.<init>(r9, r11)
                goto L12
            L1a:
                java.lang.Object r11 = r8.result
                java.lang.Object r0 = pf.b.g()
                int r1 = r8.label
                r2 = 1
                if (r1 == 0) goto L34
                if (r1 != r2) goto L2c
                kotlin.d.b(r11)
                goto L8f
            L2c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L34:
                kotlin.d.b(r11)
                r11 = 0
                r1 = r10[r11]
                java.lang.String r3 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r3)
                r3 = r1
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r10 = kotlin.collections.ArraysKt.getOrNull(r10, r2)
                boolean r1 = r10 instanceof org.json.JSONObject
                r4 = 0
                if (r1 == 0) goto L4e
                org.json.JSONObject r10 = (org.json.JSONObject) r10
                goto L4f
            L4e:
                r10 = r4
            L4f:
                if (r10 == 0) goto L58
                java.lang.String r1 = "packageName"
                java.lang.String r1 = r10.optString(r1)
                goto L59
            L58:
                r1 = r4
            L59:
                if (r10 == 0) goto L64
                java.lang.String r5 = "action"
                java.lang.String r6 = "android.intent.action.VIEW"
                java.lang.String r5 = r10.optString(r5, r6)
                goto L65
            L64:
                r5 = r4
            L65:
                if (r10 == 0) goto L6e
                java.lang.String r6 = "extras"
                org.json.JSONObject r6 = r10.optJSONObject(r6)
                goto L6f
            L6e:
                r6 = r4
            L6f:
                if (r10 == 0) goto L77
                java.lang.String r11 = "useActivityForResult"
                boolean r11 = r10.optBoolean(r11)
            L77:
                r7 = r11
                r10 = r4
                r4 = r1
                com.unity3d.ads.core.domain.HandleOpenUrl r1 = r9.$handleOpenUrl
                r11 = r2
                com.unity3d.ads.core.data.model.AdObject r2 = r9.$adObject
                if (r6 == 0) goto L85
                java.util.Map r10 = com.unity3d.ads.core.extensions.JSONObjectExtensionsKt.toBuiltInMap(r6)
            L85:
                r6 = r10
                r8.label = r11
                java.lang.Object r10 = r1.invoke(r2, r3, r4, r5, r6, r7, r8)
                if (r10 != r0) goto L8f
                return r0
            L8f:
                kotlin.Unit r10 = kotlin.Unit.f93236a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48291.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48311 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Refresh $refresh;

        C48311(Refresh refresh, AdObject adObject) {
            this.$refresh = refresh;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r9
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                java.lang.String r3 = "adDataRefreshToken"
                r4 = 0
                r5 = 0
                r6 = 1
                if (r2 == 0) goto L35
                if (r2 != r6) goto L2d
                kotlin.d.b(r9)
                goto L6a
            L2d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L35:
                kotlin.d.b(r9)
                int r9 = r8.length
                if (r9 != 0) goto L3e
                com.google.protobuf.ByteString r8 = com.google.protobuf.ByteString.EMPTY
                goto L54
            L3e:
                r8 = r8[r5]
                java.lang.String r9 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r9)
                org.json.JSONObject r8 = (org.json.JSONObject) r8
                java.lang.String r8 = r8.optString(r3)
                java.lang.String r9 = "refreshToken"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
                com.google.protobuf.ByteString r8 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r8, r5, r6, r4)
            L54:
                com.unity3d.ads.core.domain.Refresh r9 = r7.$refresh
                java.lang.String r2 = "refreshTokenByteString"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
                com.unity3d.ads.core.data.model.AdObject r2 = r7.$adObject
                com.google.protobuf.ByteString r2 = r2.getOpportunityId()
                r0.label = r6
                java.lang.Object r9 = r9.invoke(r8, r2, r0)
                if (r9 != r1) goto L6a
                return r1
            L6a:
                gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse r9 = (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) r9
                boolean r8 = r9.hasError()
                if (r8 != 0) goto Laf
                java.util.Map r8 = kotlin.collections.MapsKt.createMapBuilder()
                com.google.protobuf.ByteString r0 = r9.getAdData()
                java.lang.String r1 = "adRefreshResponse.adData"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.String r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r0, r5, r6, r4)
                java.lang.String r1 = "adData"
                r8.put(r1, r0)
                com.google.protobuf.ByteString r0 = r9.getAdDataRefreshToken()
                java.lang.String r1 = "adRefreshResponse.adDataRefreshToken"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.String r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r0, r5, r6, r4)
                r8.put(r3, r0)
                com.google.protobuf.ByteString r9 = r9.getTrackingToken()
                java.lang.String r0 = "adRefreshResponse.trackingToken"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
                java.lang.String r9 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r9, r5, r6, r4)
                java.lang.String r0 = "trackingToken"
                r8.put(r0, r9)
                java.util.Map r8 = kotlin.collections.MapsKt.build(r8)
                return r8
            Laf:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r9 = "Refresh failed"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48311.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "args", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48321 implements ExposedFunction {
        final /* synthetic */ ExecuteAdViewerRequest $executeAdViewerRequest;
        final /* synthetic */ RequestType $type;

        C48321(ExecuteAdViewerRequest executeAdViewerRequest, RequestType requestType) {
            this.$executeAdViewerRequest = executeAdViewerRequest;
            this.$type = requestType;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r10) {
            /*
                Method dump skipped, instruction units count: 202
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48321.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48341 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ GetOperativeEventApi $getOperativeEventApi;

        C48341(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
            this.$getOperativeEventApi = getOperativeEventApi;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r7
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.d.b(r7)
                goto L5b
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.d.b(r7)
                gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType r7 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER
                r2 = 0
                r6 = r6[r2]
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r2)
                java.lang.String r6 = (java.lang.String) r6
                r2 = 2
                byte[] r6 = android.util.Base64.decode(r6, r2)
                java.lang.String r2 = "decode(it[0] as String, Base64.NO_WRAP)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
                com.google.protobuf.ByteString r6 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r6)
                com.unity3d.ads.core.domain.events.GetOperativeEventApi r2 = r5.$getOperativeEventApi
                com.unity3d.ads.core.data.model.AdObject r4 = r5.$adObject
                r0.label = r3
                java.lang.Object r6 = r2.invoke(r7, r4, r6, r0)
                if (r6 != r1) goto L5b
                return r1
            L5b:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48341.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48351 implements ExposedFunction {
        final /* synthetic */ SendPrivacyUpdateRequest $sendPrivacyUpdateRequest;

        C48351(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
            this.$sendPrivacyUpdateRequest = sendPrivacyUpdateRequest;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r11
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1
                r0.<init>(r9, r11)
            L18:
                java.lang.Object r11 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                r3 = 0
                java.lang.String r4 = "version"
                java.lang.String r5 = "content"
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L37
                if (r2 != r7) goto L2f
                kotlin.d.b(r11)
                goto L5f
            L2f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L37:
                kotlin.d.b(r11)
                r10 = r10[r6]
                java.lang.String r11 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r11)
                org.json.JSONObject r10 = (org.json.JSONObject) r10
                java.lang.String r11 = r10.optString(r5)
                int r10 = r10.optInt(r4)
                com.unity3d.ads.core.domain.SendPrivacyUpdateRequest r2 = r9.$sendPrivacyUpdateRequest
                java.lang.String r8 = "privacyUpdateContentBase64"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r8)
                com.google.protobuf.ByteString r11 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r11, r6, r7, r3)
                r0.label = r7
                java.lang.Object r11 = r2.invoke(r10, r11, r0)
                if (r11 != r1) goto L5f
                return r1
            L5f:
                gatewayprotocol.v1.PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse r11 = (gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) r11
                java.util.Map r10 = kotlin.collections.MapsKt.createMapBuilder()
                int r0 = r11.getVersion()
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.b.d(r0)
                r10.put(r4, r0)
                com.google.protobuf.ByteString r11 = r11.getContent()
                java.lang.String r0 = "response.content"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
                java.lang.String r11 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r11, r6, r7, r3)
                r10.put(r5, r11)
                java.util.Map r10 = kotlin.collections.MapsKt.build(r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48351.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "args", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48381 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;

        C48381(AdObject adObject) {
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r8
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.d.b(r8)
                goto L65
            L29:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L31:
                kotlin.d.b(r8)
                r8 = 0
                r7 = r7[r8]
                java.lang.String r8 = "null cannot be cast to non-null type kotlin.Int"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$Companion r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.INSTANCE
                kotlinx.coroutines.flow.MutableSharedFlow r8 = r8.getDisplayMessages()
                com.unity3d.ads.adplayer.DisplayMessage$SetOrientation r2 = new com.unity3d.ads.adplayer.DisplayMessage$SetOrientation
                com.unity3d.ads.core.data.model.AdObject r4 = r6.$adObject
                com.google.protobuf.ByteString r4 = r4.getOpportunityId()
                java.lang.String r4 = r4.toStringUtf8()
                java.lang.String r5 = "adObject.opportunityId.toStringUtf8()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                r2.<init>(r4, r7)
                r0.label = r3
                java.lang.Object r7 = r8.emit(r2, r0)
                if (r7 != r1) goto L65
                return r1
            L65:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48381.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48391 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        C48391(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.d.b(r6)
                goto L57
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.d.b(r6)
                com.unity3d.ads.core.data.repository.SessionRepository r6 = r4.$sessionRepository
                r2 = 0
                r5 = r5[r2]
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r2)
                java.lang.String r5 = (java.lang.String) r5
                r2 = 2
                byte[] r5 = android.util.Base64.decode(r5, r2)
                java.lang.String r2 = "decode(it[0] as String, Base64.NO_WRAP)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
                com.google.protobuf.ByteString r5 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r5)
                r0.label = r3
                java.lang.Object r5 = r6.setPrivacy(r5, r0)
                if (r5 != r1) goto L57
                return r1
            L57:
                kotlin.Unit r5 = kotlin.Unit.f93236a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48391.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C48401 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        C48401(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.d.b(r6)
                goto L57
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.d.b(r6)
                com.unity3d.ads.core.data.repository.SessionRepository r6 = r4.$sessionRepository
                r2 = 0
                r5 = r5[r2]
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r2)
                java.lang.String r5 = (java.lang.String) r5
                r2 = 2
                byte[] r5 = android.util.Base64.decode(r5, r2)
                java.lang.String r2 = "decode(it[0] as String, Base64.NO_WRAP)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
                com.google.protobuf.ByteString r5 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r5)
                r0.label = r3
                java.lang.Object r5 = r6.setPrivacyFsm(r5, r0)
                if (r5 != r1) goto L57
                return r1
            L57:
                kotlin.Unit r5 = kotlin.Unit.f93236a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48401.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @NotNull
    public static final ExposedFunction attributionRegisterClick(@NotNull final AndroidAttribution androidAttribution, @NotNull final AdObject adObject) {
        Intrinsics.checkNotNullParameter(androidAttribution, "androidAttribution");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterClick.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                AndroidAttribution androidAttribution2 = androidAttribution;
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerClick((String) obj, adObject, continuation);
            }
        };
    }

    @NotNull
    public static final ExposedFunction attributionRegisterView(@NotNull final AndroidAttribution androidAttribution, @NotNull final AdObject adObject) {
        Intrinsics.checkNotNullParameter(androidAttribution, "androidAttribution");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterView.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                AndroidAttribution androidAttribution2 = androidAttribution;
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerView((String) obj, adObject, continuation);
            }
        };
    }

    @NotNull
    public static final ExposedFunction clearStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.clearStorage.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) throws Throwable {
                e eVar = new e(b.d(continuation));
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.clear((String) obj, new ContinuationFromCallback(eVar));
                Object objB = eVar.b();
                if (objB == b.g()) {
                    g.c(continuation);
                }
                return objB;
            }
        };
    }

    @NotNull
    public static final ExposedFunction deleteStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.deleteStorage.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) throws Throwable {
                e eVar = new e(b.d(continuation));
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.delete((String) obj, (String) obj2, new ContinuationFromCallback(eVar));
                Object objB = eVar.b();
                if (objB == b.g()) {
                    g.c(continuation);
                }
                return objB;
            }
        };
    }

    @NotNull
    public static final ExposedFunction download(@NotNull CacheFile cacheFile, @NotNull AdObject adObject) {
        Intrinsics.checkNotNullParameter(cacheFile, "cacheFile");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new C48031(cacheFile, adObject);
    }

    @NotNull
    /* JADX INFO: renamed from: getAdContext-yLuu4LI, reason: not valid java name */
    public static final ExposedFunction m7462getAdContextyLuu4LI(@NotNull AndroidGetAdPlayerContext getAndroidAdPlayerContext, @NotNull String adData, @NotNull String impressionConfig, @NotNull String adDataRefreshToken, @NotNull IsOMActivated isOMActivated, @NotNull AdObject adObject) {
        Intrinsics.checkNotNullParameter(getAndroidAdPlayerContext, "getAndroidAdPlayerContext");
        Intrinsics.checkNotNullParameter(adData, "adData");
        Intrinsics.checkNotNullParameter(impressionConfig, "impressionConfig");
        Intrinsics.checkNotNullParameter(adDataRefreshToken, "adDataRefreshToken");
        Intrinsics.checkNotNullParameter(isOMActivated, "isOMActivated");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$getAdContext$1(adData, impressionConfig, adDataRefreshToken, getAndroidAdPlayerContext, adObject, isOMActivated);
    }

    @NotNull
    public static final ExposedFunction getAllowedPii(@NotNull final DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getAllowedPii.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                String strEncodeToString = Base64.encodeToString(((AllowedPiiOuterClass.AllowedPii) deviceInfoRepository.getAllowedPii().getValue()).toByteArray(), 2);
                Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(deviceInf…eArray(), Base64.NO_WRAP)");
                return strEncodeToString;
            }
        };
    }

    @NotNull
    public static final ExposedFunction getConnectionType(@NotNull final DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getConnectionType.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                DynamicDeviceInfoOuterClass.ConnectionType connectionType = deviceInfoRepository.getDynamicDeviceInfo().getConnectionType();
                Intrinsics.checkNotNullExpressionValue(connectionType, "deviceInfoRepository.dyn…DeviceInfo.connectionType");
                return connectionType;
            }
        };
    }

    @NotNull
    public static final ExposedFunction getDeviceMaxVolume(@NotNull final DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                return kotlin.coroutines.jvm.internal.b.b(deviceInfoRepository.getDynamicDeviceInfo().getAndroid().getMaxVolume());
            }
        };
    }

    @NotNull
    public static final ExposedFunction getDeviceVolume(@NotNull final DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceVolume.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                return kotlin.coroutines.jvm.internal.b.b(deviceInfoRepository.getDynamicDeviceInfo().getAndroid().getVolume());
            }
        };
    }

    @NotNull
    public static final ExposedFunction getKeysStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getKeysStorage.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) throws Throwable {
                e eVar = new e(b.d(continuation));
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = objArr[2];
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                Storage.getKeys((String) obj, (String) obj2, (Boolean) obj3, new ContinuationFromCallback(eVar));
                Object objB = eVar.b();
                if (objB == b.g()) {
                    g.c(continuation);
                }
                return objB;
            }
        };
    }

    @NotNull
    public static final ExposedFunction getPrivacy(@NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new C48091(sessionRepository);
    }

    @NotNull
    public static final ExposedFunction getPrivacyFsm(@NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new C48101(sessionRepository);
    }

    @NotNull
    public static final ExposedFunction getScreenHeight(@NotNull final DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenHeight.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                return kotlin.coroutines.jvm.internal.b.d(deviceInfoRepository.getDynamicDeviceInfo().getScreenHeight());
            }
        };
    }

    @NotNull
    public static final ExposedFunction getScreenWidth(@NotNull final DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenWidth.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                return kotlin.coroutines.jvm.internal.b.d(deviceInfoRepository.getDynamicDeviceInfo().getScreenWidth());
            }
        };
    }

    @NotNull
    public static final ExposedFunction getSessionToken(@NotNull final SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getSessionToken.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                return ProtobufExtensionsKt.toBase64$default(sessionRepository.getSessionToken(), false, 1, null);
            }
        };
    }

    @NotNull
    public static final ExposedFunction getStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getStorage.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) throws Throwable {
                e eVar = new e(b.d(continuation));
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.get((String) obj, (String) obj2, new ContinuationFromCallback(eVar));
                Object objB = eVar.b();
                if (objB == b.g()) {
                    g.c(continuation);
                }
                return objB;
            }
        };
    }

    @NotNull
    public static final ExposedFunction hbTokenIncrementStarts(@NotNull final SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                sessionRepository.incrementTokenStartsCount();
                return Unit.f93236a;
            }
        };
    }

    @NotNull
    public static final ExposedFunction hbTokenIncrementWins(@NotNull final SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                sessionRepository.incrementTokenWinsCount();
                return Unit.f93236a;
            }
        };
    }

    @NotNull
    public static final ExposedFunction hbTokenReset(@NotNull final SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenReset.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                sessionRepository.resetTokenCounters();
                return Unit.f93236a;
            }
        };
    }

    @NotNull
    public static final ExposedFunction incrementBannerImpressionCount(@NotNull final SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                sessionRepository.incrementBannerImpressionCount();
                return Unit.f93236a;
            }
        };
    }

    @NotNull
    public static final ExposedFunction isAttributionAvailable(@NotNull final AndroidAttribution androidAttribution) {
        Intrinsics.checkNotNullParameter(androidAttribution, "androidAttribution");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isAttributionAvailable.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                return androidAttribution.isAvailable(continuation);
            }
        };
    }

    @NotNull
    public static final ExposedFunction isFileCached(@NotNull final GetIsFileCache getIfFileCache) {
        Intrinsics.checkNotNullParameter(getIfFileCache, "getIfFileCache");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isFileCached.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                return getIfFileCache.invoke((String) obj, continuation);
            }
        };
    }

    @NotNull
    public static final ExposedFunction isOfferwallAdReady(@NotNull final GetIsOfferwallAdReady getIsOfferwallAdReady) {
        Intrinsics.checkNotNullParameter(getIsOfferwallAdReady, "getIsOfferwallAdReady");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isOfferwallAdReady.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                String placementName = ((JSONObject) obj).optString("placementName");
                GetIsOfferwallAdReady getIsOfferwallAdReady2 = getIsOfferwallAdReady;
                Intrinsics.checkNotNullExpressionValue(placementName, "placementName");
                return getIsOfferwallAdReady2.invoke(placementName, continuation);
            }
        };
    }

    @NotNull
    public static final ExposedFunction loadOfferwallAd(@NotNull LoadOfferwallAd loadOfferwallAd, @NotNull AdObject adObject) {
        Intrinsics.checkNotNullParameter(loadOfferwallAd, "loadOfferwallAd");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new C48221(adObject, loadOfferwallAd);
    }

    @NotNull
    public static final ExposedFunction loadScarAd(@NotNull LoadScarAd loadScarAd, @NotNull AdObject adObject) {
        Intrinsics.checkNotNullParameter(loadScarAd, "loadScarAd");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new C48231(adObject, loadScarAd);
    }

    @NotNull
    public static final ExposedFunction markCampaignStateShown(@NotNull final CampaignRepository campaignRepository, @NotNull final AdObject adObject) {
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.markCampaignStateShown.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                campaignRepository.setShowTimestamp(adObject.getOpportunityId());
                return Unit.f93236a;
            }
        };
    }

    @NotNull
    public static final ExposedFunction omFinishSession(@NotNull OmFinishSession omFinishSession, @NotNull AdObject adObject) {
        Intrinsics.checkNotNullParameter(omFinishSession, "omFinishSession");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new C48251(omFinishSession, adObject);
    }

    @NotNull
    public static final ExposedFunction omGetData(@NotNull GetOmData getOmData) {
        Intrinsics.checkNotNullParameter(getOmData, "getOmData");
        return new C48261(getOmData);
    }

    @NotNull
    public static final ExposedFunction omImpression(@NotNull OmImpressionOccurred omImpressionOccurred, @NotNull AdObject adObject) {
        Intrinsics.checkNotNullParameter(omImpressionOccurred, "omImpressionOccurred");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new C48271(omImpressionOccurred, adObject);
    }

    @NotNull
    public static final ExposedFunction omStartSession(@NotNull AndroidOmInteraction omStartSession, @NotNull AdObject adObject) {
        Intrinsics.checkNotNullParameter(omStartSession, "omStartSession");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new C48281(omStartSession, adObject);
    }

    @NotNull
    public static final ExposedFunction openUrl(@NotNull AdObject adObject, @NotNull HandleOpenUrl handleOpenUrl) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(handleOpenUrl, "handleOpenUrl");
        return new C48291(handleOpenUrl, adObject);
    }

    @NotNull
    public static final ExposedFunction readStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.readStorage.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) throws Throwable {
                e eVar = new e(b.d(continuation));
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.read((String) obj, new ContinuationFromCallback(eVar));
                Object objB = eVar.b();
                if (objB == b.g()) {
                    g.c(continuation);
                }
                return objB;
            }
        };
    }

    @NotNull
    public static final ExposedFunction refreshAdData(@NotNull Refresh refresh, @NotNull AdObject adObject) {
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new C48311(refresh, adObject);
    }

    @NotNull
    public static final ExposedFunction request(@NotNull RequestType type, @NotNull ExecuteAdViewerRequest executeAdViewerRequest) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(executeAdViewerRequest, "executeAdViewerRequest");
        return new C48321(executeAdViewerRequest, type);
    }

    @NotNull
    public static final ExposedFunction sendDiagnosticEvent(@NotNull final SendDiagnosticEvent sendDiagnosticEvent, @NotNull final AdObject adObject) {
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                String string;
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object obj2 = objArr[1];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj2;
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                Iterator<String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "tags.keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    mapCreateMapBuilder.put(next, jSONObject.getString(next));
                }
                Map mapBuild = MapsKt.build(mapCreateMapBuilder);
                Object orNull = ArraysKt.getOrNull(objArr, 2);
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, (orNull == null || (string = orNull.toString()) == null) ? null : kotlin.coroutines.jvm.internal.b.b(Double.parseDouble(string)), mapBuild, null, adObject, null, 40, null);
                return Unit.f93236a;
            }
        };
    }

    @NotNull
    public static final ExposedFunction sendOperativeEvent(@NotNull GetOperativeEventApi getOperativeEventApi, @NotNull AdObject adObject) {
        Intrinsics.checkNotNullParameter(getOperativeEventApi, "getOperativeEventApi");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new C48341(getOperativeEventApi, adObject);
    }

    @NotNull
    public static final ExposedFunction sendPrivacyUpdateRequest(@NotNull SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        Intrinsics.checkNotNullParameter(sendPrivacyUpdateRequest, "sendPrivacyUpdateRequest");
        return new C48351(sendPrivacyUpdateRequest);
    }

    @NotNull
    public static final ExposedFunction setAllowedPii(@NotNull final DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setAllowedPii.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                Object value;
                final AllowedPiiKt.Dsl dsl_create;
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                MutableStateFlow allowedPii = deviceInfoRepository.getAllowedPii();
                do {
                    value = allowedPii.getValue();
                    AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.INSTANCE;
                    AllowedPiiOuterClass.AllowedPii.Builder builder = ((AllowedPiiOuterClass.AllowedPii) value).toBuilder();
                    Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
                    dsl_create = companion._create(builder);
                    Object objOpt = jSONObject.opt("idfa");
                    Boolean bool = objOpt instanceof Boolean ? (Boolean) objOpt : null;
                    if (bool != null) {
                        new e0(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2
                            @Override // kotlin.jvm.internal.e0, kotlin.reflect.KProperty0
                            @Nullable
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfa());
                            }

                            @Override // kotlin.jvm.internal.e0, kotlin.reflect.KMutableProperty0
                            public void set(@Nullable Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setIdfa(((Boolean) obj2).booleanValue());
                            }
                        }.set(kotlin.coroutines.jvm.internal.b.a(bool.booleanValue()));
                    }
                    Object objOpt2 = jSONObject.opt("idfv");
                    Boolean bool2 = objOpt2 instanceof Boolean ? (Boolean) objOpt2 : null;
                    if (bool2 != null) {
                        new e0(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4
                            @Override // kotlin.jvm.internal.e0, kotlin.reflect.KProperty0
                            @Nullable
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfv());
                            }

                            @Override // kotlin.jvm.internal.e0, kotlin.reflect.KMutableProperty0
                            public void set(@Nullable Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setIdfv(((Boolean) obj2).booleanValue());
                            }
                        }.set(kotlin.coroutines.jvm.internal.b.a(bool2.booleanValue()));
                    }
                    Object objOpt3 = jSONObject.opt("appset_id");
                    Boolean bool3 = objOpt3 instanceof Boolean ? (Boolean) objOpt3 : null;
                    if (bool3 != null) {
                        new e0(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$6
                            @Override // kotlin.jvm.internal.e0, kotlin.reflect.KProperty0
                            @Nullable
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getAppsetId());
                            }

                            @Override // kotlin.jvm.internal.e0, kotlin.reflect.KMutableProperty0
                            public void set(@Nullable Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setAppsetId(((Boolean) obj2).booleanValue());
                            }
                        }.set(kotlin.coroutines.jvm.internal.b.a(bool3.booleanValue()));
                    }
                } while (!allowedPii.b(value, dsl_create._build()));
                return Unit.f93236a;
            }
        };
    }

    @NotNull
    public static final ExposedFunction setOpportunityTTL(@NotNull final AdObject adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setOpportunityTTL.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj).intValue();
                MutableStateFlow ttl = adObject.getTtl();
                b.a aVar = kotlin.time.b.f93560c;
                ttl.setValue(kotlin.time.b.g(c.s(iIntValue, cg.b.f6839f)));
                return Unit.f93236a;
            }
        };
    }

    @NotNull
    public static final ExposedFunction setOrientation(@NotNull AdObject adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new C48381(adObject);
    }

    @NotNull
    public static final ExposedFunction setPrivacy(@NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new C48391(sessionRepository);
    }

    @NotNull
    public static final ExposedFunction setPrivacyFsm(@NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new C48401(sessionRepository);
    }

    @NotNull
    public static final ExposedFunction setStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setStorage.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) throws Throwable {
                e eVar = new e(pf.b.d(continuation));
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.set((String) obj, (String) obj2, objArr[2], new ContinuationFromCallback(eVar));
                Object objB = eVar.b();
                if (objB == pf.b.g()) {
                    g.c(continuation);
                }
                return objB;
            }
        };
    }

    @NotNull
    public static final ExposedFunction showOfferwallAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showOfferwallAd.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                return Unit.f93236a;
            }
        };
    }

    @NotNull
    public static final ExposedFunction showScarAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showScarAd.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                return Unit.f93236a;
            }
        };
    }

    @NotNull
    public static final ExposedFunction updateCampaignState(@NotNull final CampaignRepository campaignRepository, @NotNull final AdObject adObject) {
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.updateCampaignState.1
            /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
            @Override // kotlin.jvm.functions.Function2
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    java.lang.Object r7 = kotlin.collections.ArraysKt.firstOrNull(r7)
                    boolean r8 = r7 instanceof org.json.JSONObject
                    r0 = 0
                    if (r8 == 0) goto Lc
                    org.json.JSONObject r7 = (org.json.JSONObject) r7
                    goto Ld
                Lc:
                    r7 = r0
                Ld:
                    if (r7 == 0) goto Lab
                    java.lang.String r8 = "data"
                    java.lang.String r1 = r7.optString(r8)
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L22
                    boolean r4 = kotlin.text.StringsKt.y0(r1)
                    if (r4 == 0) goto L20
                    goto L22
                L20:
                    r4 = r3
                    goto L23
                L22:
                    r4 = r2
                L23:
                    if (r4 != 0) goto La3
                    java.lang.String r4 = "dataVersion"
                    int r7 = r7.optInt(r4)
                    if (r7 == 0) goto L9b
                    com.unity3d.ads.core.data.model.AdObject r4 = r1
                    com.google.protobuf.ByteString r4 = r4.getOpportunityId()
                    com.unity3d.ads.core.data.model.AdObject r5 = r1
                    java.lang.String r5 = r5.getPlacementId()
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r8)
                    com.google.protobuf.ByteString r8 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r1, r3, r2, r0)
                    boolean r0 = r8.isEmpty()
                    if (r0 != 0) goto L93
                    com.unity3d.ads.core.data.repository.CampaignRepository r0 = r2
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0.getCampaign(r4)
                    if (r0 == 0) goto L6c
                    gatewayprotocol.v1.CampaignKt$Dsl$Companion r1 = gatewayprotocol.v1.CampaignKt.Dsl.INSTANCE
                    com.google.protobuf.GeneratedMessageLite$Builder r0 = r0.toBuilder()
                    java.lang.String r2 = "this.toBuilder()"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder r0 = (gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder) r0
                    gatewayprotocol.v1.CampaignKt$Dsl r0 = r1._create(r0)
                    r0.setData(r8)
                    r0.setDataVersion(r7)
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0._build()
                    if (r0 == 0) goto L6c
                    goto L8b
                L6c:
                    gatewayprotocol.v1.CampaignKt$Dsl$Companion r0 = gatewayprotocol.v1.CampaignKt.Dsl.INSTANCE
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder r1 = gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder()
                    java.lang.String r2 = "newBuilder()"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                    gatewayprotocol.v1.CampaignKt$Dsl r0 = r0._create(r1)
                    r0.setData(r8)
                    r0.setDataVersion(r7)
                    r0.setPlacementId(r5)
                    r0.setImpressionOpportunityId(r4)
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0._build()
                L8b:
                    com.unity3d.ads.core.data.repository.CampaignRepository r7 = r2
                    r7.setCampaign(r4, r0)
                    kotlin.Unit r7 = kotlin.Unit.f93236a
                    return r7
                L93:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "Update campaign state requires a non-empty data byte string"
                    r7.<init>(r8)
                    throw r7
                L9b:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "Update campaign state requires a dataVersion integer"
                    r7.<init>(r8)
                    throw r7
                La3:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "Update campaign state requires a data string"
                    r7.<init>(r8)
                    throw r7
                Lab:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "Update campaign state requires a JSONObject"
                    r7.<init>(r8)
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C48441.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
            }
        };
    }

    @NotNull
    public static final ExposedFunction updateTrackingToken(@NotNull final AdObject adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.updateTrackingToken.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) {
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                String token = ((JSONObject) obj).optString(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                if (token != null && token.length() != 0) {
                    AdObject adObject2 = adObject;
                    Intrinsics.checkNotNullExpressionValue(token, "token");
                    adObject2.setTrackingToken(ProtobufExtensionsKt.fromBase64$default(token, false, 1, null));
                }
                return Unit.f93236a;
            }
        };
    }

    @NotNull
    public static final ExposedFunction writeStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.writeStorage.1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Object[] objArr, @NotNull Continuation continuation) throws Throwable {
                e eVar = new e(pf.b.d(continuation));
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.write((String) obj, new ContinuationFromCallback(eVar));
                Object objB = eVar.b();
                if (objB == pf.b.g()) {
                    g.c(continuation);
                }
                return objB;
            }
        };
    }
}
