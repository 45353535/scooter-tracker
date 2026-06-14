package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public interface AsyncFunction<I, O> {
    ListenableFuture<O> apply(@ParametricNullness I i10) throws Exception;
}
