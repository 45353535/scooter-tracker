package com.google.android.gms.internal.consent_sdk;

import androidx.work.WorkInfo;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
final class zzpr extends zzpv {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zzpr(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzI() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzJ(byte b10) throws IOException {
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
            throw new zzps(i11, this.zzb, 1, indexOutOfBoundsException);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzK(int i10, boolean z10) throws IOException {
        zzw(i10 << 3);
        zzJ(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzL(byte[] bArr, int i10, int i11) throws IOException {
        zzw(i11);
        zze(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv, com.google.android.gms.internal.consent_sdk.zzpe
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zze(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zza, this.zzc, i11);
            this.zzc += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzps(this.zzc, this.zzb, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzh(int i10, zzpm zzpmVar) throws IOException {
        zzw((i10 << 3) | 2);
        zzi(zzpmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzi(zzpm zzpmVar) throws IOException {
        zzw(zzpmVar.zzd());
        zzpmVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzj(int i10, int i11) throws IOException {
        zzw((i10 << 3) | 5);
        zzk(i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzk(int i10) throws IOException {
        int i11 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.zzc = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzps(i11, this.zzb, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzl(int i10, long j10) throws IOException {
        zzw((i10 << 3) | 1);
        zzm(j10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzm(long j10) throws IOException {
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
            throw new zzps(i10, this.zzb, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzn(int i10, int i11) throws IOException {
        zzw(i10 << 3);
        zzo(i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzo(int i10) throws IOException {
        if (i10 >= 0) {
            zzw(i10);
        } else {
            zzy(i10);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzp(zzrq zzrqVar) throws IOException {
        zzw(zzrqVar.zzn());
        zzrqVar.zzB(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzq(int i10, zzrq zzrqVar) throws IOException {
        zzw(11);
        zzv(2, i10);
        zzw(26);
        zzp(zzrqVar);
        zzw(12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzr(int i10, zzpm zzpmVar) throws IOException {
        zzw(11);
        zzv(2, i10);
        zzh(3, zzpmVar);
        zzw(12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzs(int i10, String str) throws IOException {
        zzw((i10 << 3) | 2);
        zzt(str);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzt(String str) throws IOException {
        int i10 = this.zzc;
        try {
            int iZzC = zzpv.zzC(str.length() * 3);
            int iZzC2 = zzpv.zzC(str.length());
            if (iZzC2 != iZzC) {
                zzw(zzsy.zzb(str));
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = zzsy.zza(str, bArr, i11, this.zzb - i11);
                return;
            }
            int i12 = i10 + iZzC2;
            this.zzc = i12;
            int iZza = zzsy.zza(str, this.zza, i12, this.zzb - i12);
            this.zzc = i10;
            zzw((iZza - i10) - iZzC2);
            this.zzc = iZza;
        } catch (zzsx e10) {
            this.zzc = i10;
            zzE(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzps(e11);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzu(int i10, int i11) throws IOException {
        zzw((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzv(int i10, int i11) throws IOException {
        zzw(i10 << 3);
        zzw(i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzw(int i10) throws IOException {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.zzc;
        while ((i10 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            try {
                i11 = i12 + 1;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                throw new zzps(i12, this.zzb, 1, indexOutOfBoundsException);
            }
            try {
                this.zza[i12] = (byte) (i10 | 128);
                i10 >>>= 7;
                i12 = i11;
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                i12 = i11;
                throw new zzps(i12, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.zza[i12] = (byte) i10;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzx(int i10, long j10) throws IOException {
        zzw(i10 << 3);
        zzy(j10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzy(long j10) throws IOException {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11;
        int i12 = this.zzc;
        if (!zzpv.zzb || this.zzb - i12 < 10) {
            int i13 = i12;
            while ((j10 & (-128)) != 0) {
                try {
                    i11 = i13 + 1;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                }
                try {
                    this.zza[i13] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                    i13 = i11;
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                    i13 = i11;
                    throw new zzps(i13, this.zzb, 1, indexOutOfBoundsException);
                }
            }
            i10 = i13 + 1;
            try {
                this.zza[i13] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i13 = i10;
                throw new zzps(i13, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                zzsw.zzn(this.zza, i12, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i12++;
            }
            i10 = i12 + 1;
            zzsw.zzn(this.zza, i12, (byte) j10);
        }
        this.zzc = i10;
    }
}
