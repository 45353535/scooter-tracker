package com.google.android.gms.internal.auth;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzgk extends zzgu {
    zzgk(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgu
    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzb(); i10++) {
                Map.Entry entryZzg = zzg(i10);
                if (((zzeo) entryZzg.getKey()).zzc()) {
                    entryZzg.setValue(DesugarCollections.unmodifiableList((List) entryZzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzeo) entry.getKey()).zzc()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
