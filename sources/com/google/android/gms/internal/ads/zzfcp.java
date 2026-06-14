package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
final class zzfcp implements zzfax {
    private final JSONObject zza;

    zzfcp(Context context) {
        this.zza = zzbzq.zzc(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznt)).booleanValue() ? zzgzo.zza(zzfcn.zza) : zzgzo.zza(new zzfav() { // from class: com.google.android.gms.internal.ads.zzfco
            @Override // com.google.android.gms.internal.ads.zzfav
            public final /* synthetic */ void zza(Object obj) {
                this.zza.zzc((JSONObject) obj);
            }

            @Override // com.google.android.gms.internal.ads.zzfav
            public /* synthetic */ void zzb(Object obj) {
                s0.a(this, obj);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 46;
    }

    final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
