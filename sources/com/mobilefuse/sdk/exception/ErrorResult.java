package com.mobilefuse.sdk.exception;

import androidx.exifinterface.media.ExifInterface;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/mobilefuse/sdk/exception/ErrorResult;", ExifInterface.LONGITUDE_EAST, "Lcom/mobilefuse/sdk/exception/Either;", "", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", MenuActionType.COPY, "(Ljava/lang/Object;)Lcom/mobilefuse/sdk/exception/ErrorResult;", "equals", "", "other", "", "hashCode", "", "toString", "", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class ErrorResult<E> extends Either {
    private final E value;

    public ErrorResult(E e10) {
        super(null);
        this.value = e10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorResult copy$default(ErrorResult errorResult, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = errorResult.value;
        }
        return errorResult.copy(obj);
    }

    public final E component1() {
        return this.value;
    }

    @NotNull
    public final ErrorResult<E> copy(E value) {
        return new ErrorResult<>(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof ErrorResult) && Intrinsics.areEqual(this.value, ((ErrorResult) other).value);
        }
        return true;
    }

    public final E getValue() {
        return this.value;
    }

    public int hashCode() {
        E e10 = this.value;
        if (e10 != null) {
            return e10.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "ErrorResult(value=" + this.value + ")";
    }
}
