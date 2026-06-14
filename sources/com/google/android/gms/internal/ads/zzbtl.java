package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbtl implements zzgyw {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final ListenableFuture zzb;

    zzbtl(ListenableFuture listenableFuture, String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        this.zzb = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(final Object obj) {
        return zzgzo.zzj(this.zzb, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzbtk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                return this.zza.zzc(obj, (zzbsm) obj2);
            }
        }, zzcei.zzg);
    }

    final /* synthetic */ ListenableFuture zzc(Object obj, zzbsm zzbsmVar) throws JSONException {
        zzcen zzcenVar = new zzcen();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzbog.zzo.zzb(string, new zzbtj(this, zzcenVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbsmVar.zzb(this.zza, jSONObject);
        return zzcenVar;
    }
}
