package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes8.dex */
final class zzfvl extends zzfvi {
    private String zza;
    private boolean zzb;
    private boolean zzc;
    private long zzd;
    private long zze;
    private byte zzf;

    zzfvl() {
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final zzfvi zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final zzfvi zzb(boolean z10) {
        this.zzb = z10;
        this.zzf = (byte) (this.zzf | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final zzfvi zzc(boolean z10) {
        this.zzc = true;
        this.zzf = (byte) (this.zzf | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final zzfvi zzd(boolean z10) {
        this.zzf = (byte) (this.zzf | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final zzfvi zze(long j10) {
        this.zzd = 100L;
        this.zzf = (byte) (this.zzf | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final zzfvi zzf(boolean z10) {
        this.zzf = (byte) (this.zzf | Ascii.DLE);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final zzfvi zzg(long j10) {
        this.zze = 300L;
        this.zzf = (byte) (this.zzf | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final zzfvj zzh() {
        String str;
        if (this.zzf == 63 && (str = this.zza) != null) {
            return new zzfvm(str, this.zzb, this.zzc, false, this.zzd, false, this.zze, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" clientVersion");
        }
        if ((this.zzf & 1) == 0) {
            sb2.append(" shouldGetAdvertisingId");
        }
        if ((this.zzf & 2) == 0) {
            sb2.append(" isGooglePlayServicesAvailable");
        }
        if ((this.zzf & 4) == 0) {
            sb2.append(" enableQuerySignalsTimeout");
        }
        if ((this.zzf & 8) == 0) {
            sb2.append(" querySignalsTimeoutMs");
        }
        if ((this.zzf & Ascii.DLE) == 0) {
            sb2.append(" enableQuerySignalsCache");
        }
        if ((this.zzf & 32) == 0) {
            sb2.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
