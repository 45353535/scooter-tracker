package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4240b4;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdra {
    private final zzgzy zza;
    private final zzdrp zzb;
    private final zzdru zzc;
    private final zzdxt zzd;

    zzdra(zzgzy zzgzyVar, zzdrp zzdrpVar, zzdru zzdruVar, zzdxt zzdxtVar) {
        this.zza = zzgzyVar;
        this.zzb = zzdrpVar;
        this.zzc = zzdruVar;
        this.zzd = zzdxtVar;
    }

    private final ListenableFuture zze(ListenableFuture listenableFuture, zzdxh zzdxhVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            zzgzo.zzr(listenableFuture, new zzdqx(this, zzdxhVar), this.zza);
        }
        return listenableFuture;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.gms.internal.ads.zzfjc r15, final com.google.android.gms.internal.ads.zzfir r16, final org.json.JSONObject r17, @androidx.annotation.Nullable com.google.android.gms.ads.internal.zzb r18, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzcce r19) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdra.zza(com.google.android.gms.internal.ads.zzfjc, com.google.android.gms.internal.ads.zzfir, org.json.JSONObject, com.google.android.gms.ads.internal.zzb, com.google.android.gms.internal.ads.zzcce):com.google.common.util.concurrent.ListenableFuture");
    }

    final /* synthetic */ zzdoh zzb(zzfjc zzfjcVar, zzfir zzfirVar, JSONObject jSONObject) throws zzenv {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzd.zze().putLong(zzdxh.NATIVE_ASSETS_LOADING_BASIC_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdoh zzdohVar = new zzdoh();
        zzdohVar.zza(jSONObject.optInt("template_id", -1));
        zzdohVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdohVar.zzv(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        if (!zzfjkVar.zzh.contains(Integer.toString(zzdohVar.zzx()))) {
            int iZzx = zzdohVar.zzx();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzx).length() + 21);
            sb2.append("Invalid template ID: ");
            sb2.append(iZzx);
            throw new zzenv(1, sb2.toString());
        }
        if (zzdohVar.zzx() == 3) {
            if (zzdohVar.zzS() == null) {
                throw new zzenv(1, "No custom template id for custom template ad response.");
            }
            if (!zzfjkVar.zzi.contains(zzdohVar.zzS())) {
                throw new zzenv(1, "Unexpected custom template id in the response.");
            }
        }
        zzdohVar.zzi(jSONObject.optDouble("rating", -1.0d));
        String strOptString = jSONObject.optString("headline", null);
        if (zzfirVar.zzM) {
            com.google.android.gms.ads.internal.zzt.zzc();
            String strZzD = com.google.android.gms.ads.internal.util.zzs.zzD();
            StringBuilder sb3 = new StringBuilder(String.valueOf(strZzD).length() + 3 + String.valueOf(strOptString).length());
            sb3.append(strZzD);
            sb3.append(" : ");
            sb3.append(strOptString);
            strOptString = sb3.toString();
        }
        zzdohVar.zzs("headline", strOptString);
        zzdohVar.zzs("body", jSONObject.optString("body", null));
        zzdohVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdohVar.zzs("store", jSONObject.optString("store", null));
        zzdohVar.zzs("price", jSONObject.optString("price", null));
        zzdohVar.zzs(C4240b4.i.F0, jSONObject.optString(C4240b4.i.F0, null));
        return zzdohVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzdoh zzc(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, ListenableFuture listenableFuture5, JSONObject jSONObject, ListenableFuture listenableFuture6, ListenableFuture listenableFuture7, ListenableFuture listenableFuture8, ListenableFuture listenableFuture9, ListenableFuture listenableFuture10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzd.zze().putLong(zzdxh.RENDERING_NATIVE_ASSETS_LOADING_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdoh zzdohVar = (zzdoh) listenableFuture.get();
        zzdohVar.zzd((List) listenableFuture2.get());
        zzdohVar.zzj((zzbks) listenableFuture3.get());
        zzdohVar.zzk((zzbks) listenableFuture4.get());
        zzdohVar.zzc((zzbkl) listenableFuture5.get());
        zzdohVar.zze(zzdrp.zzl(jSONObject));
        zzdohVar.zzf(zzdrp.zzk(jSONObject));
        zzcjl zzcjlVar = (zzcjl) listenableFuture6.get();
        if (zzcjlVar != null) {
            zzdohVar.zzm(zzcjlVar);
            zzdohVar.zzg(zzcjlVar.zzE());
            zzdohVar.zzb(zzcjlVar.zzh());
        }
        zzdohVar.zzH().putAll((Bundle) listenableFuture7.get());
        zzcjl zzcjlVar2 = (zzcjl) listenableFuture8.get();
        if (zzcjlVar2 != null) {
            zzdohVar.zzn(zzcjlVar2);
            zzdohVar.zzh(zzcjlVar2.zzE());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue() || zzf(jSONObject)) {
            zzcjl zzcjlVar3 = (zzcjl) listenableFuture9.get();
            if (zzcjlVar3 != null) {
                zzdohVar.zzo(zzcjlVar3);
            }
        } else {
            zzdohVar.zzp(listenableFuture9);
            zzdohVar.zzr(new zzcen());
        }
        for (zzdrr zzdrrVar : (List) listenableFuture10.get()) {
            if (zzdrrVar.zza != 1) {
                zzdohVar.zzt(zzdrrVar.zzb, zzdrrVar.zzd);
            } else {
                zzdohVar.zzs(zzdrrVar.zzb, zzdrrVar.zzc);
            }
        }
        return zzdohVar;
    }

    final /* synthetic */ zzdxt zzd() {
        return this.zzd;
    }
}
