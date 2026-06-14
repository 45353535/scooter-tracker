package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzgrr;

/* JADX INFO: loaded from: classes7.dex */
public class zzo {
    protected static final zzgrr zzb = zzgrr.zzc(4000);

    public static void zzd(String str) {
        if (zzm(3)) {
            if (str.length() <= 4000) {
                Log.d("Ads", str);
                return;
            }
            boolean z10 = true;
            for (String str2 : zzb.zzd(str)) {
                if (z10) {
                    Log.d("Ads", str2);
                } else {
                    Log.d("Ads-cont", str2);
                }
                z10 = false;
            }
        }
    }

    public static void zze(String str, Throwable th2) {
        if (zzm(3)) {
            Log.d("Ads", str, th2);
        }
    }

    public static void zzf(String str) {
        if (zzm(6)) {
            if (str == null || str.length() <= 4000) {
                Log.e("Ads", str);
                return;
            }
            boolean z10 = true;
            for (String str2 : zzb.zzd(str)) {
                if (z10) {
                    Log.e("Ads", str2);
                } else {
                    Log.e("Ads-cont", str2);
                }
                z10 = false;
            }
        }
    }

    public static void zzg(String str, Throwable th2) {
        if (zzm(6)) {
            Log.e("Ads", str, th2);
        }
    }

    public static void zzh(String str) {
        if (zzm(4)) {
            if (str == null || str.length() <= 4000) {
                Log.i("Ads", str);
                return;
            }
            boolean z10 = true;
            for (String str2 : zzb.zzd(str)) {
                if (z10) {
                    Log.i("Ads", str2);
                } else {
                    Log.i("Ads-cont", str2);
                }
                z10 = false;
            }
        }
    }

    public static void zzi(String str) {
        if (zzm(5)) {
            if (str == null || str.length() <= 4000) {
                Log.w("Ads", str);
                return;
            }
            boolean z10 = true;
            for (String str2 : zzb.zzd(str)) {
                if (z10) {
                    Log.w("Ads", str2);
                } else {
                    Log.w("Ads-cont", str2);
                }
                z10 = false;
            }
        }
    }

    public static void zzj(String str, Throwable th2) {
        if (zzm(5)) {
            Log.w("Ads", str, th2);
        }
    }

    @VisibleForTesting
    static String zzk(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(lineNumber).length());
        sb2.append(str);
        sb2.append(" @");
        sb2.append(lineNumber);
        return sb2.toString();
    }

    public static void zzl(String str, @Nullable Throwable th2) {
        if (zzm(5)) {
            if (th2 != null) {
                zzj(zzk(str), th2);
            } else {
                zzi(zzk(str));
            }
        }
    }

    public static boolean zzm(int i10) {
        return i10 >= 5 || Log.isLoggable("Ads", i10);
    }
}
