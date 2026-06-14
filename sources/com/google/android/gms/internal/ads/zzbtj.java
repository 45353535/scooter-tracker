package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
final class zzbtj implements zzbox {
    private final zzcen zza;

    public zzbtj(zzbtl zzbtlVar, zzcen zzcenVar) {
        Objects.requireNonNull(zzbtlVar);
        this.zza = zzcenVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zza(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e10) {
            this.zza.zzd(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzb(@Nullable String str) {
        try {
            if (str == null) {
                this.zza.zzd(new zzbso());
            } else {
                this.zza.zzd(new zzbso(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
