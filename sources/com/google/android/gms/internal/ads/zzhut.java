package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhut {
    static {
        int i10 = zzhra.zza;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzhtq.zzc();
        zzhtu.zzc();
        zzhso.zza(true);
        zzhug.zza(true);
        zzhus.zza(true);
        if (zzhie.zza()) {
            return;
        }
        zzhsw.zza(true);
    }
}
