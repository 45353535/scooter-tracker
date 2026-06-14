package com.google.android.gms.common;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;
    private final String zzc;
    private final Throwable zzd;

    private PackageVerificationResult(String str, int i10, boolean z10, String str2, Throwable th2, com.google.android.gms.common.signatureverification.zza zzaVar) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = str2;
        this.zzd = th2;
    }

    public static PackageVerificationResult zza(String str, @NonNull String str2, Throwable th2, com.google.android.gms.common.signatureverification.zza zzaVar) {
        return new PackageVerificationResult(str, 1, false, str2, th2, null);
    }

    public static PackageVerificationResult zzd(String str, int i10, com.google.android.gms.common.signatureverification.zza zzaVar) {
        return new PackageVerificationResult(str, i10, true, null, null, null);
    }

    public final boolean zzb() {
        return this.zzb;
    }

    public final void zzc() {
        if (this.zzb) {
            return;
        }
        String str = this.zzc;
        Throwable th2 = this.zzd;
        String strConcat = "PackageVerificationRslt: ".concat(String.valueOf(str));
        if (th2 == null) {
            throw new SecurityException(strConcat);
        }
        throw new SecurityException(strConcat, th2);
    }
}
