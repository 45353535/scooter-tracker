package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzbyr;

/* JADX INFO: loaded from: classes7.dex */
public final class zzk extends RemoteCreator {
    private zzbyr zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzby(iBinder);
    }

    @Nullable
    public final zzbx zza(Context context, zzr zzrVar, String str, zzbtt zzbttVar, int i10) {
        zzbhe.zza(context);
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzmf)).booleanValue()) {
            try {
                IBinder iBinderZze = ((zzby) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzrVar, str, zzbttVar, ModuleDescriptor.MODULE_VERSION, i10);
                if (iBinderZze == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof zzbx ? (zzbx) iInterfaceQueryLocalInterface : new zzbv(iBinderZze);
            } catch (RemoteException e10) {
                e = e10;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteCreator.RemoteCreatorException e11) {
                e = e11;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder iBinderZze2 = ((zzby) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzj.zza)).zze(ObjectWrapper.wrap(context), zzrVar, str, zzbttVar, ModuleDescriptor.MODULE_VERSION, i10);
            if (iBinderZze2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderZze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface2 instanceof zzbx ? (zzbx) iInterfaceQueryLocalInterface2 : new zzbv(iBinderZze2);
        } catch (RemoteException e12) {
            e = e12;
            Throwable th2 = e;
            zzbyr zzbyrVarZza = zzbyp.zza(context);
            this.zza = zzbyrVarZza;
            zzbyrVarZza.zzh(th2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th2);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e13) {
            e = e13;
            Throwable th22 = e;
            zzbyr zzbyrVarZza2 = zzbyp.zza(context);
            this.zza = zzbyrVarZza2;
            zzbyrVarZza2.zzh(th22, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th22);
            return null;
        } catch (NullPointerException e14) {
            e = e14;
            Throwable th222 = e;
            zzbyr zzbyrVarZza22 = zzbyp.zza(context);
            this.zza = zzbyrVarZza22;
            zzbyrVarZza22.zzh(th222, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th222);
            return null;
        }
    }
}
