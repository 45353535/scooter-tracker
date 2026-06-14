package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzboy implements zzboh {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get(C4240b4.g.f42582e);
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : IOUtils.LINE_SEPARATOR_UNIX.concat(String.valueOf(str4));
        synchronized (this.zza) {
            try {
                zzbox zzboxVar = (zzbox) this.zzb.remove(str);
                if (zzboxVar == null) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
                    sb2.append("Received result for unexpected method invocation: ");
                    sb2.append(str);
                    String string = sb2.toString();
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + strConcat.length());
                    sb3.append(str3);
                    sb3.append(strConcat);
                    zzboxVar.zzb(sb3.toString());
                    return;
                }
                if (str5 == null) {
                    zzboxVar.zza(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        String string2 = jSONObject.toString(2);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(string2).length() + 13);
                        sb4.append("Result GMSG: ");
                        sb4.append(string2);
                        com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
                    }
                    zzboxVar.zza(jSONObject);
                } catch (JSONException e10) {
                    zzboxVar.zzb(e10.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(String str, zzbox zzboxVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzboxVar);
        }
    }

    public final ListenableFuture zzc(zzbrp zzbrpVar, String str, JSONObject jSONObject) {
        zzcen zzcenVar = new zzcen();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzb(string, new zzbow(this, zzcenVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            zzbrpVar.zzb(str, jSONObject2);
            return zzcenVar;
        } catch (Exception e10) {
            zzcenVar.zzd(e10);
            return zzcenVar;
        }
    }
}
