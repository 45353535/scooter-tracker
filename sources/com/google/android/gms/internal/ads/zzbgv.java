package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbgv {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    /* synthetic */ zzbgv(int i10, String str, Object obj, Object obj2, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzbd.zzb().zza(this);
    }

    public static zzbgv zzh(int i10, String str, int i11, int i12) {
        return new zzbgr(1, str, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static zzbgv zzi(int i10, String str, long j10, long j11) {
        return new zzbgs(1, str, Long.valueOf(j10), Long.valueOf(j11));
    }

    public static zzbgv zzj(int i10, String str, float f10, float f11) {
        return new zzbgt(1, str, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static zzbgv zzk(int i10, String str) {
        zzbgu zzbguVar = new zzbgu(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbd.zzb().zzb(zzbguVar);
        return zzbguVar;
    }

    public static zzbgv zzl(int i10, String str) {
        zzbgu zzbguVar = new zzbgu(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbd.zzb().zzc(zzbguVar);
        return zzbguVar;
    }

    public abstract Object zza(Bundle bundle);

    public abstract void zzb(SharedPreferences.Editor editor, Object obj);

    protected abstract Object zzc(JSONObject jSONObject);

    protected abstract Object zzd(SharedPreferences sharedPreferences);

    public final String zze() {
        return this.zzb;
    }

    public final Object zzf() {
        return com.google.android.gms.ads.internal.client.zzbd.zzc().zzb() ? this.zzd : this.zzc;
    }

    public final Object zzg() {
        return com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(this);
    }

    public final int zzm() {
        return this.zza;
    }
}
