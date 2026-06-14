package com.google.common.util.concurrent;

import com.google.common.annotations.J2ktIncompatible;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
final class OverflowAvoidingLockSupport {
    static void a(Object obj, long j10) {
        LockSupport.parkNanos(obj, Math.min(j10, 2147483647999999999L));
    }
}
