package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdnp extends zzbko {
    private final zzdoh zza;
    private IObjectWrapper zzb;

    public zzdnp(zzdoh zzdohVar) {
        this.zza = zzdohVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final float zze() throws RemoteException {
        zzclv zzclvVarZzN;
        int i10;
        int i11;
        zzdoh zzdohVar = this.zza;
        if (zzdohVar.zzab() != 0.0f) {
            return zzdohVar.zzab();
        }
        if (zzdohVar.zzy() != null) {
            try {
                return zzdohVar.zzy().zzm();
            } catch (RemoteException e10) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Remote exception getting video controller aspect ratio.", e10);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznO)).booleanValue() && zzdohVar.zzU() != null && (zzclvVarZzN = zzdohVar.zzU().zzN()) != null && (i10 = zzclvVarZzN.zzb) >= 0 && (i11 = zzclvVarZzN.zza) > 0) {
            return i10 / i11;
        }
        zzbks zzbksVarZzD = zzdohVar.zzD();
        if (zzbksVarZzD == null) {
            return 0.0f;
        }
        float fZze = (zzbksVarZzD.zze() == -1 || zzbksVarZzD.zzf() == -1) ? 0.0f : zzbksVarZzD.zze() / zzbksVarZzD.zzf();
        return fZze == 0.0f ? zzb(zzbksVarZzD.zzb()) : fZze;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    @Nullable
    public final IObjectWrapper zzg() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbks zzbksVarZzD = this.zza.zzD();
        if (zzbksVarZzD == null) {
            return null;
        }
        return zzbksVarZzD.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final float zzh() throws RemoteException {
        zzdoh zzdohVar = this.zza;
        if (zzdohVar.zzy() != null) {
            return zzdohVar.zzy().zzj();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final float zzi() throws RemoteException {
        zzdoh zzdohVar = this.zza;
        if (zzdohVar.zzy() != null) {
            return zzdohVar.zzy().zzk();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzed zzj() throws RemoteException {
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final boolean zzk() throws RemoteException {
        return this.zza.zzy() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final boolean zzl() throws RemoteException {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final void zzm(zzbma zzbmaVar) {
        zzdoh zzdohVar = this.zza;
        if (zzdohVar.zzy() instanceof zzckr) {
            ((zzckr) zzdohVar.zzy()).zzv(zzbmaVar);
        }
    }
}
