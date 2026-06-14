package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbkm extends NativeAd.AdChoicesInfo {
    private final zzbkl zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbkm(zzbkl zzbklVar) {
        IBinder iBinder;
        this.zza = zzbklVar;
        try {
            this.zzc = zzbklVar.zzb();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbklVar.zzc()) {
                zzbks zzbkqVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbkqVar = iInterfaceQueryLocalInterface instanceof zzbks ? (zzbks) iInterfaceQueryLocalInterface : new zzbkq(iBinder);
                }
                if (zzbkqVar != null) {
                    this.zzb.add(new zzbkt(zzbkqVar));
                }
            }
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
