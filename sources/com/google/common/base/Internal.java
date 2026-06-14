package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import j$.time.Duration;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class Internal {
    static long a(Duration duration) {
        try {
            return duration.toNanos();
        } catch (ArithmeticException unused) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }
}
