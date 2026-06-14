package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbpc implements zzboh {
    private final zzebf zza;

    public zzbpc(zzebf zzebfVar) {
        Preconditions.checkNotNull(zzebfVar, "The Inspector Manager must not be null");
        this.zza = zzebfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
            return;
        }
        long j10 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j10 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi((String) map.get(HandleInvocationsFromAdViewer.KEY_EXTRAS), j10);
    }
}
