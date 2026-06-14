package com.mobilefuse.sdk.component;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mobilefuse.sdk.exception.BaseError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/mobilefuse/sdk/component/ParsingError;", "", "Lcom/mobilefuse/sdk/exception/BaseError;", "code", "", PglCryptUtils.KEY_MESSAGE, "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "UNEXPECTED_MARKUP_FORMAT", "INVALID_MARKUP", "EMPTY_MARKUP", "MARKUP_TOO_LARGE", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public enum ParsingError implements BaseError {
    UNEXPECTED_MARKUP_FORMAT(1, "The ad markup is in an unexpected format"),
    INVALID_MARKUP(1, "The ad markup was invalid"),
    EMPTY_MARKUP(2, "The ad markup was empty"),
    MARKUP_TOO_LARGE(3, "The ad markup is too large");

    private final int code;

    @NotNull
    private final String message;

    ParsingError(int i10, String str) {
        this.code = i10;
        this.message = str;
    }

    public final int getCode() {
        return this.code;
    }

    @Override // com.mobilefuse.sdk.exception.BaseError
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
