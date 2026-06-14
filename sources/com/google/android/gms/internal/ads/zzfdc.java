package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfdc {
    private final zzbzu zza;
    private final int zzb;

    public zzfdc(zzbzu zzbzuVar, int i10) {
        this.zza = zzbzuVar;
        this.zzb = i10;
    }

    public final String zza() {
        return this.zza.zzd;
    }

    public final String zzb() {
        return zzgrt.zza(this.zza.zza.getString("ms"));
    }

    @Nullable
    public final PackageInfo zzc() {
        return this.zza.zzf;
    }

    public final List zzd() {
        return this.zza.zze;
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final int zzf() {
        return this.zzb;
    }

    final boolean zzg() {
        return this.zza.zzk;
    }

    final boolean zzh() {
        return this.zza.zzl;
    }

    final int zzi() {
        Bundle bundle = this.zza.zza.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        if (bundle != null && !bundle.isEmpty()) {
            switch (bundle.getString("query_info_type", "")) {
            }
            return -1;
        }
        return -1;
    }

    final int zzj() {
        return this.zza.zzo;
    }
}
