package com.mobilefuse.sdk.rx;

import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a%\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000b\u0010\u000e\u001aQ\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\b2 \b\u0004\u0010\u0011\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001ae\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0014\u001a\u00020\u00132,\b\u0004\u0010\u0011\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0004\u0012\u00020\u00030\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a]\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\b2,\b\u0004\u0010\u0011\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0004\u0012\u00020\u00030\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0012\u001aE\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\b2\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aU\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0014\b\u0004\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0\u00062\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001ai\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00028\u00010\u00150\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000f*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00028\u00000\u00150\b2 \b\u0004\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00028\u00010\u00150\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\u001b\u001a?\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001b\u001a?\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010\u001b\u001a.\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\b¢\u0006\u0004\b$\u0010%\u001a.\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\b¢\u0006\u0004\b&\u0010%\u001aK\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2 \b\u0004\u0010\u0011\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u0012\u001aK\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2 \b\u0004\u0010\u0011\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0012\u001a9\u0010)\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a_\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0000\u0010+\"\u0004\b\u0001\u0010,\"\u0004\b\u0002\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\u001a\b\u0004\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u0087\u0001\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00028\u00020\u00150\b\"\u0004\b\u0000\u0010+\"\u0004\b\u0001\u0010,\"\u0004\b\u0002\u0010\u000f*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00028\u00000\u00150\b2$\u0010-\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00028\u00010\u00150\b0\u00062\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010¢\u0006\u0004\b0\u00101\u001a\u001d\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u00028\u0000¢\u0006\u0004\b2\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00063"}, d2 = {"T", "Lcom/mobilefuse/sdk/rx/FlowCollector;", "value", "", "emit", "(Lcom/mobilefuse/sdk/rx/FlowCollector;Ljava/lang/Object;)V", "Lkotlin/Function1;", "block", "Lcom/mobilefuse/sdk/rx/Flow;", "flow", "(Lkotlin/jvm/functions/Function1;)Lcom/mobilefuse/sdk/rx/Flow;", "flowSingle", "(Ljava/lang/Object;)Lcom/mobilefuse/sdk/rx/Flow;", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Lcom/mobilefuse/sdk/rx/Flow;", "R", "Lkotlin/Function2;", "transform", "(Lcom/mobilefuse/sdk/rx/Flow;Lkotlin/jvm/functions/Function2;)Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/concurrency/Schedulers;", "scheduler", "Lcom/mobilefuse/sdk/exception/Either;", "", "transformOnThread", "(Lcom/mobilefuse/sdk/rx/Flow;Lcom/mobilefuse/sdk/concurrency/Schedulers;Lkotlin/jvm/functions/Function2;)Lcom/mobilefuse/sdk/rx/Flow;", "transformForConcurrency", "map", "(Lcom/mobilefuse/sdk/rx/Flow;Lkotlin/jvm/functions/Function1;)Lcom/mobilefuse/sdk/rx/Flow;", "", "condition", "mapIf", "(Lcom/mobilefuse/sdk/rx/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/exception/BaseError;", "mapEitherSuccessResult", "filter", "run", "runOn", "(Lcom/mobilefuse/sdk/rx/Flow;Lcom/mobilefuse/sdk/concurrency/Schedulers;)Lcom/mobilefuse/sdk/rx/Flow;", "emitOn", "catch", "catchElse", "collectResult", "(Lcom/mobilefuse/sdk/rx/Flow;Lkotlin/jvm/functions/Function1;)V", "T1", "T2", "other", "zip", "(Lcom/mobilefuse/sdk/rx/Flow;Lcom/mobilefuse/sdk/rx/Flow;Lkotlin/jvm/functions/Function2;)Lcom/mobilefuse/sdk/rx/Flow;", "zip2", "(Lcom/mobilefuse/sdk/rx/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/mobilefuse/sdk/rx/Flow;", "toFlow", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class FlowKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: com.mobilefuse.sdk.rx.FlowKt$transformOnThread$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "R", "Lcom/mobilefuse/sdk/rx/FlowCollector;", "invoke"}, k = 3, mv = {1, 4, 3}, xi = 128)
    public static final class C46931<R> extends Lambda implements Function1<FlowCollector<? super R>, Unit> {
        final /* synthetic */ Schedulers $scheduler;
        final /* synthetic */ Flow $this_transformOnThread;
        final /* synthetic */ Function2 $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46931(Flow flow, Schedulers schedulers, Function2 function2) {
            super(1);
            this.$this_transformOnThread = flow;
            this.$scheduler = schedulers;
            this.$transform = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((FlowCollector) obj);
            return Unit.f93236a;
        }

        public final void invoke(@NotNull final FlowCollector<? super R> flow) {
            Intrinsics.checkNotNullParameter(flow, "$this$flow");
            SchedulersKt.runOnScheduler(this.$scheduler, new Function0<Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt.transformOnThread.1.1
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
                    C46931.this.$this_transformOnThread.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt.transformOnThread.1.1.1
                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            C06301 c06301 = C06301.this;
                            C46931.this.$transform.invoke(flow, value);
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

    @NotNull
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final <T> Flow<T> m7435catch(@NotNull final Flow<? extends T> flow, @NotNull final Function2<? super FlowCollector<? super T>, ? super Throwable, Unit> transform) {
        Intrinsics.checkNotNullParameter(flow, "$this$catch");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new Function1<FlowCollector<? super T>, Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt$catch$$inlined$transformForConcurrency$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((FlowCollector) obj);
                return Unit.f93236a;
            }

            public final void invoke(@NotNull final FlowCollector<? super T> flow2) {
                Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                flow.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt$catch$$inlined$transformForConcurrency$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        FlowCollector flowCollector = flow2;
                        if (value instanceof ErrorResult) {
                            transform.invoke(flowCollector, ((ErrorResult) value).getValue());
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
    public static final <T> Flow<T> catchElse(@NotNull final Flow<? extends T> catchElse, @NotNull final Function2<? super FlowCollector<? super T>, ? super Throwable, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(catchElse, "$this$catchElse");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new Function1<FlowCollector<? super T>, Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt$catchElse$$inlined$transformForConcurrency$1
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
                catchElse.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt$catchElse$$inlined$transformForConcurrency$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        FlowCollector flowCollector = flow;
                        if (value instanceof ErrorResult) {
                            flowCollector.emit(new SuccessResult(transform.invoke(flowCollector, ((ErrorResult) value).getValue())));
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

    public static final <T> void collectResult(@NotNull Flow<? extends T> collectResult, @NotNull final Function1<? super T, Unit> transform) {
        Intrinsics.checkNotNullParameter(collectResult, "$this$collectResult");
        Intrinsics.checkNotNullParameter(transform, "transform");
        collectResult.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt.collectResult.1
            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof SuccessResult) {
                    transform.invoke(((SuccessResult) result).getValue());
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

    public static final <T> void emit(@NotNull FlowCollector<? super T> emit, T t10) {
        Intrinsics.checkNotNullParameter(emit, "$this$emit");
        emit.emit(new SuccessResult(t10));
    }

    @NotNull
    public static final <T> Flow<T> emitOn(@NotNull final Flow<? extends T> emitOn, @NotNull final Schedulers scheduler) {
        Intrinsics.checkNotNullParameter(emitOn, "$this$emitOn");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        return flow(new Function1<FlowCollector<? super T>, Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt$emitOn$$inlined$transformOnThread$1
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
                SchedulersKt.runOnScheduler(scheduler, new Function0<Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt$emitOn$$inlined$transformOnThread$1.1
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
                        emitOn.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt$emitOn$.inlined.transformOnThread.1.1.1
                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                flow.emit(value);
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
    }

    @NotNull
    public static final <T> Flow<T> filter(@NotNull final Flow<? extends T> filter, @NotNull final Function1<? super T, Boolean> transform) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new Function1<FlowCollector<? super T>, Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt$filter$$inlined$transform$1
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
                filter.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt$filter$$inlined$transform$1.1
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
                            if (((Boolean) transform.invoke(value2)).booleanValue()) {
                                flowCollector.emit(new SuccessResult(value2));
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
    }

    @NotNull
    public static final <T> Flow<T> flow(@NotNull Function1<? super FlowCollector<? super T>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new BaseFlow(block);
    }

    @NotNull
    public static final <T> Flow<T> flowSingle(final T t10) {
        return flow(new Function1<FlowCollector<? super T>, Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt.flowSingle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((FlowCollector) obj);
                return Unit.f93236a;
            }

            public final void invoke(@NotNull FlowCollector<? super T> receiver) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                FlowKt.emit(receiver, t10);
            }
        });
    }

    @NotNull
    public static final <T, R> Flow<R> map(@NotNull final Flow<? extends T> map, @NotNull final Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new Function1<FlowCollector<? super R>, Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt$map$$inlined$transform$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((FlowCollector) obj);
                return Unit.f93236a;
            }

            public final void invoke(@NotNull final FlowCollector<? super R> flow) {
                Intrinsics.checkNotNullParameter(flow, "$this$flow");
                map.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt$map$$inlined$transform$1.1
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
                                flowCollector.emit(new SuccessResult(transform.invoke(((SuccessResult) value).getValue())));
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
    public static final <T, R> Flow<Either<BaseError, R>> mapEitherSuccessResult(@NotNull final Flow<? extends Either<? extends BaseError, ? extends T>> mapEitherSuccessResult, @NotNull final Function1<? super T, ? extends Either<? extends BaseError, ? extends R>> transform) {
        Intrinsics.checkNotNullParameter(mapEitherSuccessResult, "$this$mapEitherSuccessResult");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new Function1<FlowCollector<? super Either<? extends BaseError, ? extends R>>, Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt$mapEitherSuccessResult$$inlined$transform$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((FlowCollector) obj);
                return Unit.f93236a;
            }

            public final void invoke(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends R>> flow) {
                Intrinsics.checkNotNullParameter(flow, "$this$flow");
                mapEitherSuccessResult.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt$mapEitherSuccessResult$$inlined$transform$1.1
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
                        Either either = (Either) ((SuccessResult) value).getValue();
                        try {
                            if (either instanceof ErrorResult) {
                                flowCollector.emit(new SuccessResult(either));
                            } else if (either instanceof SuccessResult) {
                                flowCollector.emit(new SuccessResult(transform.invoke(((SuccessResult) either).getValue())));
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
    }

    @NotNull
    public static final <T> Flow<T> mapIf(@NotNull final Flow<? extends T> mapIf, @NotNull final Function1<? super T, Boolean> condition, @NotNull final Function1<? super T, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(mapIf, "$this$mapIf");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new Function1<FlowCollector<? super T>, Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt$mapIf$$inlined$transform$1
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
                mapIf.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt$mapIf$$inlined$transform$1.1
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
                            if (((Boolean) condition.invoke(value2)).booleanValue()) {
                                flowCollector.emit(new SuccessResult(transform.invoke(value2)));
                            } else {
                                flowCollector.emit(new SuccessResult(value2));
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
    }

    @NotNull
    public static final <T> Flow<T> run(@NotNull final Flow<? extends T> run, @NotNull final Function1<? super T, Unit> transform) {
        Intrinsics.checkNotNullParameter(run, "$this$run");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new Function1<FlowCollector<? super T>, Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt.run.1
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
                run.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt.run.1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value instanceof SuccessResult) {
                            transform.invoke(((SuccessResult) value).getValue());
                        }
                        flow.emit(value);
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
    public static final <T> Flow<T> runOn(@NotNull final Flow<? extends T> runOn, @NotNull final Schedulers scheduler) {
        Intrinsics.checkNotNullParameter(runOn, "$this$runOn");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        return flow(new Function1<FlowCollector<? super T>, Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt$runOn$$inlined$transformForConcurrency$1
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
                runOn.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt$runOn$$inlined$transformForConcurrency$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        final FlowCollector flowCollector = flow;
                        SchedulersKt.runOnScheduler(scheduler, new Function0<Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt$runOn$$inlined$transformForConcurrency$1$1$lambda$1
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
    }

    @NotNull
    public static final <T> Flow<T> toFlow(final T t10) {
        return flow(new Function1<FlowCollector<? super T>, Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt.toFlow.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((FlowCollector) obj);
                return Unit.f93236a;
            }

            public final void invoke(@NotNull FlowCollector<? super T> receiver) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                FlowKt.emit(receiver, t10);
            }
        });
    }

    @NotNull
    public static final <T, R> Flow<R> transform(@NotNull final Flow<? extends T> transform, @NotNull final Function2<? super FlowCollector<? super R>, ? super T, Unit> transform2) {
        Intrinsics.checkNotNullParameter(transform, "$this$transform");
        Intrinsics.checkNotNullParameter(transform2, "transform");
        return flow(new Function1<FlowCollector<? super R>, Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt.transform.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((FlowCollector) obj);
                return Unit.f93236a;
            }

            public final void invoke(@NotNull final FlowCollector<? super R> flow) {
                Intrinsics.checkNotNullParameter(flow, "$this$flow");
                transform.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt.transform.1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value instanceof SuccessResult) {
                            transform2.invoke(flow, ((SuccessResult) value).getValue());
                        } else if (value instanceof ErrorResult) {
                            flow.emit(value);
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
    public static final <T, R> Flow<R> transformForConcurrency(@NotNull final Flow<? extends T> transformForConcurrency, @NotNull final Function2<? super FlowCollector<? super R>, ? super Either<? extends Throwable, ? extends T>, Unit> transform) {
        Intrinsics.checkNotNullParameter(transformForConcurrency, "$this$transformForConcurrency");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new Function1<FlowCollector<? super R>, Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt.transformForConcurrency.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((FlowCollector) obj);
                return Unit.f93236a;
            }

            public final void invoke(@NotNull final FlowCollector<? super R> flow) {
                Intrinsics.checkNotNullParameter(flow, "$this$flow");
                transformForConcurrency.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt.transformForConcurrency.1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        transform.invoke(flow, value);
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
    public static final <T, R> Flow<R> transformOnThread(@NotNull Flow<? extends T> transformOnThread, @NotNull Schedulers scheduler, @NotNull Function2<? super FlowCollector<? super R>, ? super Either<? extends Throwable, ? extends T>, Unit> transform) {
        Intrinsics.checkNotNullParameter(transformOnThread, "$this$transformOnThread");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new C46931(transformOnThread, scheduler, transform));
    }

    @NotNull
    public static final <T1, T2, R> Flow<R> zip(@NotNull Flow<? extends T1> zip, @NotNull Flow<? extends T2> other, @NotNull Function2<? super T1, ? super T2, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new FlowKt$zip$$inlined$transform$1(zip, other, transform));
    }

    @NotNull
    public static final <T1, T2, R> Flow<Either<BaseError, R>> zip2(@NotNull Flow<? extends Either<? extends BaseError, ? extends T1>> zip2, @NotNull Function1<? super T1, ? extends Flow<? extends Either<? extends BaseError, ? extends T2>>> other, @NotNull Function2<? super T1, ? super T2, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zip2, "$this$zip2");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new FlowKt$zip2$$inlined$transform$1(zip2, other, transform));
    }

    @NotNull
    public static final <T> Flow<T> flowSingle(@NotNull final Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return flow(new Function1<FlowCollector<? super T>, Unit>() { // from class: com.mobilefuse.sdk.rx.FlowKt.flowSingle.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((FlowCollector) obj);
                return Unit.f93236a;
            }

            public final void invoke(@NotNull FlowCollector<? super T> receiver) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                FlowKt.emit(receiver, block.invoke());
            }
        });
    }
}
