package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {
    public static final String D8 = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* JADX INFO: renamed from: android.support.customtabs.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0006a extends Binder implements a {
        static final int TRANSACTION_extraCallback = 3;
        static final int TRANSACTION_extraCallbackWithResult = 7;
        static final int TRANSACTION_onActivityLayout = 10;
        static final int TRANSACTION_onActivityResized = 8;
        static final int TRANSACTION_onMessageChannelReady = 4;
        static final int TRANSACTION_onMinimized = 11;
        static final int TRANSACTION_onNavigationEvent = 2;
        static final int TRANSACTION_onPostMessage = 5;
        static final int TRANSACTION_onRelationshipValidationResult = 6;
        static final int TRANSACTION_onUnminimized = 12;
        static final int TRANSACTION_onWarmupCompleted = 9;

        /* JADX INFO: renamed from: android.support.customtabs.a$a$a, reason: collision with other inner class name */
        private static class C0007a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f4281b;

            C0007a(IBinder iBinder) {
                this.f4281b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4281b;
            }

            @Override // android.support.customtabs.a
            public void extraCallback(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.D8);
                    parcelObtain.writeString(str);
                    b.d(parcelObtain, bundle, 0);
                    this.f4281b.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public Bundle extraCallbackWithResult(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.D8);
                    parcelObtain.writeString(str);
                    b.d(parcelObtain, bundle, 0);
                    this.f4281b.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) b.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onActivityLayout(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.D8);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    parcelObtain.writeInt(i14);
                    b.d(parcelObtain, bundle, 0);
                    this.f4281b.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onActivityResized(int i10, int i11, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.D8);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    this.f4281b.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onMessageChannelReady(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.D8);
                    b.d(parcelObtain, bundle, 0);
                    this.f4281b.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onMinimized(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.D8);
                    b.d(parcelObtain, bundle, 0);
                    this.f4281b.transact(11, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onNavigationEvent(int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.D8);
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    this.f4281b.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onPostMessage(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.D8);
                    parcelObtain.writeString(str);
                    b.d(parcelObtain, bundle, 0);
                    this.f4281b.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.D8);
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, uri, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    b.d(parcelObtain, bundle, 0);
                    this.f4281b.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onUnminimized(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.D8);
                    b.d(parcelObtain, bundle, 0);
                    this.f4281b.transact(12, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onWarmupCompleted(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.D8);
                    b.d(parcelObtain, bundle, 0);
                    this.f4281b.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0006a() {
            attachInterface(this, a.D8);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.D8);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0007a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = a.D8;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    onNavigationEvent(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    extraCallback(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    onMessageChannelReady((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onPostMessage(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onRelationshipValidationResult(parcel.readInt(), (Uri) b.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleExtraCallbackWithResult = extraCallbackWithResult(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, bundleExtraCallbackWithResult, 1);
                    return true;
                case 8:
                    onActivityResized(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    onWarmupCompleted((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    onActivityLayout(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    onMinimized((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    onUnminimized((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
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

    void extraCallback(String str, Bundle bundle);

    Bundle extraCallbackWithResult(String str, Bundle bundle);

    void onActivityLayout(int i10, int i11, int i12, int i13, int i14, Bundle bundle);

    void onActivityResized(int i10, int i11, Bundle bundle);

    void onMessageChannelReady(Bundle bundle);

    void onMinimized(Bundle bundle);

    void onNavigationEvent(int i10, Bundle bundle);

    void onPostMessage(String str, Bundle bundle);

    void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle);

    void onUnminimized(Bundle bundle);

    void onWarmupCompleted(Bundle bundle);
}
