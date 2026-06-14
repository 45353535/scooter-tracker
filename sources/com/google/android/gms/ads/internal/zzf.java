package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.u0;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzcdp;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcel;
import com.google.android.gms.internal.ads.zzdxy;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.android.gms.internal.ads.zzgzo;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    static final /* synthetic */ ListenableFuture zzd(Long l10, zzdxz zzdxzVar, zzfoe zzfoeVar, zzfor zzforVar, JSONObject jSONObject) throws JSONException {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            zzt.zzh().zzo().zzh(jSONObject.getString("appSettingsJson"));
            if (l10 != null) {
                zzf(zzdxzVar, "cld_s", zzt.zzk().elapsedRealtime() - l10.longValue());
            }
        }
        String strOptString = jSONObject.optString("errorReason", "");
        if (!TextUtils.isEmpty(strOptString)) {
            zzfoeVar.zzk(strOptString);
        }
        zzfoeVar.zzd(zOptBoolean);
        zzforVar.zzb(zzfoeVar.zzm());
        return zzgzo.zza(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdxz zzdxzVar, String str, long j10) {
        if (zzdxzVar != null) {
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzoe)).booleanValue()) {
                zzdxy zzdxyVarZza = zzdxzVar.zza();
                zzdxyVarZza.zzc("action", "lat_init");
                zzdxyVarZza.zzc(str, Long.toString(j10));
                zzdxyVarZza.zzd();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable Runnable runnable, zzfor zzforVar, @Nullable zzdxz zzdxzVar, @Nullable Long l10, boolean z10) {
        zzc(context, versionInfoParcel, true, null, str, null, runnable, zzforVar, zzdxzVar, l10, z10);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, String str, zzcdp zzcdpVar, zzfor zzforVar, boolean z10) {
        zzc(context, versionInfoParcel, false, zzcdpVar, zzcdpVar != null ? zzcdpVar.zze() : null, str, null, zzforVar, null, null, z10);
    }

    @VisibleForTesting
    final void zzc(Context context, VersionInfoParcel versionInfoParcel, boolean z10, @Nullable zzcdp zzcdpVar, String str, @Nullable String str2, @Nullable Runnable runnable, final zzfor zzforVar, @Nullable final zzdxz zzdxzVar, @Nullable final Long l10, boolean z11) {
        zzfoe zzfoeVar;
        Exception exc;
        JSONObject jSONObject;
        ListenableFuture listenableFutureZzb;
        zzgyw zzgywVar;
        PackageInfo packageInfo;
        if (zzt.zzk().elapsedRealtime() - this.zzb < 5000) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzk().elapsedRealtime();
        if (zzcdpVar != null && !TextUtils.isEmpty(zzcdpVar.zzd())) {
            if (zzt.zzk().currentTimeMillis() - zzcdpVar.zzb() <= ((Long) zzbd.zzc().zzd(zzbhe.zzfa)).longValue() && zzcdpVar.zzc()) {
                return;
            }
        }
        if (context == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfoe zzfoeVarA = u0.a(context, 4);
        zzfoeVarA.zza();
        zzbsz zzbszVarZzb = zzt.zzr().zzb(this.zza, versionInfoParcel, zzforVar);
        zzbst zzbstVar = zzbsw.zza;
        zzbsp zzbspVarZza = zzbszVarZzb.zza("google.afma.config.fetchAppSettings", zzbstVar, zzbstVar);
        try {
            jSONObject = new JSONObject();
        } catch (Exception e10) {
            e = e10;
            zzfoeVar = zzfoeVarA;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z10);
            jSONObject.put("pn", context.getPackageName());
            zzbgv zzbgvVar = zzbhe.zza;
            jSONObject.put("experiment_ids", TextUtils.join(StringUtils.COMMA, zzbd.zzb().zze()));
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzkW)).booleanValue()) {
                jSONObject.put("inspector_enabled", z11);
            }
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            listenableFutureZzb = zzbspVarZza.zzb(jSONObject);
            try {
                zzgywVar = new zzgyw(this) { // from class: com.google.android.gms.ads.internal.zzd
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return zzf.zzd(l10, zzdxzVar, zzfoeVarA, zzforVar, (JSONObject) obj);
                    }
                };
                zzfoeVar = zzfoeVarA;
            } catch (Exception e11) {
                e = e11;
                zzfoeVar = zzfoeVarA;
            }
        } catch (Exception e12) {
            exc = e12;
            zzfoeVar = zzfoeVarA;
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
            zzfoeVar.zzj(exc);
            zzfoeVar.zzd(false);
            zzforVar.zzb(zzfoeVar.zzm());
        }
        try {
            zzgzy zzgzyVar = zzcei.zzg;
            ListenableFuture listenableFutureZzj = zzgzo.zzj(listenableFutureZzb, zzgywVar, zzgzyVar);
            if (runnable != null) {
                listenableFutureZzb.addListener(runnable, zzgzyVar);
            }
            if (l10 != null) {
                listenableFutureZzb.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzf.zzf(zzdxzVar, "cld_r", zzt.zzk().elapsedRealtime() - l10.longValue());
                    }
                }, zzgzyVar);
            }
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zziL)).booleanValue()) {
                zzcel.zzb(listenableFutureZzj, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzcel.zza(listenableFutureZzj, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e13) {
            e = e13;
            exc = e;
            int i132 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
            zzfoeVar.zzj(exc);
            zzfoeVar.zzd(false);
            zzforVar.zzb(zzfoeVar.zzm());
        }
    }
}
