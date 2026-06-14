package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcbl {
    @Nullable
    public static final zzcaz zza(Context context, String str, zzbtt zzbttVar) {
        try {
            IBinder iBinderZze = ((zzcbd) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzcbk.zza)).zze(ObjectWrapper.wrap(context), str, zzbttVar, ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof zzcaz ? (zzcaz) iInterfaceQueryLocalInterface : new zzcax(iBinderZze);
        } catch (RemoteException e10) {
            e = e10;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e11) {
            e = e11;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
