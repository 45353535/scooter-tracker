package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeyr implements zzfav {
    public final Bundle zza;

    public zzeyr(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        Bundle bundleZza = zzfjz.zza(bundle, C4240b4.i.G);
        bundleZza.putBundle("android_mem_info", this.zza);
        bundle.putBundle(C4240b4.i.G, bundleZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
