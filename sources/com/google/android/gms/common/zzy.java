package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes7.dex */
@ShowFirstParty
public class zzy {
    private static final zzy zze = new zzy(true, 3, 1, null, null, -1);
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    private zzy(boolean z10, int i10, int i11, String str, Throwable th2, long j10) {
        this.zza = z10;
        this.zzd = i10;
        this.zzb = str;
        this.zzc = th2;
    }

    @Deprecated
    static zzy zzb() {
        return zze;
    }

    static zzy zzc(@NonNull String str) {
        return new zzy(false, 1, 5, str, null, -1L);
    }

    static zzy zzd(@NonNull String str, @NonNull Throwable th2) {
        return new zzy(false, 1, 5, str, th2, -1L);
    }

    @VisibleForTesting(otherwise = 3)
    public static zzy zzf(int i10, long j10) {
        return new zzy(true, i10, 1, null, null, j10);
    }

    static zzy zzg(int i10, int i11, @NonNull String str, Throwable th2) {
        return new zzy(false, i10, i11, str, th2, -1L);
    }

    String zza() {
        return this.zzb;
    }

    final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th2 = this.zzc;
        if (th2 != null) {
            Log.d("GoogleCertificatesRslt", zza(), th2);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }

    /* synthetic */ zzy(boolean z10, int i10, int i11, String str, Throwable th2, long j10, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
