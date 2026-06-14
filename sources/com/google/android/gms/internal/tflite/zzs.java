package com.google.android.gms.internal.tflite;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class zzs {
    private static final Object zza = new Object();
    private static volatile zzr zzb = null;
    private static volatile boolean zzc = false;
    private static final AtomicInteger zzd;

    static {
        new AtomicReference();
        zzd = new AtomicInteger();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0049, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zza(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.tflite.zzr r0 = com.google.android.gms.internal.tflite.zzs.zzb
            if (r0 != 0) goto L4a
            if (r3 != 0) goto L7
            goto L4a
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.tflite.zzs.zza
            monitor-enter(r0)
            com.google.android.gms.internal.tflite.zzr r1 = com.google.android.gms.internal.tflite.zzs.zzb     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L46
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.tflite.zzr r1 = com.google.android.gms.internal.tflite.zzs.zzb     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L23
            android.content.Context r2 = r1.zza()     // Catch: java.lang.Throwable -> L21
            if (r2 == r3) goto L40
            goto L23
        L21:
            r3 = move-exception
            goto L42
        L23:
            if (r1 == 0) goto L2b
            com.google.android.gms.internal.tflite.zzp.zza()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.tflite.zzt.zza()     // Catch: java.lang.Throwable -> L21
        L2b:
            com.google.android.gms.internal.tflite.zzq r1 = new com.google.android.gms.internal.tflite.zzq     // Catch: java.lang.Throwable -> L21
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.tflite.zzu r1 = com.google.android.gms.internal.tflite.zzx.zza(r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.tflite.zzo r2 = new com.google.android.gms.internal.tflite.zzo     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.tflite.zzs.zzb = r2     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.tflite.zzs.zzd     // Catch: java.lang.Throwable -> L21
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L21
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L46
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L44
        L44:
            r3 = move-exception
            goto L48
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r3
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.tflite.zzs.zza(android.content.Context):void");
    }
}
