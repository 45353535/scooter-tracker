package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzsg {

    @Nullable
    private final Context zza;
    private zzso zzb;

    @Nullable
    private zzps zzc;
    private zzsm zzd;

    public zzsg(@Nullable Context context) {
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzb = zzso.zza;
        if (context == null) {
            this.zzc = zzps.zza;
        }
    }

    public final zzsg zza(zzso zzsoVar) {
        this.zzb = zzsoVar;
        return this;
    }

    final zzsg zzb(@Nullable zzps zzpsVar) {
        if (this.zza == null) {
            this.zzc = zzpsVar;
        }
        return this;
    }

    public final zzsi zzc() {
        if (this.zzd == null) {
            this.zzd = new zzsm(this.zza);
        }
        return new zzsi(this, null);
    }

    final /* synthetic */ Context zzd() {
        return this.zza;
    }

    final /* synthetic */ zzps zze() {
        return this.zzc;
    }

    public final zzsg zzf(zzsm zzsmVar) {
        this.zzd = zzsmVar;
        return this;
    }

    final /* synthetic */ zzsm zzg() {
        return this.zzd;
    }
}
