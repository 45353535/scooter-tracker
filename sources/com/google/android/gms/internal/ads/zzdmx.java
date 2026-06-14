package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.C4240b4;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzdmx implements zzboh {
    private final WeakReference zza;

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        zzdnb zzdnbVar = (zzdnb) this.zza.get();
        if (zzdnbVar != null && "_ac".equals((String) map.get(C4240b4.i.f42633j0))) {
            zzdnbVar.zzD().onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmj)).booleanValue()) {
                zzdnbVar.zzE().zzdu();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                zzdnbVar.zzE().zzdQ();
            }
        }
    }
}
