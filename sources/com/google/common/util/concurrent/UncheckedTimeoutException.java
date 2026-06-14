package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public class UncheckedTimeoutException extends RuntimeException {
    public UncheckedTimeoutException() {
    }

    public UncheckedTimeoutException(String str) {
        super(str);
    }

    public UncheckedTimeoutException(Throwable th2) {
        super(th2);
    }

    public UncheckedTimeoutException(String str, Throwable th2) {
        super(str, th2);
    }
}
