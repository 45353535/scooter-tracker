package com.mobilefuse.sdk.rx;

import com.mobilefuse.sdk.component.AdmParser;
import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.mobilefuse.sdk.component.ParsingAbility;
import com.mobilefuse.sdk.component.ParsingError;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.internal.repository.ParseAdmFromBidResponseKt;
import com.mobilefuse.sdk.internal.repository.ParsedAdMarkupResponse;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aB\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¨\u0006\n"}, d2 = {"parse", "Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/exception/BaseError;", "Lcom/mobilefuse/sdk/internal/repository/ParsedAdMarkupResponse;", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "parserFactory", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "Lcom/mobilefuse/sdk/component/AdmParser;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class AdParserFlowKt {
    @NotNull
    public static final Flow<Either<BaseError, ParsedAdMarkupResponse>> parse(@NotNull final Flow<? extends Either<? extends BaseError, MfxBidResponse>> parse, @NotNull final Function1<? super AdmMediaType, ? extends AdmParser> parserFactory) {
        Intrinsics.checkNotNullParameter(parse, "$this$parse");
        Intrinsics.checkNotNullParameter(parserFactory, "parserFactory");
        final Flow flowZip2 = FlowKt.zip2(FlowKt.flow(new Function1<FlowCollector<? super Either<? extends BaseError, ? extends Pair<? extends MfxBidResponse, ? extends AdmParser>>>, Unit>() { // from class: com.mobilefuse.sdk.rx.AdParserFlowKt$parse$$inlined$mapEitherSuccessResult$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends BaseError, ? extends Pair<? extends MfxBidResponse, ? extends AdmParser>>> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends Pair<? extends MfxBidResponse, ? extends AdmParser>>> flow) {
                Intrinsics.checkNotNullParameter(flow, "$this$flow");
                parse.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.AdParserFlowKt$parse$$inlined$mapEitherSuccessResult$1.1
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
                                MfxBidResponse mfxBidResponse = (MfxBidResponse) ((SuccessResult) either).getValue();
                                AdmParser admParser = (AdmParser) parserFactory.invoke(mfxBidResponse.getType());
                                flowCollector.emit(new SuccessResult(admParser.getParsingAbility(mfxBidResponse.getAdm()) == ParsingAbility.INCAPABLE ? new ErrorResult(ParsingError.UNEXPECTED_MARKUP_FORMAT) : new SuccessResult(new Pair(mfxBidResponse, admParser))));
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
        }), new Function1<Pair<? extends MfxBidResponse, ? extends AdmParser>, Flow<? extends Either<? extends BaseError, ? extends ParsedAdMarkup>>>() { // from class: com.mobilefuse.sdk.rx.AdParserFlowKt.parse.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Flow<? extends Either<? extends BaseError, ? extends ParsedAdMarkup>> invoke(Pair<? extends MfxBidResponse, ? extends AdmParser> pair) {
                return invoke2((Pair<MfxBidResponse, ? extends AdmParser>) pair);
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Flow<Either<BaseError, ParsedAdMarkup>> invoke2(@NotNull Pair<MfxBidResponse, ? extends AdmParser> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ParseAdmFromBidResponseKt.parseFromBidResponse(it.getSecond(), it.getFirst());
            }
        }, new Function2<Pair<? extends MfxBidResponse, ? extends AdmParser>, ParsedAdMarkup, ParsedAdMarkupResponse>() { // from class: com.mobilefuse.sdk.rx.AdParserFlowKt.parse.3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ ParsedAdMarkupResponse invoke(Pair<? extends MfxBidResponse, ? extends AdmParser> pair, ParsedAdMarkup parsedAdMarkup) {
                return invoke2((Pair<MfxBidResponse, ? extends AdmParser>) pair, parsedAdMarkup);
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ParsedAdMarkupResponse invoke2(@NotNull Pair<MfxBidResponse, ? extends AdmParser> a10, @NotNull ParsedAdMarkup b10) {
                Intrinsics.checkNotNullParameter(a10, "a");
                Intrinsics.checkNotNullParameter(b10, "b");
                return new ParsedAdMarkupResponse(a10.getFirst(), b10);
            }
        });
        return FlowKt.flow(new Function1<FlowCollector<? super Either<? extends BaseError, ? extends ParsedAdMarkupResponse>>, Unit>() { // from class: com.mobilefuse.sdk.rx.AdParserFlowKt$parse$$inlined$catchElse$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends BaseError, ? extends ParsedAdMarkupResponse>> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends ParsedAdMarkupResponse>> flow) {
                Intrinsics.checkNotNullParameter(flow, "$this$flow");
                flowZip2.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.AdParserFlowKt$parse$$inlined$catchElse$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        FlowCollector flowCollector = flow;
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
