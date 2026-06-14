package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbxb extends NativeAd.Image {
    private final zzbks zzb;

    @Nullable
    private final Drawable zzc;

    @Nullable
    private final Uri zzd;
    private final double zze;
    private final int zzf;
    private final int zzg;

    public zzbxb(zzbks zzbksVar) {
        Uri uriZzc;
        double dZzd;
        int iZze;
        IObjectWrapper iObjectWrapperZzb;
        this.zzb = zzbksVar;
        Map mapZzg = null;
        try {
            iObjectWrapperZzb = zzbksVar.zzb();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
        Drawable drawable = iObjectWrapperZzb != null ? (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzb) : null;
        this.zzc = drawable;
        try {
            uriZzc = this.zzb.zzc();
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
            uriZzc = null;
        }
        this.zzd = uriZzc;
        try {
            dZzd = this.zzb.zzd();
        } catch (RemoteException e12) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e12);
            dZzd = 1.0d;
        }
        this.zze = dZzd;
        int iZzf = -1;
        try {
            iZze = this.zzb.zze();
        } catch (RemoteException e13) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e13);
            iZze = -1;
        }
        this.zzf = iZze;
        try {
            iZzf = this.zzb.zzf();
        } catch (RemoteException e14) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e14);
        }
        this.zzg = iZzf;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeO)).booleanValue()) {
            try {
                mapZzg = this.zzb.zzg();
            } catch (RemoteException unused) {
            }
        }
        this.zza = mapZzg;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    @Nullable
    public final Drawable getDrawable() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    @Nullable
    public final Uri getUri() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zzb() {
        return this.zzg;
    }
}
