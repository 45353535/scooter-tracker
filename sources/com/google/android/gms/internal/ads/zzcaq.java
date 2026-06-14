package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzcaq extends zzbct implements zzcar {
    public zzcaq() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzcar zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof zzcar ? (zzcar) iInterfaceQueryLocalInterface : new zzcap(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zze(iObjectWrapperAsInterface);
                break;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzf(iObjectWrapperAsInterface2, i12);
                break;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzg(iObjectWrapperAsInterface3);
                break;
            case 4:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzh(iObjectWrapperAsInterface4);
                break;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzi(iObjectWrapperAsInterface5);
                break;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzj(iObjectWrapperAsInterface6);
                break;
            case 7:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcas zzcasVar = (zzcas) zzbcu.zzb(parcel, zzcas.CREATOR);
                zzbcu.zzh(parcel);
                zzk(iObjectWrapperAsInterface7, zzcasVar);
                break;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzl(iObjectWrapperAsInterface8);
                break;
            case 9:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzm(iObjectWrapperAsInterface9, i13);
                break;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzn(iObjectWrapperAsInterface10);
                break;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzo(iObjectWrapperAsInterface11);
                break;
            case 12:
                zzbcu.zzh(parcel);
                break;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzp(iObjectWrapperAsInterface12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
