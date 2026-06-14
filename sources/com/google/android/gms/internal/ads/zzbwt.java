package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbwt implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwu zza;

    zzbwt(zzbwu zzbwuVar) {
        Objects.requireNonNull(zzbwuVar);
        this.zza = zzbwuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzg("User canceled the download.");
    }
}
