package com.mobilefuse.sdk.component;

import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.rx.Flow;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/sdk/component/AdmParser;", "", "getParsingAbility", "Lcom/mobilefuse/sdk/component/ParsingAbility;", "adm", "", "parse", "Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/component/ParsingError;", "Lcom/mobilefuse/sdk/component/ParsedAdMarkup;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public interface AdmParser {
    @NotNull
    ParsingAbility getParsingAbility(@NotNull String adm);

    @NotNull
    Flow<Either<ParsingError, ParsedAdMarkup>> parse(@NotNull String adm);
}
