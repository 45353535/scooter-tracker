package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgm {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i10) {
        int i11;
        synchronized (zzc) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    try {
                        if (i12 >= i10 - 2) {
                            i12 = i10;
                            break;
                        }
                        int i14 = i12 + 1;
                        if (bArr[i12] == 0 && bArr[i14] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12 = i14;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i13) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = zzd[i17] - i15;
                System.arraycopy(bArr, i15, bArr, i16, i18);
                int i19 = i16 + i18;
                int i20 = i19 + 1;
                bArr[i19] = 0;
                i16 = i19 + 2;
                bArr[i20] = 0;
                i15 += i18 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i16, i11 - i16);
        }
        return i11;
    }

    public static boolean zzb(zzv zzvVar, byte b10) {
        String strZzq = zzq(zzvVar);
        if (Objects.equals(strZzq, "video/avc") && (b10 & Ascii.US) == 6) {
            return true;
        }
        return Objects.equals(strZzq, "video/hevc") && ((b10 & 126) >> 1) == 39;
    }

    public static int zzc(zzv zzvVar) {
        String strZzq = zzq(zzvVar);
        if (Objects.equals(strZzq, "video/avc")) {
            return 1;
        }
        return Objects.equals(strZzq, "video/hevc") ? 2 : 0;
    }

    public static boolean zzd(byte[] bArr, int i10, int i11, zzv zzvVar) {
        String str = zzvVar.zzo;
        if (Objects.equals(str, "video/avc")) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) != 0) {
                return true;
            }
            int i12 = b10 & Ascii.US;
            return (i12 == 1 || i12 == 9 || i12 == 14) ? false : true;
        }
        if (Objects.equals(str, "video/hevc")) {
            zzga zzgaVarZzl = zzl(new zzgn(bArr, 4, i11 + 4));
            int i13 = zzgaVarZzl.zza;
            if (i13 == 35) {
                return false;
            }
            return (i13 <= 14 && i13 % 2 == 0 && zzgaVarZzl.zzc == zzvVar.zzF + (-1)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c A[PHI: r2
  0x016c: PHI (r2v6 int) = (r2v4 int), (r2v3 int) binds: [B:87:0x0171, B:83:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016f A[PHI: r2
  0x016f: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v7 int) binds: [B:74:0x0156, B:76:0x015a, B:78:0x015e, B:80:0x0162, B:82:0x0166, B:84:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzgl zze(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgm.zze(byte[], int, int):com.google.android.gms.internal.ads.zzgl");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x05f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzgj zzf(byte[] r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 2155
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgm.zzf(byte[], int, int):com.google.android.gms.internal.ads.zzgj");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzgg zzg(byte[] r36, int r37, int r38, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzgj r39) {
        /*
            Method dump skipped, instruction units count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgm.zzg(byte[], int, int, com.google.android.gms.internal.ads.zzgj):com.google.android.gms.internal.ads.zzgg");
    }

    public static zzgk zzh(byte[] bArr, int i10, int i11) {
        zzgn zzgnVar = new zzgn(bArr, 4, i11);
        int iZzg = zzgnVar.zzg();
        int iZzg2 = zzgnVar.zzg();
        zzgnVar.zza();
        return new zzgk(iZzg, iZzg2, zzgnVar.zze());
    }

    public static int zzi(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        zzgrc.zzi(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            zzj(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            zzj(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            zzj(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    zzj(zArr);
                    return i15;
                }
                i14 = i15;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static void zzj(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    @Nullable
    public static String zzk(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = (byte[]) list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i11 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                int i12 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i12 >= length2) {
                        break;
                    }
                    int iZzi = zzi(bArr, i12, length2, zArr);
                    if (iZzi != length2) {
                        zzgucVar.zzf(Integer.valueOf(iZzi));
                    }
                    i12 = iZzi + 3;
                }
                zzguf zzgufVarZzi = zzgucVar.zzi();
                for (int i13 = 0; i13 < zzgufVarZzi.size(); i13++) {
                    if (((Integer) zzgufVarZzi.get(i13)).intValue() + 3 < length) {
                        zzgn zzgnVar = new zzgn(bArr, ((Integer) zzgufVarZzi.get(i13)).intValue() + 3, length);
                        zzga zzgaVarZzl = zzl(zzgnVar);
                        if (zzgaVarZzl.zza == 33 && zzgaVarZzl.zzb == 0) {
                            zzgnVar.zzb(4);
                            int iZzf = zzgnVar.zzf(3);
                            zzgnVar.zza();
                            zzgb zzgbVarZzm = zzm(zzgnVar, true, iZzf, null);
                            return zzdo.zzb(zzgbVarZzm.zza, zzgbVarZzm.zzb, zzgbVarZzm.zzc, zzgbVarZzm.zzd, zzgbVarZzm.zze, zzgbVarZzm.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static zzga zzl(zzgn zzgnVar) {
        zzgnVar.zza();
        return new zzga(zzgnVar.zzf(6), zzgnVar.zzf(6), zzgnVar.zzf(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzgb zzm(com.google.android.gms.internal.ads.zzgn r18, boolean r19, int r20, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzgb r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L41
            r2 = 2
            int r2 = r0.zzf(r2)
            boolean r7 = r0.zze()
            r8 = 5
            int r8 = r0.zzf(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r0.zze()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.zzf(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
        L3b:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L41:
            if (r2 == 0) goto L4f
            int r3 = r2.zza
            boolean r7 = r2.zzb
            int r8 = r2.zzc
            int r10 = r2.zzd
            int[] r4 = r2.zze
            r12 = r3
            goto L3b
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.zzf(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r0.zze()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r0.zze()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.zzb(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.zzb(r5)
        L79:
            com.google.android.gms.internal.ads.zzgb r11 = new com.google.android.gms.internal.ads.zzgb
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgm.zzm(com.google.android.gms.internal.ads.zzgn, boolean, int, com.google.android.gms.internal.ads.zzgb):com.google.android.gms.internal.ads.zzgb");
    }

    private static int zzn(int i10, int i11, int i12, int i13) {
        int i14 = 2;
        if (i11 != 1 && i11 != 2) {
            i14 = 1;
        }
        return i10 - (i14 * (i12 + i13));
    }

    private static int zzo(int i10, int i11, int i12, int i13) {
        return i10 - ((i11 == 1 ? 2 : 1) * (i12 + i13));
    }

    private static void zzp(zzgn zzgnVar) {
        int iZzg = zzgnVar.zzg() + 1;
        zzgnVar.zzb(8);
        for (int i10 = 0; i10 < iZzg; i10++) {
            zzgnVar.zzg();
            zzgnVar.zzg();
            zzgnVar.zza();
        }
        zzgnVar.zzb(20);
    }

    @Nullable
    private static String zzq(zzv zzvVar) {
        String str;
        String str2 = zzvVar.zzo;
        if (Objects.equals(str2, "video/dolby-vision") && (str = zzvVar.zzk) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return "video/avc";
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return str2;
    }
}
