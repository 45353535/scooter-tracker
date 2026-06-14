package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class CollectPreconditions {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    static int b(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    static long c(long j10, String str) {
        if (j10 >= 0) {
            return j10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + j10);
    }

    static void d(int i10, String str) {
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " must be positive but was: " + i10);
    }

    static void e(boolean z10) {
        Preconditions.checkState(z10, "no calls to next() since the last call to remove()");
    }
}
