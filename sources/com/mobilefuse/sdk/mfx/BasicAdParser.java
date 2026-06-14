package com.mobilefuse.sdk.mfx;

import com.mobilefuse.sdk.component.AdmParser;
import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.mobilefuse.sdk.component.ParsingAbility;
import com.mobilefuse.sdk.component.ParsingError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\"\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/mobilefuse/sdk/mfx/BasicAdParser;", "Lcom/mobilefuse/sdk/component/AdmParser;", "()V", "getParsingAbility", "Lcom/mobilefuse/sdk/component/ParsingAbility;", "adm", "", "parse", "Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/component/ParsingError;", "Lcom/mobilefuse/sdk/component/ParsedAdMarkup;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class BasicAdParser implements AdmParser {
    @Override // com.mobilefuse.sdk.component.AdmParser
    @NotNull
    public ParsingAbility getParsingAbility(@NotNull String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        return ParsingAbility.MUST_PARSE;
    }

    @Override // com.mobilefuse.sdk.component.AdmParser
    @NotNull
    public Flow<Either<ParsingError, ParsedAdMarkup>> parse(@NotNull final String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        return FlowKt.flow(new Function1<FlowCollector<? super Either<? extends ParsingError, ? extends ParsedAdMarkup>>, Unit>() { // from class: com.mobilefuse.sdk.mfx.BasicAdParser.parse.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends ParsingError, ? extends ParsedAdMarkup>> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull FlowCollector<? super Either<? extends ParsingError, ? extends ParsedAdMarkup>> receiver) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                receiver.emitSuccess(new SuccessResult(new BasicAdMarkup(adm)));
            }
        });
    }
}
