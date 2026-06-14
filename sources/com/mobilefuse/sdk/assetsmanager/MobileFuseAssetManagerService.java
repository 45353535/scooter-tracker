package com.mobilefuse.sdk.assetsmanager;

import com.ironsource.V5;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.network.client.HttpClientKt;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.network.client.HttpGetRequest;
import com.mobilefuse.sdk.network.client.HttpResponse;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import uf.i;
import uf.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/mobilefuse/sdk/assetsmanager/MobileFuseAssetManagerService;", "", "()V", "ASSET_FOLDER_NAME", "", "getASSET_FOLDER_NAME", "()Ljava/lang/String;", "DEFAULT_ASSETS_LIST", "", "getDEFAULT_ASSETS_LIST", "()Ljava/util/List;", "getAssetManifestJson", "Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/exception/BaseError;", "Lcom/mobilefuse/sdk/assetsmanager/MobileFuseAssetManifestResponse;", "request", "Lcom/mobilefuse/sdk/network/client/HttpGetRequest;", "resolveAssetPath", "", "url", V5.c.f41892b, V5.b.f41885a, "", "body", "", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class MobileFuseAssetManagerService {

    @NotNull
    private final String ASSET_FOLDER_NAME = "mobilefusecdn/assets";

    @NotNull
    private final List<String> DEFAULT_ASSETS_LIST = CollectionsKt.listOf((Object[]) new String[]{"mraid.js", "vast.js", "vast_controls.html", "vast_static_resource.html", "ad_template.html", "mraid_controls.html", "mraid_close_controls.js"});

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveFile(byte[] body, String fileName) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            File file = new File(AppLifecycleHelper.getGlobalContext().getFilesDir(), this.ASSET_FOLDER_NAME);
            if (!file.exists()) {
                file.mkdirs();
            }
            i.n(new File(file, fileName), body);
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @NotNull
    public final String getASSET_FOLDER_NAME() {
        return this.ASSET_FOLDER_NAME;
    }

    @NotNull
    public final Flow<Either<BaseError, MobileFuseAssetManifestResponse>> getAssetManifestJson(@NotNull final HttpGetRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        final Flow flow = FlowKt.flow(new Function1<FlowCollector<? super HttpGetRequest>, Unit>() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService.getAssetManifestJson.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super HttpGetRequest> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull FlowCollector<? super HttpGetRequest> receiver) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                DebuggingKt.logDebug$default(receiver, "Assets request: " + request, null, 2, null);
                FlowKt.emit(receiver, request);
            }
        });
        final Flow flow2 = FlowKt.flow(new Function1<FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>>, Unit>() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$getAssetManifestJson$$inlined$transform$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>> flow3) {
                Intrinsics.checkNotNullParameter(flow3, "$this$flow");
                flow.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$getAssetManifestJson$$inlined$transform$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value instanceof SuccessResult) {
                            final FlowCollector flowCollector = flow3;
                            HttpClientKt.getDefaultHttpClient().get((HttpGetRequest) ((SuccessResult) value).getValue(), new Function1<Either<? extends HttpError, ? extends HttpResponse>, Unit>() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$getAssetManifestJson$$inlined$transform$1$1$lambda$1
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
                            flow3.emit(value);
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
        final Schedulers schedulers = Schedulers.IO;
        final Flow flow3 = FlowKt.flow(new Function1<FlowCollector<? super T>, Unit>() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$emitOn$$inlined$transformOnThread$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((FlowCollector) obj);
                return Unit.f93236a;
            }

            public final void invoke(@NotNull final FlowCollector<? super T> flow4) {
                Intrinsics.checkNotNullParameter(flow4, "$this$flow");
                SchedulersKt.runOnScheduler(schedulers, new Function0<Unit>() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$emitOn$$inlined$transformOnThread$1.1
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
                        flow2.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$emitOn$.inlined.transformOnThread.1.1.1
                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                flow4.emit(value);
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
        });
        final Flow flow4 = FlowKt.flow(new Function1<FlowCollector<? super Either<? extends BaseError, ? extends MobileFuseAssetManifestResponse>>, Unit>() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$getAssetManifestJson$$inlined$mapEitherSuccessResult$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends BaseError, ? extends MobileFuseAssetManifestResponse>> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends MobileFuseAssetManifestResponse>> flow5) {
                Intrinsics.checkNotNullParameter(flow5, "$this$flow");
                flow3.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$getAssetManifestJson$$inlined$mapEitherSuccessResult$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!(value instanceof SuccessResult)) {
                            if (value instanceof ErrorResult) {
                                flow5.emit(value);
                                return;
                            }
                            return;
                        }
                        FlowCollector flowCollector = flow5;
                        Either either = (Either) ((SuccessResult) value).getValue();
                        try {
                            if (either instanceof ErrorResult) {
                                flowCollector.emit(new SuccessResult(either));
                            } else if (either instanceof SuccessResult) {
                                HttpResponse httpResponse = (HttpResponse) ((SuccessResult) either).getValue();
                                flowCollector.emit(new SuccessResult(httpResponse.getBody().length() == 0 ? new ErrorResult<>(new ProcessingError("The response is empty")) : MobileFuseAssetManifestResponse.INSTANCE.mapperFromJson(httpResponse.getBody())));
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
        return FlowKt.flow(new Function1<FlowCollector<? super Either<? extends BaseError, ? extends MobileFuseAssetManifestResponse>>, Unit>() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$getAssetManifestJson$$inlined$catchElse$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends BaseError, ? extends MobileFuseAssetManifestResponse>> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends MobileFuseAssetManifestResponse>> flow5) {
                Intrinsics.checkNotNullParameter(flow5, "$this$flow");
                flow4.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$getAssetManifestJson$$inlined$catchElse$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        FlowCollector flowCollector = flow5;
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

    @NotNull
    public final List<String> getDEFAULT_ASSETS_LIST() {
        return this.DEFAULT_ASSETS_LIST;
    }

    @NotNull
    public final Flow<Boolean> resolveAssetPath(@NotNull final String url, @NotNull final String fileName) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        final Flow flow = FlowKt.flow(new Function1<FlowCollector<? super Boolean>, Unit>() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService.resolveAssetPath.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Boolean> flowCollector) throws IOException {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull FlowCollector<? super Boolean> receiver) throws IOException {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                DebuggingKt.logDebug$default(receiver, "Specific Asset File: " + url, null, 2, null);
                MobileFuseAssetManagerService.this.saveFile(r.f(new URL(url)), fileName);
                FlowKt.emit(receiver, Boolean.TRUE);
            }
        });
        final Schedulers schedulers = Schedulers.IO;
        final Flow flow2 = FlowKt.flow(new Function1<FlowCollector<? super T>, Unit>() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$emitOn$$inlined$transformOnThread$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((FlowCollector) obj);
                return Unit.f93236a;
            }

            public final void invoke(@NotNull final FlowCollector<? super T> flow3) {
                Intrinsics.checkNotNullParameter(flow3, "$this$flow");
                SchedulersKt.runOnScheduler(schedulers, new Function0<Unit>() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$emitOn$$inlined$transformOnThread$2.1
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
                        flow.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$emitOn$.inlined.transformOnThread.2.1.1
                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                flow3.emit(value);
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
        });
        return FlowKt.flow(new Function1<FlowCollector<? super Boolean>, Unit>() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$resolveAssetPath$$inlined$catchElse$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Boolean> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super Boolean> flow3) {
                Intrinsics.checkNotNullParameter(flow3, "$this$flow");
                flow2.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$resolveAssetPath$$inlined$catchElse$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        FlowCollector flowCollector = flow3;
                        if (value instanceof ErrorResult) {
                            flowCollector.emit(new SuccessResult(Boolean.FALSE));
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
