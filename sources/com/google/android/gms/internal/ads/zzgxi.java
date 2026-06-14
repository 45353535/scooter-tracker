package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgxi implements Closeable, AutoCloseable {
    private static final zzgxh zzc = zzgxh.zza;
    private final Deque zza = new ArrayDeque(4);
    private Throwable zzb;

    zzgxi(zzgxh zzgxhVar) {
    }

    public static zzgxi zza() {
        return new zzgxi(zzc);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th2 = this.zzb;
        while (true) {
            Deque deque = this.zza;
            if (deque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else if (th2 != th3) {
                    try {
                        th2.addSuppressed(th3);
                    } catch (Throwable unused) {
                        zzgxg.zza.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th3);
                    }
                }
            }
        }
        if (this.zzb != null || th2 == null) {
            return;
        }
        zzgrz.zza(th2, IOException.class);
        zzgrz.zzb(th2);
        throw new AssertionError(th2);
    }

    public final Closeable zzb(Closeable closeable) {
        this.zza.addFirst(closeable);
        return closeable;
    }

    public final RuntimeException zzc(Throwable th2) throws Throwable {
        this.zzb = th2;
        zzgrz.zza(th2, IOException.class);
        zzgrz.zzb(th2);
        throw new RuntimeException(th2);
    }
}
