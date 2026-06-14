package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfam implements zzfav {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;

    @Nullable
    public final String zzh;

    zzfam(boolean z10, boolean z11, String str, boolean z12, int i10, int i11, int i12, @Nullable String str2) {
        this.zza = z10;
        this.zzb = z11;
        this.zzc = str;
        this.zzd = z12;
        this.zze = i10;
        this.zzf = i11;
        this.zzg = i12;
        this.zzh = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        bundle.putString("js", this.zzc);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeD));
        bundle.putInt("target_api", this.zze);
        bundle.putInt(com.taurusx.tax.g.a.f66076n, this.zzf);
        bundle.putInt("lv", this.zzg);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgS)).booleanValue()) {
            String str = this.zzh;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(com.taurusx.tax.g.a.f66078s, str);
            }
        }
        Bundle bundleZza = zzfjz.zza(bundle, "sdk_env");
        bundleZza.putBoolean("mf", ((Boolean) zzbje.zzg.zze()).booleanValue());
        bundleZza.putBoolean("instant_app", this.zza);
        bundleZza.putBoolean("lite", this.zzb);
        bundleZza.putBoolean("is_privileged_process", this.zzd);
        bundle.putBundle("sdk_env", bundleZza);
        Bundle bundleZza2 = zzfjz.zza(bundleZza, "build_meta");
        bundleZza2.putString("cl", "839961582");
        bundleZza2.putString("rapid_rc", "dev");
        bundleZza2.putString("rapid_rollup", "HEAD");
        bundleZza.putBundle("build_meta", bundleZza2);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzdah) obj).zzb;
        bundle.putString("js", this.zzc);
        bundle.putInt("target_api", this.zze);
    }
}
