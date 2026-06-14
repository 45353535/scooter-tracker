package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
final class zzcol implements zzefw {
    private final zzcnp zza;
    private Context zzb;

    /* synthetic */ zzcol(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefw
    public final zzefx zza() {
        zziko.zzc(this.zzb, Context.class);
        return new zzcom(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzefw
    public final /* bridge */ /* synthetic */ zzefw zzb(Context context) {
        this.zzb = context;
        return this;
    }
}
