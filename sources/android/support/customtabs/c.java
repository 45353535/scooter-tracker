package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {
    public static final String F8 = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    public static abstract class a extends Binder implements c {
        static final int TRANSACTION_onGreatestScrollPercentageIncreased = 3;
        static final int TRANSACTION_onSessionEnded = 4;
        static final int TRANSACTION_onVerticalScrollEvent = 2;

        /* JADX INFO: renamed from: android.support.customtabs.c$a$a, reason: collision with other inner class name */
        private static class C0010a implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f4283b;

            C0010a(IBinder iBinder) {
                this.f4283b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4283b;
            }

            @Override // android.support.customtabs.c
            public void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.F8);
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    this.f4283b.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public void onSessionEnded(boolean z10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.F8);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    b.d(parcelObtain, bundle, 0);
                    this.f4283b.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public void onVerticalScrollEvent(boolean z10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.F8);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    b.d(parcelObtain, bundle, 0);
                    this.f4283b.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, c.F8);
        }

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.F8);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0010a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = c.F8;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 2) {
                onVerticalScrollEvent(parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
            } else if (i10 == 3) {
                onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
            } else {
                if (i10 != 4) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                onSessionEnded(parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
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

    void onGreatestScrollPercentageIncreased(int i10, Bundle bundle);

    void onSessionEnded(boolean z10, Bundle bundle);

    void onVerticalScrollEvent(boolean z10, Bundle bundle);
}
