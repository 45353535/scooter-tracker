package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public class ExecutionError extends Error {
    public ExecutionError(String str, Error error) {
        super(str, error);
    }

    public ExecutionError(Error error) {
        super(error);
    }
}
