package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbbi extends zzbby {
    private final zzbac zzh;

    public zzbbi(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i10, int i11, zzbac zzbacVar) {
        super(zzbakVar, "mt+WJZ1rsk0A64GmF9v+ldp/SXHcK6tYIctDM1+NeYG+QzoGvdHV21P9oFWIcCVk", "JGpzBcqG4jzyQyzoEbT5NvLNZXRWAW3o2QUKET83n6Q=", zzawgVar, i10, 94);
        this.zzh = zzbacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int iIntValue = ((Integer) this.zze.invoke(null, this.zzh.zzb())).intValue();
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzaj(zzawu.zza(iIntValue));
        }
    }
}
