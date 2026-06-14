package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
final class zzmc {
    private final zzpq zza;
    private final zzmb zze;
    private final zzmx zzh;
    private final zzdx zzi;
    private boolean zzj;

    @Nullable
    private zzhz zzk;
    private zzyf zzl = new zzyf(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzmc(zzmb zzmbVar, zzmx zzmxVar, zzdx zzdxVar, zzpq zzpqVar) {
        this.zza = zzpqVar;
        this.zze = zzmbVar;
        this.zzh = zzmxVar;
        this.zzi = zzdxVar;
    }

    private final void zzr() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzlz zzlzVar = (zzlz) it.next();
            if (zzlzVar.zzc.isEmpty()) {
                zzs(zzlzVar);
                it.remove();
            }
        }
    }

    private final void zzs(zzlz zzlzVar) {
        zzly zzlyVar = (zzly) this.zzf.get(zzlzVar);
        if (zzlyVar != null) {
            zzlyVar.zza.zzr(zzlyVar.zzb);
        }
    }

    private final void zzt(int i10, int i11) {
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            }
            zzlz zzlzVar = (zzlz) this.zzb.remove(i11);
            this.zzd.remove(zzlzVar.zzb);
            zzu(i11, -zzlzVar.zza.zzz().zza());
            zzlzVar.zze = true;
            if (this.zzj) {
                zzw(zzlzVar);
            }
        }
    }

    private final void zzu(int i10, int i11) {
        while (true) {
            List list = this.zzb;
            if (i10 >= list.size()) {
                return;
            }
            ((zzlz) list.get(i10)).zzd += i11;
            i10++;
        }
    }

    private final void zzv(zzlz zzlzVar) {
        zzwf zzwfVar = zzlzVar.zza;
        zzwl zzwlVar = new zzwl() { // from class: com.google.android.gms.internal.ads.zzma
            @Override // com.google.android.gms.internal.ads.zzwl
            public final /* synthetic */ void zza(zzwm zzwmVar, zzbf zzbfVar) {
                this.zza.zzi(zzwmVar, zzbfVar);
            }
        };
        zzlx zzlxVar = new zzlx(this, zzlzVar);
        this.zzf.put(zzlzVar, new zzly(zzwfVar, zzwlVar, zzlxVar));
        zzwfVar.zzl(new Handler(zzfj.zze(), null), zzlxVar);
        zzwfVar.zzn(new Handler(zzfj.zze(), null), zzlxVar);
        zzwfVar.zzp(zzwlVar, this.zzk, this.zza);
    }

    private final void zzw(zzlz zzlzVar) {
        if (zzlzVar.zze && zzlzVar.zzc.isEmpty()) {
            zzly zzlyVar = (zzly) this.zzf.remove(zzlzVar);
            zzlyVar.getClass();
            zzwm zzwmVar = zzlyVar.zza;
            zzwmVar.zzs(zzlyVar.zzb);
            zzlx zzlxVar = zzlyVar.zzc;
            zzwmVar.zzm(zzlxVar);
            zzwmVar.zzo(zzlxVar);
            this.zzg.remove(zzlzVar);
        }
    }

    public final zzbf zza(int i10, int i11, List list) {
        zzgrc.zza(i10 >= 0 && i10 <= i11 && i11 <= zzc());
        zzgrc.zza(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((zzlz) this.zzb.get(i12)).zza.zzA((zzak) list.get(i12 - i10));
        }
        return zzh();
    }

    public final boolean zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final void zzd(@Nullable zzhz zzhzVar) {
        zzgrc.zzi(!this.zzj);
        this.zzk = zzhzVar;
        int i10 = 0;
        while (true) {
            List list = this.zzb;
            if (i10 >= list.size()) {
                this.zzj = true;
                return;
            }
            zzlz zzlzVar = (zzlz) list.get(i10);
            zzv(zzlzVar);
            this.zzg.add(zzlzVar);
            i10++;
        }
    }

    public final zzwi zze(zzwk zzwkVar, zzaan zzaanVar, long j10) {
        int i10 = zzmj.zzb;
        Pair pair = (Pair) zzwkVar.zza;
        Object obj = pair.first;
        zzwk zzwkVarZza = zzwkVar.zza(pair.second);
        zzlz zzlzVar = (zzlz) this.zzd.get(obj);
        zzlzVar.getClass();
        this.zzg.add(zzlzVar);
        zzly zzlyVar = (zzly) this.zzf.get(zzlzVar);
        if (zzlyVar != null) {
            zzlyVar.zza.zzq(zzlyVar.zzb);
        }
        zzlzVar.zzc.add(zzwkVarZza);
        zzwc zzwcVarZzC = zzlzVar.zza.zzG(zzwkVarZza, zzaanVar, j10);
        this.zzc.put(zzwcVarZzC, zzlzVar);
        zzr();
        return zzwcVarZzC;
    }

    public final void zzf(zzwi zzwiVar) {
        IdentityHashMap identityHashMap = this.zzc;
        zzlz zzlzVar = (zzlz) identityHashMap.remove(zzwiVar);
        zzlzVar.getClass();
        zzlzVar.zza.zzD(zzwiVar);
        zzlzVar.zzc.remove(((zzwc) zzwiVar).zza);
        if (!identityHashMap.isEmpty()) {
            zzr();
        }
        zzw(zzlzVar);
    }

    public final void zzg() {
        for (zzly zzlyVar : this.zzf.values()) {
            try {
                zzlyVar.zza.zzs(zzlyVar.zzb);
            } catch (RuntimeException e10) {
                zzee.zzf("MediaSourceList", "Failed to release child source.", e10);
            }
            zzwm zzwmVar = zzlyVar.zza;
            zzlx zzlxVar = zzlyVar.zzc;
            zzwmVar.zzm(zzlxVar);
            zzwmVar.zzo(zzlxVar);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final zzbf zzh() {
        List list = this.zzb;
        if (list.isEmpty()) {
            return zzbf.zza;
        }
        int iZza = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzlz zzlzVar = (zzlz) list.get(i10);
            zzlzVar.zzd = iZza;
            iZza += zzlzVar.zza.zzz().zza();
        }
        return new zzmj(list, this.zzl);
    }

    final /* synthetic */ void zzi(zzwm zzwmVar, zzbf zzbfVar) {
        this.zze.zzo();
    }

    final /* synthetic */ zzmx zzj() {
        return this.zzh;
    }

    final /* synthetic */ zzdx zzk() {
        return this.zzi;
    }

    public final zzbf zzl(List list, zzyf zzyfVar) {
        List list2 = this.zzb;
        zzt(0, list2.size());
        return zzm(list2.size(), list, zzyfVar);
    }

    public final zzbf zzm(int i10, List list, zzyf zzyfVar) {
        if (!list.isEmpty()) {
            this.zzl = zzyfVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                zzlz zzlzVar = (zzlz) list.get(i11 - i10);
                if (i11 > 0) {
                    zzlz zzlzVar2 = (zzlz) this.zzb.get(i11 - 1);
                    zzlzVar.zzc(zzlzVar2.zzd + zzlzVar2.zza.zzz().zza());
                } else {
                    zzlzVar.zzc(0);
                }
                zzu(i11, zzlzVar.zza.zzz().zza());
                this.zzb.add(i11, zzlzVar);
                this.zzd.put(zzlzVar.zzb, zzlzVar);
                if (this.zzj) {
                    zzv(zzlzVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzlzVar);
                    } else {
                        zzs(zzlzVar);
                    }
                }
            }
        }
        return zzh();
    }

    public final zzbf zzn(int i10, int i11, zzyf zzyfVar) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11 && i11 <= zzc()) {
            z10 = true;
        }
        zzgrc.zza(z10);
        this.zzl = zzyfVar;
        zzt(i10, i11);
        return zzh();
    }

    public final zzbf zzo(int i10, int i11, int i12, zzyf zzyfVar) {
        zzgrc.zza(zzc() >= 0);
        this.zzl = null;
        return zzh();
    }

    public final zzbf zzp(zzyf zzyfVar) {
        int iZzc = zzc();
        if (zzyfVar.zza() != iZzc) {
            zzyfVar = zzyfVar.zzg().zzf(0, iZzc);
        }
        this.zzl = zzyfVar;
        return zzh();
    }

    public final zzyf zzq() {
        return this.zzl;
    }
}
