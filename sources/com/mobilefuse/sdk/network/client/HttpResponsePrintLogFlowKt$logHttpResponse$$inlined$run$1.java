package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "Lcom/mobilefuse/sdk/rx/FlowCollector;", "invoke", "com/mobilefuse/sdk/rx/FlowKt$run$1"}, k = 3, mv = {1, 4, 3})
public final class HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1 extends Lambda implements Function1<FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>>, Unit> {
    final /* synthetic */ Map $extras$inlined;
    final /* synthetic */ String $prefix$inlined;
    final /* synthetic */ Flow $this_logHttpResponse$inlined;
    final /* synthetic */ Flow $this_run;

    /* JADX INFO: renamed from: com.mobilefuse.sdk.network.client.HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "value", "Lcom/mobilefuse/sdk/exception/Either;", "", "emit", "com/mobilefuse/sdk/rx/FlowKt$run$1$1"}, k = 3, mv = {1, 4, 3})
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ FlowCollector $this_flow;

        public AnonymousClass1(FlowCollector flowCollector) {
            this.$this_flow = flowCollector;
        }

        @Override // com.mobilefuse.sdk.rx.FlowCollector
        public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (value instanceof SuccessResult) {
                final Either either = (Either) ((SuccessResult) value).getValue();
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    final StringBuilder sb2 = new StringBuilder();
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.mobilefuse.sdk.network.client.HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1$1$lambda$1
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
                            for (Map.Entry entry : HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1.this.$extras$inlined.entrySet()) {
                                StringBuilder sb3 = sb2;
                                sb3.append(((String) entry.getKey()) + ": " + ((String) entry.getValue()));
                                Intrinsics.checkNotNullExpressionValue(sb3, "append(value)");
                                sb3.append('\n');
                                Intrinsics.checkNotNullExpressionValue(sb3, "append('\\n')");
                            }
                        }
                    };
                    sb2.append("***** " + HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1.this.$prefix$inlined + " *****");
                    Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                    sb2.append('\n');
                    Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                    if (either instanceof SuccessResult) {
                        sb2.append("Status: SUCCESS");
                        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                        sb2.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                        function0.invoke();
                        sb2.append("Status Code: " + ((HttpResponse) ((SuccessResult) either).getValue()).getStatusCode());
                        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                        sb2.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                        sb2.append("Request Time: " + ((((HttpResponse) ((SuccessResult) either).getValue()).getResponseTimestamp() - ((HttpResponse) ((SuccessResult) either).getValue()).getRequestTimestamp()) / 1000) + " seconds");
                        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                        sb2.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                        sb2.append("Body: " + ((HttpResponse) ((SuccessResult) either).getValue()).getBody());
                        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                        sb2.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                    } else if (either instanceof ErrorResult) {
                        sb2.append("Status: FAILED");
                        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                        sb2.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                        function0.invoke();
                        HttpError httpError = (HttpError) ((ErrorResult) either).getValue();
                        if (httpError instanceof HttpError.ConnectionError) {
                            sb2.append("Status Code: " + ((HttpError.ConnectionError) httpError).getStatusCode());
                            Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                            sb2.append('\n');
                            Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                            String formattedMessage = HttpResponsePrintLogFlowKt.getFormattedMessage((HttpError.ConnectionError) httpError);
                            if (formattedMessage != null) {
                                sb2.append(formattedMessage);
                                Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                                sb2.append('\n');
                                Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                            }
                        } else {
                            String message = httpError.getMessage();
                            if (message != null) {
                                sb2.append("Reason: " + message);
                                Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                                sb2.append('\n');
                                Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                                StringsKt.x1(sb2);
                            }
                        }
                    }
                    sb2.append("**********");
                    Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                    sb2.append('\n');
                    Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                    Flow flow = HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1.this.$this_logHttpResponse$inlined;
                    String string = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
                    DebuggingKt.logDebug$default(flow, string, null, 2, null);
                } catch (Throwable th2) {
                    int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
            }
            this.$this_flow.emit(value);
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1(Flow flow, Flow flow2, Map map, String str) {
        super(1);
        this.$this_run = flow;
        this.$this_logHttpResponse$inlined = flow2;
        this.$extras$inlined = map;
        this.$prefix$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>> flowCollector) {
        invoke2(flowCollector);
        return Unit.f93236a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>> receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        this.$this_run.collect(new AnonymousClass1(receiver));
    }
}
