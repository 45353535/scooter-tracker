package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public interface FutureCallback<V> {
    void onFailure(Throwable th2);

    void onSuccess(@ParametricNullness V v10);
}
