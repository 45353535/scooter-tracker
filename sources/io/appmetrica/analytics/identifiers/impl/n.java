package io.appmetrica.analytics.identifiers.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taurusx.tax.g.q0.c.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class n extends Binder implements o {
    public n() {
        attachInterface(this, w.AbstractBinderC0801w.f66300z);
    }

    public static o a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(w.AbstractBinderC0801w.f66300z);
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof o)) ? new m(iBinder) : (o) iInterfaceQueryLocalInterface;
    }

    public abstract /* synthetic */ String a() throws RemoteException;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public abstract /* synthetic */ boolean b() throws RemoteException;

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            parcel.enforceInterface(w.AbstractBinderC0801w.f66300z);
            String strA = a();
            parcel2.writeNoException();
            parcel2.writeString(strA);
            return true;
        }
        if (i10 != 2) {
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString(w.AbstractBinderC0801w.f66300z);
            return true;
        }
        parcel.enforceInterface(w.AbstractBinderC0801w.f66300z);
        boolean zB = b();
        parcel2.writeNoException();
        parcel2.writeInt(zB ? 1 : 0);
        return true;
    }
}
