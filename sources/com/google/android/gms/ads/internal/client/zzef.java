package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzef extends zzbct implements zzeg {
    public zzef() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zze();
        } else if (i10 == 2) {
            zzf();
        } else if (i10 == 3) {
            zzg();
        } else if (i10 == 4) {
            zzh();
        } else {
            if (i10 != 5) {
                return false;
            }
            boolean zZza = zzbcu.zza(parcel);
            zzbcu.zzh(parcel);
            zzi(zZza);
        }
        parcel2.writeNoException();
        return true;
    }
}
