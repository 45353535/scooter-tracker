package com.mobilefuse.sdk.rx;

import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "R", "Lcom/mobilefuse/sdk/rx/FlowCollector;", "invoke", "com/mobilefuse/sdk/rx/FlowKt$transform$1"}, k = 3, mv = {1, 4, 3})
public final class FlowKt$zip2$$inlined$transform$1<R> extends Lambda implements Function1<FlowCollector<? super Either<? extends BaseError, ? extends R>>, Unit> {
    final /* synthetic */ Function1 $other$inlined;
    final /* synthetic */ Flow $this_transform;
    final /* synthetic */ Function2 $transform$inlined;

    /* JADX INFO: renamed from: com.mobilefuse.sdk.rx.FlowKt$zip2$$inlined$transform$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00020\u0005H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "Lcom/mobilefuse/sdk/exception/Either;", "", "emit", "com/mobilefuse/sdk/rx/FlowKt$transform$1$1"}, k = 3, mv = {1, 4, 3})
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ FlowCollector $this_flow;

        public AnonymousClass1(FlowCollector flowCollector) {
            this.$this_flow = flowCollector;
        }

        @Override // com.mobilefuse.sdk.rx.FlowCollector
        public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!(value instanceof SuccessResult)) {
                if (value instanceof ErrorResult) {
                    this.$this_flow.emit(value);
                    return;
                }
                return;
            }
            final FlowCollector flowCollector = this.$this_flow;
            final Either either = (Either) ((SuccessResult) value).getValue();
            if (either instanceof SuccessResult) {
                final Flow flow = (Flow) FlowKt$zip2$$inlined$transform$1.this.$other$inlined.invoke(((SuccessResult) either).getValue());
                FlowKt.flow(new Function1<FlowCollector<? super Either<? extends BaseError, ? extends R>>, Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt$zip2$$inlined$transform$1$1$lambda$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                        invoke((FlowCollector) obj);
                        return Unit.f93236a;
                    }

                    public final void invoke(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends R>> flow2) {
                        Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                        flow.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt$zip2$$inlined$transform$1$1$lambda$1.1
                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value2) {
                                Intrinsics.checkNotNullParameter(value2, "value");
                                if (!(value2 instanceof SuccessResult)) {
                                    if (value2 instanceof ErrorResult) {
                                        flow2.emit(value2);
                                        return;
                                    }
                                    return;
                                }
                                FlowCollector flowCollector2 = flow2;
                                Either either2 = (Either) ((SuccessResult) value2).getValue();
                                if (either2 instanceof ErrorResult) {
                                    FlowKt.emit(flowCollector2, either2);
                                } else if (either2 instanceof SuccessResult) {
                                    FlowKt$zip2$$inlined$transform$1$1$lambda$1 flowKt$zip2$$inlined$transform$1$1$lambda$1 = FlowKt$zip2$$inlined$transform$1$1$lambda$1.this;
                                    FlowKt.emit(flowCollector2, new SuccessResult(FlowKt$zip2$$inlined$transform$1.this.$transform$inlined.invoke(((SuccessResult) either).getValue(), ((SuccessResult) either2).getValue())));
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
                }).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt$zip2$$inlined$transform$1$1$lambda$2
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends Either<? extends BaseError, ? extends R>> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        flowCollector.emit(it);
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
            } else if (either instanceof ErrorResult) {
                FlowKt.emit(flowCollector, either);
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt$zip2$$inlined$transform$1(Flow flow, Function1 function1, Function2 function2) {
        super(1);
        this.$this_transform = flow;
        this.$other$inlined = function1;
        this.$transform$inlined = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((FlowCollector) obj);
        return Unit.f93236a;
    }

    public final void invoke(@NotNull FlowCollector<? super Either<? extends BaseError, ? extends R>> flow) {
        Intrinsics.checkNotNullParameter(flow, "$this$flow");
        this.$this_transform.collect(new AnonymousClass1(flow));
    }
}
