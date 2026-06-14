package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzief {
    private static volatile int zza = 100;

    zzief() {
    }

    abstract void zza(Object obj, int i10, long j10);

    abstract void zzb(Object obj, int i10, int i11);

    abstract void zzc(Object obj, int i10, long j10);

    abstract void zzd(Object obj, int i10, zzian zzianVar);

    abstract void zze(Object obj, int i10, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract Object zzh(Object obj);

    abstract void zzi(Object obj, Object obj2);

    abstract void zzj(Object obj);

    final boolean zzk(Object obj, zzidp zzidpVar, int i10) throws IOException {
        int iZzc = zzidpVar.zzc();
        int i11 = iZzc >>> 3;
        int i12 = iZzc & 7;
        if (i12 == 0) {
            zza(obj, i11, zzidpVar.zzh());
            return true;
        }
        if (i12 == 1) {
            zzc(obj, i11, zzidpVar.zzj());
            return true;
        }
        if (i12 == 2) {
            zzd(obj, i11, zzidpVar.zzq());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw new zzicg("Protocol message end-group tag did not match expected tag.");
            }
            if (i12 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i11, zzidpVar.zzk());
            return true;
        }
        Object objZzf = zzf();
        int i13 = i11 << 3;
        int i14 = i10 + 1;
        if (i14 >= zza) {
            throw new zzicg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzidpVar.zzb() != Integer.MAX_VALUE && zzk(objZzf, zzidpVar, i14)) {
        }
        if ((i13 | 4) != zzidpVar.zzc()) {
            throw new zzicg("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i11, zzg(objZzf));
        return true;
    }
}
