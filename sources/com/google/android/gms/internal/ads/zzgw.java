package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgw extends zzgt {
    private final zzgv zza;

    @Nullable
    private Uri zzb;

    @Nullable
    private byte[] zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    public zzgw(final byte[] bArr) {
        zzgv zzgvVar = new zzgv() { // from class: com.google.android.gms.internal.ads.zzgu
            @Override // com.google.android.gms.internal.ads.zzgv
            public final /* synthetic */ byte[] zza(Uri uri) {
                return bArr;
            }
        };
        super(false);
        this.zza = zzgvVar;
        zzgrc.zza(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zze;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.zzc;
        bArr2.getClass();
        System.arraycopy(bArr2, this.zzd, bArr, i10, iMin);
        this.zzd += iMin;
        this.zze -= iMin;
        zzh(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws IOException {
        zzf(zzhfVar);
        Uri uri = zzhfVar.zza;
        this.zzb = uri;
        byte[] bArrZza = this.zza.zza(uri);
        this.zzc = bArrZza;
        long j10 = zzhfVar.zze;
        int length = bArrZza.length;
        if (j10 > length) {
            throw new zzhc(2008);
        }
        int i10 = (int) j10;
        this.zzd = i10;
        int i11 = length - i10;
        this.zze = i11;
        long j11 = zzhfVar.zzf;
        if (j11 != -1) {
            this.zze = (int) Math.min(i11, j11);
        }
        this.zzf = true;
        zzg(zzhfVar);
        return j11 != -1 ? j11 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
            zzi();
        }
        this.zzb = null;
        this.zzc = null;
    }
}
