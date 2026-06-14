package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
final class zzcs implements zzcr {
    final /* synthetic */ zzct zza;
    private final short[] zzb;
    private short[] zzc;
    private short[] zzd;
    private short[] zze;
    private int zzf;
    private int zzg;
    private int zzh;

    zzcs(zzct zzctVar) {
        Objects.requireNonNull(zzctVar);
        this.zza = zzctVar;
        this.zzb = new short[zzctVar.zzh()];
        this.zzc = new short[zzctVar.zzh() * zzctVar.zzg()];
        this.zzd = new short[zzctVar.zzh() * zzctVar.zzg()];
        this.zze = new short[zzctVar.zzh() * zzctVar.zzg()];
    }

    private final int zzs(short[] sArr, int i10, int i11, int i12) {
        int i13 = 1;
        int i14 = 255;
        int i15 = 0;
        int i16 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i17 = 0; i17 < i11; i17++) {
                int iZzg = this.zza.zzg() * i10;
                iAbs += Math.abs(sArr[iZzg + i17] - sArr[(iZzg + i11) + i17]);
            }
            int i18 = iAbs * i15;
            int i19 = i13 * i11;
            if (i18 < i19) {
                i13 = iAbs;
            }
            if (i18 < i19) {
                i15 = i11;
            }
            int i20 = iAbs * i14;
            int i21 = i16 * i11;
            if (i20 > i21) {
                i16 = iAbs;
            }
            if (i20 > i21) {
                i14 = i11;
            }
            i11++;
        }
        this.zzf = i13 / i15;
        this.zzg = i16 / i14;
        return i15;
    }

    private final short[] zzt(short[] sArr, int i10, int i11) {
        zzct zzctVar = this.zza;
        int length = sArr.length / zzctVar.zzg();
        return i10 + i11 <= length ? sArr : Arrays.copyOf(sArr, (((length * 3) / 2) + i11) * zzctVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzb(int i10, long j10, long j11) {
        int i11 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i11 >= zzctVar.zzg()) {
                return;
            }
            short[] sArr = this.zzd;
            int iZzg = zzctVar.zzg();
            int iZzj = zzctVar.zzj();
            short[] sArr2 = this.zze;
            int iZzg2 = (zzctVar.zzg() * i10) + i11;
            short s10 = sArr2[iZzg2];
            short s11 = sArr2[iZzg2 + zzctVar.zzg()];
            long jZzm = ((long) zzctVar.zzm()) * j10;
            long jZzl = ((long) zzctVar.zzl()) * j11;
            long jZzl2 = ((long) (zzctVar.zzl() + 1)) * j11;
            int i12 = i11;
            long j12 = jZzl2 - jZzl;
            long j13 = jZzl2 - jZzm;
            sArr[(iZzj * iZzg) + i12] = (short) (((j13 * ((long) s10)) + ((j12 - j13) * ((long) s11))) / j12);
            i11 = i12 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final boolean zzc() {
        int i10 = this.zzf;
        return i10 != 0 && this.zza.zzn() != 0 && this.zzg <= i10 * 3 && i10 + i10 > this.zzh * 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzd(int i10, int i11) {
        int iZzg;
        short[] sArr = this.zzc;
        int i12 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i12 >= zzctVar.zzh() / i11) {
                return;
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                iZzg = zzctVar.zzg() * i11;
                if (i13 < iZzg) {
                    i14 += sArr[(zzctVar.zzg() * i10) + (iZzg * i12) + i13];
                    i13++;
                }
            }
            this.zzb[i12] = (short) (i14 / iZzg);
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zze(int i10, int i11, int i12) {
        return zzs(this.zzb, 0, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zzf(int i10, int i11, int i12) {
        return zzs(this.zzc, i10, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzg() {
        this.zzh = 0;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzh(int i10, int i11, int i12, int i13, int i14) {
        short[] sArr = this.zzd;
        short[] sArr2 = this.zzc;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i12 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i18] = (short) (((sArr2[i16] * (i10 - i19)) + (sArr2[i17] * i19)) / i10);
                i18 += i11;
                i16 += i11;
                i17 += i11;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzi() {
        this.zzh = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzj(int i10) {
        this.zzc = zzt(this.zzc, this.zza.zzi(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzk(int i10) {
        this.zzd = zzt(this.zzd, this.zza.zzj(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzl(int i10) {
        this.zze = zzt(this.zze, this.zza.zzk(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzm(int i10, int i11) {
        for (int i12 = 0; i12 < this.zza.zzg() * i11; i12++) {
            this.zzc[i10 + i12] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzn(ByteBuffer byteBuffer, int i10) {
        zzct zzctVar = this.zza;
        byteBuffer.asShortBuffer().get(this.zzc, zzctVar.zzi() * zzctVar.zzg(), i10 / 2);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzo(ByteBuffer byteBuffer, int i10) {
        zzct zzctVar = this.zza;
        byteBuffer.asShortBuffer().put(this.zzd, 0, zzctVar.zzg() * i10);
        byteBuffer.position(byteBuffer.position() + ((i10 + i10) * zzctVar.zzg()));
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final /* synthetic */ Object zzp() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final /* synthetic */ Object zzq() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final /* synthetic */ Object zzr() {
        return this.zzc;
    }
}
