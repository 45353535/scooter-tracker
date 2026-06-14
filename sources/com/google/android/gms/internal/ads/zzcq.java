package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
final class zzcq implements zzcr {
    final /* synthetic */ zzct zza;
    private final float[] zzb;
    private float[] zzc;
    private float[] zzd;
    private float[] zze;
    private double zzf;
    private double zzg;
    private double zzh;

    zzcq(zzct zzctVar) {
        Objects.requireNonNull(zzctVar);
        this.zza = zzctVar;
        this.zzb = new float[zzctVar.zzh()];
        this.zzc = new float[zzctVar.zzh() * zzctVar.zzg()];
        this.zzd = new float[zzctVar.zzh() * zzctVar.zzg()];
        this.zze = new float[zzctVar.zzh() * zzctVar.zzg()];
    }

    private final int zzs(float[] fArr, int i10, int i11, int i12) {
        int i13 = 255;
        int i14 = 0;
        double d10 = 0.0d;
        double d11 = 1.0d;
        int i15 = i11;
        while (true) {
            double d12 = i13;
            double d13 = i14;
            if (i15 > i12) {
                this.zzf = d11 / d13;
                this.zzg = d10 / d12;
                return i14;
            }
            int i16 = 0;
            double dAbs = 0.0d;
            while (i16 < i15) {
                int iZzg = this.zza.zzg() * i10;
                dAbs += (double) Math.abs(fArr[iZzg + i16] - fArr[(iZzg + i15) + i16]);
                i16++;
                i13 = i13;
            }
            int i17 = i13;
            double d14 = d13 * dAbs;
            double d15 = i15;
            double d16 = d11 * d15;
            if (d14 < d16) {
                d11 = dAbs;
            }
            if (d14 < d16) {
                i14 = i15;
            }
            double d17 = d12 * dAbs;
            double d18 = d15 * d10;
            if (d17 > d18) {
                d10 = dAbs;
            }
            i13 = d17 > d18 ? i15 : i17;
            i15++;
        }
    }

    private final float[] zzt(float[] fArr, int i10, int i11) {
        zzct zzctVar = this.zza;
        int length = fArr.length / zzctVar.zzg();
        return i10 + i11 <= length ? fArr : Arrays.copyOf(fArr, (((length * 3) / 2) + i11) * zzctVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzb(int i10, long j10, long j11) {
        int i11 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i11 >= zzctVar.zzg()) {
                return;
            }
            float[] fArr = this.zzd;
            int iZzg = zzctVar.zzg();
            int iZzj = zzctVar.zzj();
            float[] fArr2 = this.zze;
            int iZzg2 = (zzctVar.zzg() * i10) + i11;
            float f10 = fArr2[iZzg2];
            float f11 = fArr2[iZzg2 + zzctVar.zzg()];
            long jZzm = ((long) zzctVar.zzm()) * j10;
            long jZzl = ((long) zzctVar.zzl()) * j11;
            long jZzl2 = ((long) (zzctVar.zzl() + 1)) * j11;
            long j12 = jZzl2 - jZzm;
            fArr[(iZzj * iZzg) + i11] = ((j12 * f10) + ((r12 - j12) * f11)) / (jZzl2 - jZzl);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final boolean zzc() {
        double d10 = this.zzf;
        return d10 != 0.0d && this.zza.zzn() != 0 && this.zzg <= d10 * 3.0d && d10 + d10 > this.zzh * 3.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzd(int i10, int i11) {
        int iZzg;
        int i12 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i12 >= zzctVar.zzh() / i11) {
                return;
            }
            double d10 = 0.0d;
            int i13 = 0;
            while (true) {
                iZzg = zzctVar.zzg() * i11;
                if (i13 < iZzg) {
                    d10 += (double) this.zzc[(zzctVar.zzg() * i10) + (iZzg * i12) + i13];
                    i13++;
                }
            }
            this.zzb[i12] = (float) (d10 / ((double) iZzg));
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
        this.zzh = 0.0d;
        this.zzf = 0.0d;
        this.zzg = 0.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzh(int i10, int i11, int i12, int i13, int i14) {
        float[] fArr = this.zzd;
        float[] fArr2 = this.zzc;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i12 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                fArr[i18] = ((fArr2[i16] * (i10 - i19)) + (fArr2[i17] * i19)) / i10;
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
            this.zzc[i10 + i12] = 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzn(ByteBuffer byteBuffer, int i10) {
        zzct zzctVar = this.zza;
        byteBuffer.asFloatBuffer().get(this.zzc, zzctVar.zzi() * zzctVar.zzg(), i10 / 4);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzo(ByteBuffer byteBuffer, int i10) {
        zzct zzctVar = this.zza;
        byteBuffer.asFloatBuffer().put(this.zzd, 0, zzctVar.zzg() * i10);
        byteBuffer.position(byteBuffer.position() + (i10 * 4 * zzctVar.zzg()));
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
