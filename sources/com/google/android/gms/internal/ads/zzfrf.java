package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfrf {
    private final zzdxz zza;

    zzfrf(zzdxz zzdxzVar, Context context) {
        this.zza = zzdxzVar;
    }

    private final void zzt(String str, long j10, @Nullable String str2, @Nullable String str3, AdFormat adFormat, int i10, int i11, int i12, String str4) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("action", str);
        zzdxyVarZza.zzc("pat", Long.toString(j10));
        zzdxyVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        zzdxyVarZza.zzc("max_ads", Integer.toString(i10));
        zzdxyVarZza.zzc("cache_size", Integer.toString(i11));
        zzdxyVarZza.zzc("pas", Integer.toString(i12));
        zzdxyVarZza.zzc("pv", "2");
        zzdxyVarZza.zzc("ad_unit_id", str3);
        zzdxyVarZza.zzc("pid", str2);
        zzdxyVarZza.zzd();
    }

    private final void zzu(@Nullable String str, String str2, long j10, int i10, int i11, @Nullable String str3, @Nullable zzfrm zzfrmVar, String str4) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc(str2, Long.toString(j10));
        if (zzfrmVar != null) {
            zzdxyVarZza.zzc("ad_unit_id", zzfrmVar.zza());
            zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
            zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
        }
        zzdxyVarZza.zzc("action", str);
        if (str3 != null) {
            zzdxyVarZza.zzc("gqi", str3);
        }
        if (i10 >= 0) {
            zzdxyVarZza.zzc("max_ads", Integer.toString(i10));
        }
        if (i11 >= 0) {
            zzdxyVarZza.zzc("cache_size", Integer.toString(i11));
        }
        zzdxyVarZza.zzc("pv", str4);
        zzdxyVarZza.zzd();
    }

    private final void zzv(String str, long j10, String str2, String str3, @Nullable AdFormat adFormat, int i10, int i11, int i12, int i13, int i14) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("action", str);
        zzdxyVarZza.zzc("pat", Long.toString(j10));
        zzdxyVarZza.zzc("pid", str2);
        zzdxyVarZza.zzc("ad_unit_id", str3);
        zzdxyVarZza.zzc("max_ads", Integer.toString(i10));
        zzdxyVarZza.zzc("cache_size", Integer.toString(i11));
        zzdxyVarZza.zzc("tpcnt", Integer.toString(i13));
        zzdxyVarZza.zzc("mpl", Integer.toString(i14));
        if (adFormat != null) {
            zzdxyVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i12 > 0) {
            zzdxyVarZza.zzc("nptr", Integer.toString(i12));
        }
        zzdxyVarZza.zzd();
    }

    public final void zza(int i10, long j10, zzfrm zzfrmVar, String str) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("action", "start_preload");
        zzdxyVarZza.zzc("sp_ts", Long.toString(j10));
        zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
        zzdxyVarZza.zzc("ad_unit_id", zzfrmVar.zza());
        zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
        zzdxyVarZza.zzc("max_ads", Integer.toString(i10));
        zzdxyVarZza.zzc("pv", str);
        zzdxyVarZza.zzd();
    }

    public final void zzb(Map map, long j10, String str) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("action", "start_preload");
        zzdxyVarZza.zzc("sp_ts", Long.toString(j10));
        zzdxyVarZza.zzc("pv", "1");
        for (AdFormat adFormat : map.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zzdxyVarZza.zzc(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zzdxyVarZza.zzd();
    }

    public final void zzc(int i10, int i11, long j10, zzfrm zzfrmVar) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("action", "cache_resize");
        zzdxyVarZza.zzc("cs_ts", Long.toString(j10));
        zzdxyVarZza.zzc("orig_ma", Integer.toString(i10));
        zzdxyVarZza.zzc("max_ads", Integer.toString(i11));
        zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
        zzdxyVarZza.zzc("ad_unit_id", zzfrmVar.zza());
        zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
        zzdxyVarZza.zzc("pv", "1");
        zzdxyVarZza.zzd();
    }

    public final void zzd(int i10, int i11, long j10, @Nullable Long l10, @Nullable String str, @Nullable zzfrm zzfrmVar, String str2) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("plaac_ts", Long.toString(j10));
        zzdxyVarZza.zzc("max_ads", Integer.toString(i10));
        zzdxyVarZza.zzc("cache_size", Integer.toString(i11));
        zzdxyVarZza.zzc("action", "is_ad_available");
        if (zzfrmVar != null) {
            zzdxyVarZza.zzc("ad_unit_id", zzfrmVar.zza());
            zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
            zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
        }
        if (l10 != null) {
            zzdxyVarZza.zzc("plaay_ts", Long.toString(l10.longValue()));
        }
        if (str != null) {
            zzdxyVarZza.zzc("gqi", str);
        }
        zzdxyVarZza.zzc("pv", str2);
        zzdxyVarZza.zzd();
    }

    public final void zze(long j10, String str) {
        zzu("poll_ad", "ppacwe_ts", j10, -1, -1, null, null, "2");
    }

    public final void zzf(long j10, zzfrm zzfrmVar, int i10, int i11, String str) {
        zzu("poll_ad", "ppac_ts", j10, i10, i11, null, zzfrmVar, str);
    }

    public final void zzg(long j10, int i10, int i11, String str, zzfrm zzfrmVar, String str2) {
        zzu("poll_ad", "psvroc_ts", j10, i10, i11, str, zzfrmVar, str2);
    }

    public final void zzh(long j10, int i10, int i11, @Nullable String str, zzfrm zzfrmVar, String str2) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("ppla_ts", Long.toString(j10));
        zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
        zzdxyVarZza.zzc("ad_unit_id", zzfrmVar.zza());
        zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
        zzdxyVarZza.zzc("max_ads", Integer.toString(i10));
        zzdxyVarZza.zzc("cache_size", Integer.toString(i11));
        zzdxyVarZza.zzc("action", "poll_ad");
        if (str != null) {
            zzdxyVarZza.zzc("gqi", str);
        }
        zzdxyVarZza.zzc("pv", str2);
        zzdxyVarZza.zzd();
    }

    public final void zzi(long j10, @Nullable String str, zzfrm zzfrmVar, int i10, int i11, String str2) {
        zzu("paa", "pano_ts", j10, i10, i11, str, zzfrmVar, str2);
    }

    public final void zzj(long j10, zzfrm zzfrmVar, int i10, String str) {
        zzu("pae", "paeo_ts", j10, i10, 0, null, zzfrmVar, str);
    }

    public final void zzk(long j10, zzfrm zzfrmVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i10, int i11, String str) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("action", "pftla");
        zzdxyVarZza.zzc("pftlat_ts", Long.toString(j10));
        zzdxyVarZza.zzc("pftlaec", Integer.toString(zzeVar.zza));
        zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
        zzdxyVarZza.zzc("max_ads", Integer.toString(i10));
        zzdxyVarZza.zzc("cache_size", Integer.toString(i11));
        zzdxyVarZza.zzc("ad_unit_id", zzfrmVar.zza());
        zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
        zzdxyVarZza.zzc("pv", str);
        zzdxyVarZza.zzd();
    }

    public final void zzl(long j10, AdFormat adFormat, int i10) {
        zzt("pda", j10, null, null, adFormat, -1, -1, i10, "2");
    }

    public final void zzm(long j10, String str, String str2, AdFormat adFormat, int i10, int i11) {
        zzt("pd", j10, str, str2, adFormat, i10, i11, 1, "2");
    }

    public final void zzn(AdFormat adFormat, long j10, int i10) {
        zzt("pgcs", j10, null, null, adFormat, -1, -1, i10, "2");
    }

    public final void zzo(long j10, String str, @Nullable String str2, AdFormat adFormat, int i10, int i11) {
        zzt("pgc", j10, str, str2, adFormat, i10, i11, 1, "2");
    }

    public final void zzp(int i10, long j10, String str, @Nullable String str2, AdFormat adFormat, int i11) {
        zzt("pnav", j10, str, str2, adFormat, i11, i10, 1, "2");
    }

    public final void zzq(long j10, String str, String str2, @Nullable AdFormat adFormat, int i10, int i11, int i12, int i13) {
        zzv("acmpa", j10, str, str2, adFormat, i10, i11, 0, i12, i13);
    }

    public final void zzr(long j10, String str, String str2, @Nullable AdFormat adFormat, int i10, int i11, int i12, int i13, int i14) {
        zzv("acmpr", j10, str, str2, adFormat, i10, i11, i12, i13, i14);
    }

    public final void zzs(long j10, int i10, int i11) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("action", "acmlr");
        zzdxyVarZza.zzc("pat", Long.toString(j10));
        zzdxyVarZza.zzc("mpl", Integer.toString(i10));
        zzdxyVarZza.zzc("pas", Integer.toString(i11));
        zzdxyVarZza.zzd();
    }
}
