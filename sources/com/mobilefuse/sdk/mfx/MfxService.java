package com.mobilefuse.sdk.mfx;

import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.network.client.HttpClient;
import com.mobilefuse.sdk.network.client.HttpClientKt;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.network.client.HttpParamsPostBody;
import com.mobilefuse.sdk.network.client.HttpPostRequest;
import com.mobilefuse.sdk.network.client.HttpResponse;
import com.mobilefuse.sdk.network.client.HttpResponsePrintLogFlowKt;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.network.model.MfxBidResponseFromJsonKt;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Js\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u000b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\b\b\u0002\u0010\t\u001a\u00020\b26\b\u0002\u0010\f\u001a0\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u000b\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u000b\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/mobilefuse/sdk/mfx/MfxService;", "", "<init>", "()V", "Lcom/mobilefuse/sdk/network/client/HttpPostRequest;", "Lcom/mobilefuse/sdk/network/client/HttpParamsPostBody;", "Lcom/mobilefuse/sdk/mfx/MfxPostRequest;", "request", "Lcom/mobilefuse/sdk/network/client/HttpClient;", "httpClient", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/rx/Flow;", "extraRequestConditions", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/exception/BaseError;", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "getHttpBidRequestFlow", "(Lcom/mobilefuse/sdk/network/client/HttpPostRequest;Lcom/mobilefuse/sdk/network/client/HttpClient;Lkotlin/jvm/functions/Function1;)Lcom/mobilefuse/sdk/rx/Flow;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class MfxService {

    @NotNull
    public static final MfxService INSTANCE = new MfxService();

    private MfxService() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow getHttpBidRequestFlow$default(MfxService mfxService, HttpPostRequest httpPostRequest, HttpClient httpClient, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            httpClient = HttpClientKt.getDefaultHttpClient();
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return mfxService.getHttpBidRequestFlow(httpPostRequest, httpClient, function1);
    }

    @NotNull
    public final Flow<Either<BaseError, MfxBidResponse>> getHttpBidRequestFlow(@NotNull final HttpPostRequest<HttpParamsPostBody> request, @NotNull final HttpClient httpClient, @Nullable Function1<? super Flow<HttpPostRequest<HttpParamsPostBody>>, ? extends Flow<HttpPostRequest<HttpParamsPostBody>>> extraRequestConditions) {
        Flow<HttpPostRequest<HttpParamsPostBody>> flowInvoke;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        final Flow<HttpPostRequest<HttpParamsPostBody>> flow = FlowKt.flow(new Function1<FlowCollector<? super HttpPostRequest<? extends HttpParamsPostBody>>, Unit>() { // from class: com.mobilefuse.sdk.mfx.MfxService.getHttpBidRequestFlow.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super HttpPostRequest<? extends HttpParamsPostBody>> flowCollector) {
                invoke2((FlowCollector<? super HttpPostRequest<HttpParamsPostBody>>) flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull FlowCollector<? super HttpPostRequest<HttpParamsPostBody>> receiver) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                DebuggingKt.logDebug$default(receiver, "Bid Request: " + request, null, 2, null);
                FlowKt.emit(receiver, request);
            }
        });
        if (extraRequestConditions != null && (flowInvoke = extraRequestConditions.invoke(flow)) != null) {
            flow = flowInvoke;
        }
        final Flow<Either<HttpError, HttpResponse>> flowLogHttpResponse = HttpResponsePrintLogFlowKt.logHttpResponse(FlowKt.flow(new Function1<FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>>, Unit>() { // from class: com.mobilefuse.sdk.mfx.MfxService$getHttpBidRequestFlow$$inlined$transform$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>> flow2) {
                Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                flow.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.mfx.MfxService$getHttpBidRequestFlow$$inlined$transform$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value instanceof SuccessResult) {
                            final FlowCollector flowCollector = flow2;
                            httpClient.post((HttpPostRequest) ((SuccessResult) value).getValue(), new Function1<Either<? extends HttpError, ? extends HttpResponse>, Unit>() { // from class: com.mobilefuse.sdk.mfx.MfxService$getHttpBidRequestFlow$$inlined$transform$1$1$lambda$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Either<? extends HttpError, ? extends HttpResponse> either) {
                                    invoke2((Either<? extends HttpError, HttpResponse>) either);
                                    return Unit.f93236a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull Either<? extends HttpError, HttpResponse> it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    FlowKt.emit(flowCollector, it);
                                }
                            });
                        } else if (value instanceof ErrorResult) {
                            flow2.emit(value);
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
        }), "Bid Response", MapsKt.mapOf(TuplesKt.to("Placement ID", ((HttpParamsPostBody) request.getBody()).getParams().get("tagid"))));
        final Flow flow2 = FlowKt.flow(new Function1<FlowCollector<? super Either<? extends BaseError, ? extends MfxBidResponse>>, Unit>() { // from class: com.mobilefuse.sdk.mfx.MfxService$getHttpBidRequestFlow$$inlined$mapEitherSuccessResult$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends BaseError, ? extends MfxBidResponse>> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends MfxBidResponse>> flow3) {
                Intrinsics.checkNotNullParameter(flow3, "$this$flow");
                flowLogHttpResponse.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.mfx.MfxService$getHttpBidRequestFlow$$inlined$mapEitherSuccessResult$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!(value instanceof SuccessResult)) {
                            if (value instanceof ErrorResult) {
                                flow3.emit(value);
                                return;
                            }
                            return;
                        }
                        FlowCollector flowCollector = flow3;
                        Either either = (Either) ((SuccessResult) value).getValue();
                        try {
                            if (either instanceof ErrorResult) {
                                flowCollector.emit(new SuccessResult(either));
                            } else if (either instanceof SuccessResult) {
                                flowCollector.emit(new SuccessResult(MfxBidResponseFromJsonKt.fromJson(MfxBidResponse.INSTANCE, ((HttpResponse) ((SuccessResult) either).getValue()).getBody())));
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
        });
        return FlowKt.flow(new Function1<FlowCollector<? super Either<? extends BaseError, ? extends MfxBidResponse>>, Unit>() { // from class: com.mobilefuse.sdk.mfx.MfxService$getHttpBidRequestFlow$$inlined$catchElse$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends BaseError, ? extends MfxBidResponse>> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends MfxBidResponse>> flow3) {
                Intrinsics.checkNotNullParameter(flow3, "$this$flow");
                flow2.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.mfx.MfxService$getHttpBidRequestFlow$$inlined$catchElse$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        FlowCollector flowCollector = flow3;
                        if (value instanceof ErrorResult) {
                            flowCollector.emit(new SuccessResult(new ErrorResult(new ProcessingError(((Throwable) ((ErrorResult) value).getValue()).getMessage()))));
                        } else if (value instanceof SuccessResult) {
                            flowCollector.emit(value);
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
    }
}
