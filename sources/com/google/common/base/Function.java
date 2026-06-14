package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface Function<F, T> {
    @ParametricNullness
    T apply(@ParametricNullness F f10);

    boolean equals(Object obj);
}
