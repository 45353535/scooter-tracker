package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhkc {
    private static final zzhkc zzb = new zzhkc();
    private final Map zza = new HashMap();

    zzhkc() {
    }

    public static zzhkc zza() {
        return zzb;
    }

    public final synchronized void zzb(String str, zzhbp zzhbpVar) throws GeneralSecurityException {
        try {
            Map map = this.zza;
            if (!map.containsKey(str)) {
                map.put(str, zzhbpVar);
                return;
            }
            if (((zzhbp) map.get(str)).equals(zzhbpVar)) {
                return;
            }
            String strValueOf = String.valueOf(map.get(str));
            String strValueOf2 = String.valueOf(zzhbpVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + strValueOf.length() + 17 + strValueOf2.length());
            sb2.append("Parameters object with name ");
            sb2.append(str);
            sb2.append(" already exists (");
            sb2.append(strValueOf);
            sb2.append("), cannot insert ");
            sb2.append(strValueOf2);
            throw new GeneralSecurityException(sb2.toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized zzhbp zzc(String str) throws GeneralSecurityException {
        Map map;
        map = this.zza;
        if (!map.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzhbp) map.get("AES128_GCM");
    }

    public final synchronized void zzd(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zzb((String) entry.getKey(), (zzhbp) entry.getValue());
        }
    }
}
