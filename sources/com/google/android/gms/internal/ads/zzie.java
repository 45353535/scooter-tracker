package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzie {

    @Nullable
    public byte[] zza;

    @Nullable
    public byte[] zzb;
    public int zzc;

    @Nullable
    public int[] zzd;

    @Nullable
    public int[] zze;
    public int zzf;
    public int zzg;
    public int zzh;
    private final MediaCodec.CryptoInfo zzi;

    @Nullable
    private final zzid zzj;

    public zzie() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.zzi = cryptoInfo;
        this.zzj = Build.VERSION.SDK_INT >= 24 ? new zzid(cryptoInfo, 0 == true ? 1 : 0) : null;
    }

    public final void zza(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.zzf = i10;
        this.zzd = iArr;
        this.zze = iArr2;
        this.zzb = bArr;
        this.zza = bArr2;
        this.zzc = i11;
        this.zzg = i12;
        this.zzh = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.zzi;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (Build.VERSION.SDK_INT >= 24) {
            zzid zzidVar = this.zzj;
            zzidVar.getClass();
            zzidVar.zza(i12, i13);
        }
    }

    public final MediaCodec.CryptoInfo zzb() {
        return this.zzi;
    }

    public final void zzc(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.zzd == null) {
            int[] iArr = new int[1];
            this.zzd = iArr;
            this.zzi.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.zzd;
        iArr2[0] = iArr2[0] + i10;
    }
}
