package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzlz implements zzlr {
    public final zzwf zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzlz(zzwm zzwmVar, boolean z10) {
        this.zza = new zzwf(zzwmVar, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final Object zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final zzbf zzb() {
        return this.zza.zzz();
    }

    public final void zzc(int i10) {
        this.zzd = i10;
        this.zze = false;
        this.zzc.clear();
    }
}
