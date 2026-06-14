package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import j$.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzav implements DialogInterface.OnClickListener {
    final /* synthetic */ Context zza;

    zzav(zzaw zzawVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzawVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzab(this.zza, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
