package com.google.android.gms.internal.play_billing;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public class zzat extends Binder implements IInterface {
    private static zzav globalInterceptor;

    protected zzat(String str) {
        attachInterface(this, str);
    }

    static synchronized void installTransactionInterceptorPackagePrivate(zzav zzavVar) {
        if (zzavVar == null) {
            throw new IllegalArgumentException("null interceptor");
        }
        if (globalInterceptor != null) {
            throw new IllegalStateException("Duplicate TransactionInterceptor installation.");
        }
        globalInterceptor = zzavVar;
    }

    private boolean routeToSuperOrEnforceInterface(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 > 16777215) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    protected boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        return false;
    }

    protected void enforceNoDataAvail(Parcel parcel) {
        zzav zzavVar = globalInterceptor;
        if (zzavVar != null) {
            zzavVar.zza();
            return;
        }
        int i10 = zzau.zza;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (routeToSuperOrEnforceInterface(i10, parcel, parcel2, i11)) {
            return true;
        }
        zzav zzavVar = globalInterceptor;
        return zzavVar == null ? dispatchTransaction(i10, parcel, parcel2, i11) : zzavVar.zzb();
    }
}
