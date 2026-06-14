package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
final class zzhia implements zzhic {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    zzhia(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhic
    public final boolean zza() {
        return this.zza.get();
    }
}
