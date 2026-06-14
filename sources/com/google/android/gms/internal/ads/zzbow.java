package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
final class zzbow implements zzbox {
    final /* synthetic */ zzcen zza;

    zzbow(zzboy zzboyVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzboyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzb(@Nullable String str) {
        this.zza.zzd(new zzbso(str));
    }
}
