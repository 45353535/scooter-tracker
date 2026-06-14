package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.adjust.sdk.purchase.ADJPConstants;
import com.amazon.device.ads.DtbDeviceData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class zzftx {
    private final String zza;
    private zzfuz zzb;
    private long zzc;
    private int zzd;

    public zzftx(String str) {
        zzp();
        this.zza = str;
        this.zzb = new zzfuz(null);
    }

    public void zza() {
    }

    public void zzb() {
        this.zzb.clear();
    }

    final void zzc(WebView webView) {
        this.zzb = new zzfuz(webView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView zzd() {
        return (WebView) this.zzb.get();
    }

    public final boolean zze() {
        return this.zzb.get() != 0;
    }

    public final void zzf(boolean z10) {
        if (zze()) {
            zzfto.zza().zzf(zzd(), this.zza, true != z10 ? "backgrounded" : "foregrounded");
        }
    }

    public final void zzg(boolean z10) {
        if (zze()) {
            zzfto.zza().zzg(zzd(), this.zza, true != z10 ? "unlocked" : "locked");
        }
    }

    public final void zzh(String str, long j10) {
        if (j10 >= this.zzc) {
            this.zzd = 2;
            zzfto.zza().zze(zzd(), this.zza, str);
        }
    }

    public final void zzi(String str, long j10) {
        if (j10 < this.zzc || this.zzd == 3) {
            return;
        }
        this.zzd = 3;
        zzfto.zza().zze(zzd(), this.zza, str);
    }

    public final void zzj(zzfsk zzfskVar) {
        zzfto.zza().zzb(zzd(), this.zza, zzfskVar.zzb());
    }

    public void zzk(zzfsn zzfsnVar, zzfsl zzfslVar) {
        zzl(zzfsnVar, zzfslVar, null);
    }

    protected final void zzl(zzfsn zzfsnVar, zzfsl zzfslVar, JSONObject jSONObject) {
        String strZzh = zzfsnVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfud.zzc(jSONObject2, ADJPConstants.KEY_ENVIRONMENT, "app");
        zzfud.zzc(jSONObject2, "adSessionType", zzfslVar.zzi());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("; ");
        sb2.append(str2);
        zzfud.zzc(jSONObject3, "deviceType", sb2.toString());
        zzfud.zzc(jSONObject3, DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY, Integer.toString(Build.VERSION.SDK_INT));
        zzfud.zzc(jSONObject3, "os", "Android");
        zzfud.zzc(jSONObject2, "deviceInfo", jSONObject3);
        zzfud.zzc(jSONObject2, "deviceCategory", zzfuc.zzb().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfud.zzc(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfud.zzc(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, zzfslVar.zzc().zzb());
        zzfud.zzc(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, zzfslVar.zzc().zzc());
        zzfud.zzc(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfud.zzc(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        zzfud.zzc(jSONObject5, RemoteConfigConstants.RequestFieldKey.APP_ID, zzftm.zza().zzb().getApplicationContext().getPackageName());
        zzfud.zzc(jSONObject2, "app", jSONObject5);
        if (zzfslVar.zzg() != null) {
            zzfud.zzc(jSONObject2, "contentUrl", zzfslVar.zzg());
        }
        if (zzfslVar.zzh() != null) {
            zzfud.zzc(jSONObject2, "customReferenceData", zzfslVar.zzh());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfslVar.zzd().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzfto.zza().zzc(zzd(), strZzh, jSONObject2, jSONObject6, jSONObject);
    }

    public final void zzm() {
        zzfto.zza().zzd(zzd(), this.zza);
    }

    public final void zzn(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfud.zzc(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfto.zza().zzi(zzd(), jSONObject);
    }

    public final void zzo(float f10) {
        zzfto.zza().zzh(zzd(), this.zza, f10);
    }

    public final void zzp() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }
}
