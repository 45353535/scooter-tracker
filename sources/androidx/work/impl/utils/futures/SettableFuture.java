package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class SettableFuture<V> extends AbstractFuture<V> {
    private SettableFuture() {
    }

    public static <V> SettableFuture<V> create() {
        return new SettableFuture<>();
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean set(V v10) {
        return super.set(v10);
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean setException(Throwable th2) {
        return super.setException(th2);
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        return super.setFuture(listenableFuture);
    }
}
