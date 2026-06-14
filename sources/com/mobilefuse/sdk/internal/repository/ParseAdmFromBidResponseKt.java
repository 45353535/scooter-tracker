package com.mobilefuse.sdk.internal.repository;

import com.mobilefuse.sdk.component.AdmParser;
import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.mobilefuse.sdk.component.ParsingError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.rx.Flow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"parseFromBidResponse", "Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/component/ParsingError;", "Lcom/mobilefuse/sdk/component/ParsedAdMarkup;", "Lcom/mobilefuse/sdk/component/AdmParser;", "bidResponse", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class ParseAdmFromBidResponseKt {
    @NotNull
    public static final Flow<Either<ParsingError, ParsedAdMarkup>> parseFromBidResponse(@NotNull AdmParser parseFromBidResponse, @NotNull MfxBidResponse bidResponse) {
        Intrinsics.checkNotNullParameter(parseFromBidResponse, "$this$parseFromBidResponse");
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        return parseFromBidResponse.parse(bidResponse.getAdm());
    }
}
