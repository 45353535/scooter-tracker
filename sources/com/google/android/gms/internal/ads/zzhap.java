package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhap {
    public static Object zza(Future future) throws ExecutionException {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
