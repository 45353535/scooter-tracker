package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class d0 {
    public static void a(zzbre zzbreVar, String str, JSONObject jSONObject) {
        zzbreVar.zzc(str, jSONObject.toString());
    }

    public static void b(zzbre zzbreVar, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length() + 2);
        sb2.append(str);
        sb2.append("(");
        sb2.append(str2);
        sb2.append(");");
        zzbreVar.zza(sb2.toString());
    }

    public static void c(zzbre zzbreVar, String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(string);
        sb2.append(");");
        String string2 = sb2.toString();
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(string2));
        zzbreVar.zza(sb2.toString());
    }

    public static void d(zzbre zzbreVar, String str, Map map) {
        try {
            zzbreVar.zzd(str, com.google.android.gms.ads.internal.client.zzbb.zza().zzk(map));
        } catch (JSONException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
    }
}
