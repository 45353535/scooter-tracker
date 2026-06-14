package com.google.android.gms.internal.ads;

import android.view.View;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbwp implements View.OnClickListener {
    final /* synthetic */ zzbwr zza;

    zzbwp(zzbwr zzbwrVar) {
        Objects.requireNonNull(zzbwrVar);
        this.zza = zzbwrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzb(true);
    }
}
