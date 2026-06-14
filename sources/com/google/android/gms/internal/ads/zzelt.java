package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class zzelt implements zzekg {
    private final Context zza;
    private final zzdlu zzb;
    private final Executor zzc;
    private final zzfiq zzd;
    private final zzdxz zze;

    public zzelt(Context context, Executor executor, zzdlu zzdluVar, zzfiq zzfiqVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = zzdluVar;
        this.zzc = executor;
        this.zzd = zzfiqVar;
        this.zze = zzdxzVar;
    }

    @Nullable
    private static String zze(zzfir zzfirVar) {
        try {
            return zzfirVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbif.zza(context) && !TextUtils.isEmpty(zze(zzfirVar));
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final ListenableFuture zzb(final zzfjc zzfjcVar, final zzfir zzfirVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoB)).booleanValue()) {
            zzdxy zzdxyVarZza = this.zze.zza();
            zzdxyVarZza.zzc("action", "cstm_tbs_rndr");
            zzdxyVarZza.zzd();
        }
        String strZze = zze(zzfirVar);
        final Uri uri = strZze != null ? Uri.parse(strZze) : null;
        final zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
        return zzgzo.zzj(zzgzo.zza(null), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzels
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(uri, zzfjcVar, zzfirVar, zzfiuVar, obj);
            }
        }, this.zzc);
    }

    final /* synthetic */ ListenableFuture zzc(Uri uri, zzfjc zzfjcVar, zzfir zzfirVar, zzfiu zzfiuVar, Object obj) {
        try {
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
            customTabsIntentBuild.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(customTabsIntentBuild.intent, null);
            zzcen zzcenVar = new zzcen();
            zzdko zzdkoVarZzd = this.zzb.zzd(new zzcwv(zzfjcVar, zzfirVar, null), new zzdkr(new zzelr(this, zzcenVar, zzfirVar), null));
            zzcenVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zzdkoVarZzd.zzi(), null, new VersionInfoParcel(0, 0, false), null, null, zzfiuVar.zzb));
            this.zzd.zzd();
            return zzgzo.zza(zzdkoVarZzd.zzh());
        } catch (Throwable th2) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in CustomTabsAdRenderer", th2);
            throw th2;
        }
    }

    final /* synthetic */ zzdxz zzd() {
        return this.zze;
    }
}
