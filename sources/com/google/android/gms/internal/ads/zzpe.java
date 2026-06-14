package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzpe {
    final /* synthetic */ zzpf zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzwk zze;
    private boolean zzf;
    private boolean zzg;

    public zzpe(zzpf zzpfVar, String str, @Nullable int i10, zzwk zzwkVar) {
        Objects.requireNonNull(zzpfVar);
        this.zza = zzpfVar;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = zzwkVar == null ? -1L : zzwkVar.zzd;
        if (zzwkVar == null || !zzwkVar.zzb()) {
            return;
        }
        this.zze = zzwkVar;
    }

    public final boolean zza(zzbf zzbfVar, zzbf zzbfVar2) {
        int i10 = this.zzc;
        if (i10 < zzbfVar.zza()) {
            zzpf zzpfVar = this.zza;
            zzbfVar.zzb(i10, zzpfVar.zzj(), 0L);
            for (int i11 = zzpfVar.zzj().zzn; i11 <= zzpfVar.zzj().zzo; i11++) {
                int iZze = zzbfVar2.zze(zzbfVar.zzf(i11));
                if (iZze != -1) {
                    i10 = zzbfVar2.zzd(iZze, zzpfVar.zzk(), false).zzc;
                    break;
                }
            }
            i10 = -1;
        } else if (i10 >= zzbfVar2.zza()) {
            i10 = -1;
        }
        this.zzc = i10;
        if (i10 == -1) {
            return false;
        }
        zzwk zzwkVar = this.zze;
        return zzwkVar == null || zzbfVar2.zze(zzwkVar.zza) != -1;
    }

    public final boolean zzb(int i10, @Nullable zzwk zzwkVar) {
        if (zzwkVar != null) {
            long j10 = zzwkVar.zzd;
            if (j10 != -1) {
                zzwk zzwkVar2 = this.zze;
                return zzwkVar2 == null ? !zzwkVar.zzb() && j10 == this.zzd : j10 == zzwkVar2.zzd && zzwkVar.zzb == zzwkVar2.zzb && zzwkVar.zzc == zzwkVar2.zzc;
            }
        }
        return i10 == this.zzc;
    }

    public final void zzc(int i10, @Nullable zzwk zzwkVar) {
        if (this.zzd == -1 && i10 == this.zzc && zzwkVar != null) {
            zzpf zzpfVar = this.zza;
            long j10 = zzwkVar.zzd;
            if (j10 >= zzpfVar.zzi()) {
                this.zzd = j10;
            }
        }
    }

    public final boolean zzd(zzmy zzmyVar) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar == null) {
            return this.zzc != zzmyVar.zzc;
        }
        long j10 = this.zzd;
        if (j10 == -1) {
            return false;
        }
        long j11 = zzwkVar.zzd;
        if (j11 > j10) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbf zzbfVar = zzmyVar.zzb;
        int iZze = zzbfVar.zze(zzwkVar.zza);
        int iZze2 = zzbfVar.zze(this.zze.zza);
        zzwk zzwkVar2 = this.zze;
        if (j11 < zzwkVar2.zzd || iZze < iZze2) {
            return false;
        }
        if (iZze > iZze2) {
            return true;
        }
        if (!zzwkVar.zzb()) {
            int i10 = zzwkVar.zze;
            return i10 == -1 || i10 > zzwkVar2.zzb;
        }
        int i11 = zzwkVar.zzb;
        int i12 = zzwkVar.zzc;
        int i13 = zzwkVar2.zzb;
        if (i11 <= i13) {
            return i11 == i13 && i12 > zzwkVar2.zzc;
        }
        return true;
    }

    final /* synthetic */ String zze() {
        return this.zzb;
    }

    final /* synthetic */ int zzf() {
        return this.zzc;
    }

    final /* synthetic */ long zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzwk zzh() {
        return this.zze;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    final /* synthetic */ void zzj(boolean z10) {
        this.zzf = true;
    }

    final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    final /* synthetic */ void zzl(boolean z10) {
        this.zzg = true;
    }
}
