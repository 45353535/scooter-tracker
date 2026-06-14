package com.mobilefuse.sdk.rx;

import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\bæ\u0080\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/mobilefuse/sdk/rx/FlowCollector;", "T", "", "emit", "", "value", "Lcom/mobilefuse/sdk/exception/Either;", "", "emitError", "error", "emitSuccess", "(Ljava/lang/Object;)V", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public interface FlowCollector<T> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public static final class DefaultImpls {
        public static <T> void emitError(@NotNull FlowCollector<? super T> flowCollector, @NotNull Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            flowCollector.emit(new ErrorResult(error));
        }

        public static <T> void emitSuccess(@NotNull FlowCollector<? super T> flowCollector, T t10) {
            flowCollector.emit(new SuccessResult(t10));
        }
    }

    void emit(@NotNull Either<? extends Throwable, ? extends T> value);

    void emitError(@NotNull Throwable error);

    void emitSuccess(T value);
}
