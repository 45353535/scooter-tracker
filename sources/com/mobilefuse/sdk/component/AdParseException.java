package com.mobilefuse.sdk.component;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/sdk/component/AdParseException;", "", "error", "Lcom/mobilefuse/sdk/component/ParsingError;", "(Lcom/mobilefuse/sdk/component/ParsingError;)V", "getError", "()Lcom/mobilefuse/sdk/component/ParsingError;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class AdParseException extends Throwable {

    @NotNull
    private final ParsingError error;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdParseException(@NotNull ParsingError error) {
        super(error.getMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
    }

    @NotNull
    public final ParsingError getError() {
        return this.error;
    }
}
