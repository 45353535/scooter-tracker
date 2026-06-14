package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhy implements zzhb {
    private final zzhb zza;
    private long zzb;
    private Uri zzc = Uri.EMPTY;
    private Map zzd = Collections.EMPTY_MAP;

    public zzhy(zzhb zzhbVar) {
        this.zza = zzhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int iZza = this.zza.zza(bArr, i10, i11);
        if (iZza != -1) {
            this.zzb += (long) iZza;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws IOException {
        this.zzc = zzhfVar.zza;
        this.zzd = Collections.EMPTY_MAP;
        try {
            long jZzb = this.zza.zzb(zzhfVar);
            Uri uriZzc = zzc();
            if (uriZzc != null) {
                this.zzc = uriZzc;
            }
            this.zzd = zzj();
            return jZzb;
        } catch (Throwable th2) {
            Uri uriZzc2 = zzc();
            if (uriZzc2 != null) {
                this.zzc = uriZzc2;
            }
            this.zzd = zzj();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
        zzhzVar.getClass();
        this.zza.zze(zzhzVar);
    }

    public final long zzf() {
        return this.zzb;
    }

    public final Uri zzg() {
        return this.zzc;
    }

    public final Map zzh() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Map zzj() {
        return this.zza.zzj();
    }
}
