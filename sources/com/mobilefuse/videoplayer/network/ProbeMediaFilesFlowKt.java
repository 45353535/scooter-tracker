package com.mobilefuse.videoplayer.network;

import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.network.client.HttpClient;
import com.mobilefuse.sdk.network.client.HttpClientKt;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.videoplayer.model.VastMediaFile;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"probeMediaFiles", "Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/exception/BaseError;", "Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "", "httpClient", "Lcom/mobilefuse/sdk/network/client/HttpClient;", "mobilefuse-video-player_release"}, k = 2, mv = {1, 4, 3})
public final class ProbeMediaFilesFlowKt {
    @NotNull
    public static final Flow<Either<BaseError, VastMediaFile>> probeMediaFiles(@NotNull final Flow<? extends List<VastMediaFile>> probeMediaFiles, @NotNull final HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(probeMediaFiles, "$this$probeMediaFiles");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        final Schedulers schedulers = Schedulers.IO;
        final Flow flow = FlowKt.flow(new Function1<FlowCollector<? super List<? extends VastMediaFile>>, Unit>() { // from class: com.mobilefuse.videoplayer.network.ProbeMediaFilesFlowKt$probeMediaFiles$$inlined$runOn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super List<? extends VastMediaFile>> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super List<? extends VastMediaFile>> flow2) {
                Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                probeMediaFiles.collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.network.ProbeMediaFilesFlowKt$probeMediaFiles$$inlined$runOn$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        final FlowCollector flowCollector = flow2;
                        SchedulersKt.runOnScheduler(schedulers, new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.network.ProbeMediaFilesFlowKt$probeMediaFiles$.inlined.runOn.1.1.1
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
        });
        return FlowKt.flow(new Function1<FlowCollector<? super Either<? extends BaseError, ? extends VastMediaFile>>, Unit>() { // from class: com.mobilefuse.videoplayer.network.ProbeMediaFilesFlowKt$probeMediaFiles$$inlined$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends BaseError, ? extends VastMediaFile>> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends VastMediaFile>> flow2) {
                Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                flow.collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.network.ProbeMediaFilesFlowKt$probeMediaFiles$$inlined$map$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Object errorResult;
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
                            Iterator<T> it = ((List) ((SuccessResult) value).getValue()).iterator();
                            Object processingError = null;
                            while (true) {
                                if (it.hasNext()) {
                                    VastMediaFile vastMediaFile = (VastMediaFile) it.next();
                                    String url = vastMediaFile.getUrl();
                                    Either eitherHeadSync$default = url != null ? HttpClient.DefaultImpls.headSync$default(httpClient, url, 0L, 2, null) : null;
                                    if (eitherHeadSync$default instanceof SuccessResult) {
                                        errorResult = new SuccessResult(vastMediaFile);
                                        break;
                                    } else if (eitherHeadSync$default instanceof ErrorResult) {
                                        processingError = (BaseError) ((ErrorResult) eitherHeadSync$default).getValue();
                                    }
                                } else {
                                    if (processingError == null) {
                                        processingError = new ProcessingError("No media files to probe");
                                    }
                                    errorResult = new ErrorResult(processingError);
                                }
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
    }

    public static /* synthetic */ Flow probeMediaFiles$default(Flow flow, HttpClient httpClient, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            httpClient = HttpClientKt.getDefaultHttpClient();
        }
        return probeMediaFiles(flow, httpClient);
    }
}
