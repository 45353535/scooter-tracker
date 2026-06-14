package com.mobilefuse.sdk.service.impl.ifa;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/mobilefuse/sdk/service/impl/ifa/IfaException;", "", "exception", "", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "component1", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class IfaException {

    @NotNull
    private final Throwable exception;

    public IfaException(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.exception = exception;
    }

    public static /* synthetic */ IfaException copy$default(IfaException ifaException, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = ifaException.exception;
        }
        return ifaException.copy(th2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Throwable getException() {
        return this.exception;
    }

    @NotNull
    public final IfaException copy(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new IfaException(exception);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof IfaException) && Intrinsics.areEqual(this.exception, ((IfaException) other).exception);
        }
        return true;
    }

    @NotNull
    public final Throwable getException() {
        return this.exception;
    }

    public int hashCode() {
        Throwable th2 = this.exception;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "IfaException(exception=" + this.exception + ")";
    }
}
