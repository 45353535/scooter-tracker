package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
final class zzgyt extends zzgyr {
    private zzgyt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    final void zza(zzgyu zzgyuVar, Set set, Set set2) {
        synchronized (zzgyuVar) {
            try {
                if (zzgyuVar.seenExceptionsField == null) {
                    zzgyuVar.seenExceptionsField = set2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    final int zzb(zzgyu zzgyuVar) {
        int i10;
        synchronized (zzgyuVar) {
            i10 = zzgyuVar.remainingField - 1;
            zzgyuVar.remainingField = i10;
        }
        return i10;
    }

    /* synthetic */ zzgyt(byte[] bArr) {
        super(null);
    }
}
