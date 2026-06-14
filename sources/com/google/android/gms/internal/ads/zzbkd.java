package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbkd extends zzbkr {
    private final Drawable zza;
    private final Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;

    @Nullable
    private final Map zzf;

    public zzbkd(Drawable drawable, Uri uri, double d10, int i10, int i11, @Nullable Map map) {
        this.zza = drawable;
        this.zzb = uri;
        this.zzc = d10;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final IObjectWrapper zzb() throws RemoteException {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final Uri zzc() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final double zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final int zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    @Nullable
    public final Map zzg() {
        return this.zzf;
    }
}
