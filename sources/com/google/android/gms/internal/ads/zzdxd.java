package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.N6;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdxd implements zzdgh, com.google.android.gms.ads.internal.client.zza, zzdbz, zzdbj, zzdea {
    private final Context zzc;
    private final zzfkd zzd;
    private final zzdxz zze;
    private final zzfjc zzf;
    private final zzfir zzg;
    private final zzeiu zzh;
    private final String zzi;

    @Nullable
    private Boolean zzk;
    private long zzj = -1;

    @VisibleForTesting
    final AtomicBoolean zza = new AtomicBoolean(false);

    @VisibleForTesting
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final boolean zzl = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhK)).booleanValue();

    public zzdxd(Context context, zzfkd zzfkdVar, zzdxz zzdxzVar, zzfjc zzfjcVar, zzfir zzfirVar, zzeiu zzeiuVar, String str) {
        this.zzc = context;
        this.zzd = zzfkdVar;
        this.zze = zzdxzVar;
        this.zzf = zzfjcVar;
        this.zzg = zzfirVar;
        this.zzh = zzeiuVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        String strZzt;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbZ);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    try {
                        strZzt = com.google.android.gms.ads.internal.util.zzs.zzt(this.zzc);
                    } catch (RemoteException unused) {
                        strZzt = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzt != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzt);
                        } catch (RuntimeException e10) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    private final zzdxy zzg(String str) {
        zzfjc zzfjcVar = this.zzf;
        zzfjb zzfjbVar = zzfjcVar.zzb;
        zzdxy zzdxyVarZza = this.zze.zza();
        zzdxyVarZza.zza(zzfjbVar.zzb);
        zzfir zzfirVar = this.zzg;
        zzdxyVarZza.zzb(zzfirVar);
        zzdxyVarZza.zzc("action", str);
        zzdxyVarZza.zzc("ad_format", this.zzi.toUpperCase(Locale.ROOT));
        List list = zzfirVar.zzt;
        if (!list.isEmpty()) {
            zzdxyVarZza.zzc("ancn", (String) list.get(0));
        }
        if (zzfirVar.zzb()) {
            zzdxyVarZza.zzc("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzh().zzs(this.zzc) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zzdxyVarZza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            zzdxyVarZza.zzc("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhR)).booleanValue()) {
            boolean zZza = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(zzfjcVar);
            zzdxyVarZza.zzc("scar", String.valueOf(zZza));
            if (zZza) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfjcVar.zza.zza.zzd;
                zzdxyVarZza.zzc("ragent", zzmVar.zzp);
                zzdxyVarZza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzmVar)));
            }
        }
        return zzdxyVarZza;
    }

    private final void zzi(zzdxy zzdxyVar) {
        if (!this.zzg.zzb()) {
            zzdxyVar.zzd();
            return;
        }
        this.zzh.zze(new zzeiw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), this.zzf.zzb.zzb.zzb, zzdxyVar.zzg(), 2));
    }

    private final boolean zzj() {
        int i10 = this.zzg.zzb;
        return i10 == 2 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzi(zzg("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzl) {
            zzdxy zzdxyVarZzg = zzg("ifts");
            zzdxyVarZzg.zzc("reason", N6.G1);
            int i10 = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i10 = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i10 >= 0) {
                zzdxyVarZzg.zzc("arec", String.valueOf(i10));
            }
            String strZza = this.zzd.zza(str);
            if (strZza != null) {
                zzdxyVarZzg.zzc("areec", strZza);
            }
            zzdxyVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzd(zzdmb zzdmbVar) {
        if (this.zzl) {
            zzdxy zzdxyVarZzg = zzg("ifts");
            zzdxyVarZzg.zzc("reason", "exception");
            if (!TextUtils.isEmpty(zzdmbVar.getMessage())) {
                zzdxyVarZzg.zzc(NotificationCompat.CATEGORY_MESSAGE, zzdmbVar.getMessage());
            }
            zzdxyVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final void zzdG() {
        if (zzf()) {
            zzdxy zzdxyVarZzg = zzg("adapter_impression");
            zzdxyVarZzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzb.get()) {
                zzdxyVarZzg.zzc("po", "1");
                zzdxyVarZzg.zzc("pil", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            } else {
                zzdxyVarZzg.zzc("po", "0");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoZ)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzdxyVarZzg.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc) ? "1" : "0");
                zzdxyVarZzg.zzc("fg_show", true != this.zza.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpa)).booleanValue() && zzj()) {
                zzdxyVarZzg.zzc("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "1" : "0");
            }
            zzdxyVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final void zzdH() {
        if (zzf()) {
            zzg("adapter_shown").zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        if (zzf() || this.zzg.zzb()) {
            zzdxy zzdxyVarZzg = zzg("impression");
            zzdxyVarZzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                zzdxyVarZzg.zzc("p_imp_l", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoZ)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzdxyVarZzg.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc) ? "1" : "0");
                zzdxyVarZzg.zzc("fg_show", true == this.zza.get() ? "1" : "0");
            }
            zzi(zzdxyVarZzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zze() {
        if (this.zzl) {
            zzdxy zzdxyVarZzg = zzg("ifts");
            zzdxyVarZzg.zzc("reason", "blocked");
            zzdxyVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdea
    public final void zzk() {
        if (zzf()) {
            this.zzb.set(true);
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzdxy zzdxyVarZzg = zzg("presentation");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoZ)).booleanValue() && zzj()) {
                AtomicBoolean atomicBoolean = this.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                atomicBoolean.set(!com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc));
                zzdxyVarZzg.zzc("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpa)).booleanValue() && zzj()) {
                zzdxyVarZzg.zzc("fg_al", true != com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "0" : "1");
            }
            zzdxyVarZzg.zzd();
        }
    }
}
