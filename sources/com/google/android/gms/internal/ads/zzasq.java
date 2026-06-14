package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
final class zzasq implements zzast {
    final /* synthetic */ File zza;

    zzasq(zzasu zzasuVar, File file) {
        this.zza = file;
        Objects.requireNonNull(zzasuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzast
    public final File zza() {
        return this.zza;
    }
}
