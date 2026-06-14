package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcid implements zzlj {
    private final zzaat zza = new zzaat(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    zzcid() {
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zza(zzpq zzpqVar) {
        zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzb(zzli zzliVar, zzyn zzynVar, zzaac[] zzaacVarArr) {
        int i10;
        this.zzf = 0;
        for (zzaac zzaacVar : zzaacVarArr) {
            if (zzaacVar != null) {
                int i11 = this.zzf;
                int i12 = zzaacVar.zza().zzc;
                if (i12 == 0) {
                    i10 = 144310272;
                } else if (i12 == 1) {
                    i10 = 13107200;
                } else if (i12 != 2) {
                    i10 = 131072;
                    if (i12 != 3 && i12 != 5 && i12 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i10 = 131072000;
                }
                this.zzf = i11 + i10;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzc(zzpq zzpqVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzd(zzpq zzpqVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final zzaan zze(zzpq zzpqVar) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final long zzf(zzpq zzpqVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzg(zzpq zzpqVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzh(zzli zzliVar) {
        long j10 = zzliVar.zze;
        boolean z10 = true;
        char c10 = j10 > this.zzc ? (char) 0 : j10 < this.zzb ? (char) 2 : (char) 1;
        int iZzg = this.zza.zzg();
        int i10 = this.zzf;
        if (c10 != 2 && (c10 != 1 || !this.zzg || iZzg >= i10)) {
            z10 = false;
        }
        this.zzg = z10;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzi(zzli zzliVar) {
        long j10 = zzliVar.zzg ? this.zze : this.zzd;
        return j10 <= 0 || zzliVar.zze >= j10;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public /* synthetic */ boolean zzj(zzpq zzpqVar, zzbf zzbfVar, zzwk zzwkVar, long j10) {
        return m1.i(this, zzpqVar, zzbfVar, zzwkVar, j10);
    }

    public final synchronized void zzk(int i10) {
        this.zzb = ((long) i10) * 1000;
    }

    public final synchronized void zzl(int i10) {
        this.zzc = ((long) i10) * 1000;
    }

    public final synchronized void zzm(int i10) {
        this.zzd = ((long) i10) * 1000;
    }

    public final synchronized void zzn(int i10) {
        this.zze = ((long) i10) * 1000;
    }

    @VisibleForTesting
    final void zzo(boolean z10) {
        this.zzf = 0;
        this.zzg = false;
        if (z10) {
            this.zza.zze();
        }
    }
}
