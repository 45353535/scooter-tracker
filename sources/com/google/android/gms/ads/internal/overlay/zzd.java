package com.google.android.gms.ads.internal.overlay;

import android.view.View;
import j$.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzd implements View.OnClickListener {
    final /* synthetic */ zzm zza;

    zzd(zzm zzmVar) {
        Objects.requireNonNull(zzmVar);
        this.zza = zzmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzm zzmVar = this.zza;
        zzmVar.zzn = 2;
        zzmVar.zzb.finish();
    }
}
