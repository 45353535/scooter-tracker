package com.google.common.cache;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
abstract class Striped64 extends Number {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final ThreadLocal f29185e = new ThreadLocal();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Random f29186f = new Random();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f29187g = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Unsafe f29188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f29189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f29190j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile transient Cell[] f29191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile transient long f29192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile transient int f29193d;

    static final class Cell {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Unsafe f29194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f29195c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile long f29196a;

        static {
            try {
                Unsafe unsafeJ = Striped64.j();
                f29194b = unsafeJ;
                f29195c = unsafeJ.objectFieldOffset(Cell.class.getDeclaredField("a"));
            } catch (Exception e10) {
                throw new Error(e10);
            }
        }

        Cell(long j10) {
            this.f29196a = j10;
        }

        final boolean a(long j10, long j11) {
            return f29194b.compareAndSwapLong(this, f29195c, j10, j11);
        }
    }

    static {
        try {
            Unsafe unsafeJ = j();
            f29188h = unsafeJ;
            f29189i = unsafeJ.objectFieldOffset(Striped64.class.getDeclaredField(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM));
            f29190j = unsafeJ.objectFieldOffset(Striped64.class.getDeclaredField("d"));
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    Striped64() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Unsafe j() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.cache.Striped64.1
                    @Override // java.security.PrivilegedExceptionAction
                    public Unsafe run() throws Exception {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
        } catch (PrivilegedActionException e10) {
            throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
        }
    }

    final boolean g(long j10, long j11) {
        return f29188h.compareAndSwapLong(this, f29189i, j10, j11);
    }

    final boolean h() {
        return f29188h.compareAndSwapInt(this, f29190j, 0, 1);
    }

    abstract long i(long j10, long j11);

    final void k(long j10) {
        Cell[] cellArr = this.f29191b;
        this.f29192c = j10;
        if (cellArr != null) {
            for (Cell cell : cellArr) {
                if (cell != null) {
                    cell.f29196a = j10;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void l(long r17, int[] r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.Striped64.l(long, int[], boolean):void");
    }
}
