package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
public final class zzggq extends zzghb {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    zzggq(zzawg zzawgVar, zzgfx zzgfxVar, zzgoe zzgoeVar) {
        super("3oTRZjKQOSoYyvNcYQSsDbCCM8OIxNI6HsD2yraLy7cjC5n8lPLLp8aPMOPQzMR5", "MHRGFnzrWite6OUEzeDGE6xEKTeZ1rlshMbJC9yXOH8=", zzawgVar, zzgfxVar, zzgoeVar.zza(117));
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        Long l10 = (Long) method.invoke("", null);
                        if (l10 == null) {
                            throw null;
                        }
                        zza = l10;
                    }
                } finally {
                }
            }
        }
        synchronized (zzawgVar) {
            try {
                if (zza != null) {
                    zzawgVar.zzm(zza.longValue());
                }
            } finally {
            }
        }
    }
}
