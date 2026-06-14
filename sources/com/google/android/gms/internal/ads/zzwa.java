package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzwa implements zzhb {
    private final zzhb zza;
    private final int zzb;
    private final zzvz zzc;
    private final byte[] zzd;
    private int zze;

    public zzwa(zzhb zzhbVar, int i10, zzvz zzvzVar) {
        zzgrc.zza(i10 > 0);
        this.zza = zzhbVar;
        this.zzb = i10;
        this.zzc = zzvzVar;
        this.zzd = new byte[1];
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zze;
        if (i12 == 0) {
            zzhb zzhbVar = this.zza;
            byte[] bArr2 = this.zzd;
            int i13 = 0;
            if (zzhbVar.zza(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int iZza = zzhbVar.zza(bArr3, i13, i15);
                        if (iZza != -1) {
                            i13 += iZza;
                            i15 -= iZza;
                        }
                    }
                    while (i14 > 0) {
                        int i16 = i14 - 1;
                        if (bArr3[i16] != 0) {
                            break;
                        }
                        i14 = i16;
                    }
                    if (i14 > 0) {
                        this.zzc.zza(new zzer(bArr3, i14));
                    }
                }
                i12 = this.zzb;
                this.zze = i12;
            }
            return -1;
        }
        int iZza2 = this.zza.zza(bArr, i10, Math.min(i12, i11));
        if (iZza2 != -1) {
            this.zze -= iZza2;
        }
        return iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
        zzhzVar.getClass();
        this.zza.zze(zzhzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Map zzj() {
        return this.zza.zzj();
    }
}
