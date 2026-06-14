package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbou implements zzboh {

    @Nullable
    private final com.google.android.gms.ads.internal.zzb zza;

    @Nullable
    private final zzdxz zzb;

    @Nullable
    private final zzbwr zzd;

    @Nullable
    private final zzeiu zze;

    @Nullable
    private final zzcrv zzf;

    @Nullable
    private final zzdae zzg;

    @Nullable
    private com.google.android.gms.ads.internal.util.client.zzu zzc = null;
    private com.google.android.gms.ads.internal.overlay.zzaa zzh = null;
    private final zzgzy zzi = zzcei.zzg;

    public zzbou(com.google.android.gms.ads.internal.zzb zzbVar, zzbwr zzbwrVar, zzeiu zzeiuVar, zzdxz zzdxzVar, zzcrv zzcrvVar, zzdae zzdaeVar) {
        this.zza = zzbVar;
        this.zzd = zzbwrVar;
        this.zze = zzeiuVar;
        this.zzb = zzdxzVar;
        this.zzf = zzcrvVar;
        this.zzg = zzdaeVar;
    }

    public static boolean zzb(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzc(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if (CmcdData.Factory.STREAM_TYPE_LIVE.equalsIgnoreCase(str)) {
            return 6;
        }
        return ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM.equalsIgnoreCase(str) ? 14 : -1;
    }

    @VisibleForTesting
    static Uri zzd(Context context, zzazh zzazhVar, Uri uri, View view, @Nullable Activity activity, @Nullable zzfjo zzfjoVar) {
        if (zzazhVar != null) {
            try {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() || zzfjoVar == null) {
                    if (zzazhVar.zze(uri)) {
                        return zzazhVar.zzd(uri, context, view, activity);
                    }
                } else if (zzazhVar.zze(uri)) {
                    return zzfjoVar.zza(uri, context, view, activity);
                }
            } catch (zzazi unused) {
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    @VisibleForTesting
    static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e10) {
            String strValueOf = String.valueOf(uri.toString());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error adding click uptime parameter to url: ".concat(strValueOf), e10);
        }
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0369  */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.String r27, com.google.android.gms.ads.internal.client.zza r28, java.util.Map r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 1181
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbou.zzf(java.lang.String, com.google.android.gms.ads.internal.client.zza, java.util.Map, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzjQ)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzjL)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzjK)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzi(com.google.android.gms.ads.internal.client.zza r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbou.zzi(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    private final void zzj(Context context, String str, String str2) {
        zzeiu zzeiuVar = this.zze;
        zzeiuVar.zzd(str);
        zzdxz zzdxzVar = this.zzb;
        if (zzdxzVar != null) {
            zzejf.zzk(context, zzdxzVar, zzeiuVar, str, "dialog_not_shown", zzgui.zzb("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0152, code lost:
    
        r15 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzk(com.google.android.gms.ads.internal.client.zza r22, java.util.Map r23, boolean r24, java.lang.String r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbou.zzk(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void zzl(boolean z10) {
        zzbwr zzbwrVar = this.zzd;
        if (zzbwrVar != null) {
            zzbwrVar.zzb(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzg(int i10) {
        zzdxz zzdxzVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfy)).booleanValue() || (zzdxzVar = this.zzb) == null) {
            return;
        }
        zzdxy zzdxyVarZza = zzdxzVar.zza();
        zzdxyVarZza.zzc("action", "cct_action");
        switch (i10) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzdxyVarZza.zzc("cct_open_status", str);
        zzdxyVarZza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcrv zzcrvVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get(ApsMetricsDataMap.APSMETRICS_FIELD_URL);
        Map map2 = new HashMap();
        zzcjl zzcjlVar = (zzcjl) zzaVar;
        if (zzcjlVar.zzC() != null) {
            map2 = zzcjlVar.zzC().zzaw;
        }
        String strZza = zzccs.zza(str, zzcjlVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzb()) {
            zzgzo.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzly)).booleanValue() && (zzcrvVar = this.zzf) != null && zzcrv.zzc(strZza)) ? zzcrvVar.zzb(strZza, com.google.android.gms.ads.internal.client.zzbb.zzh()) : zzgzo.zza(strZza), new zzboq(this, map, zzaVar, str2), this.zzi);
        } else {
            zzbVar.zzc(strZza);
        }
    }
}
