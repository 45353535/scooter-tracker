package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhxe {
    public static final zzhxe zza = new zzhxe(new zzhxf());
    public static final zzhxe zzb = new zzhxe(new zzhxj());
    public static final zzhxe zzc = new zzhxe(new zzhxl());
    public static final zzhxe zzd = new zzhxe(new zzhxk());
    public static final zzhxe zze;
    public static final zzhxe zzf;
    private final zzhxd zzg;

    static {
        new zzhxe(new zzhxg());
        zze = new zzhxe(new zzhxi());
        zzf = new zzhxe(new zzhxh());
    }

    public zzhxe(zzhxm zzhxmVar) {
        this.zzg = !zzhie.zza() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new zzhxa(zzhxmVar, null) : new zzhxb(zzhxmVar, null) : new zzhxc(zzhxmVar, null);
    }

    public static List zza(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zzb(String str) throws GeneralSecurityException {
        return this.zzg.zza(str);
    }
}
