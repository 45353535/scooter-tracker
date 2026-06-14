package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C4240b4;
import com.ironsource.C4329g8;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcso implements zzbss {
    private final Context zza;
    private final zzbdb zzb;
    private final PowerManager zzc;

    public zzcso(Context context, zzbdb zzbdbVar) {
        this.zza = context;
        this.zzb = zzbdbVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbss
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcsr zzcsrVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbdd zzbddVar = zzcsrVar.zzf;
        if (zzbddVar == null) {
            jSONObject = new JSONObject();
        } else {
            zzbdb zzbdbVar = this.zzb;
            if (zzbdbVar.zzc() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z10 = zzbddVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", zzbdbVar.zzb()).put("activeViewJSON", zzbdbVar.zzc()).put("timestamp", zzcsrVar.zzd).put("adFormat", zzbdbVar.zza()).put("hashCode", zzbdbVar.zzd()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcsrVar.zzb).put("isNative", zzbdbVar.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzi().zzd()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzi().zzb());
            Context context = this.zza;
            jSONObjectPut.put(C4240b4.j.P, com.google.android.gms.ads.internal.util.zzaa.zze(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut2 = jSONObject3.put("windowVisibility", zzbddVar.zzb).put("isAttachedToWindow", z10);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = zzbddVar.zzc;
            JSONObject jSONObjectPut3 = jSONObjectPut2.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = zzbddVar.zzd;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = zzbddVar.zze;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", zzbddVar.zzf);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = zzbddVar.zzg;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", zzbddVar.zzh);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = zzbddVar.zzi;
            jSONObjectPut6.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put(C4329g8.f43166k, zzcsrVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbW)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbddVar.zzk;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcsrVar.zze)) {
                jSONObject3.put("doneReasonCode", ApsMetricsDataMap.APSMETRICS_FIELD_URL);
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
