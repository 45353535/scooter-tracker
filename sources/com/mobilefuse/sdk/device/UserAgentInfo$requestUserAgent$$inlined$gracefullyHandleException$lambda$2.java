package com.mobilefuse.sdk.device;

import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.device.UserAgentInfo;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "Lcom/mobilefuse/sdk/rx/FlowCollector;", "invoke", "com/mobilefuse/sdk/rx/FlowKt$transform$1", "com/mobilefuse/sdk/device/UserAgentInfo$mapIf$$inlined$transform$1", "com/mobilefuse/sdk/device/UserAgentInfo$$special$$inlined$mapIf$1"}, k = 3, mv = {1, 4, 3})
public final class UserAgentInfo$requestUserAgent$$inlined$gracefullyHandleException$lambda$2 extends Lambda implements Function1<FlowCollector<? super Pair<? extends String, ? extends UserAgentInfo.Source>>, Unit> {
    final /* synthetic */ Function1 $completeAction$inlined;
    final /* synthetic */ Flow $this_transform;
    final /* synthetic */ UserAgentInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgentInfo$requestUserAgent$$inlined$gracefullyHandleException$lambda$2(Flow flow, UserAgentInfo userAgentInfo, Function1 function1) {
        super(1);
        this.$this_transform = flow;
        this.this$0 = userAgentInfo;
        this.$completeAction$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Pair<? extends String, ? extends UserAgentInfo.Source>> flowCollector) {
        invoke2(flowCollector);
        return Unit.f93236a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final FlowCollector<? super Pair<? extends String, ? extends UserAgentInfo.Source>> flow) {
        Intrinsics.checkNotNullParameter(flow, "$this$flow");
        this.$this_transform.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.device.UserAgentInfo$requestUserAgent$$inlined$gracefullyHandleException$lambda$2.1
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
                FlowCollector flowCollector = flow;
                Object value2 = ((SuccessResult) value).getValue();
                try {
                    if (((Pair) value2).getFirst() != null) {
                        flowCollector.emit(new SuccessResult(value2));
                        return;
                    }
                    DebuggingKt.logDebug$default(UserAgentInfo$requestUserAgent$$inlined$gracefullyHandleException$lambda$2.this.this$0, "(+) Request user agent from browser", null, 2, null);
                    final Pair pair = TuplesKt.to(UserAgentInfo$requestUserAgent$$inlined$gracefullyHandleException$lambda$2.this.this$0.getUserAgentFromBrowser$mobilefuse_sdk_common_release(), UserAgentInfo.Source.BROWSER);
                    DebuggingKt.logDebug$default(UserAgentInfo$requestUserAgent$$inlined$gracefullyHandleException$lambda$2.this.this$0, "(+) User agent loaded from browser: " + ((String) pair.getFirst()), null, 2, null);
                    if (((CharSequence) pair.getFirst()).length() > 0) {
                        SchedulersKt.safelyRunOnScheduler$default(Schedulers.IO, new Function0<Unit>() { // from class: com.mobilefuse.sdk.device.UserAgentInfo$requestUserAgent$.inlined.gracefullyHandleException.lambda.2.1.1
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
                                UserAgentInfo$requestUserAgent$$inlined$gracefullyHandleException$lambda$2.this.this$0.storeUserAgentInPrefs$mobilefuse_sdk_common_release((String) pair.getFirst());
                            }
                        }, null, 4, null);
                    }
                    flowCollector.emit(new SuccessResult(pair));
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
}
