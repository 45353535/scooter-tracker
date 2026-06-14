package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzagi {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzb(zzaev zzaevVar) throws IOException {
        if (this.zzb) {
            return;
        }
        byte[] bArr = this.zza;
        zzaevVar.zzi(bArr, 0, 10);
        zzaevVar.zzl();
        int i10 = zzadv.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }

    public final void zzc(zzagh zzaghVar, long j10, int i10, int i11, int i12, @Nullable zzagg zzaggVar) {
        zzgrc.zzj(this.zzg <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i13 = this.zzc;
            int i14 = i13 + 1;
            this.zzc = i14;
            if (i13 == 0) {
                this.zzd = j10;
                this.zze = i10;
                this.zzf = 0;
            }
            this.zzf += i11;
            this.zzg = i12;
            if (i14 >= 16) {
                zzd(zzaghVar, zzaggVar);
            }
        }
    }

    public final void zzd(zzagh zzaghVar, @Nullable zzagg zzaggVar) {
        if (this.zzc > 0) {
            zzaghVar.zze(this.zzd, this.zze, this.zzf, this.zzg, zzaggVar);
            this.zzc = 0;
        }
    }
}
