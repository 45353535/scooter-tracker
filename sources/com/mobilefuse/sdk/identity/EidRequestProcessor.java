package com.mobilefuse.sdk.identity;

import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.MobileFuseTargetingData;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.encoding.Base64Kt;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.identity.EidService;
import com.mobilefuse.sdk.network.client.HttpBinaryPostBody;
import com.mobilefuse.sdk.network.client.HttpClient;
import com.mobilefuse.sdk.network.client.HttpClientKt;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.network.client.HttpFlowKt;
import com.mobilefuse.sdk.network.client.HttpJsonPostBody;
import com.mobilefuse.sdk.network.client.HttpPostBody;
import com.mobilefuse.sdk.network.client.HttpResponse;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetryBaseParamType;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionType;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001c\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b \u0010\u0014J\u001f\u0010&\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u0007H\u0001¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020\r¢\u0006\u0004\b'\u0010\u001fR<\u0010)\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R0\u00101\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0012\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R.\u00108\u001a\u0004\u0018\u00010\u00102\b\u00107\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010=\u001a\u0004\b:\u0010;R*\u0010?\u001a\u0004\u0018\u00010>8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b?\u0010@\u0012\u0004\bE\u0010=\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010GR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010H¨\u0006I"}, d2 = {"Lcom/mobilefuse/sdk/identity/EidRequestProcessor;", "", "Lcom/mobilefuse/sdk/identity/EidRequestBuilder;", "requestBuilder", "Lcom/mobilefuse/sdk/network/client/HttpClient;", "httpClient", "", "", "userDataRefreshTrigger", "<init>", "(Lcom/mobilefuse/sdk/identity/EidRequestBuilder;Lcom/mobilefuse/sdk/network/client/HttpClient;Ljava/util/Set;)V", "Lcom/mobilefuse/sdk/identity/EidSdkData;", "eidData", "", "isAllowedToRefresh", "(Lcom/mobilefuse/sdk/identity/EidSdkData;)Z", "Lcom/mobilefuse/sdk/identity/EidUpdateRequest;", "eidRequest", "", "addRequestTelemetryAction", "(Lcom/mobilefuse/sdk/identity/EidUpdateRequest;)V", "Lcom/mobilefuse/sdk/network/client/HttpResponse;", "eidResponse", "addResponseTelemetryAction", "(Lcom/mobilefuse/sdk/network/client/HttpResponse;)V", "Lcom/mobilefuse/sdk/identity/IdentifierUpdateSignal;", MRAIDPresenter.UPDATE_SIGNALS, "postpone", "processRequest", "(Lcom/mobilefuse/sdk/identity/EidSdkData;Ljava/util/Set;Z)V", "processPostponedRequest", "()Z", "sendRequest$mobilefuse_sdk_core_release", "sendRequest", "currentEidData", "requestUserPayload", "hasUserDataChanged$mobilefuse_sdk_core_release", "(Lcom/mobilefuse/sdk/identity/EidSdkData;Ljava/lang/String;)Z", "hasUserDataChanged", "shouldApplyCoppaRestrictions", "Lkotlin/Function2;", "onNewEidDataReceived", "Lkotlin/jvm/functions/Function2;", "getOnNewEidDataReceived", "()Lkotlin/jvm/functions/Function2;", "setOnNewEidDataReceived", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/exception/BaseError;", "onNewEidDataError", "Lkotlin/jvm/functions/Function1;", "getOnNewEidDataError", "()Lkotlin/jvm/functions/Function1;", "setOnNewEidDataError", "(Lkotlin/jvm/functions/Function1;)V", "<set-?>", "postponedEidRequest", "Lcom/mobilefuse/sdk/identity/EidUpdateRequest;", "getPostponedEidRequest", "()Lcom/mobilefuse/sdk/identity/EidUpdateRequest;", "getPostponedEidRequest$annotations", "()V", "", "activeRequestTimestamp", "Ljava/lang/Long;", "getActiveRequestTimestamp$mobilefuse_sdk_core_release", "()Ljava/lang/Long;", "setActiveRequestTimestamp$mobilefuse_sdk_core_release", "(Ljava/lang/Long;)V", "getActiveRequestTimestamp$mobilefuse_sdk_core_release$annotations", "Lcom/mobilefuse/sdk/identity/EidRequestBuilder;", "Lcom/mobilefuse/sdk/network/client/HttpClient;", "Ljava/util/Set;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class EidRequestProcessor {

    @Nullable
    private Long activeRequestTimestamp;
    private final HttpClient httpClient;

    @Nullable
    private Function1<? super BaseError, Unit> onNewEidDataError;

    @Nullable
    private Function2<? super EidSdkData, ? super Set<String>, Unit> onNewEidDataReceived;

    @Nullable
    private EidUpdateRequest postponedEidRequest;
    private final EidRequestBuilder requestBuilder;
    private final Set<String> userDataRefreshTrigger;

    public EidRequestProcessor(@NotNull EidRequestBuilder requestBuilder, @NotNull HttpClient httpClient, @NotNull Set<String> userDataRefreshTrigger) {
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(userDataRefreshTrigger, "userDataRefreshTrigger");
        this.requestBuilder = requestBuilder;
        this.httpClient = httpClient;
        this.userDataRefreshTrigger = userDataRefreshTrigger;
    }

    private final void addRequestTelemetryAction(EidUpdateRequest eidRequest) {
        String string;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            EidService.Companion companion = EidService.INSTANCE;
            if (companion.getTelemetryActionsEnabled$mobilefuse_sdk_core_release()) {
                TelemetrySdkActionType telemetrySdkActionType = TelemetrySdkActionType.EID_REQUEST_SENT;
                TelemetryBaseParamType telemetryBaseParamType = TelemetryBaseParamType.BODY;
                HttpPostBody requestBody = eidRequest.getRequestBody();
                if (requestBody instanceof HttpBinaryPostBody) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("data:application/octet-stream;base64,");
                    String strBase64Encode = Base64Kt.base64Encode(((HttpBinaryPostBody) requestBody).getContent());
                    if (strBase64Encode == null) {
                        strBase64Encode = "";
                    }
                    sb2.append(strBase64Encode);
                    string = sb2.toString();
                } else if (requestBody instanceof HttpJsonPostBody) {
                    string = "data:application/json," + ((HttpJsonPostBody) requestBody).getJson();
                } else {
                    string = "data:text/plain,unknown";
                }
                companion.addTelemetryAction$mobilefuse_sdk_core_release(telemetrySdkActionType, CollectionsKt.listOf((Object[]) new TelemetryActionParam[]{new TelemetryActionParam(telemetryBaseParamType, string, false), new TelemetryActionParam(TelemetryBaseParamType.HEADERS, MapsKt.toList(eidRequest.getRequestBody().getHeaders()), false)}));
            }
        } catch (Throwable th2) {
            int i10 = EidRequestProcessor$addRequestTelemetryAction$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addResponseTelemetryAction(HttpResponse eidResponse) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            EidService.Companion companion = EidService.INSTANCE;
            if (companion.getTelemetryActionsEnabled$mobilefuse_sdk_core_release()) {
                companion.addTelemetryAction$mobilefuse_sdk_core_release(TelemetrySdkActionType.EID_RESPONSE_RECEIVED, CollectionsKt.listOf((Object[]) new TelemetryActionParam[]{new TelemetryActionParam(TelemetryBaseParamType.BODY, eidResponse.getBody(), false), new TelemetryActionParam(TelemetryBaseParamType.STATUS_CODE, Integer.valueOf(eidResponse.getStatusCode()), false)}));
            }
        } catch (Throwable th2) {
            int i10 = EidRequestProcessor$addResponseTelemetryAction$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getActiveRequestTimestamp$mobilefuse_sdk_core_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPostponedEidRequest$annotations() {
    }

    private final boolean isAllowedToRefresh(EidSdkData eidData) {
        return eidData.getMfxRefreshTimestamp() <= System.currentTimeMillis();
    }

    @Nullable
    /* JADX INFO: renamed from: getActiveRequestTimestamp$mobilefuse_sdk_core_release, reason: from getter */
    public final Long getActiveRequestTimestamp() {
        return this.activeRequestTimestamp;
    }

    @Nullable
    public final Function1<BaseError, Unit> getOnNewEidDataError() {
        return this.onNewEidDataError;
    }

    @Nullable
    public final Function2<EidSdkData, Set<String>, Unit> getOnNewEidDataReceived() {
        return this.onNewEidDataReceived;
    }

    @Nullable
    public final EidUpdateRequest getPostponedEidRequest() {
        return this.postponedEidRequest;
    }

    @VisibleForTesting
    public final boolean hasUserDataChanged$mobilefuse_sdk_core_release(@NotNull EidSdkData currentEidData, @NotNull String requestUserPayload) {
        Either errorResult;
        Object value;
        boolean z10;
        Intrinsics.checkNotNullParameter(currentEidData, "currentEidData");
        Intrinsics.checkNotNullParameter(requestUserPayload, "requestUserPayload");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (currentEidData.getUserPayload() == null) {
                z10 = true;
                errorResult = new SuccessResult(Boolean.valueOf(z10));
            } else {
                JSONObject jSONObject = new JSONObject(currentEidData.getUserPayload());
                JSONObject jSONObject2 = new JSONObject(requestUserPayload);
                for (String str : this.userDataRefreshTrigger) {
                    if (!Intrinsics.areEqual(jSONObject.has(str) ? jSONObject.get(str) : null, jSONObject2.has(str) ? jSONObject2.get(str) : null)) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
                errorResult = new SuccessResult(Boolean.valueOf(z10));
            }
        } catch (Throwable th2) {
            if (EidRequestProcessor$hasUserDataChanged$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            value = Boolean.FALSE;
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public final boolean processPostponedRequest() {
        EidUpdateRequest eidUpdateRequest = this.postponedEidRequest;
        if (eidUpdateRequest == null) {
            return false;
        }
        this.postponedEidRequest = null;
        EidService.INSTANCE.log$mobilefuse_sdk_core_release("(+) Process postponed EID refresh request");
        sendRequest$mobilefuse_sdk_core_release(eidUpdateRequest);
        return true;
    }

    public final void processRequest(@NotNull EidSdkData eidData, @NotNull Set<? extends IdentifierUpdateSignal> updateSignals, boolean postpone) {
        Intrinsics.checkNotNullParameter(eidData, "eidData");
        Intrinsics.checkNotNullParameter(updateSignals, "updateSignals");
        this.postponedEidRequest = null;
        Either<BaseError, EidUpdateRequest> eitherBuildRequest = this.requestBuilder.buildRequest(eidData);
        if (!(eitherBuildRequest instanceof SuccessResult)) {
            if (!(eitherBuildRequest instanceof ErrorResult)) {
                throw new m();
            }
            return;
        }
        EidUpdateRequest eidUpdateRequest = (EidUpdateRequest) ((SuccessResult) eitherBuildRequest).getValue();
        boolean zHasUserDataChanged$mobilefuse_sdk_core_release = hasUserDataChanged$mobilefuse_sdk_core_release(eidData, eidUpdateRequest.getRequestUserPayload());
        EidService.Companion companion = EidService.INSTANCE;
        companion.log$mobilefuse_sdk_core_release("(+) User data has changed: " + zHasUserDataChanged$mobilefuse_sdk_core_release);
        if (!updateSignals.contains(IdentifierUpdateSignal.EID_REFRESH_TIMEOUT) && !zHasUserDataChanged$mobilefuse_sdk_core_release && !isAllowedToRefresh(eidData)) {
            companion.log$mobilefuse_sdk_core_release("(-) Current EID request is not allowed to be sent due to timestamp or not changed user data. Reject request.");
        } else if (!postpone) {
            sendRequest$mobilefuse_sdk_core_release(eidUpdateRequest);
        } else {
            companion.log$mobilefuse_sdk_core_release("(+) Postpone EID refresh request");
            this.postponedEidRequest = eidUpdateRequest;
        }
    }

    @VisibleForTesting
    public final void sendRequest$mobilefuse_sdk_core_release(@NotNull final EidUpdateRequest eidRequest) {
        Intrinsics.checkNotNullParameter(eidRequest, "eidRequest");
        EidService.INSTANCE.log$mobilefuse_sdk_core_release("(+) Send EID refresh request");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.activeRequestTimestamp = Long.valueOf(jCurrentTimeMillis);
        addRequestTelemetryAction(eidRequest);
        if (!shouldApplyCoppaRestrictions()) {
            final Flow<Either<HttpError, HttpResponse>> flowRequestHttpPost = HttpFlowKt.requestHttpPost(FlowKt.flowSingle(eidRequest.getRequestBody()), EidService.MFX_EID_ENDPOINT, 10000L, MapsKt.emptyMap(), false, this.httpClient);
            final Flow flow = FlowKt.flow(new Function1<FlowCollector<? super Either<? extends BaseError, ? extends HttpResponse>>, Unit>() { // from class: com.mobilefuse.sdk.identity.EidRequestProcessor$sendRequest$$inlined$map$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends BaseError, ? extends HttpResponse>> flowCollector) {
                    invoke2(flowCollector);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends HttpResponse>> flow2) {
                    Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                    flowRequestHttpPost.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.identity.EidRequestProcessor$sendRequest$$inlined$map$1.1
                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            if (!(value instanceof SuccessResult)) {
                                if (value instanceof ErrorResult) {
                                    flow2.emit(value);
                                    return;
                                }
                                return;
                            }
                            FlowCollector flowCollector = flow2;
                            try {
                                Object errorResult = (Either) ((SuccessResult) value).getValue();
                                EidRequestProcessor$sendRequest$$inlined$map$1 eidRequestProcessor$sendRequest$$inlined$map$1 = EidRequestProcessor$sendRequest$$inlined$map$1.this;
                                long j10 = jCurrentTimeMillis;
                                Long activeRequestTimestamp = this.getActiveRequestTimestamp();
                                if (activeRequestTimestamp != null && j10 == activeRequestTimestamp.longValue()) {
                                    this.setActiveRequestTimestamp$mobilefuse_sdk_core_release(null);
                                } else {
                                    errorResult = new ErrorResult(new ProcessingError("Received response for outdated request (response timestamp did not match active request timestamp)"));
                                }
                                flowCollector.emit(new SuccessResult(errorResult));
                            } catch (Throwable th2) {
                                flowCollector.emit(new ErrorResult(th2));
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
                }
            });
            FlowKt.flow(new Function1<FlowCollector<? super Either<? extends BaseError, ? extends Pair<? extends EidSdkData, ? extends Set<? extends String>>>>, Unit>() { // from class: com.mobilefuse.sdk.identity.EidRequestProcessor$sendRequest$$inlined$mapEitherSuccessResult$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends BaseError, ? extends Pair<? extends EidSdkData, ? extends Set<? extends String>>>> flowCollector) {
                    invoke2(flowCollector);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends Pair<? extends EidSdkData, ? extends Set<? extends String>>>> flow2) {
                    Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                    flow.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.identity.EidRequestProcessor$sendRequest$$inlined$mapEitherSuccessResult$1.1
                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            if (!(value instanceof SuccessResult)) {
                                if (value instanceof ErrorResult) {
                                    flow2.emit(value);
                                    return;
                                }
                                return;
                            }
                            FlowCollector flowCollector = flow2;
                            Either either = (Either) ((SuccessResult) value).getValue();
                            try {
                                if (either instanceof ErrorResult) {
                                    flowCollector.emit(new SuccessResult(either));
                                } else if (either instanceof SuccessResult) {
                                    HttpResponse httpResponse = (HttpResponse) ((SuccessResult) either).getValue();
                                    this.addResponseTelemetryAction(httpResponse);
                                    flowCollector.emit(new SuccessResult(ParseEidResponseKt.applyEidResponseToCurrentEidData(eidRequest.getEidData(), eidRequest.getRequestUserPayload(), httpResponse.getBody())));
                                }
                            } catch (Throwable th2) {
                                flowCollector.emit(new ErrorResult(th2));
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
                }
            }).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.identity.EidRequestProcessor$sendRequest$$inlined$collectResult$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                    Function1<BaseError, Unit> onNewEidDataError;
                    Intrinsics.checkNotNullParameter(result, "result");
                    if (result instanceof SuccessResult) {
                        Either either = (Either) ((SuccessResult) result).getValue();
                        if (!(either instanceof SuccessResult)) {
                            if (!(either instanceof ErrorResult) || (onNewEidDataError = this.this$0.getOnNewEidDataError()) == 0) {
                                return;
                            }
                            return;
                        }
                        Function2<EidSdkData, Set<String>, Unit> onNewEidDataReceived = this.this$0.getOnNewEidDataReceived();
                        if (onNewEidDataReceived != 0) {
                            SuccessResult successResult = (SuccessResult) either;
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
        } else {
            Function1<? super BaseError, Unit> function1 = this.onNewEidDataError;
            if (function1 != null) {
                function1.invoke(new ProcessingError("Skipping EID request due to COPPA!"));
            }
        }
    }

    public final void setActiveRequestTimestamp$mobilefuse_sdk_core_release(@Nullable Long l10) {
        this.activeRequestTimestamp = l10;
    }

    public final void setOnNewEidDataError(@Nullable Function1<? super BaseError, Unit> function1) {
        this.onNewEidDataError = function1;
    }

    public final void setOnNewEidDataReceived(@Nullable Function2<? super EidSdkData, ? super Set<String>, Unit> function2) {
        this.onNewEidDataReceived = function2;
    }

    public final boolean shouldApplyCoppaRestrictions() {
        int age;
        return MobileFuse.getPrivacyPreferences().isSubjectToCoppa() || (1 <= (age = MobileFuseTargetingData.INSTANCE.getAge()) && 12 >= age);
    }

    public /* synthetic */ EidRequestProcessor(EidRequestBuilder eidRequestBuilder, HttpClient httpClient, Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eidRequestBuilder, (i10 & 2) != 0 ? HttpClientKt.getDefaultHttpClient() : httpClient, (i10 & 4) != 0 ? SetsKt.setOf((Object[]) new String[]{EidRequestBuilder.REQUEST_FIELD_EMAIL, "p", EidRequestBuilder.REQUEST_FIELD_IFA, EidRequestBuilder.REQUEST_FIELD_GPP, EidRequestBuilder.REQUEST_FIELD_US_PRIVACY, EidRequestBuilder.REQUEST_FIELD_LMT}) : set);
    }
}
