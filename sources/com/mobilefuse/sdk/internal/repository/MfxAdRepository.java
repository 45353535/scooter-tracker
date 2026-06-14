package com.mobilefuse.sdk.internal.repository;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.component.AdmParser;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.mfx.MfxRequestAdKt;
import com.mobilefuse.sdk.network.client.HttpClient;
import com.mobilefuse.sdk.network.client.HttpClientKt;
import com.mobilefuse.sdk.network.client.HttpPostRequest;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.network.model.MfxBidRequest;
import com.mobilefuse.sdk.network.model.MfxBidRequestToHttpRequestKt;
import com.mobilefuse.sdk.rx.AdParserFlowKt;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.telemetry.TelemetryAction;
import com.mobilefuse.sdk.telemetry.TelemetryAgent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012.\b\u0002\u0010\u0011\u001a(\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001a\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R:\u0010\u0011\u001a(\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*¨\u0006+"}, d2 = {"Lcom/mobilefuse/sdk/internal/repository/MfxAdRepository;", "Lcom/mobilefuse/sdk/internal/repository/AdRepository;", "Lcom/mobilefuse/sdk/internal/repository/ParsedAdMarkupResponse;", "Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;", "telemetryAgent", "Lcom/mobilefuse/sdk/internal/repository/AdLoadingConfig;", "adLoadingConfig", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "Lcom/mobilefuse/sdk/component/AdmParser;", "parserFactory", "Lkotlin/Function5;", "", "", "", "", "Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "bidRequestFactory", "Lcom/mobilefuse/sdk/network/client/HttpClient;", "httpClient", "<init>", "(Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;Lcom/mobilefuse/sdk/internal/repository/AdLoadingConfig;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function5;Lcom/mobilefuse/sdk/network/client/HttpClient;)V", "Lcom/mobilefuse/sdk/exception/BaseError;", "", "errorCallback", "successCallback", "loadAd", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "repositoryType", "Ljava/lang/String;", "getRepositoryType", "()Ljava/lang/String;", "Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;", "getTelemetryAgent", "()Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;", "Lcom/mobilefuse/sdk/internal/repository/AdLoadingConfig;", "getAdLoadingConfig", "()Lcom/mobilefuse/sdk/internal/repository/AdLoadingConfig;", "Lkotlin/jvm/functions/Function1;", "getParserFactory", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function5;", "Lcom/mobilefuse/sdk/network/client/HttpClient;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class MfxAdRepository implements AdRepository<ParsedAdMarkupResponse> {

    @NotNull
    private final AdLoadingConfig adLoadingConfig;
    private final Function5<String, Integer, Integer, Boolean, Float, MfxBidRequest> bidRequestFactory;
    private final HttpClient httpClient;

    @NotNull
    private final Function1<AdmMediaType, AdmParser> parserFactory;

    @NotNull
    private final String repositoryType;

    @NotNull
    private final TelemetryAgent telemetryAgent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.mobilefuse.sdk.internal.repository.MfxAdRepository$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "p1", "", "p2", "p3", "", "p4", "", "p5", "Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "invoke", "(Ljava/lang/String;IIZLjava/lang/Float;)Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "<anonymous>"}, k = 3, mv = {1, 4, 3})
    public static final /* synthetic */ class AnonymousClass1 extends y implements Function5<String, Integer, Integer, Boolean, Float, MfxBidRequest> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(5, MfxRequestAdKt.class, "createMfxBidRequest", "createMfxBidRequest(Ljava/lang/String;IIZLjava/lang/Float;)Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", 1);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ MfxBidRequest invoke(String str, Integer num, Integer num2, Boolean bool, Float f10) {
            return invoke(str, num.intValue(), num2.intValue(), bool.booleanValue(), f10);
        }

        @NotNull
        public final MfxBidRequest invoke(@NotNull String p12, int i10, int i11, boolean z10, @Nullable Float f10) {
            Intrinsics.checkNotNullParameter(p12, "p1");
            return MfxRequestAdKt.createMfxBidRequest(p12, i10, i11, z10, f10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MfxAdRepository(@NotNull TelemetryAgent telemetryAgent, @NotNull AdLoadingConfig adLoadingConfig, @NotNull Function1<? super AdmMediaType, ? extends AdmParser> parserFactory, @NotNull Function5<? super String, ? super Integer, ? super Integer, ? super Boolean, ? super Float, MfxBidRequest> bidRequestFactory, @NotNull HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(telemetryAgent, "telemetryAgent");
        Intrinsics.checkNotNullParameter(adLoadingConfig, "adLoadingConfig");
        Intrinsics.checkNotNullParameter(parserFactory, "parserFactory");
        Intrinsics.checkNotNullParameter(bidRequestFactory, "bidRequestFactory");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.telemetryAgent = telemetryAgent;
        this.adLoadingConfig = adLoadingConfig;
        this.parserFactory = parserFactory;
        this.bidRequestFactory = bidRequestFactory;
        this.httpClient = httpClient;
        this.repositoryType = "mfx";
    }

    @Override // com.mobilefuse.sdk.internal.repository.AdRepository
    @NotNull
    public AdLoadingConfig getAdLoadingConfig() {
        return this.adLoadingConfig;
    }

    @Override // com.mobilefuse.sdk.internal.repository.AdRepository
    @NotNull
    public Function1<AdmMediaType, AdmParser> getParserFactory() {
        return this.parserFactory;
    }

    @Override // com.mobilefuse.sdk.internal.repository.AdRepository
    @NotNull
    public String getRepositoryType() {
        return this.repositoryType;
    }

    @Override // com.mobilefuse.sdk.internal.repository.AdRepository
    @NotNull
    public TelemetryAgent getTelemetryAgent() {
        return this.telemetryAgent;
    }

    @Override // com.mobilefuse.sdk.internal.repository.AdRepository
    public void loadAd(@NotNull final Function1<? super BaseError, Unit> errorCallback, @NotNull final Function1<? super ParsedAdMarkupResponse, Unit> successCallback) {
        Either errorResult;
        Intrinsics.checkNotNullParameter(errorCallback, "errorCallback");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            HttpPostRequest httpPostRequest$default = MfxBidRequestToHttpRequestKt.toHttpPostRequest$default(this.bidRequestFactory.invoke(getAdLoadingConfig().getPlacementId(), Integer.valueOf(getAdLoadingConfig().getAdWidth()), Integer.valueOf(getAdLoadingConfig().getAdHeight()), Boolean.valueOf(getAdLoadingConfig().isTestMode()), getAdLoadingConfig().getObservable().getFloatValueOrNull(ObservableConfigKey.BID_FLOOR)), null, 1, null);
            final TelemetryAction telemetryActionAddTelemetryMfxBidRequestAction = AdRepositoryTelemetryKt.addTelemetryMfxBidRequestAction(this, httpPostRequest$default);
            AdParserFlowKt.parse(MfxRequestAdKt.requestMfxAd(httpPostRequest$default, this.httpClient), getParserFactory()).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.internal.repository.MfxAdRepository$loadAd$$inlined$gracefullyHandleException$lambda$1
                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    if (result instanceof SuccessResult) {
                        Either either = (Either) ((SuccessResult) result).getValue();
                        AdRepositoryTelemetryKt.addTelemetryBidResponseAction$default(this, telemetryActionAddTelemetryMfxBidRequestAction, either, null, 4, null);
                        if (either instanceof SuccessResult) {
                            successCallback.invoke(((SuccessResult) either).getValue());
                        } else if (either instanceof ErrorResult) {
                            errorCallback.invoke(((ErrorResult) either).getValue());
                        }
                    }
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitError(@NotNull Throwable error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    FlowCollector.DefaultImpls.emitError(this, error);
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitSuccess(T t10) {
                    FlowCollector.DefaultImpls.emitSuccess(this, t10);
                }
            });
            errorResult = new SuccessResult(Unit.f93236a);
        } catch (Throwable th2) {
            if (MfxAdRepository$loadAd$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            errorCallback.invoke(new ProcessingError(((Throwable) ((ErrorResult) errorResult).getValue()).getMessage()));
        }
    }

    public /* synthetic */ MfxAdRepository(TelemetryAgent telemetryAgent, AdLoadingConfig adLoadingConfig, Function1 function1, Function5 function5, HttpClient httpClient, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(telemetryAgent, adLoadingConfig, function1, (i10 & 8) != 0 ? AnonymousClass1.INSTANCE : function5, (i10 & 16) != 0 ? HttpClientKt.getDefaultHttpClient() : httpClient);
    }
}
