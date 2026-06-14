package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzalt {
    private zzagh zzb;
    private zzaex zzc;
    private zzalp zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzaln zza = new zzaln();
    private zzalr zzj = new zzalr();

    protected void zza(boolean z10) {
        int i10;
        if (z10) {
            this.zzj = new zzalr();
            this.zzf = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.zzh = i10;
        this.zze = -1L;
        this.zzg = 0L;
    }

    protected abstract long zzb(zzer zzerVar);

    protected abstract boolean zzc(zzer zzerVar, long j10, zzalr zzalrVar) throws IOException;

    final void zze(zzaex zzaexVar, zzagh zzaghVar) {
        this.zzc = zzaexVar;
        this.zzb = zzaghVar;
        zza(true);
    }

    final void zzf(long j10, long j11) {
        this.zza.zza();
        if (j10 == 0) {
            zza(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long jZzi = zzi(j11);
            this.zze = jZzi;
            zzalp zzalpVar = this.zzd;
            String str = zzfj.zza;
            zzalpVar.zzb(jZzi);
            this.zzh = 2;
        }
    }

    final int zzg(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        this.zzb.getClass();
        String str = zzfj.zza;
        int i10 = this.zzh;
        if (i10 != 0) {
            if (i10 == 1) {
                zzaevVar.zzf((int) this.zzf);
                this.zzh = 2;
                return 0;
            }
            if (i10 != 2) {
                return -1;
            }
            long jZza = this.zzd.zza(zzaevVar);
            if (jZza >= 0) {
                zzafvVar.zza = jZza;
                return 1;
            }
            if (jZza < -1) {
                zzj(-(jZza + 2));
            }
            if (!this.zzl) {
                zzafy zzafyVarZzc = this.zzd.zzc();
                zzafyVarZzc.getClass();
                this.zzc.zzw(zzafyVarZzc);
                this.zzb.zzN(zzafyVarZzc.zza());
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zzb(zzaevVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzer zzerVarZzd = this.zza.zzd();
            long jZzb = zzb(zzerVarZzd);
            if (jZzb >= 0) {
                long j10 = this.zzg;
                if (j10 + jZzb >= this.zze) {
                    long jZzh = zzh(j10);
                    this.zzb.zzc(zzerVarZzd, zzerVarZzd.zze());
                    this.zzb.zze(jZzh, 1, zzerVarZzd.zze(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += jZzb;
            return 0;
        }
        while (true) {
            zzaln zzalnVar = this.zza;
            if (!zzalnVar.zzb(zzaevVar)) {
                this.zzh = 3;
                return -1;
            }
            long jZzn = zzaevVar.zzn();
            long j11 = this.zzf;
            this.zzk = jZzn - j11;
            if (!zzc(zzalnVar.zzd(), j11, this.zzj)) {
                zzv zzvVar = this.zzj.zza;
                this.zzi = zzvVar.zzH;
                if (!this.zzm) {
                    this.zzb.zzz(zzvVar);
                    this.zzm = true;
                }
                zzalp zzalpVar = this.zzj.zzb;
                if (zzalpVar != null) {
                    this.zzd = zzalpVar;
                } else if (zzaevVar.zzo() == -1) {
                    this.zzd = new zzals(null);
                } else {
                    zzalo zzaloVarZzc = zzalnVar.zzc();
                    this.zzd = new zzali(this, this.zzf, zzaevVar.zzo(), zzaloVarZzc.zzd + zzaloVarZzc.zze, zzaloVarZzc.zzb, (zzaloVarZzc.zza & 4) != 0);
                }
                this.zzh = 2;
                zzalnVar.zze();
                return 0;
            }
            this.zzf = zzaevVar.zzn();
        }
    }

    protected final long zzh(long j10) {
        return (j10 * 1000000) / ((long) this.zzi);
    }

    protected final long zzi(long j10) {
        return (((long) this.zzi) * j10) / 1000000;
    }

    protected void zzj(long j10) {
        this.zzg = j10;
    }
}
