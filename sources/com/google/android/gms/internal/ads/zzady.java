package com.google.android.gms.internal.ads;

import com.amazon.device.ads.DtbConstants;
import com.google.common.primitives.SignedBytes;

/* JADX INFO: loaded from: classes8.dex */
public final class zzady {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, DtbConstants.DEFAULT_PLAYER_HEIGHT, 400, 400, 2048};

    /* JADX WARN: Removed duplicated region for block: B:143:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a6 A[PHI: r2 r5 r11
  0x02a6: PHI (r2v2 int) = (r2v1 int), (r2v11 int) binds: [B:172:0x02a8, B:165:0x027e] A[DONT_GENERATE, DONT_INLINE]
  0x02a6: PHI (r5v2 int) = (r5v1 int), (r5v35 int) binds: [B:172:0x02a8, B:165:0x027e] A[DONT_GENERATE, DONT_INLINE]
  0x02a6: PHI (r11v3 int) = (r11v2 int), (r11v35 int) binds: [B:172:0x02a8, B:165:0x027e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzv zza(com.google.android.gms.internal.ads.zzer r22, java.lang.String r23, @androidx.annotation.Nullable java.lang.String r24, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzq r25) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzady.zza(com.google.android.gms.internal.ads.zzer, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzq):com.google.android.gms.internal.ads.zzv");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzadx zzb(com.google.android.gms.internal.ads.zzeq r11) {
        /*
            r0 = 16
            int r1 = r11.zzj(r0)
            int r0 = r11.zzj(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.zzj(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.zzj(r0)
            r2 = 0
            r4 = 3
            if (r1 != r4) goto L38
            r1 = r2
        L2c:
            int r5 = r11.zzj(r0)
            int r1 = r1 + r5
            boolean r5 = r11.zzi()
            if (r5 != 0) goto L3a
            int r1 = r1 + r4
        L38:
            r5 = r1
            goto L3e
        L3a:
            int r1 = r1 + 1
            int r1 = r1 << r0
            goto L2c
        L3e:
            r1 = 10
            int r1 = r11.zzj(r1)
            boolean r6 = r11.zzi()
            if (r6 == 0) goto L53
            int r6 = r11.zzj(r4)
            if (r6 <= 0) goto L53
            r11.zzh(r0)
        L53:
            boolean r6 = r11.zzi()
            r7 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            r10 = 1
            if (r10 == r6) goto L63
            r6 = r7
            r7 = r9
            goto L64
        L63:
            r6 = r7
        L64:
            int r11 = r11.zzj(r3)
            if (r7 != r9) goto L74
            r9 = 13
            if (r11 != r9) goto L74
            int[] r11 = com.google.android.gms.internal.ads.zzady.zzb
            r2 = r11[r9]
        L72:
            r9 = r2
            goto La0
        L74:
            if (r7 != r6) goto L72
            r6 = 14
            if (r11 >= r6) goto L72
            int[] r2 = com.google.android.gms.internal.ads.zzady.zzb
            r2 = r2[r11]
            int r1 = r1 % 5
            r6 = 8
            if (r1 == r10) goto L9b
            r9 = 11
            if (r1 == r0) goto L96
            if (r1 == r4) goto L9b
            if (r1 == r3) goto L8d
            goto L72
        L8d:
            if (r11 == r4) goto L93
            if (r11 == r6) goto L93
            if (r11 != r9) goto L72
        L93:
            int r2 = r2 + 1
            goto L72
        L96:
            if (r11 == r6) goto L93
            if (r11 != r9) goto L72
            goto L93
        L9b:
            if (r11 == r4) goto L93
            if (r11 != r6) goto L72
            goto L93
        La0:
            com.google.android.gms.internal.ads.zzadx r4 = new com.google.android.gms.internal.ads.zzadx
            r6 = 2
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzady.zzb(com.google.android.gms.internal.ads.zzeq):com.google.android.gms.internal.ads.zzadx");
    }

    public static void zzc(int i10, zzer zzerVar) {
        zzerVar.zza(7);
        byte[] bArrZzi = zzerVar.zzi();
        bArrZzi[0] = -84;
        bArrZzi[1] = SignedBytes.MAX_POWER_OF_TWO;
        bArrZzi[2] = -1;
        bArrZzi[3] = -1;
        bArrZzi[4] = (byte) ((i10 >> 16) & 255);
        bArrZzi[5] = (byte) ((i10 >> 8) & 255);
        bArrZzi[6] = (byte) (i10 & 255);
    }

    private static void zzd(zzeq zzeqVar, zzadw zzadwVar) throws zzat {
        int iZzj = zzeqVar.zzj(5);
        zzeqVar.zzh(2);
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(5);
        }
        if (iZzj >= 7 && iZzj <= 10) {
            zzeqVar.zzg();
        }
        if (zzeqVar.zzi()) {
            int iZzj2 = zzeqVar.zzj(3);
            if (zzadwVar.zzb == -1 && iZzj >= 0 && iZzj <= 15 && (iZzj2 == 0 || iZzj2 == 1)) {
                zzadwVar.zzb = iZzj;
            }
            if (zzeqVar.zzi()) {
                zzf(zzeqVar);
            }
        }
    }

    private static void zze(zzeq zzeqVar, zzadw zzadwVar) throws zzat {
        zzeqVar.zzh(2);
        boolean zZzi = zzeqVar.zzi();
        int iZzj = zzeqVar.zzj(8);
        for (int i10 = 0; i10 < iZzj; i10++) {
            zzeqVar.zzh(2);
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(5);
            }
            if (zZzi) {
                zzeqVar.zzh(24);
            } else {
                if (zzeqVar.zzi()) {
                    if (!zzeqVar.zzi()) {
                        zzeqVar.zzh(4);
                    }
                    zzadwVar.zzc = zzeqVar.zzj(6) + 1;
                }
                zzeqVar.zzh(4);
            }
        }
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(3);
            if (zzeqVar.zzi()) {
                zzf(zzeqVar);
            }
        }
    }

    private static void zzf(zzeq zzeqVar) throws zzat {
        int iZzj = zzeqVar.zzj(6);
        if (iZzj < 2 || iZzj > 42) {
            throw zzat.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iZzj)));
        }
        zzeqVar.zzh(iZzj * 8);
    }

    private static boolean zzg(zzeq zzeqVar) {
        if (zzeqVar.zzc() < 66) {
            return false;
        }
        zzeqVar.zzh(66);
        return true;
    }
}
