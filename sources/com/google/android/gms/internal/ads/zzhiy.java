package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes8.dex */
final class zzhiy extends zzhys {
    public static final zzhyl zzb(zzhzq zzhzqVar) throws IOException {
        String strZzh;
        int iZzm = zzhzqVar.zzm();
        zzhyl zzhylVarZze = zze(zzhzqVar, iZzm);
        if (zzhylVarZze == null) {
            return zzd(zzhzqVar, iZzm);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzhzqVar.zzf()) {
                if (zzhylVarZze instanceof zzhyn) {
                    strZzh = zzhzqVar.zzh();
                    if (!zzhja.zza(strZzh)) {
                        throw new IOException("illegal characters in string");
                    }
                } else {
                    strZzh = null;
                }
                int iZzm2 = zzhzqVar.zzm();
                zzhyl zzhylVarZze2 = zze(zzhzqVar, iZzm2);
                zzhyl zzhylVarZzd = zzhylVarZze2 == null ? zzd(zzhzqVar, iZzm2) : zzhylVarZze2;
                if (zzhylVarZze instanceof zzhyk) {
                    ((zzhyk) zzhylVarZze).zza(zzhylVarZzd);
                } else {
                    zzhyn zzhynVar = (zzhyn) zzhylVarZze;
                    if (zzhynVar.zzc(strZzh)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(strZzh)));
                    }
                    zzhynVar.zza(strZzh, zzhylVarZzd);
                }
                if (zzhylVarZze2 != null) {
                    arrayDeque.addLast(zzhylVarZze);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    zzhylVarZze = zzhylVarZzd;
                } else {
                    continue;
                }
            } else {
                if (zzhylVarZze instanceof zzhyk) {
                    zzhzqVar.zzc();
                } else {
                    zzhzqVar.zze();
                }
                if (arrayDeque.isEmpty()) {
                    return zzhylVarZze;
                }
                zzhylVarZze = (zzhyl) arrayDeque.removeLast();
            }
        }
    }

    private static final zzhyl zzd(zzhzq zzhzqVar, int i10) throws IOException {
        int i11 = i10 - 1;
        if (i11 == 5) {
            String strZzi = zzhzqVar.zzi();
            if (zzhja.zza(strZzi)) {
                return new zzhyp(strZzi);
            }
            throw new IOException("illegal characters in string");
        }
        if (i11 == 6) {
            return new zzhyp(new zzhiz(zzhzqVar.zzi()));
        }
        if (i11 == 7) {
            return new zzhyp(Boolean.valueOf(zzhzqVar.zzj()));
        }
        if (i11 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(zzhzr.zza(i10)));
        }
        zzhzqVar.zzk();
        return zzhym.zza;
    }

    private static final zzhyl zze(zzhzq zzhzqVar, int i10) throws IOException {
        int i11 = i10 - 1;
        if (i11 == 0) {
            zzhzqVar.zzb();
            return new zzhyk();
        }
        if (i11 != 2) {
            return null;
        }
        zzhzqVar.zzd();
        return new zzhyn();
    }

    @Override // com.google.android.gms.internal.ads.zzhys
    public final /* bridge */ /* synthetic */ void zza(zzhzs zzhzsVar, Object obj) throws IOException {
        throw null;
    }
}
