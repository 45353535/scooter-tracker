package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzidx extends zzieb {
    zzidx() {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzieb
    public final void zza() {
        if (!zzb()) {
            for (int i10 = 0; i10 < zzc(); i10++) {
                Map.Entry entryZzd = zzd(i10);
                if (((zzibf) ((zzidy) entryZzd).zza()).zzd()) {
                    entryZzd.setValue(DesugarCollections.unmodifiableList((List) entryZzd.getValue()));
                }
            }
            for (Map.Entry entry : zze()) {
                if (((zzibf) entry.getKey()).zzd()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
