package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbbb extends zzbby {
    private final long zzh;

    public zzbbb(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, long j10, int i10, int i11) {
        super(zzbakVar, "KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh", "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig=", zzawgVar, i10, 25);
        this.zzh = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, null)).longValue();
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            try {
                zzawgVar.zzac(jLongValue);
                long j10 = this.zzh;
                if (j10 != 0) {
                    zzawgVar.zzk(jLongValue - j10);
                    zzawgVar.zzn(j10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
