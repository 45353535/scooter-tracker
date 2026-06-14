package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbgy implements zzbju {
    final /* synthetic */ SharedPreferences zza;

    zzbgy(zzbhc zzbhcVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
        Objects.requireNonNull(zzbhcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final Boolean zza(String str, boolean z10) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z10));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final Long zzb(String str, long j10) {
        try {
            return Long.valueOf(this.zza.getLong(str, j10));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final Double zzc(String str, double d10) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d10));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.getString(str, String.valueOf(d10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final String zzd(String str, String str2) {
        return this.zza.getString(str, str2);
    }
}
