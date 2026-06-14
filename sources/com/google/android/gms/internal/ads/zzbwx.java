package com.google.android.gms.internal.ads;

import androidx.constraintlayout.motion.widget.Key;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class zzbwx {
    private final zzcjl zza;
    private final String zzb;

    public zzbwx(zzcjl zzcjlVar, String str) {
        this.zza = zzcjlVar;
        this.zzb = str;
    }

    public final void zzg(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put(PglCryptUtils.KEY_MESSAGE, str).put("action", this.zzb);
            zzcjl zzcjlVar = this.zza;
            if (zzcjlVar != null) {
                zzcjlVar.zzd("onError", jSONObjectPut);
            }
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching error event.", e10);
        }
    }

    public final void zzh(String str) {
        try {
            this.zza.zzd("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching ready Event.", e10);
        }
    }

    public final void zzi(int i10, int i11, int i12, int i13) {
        try {
            this.zza.zzd("onSizeChanged", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching size change.", e10);
        }
    }

    public final void zzj(int i10, int i11, int i12, int i13) {
        try {
            this.zza.zzd("onDefaultPositionReceived", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching default position.", e10);
        }
    }

    public final void zzk(String str) {
        try {
            this.zza.zzd("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching state change.", e10);
        }
    }

    public final void zzl(int i10, int i11, int i12, int i13, float f10, int i14) {
        try {
            this.zza.zzd("onScreenInfoChanged", new JSONObject().put("width", i10).put("height", i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", f10).put(Key.ROTATION, i14));
        } catch (JSONException e10) {
            int i15 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining screen information.", e10);
        }
    }
}
