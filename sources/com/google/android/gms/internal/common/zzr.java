package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes8.dex */
public final class zzr {
    public static void zza(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static int zzb(int i10, int i11, String str) {
        String strZza;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strZza = zzx.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15);
                sb2.append("negative size: ");
                sb2.append(i11);
                throw new IllegalArgumentException(sb2.toString());
            }
            strZza = zzx.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzc(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zze(i10, i11, FirebaseAnalytics.Param.INDEX));
        }
        return i10;
    }

    public static void zzd(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? zze(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? zze(i11, i12, "end index") : zzx.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    private static String zze(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzx.zza("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzx.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }
}
