package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.C4240b4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfda implements zzfav {
    private final Bundle zza;

    public zzfda(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.zza;
        if (bundle != null) {
            try {
                com.google.android.gms.ads.internal.util.zzbp.zzh(com.google.android.gms.ads.internal.util.zzbp.zzh(jSONObject, C4240b4.i.G), "play_store").put("parental_controls", com.google.android.gms.ads.internal.client.zzbb.zza().zzm(bundle));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed putting parental controls bundle.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
