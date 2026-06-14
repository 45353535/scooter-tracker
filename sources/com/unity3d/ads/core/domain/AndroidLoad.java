package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import eg.g;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J0\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cH\u0002J\u0010\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cH\u0002JC\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010\u001f\u001a\u00020 H\u0096Bø\u0001\u0000¢\u0006\u0002\u00101R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidLoad;", "Lcom/unity3d/ads/core/domain/Load;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getAdRequest", "Lcom/unity3d/ads/core/domain/GetAdRequest;", "getAdPlayerConfigRequest", "Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "handleGatewayAdResponse", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/GetAdRequest;Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "getTmpAdObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "opportunityId", "Lcom/google/protobuf/ByteString;", "placement", "", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "", "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "handleGatewayException", "Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "incrementLoadRequestAdmCount", "", C4240b4.f42493v, "incrementLoadRequestCount", "invoke", "Lcom/unity3d/ads/core/data/model/LoadResult;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "headerBiddingAdMarkup", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "bannerSize", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/UnityAdsLoadOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidLoad implements Load {

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetAdPlayerConfigRequest getAdPlayerConfigRequest;

    @NotNull
    private final GetAdRequest getAdRequest;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    @NotNull
    private final HandleGatewayAdResponse handleGatewayAdResponse;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidLoad$invoke$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/LoadResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", l = {72, 76, 93, 97, 136}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ AdRequestOuterClass.BannerSize $bannerSize;
        final /* synthetic */ Context $context;
        final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
        final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ String $placement;
        int I$0;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdRequestOuterClass.BannerSize bannerSize, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, ByteString byteString, String str, UnityAdsLoadOptions unityAdsLoadOptions, Context context, Continuation continuation) {
            super(2, continuation);
            this.$bannerSize = bannerSize;
            this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
            this.$opportunityId = byteString;
            this.$placement = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = AndroidLoad.this.new AnonymousClass2(this.$bannerSize, this.$headerBiddingAdMarkup, this.$opportunityId, this.$placement, this.$loadOptions, this.$context, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:115:0x03a5, code lost:
        
            if (r0 == r9) goto L116;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x02dd A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:117:0x03a8, B:119:0x03ae, B:121:0x03bc, B:122:0x03cf, B:123:0x03d6, B:126:0x03db, B:127:0x03e0, B:92:0x0269, B:96:0x0295, B:98:0x02c1, B:100:0x02dd, B:102:0x0346, B:103:0x0352, B:105:0x035f, B:106:0x0370, B:107:0x0376, B:111:0x0392, B:91:0x025e, B:21:0x0058, B:78:0x020e, B:64:0x0172, B:68:0x019e, B:63:0x0167, B:29:0x0088, B:50:0x0117, B:32:0x0099, B:34:0x00a5, B:36:0x00bb, B:41:0x00c4, B:44:0x00cc, B:46:0x00f2, B:70:0x01d3, B:72:0x01f2, B:74:0x01f6, B:43:0x00c9), top: B:146:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0245  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0290  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0293  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x02c1 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:117:0x03a8, B:119:0x03ae, B:121:0x03bc, B:122:0x03cf, B:123:0x03d6, B:126:0x03db, B:127:0x03e0, B:92:0x0269, B:96:0x0295, B:98:0x02c1, B:100:0x02dd, B:102:0x0346, B:103:0x0352, B:105:0x035f, B:106:0x0370, B:107:0x0376, B:111:0x0392, B:91:0x025e, B:21:0x0058, B:78:0x020e, B:64:0x0172, B:68:0x019e, B:63:0x0167, B:29:0x0088, B:50:0x0117, B:32:0x0099, B:34:0x00a5, B:36:0x00bb, B:41:0x00c4, B:44:0x00cc, B:46:0x00f2, B:70:0x01d3, B:72:0x01f2, B:74:0x01f6, B:43:0x00c9), top: B:146:0x0014 }] */
        /* JADX WARN: Type inference failed for: r12v11 */
        /* JADX WARN: Type inference failed for: r12v12 */
        /* JADX WARN: Type inference failed for: r12v3, types: [int] */
        /* JADX WARN: Type inference failed for: r12v4, types: [int] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Type inference failed for: r33v0 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Type inference failed for: r3v21 */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v24 */
        /* JADX WARN: Type inference failed for: r3v25 */
        /* JADX WARN: Type inference failed for: r3v28, types: [int] */
        /* JADX WARN: Type inference failed for: r3v31, types: [int] */
        /* JADX WARN: Type inference failed for: r3v32 */
        /* JADX WARN: Type inference failed for: r3v33 */
        /* JADX WARN: Type inference failed for: r3v34 */
        /* JADX WARN: Type inference failed for: r3v35 */
        /* JADX WARN: Type inference failed for: r3v36 */
        /* JADX WARN: Type inference failed for: r3v37 */
        /* JADX WARN: Type inference failed for: r3v38 */
        /* JADX WARN: Type inference failed for: r3v39 */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r35) {
            /*
                Method dump skipped, instruction units count: 1002
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public AndroidLoad(@NotNull CoroutineDispatcher defaultDispatcher, @NotNull GetAdRequest getAdRequest, @NotNull GetAdPlayerConfigRequest getAdPlayerConfigRequest, @NotNull GetRequestPolicy getRequestPolicy, @NotNull HandleGatewayAdResponse handleGatewayAdResponse, @NotNull SessionRepository sessionRepository, @NotNull GatewayClient gatewayClient, @NotNull AdRepository adRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(getAdRequest, "getAdRequest");
        Intrinsics.checkNotNullParameter(getAdPlayerConfigRequest, "getAdPlayerConfigRequest");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(handleGatewayAdResponse, "handleGatewayAdResponse");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdRequest = getAdRequest;
        this.getAdPlayerConfigRequest = getAdPlayerConfigRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
        this.sessionRepository = sessionRepository;
        this.gatewayClient = gatewayClient;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(ByteString opportunityId, String placement, boolean isHeaderBidding, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, UnityAdsLoadOptions loadOptions) {
        ByteString EMPTY = ByteString.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return new AdObject(opportunityId, placement, EMPTY, false, null, null, null, false, null, null, null, loadOptions, isHeaderBidding, adType, null, null, 50680, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadResult.Failure handleGatewayException(UnityAdsNetworkException e10) {
        boolean z10 = e10 instanceof NetworkTimeoutException;
        return new LoadResult.Failure(z10 ? UnityAds.UnityAdsLoadError.TIMEOUT : UnityAds.UnityAdsLoadError.INTERNAL_ERROR, z10 ? LoadResult.MSG_TIMEOUT : e10 instanceof GatewayException ? e10.getMessage() : LoadResult.MSG_COMMUNICATION_FAILURE, e10, z10 ? "timeout" : "gateway", e10.getMessage(), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestAdmCount(boolean isBanner) {
        if (isBanner) {
            this.sessionRepository.incrementBannerLoadRequestAdmCount();
        } else {
            this.sessionRepository.incrementLoadRequestAdmCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestCount(boolean isBanner) {
        if (isBanner) {
            this.sessionRepository.incrementBannerLoadRequestCount();
        } else {
            this.sessionRepository.incrementLoadRequestCount();
        }
    }

    @Override // com.unity3d.ads.core.domain.Load
    @Nullable
    public Object invoke(@NotNull Context context, @NotNull String str, @NotNull ByteString byteString, @NotNull HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, @Nullable AdRequestOuterClass.BannerSize bannerSize, @NotNull UnityAdsLoadOptions unityAdsLoadOptions, @NotNull Continuation continuation) {
        return g.g(this.defaultDispatcher, new AnonymousClass2(bannerSize, headerBiddingAdMarkup, byteString, str, unityAdsLoadOptions, context, null), continuation);
    }
}
