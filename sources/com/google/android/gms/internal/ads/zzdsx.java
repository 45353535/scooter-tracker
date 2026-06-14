package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdsx implements zzboh {

    @Nullable
    private final zzblw zza;
    private final zzdtk zzb;
    private final zzika zzc;

    public zzdsx(zzdor zzdorVar, zzdoh zzdohVar, zzdtk zzdtkVar, zzika zzikaVar) {
        this.zza = zzdorVar.zzg(zzdohVar.zzS());
        this.zzb = zzdtkVar;
        this.zzc = zzikaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzblm) this.zzc.zzb(), str);
        } catch (RemoteException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40);
            sb2.append("Failed to call onCustomClick for asset ");
            sb2.append(str);
            sb2.append(".");
            String string = sb2.toString();
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(string, e10);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzd("/nativeAdCustomClick", this);
    }
}
