package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzti implements zzth {
    private final Object zza;

    private zzti(Object obj) {
        this.zza = obj;
    }

    public static zzth zza(Object obj) {
        if (obj != null) {
            return new zzti(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final Object zzb() {
        return this.zza;
    }
}
