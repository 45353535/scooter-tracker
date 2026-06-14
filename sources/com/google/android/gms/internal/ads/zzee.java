package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzee {
    private static final Object zza = new Object();

    public static void zza(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.d(str, zzg(str2, null));
        }
    }

    public static void zzb(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.i(str, zzg(str2, null));
        }
    }

    public static void zzc(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.w(str, zzg(str2, null));
        }
    }

    public static void zzd(@Size(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (zza) {
            Log.w(str, zzg(str2, th2));
        }
    }

    public static void zze(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.e(str, zzg(str2, null));
        }
    }

    public static void zzf(@Size(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (zza) {
            Log.e(str, zzg(str2, th2));
        }
    }

    public static String zzg(String str, @Nullable Throwable th2) {
        String strReplace;
        if (th2 != null) {
            synchronized (zza) {
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace(IOUtils.LINE_SEPARATOR_UNIX, "\n  ");
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(strReplace2).length() + 1);
        sb2.append(str);
        sb2.append("\n  ");
        sb2.append(strReplace2);
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        return sb2.toString();
    }
}
