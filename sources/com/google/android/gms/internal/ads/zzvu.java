package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzvu implements zzye {
    private final zzguf zza;
    private long zzb;

    public zzvu(List list, List list2) {
        int i10 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        zzgrc.zza(list.size() == list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzgucVar.zzf(new zzvt((zzye) list.get(i11), (List) list2.get(i11)));
        }
        this.zza = zzgucVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zzg(long j10) {
        int i10 = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i10 >= zzgufVar.size()) {
                return;
            }
            ((zzvt) zzgufVar.get(i10)).zzg(j10);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i10 >= zzgufVar.size()) {
                break;
            }
            zzvt zzvtVar = (zzvt) zzgufVar.get(i10);
            long jZzi = zzvtVar.zzi();
            if ((zzvtVar.zza().contains(1) || zzvtVar.zza().contains(2) || zzvtVar.zza().contains(4)) && jZzi != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzi);
            }
            if (jZzi != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzi);
            }
            i10++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.zzb;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i10 >= zzgufVar.size()) {
                break;
            }
            long jZzl = ((zzvt) zzgufVar.get(i10)).zzl();
            if (jZzl != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzl);
            }
            i10++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        boolean zZzm;
        boolean z10 = false;
        do {
            long jZzl = zzl();
            if (jZzl == Long.MIN_VALUE) {
                break;
            }
            int i10 = 0;
            zZzm = false;
            while (true) {
                zzguf zzgufVar = this.zza;
                if (i10 >= zzgufVar.size()) {
                    break;
                }
                long jZzl2 = ((zzvt) zzgufVar.get(i10)).zzl();
                boolean z11 = jZzl2 != Long.MIN_VALUE && jZzl2 <= zzllVar.zza;
                if (jZzl2 == jZzl || z11) {
                    zZzm |= ((zzvt) zzgufVar.get(i10)).zzm(zzllVar);
                }
                i10++;
            }
            z10 |= zZzm;
        } while (zZzm);
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        int i10 = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i10 >= zzgufVar.size()) {
                return false;
            }
            if (((zzvt) zzgufVar.get(i10)).zzn()) {
                return true;
            }
            i10++;
        }
    }
}
