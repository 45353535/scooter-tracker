package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.amazon.device.ads.DtbConstants;
import com.google.android.material.internal.ViewUtils;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaet {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, ViewUtils.EDGE_TO_EDGE_FLAGS, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    public static zzv zzb(byte[] bArr, @Nullable String str, @Nullable String str2, int i10, String str3, @Nullable zzq zzqVar) {
        zzeq zzeqVarZzi = zzi(bArr);
        zzeqVarZzi.zzh(60);
        int i11 = zzb[zzeqVarZzi.zzj(6)];
        int i12 = zzc[zzeqVarZzi.zzj(4)];
        int iZzj = zzeqVarZzi.zzj(5);
        int i13 = iZzj >= 29 ? -1 : (zzd[iZzj] * 1000) / 2;
        zzeqVarZzi.zzh(10);
        int i14 = i11 + (zzeqVarZzi.zzj(2) > 0 ? 1 : 0);
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzl("video/mp2t");
        zztVar.zzm("audio/vnd.dts");
        zztVar.zzh(i13);
        zztVar.zzE(i14);
        zztVar.zzF(i12);
        zztVar.zzq(null);
        zztVar.zze(str2);
        zztVar.zzg(i10);
        return zztVar.zzM();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzc(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4e
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r3]
        L1f:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r1 = r1 | r2
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5c
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 8
            r7 = r7[r2]
        L35:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r0 = r0 | r1
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5c
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 9
            r7 = r7[r2]
            goto L35
        L4e:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r4]
            goto L1f
        L5c:
            if (r0 == 0) goto L62
            int r7 = r7 * 16
            int r7 = r7 / 14
        L62:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaet.zzc(byte[]):int");
    }

    public static zzaes zzd(byte[] bArr) throws zzat {
        int iZzj;
        int i10;
        long jZzt;
        int i11;
        zzeq zzeqVarZzi = zzi(bArr);
        zzeqVarZzi.zzh(40);
        int iZzj2 = zzeqVarZzi.zzj(2);
        boolean zZzi = zzeqVarZzi.zzi();
        int i12 = true != zZzi ? 16 : 20;
        zzeqVarZzi.zzh(true != zZzi ? 8 : 12);
        int iZzj3 = zzeqVarZzi.zzj(i12) + 1;
        boolean zZzi2 = zzeqVarZzi.zzi();
        int iZzj4 = -1;
        int i13 = 0;
        if (zZzi2) {
            iZzj = zzeqVarZzi.zzj(2);
            int iZzj5 = zzeqVarZzi.zzj(3) + 1;
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(36);
            }
            int iZzj6 = zzeqVarZzi.zzj(3) + 1;
            int iZzj7 = zzeqVarZzi.zzj(3) + 1;
            if (iZzj6 != 1 || iZzj7 != 1) {
                throw zzat.zzc("Multiple audio presentations or assets not supported");
            }
            int i14 = iZzj2 + 1;
            int iZzj8 = zzeqVarZzi.zzj(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                if (((iZzj8 >> i15) & 1) == 1) {
                    zzeqVarZzi.zzh(8);
                }
            }
            int i16 = iZzj5 * 512;
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(2);
                int iZzj9 = (zzeqVarZzi.zzj(2) + 1) << 2;
                int iZzj10 = zzeqVarZzi.zzj(2) + 1;
                while (i13 < iZzj10) {
                    zzeqVarZzi.zzh(iZzj9);
                    i13++;
                }
            }
            i13 = i16;
        } else {
            iZzj = -1;
        }
        zzeqVarZzi.zzh(i12);
        zzeqVarZzi.zzh(12);
        if (zZzi2) {
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(4);
            }
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(24);
            }
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzo(zzeqVarZzi.zzj(10) + 1);
            }
            zzeqVarZzi.zzh(5);
            i10 = zze[zzeqVarZzi.zzj(4)];
            iZzj4 = zzeqVarZzi.zzj(8) + 1;
        } else {
            i10 = -2147483647;
        }
        int i17 = i10;
        if (zZzi2) {
            if (iZzj == 0) {
                i11 = 32000;
            } else if (iZzj == 1) {
                i11 = 44100;
            } else {
                if (iZzj != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj).length() + 51);
                    sb2.append("Unsupported reference clock code in DTS HD header: ");
                    sb2.append(iZzj);
                    throw zzat.zzb(sb2.toString(), null);
                }
                i11 = 48000;
            }
            jZzt = zzfj.zzt(i13, 1000000L, i11, RoundingMode.DOWN);
        } else {
            jZzt = -9223372036854775807L;
        }
        return new zzaes("audio/vnd.dts.hd;profile=lbr", iZzj4, i17, iZzj3, jZzt, 0, null);
    }

    public static int zze(byte[] bArr) {
        zzeq zzeqVarZzi = zzi(bArr);
        zzeqVarZzi.zzh(42);
        return zzeqVarZzi.zzj(true != zzeqVarZzi.zzi() ? 8 : 12) + 1;
    }

    public static zzaes zzf(byte[] bArr, AtomicInteger atomicInteger) throws zzat {
        long jZzt;
        int iZzj;
        AtomicInteger atomicInteger2;
        int i10;
        int i11;
        zzeq zzeqVarZzi = zzi(bArr);
        int iZzj2 = zzeqVarZzi.zzj(32);
        int iZzh = zzh(zzeqVarZzi, zzf, true);
        int i12 = iZzh + 1;
        char c10 = iZzj2 == 1078008818 ? (char) 1 : (char) 0;
        if (c10 == 0) {
            jZzt = -9223372036854775807L;
            iZzj = -2147483647;
        } else {
            if (!zzeqVarZzi.zzi()) {
                throw zzat.zzc("Only supports full channel mask-based audio presentation");
            }
            int i13 = iZzh - 1;
            if (((bArr[iZzh] & 255) | ((char) (bArr[i13] << 8))) != zzfj.zzH(bArr, 0, i13, 65535)) {
                throw zzat.zzb("CRC check failed", null);
            }
            int iZzj3 = zzeqVarZzi.zzj(2);
            if (iZzj3 == 0) {
                i10 = 512;
            } else if (iZzj3 == 1) {
                i10 = DtbConstants.DEFAULT_PLAYER_HEIGHT;
            } else {
                if (iZzj3 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj3).length() + 51);
                    sb2.append("Unsupported base duration index in DTS UHD header: ");
                    sb2.append(iZzj3);
                    throw zzat.zzb(sb2.toString(), null);
                }
                i10 = 384;
            }
            int iZzj4 = zzeqVarZzi.zzj(3) + 1;
            int iZzj5 = zzeqVarZzi.zzj(2);
            if (iZzj5 == 0) {
                i11 = 32000;
            } else if (iZzj5 == 1) {
                i11 = 44100;
            } else {
                if (iZzj5 != 2) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj5).length() + 48);
                    sb3.append("Unsupported clock rate index in DTS UHD header: ");
                    sb3.append(iZzj5);
                    throw zzat.zzb(sb3.toString(), null);
                }
                i11 = 48000;
            }
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(36);
            }
            iZzj = (1 << zzeqVarZzi.zzj(2)) * i11;
            jZzt = zzfj.zzt(i10 * iZzj4, 1000000L, i11, RoundingMode.DOWN);
        }
        int i14 = iZzj;
        long j10 = jZzt;
        int iZzh2 = 0;
        for (char c11 = 0; c11 < c10; c11 = 1) {
            iZzh2 += zzh(zzeqVarZzi, zzg, true);
        }
        for (int i15 = 0; i15 <= 0; i15++) {
            if (c10 != 0) {
                atomicInteger2 = atomicInteger;
                atomicInteger2.set(zzh(zzeqVarZzi, zzh, true));
            } else {
                atomicInteger2 = atomicInteger;
            }
            iZzh2 += atomicInteger2.get() != 0 ? zzh(zzeqVarZzi, zzi, true) : 0;
        }
        return new zzaes("audio/vnd.dts.uhd;profile=p2", 2, i14, i12 + iZzh2, j10, 0, null);
    }

    public static int zzg(byte[] bArr) {
        zzeq zzeqVarZzi = zzi(bArr);
        zzeqVarZzi.zzh(32);
        return zzh(zzeqVarZzi, zzj, true) + 1;
    }

    private static int zzh(zzeq zzeqVar, int[] iArr, boolean z10) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && zzeqVar.zzi(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return i12 + zzeqVar.zzj(iArr[i10]);
    }

    private static zzeq zzi(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new zzeq(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b11 = bArrCopyOf[0];
        if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b12 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b12;
            }
        }
        int length = bArrCopyOf.length;
        zzeq zzeqVar = new zzeq(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            zzeq zzeqVar2 = new zzeq(bArrCopyOf, length);
            while (zzeqVar2.zzc() >= 16) {
                zzeqVar2.zzh(2);
                zzeqVar.zzp(zzeqVar2.zzj(14), 14);
            }
        }
        zzeqVar.zzb(bArrCopyOf, bArrCopyOf.length);
        return zzeqVar;
    }
}
