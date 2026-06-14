package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.ironsource.Sd;

/* JADX INFO: loaded from: classes8.dex */
public final class zzan extends zzas implements zzap {
    zzan(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final int zza(int i10, String str, String str2) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(3);
        parcelZzt.writeString(str);
        parcelZzt.writeString(str2);
        Parcel parcelZzu = zzu(5, parcelZzt);
        int i11 = parcelZzu.readInt();
        parcelZzu.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final int zzb(int i10, String str, String str2) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(i10);
        parcelZzt.writeString(str);
        parcelZzt.writeString(str2);
        Parcel parcelZzu = zzu(1, parcelZzt);
        int i11 = parcelZzu.readInt();
        parcelZzu.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final int zzc(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(i10);
        parcelZzt.writeString(str);
        parcelZzt.writeString(str2);
        zzau.zzb(parcelZzt, bundle);
        Parcel parcelZzu = zzu(10, parcelZzt);
        int i11 = parcelZzu.readInt();
        parcelZzu.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle zzd(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(9);
        parcelZzt.writeString(str);
        parcelZzt.writeString(str2);
        zzau.zzb(parcelZzt, bundle);
        Parcel parcelZzu = zzu(902, parcelZzt);
        Bundle bundle2 = (Bundle) zzau.zza(parcelZzu, Bundle.CREATOR);
        parcelZzu.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle zze(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(9);
        parcelZzt.writeString(str);
        parcelZzt.writeString(str2);
        zzau.zzb(parcelZzt, bundle);
        Parcel parcelZzu = zzu(12, parcelZzt);
        Bundle bundle2 = (Bundle) zzau.zza(parcelZzu, Bundle.CREATOR);
        parcelZzu.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle zzf(int i10, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(3);
        parcelZzt.writeString(str);
        parcelZzt.writeString(str2);
        parcelZzt.writeString(str3);
        parcelZzt.writeString(null);
        Parcel parcelZzu = zzu(3, parcelZzt);
        Bundle bundle = (Bundle) zzau.zza(parcelZzu, Bundle.CREATOR);
        parcelZzu.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle zzg(int i10, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(i10);
        parcelZzt.writeString(str);
        parcelZzt.writeString(str2);
        parcelZzt.writeString(str3);
        parcelZzt.writeString(null);
        zzau.zzb(parcelZzt, bundle);
        Parcel parcelZzu = zzu(8, parcelZzt);
        Bundle bundle2 = (Bundle) zzau.zza(parcelZzu, Bundle.CREATOR);
        parcelZzu.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle zzh(int i10, String str, String str2, String str3) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(3);
        parcelZzt.writeString(str);
        parcelZzt.writeString(str2);
        parcelZzt.writeString(str3);
        Parcel parcelZzu = zzu(4, parcelZzt);
        Bundle bundle = (Bundle) zzau.zza(parcelZzu, Bundle.CREATOR);
        parcelZzu.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle zzi(int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(i10);
        parcelZzt.writeString(str);
        parcelZzt.writeString(str2);
        parcelZzt.writeString(str3);
        zzau.zzb(parcelZzt, bundle);
        Parcel parcelZzu = zzu(11, parcelZzt);
        Bundle bundle2 = (Bundle) zzau.zza(parcelZzu, Bundle.CREATOR);
        parcelZzu.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle zzj(int i10, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(i10);
        parcelZzt.writeString(str);
        parcelZzt.writeString(str2);
        zzau.zzb(parcelZzt, bundle);
        zzau.zzb(parcelZzt, bundle2);
        Parcel parcelZzu = zzu(901, parcelZzt);
        Bundle bundle3 = (Bundle) zzau.zza(parcelZzu, Bundle.CREATOR);
        parcelZzu.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzk(int i10, String str, Bundle bundle, zzx zzxVar) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(21);
        parcelZzt.writeString(str);
        zzau.zzb(parcelZzt, bundle);
        zzau.zzc(parcelZzt, zzxVar);
        zzw(1501, parcelZzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzl(int i10, String str, Bundle bundle, zzz zzzVar) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(22);
        parcelZzt.writeString(str);
        zzau.zzb(parcelZzt, bundle);
        zzau.zzc(parcelZzt, zzzVar);
        zzw(1801, parcelZzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzm(Bundle bundle, zzac zzacVar) throws RemoteException {
        Parcel parcelZzt = zzt();
        zzau.zzb(parcelZzt, bundle);
        zzau.zzc(parcelZzt, zzacVar);
        zzw(2001, parcelZzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzn(int i10, String str, Bundle bundle, zzae zzaeVar) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(21);
        parcelZzt.writeString(str);
        zzau.zzb(parcelZzt, bundle);
        zzau.zzc(parcelZzt, zzaeVar);
        zzw(1601, parcelZzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzo(int i10, String str, Bundle bundle, zzag zzagVar) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(18);
        parcelZzt.writeString(str);
        zzau.zzb(parcelZzt, bundle);
        zzau.zzc(parcelZzt, zzagVar);
        zzv(Sd.c.f41757e, parcelZzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzp(int i10, String str, Bundle bundle, zzai zzaiVar) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(i10);
        parcelZzt.writeString(str);
        zzau.zzb(parcelZzt, bundle);
        zzau.zzc(parcelZzt, zzaiVar);
        zzw(1901, parcelZzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzq(int i10, String str, Bundle bundle, zzak zzakVar) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(21);
        parcelZzt.writeString(str);
        zzau.zzb(parcelZzt, bundle);
        zzau.zzc(parcelZzt, zzakVar);
        zzw(1401, parcelZzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzr(int i10, String str, Bundle bundle, zzam zzamVar) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(24);
        parcelZzt.writeString(str);
        zzau.zzb(parcelZzt, bundle);
        zzau.zzc(parcelZzt, zzamVar);
        zzw(1701, parcelZzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzs(int i10, String str, Bundle bundle, zzar zzarVar) throws RemoteException {
        Parcel parcelZzt = zzt();
        parcelZzt.writeInt(12);
        parcelZzt.writeString(str);
        zzau.zzb(parcelZzt, bundle);
        zzau.zzc(parcelZzt, zzarVar);
        zzv(Sd.a.f41742b, parcelZzt);
    }
}
