package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfcl implements zzfav {
    private final JSONObject zza;

    public zzfcl(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Unable to get cache_state");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
