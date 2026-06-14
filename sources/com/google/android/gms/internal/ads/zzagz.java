package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes8.dex */
final class zzagz implements zzagq {
    public final String zza;

    private zzagz(String str) {
        this.zza = str;
    }

    public static zzagz zzb(zzer zzerVar) {
        return new zzagz(zzerVar.zzK(zzerVar.zzd(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzagq
    public final int zza() {
        return 1852994675;
    }
}
