package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzday extends com.google.android.gms.ads.internal.client.zzdz {
    private final String zza;

    @Nullable
    private final String zzb;
    private final String zzc;

    @Nullable
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;

    @Nullable
    private final zzekl zzh;
    private final Bundle zzi;
    private final double zzj;
    private final int zzk;

    public zzday(@Nullable zzfir zzfirVar, String str, zzekl zzeklVar, @Nullable zzfiu zzfiuVar, String str2) {
        String string = null;
        this.zzb = zzfirVar == null ? null : zzfirVar.zzab;
        this.zzc = str2;
        this.zzd = zzfiuVar == null ? null : zzfiuVar.zzb;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfirVar != null) {
            try {
                string = zzfirVar.zzv.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = string != null ? string : str;
        this.zze = zzeklVar.zzh();
        this.zzh = zzeklVar;
        this.zzj = zzfirVar == null ? 0.0d : zzfirVar.zzaz;
        this.zzk = zzfirVar == null ? 2 : zzfirVar.zzaH;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhI)).booleanValue() || zzfiuVar == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzfiuVar.zzk;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhJ)).booleanValue() && zzfirVar != null) {
            Bundle bundle = zzfirVar.zzaF;
            Bundle bundle2 = this.zzi;
            if (bundle2 != null) {
                bundle2.putAll(bundle);
            }
        }
        this.zzg = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkH)).booleanValue() || zzfiuVar == null || TextUtils.isEmpty(zzfiuVar.zzi)) ? "" : zzfiuVar.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    @Nullable
    public final String zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final List zzg() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzv zzh() {
        zzekl zzeklVar = this.zzh;
        if (zzeklVar != null) {
            return zzeklVar.zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final Bundle zzi() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzj() {
        return this.zzc;
    }

    @Nullable
    public final String zzk() {
        return this.zzd;
    }

    public final double zzl() {
        return this.zzj;
    }

    public final int zzm() {
        return this.zzk;
    }
}
