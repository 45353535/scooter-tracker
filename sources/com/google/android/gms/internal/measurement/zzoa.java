package com.google.android.gms.internal.measurement;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzoa extends zzoe {
    zzoa() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzoe
    public final void zza() {
        if (!zzb()) {
            for (int i10 = 0; i10 < zzc(); i10++) {
                Map.Entry entryZzd = zzd(i10);
                if (((zzlv) ((zzob) entryZzd).zza()).zzd()) {
                    entryZzd.setValue(DesugarCollections.unmodifiableList((List) entryZzd.getValue()));
                }
            }
            for (Map.Entry entry : zze()) {
                if (((zzlv) entry.getKey()).zzd()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
