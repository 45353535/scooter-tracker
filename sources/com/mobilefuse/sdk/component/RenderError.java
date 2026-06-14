package com.mobilefuse.sdk.component;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/mobilefuse/sdk/component/RenderError;", "", "code", "", PglCryptUtils.KEY_MESSAGE, "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "UNEXPECTED_PARSED_MARKUP_FORMAT", "VALID_RENDERER_UNAVAILABLE", "INVALID_STATE", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public enum RenderError {
    UNEXPECTED_PARSED_MARKUP_FORMAT(1, "The parsed ad markup is in an unexpected format"),
    VALID_RENDERER_UNAVAILABLE(2, "A valid renderer could not be created"),
    INVALID_STATE(3, "The ad loader is in an invalid state");

    private final int code;

    @NotNull
    private final String message;

    RenderError(int i10, String str) {
        this.code = i10;
        this.message = str;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }
}
