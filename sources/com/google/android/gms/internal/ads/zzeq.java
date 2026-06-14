package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeq {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzeq(byte[] bArr, int i10) {
        this.zza = bArr;
        this.zzd = i10;
    }

    private final void zzq() {
        int i10;
        int i11 = this.zzb;
        boolean z10 = false;
        if (i11 >= 0 && (i11 < (i10 = this.zzd) || (i11 == i10 && this.zzc == 0))) {
            z10 = true;
        }
        zzgrc.zzi(z10);
    }

    public final void zza(zzer zzerVar) {
        zzb(zzerVar.zzi(), zzerVar.zze());
        zzf(zzerVar.zzg() * 8);
    }

    public final void zzb(byte[] bArr, int i10) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i10;
    }

    public final int zzc() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzd() {
        return (this.zzb * 8) + this.zzc;
    }

    public final int zze() {
        zzgrc.zzi(this.zzc == 0);
        return this.zzb;
    }

    public final void zzf(int i10) {
        int i11 = i10 / 8;
        this.zzb = i11;
        this.zzc = i10 - (i11 * 8);
        zzq();
    }

    public final void zzg() {
        int i10 = this.zzc + 1;
        this.zzc = i10;
        if (i10 == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzq();
    }

    public final void zzh(int i10) {
        int i11 = i10 / 8;
        int i12 = this.zzb + i11;
        this.zzb = i12;
        int i13 = this.zzc + (i10 - (i11 * 8));
        this.zzc = i13;
        if (i13 > 7) {
            this.zzb = i12 + 1;
            this.zzc = i13 - 8;
        }
        zzq();
    }

    public final boolean zzi() {
        int i10 = this.zza[this.zzb] & (128 >> this.zzc);
        zzg();
        return i10 != 0;
    }

    public final int zzj(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.zzc += i10;
        int i12 = 0;
        while (true) {
            i11 = this.zzc;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.zzc = i13;
            byte[] bArr = this.zza;
            int i14 = this.zzb;
            this.zzb = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.zza;
        int i15 = this.zzb;
        int i16 = i12 | ((bArr2[i15] & 255) >> (8 - i11));
        int i17 = 32 - i10;
        if (i11 == 8) {
            this.zzc = 0;
            this.zzb = i15 + 1;
        }
        int i18 = ((-1) >>> i17) & i16;
        zzq();
        return i18;
    }

    public final long zzk(int i10) {
        if (i10 <= 32) {
            int iZzj = zzj(i10);
            String str = zzfj.zza;
            return 4294967295L & ((long) iZzj);
        }
        int iZzj2 = zzj(i10 - 32);
        int iZzj3 = zzj(32);
        String str2 = zzfj.zza;
        return (4294967295L & ((long) iZzj3)) | ((((long) iZzj2) & 4294967295L) << 32);
    }

    public final void zzl(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = 0;
        while (true) {
            i12 = i11 >> 3;
            if (i13 >= i12) {
                break;
            }
            byte[] bArr2 = this.zza;
            int i14 = this.zzb;
            int i15 = i14 + 1;
            this.zzb = i15;
            byte b10 = bArr2[i14];
            int i16 = this.zzc;
            byte b11 = (byte) (b10 << i16);
            bArr[i13] = b11;
            bArr[i13] = (byte) (((bArr2[i15] & 255) >> (8 - i16)) | b11);
            i13++;
        }
        int i17 = i11 & 7;
        if (i17 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (255 >> i17));
        bArr[i12] = b12;
        int i18 = this.zzc;
        if (i18 + i17 > 8) {
            byte[] bArr3 = this.zza;
            int i19 = this.zzb;
            this.zzb = i19 + 1;
            b12 = (byte) (b12 | ((bArr3[i19] & 255) << i18));
            bArr[i12] = b12;
            i18 -= 8;
        }
        int i20 = i18 + i17;
        this.zzc = i20;
        byte[] bArr4 = this.zza;
        int i21 = this.zzb;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i21]) >> (8 - i20)) << (8 - i17))) | b12);
        if (i20 == 8) {
            this.zzc = 0;
            this.zzb = i21 + 1;
        }
        zzq();
    }

    public final void zzm() {
        if (this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb++;
        zzq();
    }

    public final void zzn(byte[] bArr, int i10, int i11) {
        zzgrc.zzi(this.zzc == 0);
        System.arraycopy(this.zza, this.zzb, bArr, 0, i11);
        this.zzb += i11;
        zzq();
    }

    public final void zzo(int i10) {
        zzgrc.zzi(this.zzc == 0);
        this.zzb += i10;
        zzq();
    }

    public final void zzp(int i10, int i11) {
        int iMin = Math.min(8 - this.zzc, 14);
        int i12 = this.zzc;
        int i13 = (8 - i12) - iMin;
        int i14 = MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i12;
        byte[] bArr = this.zza;
        int i15 = this.zzb;
        byte b10 = (byte) ((i14 | ((1 << i13) - 1)) & bArr[i15]);
        bArr[i15] = b10;
        int i16 = 14 - iMin;
        int i17 = i10 & 16383;
        bArr[i15] = (byte) (b10 | ((i17 >>> i16) << i13));
        int i18 = i15 + 1;
        while (i16 > 8) {
            i16 -= 8;
            this.zza[i18] = (byte) (i17 >>> i16);
            i18++;
        }
        byte[] bArr2 = this.zza;
        byte b11 = (byte) (bArr2[i18] & ((1 << r0) - 1));
        bArr2[i18] = b11;
        bArr2[i18] = (byte) (((i17 & ((1 << i16) - 1)) << (8 - i16)) | b11);
        zzh(14);
        zzq();
    }

    public zzeq() {
        this.zza = zzfj.zzb;
    }
}
