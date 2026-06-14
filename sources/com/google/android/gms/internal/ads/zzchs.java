package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzchs implements zzboh {
    @Nullable
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            StringBuilder sb2 = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb2.append("Precache invalid numeric parameter '");
            sb2.append(str);
            sb2.append("': ");
            sb2.append(str2);
            String string = sb2.toString();
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchr zzchuVar;
        int i10;
        zzcge zzcgeVar = (zzcge) obj;
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzchk zzchkVarZzB = com.google.android.gms.ads.internal.zzt.zzB();
        if (map.containsKey("abort")) {
            if (zzchkVarZzB.zza(zzcgeVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numZzb = zzb(map, "periodicReportIntervalMs");
        Integer numZzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer numZzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcgd zzcgdVar = new zzcgd((String) map.get("flags"));
        boolean z10 = zzcgdVar.zzk;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            zzchj zzchjVarZzb = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    i10 = 0;
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        try {
                            strArr2[i11] = jSONArray.getString(i11);
                        } catch (JSONException unused) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Malformed demuxed URL list for precache: ".concat(str2));
                            strArr = null;
                        }
                    }
                    strArr = strArr2;
                } catch (JSONException unused2) {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
            if (strArr == null) {
                strArr = new String[1];
                strArr[i10] = str;
            }
            if (z10) {
                Iterator it = zzchkVarZzB.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zzchj zzchjVar = (zzchj) it.next();
                    if (zzchjVar.zza == zzcgeVar && str.equals(zzchjVar.zzd())) {
                        zzchjVarZzb = zzchjVar;
                        break;
                    }
                }
            } else {
                zzchjVarZzb = zzchkVarZzB.zzb(zzcgeVar);
            }
            if (zzchjVarZzb != null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache task is already running.");
                return;
            }
            if (zzcgeVar.zzk() == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache requires a dependency provider.");
                return;
            }
            Integer numZzb4 = zzb(map, "player");
            if (numZzb4 == null) {
                numZzb4 = Integer.valueOf(i10);
            }
            if (numZzb != null) {
                zzcgeVar.zzo(numZzb.intValue());
            }
            if (numZzb2 != null) {
                zzcgeVar.zzA(numZzb2.intValue());
            }
            if (numZzb3 != null) {
                zzcgeVar.zzB(numZzb3.intValue());
            }
            int iIntValue = numZzb4.intValue();
            zzchb zzchbVar = zzcgeVar.zzk().zzb;
            if (iIntValue > 0) {
                int i12 = zzcgdVar.zzg;
                int iZzQ = zzcfv.zzQ();
                if (iZzQ < i12) {
                    zzchuVar = new zzcia(zzcgeVar, zzcgdVar);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzr)).booleanValue()) {
                        iZzQ = zzchx.zzr();
                    }
                    zzchuVar = iZzQ < zzcgdVar.zzb ? new zzchx(zzcgeVar, zzcgdVar) : new zzchv(zzcgeVar);
                }
            } else {
                zzchuVar = new zzchu(zzcgeVar);
            }
            new zzchj(zzcgeVar, zzchuVar, str, strArr).zzb();
        } else {
            zzchj zzchjVarZzb2 = zzchkVarZzB.zzb(zzcgeVar);
            if (zzchjVarZzb2 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache must specify a source.");
                return;
            }
            zzchuVar = zzchjVarZzb2.zzb;
        }
        Integer numZzb5 = zzb(map, "minBufferMs");
        if (numZzb5 != null) {
            zzchuVar.zzi(numZzb5.intValue());
        }
        Integer numZzb6 = zzb(map, "maxBufferMs");
        if (numZzb6 != null) {
            zzchuVar.zzh(numZzb6.intValue());
        }
        Integer numZzb7 = zzb(map, "bufferForPlaybackMs");
        if (numZzb7 != null) {
            zzchuVar.zzj(numZzb7.intValue());
        }
        Integer numZzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (numZzb8 != null) {
            zzchuVar.zzk(numZzb8.intValue());
        }
    }
}
