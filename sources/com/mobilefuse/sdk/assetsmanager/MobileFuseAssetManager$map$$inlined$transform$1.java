package com.mobilefuse.sdk.assetsmanager;

import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "R", "Lcom/mobilefuse/sdk/rx/FlowCollector;", "invoke", "com/mobilefuse/sdk/rx/FlowKt$transform$1"}, k = 3, mv = {1, 4, 3}, xi = 128)
public final class MobileFuseAssetManager$map$$inlined$transform$1<R> extends Lambda implements Function1<FlowCollector<? super R>, Unit> {
    final /* synthetic */ Flow $this_transform;
    final /* synthetic */ Function1 $transform$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseAssetManager$map$$inlined$transform$1(Flow flow, Function1 function1) {
        super(1);
        this.$this_transform = flow;
        this.$transform$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((FlowCollector) obj);
        return Unit.f93236a;
    }

    public final void invoke(@NotNull final FlowCollector<? super R> flow) {
        Intrinsics.checkNotNullParameter(flow, "$this$flow");
        this.$this_transform.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$map$$inlined$transform$1.1
            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (!(value instanceof SuccessResult)) {
                    if (value instanceof ErrorResult) {
                        flow.emit(value);
                    }
                } else {
                    FlowCollector flowCollector = flow;
                    try {
                        flowCollector.emit(new SuccessResult(MobileFuseAssetManager$map$$inlined$transform$1.this.$transform$inlined.invoke(((SuccessResult) value).getValue())));
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
}
