package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzclc {
    private static final Pattern zza = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
    private static final Pattern zzb = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String zza(@NonNull String str, @Nullable String... strArr) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        Matcher matcher = zza.matcher(str);
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb2.append(str.substring(0, iEnd));
            String str3 = strArr[0];
            if (str3 != null) {
                sb2.append(str3);
            }
            sb2.append(str.substring(iEnd));
        } else {
            if (!zzb.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb2.append(str2);
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    @Nullable
    public static String zzb(zzfir zzfirVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && zzfirVar.zzT) {
            zzfjn zzfjnVar = zzfirVar.zzV;
            if (zzfjnVar.zzb() && zzfirVar.zzb != 4) {
                zzejx zzejxVar = zzfjnVar.zzc() == 1 ? zzejx.VIDEO : zzejx.HTML_DISPLAY;
                String str = zzfirVar.zzal;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", zzejxVar.toString());
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e10) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to build OMID ENV JSON", e10);
                }
            }
        }
        return null;
    }
}
