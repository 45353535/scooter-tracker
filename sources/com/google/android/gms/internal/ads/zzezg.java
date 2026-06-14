package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzezg implements zzfav {
    private final Map zza;

    public zzezg(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Map map = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (map.isEmpty()) {
            return;
        }
        Bundle bundle = zzdahVar.zza;
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            if (!arrayDeque.isEmpty()) {
                zzdzf zzdzfVar = (zzdzf) entry.getKey();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", zzdzfVar.zza());
                    jSONObject.put(Reporting.Key.EVENT_TYPE, zzdzfVar.zzb());
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put((Long) it.next());
                    }
                    jSONObject.put("timestamps", jSONArray2);
                    jSONArray.put(jSONObject);
                } catch (JSONException e10) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Failed putting the on-device storage record.", e10);
                }
            }
        }
        if (jSONArray.length() > 0) {
            bundle.putString("on_device_storage_records", jSONArray.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
