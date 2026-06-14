package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public class UncheckedExecutionException extends RuntimeException {
    public UncheckedExecutionException(String str, Throwable th2) {
        super(str, th2);
    }

    public UncheckedExecutionException(Throwable th2) {
        super(th2);
    }
}
