package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzazi;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzfjo;
import com.google.android.gms.internal.ads.zzfqk;
import com.google.android.gms.internal.ads.zzgzy;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzazh zzc;
    private final zzfjo zzd;
    private final int zze;
    private final zzdye zzf;
    private final boolean zzg;
    private final zzgzy zzh = zzcei.zzf;
    private final zzfqk zzi;
    private final zzo zzj;
    private final zzf zzk;
    private final zzj zzl;

    TaggingLibraryJsInterface(WebView webView, zzazh zzazhVar, zzdye zzdyeVar, zzfqk zzfqkVar, zzfjo zzfjoVar, zzo zzoVar, zzf zzfVar, zzj zzjVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzazhVar;
        this.zzf = zzdyeVar;
        zzbhe.zza(context);
        this.zze = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzla)).intValue();
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlb)).booleanValue();
        this.zzi = zzfqkVar;
        this.zzd = zzfjoVar;
        this.zzj = zzoVar;
        this.zzk = zzfVar;
        this.zzl = zzjVar;
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getClickSignals(@NonNull String str) {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            String strZzg = this.zzc.zzb().zzg(this.zza, str, this.zzb);
            if (!this.zzg) {
                return strZzg;
            }
            zzaa.zze(this.zzf, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jCurrentTimeMillis)));
            return strZzg;
        } catch (RuntimeException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getClickSignalsWithTimeout(@NonNull final String str, int i10) {
        if (i10 <= 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 51);
            sb2.append("Invalid timeout for getting click signals. Timeout=");
            sb2.append(i10);
            String string = sb2.toString();
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(string);
            return "";
        }
        try {
            return (String) zzcei.zza.zzc(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbr
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.getClickSignals(str);
                }
            }).get(Math.min(i10, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals with timeout. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzbp zzbpVar = new zzbp(this, string);
        if (((Boolean) zzbjj.zze.zze()).booleanValue()) {
            this.zzj.zzb(this.zzb, zzbpVar);
            return string;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzld)).booleanValue()) {
            this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza(bundle, zzbpVar);
                }
            });
            return string;
        }
        QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbpVar);
        return string;
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getViewSignals() {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            String strZzj = this.zzc.zzb().zzj(this.zza, this.zzb, null);
            if (!this.zzg) {
                return strZzj;
            }
            zzaa.zze(this.zzf, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jCurrentTimeMillis)));
            return strZzj;
        } catch (RuntimeException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 50);
            sb2.append("Invalid timeout for getting view signals. Timeout=");
            sb2.append(i10);
            String string = sb2.toString();
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(string);
            return "";
        }
        try {
            return (String) zzcei.zza.zzc(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbq
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.getViewSignals();
                }
            }).get(Math.min(i10, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals with timeout. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    public void recordClick(@NonNull final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlf)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb(str);
            }
        });
    }

    @JavascriptInterface
    @KeepForSdk
    public void reportTouchEvent(@NonNull String str) {
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i10 = jSONObject.getInt("x");
            i11 = jSONObject.getInt("y");
            i12 = jSONObject.getInt("duration_ms");
            f10 = (float) jSONObject.getDouble("force");
            int i14 = jSONObject.getInt("type");
            if (i14 != 0) {
                i13 = 1;
                if (i14 != 1) {
                    i13 = 2;
                    if (i14 != 2) {
                        i13 = 3;
                        if (i14 != 3) {
                            i13 = -1;
                        }
                    }
                }
            } else {
                i13 = 0;
            }
        } catch (RuntimeException | JSONException e10) {
            e = e10;
        }
        try {
            this.zzc.zzc(MotionEvent.obtain(0L, i12, i13, i10, i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e11) {
            e = e11;
            int i15 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.reportTouchEvent");
        } catch (JSONException e12) {
            e = e12;
            int i152 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }

    final /* synthetic */ void zza(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.util.zzz zzzVarZzf = com.google.android.gms.ads.internal.zzt.zzf();
        Context context = this.zza;
        CookieManager cookieManagerZza = zzzVarZzf.zza(context);
        bundle.putBoolean("accept_3p_cookie", cookieManagerZza != null ? cookieManagerZza.acceptThirdPartyCookies(this.zzb) : false);
        QueryInfo.generate(context, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    final /* synthetic */ void zzb(String str) {
        zzfjo zzfjoVar;
        Uri uriZzd = Uri.parse(str);
        try {
            uriZzd = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() || (zzfjoVar = this.zzd) == null) ? this.zzc.zzd(uriZzd, this.zza, this.zzb, null) : zzfjoVar.zza(uriZzd, this.zza, this.zzb, null);
        } catch (zzazi e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to append the click signal to URL: ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzi.zzb(uriZzd.toString(), null, null, null);
    }

    final /* synthetic */ WebView zzc() {
        return this.zzb;
    }

    final /* synthetic */ zzgzy zzd() {
        return this.zzh;
    }

    final /* synthetic */ zzf zze() {
        return this.zzk;
    }

    final /* synthetic */ zzj zzf() {
        return this.zzl;
    }
}
