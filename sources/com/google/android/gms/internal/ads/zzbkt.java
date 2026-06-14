package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbkt extends NativeAd.Image {
    private final zzbks zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbkt(zzbks zzbksVar) {
        double dZzd;
        int iZze;
        IObjectWrapper iObjectWrapperZzb;
        this.zza = zzbksVar;
        Uri uriZzc = null;
        try {
            iObjectWrapperZzb = zzbksVar.zzb();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
        Drawable drawable = iObjectWrapperZzb != null ? (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzb) : null;
        this.zzb = drawable;
        try {
            uriZzc = this.zza.zzc();
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
        }
        this.zzc = uriZzc;
        try {
            dZzd = this.zza.zzd();
        } catch (RemoteException e12) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e12);
            dZzd = 1.0d;
        }
        this.zzd = dZzd;
        int iZzf = -1;
        try {
            iZze = this.zza.zze();
        } catch (RemoteException e13) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e13);
            iZze = -1;
        }
        this.zze = iZze;
        try {
            iZzf = this.zza.zzf();
        } catch (RemoteException e14) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e14);
        }
        this.zzf = iZzf;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zzb() {
        return this.zzf;
    }
}
