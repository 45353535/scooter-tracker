package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface Predicate<T> {
    boolean apply(@ParametricNullness T t10);

    boolean equals(Object obj);
}
