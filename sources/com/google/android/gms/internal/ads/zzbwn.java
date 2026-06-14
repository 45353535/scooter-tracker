package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbwn implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwo zza;

    zzbwn(zzbwo zzbwoVar) {
        Objects.requireNonNull(zzbwoVar);
        this.zza = zzbwoVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzg("Operation denied by user.");
    }
}
