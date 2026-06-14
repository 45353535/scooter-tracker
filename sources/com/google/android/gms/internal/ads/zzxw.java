package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
final class zzxw {
    private final zzaan zza;
    private final zzer zzb = new zzer(32);
    private zzxv zzc;
    private zzxv zzd;
    private zzxv zze;
    private long zzf;

    public zzxw(zzaan zzaanVar) {
        this.zza = zzaanVar;
        zzxv zzxvVar = new zzxv(0L, 65536);
        this.zzc = zzxvVar;
        this.zzd = zzxvVar;
        this.zze = zzxvVar;
    }

    private final int zzi(int i10) {
        zzxv zzxvVar = this.zze;
        if (zzxvVar.zzc == null) {
            zzaal zzaalVarZza = this.zza.zza();
            zzxv zzxvVar2 = new zzxv(this.zze.zzb, 65536);
            zzxvVar.zzc = zzaalVarZza;
            zzxvVar.zzd = zzxvVar2;
        }
        return Math.min(i10, (int) (this.zze.zzb - this.zzf));
    }

    private final void zzj(int i10) {
        long j10 = this.zzf + ((long) i10);
        this.zzf = j10;
        zzxv zzxvVar = this.zze;
        if (j10 == zzxvVar.zzb) {
            this.zze = zzxvVar.zzd;
        }
    }

    private static zzxv zzk(zzxv zzxvVar, zzih zzihVar, zzxx zzxxVar, zzer zzerVar) {
        zzxv zzxvVarZzm;
        int iZzt;
        if (zzihVar.zzk()) {
            long j10 = zzxxVar.zzb;
            zzerVar.zza(1);
            zzxv zzxvVarZzm2 = zzm(zzxvVar, j10, zzerVar.zzi(), 1);
            long j11 = j10 + 1;
            byte b10 = zzerVar.zzi()[0];
            int i10 = b10 & UnsignedBytes.MAX_POWER_OF_TWO;
            int i11 = b10 & Ascii.DEL;
            zzie zzieVar = zzihVar.zzb;
            byte[] bArr = zzieVar.zza;
            if (bArr == null) {
                zzieVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z10 = i10 != 0;
            zzxvVarZzm = zzm(zzxvVarZzm2, j11, zzieVar.zza, i11);
            long j12 = j11 + ((long) i11);
            if (z10) {
                zzerVar.zza(2);
                zzxvVarZzm = zzm(zzxvVarZzm, j12, zzerVar.zzi(), 2);
                j12 += 2;
                iZzt = zzerVar.zzt();
            } else {
                iZzt = 1;
            }
            int[] iArr = zzieVar.zzd;
            if (iArr == null || iArr.length < iZzt) {
                iArr = new int[iZzt];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzieVar.zze;
            if (iArr3 == null || iArr3.length < iZzt) {
                iArr3 = new int[iZzt];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i12 = iZzt * 6;
                zzerVar.zza(i12);
                zzxvVarZzm = zzm(zzxvVarZzm, j12, zzerVar.zzi(), i12);
                j12 += (long) i12;
                zzerVar.zzh(0);
                for (int i13 = 0; i13 < iZzt; i13++) {
                    iArr2[i13] = zzerVar.zzt();
                    iArr4[i13] = zzerVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzxxVar.zza - ((int) (j12 - zzxxVar.zzb));
            }
            zzagg zzaggVar = zzxxVar.zzc;
            String str = zzfj.zza;
            zzieVar.zza(iZzt, iArr2, iArr4, zzaggVar.zzb, zzieVar.zza, zzaggVar.zza, zzaggVar.zzc, zzaggVar.zzd);
            long j13 = zzxxVar.zzb;
            int i14 = (int) (j12 - j13);
            zzxxVar.zzb = j13 + ((long) i14);
            zzxxVar.zza -= i14;
        } else {
            zzxvVarZzm = zzxvVar;
        }
        if (!zzihVar.zze()) {
            zzihVar.zzj(zzxxVar.zza);
            return zzl(zzxvVarZzm, zzxxVar.zzb, zzihVar.zzc, zzxxVar.zza);
        }
        zzerVar.zza(4);
        zzxv zzxvVarZzm3 = zzm(zzxvVarZzm, zzxxVar.zzb, zzerVar.zzi(), 4);
        int iZzH = zzerVar.zzH();
        zzxxVar.zzb += 4;
        zzxxVar.zza -= 4;
        zzihVar.zzj(iZzH);
        zzxv zzxvVarZzl = zzl(zzxvVarZzm3, zzxxVar.zzb, zzihVar.zzc, iZzH);
        zzxxVar.zzb += (long) iZzH;
        int i15 = zzxxVar.zza - iZzH;
        zzxxVar.zza = i15;
        ByteBuffer byteBuffer = zzihVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i15) {
            zzihVar.zzf = ByteBuffer.allocate(i15);
        } else {
            zzihVar.zzf.clear();
        }
        return zzl(zzxvVarZzl, zzxxVar.zzb, zzihVar.zzf, zzxxVar.zza);
    }

    private static zzxv zzl(zzxv zzxvVar, long j10, ByteBuffer byteBuffer, int i10) {
        zzxv zzxvVarZzn = zzn(zzxvVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (zzxvVarZzn.zzb - j10));
            byteBuffer.put(zzxvVarZzn.zzc.zza, zzxvVarZzn.zzb(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == zzxvVarZzn.zzb) {
                zzxvVarZzn = zzxvVarZzn.zzd;
            }
        }
        return zzxvVarZzn;
    }

    private static zzxv zzm(zzxv zzxvVar, long j10, byte[] bArr, int i10) {
        zzxv zzxvVarZzn = zzn(zzxvVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (zzxvVarZzn.zzb - j10));
            System.arraycopy(zzxvVarZzn.zzc.zza, zzxvVarZzn.zzb(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == zzxvVarZzn.zzb) {
                zzxvVarZzn = zzxvVarZzn.zzd;
            }
        }
        return zzxvVarZzn;
    }

    private static zzxv zzn(zzxv zzxvVar, long j10) {
        while (j10 >= zzxvVar.zzb) {
            zzxvVar = zzxvVar.zzd;
        }
        return zzxvVar;
    }

    public final void zza() {
        zzxv zzxvVar = this.zzc;
        if (zzxvVar.zzc != null) {
            this.zza.zzc(zzxvVar);
            zzxvVar.zzc();
        }
        this.zzc.zza(0L, 65536);
        zzxv zzxvVar2 = this.zzc;
        this.zzd = zzxvVar2;
        this.zze = zzxvVar2;
        this.zzf = 0L;
        this.zza.zzd();
    }

    public final void zzb() {
        this.zzd = this.zzc;
    }

    public final void zzc(zzih zzihVar, zzxx zzxxVar) {
        this.zzd = zzk(this.zzd, zzihVar, zzxxVar, this.zzb);
    }

    public final void zzd(zzih zzihVar, zzxx zzxxVar) {
        zzk(this.zzd, zzihVar, zzxxVar, this.zzb);
    }

    public final void zze(long j10) {
        zzxv zzxvVar;
        if (j10 != -1) {
            while (true) {
                zzxvVar = this.zzc;
                if (j10 < zzxvVar.zzb) {
                    break;
                }
                this.zza.zzb(zzxvVar.zzc);
                this.zzc = this.zzc.zzc();
            }
            if (this.zzd.zza < zzxvVar.zza) {
                this.zzd = zzxvVar;
            }
        }
    }

    public final long zzf() {
        return this.zzf;
    }

    public final int zzg(zzj zzjVar, int i10, boolean z10) throws IOException {
        int iZzi = zzi(i10);
        zzxv zzxvVar = this.zze;
        int iZza = zzjVar.zza(zzxvVar.zzc.zza, zzxvVar.zzb(this.zzf), iZzi);
        if (iZza != -1) {
            zzj(iZza);
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzer zzerVar, int i10) {
        while (i10 > 0) {
            int iZzi = zzi(i10);
            zzxv zzxvVar = this.zze;
            zzerVar.zzm(zzxvVar.zzc.zza, zzxvVar.zzb(this.zzf), iZzi);
            i10 -= iZzi;
            zzj(iZzi);
        }
    }
}
