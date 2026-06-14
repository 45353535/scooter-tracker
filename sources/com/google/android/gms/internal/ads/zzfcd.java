package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfcd implements zzfav {
    private final String zza;

    public zzfcd(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.zza);
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
