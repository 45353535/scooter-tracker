package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzcki implements zzboh {
    final /* synthetic */ zzcko zza;

    zzcki(zzcko zzckoVar) {
        Objects.requireNonNull(zzckoVar);
        this.zza = zzckoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i10 = Integer.parseInt(str);
                zzcko zzckoVar = this.zza;
                synchronized (zzckoVar) {
                    try {
                        if (zzckoVar.zzaX() != i10) {
                            zzckoVar.zzaY(i10);
                            zzckoVar.requestLayout();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Exception occurred while getting webview content height", e10);
            }
        }
    }
}
