package com.google.android.gms.common.signatureverification;

import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes7.dex */
public final class zzd {

    @GuardedBy("Loader.class")
    private static SignatureVerificationConfiguration zza;

    public static synchronized void zza(SignatureVerificationConfiguration signatureVerificationConfiguration) {
        if (zza != null) {
            throw new IllegalStateException("Redundantly setting SignatureVerificationConfiguration");
        }
        zza = signatureVerificationConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized SignatureVerificationConfiguration zzc() {
        try {
            if (zza == null) {
                zza(new zzb());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }
}
