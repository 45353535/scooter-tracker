package com.google.android.gms.internal.location;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes8.dex */
final class zzas implements zzcs {

    @GuardedBy("this")
    private ListenerHolder zza;

    zzas(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized ListenerHolder zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized void zzc(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = this.zza;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.zza = listenerHolder;
        }
    }
}
