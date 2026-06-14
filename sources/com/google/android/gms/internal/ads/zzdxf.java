package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewFeature;
import com.ironsource.C4240b4;
import com.ironsource.X1;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdxf implements zzdel, zzdct, zzdbi, zzdjy {
    private final zzdxt zza;
    private final zzdye zzb;
    private final int zzc;

    zzdxf(zzdxt zzdxtVar, zzdye zzdyeVar, int i10) {
        this.zza = zzdxtVar;
        this.zzb = zzdyeVar;
        this.zzc = i10;
    }

    private final void zzc(Bundle bundle, zzguf zzgufVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(zzdxh.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        zzdxt zzdxtVar = this.zza;
        zzdxtVar.zzf();
        if (bundle.containsKey("ls")) {
            zzdxtVar.zzd("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzgufVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzdxi zzdxiVar = (zzdxi) zzgufVar.get(i10);
            long j10 = bundle.getLong(zzdxiVar.zzb().zza(), -1L);
            long j11 = bundle.getLong(zzdxiVar.zzc().zza(), -1L);
            if (j10 > 0 && j11 > 0) {
                zzdxtVar.zzd(zzdxiVar.zza(), String.valueOf(j11 - j10));
            }
        }
        zzf(bundle.getBundle("client_sig_latency_key"));
        zzf(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziy)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                zzdxtVar.zzd("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                zzdxtVar.zzd("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    private final void zzf(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j10 = bundle.getLong(str);
            if (j10 >= 0) {
                this.zza.zzd(str, String.valueOf(j10));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zzd(@Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhR)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziy)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            if (zzbjVar == null) {
                zzdxt zzdxtVar = this.zza;
                zzdxtVar.zzc().put("action", "sgs");
                zzdxtVar.zzc().put(CommonUrlParts.REQUEST_ID, X1.f42014f);
                this.zzb.zzb(zzdxtVar.zzc());
                return;
            }
            zzbzu zzbzuVar = zzbjVar.zzd;
            Bundle bundle = zzbjVar.zze;
            if (zzbzuVar != null) {
                zzc(zzbzuVar.zzm, zzdxi.zza);
            } else if (bundle != null && !bundle.isEmpty()) {
                zzc(bundle, zzdxi.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(zzbjVar.zzc) ? zzbjVar.zzb : zzbjVar.zzc);
                zzdxt zzdxtVar2 = this.zza;
                zzdxtVar2.zzc().put("action", "sgs");
                Map mapZzc = zzdxtVar2.zzc();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzle)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS).getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e10) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving JSONObject from the requestJson, ", e10);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                mapZzc.put("tpc", str);
                zzbzu zzbzuVar2 = zzbjVar.zzd;
                if (zzbzuVar2 != null) {
                    this.zza.zzb(zzbzuVar2.zza);
                }
                zzdxt zzdxtVar3 = this.zza;
                zzdxtVar3.zzg();
                this.zzb.zzb(zzdxtVar3.zzc());
            } catch (JSONException unused) {
                zzdxt zzdxtVar4 = this.zza;
                zzdxtVar4.zzc().put("action", "sgf");
                zzdxtVar4.zzc().put("sgf_reason", "request_invalid");
                this.zzb.zzb(zzdxtVar4.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbi
    public final void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdxt zzdxtVar = this.zza;
        zzdxtVar.zzc().put("action", "ftl");
        zzdxtVar.zzd("ftl", String.valueOf(zzeVar.zza));
        zzdxtVar.zzd("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzig)).booleanValue()) {
            zzdxtVar.zzd("emsg", zzeVar.zzb);
        }
        zzdxtVar.zzg();
        this.zzb.zzb(zzdxtVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
        this.zza.zzb(zzbzuVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
        this.zza.zza(zzfjcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zze(@Nullable String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhR)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziy)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            zzdxt zzdxtVar = this.zza;
            zzdxtVar.zzc().put("action", "sgf");
            zzdxtVar.zzd("sgf_reason", str);
            zzdxtVar.zzg();
            this.zzb.zzb(zzdxtVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        zzdxt zzdxtVar = this.zza;
        zzdxtVar.zzc().put("action", C4240b4.i.f42648r);
        zzc(zzdxtVar.zze(), zzdxi.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoc)).booleanValue()) {
            zzdxtVar.zzc().put("mafe", true != WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO) ? "0" : "1");
        }
        zzdxtVar.zzg();
        this.zzb.zzb(zzdxtVar.zzc());
    }
}
