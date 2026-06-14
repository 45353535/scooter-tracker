package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
final class zzpt extends zzpq {
    private final OutputStream zzg;

    zzpt(OutputStream outputStream, int i10) {
        super(i10);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzG() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzH(int i10) throws IOException {
        if (this.zzb - this.zzc < i10) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzI() throws IOException {
        if (this.zzc > 0) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzJ(byte b10) throws IOException {
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzK(int i10, boolean z10) throws IOException {
        zzH(11);
        zzf(i10 << 3);
        zzc(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzL(byte[] bArr, int i10, int i11) throws IOException {
        zzw(i11);
        zzz(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv, com.google.android.gms.internal.consent_sdk.zzpe
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzz(bArr, 0, i11);
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
        zzH(14);
        zzf((i10 << 3) | 5);
        zzd(i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzk(int i10) throws IOException {
        zzH(4);
        zzd(i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzl(int i10, long j10) throws IOException {
        zzH(18);
        zzf((i10 << 3) | 1);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzm(long j10) throws IOException {
        zzH(8);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzn(int i10, int i11) throws IOException {
        zzH(20);
        zzf(i10 << 3);
        if (i11 >= 0) {
            zzf(i11);
        } else {
            zzg(i11);
        }
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
        int iZzb;
        try {
            int length = str.length() * 3;
            int iZzC = zzpv.zzC(length);
            int i10 = iZzC + length;
            int i11 = this.zzb;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iZza = zzsy.zza(str, bArr, 0, length);
                zzw(iZza);
                zzz(bArr, 0, iZza);
                return;
            }
            if (i10 > i11 - this.zzc) {
                zzG();
            }
            int iZzC2 = zzpv.zzC(str.length());
            int i12 = this.zzc;
            try {
                if (iZzC2 == iZzC) {
                    int i13 = i12 + iZzC2;
                    this.zzc = i13;
                    int iZza2 = zzsy.zza(str, this.zza, i13, i11 - i13);
                    this.zzc = i12;
                    iZzb = (iZza2 - i12) - iZzC2;
                    zzf(iZzb);
                    this.zzc = iZza2;
                } else {
                    iZzb = zzsy.zzb(str);
                    zzf(iZzb);
                    this.zzc = zzsy.zza(str, this.zza, this.zzc, iZzb);
                }
                this.zzd += iZzb;
            } catch (zzsx e10) {
                this.zzd -= this.zzc - i12;
                this.zzc = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new zzps(e11);
            }
        } catch (zzsx e12) {
            zzE(str, e12);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzu(int i10, int i11) throws IOException {
        zzw((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzv(int i10, int i11) throws IOException {
        zzH(20);
        zzf(i10 << 3);
        zzf(i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzw(int i10) throws IOException {
        zzH(5);
        zzf(i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzx(int i10, long j10) throws IOException {
        zzH(20);
        zzf(i10 << 3);
        zzg(j10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzy(long j10) throws IOException {
        zzH(10);
        zzg(j10);
    }

    public final void zzz(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, 0, this.zza, i13, i11);
            this.zzc += i11;
            this.zzd += i11;
            return;
        }
        byte[] bArr2 = this.zza;
        System.arraycopy(bArr, 0, bArr2, i13, i14);
        this.zzc = i12;
        this.zzd += i14;
        zzG();
        int i15 = i11 - i14;
        if (i15 <= i12) {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.zzc = i15;
        } else {
            this.zzg.write(bArr, i14, i15);
        }
        this.zzd += i15;
    }
}
