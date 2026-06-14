package com.google.android.gms.internal.play_billing;

import com.ironsource.C4240b4;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzs extends zzo {
    final /* synthetic */ zzt zzg;

    zzs(zzt zztVar) {
        Objects.requireNonNull(zztVar);
        this.zzg = zztVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzo
    protected final String zza() {
        zzp zzpVar = (zzp) this.zzg.zza.get();
        if (zzpVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(zzpVar.zza) + C4240b4.j.f42674e;
    }
}
