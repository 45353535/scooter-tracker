package com.mobilefuse.sdk.exception;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/mobilefuse/sdk/exception/ProcessingError;", "Lcom/mobilefuse/sdk/exception/BaseError;", PglCryptUtils.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class ProcessingError implements BaseError {

    @Nullable
    private final String message;

    public ProcessingError(@Nullable String str) {
        this.message = str;
    }

    public static /* synthetic */ ProcessingError copy$default(ProcessingError processingError, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = processingError.getMessage();
        }
        return processingError.copy(str);
    }

    @Nullable
    public final String component1() {
        return getMessage();
    }

    @NotNull
    public final ProcessingError copy(@Nullable String message) {
        return new ProcessingError(message);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof ProcessingError) && Intrinsics.areEqual(getMessage(), ((ProcessingError) other).getMessage());
        }
        return true;
    }

    @Override // com.mobilefuse.sdk.exception.BaseError
    @Nullable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String message = getMessage();
        if (message != null) {
            return message.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "ProcessingError(message=" + getMessage() + ")";
    }
}
