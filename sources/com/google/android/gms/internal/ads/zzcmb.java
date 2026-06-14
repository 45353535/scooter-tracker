package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcmb {
    private VersionInfoParcel zza;
    private Context zzb;
    private long zzc;
    private WeakReference zzd;

    public final zzcmb zza(VersionInfoParcel versionInfoParcel) {
        this.zza = versionInfoParcel;
        return this;
    }

    public final zzcmb zzb(Context context) {
        this.zzd = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzcmb zzc(long j10) {
        this.zzc = j10;
        return this;
    }

    final /* synthetic */ VersionInfoParcel zzd() {
        return this.zza;
    }

    final /* synthetic */ Context zze() {
        return this.zzb;
    }

    final /* synthetic */ long zzf() {
        return this.zzc;
    }

    final /* synthetic */ WeakReference zzg() {
        return this.zzd;
    }
}
