package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.a;

/* JADX INFO: loaded from: classes.dex */
public interface d extends IInterface {
    public static final String G8 = "android$support$customtabs$IPostMessageService".replace('$', '.');

    public static abstract class a extends Binder implements d {
        static final int TRANSACTION_onMessageChannelReady = 2;
        static final int TRANSACTION_onPostMessage = 3;

        /* JADX INFO: renamed from: android.support.customtabs.d$a$a, reason: collision with other inner class name */
        private static class C0011a implements d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f4284b;

            C0011a(IBinder iBinder) {
                this.f4284b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4284b;
            }

            @Override // android.support.customtabs.d
            public void onMessageChannelReady(android.support.customtabs.a aVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.G8);
                    parcelObtain.writeStrongInterface(aVar);
                    b.d(parcelObtain, bundle, 0);
                    this.f4284b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.d
            public void onPostMessage(android.support.customtabs.a aVar, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.G8);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    b.d(parcelObtain, bundle, 0);
                    this.f4284b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, d.G8);
        }

        public static d asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(d.G8);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new C0011a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = d.G8;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 2) {
                onMessageChannelReady(a.AbstractBinderC0006a.asInterface(parcel.readStrongBinder()), (Bundle) b.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                onPostMessage(a.AbstractBinderC0006a.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            }
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

    void onMessageChannelReady(android.support.customtabs.a aVar, Bundle bundle);

    void onPostMessage(android.support.customtabs.a aVar, String str, Bundle bundle);
}
