package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhjc {
    private static final Logger zza = Logger.getLogger(zzhjc.class.getName());
    private static final zzhjc zzd = new zzhjc();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public static zzhjc zza() {
        return zzd;
    }

    private final synchronized zzhba zzg(String str) throws GeneralSecurityException {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzb;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 98);
            sb2.append("No key manager found for key type ");
            sb2.append(str);
            sb2.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb2.toString());
        }
        return (zzhba) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzhba zzhbaVar, boolean z10, boolean z11) throws GeneralSecurityException {
        try {
            String strZzb = zzhbaVar.zzb();
            if (z11) {
                ConcurrentMap concurrentMap = this.zzc;
                if (concurrentMap.containsKey(strZzb) && !((Boolean) concurrentMap.get(strZzb)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strZzb));
                }
            }
            ConcurrentMap concurrentMap2 = this.zzb;
            zzhba zzhbaVar2 = (zzhba) concurrentMap2.get(strZzb);
            if (zzhbaVar2 != null && !zzhbaVar2.getClass().equals(zzhbaVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strZzb));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzb, zzhbaVar2.getClass().getName(), zzhbaVar.getClass().getName()));
            }
            concurrentMap2.putIfAbsent(strZzb, zzhbaVar);
            this.zzc.put(strZzb, Boolean.valueOf(z11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzb(zzhba zzhbaVar, boolean z10) throws GeneralSecurityException {
        zzf(zzhbaVar, 1, z10);
    }

    public final zzhba zzc(String str, Class cls) throws GeneralSecurityException {
        zzhba zzhbaVarZzg = zzg(str);
        if (zzhbaVarZzg.zzc().equals(cls)) {
            return zzhbaVarZzg;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzhbaVarZzg.getClass());
        String string = zzhbaVarZzg.zzc().toString();
        StringBuilder sb2 = new StringBuilder(name.length() + 53 + strValueOf.length() + 23 + string.length());
        sb2.append("Primitive type ");
        sb2.append(name);
        sb2.append(" not supported by key manager of type ");
        sb2.append(strValueOf);
        sb2.append(", which only supports: ");
        sb2.append(string);
        throw new GeneralSecurityException(sb2.toString());
    }

    public final zzhba zzd(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzhba zzhbaVar, int i10, boolean z10) throws GeneralSecurityException {
        if (!zzhid.zza(i10)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzhbaVar, false, z10);
    }
}
