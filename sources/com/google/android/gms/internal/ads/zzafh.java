package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class zzafh {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;

    @Nullable
    public final zzafg zzk;

    @Nullable
    private final zzap zzl;

    @VisibleForTesting
    zzafh(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, @Nullable zzafg zzafgVar, @Nullable zzap zzapVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = zzf(i14);
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzg(i16);
        this.zzj = j10;
        this.zzk = zzafgVar;
        this.zzl = zzapVar;
    }

    private static int zzf(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static int zzg(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long zza() {
        long j10 = this.zzj;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.zze);
    }

    public final long zzb(long j10) {
        String str = zzfj.zza;
        return Math.max(0L, Math.min((j10 * ((long) this.zze)) / 1000000, this.zzj - 1));
    }

    public final zzv zzc(byte[] bArr, @Nullable zzap zzapVar) {
        bArr[4] = UnsignedBytes.MAX_POWER_OF_TWO;
        zzap zzapVarZzd = zzd(zzapVar);
        zzt zztVar = new zzt();
        zztVar.zzm("audio/flac");
        int i10 = this.zzd;
        if (i10 <= 0) {
            i10 = -1;
        }
        zztVar.zzn(i10);
        zztVar.zzE(this.zzg);
        zztVar.zzF(this.zze);
        zztVar.zzG(zzfj.zzz(this.zzh, ByteOrder.LITTLE_ENDIAN));
        zztVar.zzp(Collections.singletonList(bArr));
        zztVar.zzk(zzapVarZzd);
        return zztVar.zzM();
    }

    @Nullable
    public final zzap zzd(@Nullable zzap zzapVar) {
        zzap zzapVar2 = this.zzl;
        return zzapVar2 == null ? zzapVar : zzapVar2.zzf(zzapVar);
    }

    public final zzafh zze(@Nullable zzafg zzafgVar) {
        return new zzafh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzafgVar, this.zzl);
    }

    public zzafh(byte[] bArr, int i10) {
        zzeq zzeqVar = new zzeq(bArr, bArr.length);
        zzeqVar.zzf(i10 * 8);
        this.zza = zzeqVar.zzj(16);
        this.zzb = zzeqVar.zzj(16);
        this.zzc = zzeqVar.zzj(24);
        this.zzd = zzeqVar.zzj(24);
        int iZzj = zzeqVar.zzj(20);
        this.zze = iZzj;
        this.zzf = zzf(iZzj);
        this.zzg = zzeqVar.zzj(3) + 1;
        int iZzj2 = zzeqVar.zzj(5) + 1;
        this.zzh = iZzj2;
        this.zzi = zzg(iZzj2);
        this.zzj = zzeqVar.zzk(36);
        this.zzk = null;
        this.zzl = null;
    }
}
