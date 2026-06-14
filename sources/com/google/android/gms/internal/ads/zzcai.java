package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzcai extends zzbct implements zzcaj {
    public zzcai() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzcan zzcanVar = (zzcan) zzbcu.zzb(parcel, zzcan.CREATOR);
            zzbcu.zzh(parcel);
            zzb(zzcanVar);
            parcel2.writeNoException();
        } else if (i10 != 2) {
            zzcam zzcakVar = null;
            zzcah zzcahVar = null;
            if (i10 == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzcakVar = iInterfaceQueryLocalInterface instanceof zzcam ? (zzcam) iInterfaceQueryLocalInterface : new zzcak(strongBinder);
                }
                zzbcu.zzh(parcel);
                zzd(zzcakVar);
                parcel2.writeNoException();
            } else if (i10 != 34) {
                switch (i10) {
                    case 5:
                        boolean zZze = zze();
                        parcel2.writeNoException();
                        int i12 = zzbcu.zza;
                        parcel2.writeInt(zZze ? 1 : 0);
                        break;
                    case 6:
                        zzf();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzg();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzi(iObjectWrapperAsInterface);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzj(iObjectWrapperAsInterface2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzk(iObjectWrapperAsInterface3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String strZzl = zzl();
                        parcel2.writeNoException();
                        parcel2.writeString(strZzl);
                        break;
                    case 13:
                        String string = parcel.readString();
                        zzbcu.zzh(parcel);
                        zzm(string);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        com.google.android.gms.ads.internal.client.zzcb zzcbVarZzb = com.google.android.gms.ads.internal.client.zzca.zzb(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzn(zzcbVarZzb);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle bundleZzo = zzo();
                        parcel2.writeNoException();
                        zzbcu.zzd(parcel2, bundleZzo);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzcahVar = iInterfaceQueryLocalInterface2 instanceof zzcah ? (zzcah) iInterfaceQueryLocalInterface2 : new zzcah(strongBinder2);
                        }
                        zzbcu.zzh(parcel);
                        zzu(zzcahVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        zzbcu.zzh(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzp(iObjectWrapperAsInterface4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String string2 = parcel.readString();
                        zzbcu.zzh(parcel);
                        zzq(string2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zZzs = zzs();
                        parcel2.writeNoException();
                        int i13 = zzbcu.zza;
                        parcel2.writeInt(zZzs ? 1 : 0);
                        break;
                    case 21:
                        com.google.android.gms.ads.internal.client.zzea zzeaVarZzt = zzt();
                        parcel2.writeNoException();
                        zzbcu.zze(parcel2, zzeaVarZzt);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zZza = zzbcu.zza(parcel);
                zzbcu.zzh(parcel);
                zzr(zZza);
                parcel2.writeNoException();
            }
        } else {
            zzc();
            parcel2.writeNoException();
        }
        return true;
    }
}
