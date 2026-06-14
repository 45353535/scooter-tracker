package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbwz extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbwz(zzbkl zzbklVar) {
        try {
            this.zzb = zzbklVar.zzb();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbklVar.zzc()) {
                zzbks zzbksVarZzh = obj instanceof IBinder ? zzbkr.zzh((IBinder) obj) : null;
                if (zzbksVarZzh != null) {
                    this.zza.add(new zzbxb(zzbksVarZzh));
                }
            }
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
