package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhml {
    static {
        int i10 = zzhra.zza;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzhmr.zzc();
        zzhlz.zzc();
        zzhmg.zza(true);
        if (zzhie.zza()) {
            return;
        }
        zzhlt.zza(true);
    }
}
