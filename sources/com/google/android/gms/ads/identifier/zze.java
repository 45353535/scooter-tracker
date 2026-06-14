package com.google.android.gms.ads.identifier;

import android.util.Log;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.ads_identifier.zzh;
import com.google.android.gms.internal.ads_identifier.zzk;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes7.dex */
public final class zze {
    @WorkerThread
    public static final void zza(String str) {
        try {
            try {
                zzk.zzb(263);
                URL url = new URL(str);
                int i10 = zzh.zzb;
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + str);
                    }
                    zzk.zza();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e10) {
                e = e10;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                zzk.zza();
            } catch (IndexOutOfBoundsException e11) {
                Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e11.getMessage(), e11);
                zzk.zza();
            } catch (RuntimeException e12) {
                e = e12;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                zzk.zza();
            }
        } catch (Throwable th2) {
            zzk.zza();
            throw th2;
        }
    }
}
