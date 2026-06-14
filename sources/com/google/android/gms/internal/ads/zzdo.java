package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import androidx.exifinterface.media.ExifInterface;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"InlinedApi"})
public final class zzdo {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    public static String zza(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String zzb(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = {zzc[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(true != z10 ? 'L' : 'H'), Integer.valueOf(i13)};
        String str = zzfj.zza;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i14 = 6;
        while (i14 > 0) {
            int i15 = i14 - 1;
            if (iArr[i15] != 0) {
                break;
            }
            i14 = i15;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i16])));
        }
        return sb2.toString();
    }

    public static String zzc(byte[] bArr) {
        int length = bArr.length;
        zzgrc.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b10 = bArr[0];
        zzgrc.zzd(b10 == 1, "Invalid APV CSD version: %s", b10);
        Object[] objArr = {Integer.valueOf(bArr[5]), Integer.valueOf(bArr[6]), Integer.valueOf(bArr[7])};
        String str = zzfj.zza;
        return String.format(Locale.US, "apv1.apvf%d.apvl%d.apvb%d", objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f0, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f4, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0201, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x020e, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x021b, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0228, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0234, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0240, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x024c, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0258, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0264, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0270, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027d A[PHI: r20
  0x027d: PHI (r20v13 int) = 
  (r20v1 int)
  (r20v2 int)
  (r20v3 int)
  (r20v4 int)
  (r20v5 int)
  (r20v6 int)
  (r20v7 int)
  (r20v8 int)
  (r20v9 int)
  (r20v10 int)
  (r20v11 int)
  (r20v14 int)
 binds: [B:143:0x0278, B:140:0x026c, B:137:0x0260, B:134:0x0254, B:131:0x0248, B:128:0x023c, B:125:0x0230, B:122:0x0223, B:119:0x0216, B:116:0x0209, B:113:0x01fc, B:111:0x01f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0335  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zzd(com.google.android.gms.internal.ads.zzv r22) {
        /*
            Method dump skipped, instruction units count: 2356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdo.zzd(com.google.android.gms.internal.ads.zzv):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zze(java.lang.String r10, java.lang.String[] r11, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzi r12) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdo.zze(java.lang.String, java.lang.String[], com.google.android.gms.internal.ads.zzi):android.util.Pair");
    }

    public static byte[] zzf(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        return bArr2;
    }
}
