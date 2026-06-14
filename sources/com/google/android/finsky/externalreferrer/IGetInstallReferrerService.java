package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.a.a;
import com.google.android.a.b;
import com.google.android.a.c;

/* JADX INFO: loaded from: classes7.dex */
public interface IGetInstallReferrerService extends IInterface {

    public static abstract class Stub extends b implements IGetInstallReferrerService {

        public static class Proxy extends a implements IGetInstallReferrerService {
            Proxy(IBinder iBinder) {
                super(iBinder);
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            public final Bundle c(Bundle bundle) throws RemoteException {
                Parcel parcelC = c();
                c.b(parcelC, bundle);
                Parcel parcelD = d(parcelC);
                Bundle bundle2 = (Bundle) c.a(parcelD, Bundle.CREATOR);
                parcelD.recycle();
                return bundle2;
            }
        }

        public static IGetInstallReferrerService b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof IGetInstallReferrerService ? (IGetInstallReferrerService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.a.b
        protected final boolean a(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i10 != 1) {
                return false;
            }
            Bundle bundleC = c((Bundle) c.a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            c.c(parcel2, bundleC);
            return true;
        }
    }

    Bundle c(Bundle bundle) throws RemoteException;
}
