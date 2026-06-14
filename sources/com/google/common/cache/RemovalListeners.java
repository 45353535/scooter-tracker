package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class RemovalListeners {
    public static <K, V> RemovalListener<K, V> asynchronous(final RemovalListener<K, V> removalListener, final Executor executor) {
        Preconditions.checkNotNull(removalListener);
        Preconditions.checkNotNull(executor);
        return new RemovalListener() { // from class: com.google.common.cache.d
            @Override // com.google.common.cache.RemovalListener
            public final void onRemoval(RemovalNotification removalNotification) {
                executor.execute(new Runnable() { // from class: com.google.common.cache.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        removalListener.onRemoval(removalNotification);
                    }
                });
            }
        };
    }
}
