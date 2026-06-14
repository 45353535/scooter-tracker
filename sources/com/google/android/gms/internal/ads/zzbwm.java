package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbwm implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwo zza;

    zzbwm(zzbwo zzbwoVar) {
        Objects.requireNonNull(zzbwoVar);
        this.zza = zzbwoVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        zzbwo zzbwoVar = this.zza;
        Intent intentZzb = zzbwoVar.zzb();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzaa(zzbwoVar.zzc(), intentZzb);
    }
}
