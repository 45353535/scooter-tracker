package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {
    public static final String H8 = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace('$', '.');

    /* JADX INFO: renamed from: android.support.customtabs.trusted.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0012a extends Binder implements a {
        static final int TRANSACTION_onExtraCallback = 2;

        /* JADX INFO: renamed from: android.support.customtabs.trusted.a$a$a, reason: collision with other inner class name */
        private static class C0013a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f4285b;

            C0013a(IBinder iBinder) {
                this.f4285b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4285b;
            }

            @Override // android.support.customtabs.trusted.a
            public void onExtraCallback(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.H8);
                    parcelObtain.writeString(str);
                    b.d(parcelObtain, bundle, 0);
                    this.f4285b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0012a() {
            attachInterface(this, a.H8);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.H8);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0013a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = a.H8;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 2) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            onExtraCallback(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    void onExtraCallback(String str, Bundle bundle);
}
