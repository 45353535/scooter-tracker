package com.google.android.gms.internal.play_billing;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzho extends zzht {
    zzho() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzht
    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzc(); i10++) {
                Map.Entry entryZzg = zzg(i10);
                if (((zzfl) ((zzhp) entryZzg).zza()).zze()) {
                    entryZzg.setValue(DesugarCollections.unmodifiableList((List) entryZzg.getValue()));
                }
            }
            for (Map.Entry entry : zzd()) {
                if (((zzfl) entry.getKey()).zze()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
