package androidx.browser.trusted;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
class FutureUtils {
    private FutureUtils() {
    }

    @NonNull
    static <T> ListenableFuture<T> immediateFailedFuture(@NonNull Throwable th2) {
        ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        resolvableFutureCreate.setException(th2);
        return resolvableFutureCreate;
    }
}
