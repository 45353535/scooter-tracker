package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbhg {
    public static Object zza(zzgru zzgruVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzgruVar.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
