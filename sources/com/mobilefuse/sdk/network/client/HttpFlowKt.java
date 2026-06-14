package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aJ\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f\u001aR\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f\u001aV\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00060\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u001a^\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\b\u0012\u0004\u0012\u00020\u000f0\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u001a<\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001\"\b\b\u0000\u0010\u0012*\u00020\u000f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u00130\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¨\u0006\u0014"}, d2 = {"requestHttpGet", "Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/network/client/HttpError;", "Lcom/mobilefuse/sdk/network/client/HttpResponse;", "url", "", "timeoutMillis", "", "headers", "", "gzipEncoding", "", "requestHttpPost", "body", "Lcom/mobilefuse/sdk/network/client/HttpPostBody;", "httpClient", "Lcom/mobilefuse/sdk/network/client/HttpClient;", "T", "Lcom/mobilefuse/sdk/network/client/HttpPostRequest;", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class HttpFlowKt {
    @NotNull
    public static final Flow<Either<HttpError, HttpResponse>> requestHttpGet(@NotNull String url, long j10, @NotNull Map<String, String> headers, boolean z10) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        final Flow flowFlowSingle = FlowKt.flowSingle(url);
        final Schedulers schedulers = Schedulers.IO;
        return requestHttpGet$default(FlowKt.flow(new Function1<FlowCollector<? super T>, Unit>() { // from class: com.mobilefuse.sdk.network.client.HttpFlowKt$runOn$$inlined$transformForConcurrency$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((FlowCollector) obj);
                return Unit.f93236a;
            }

            public final void invoke(@NotNull final FlowCollector<? super T> receiver) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                flowFlowSingle.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.network.client.HttpFlowKt$runOn$$inlined$transformForConcurrency$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        final FlowCollector flowCollector = receiver;
                        SchedulersKt.runOnScheduler(schedulers, new Function0<Unit>() { // from class: com.mobilefuse.sdk.network.client.HttpFlowKt$runOn$$inlined$transformForConcurrency$1$1$lambda$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                flowCollector.emit(value);
                            }
                        });
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
        }), j10, headers, z10, null, 8, null);
    }

    public static /* synthetic */ Flow requestHttpGet$default(Flow flow, long j10, Map map, boolean z10, HttpClient httpClient, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 5000;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        Map map2 = map;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            httpClient = HttpClientKt.getDefaultHttpClient();
        }
        return requestHttpGet(flow, j11, map2, z11, httpClient);
    }

    @NotNull
    public static final Flow<Either<HttpError, HttpResponse>> requestHttpPost(@NotNull String url, @NotNull HttpPostBody body, long j10, @NotNull Map<String, String> headers, boolean z10) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        final Flow flowFlowSingle = FlowKt.flowSingle(body);
        final Schedulers schedulers = Schedulers.IO;
        return requestHttpPost$default(FlowKt.flow(new Function1<FlowCollector<? super T>, Unit>() { // from class: com.mobilefuse.sdk.network.client.HttpFlowKt$runOn$$inlined$transformForConcurrency$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((FlowCollector) obj);
                return Unit.f93236a;
            }

            public final void invoke(@NotNull final FlowCollector<? super T> flow) {
                Intrinsics.checkNotNullParameter(flow, "$this$flow");
                flowFlowSingle.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.network.client.HttpFlowKt$runOn$$inlined$transformForConcurrency$2.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        final FlowCollector flowCollector = flow;
                        SchedulersKt.runOnScheduler(schedulers, new Function0<Unit>() { // from class: com.mobilefuse.sdk.network.client.HttpFlowKt$runOn$$inlined$transformForConcurrency$2$1$lambda$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                flowCollector.emit(value);
                            }
                        });
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
        }), url, j10, headers, z10, null, 16, null);
    }

    public static /* synthetic */ Flow requestHttpPost$default(Flow flow, HttpClient httpClient, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            httpClient = HttpClientKt.getDefaultHttpClient();
        }
        return requestHttpPost(flow, httpClient);
    }

    public static /* synthetic */ Flow requestHttpPost$default(Flow flow, String str, long j10, Map map, boolean z10, HttpClient httpClient, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 5000;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        Map map2 = map;
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            httpClient = HttpClientKt.getDefaultHttpClient();
        }
        return requestHttpPost(flow, str, j11, map2, z11, httpClient);
    }

    public static /* synthetic */ Flow requestHttpGet$default(String str, long j10, Map map, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 5000;
        }
        if ((i10 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return requestHttpGet(str, j10, map, z10);
    }

    public static /* synthetic */ Flow requestHttpPost$default(String str, HttpPostBody httpPostBody, long j10, Map map, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = 5000;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            map = MapsKt.emptyMap();
        }
        Map map2 = map;
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        return requestHttpPost(str, httpPostBody, j11, map2, z10);
    }

    @NotNull
    public static final Flow<Either<HttpError, HttpResponse>> requestHttpGet(@NotNull final Flow<String> requestHttpGet, final long j10, @NotNull final Map<String, String> headers, final boolean z10, @NotNull final HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(requestHttpGet, "$this$requestHttpGet");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        return FlowKt.flow(new Function1<FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>>, Unit>() { // from class: com.mobilefuse.sdk.network.client.HttpFlowKt$requestHttpGet$$inlined$transform$1
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
            public final void invoke2(@NotNull final FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>> receiver) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                requestHttpGet.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.network.client.HttpFlowKt$requestHttpGet$$inlined$transform$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!(value instanceof SuccessResult)) {
                            if (value instanceof ErrorResult) {
                                receiver.emit(value);
                                return;
                            }
                            return;
                        }
                        final FlowCollector flowCollector = receiver;
                        String str = (String) ((SuccessResult) value).getValue();
                        try {
                            HttpFlowKt$requestHttpGet$$inlined$transform$1 httpFlowKt$requestHttpGet$$inlined$transform$1 = HttpFlowKt$requestHttpGet$$inlined$transform$1.this;
                            httpClient.get(new HttpGetRequest(str, headers, z10, false, j10, 8, null), new Function1<Either<? extends HttpError, ? extends HttpResponse>, Unit>() { // from class: com.mobilefuse.sdk.network.client.HttpFlowKt$requestHttpGet$$inlined$transform$1$1$lambda$1
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
    }

    @NotNull
    public static final <T extends HttpPostBody> Flow<Either<HttpError, HttpResponse>> requestHttpPost(@NotNull final Flow<? extends HttpPostRequest<? extends T>> requestHttpPost, @NotNull final HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(requestHttpPost, "$this$requestHttpPost");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        return FlowKt.flow(new Function1<FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>>, Unit>() { // from class: com.mobilefuse.sdk.network.client.HttpFlowKt$requestHttpPost$$inlined$transform$1
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
            public final void invoke2(@NotNull final FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>> flow) {
                Intrinsics.checkNotNullParameter(flow, "$this$flow");
                requestHttpPost.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.network.client.HttpFlowKt$requestHttpPost$$inlined$transform$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!(value instanceof SuccessResult)) {
                            if (value instanceof ErrorResult) {
                                flow.emit(value);
                            }
                        } else {
                            final FlowCollector flowCollector = flow;
                            try {
                                httpClient.post((HttpPostRequest) ((SuccessResult) value).getValue(), new Function1<Either<? extends HttpError, ? extends HttpResponse>, Unit>() { // from class: com.mobilefuse.sdk.network.client.HttpFlowKt$requestHttpPost$$inlined$transform$1$1$lambda$1
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
                            } catch (Throwable th2) {
                                flowCollector.emit(new ErrorResult(th2));
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
            }
        });
    }

    @NotNull
    public static final Flow<Either<HttpError, HttpResponse>> requestHttpPost(@NotNull final Flow<? extends HttpPostBody> requestHttpPost, @NotNull final String url, final long j10, @NotNull final Map<String, String> headers, final boolean z10, @NotNull final HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(requestHttpPost, "$this$requestHttpPost");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        return FlowKt.flow(new Function1<FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>>, Unit>() { // from class: com.mobilefuse.sdk.network.client.HttpFlowKt$requestHttpPost$$inlined$transform$2
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
            public final void invoke2(@NotNull final FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>> flow) {
                Intrinsics.checkNotNullParameter(flow, "$this$flow");
                requestHttpPost.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.network.client.HttpFlowKt$requestHttpPost$$inlined$transform$2.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!(value instanceof SuccessResult)) {
                            if (value instanceof ErrorResult) {
                                flow.emit(value);
                                return;
                            }
                            return;
                        }
                        final FlowCollector flowCollector = flow;
                        HttpPostBody httpPostBody = (HttpPostBody) ((SuccessResult) value).getValue();
                        try {
                            HttpFlowKt$requestHttpPost$$inlined$transform$2 httpFlowKt$requestHttpPost$$inlined$transform$2 = HttpFlowKt$requestHttpPost$$inlined$transform$2.this;
                            httpClient.post(new HttpPostRequest<>(url, httpPostBody, headers, z10, false, j10, 16, null), new Function1<Either<? extends HttpError, ? extends HttpResponse>, Unit>() { // from class: com.mobilefuse.sdk.network.client.HttpFlowKt$requestHttpPost$$inlined$transform$2$1$lambda$1
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
    }
}
