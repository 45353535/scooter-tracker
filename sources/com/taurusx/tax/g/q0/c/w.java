package com.taurusx.tax.g.q0.c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface w extends IInterface {

    public static class z implements w {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.taurusx.tax.g.q0.c.w
        public String w() throws RemoteException {
            return null;
        }

        @Override // com.taurusx.tax.g.q0.c.w
        public boolean z() throws RemoteException {
            return false;
        }
    }

    String w() throws RemoteException;

    boolean z() throws RemoteException;

    /* JADX INFO: renamed from: com.taurusx.tax.g.q0.c.w$w, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0801w extends Binder implements w {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f66298w = 1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f66299y = 2;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final String f66300z = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";

        /* JADX INFO: renamed from: com.taurusx.tax.g.q0.c.w$w$z */
        public static class z implements w {

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public static w f66301w;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public IBinder f66302z;

            public z(IBinder iBinder) {
                this.f66302z = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f66302z;
            }

            @Override // com.taurusx.tax.g.q0.c.w
            public String w() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0801w.f66300z);
                    if (!this.f66302z.transact(1, parcelObtain, parcelObtain2, 0) && AbstractBinderC0801w.y() != null) {
                        return AbstractBinderC0801w.y().w();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String y() {
                return AbstractBinderC0801w.f66300z;
            }

            @Override // com.taurusx.tax.g.q0.c.w
            public boolean z() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0801w.f66300z);
                    if (!this.f66302z.transact(2, parcelObtain, parcelObtain2, 0) && AbstractBinderC0801w.y() != null) {
                        return AbstractBinderC0801w.y().z();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0801w() {
            attachInterface(this, f66300z);
        }

        public static w y() {
            return z.f66301w;
        }

        public static w z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f66300z);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof w)) ? new z(iBinder) : (w) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(f66300z);
                String strW = w();
                parcel2.writeNoException();
                parcel2.writeString(strW);
                return true;
            }
            if (i10 != 2) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(f66300z);
                return true;
            }
            parcel.enforceInterface(f66300z);
            boolean z10 = z();
            parcel2.writeNoException();
            parcel2.writeInt(z10 ? 1 : 0);
            return true;
        }

        public static boolean z(w wVar) {
            if (z.f66301w != null || wVar == null) {
                return false;
            }
            z.f66301w = wVar;
            return true;
        }
    }
}
