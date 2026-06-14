package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzln {
    public final zzwi zza;
    public final Object zzb;
    public final zzyc[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzlo zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzmn[] zzj;
    private final zzaaj zzk;
    private final zzmc zzl;

    @Nullable
    private zzln zzm;
    private zzyn zzn;
    private zzaak zzo;
    private long zzp;

    public zzln(zzmn[] zzmnVarArr, long j10, zzaaj zzaajVar, zzaan zzaanVar, zzmc zzmcVar, zzlo zzloVar, zzaak zzaakVar, long j11) {
        this.zzj = zzmnVarArr;
        this.zzp = j10;
        this.zzk = zzaajVar;
        this.zzl = zzmcVar;
        zzwk zzwkVar = zzloVar.zza;
        this.zzb = zzwkVar.zza;
        this.zzg = zzloVar;
        this.zzn = zzyn.zza;
        this.zzo = zzaakVar;
        this.zzc = new zzyc[2];
        this.zzi = new boolean[2];
        long j12 = zzloVar.zzb;
        long j13 = zzloVar.zzd;
        zzwi zzwiVarZze = zzmcVar.zze(zzwkVar, zzaanVar, j12);
        this.zza = j13 != -9223372036854775807L ? new zzvo(zzwiVarZze, true, 0L, j13) : zzwiVarZze;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzaak zzaakVar = this.zzo;
            if (i10 >= zzaakVar.zza) {
                return;
            }
            zzaakVar.zza(i10);
            zzaac zzaacVar = this.zzo.zzc[i10];
            i10++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzaak zzaakVar = this.zzo;
            if (i10 >= zzaakVar.zza) {
                return;
            }
            zzaakVar.zza(i10);
            zzaac zzaacVar = this.zzo.zzc[i10];
            i10++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j10) {
        this.zzp = j10;
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzi() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long jZzi = this.zzf ? this.zza.zzi() : Long.MIN_VALUE;
        return jZzi == Long.MIN_VALUE ? this.zzg.zze : jZzi;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzl();
        }
        return 0L;
    }

    public final void zzh(float f10, zzbf zzbfVar, boolean z10) throws zziw {
        this.zze = true;
        this.zzn = this.zza.zzd();
        zzaak zzaakVarZzk = zzk(f10, zzbfVar, z10);
        zzlo zzloVar = this.zzg;
        long jMax = zzloVar.zzb;
        long j10 = zzloVar.zze;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jZzl = zzl(zzaakVarZzk, jMax, false);
        long j11 = this.zzp;
        zzlo zzloVar2 = this.zzg;
        this.zzp = j11 + (zzloVar2.zzb - jZzl);
        this.zzg = zzloVar2.zza(jZzl);
    }

    public final void zzi(long j10) {
        zzgrc.zzi(zzw());
        if (this.zze) {
            this.zza.zzg(j10 - this.zzp);
        }
    }

    public final void zzj(zzll zzllVar) {
        zzgrc.zzi(zzw());
        this.zza.zzm(zzllVar);
    }

    public final zzaak zzk(float f10, zzbf zzbfVar, boolean z10) throws zziw {
        zzyn zzynVar = this.zzn;
        zzwk zzwkVar = this.zzg.zza;
        zzaaj zzaajVar = this.zzk;
        zzmn[] zzmnVarArr = this.zzj;
        zzaak zzaakVarZzq = zzaajVar.zzq(zzmnVarArr, zzynVar, zzwkVar, zzbfVar);
        for (int i10 = 0; i10 < zzaakVarZzq.zza; i10++) {
            if (zzaakVarZzq.zza(i10)) {
                if (zzaakVarZzq.zzc[i10] == null) {
                    zzmnVarArr[i10].zza();
                    z = false;
                }
                zzgrc.zzi(z);
            } else {
                zzgrc.zzi(zzaakVarZzq.zzc[i10] == null);
            }
        }
        for (zzaac zzaacVar : zzaakVarZzq.zzc) {
        }
        return zzaakVarZzq;
    }

    public final long zzl(zzaak zzaakVar, long j10, boolean z10) {
        return zzm(zzaakVar, j10, false, new boolean[2]);
    }

    public final long zzm(zzaak zzaakVar, long j10, boolean z10, boolean[] zArr) {
        zzmn[] zzmnVarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= zzaakVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z10 || !zzaakVar.zzb(this.zzo, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            zzmnVarArr = this.zzj;
            if (i11 >= 2) {
                break;
            }
            zzmnVarArr[i11].zza();
            i11++;
        }
        zzv();
        this.zzo = zzaakVar;
        zzu();
        zzwi zzwiVar = this.zza;
        zzaac[] zzaacVarArr = zzaakVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzyc[] zzycVarArr = this.zzc;
        long jZze = zzwiVar.zze(zzaacVarArr, zArr3, zzycVarArr, zArr, j10);
        for (int i12 = 0; i12 < 2; i12++) {
            zzmnVarArr[i12].zza();
        }
        this.zzf = false;
        for (int i13 = 0; i13 < 2; i13++) {
            if (zzycVarArr[i13] != null) {
                zzgrc.zzi(zzaakVar.zza(i13));
                zzmnVarArr[i13].zza();
                this.zzf = true;
            } else {
                zzgrc.zzi(zzaacVarArr[i13] == null);
            }
        }
        return jZze;
    }

    public final void zzn() {
        zzv();
        zzwi zzwiVar = this.zza;
        try {
            boolean z10 = zzwiVar instanceof zzvo;
            zzmc zzmcVar = this.zzl;
            if (z10) {
                zzmcVar.zzf(((zzvo) zzwiVar).zza);
            } else {
                zzmcVar.zzf(zzwiVar);
            }
        } catch (RuntimeException e10) {
            zzee.zzf("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final void zzo(@Nullable zzln zzlnVar) {
        if (zzlnVar == this.zzm) {
            return;
        }
        zzv();
        this.zzm = zzlnVar;
        zzu();
    }

    @Nullable
    public final zzln zzp() {
        return this.zzm;
    }

    public final zzyn zzq() {
        return this.zzn;
    }

    public final zzaak zzr() {
        return this.zzo;
    }

    public final void zzs() {
        zzwi zzwiVar = this.zza;
        if (zzwiVar instanceof zzvo) {
            long j10 = this.zzg.zzd;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((zzvo) zzwiVar).zza(0L, j10);
        }
    }

    public final void zzt(zzwh zzwhVar, long j10) {
        this.zzd = true;
        this.zza.zzb(zzwhVar, j10);
    }
}
