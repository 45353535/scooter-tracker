package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
final class Platform {
    static boolean a(Throwable th2, Class cls) {
        return cls.isInstance(th2);
    }

    static void b(Throwable th2) {
        Preconditions.checkNotNull(th2);
        if (th2 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
