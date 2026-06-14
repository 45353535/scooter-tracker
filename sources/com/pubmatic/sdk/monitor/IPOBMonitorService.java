package com.pubmatic.sdk.monitor;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IPOBMonitorService extends IInterface {
    public static final String DESCRIPTOR = "com.pubmatic.sdk.monitor.IPOBMonitorService";

    public static abstract class Stub extends Binder implements IPOBMonitorService {

        private static class a implements IPOBMonitorService {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f62644a;

            a(IBinder iBinder) {
                this.f62644a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f62644a;
            }

            @Override // com.pubmatic.sdk.monitor.IPOBMonitorService
            public String getMonitorData() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPOBMonitorService.DESCRIPTOR);
                    this.f62644a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IPOBMonitorService.DESCRIPTOR);
        }

        public static IPOBMonitorService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IPOBMonitorService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPOBMonitorService)) ? new a(iBinder) : (IPOBMonitorService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.pubmatic.sdk.monitor.IPOBMonitorService
        public abstract /* synthetic */ String getMonitorData() throws RemoteException;

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(IPOBMonitorService.DESCRIPTOR);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(IPOBMonitorService.DESCRIPTOR);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            String monitorData = getMonitorData();
            parcel2.writeNoException();
            parcel2.writeString(monitorData);
            return true;
        }
    }

    String getMonitorData() throws RemoteException;
}
