package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfds implements zzfav {
    private final Map zza;

    public zzfds(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", com.google.android.gms.ads.internal.client.zzbb.zza().zzk(this.zza));
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not encode video decoder properties: ".concat(String.valueOf(e10.getMessage())));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
