package com.unity3d.ads.core.domain;

import com.taurusx.tax.f.y;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.ExposedFunctionLocation;
import com.unity3d.ads.adplayer.Invocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.network.model.RequestType;
import hg.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002Jc\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fH\u0086\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "Lcom/unity3d/services/core/di/IServiceComponent;", "()V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/Invocation;", "onInvocations", "Lkotlinx/coroutines/flow/SharedFlow;", "adData", "", HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "onSubscription", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/SharedFlow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HandleInvocationsFromAdViewer implements IServiceComponent {

    @NotNull
    public static final String KEY_ACTION = "action";

    @NotNull
    public static final String KEY_AD_DATA = "adData";

    @NotNull
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";

    @NotNull
    public static final String KEY_AD_STRING = "adString";

    @NotNull
    public static final String KEY_AD_TYPE = "type";

    @NotNull
    public static final String KEY_AD_UNIT_ID = "adUnitId";

    @NotNull
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";

    @NotNull
    public static final String KEY_DOWNLOAD_URL = "url";

    @NotNull
    public static final String KEY_EXTRAS = "extras";

    @NotNull
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";

    @NotNull
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";

    @NotNull
    public static final String KEY_LOAD_OPTIONS = "loadOptions";

    @NotNull
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";

    @NotNull
    public static final String KEY_OMID = "openMeasurement";

    @NotNull
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";

    @NotNull
    public static final String KEY_OMJS_SESSION = "sessionFilePath";

    @NotNull
    public static final String KEY_OM_PARTNER = "partnerName";

    @NotNull
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";

    @NotNull
    public static final String KEY_OM_VERSION = "version";

    @NotNull
    public static final String KEY_PACKAGE_NAME = "packageName";

    @NotNull
    public static final String KEY_PLACEMENT_ID = "placementId";

    @NotNull
    public static final String KEY_PLACEMENT_NAME = "placementName";

    @NotNull
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";

    @NotNull
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";

    @NotNull
    public static final String KEY_QUERY_ID = "queryId";

    @NotNull
    public static final String KEY_TRACKING_TOKEN = "trackingToken";

    @NotNull
    public static final String KEY_USE_ACTIVITY_FOR_RESULT = "useActivityForResult";

    @NotNull
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/adplayer/Invocation;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1", f = "HandleInvocationsFromAdViewer.kt", l = {184}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<FlowCollector, Continuation, Object> {
        final /* synthetic */ Function1<Continuation, Object> $onSubscription;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super Continuation, ? extends Object> function1, Continuation continuation) {
            super(2, continuation);
            this.$onSubscription = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$onSubscription, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                Function1<Continuation, Object> function1 = this.$onSubscription;
                this.label = 1;
                if (function1.invoke(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/adplayer/Invocation;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", f = "HandleInvocationsFromAdViewer.kt", l = {188}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<Invocation, Continuation, Object> {
        final /* synthetic */ Map<String, Function0<ExposedFunction>> $definition;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1", f = "HandleInvocationsFromAdViewer.kt", l = {188}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function1<Continuation, Object> {
            final /* synthetic */ ExposedFunction $exposedFunction;
            final /* synthetic */ Invocation $it;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ExposedFunction exposedFunction, Invocation invocation, Continuation continuation) {
                super(1, continuation);
                this.$exposedFunction = exposedFunction;
                this.$it = invocation;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@NotNull Continuation continuation) {
                return new AnonymousClass1(this.$exposedFunction, this.$it, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = b.g();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                    return obj;
                }
                d.b(obj);
                ExposedFunction exposedFunction = this.$exposedFunction;
                Object[] parameters = this.$it.getParameters();
                this.label = 1;
                Object objInvoke = exposedFunction.invoke(parameters, this);
                return objInvoke == objG ? objG : objInvoke;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Map<String, ? extends Function0<? extends ExposedFunction>> map, Continuation continuation) {
            super(2, continuation);
            this.$definition = map;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$definition, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull Invocation invocation, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(invocation, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ExposedFunction exposedFunctionInvoke;
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                Invocation invocation = (Invocation) this.L$0;
                Function0<ExposedFunction> function0 = this.$definition.get(invocation.getLocation());
                if (function0 == null || (exposedFunctionInvoke = function0.invoke()) == null) {
                    return Unit.f93236a;
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(exposedFunctionInvoke, invocation, null);
                this.label = 1;
                if (invocation.handle(anonymousClass1, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @NotNull
    public final Flow invoke(@NotNull SharedFlow onInvocations, @NotNull String adData, @NotNull String adDataRefreshToken, @NotNull String impressionConfig, @NotNull final AdObject adObject, @NotNull Function1<? super Continuation, ? extends Object> onSubscription) {
        Intrinsics.checkNotNullParameter(onInvocations, "onInvocations");
        Intrinsics.checkNotNullParameter(adData, "adData");
        Intrinsics.checkNotNullParameter(adDataRefreshToken, "adDataRefreshToken");
        Intrinsics.checkNotNullParameter(impressionConfig, "impressionConfig");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(onSubscription, "onSubscription");
        final String strM7441constructorimpl = AdData.m7441constructorimpl(adData);
        final String strM7455constructorimpl = ImpressionConfig.m7455constructorimpl(impressionConfig);
        final String strM7448constructorimpl = AdDataRefreshToken.m7448constructorimpl(adDataRefreshToken);
        return i.K(i.M(onInvocations, new AnonymousClass1(onSubscription, null)), new AnonymousClass2(MapsKt.mapOf(TuplesKt.to(ExposedFunctionLocation.GET_AD_CONTEXT, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.m7462getAdContextyLuu4LI((AndroidGetAdPlayerContext) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(AndroidGetAdPlayerContext.class)), strM7441constructorimpl, strM7455constructorimpl, strM7448constructorimpl, (IsOMActivated) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(IsOMActivated.class)), adObject);
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_CONNECTION_TYPE, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getConnectionType((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(DeviceInfoRepository.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_DEVICE_VOLUME, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getDeviceVolume((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(DeviceInfoRepository.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(DeviceInfoRepository.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_SCREEN_HEIGHT, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getScreenHeight((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(DeviceInfoRepository.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_SCREEN_WIDTH, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getScreenWidth((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(DeviceInfoRepository.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.OPEN_URL, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.openUrl(adObject, (HandleOpenUrl) this.getServiceProvider().getRegistry().getService("", v0.b(HandleOpenUrl.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.SET_ORIENTATION, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setOrientation(adObject);
            }
        }), TuplesKt.to(ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendOperativeEvent((GetOperativeEventApi) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(GetOperativeEventApi.class)), adObject);
            }
        }), TuplesKt.to(ExposedFunctionLocation.STORAGE_WRITE, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.writeStorage();
            }
        }), TuplesKt.to(ExposedFunctionLocation.STORAGE_READ, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.readStorage();
            }
        }), TuplesKt.to(ExposedFunctionLocation.STORAGE_DELETE, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.deleteStorage();
            }
        }), TuplesKt.to(ExposedFunctionLocation.STORAGE_CLEAR, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.clearStorage();
            }
        }), TuplesKt.to(ExposedFunctionLocation.STORAGE_GET_KEYS, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getKeysStorage();
            }
        }), TuplesKt.to(ExposedFunctionLocation.STORAGE_GET, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getStorage();
            }
        }), TuplesKt.to(ExposedFunctionLocation.STORAGE_SET, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setStorage();
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_PRIVACY_FSM, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$17
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getPrivacyFsm((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(SessionRepository.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.SET_PRIVACY_FSM, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$18
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setPrivacyFsm((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(SessionRepository.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_PRIVACY, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$19
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getPrivacy((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(SessionRepository.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.SET_PRIVACY, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$20
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setPrivacy((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(SessionRepository.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_ALLOWED_PII, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$21
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getAllowedPii((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(DeviceInfoRepository.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.SET_ALLOWED_PII, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$22
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setAllowedPii((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(DeviceInfoRepository.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_SESSION_TOKEN, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$23
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getSessionToken((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(SessionRepository.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$24
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.markCampaignStateShown((CampaignRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(CampaignRepository.class)), adObject);
            }
        }), TuplesKt.to(ExposedFunctionLocation.REFRESH_AD_DATA, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$25
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.refreshAdData((Refresh) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(Refresh.class)), adObject);
            }
        }), TuplesKt.to(ExposedFunctionLocation.UPDATE_CAMPAIGN_STATE, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$26
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.updateCampaignState((CampaignRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(CampaignRepository.class)), adObject);
            }
        }), TuplesKt.to(ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$27
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.updateTrackingToken(adObject);
            }
        }), TuplesKt.to(ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$28
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest((SendPrivacyUpdateRequest) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(SendPrivacyUpdateRequest.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$29
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent((SendDiagnosticEvent) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(SendDiagnosticEvent.class)), adObject);
            }
        }), TuplesKt.to(ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$30
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(SessionRepository.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.DOWNLOAD, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$31
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.download((CacheFile) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(CacheFile.class)), adObject);
            }
        }), TuplesKt.to(ExposedFunctionLocation.IS_FILE_CACHED, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$32
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isFileCached((GetIsFileCache) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(GetIsFileCache.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.OM_START_SESSION, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$33
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omStartSession((AndroidOmInteraction) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(AndroidOmInteraction.class)), adObject);
            }
        }), TuplesKt.to(ExposedFunctionLocation.OM_FINISH_SESSION, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$34
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omFinishSession((OmFinishSession) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(OmFinishSession.class)), adObject);
            }
        }), TuplesKt.to(ExposedFunctionLocation.OM_IMPRESSION, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$35
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omImpression((OmImpressionOccurred) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(OmImpressionOccurred.class)), adObject);
            }
        }), TuplesKt.to(ExposedFunctionLocation.OM_GET_DATA, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$36
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omGetData((GetOmData) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(GetOmData.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.IS_ATTRIBUTION_AVAILABLE, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$37
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isAttributionAvailable((AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(AndroidAttribution.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.ATTRIBUTION_REGISTER_VIEW, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$38
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.attributionRegisterView((AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(AndroidAttribution.class)), adObject);
            }
        }), TuplesKt.to(ExposedFunctionLocation.ATTRIBUTION_REGISTER_CLICK, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$39
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.attributionRegisterClick((AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(AndroidAttribution.class)), adObject);
            }
        }), TuplesKt.to(ExposedFunctionLocation.LOAD_SCAR_AD, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$40
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.loadScarAd((LoadScarAd) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(LoadScarAd.class)), adObject);
            }
        }), TuplesKt.to(ExposedFunctionLocation.SHOW_SCAR_AD, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$41
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.showScarAd();
            }
        }), TuplesKt.to(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_WINS, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$42
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(SessionRepository.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_STARTS, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$43
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(SessionRepository.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_RESET, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$44
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenReset((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(SessionRepository.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.LOAD_OFFERWALL_AD, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$45
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.loadOfferwallAd((LoadOfferwallAd) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(LoadOfferwallAd.class)), adObject);
            }
        }), TuplesKt.to(ExposedFunctionLocation.SHOW_OFFERWALL_AD, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$46
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.showOfferwallAd();
            }
        }), TuplesKt.to(ExposedFunctionLocation.IS_OFFERWALL_AD_READY, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$47
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isOfferwallAdReady((GetIsOfferwallAdReady) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(GetIsOfferwallAdReady.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.REQUEST_GET, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$48
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.request(RequestType.GET, (ExecuteAdViewerRequest) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(ExecuteAdViewerRequest.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.REQUEST_POST, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$49
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.request(RequestType.POST, (ExecuteAdViewerRequest) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(ExecuteAdViewerRequest.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.REQUEST_HEAD, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$50
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.request(RequestType.HEAD, (ExecuteAdViewerRequest) this.this$0.getServiceProvider().getRegistry().getService("", v0.b(ExecuteAdViewerRequest.class)));
            }
        }), TuplesKt.to(ExposedFunctionLocation.SET_OPPORTUNITY_TTL, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$51
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setOpportunityTTL(adObject);
            }
        })), null));
    }
}
