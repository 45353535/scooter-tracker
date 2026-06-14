package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.ironsource.N6;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfbk implements zzfav {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzfbk(String str, int i10, int i11, int i12, boolean z10, int i13) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = z10;
        this.zzf = i13;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        zzfjz.zzb(bundle, N6.Q0, this.zza, !TextUtils.isEmpty(r0));
        int i10 = this.zzb;
        zzfjz.zzc(bundle, "cnt", i10, i10 != -2);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle bundleZza = zzfjz.zza(bundle, C4240b4.i.G);
        bundle.putBundle(C4240b4.i.G, bundleZza);
        Bundle bundleZza2 = zzfjz.zza(bundleZza, "network");
        bundleZza.putBundle("network", bundleZza2);
        bundleZza2.putInt("active_network_state", this.zzf);
        bundleZza2.putBoolean("active_network_metered", this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
