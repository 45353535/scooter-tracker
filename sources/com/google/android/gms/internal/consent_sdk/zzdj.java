package com.google.android.gms.internal.consent_sdk;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdj {
    public static int zza(int i10, int i11, String str) {
        String strZza;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strZza = zzdp.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException("negative size: " + i11);
            }
            strZza = zzdp.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzd(i10, i11, FirebaseAnalytics.Param.INDEX));
        }
        return i10;
    }

    public static void zzc(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? zzd(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? zzd(i11, i12, "end index") : zzdp.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    private static String zzd(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzdp.zza("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzdp.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }
}
