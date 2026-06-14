package com.google.android.gms.internal.ads;

import androidx.work.WorkInfo;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
final class zziat extends zziaw {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zziat(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzH(int i10, int i11) throws IOException {
        zzs((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzI(int i10, int i11) throws IOException {
        zzs(i10 << 3);
        zzr(i11);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzJ(int i10, int i11) throws IOException {
        zzs(i10 << 3);
        zzs(i11);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzK(int i10, int i11) throws IOException {
        zzs((i10 << 3) | 5);
        zzt(i11);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzL(int i10, long j10) throws IOException {
        zzs(i10 << 3);
        zzu(j10);
    }

    @Override // com.google.android.gms.internal.ads.zziae
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzw(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzh(int i10, long j10) throws IOException {
        zzs((i10 << 3) | 1);
        zzv(j10);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzi(int i10, boolean z10) throws IOException {
        zzs(i10 << 3);
        zzq(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzj(int i10, String str) throws IOException {
        zzs((i10 << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzk(int i10, zzian zzianVar) throws IOException {
        zzs((i10 << 3) | 2);
        zzl(zzianVar);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzl(zzian zzianVar) throws IOException {
        zzs(zzianVar.zzc());
        zzianVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzm(byte[] bArr, int i10, int i11) throws IOException {
        zzs(i11);
        zzw(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzn(int i10, zzidc zzidcVar) throws IOException {
        zzs(11);
        zzJ(2, i10);
        zzs(26);
        zzp(zzidcVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzo(int i10, zzian zzianVar) throws IOException {
        zzs(11);
        zzJ(2, i10);
        zzk(3, zzianVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzp(zzidc zzidcVar) throws IOException {
        zzs(zzidcVar.zzbr());
        zzidcVar.zzcX(this);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzq(byte b10) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i10;
        int i11 = this.zzc;
        try {
            i10 = i11 + 1;
        } catch (IndexOutOfBoundsException e10) {
            indexOutOfBoundsException = e10;
        }
        try {
            this.zza[i11] = b10;
            this.zzc = i10;
        } catch (IndexOutOfBoundsException e11) {
            indexOutOfBoundsException = e11;
            i11 = i10;
            throw new zziau(i11, this.zzb, 1, indexOutOfBoundsException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzr(int i10) throws IOException {
        if (i10 >= 0) {
            zzs(i10);
        } else {
            zzu(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzs(int i10) throws IOException {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.zzc;
        while ((i10 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            try {
                i11 = i12 + 1;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                throw new zziau(i12, this.zzb, 1, indexOutOfBoundsException);
            }
            try {
                this.zza[i12] = (byte) (i10 | 128);
                i10 >>>= 7;
                i12 = i11;
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                i12 = i11;
                throw new zziau(i12, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.zza[i12] = (byte) i10;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzt(int i10) throws IOException {
        int i11 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.zzc = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zziau(i11, this.zzb, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzu(long j10) throws IOException {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11;
        boolean z10 = zziaw.zza;
        int i12 = this.zzc;
        if (!z10 || this.zzb - i12 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    i11 = i12 + 1;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                }
                try {
                    this.zza[i12] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                    i12 = i11;
                    throw new zziau(i12, this.zzb, 1, indexOutOfBoundsException);
                }
            }
            i10 = i12 + 1;
            try {
                this.zza[i12] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i12 = i10;
                throw new zziau(i12, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                zziem.zzp(this.zza, i12, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i12++;
            }
            i10 = i12 + 1;
            zziem.zzp(this.zza, i12, (byte) j10);
        }
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzv(long j10) throws IOException {
        int i10 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.zzc = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new zziau(i10, this.zzb, 8, e10);
        }
    }

    public final void zzw(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, i10, this.zza, this.zzc, i11);
            this.zzc += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zziau(this.zzc, this.zzb, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzx(String str) throws IOException {
        int i10 = this.zzc;
        try {
            int iZzA = zziaw.zzA(str.length() * 3);
            int iZzA2 = zziaw.zzA(str.length());
            if (iZzA2 != iZzA) {
                zzs(zzier.zzc(str));
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = zzier.zzd(str, bArr, i11, this.zzb - i11);
                return;
            }
            int i12 = i10 + iZzA2;
            this.zzc = i12;
            int iZzd = zzier.zzd(str, this.zza, i12, this.zzb - i12);
            this.zzc = i10;
            zzs((iZzd - i10) - iZzA2);
            this.zzc = iZzd;
        } catch (IndexOutOfBoundsException e10) {
            throw new zziau(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzy() {
    }
}
