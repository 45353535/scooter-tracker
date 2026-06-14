package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
final class zziav extends zzias {
    private final OutputStream zzg;

    zziav(OutputStream outputStream, int i10) {
        super(i10);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzF(int i10) throws IOException {
        if (this.zzb - this.zzc < i10) {
            zzG();
        }
    }

    private final void zzG() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzH(int i10, int i11) throws IOException {
        zzs((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzI(int i10, int i11) throws IOException {
        zzF(20);
        zzd(i10 << 3);
        if (i11 >= 0) {
            zzd(i11);
        } else {
            zze(i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzJ(int i10, int i11) throws IOException {
        zzF(20);
        zzd(i10 << 3);
        zzd(i11);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzK(int i10, int i11) throws IOException {
        zzF(14);
        zzd((i10 << 3) | 5);
        zzf(i11);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzL(int i10, long j10) throws IOException {
        zzF(20);
        zzd(i10 << 3);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zziae
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzw(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzh(int i10, long j10) throws IOException {
        zzF(18);
        zzd((i10 << 3) | 1);
        zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzi(int i10, boolean z10) throws IOException {
        zzF(11);
        zzd(i10 << 3);
        zzc(z10 ? (byte) 1 : (byte) 0);
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
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b10);
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
        zzF(5);
        zzd(i10);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzt(int i10) throws IOException {
        zzF(4);
        zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzu(long j10) throws IOException {
        zzF(10);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzv(long j10) throws IOException {
        zzF(8);
        zzg(j10);
    }

    public final void zzw(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.zza, i13, i11);
            this.zzc += i11;
            this.zzd += i11;
            return;
        }
        byte[] bArr2 = this.zza;
        System.arraycopy(bArr, i10, bArr2, i13, i14);
        int i15 = i10 + i14;
        this.zzc = i12;
        this.zzd += i14;
        zzG();
        int i16 = i11 - i14;
        if (i16 <= i12) {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.zzc = i16;
        } else {
            this.zzg.write(bArr, i15, i16);
        }
        this.zzd += i16;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzx(String str) throws IOException {
        int iZzc;
        int length = str.length() * 3;
        int iZzA = zziaw.zzA(length);
        int i10 = iZzA + length;
        int i11 = this.zzb;
        if (i10 > i11) {
            byte[] bArr = new byte[length];
            int iZzd = zzier.zzd(str, bArr, 0, length);
            zzs(iZzd);
            zzw(bArr, 0, iZzd);
            return;
        }
        if (i10 > i11 - this.zzc) {
            zzG();
        }
        int iZzA2 = zziaw.zzA(str.length());
        int i12 = this.zzc;
        try {
            if (iZzA2 == iZzA) {
                int i13 = i12 + iZzA2;
                this.zzc = i13;
                int iZzd2 = zzier.zzd(str, this.zza, i13, i11 - i13);
                this.zzc = i12;
                iZzc = (iZzd2 - i12) - iZzA2;
                zzd(iZzc);
                this.zzc = iZzd2;
            } else {
                iZzc = zzier.zzc(str);
                zzd(iZzc);
                this.zzc = zzier.zzd(str, this.zza, this.zzc, iZzc);
            }
            this.zzd += iZzc;
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new zziau(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzy() throws IOException {
        if (this.zzc > 0) {
            zzG();
        }
    }
}
