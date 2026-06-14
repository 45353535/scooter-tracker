package com.google.android.gms.internal.ads;

import java.util.Map;
import net.pubnative.lite.sdk.utils.AtomManager;

/* JADX INFO: loaded from: classes8.dex */
final class zzbnv implements zzboh {
    zzbnv() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        if (map.containsKey("start")) {
            zzcjlVar.zzas(true);
        }
        if (map.containsKey(AtomManager.ATOM_STOP_METHOD_NAME)) {
            zzcjlVar.zzas(false);
        }
    }
}
