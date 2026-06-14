package androidx.concurrent.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ResolvableFuture<V> extends AbstractResolvableFuture<V> {
    private ResolvableFuture() {
    }

    public static <V> ResolvableFuture<V> create() {
        return new ResolvableFuture<>();
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean set(@Nullable V v10) {
        return super.set(v10);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setException(Throwable th2) {
        return super.setException(th2);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        return super.setFuture(listenableFuture);
    }
}
