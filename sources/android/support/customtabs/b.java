package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {
    public static final String E8 = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    public static abstract class a extends Binder implements b {
        static final int TRANSACTION_extraCommand = 5;
        static final int TRANSACTION_isEngagementSignalsApiAvailable = 13;
        static final int TRANSACTION_mayLaunchUrl = 4;
        static final int TRANSACTION_newSession = 3;
        static final int TRANSACTION_newSessionWithExtras = 10;
        static final int TRANSACTION_postMessage = 8;
        static final int TRANSACTION_receiveFile = 12;
        static final int TRANSACTION_requestPostMessageChannel = 7;
        static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
        static final int TRANSACTION_setEngagementSignalsCallback = 14;
        static final int TRANSACTION_updateVisuals = 6;
        static final int TRANSACTION_validateRelationship = 9;
        static final int TRANSACTION_warmup = 2;

        /* JADX INFO: renamed from: android.support.customtabs.b$a$a, reason: collision with other inner class name */
        private static class C0008a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f4282b;

            C0008a(IBinder iBinder) {
                this.f4282b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4282b;
            }

            @Override // android.support.customtabs.b
            public Bundle extraCommand(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.E8);
                    parcelObtain.writeString(str);
                    C0009b.f(parcelObtain, bundle, 0);
                    this.f4282b.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) C0009b.d(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean isEngagementSignalsApiAvailable(android.support.customtabs.a aVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.E8);
                    parcelObtain.writeStrongInterface(aVar);
                    C0009b.f(parcelObtain, bundle, 0);
                    this.f4282b.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean mayLaunchUrl(android.support.customtabs.a aVar, Uri uri, Bundle bundle, List list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.E8);
                    parcelObtain.writeStrongInterface(aVar);
                    C0009b.f(parcelObtain, uri, 0);
                    C0009b.f(parcelObtain, bundle, 0);
                    C0009b.e(parcelObtain, list, 0);
                    this.f4282b.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean newSession(android.support.customtabs.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.E8);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f4282b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean newSessionWithExtras(android.support.customtabs.a aVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.E8);
                    parcelObtain.writeStrongInterface(aVar);
                    C0009b.f(parcelObtain, bundle, 0);
                    this.f4282b.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public int postMessage(android.support.customtabs.a aVar, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.E8);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    C0009b.f(parcelObtain, bundle, 0);
                    this.f4282b.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean receiveFile(android.support.customtabs.a aVar, Uri uri, int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.E8);
                    parcelObtain.writeStrongInterface(aVar);
                    C0009b.f(parcelObtain, uri, 0);
                    parcelObtain.writeInt(i10);
                    C0009b.f(parcelObtain, bundle, 0);
                    this.f4282b.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean requestPostMessageChannel(android.support.customtabs.a aVar, Uri uri) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.E8);
                    parcelObtain.writeStrongInterface(aVar);
                    C0009b.f(parcelObtain, uri, 0);
                    this.f4282b.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean requestPostMessageChannelWithExtras(android.support.customtabs.a aVar, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.E8);
                    parcelObtain.writeStrongInterface(aVar);
                    C0009b.f(parcelObtain, uri, 0);
                    C0009b.f(parcelObtain, bundle, 0);
                    this.f4282b.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean setEngagementSignalsCallback(android.support.customtabs.a aVar, IBinder iBinder, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.E8);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeStrongBinder(iBinder);
                    C0009b.f(parcelObtain, bundle, 0);
                    this.f4282b.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean updateVisuals(android.support.customtabs.a aVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.E8);
                    parcelObtain.writeStrongInterface(aVar);
                    C0009b.f(parcelObtain, bundle, 0);
                    this.f4282b.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean validateRelationship(android.support.customtabs.a aVar, int i10, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.E8);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeInt(i10);
                    C0009b.f(parcelObtain, uri, 0);
                    C0009b.f(parcelObtain, bundle, 0);
                    this.f4282b.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean warmup(long j10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.E8);
                    parcelObtain.writeLong(j10);
                    this.f4282b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, b.E8);
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.E8);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0008a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = b.E8;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    boolean zWarmup = warmup(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zWarmup ? 1 : 0);
                    return true;
                case 3:
                    boolean zNewSession = newSession(a.AbstractBinderC0006a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zNewSession ? 1 : 0);
                    return true;
                case 4:
                    android.support.customtabs.a aVarAsInterface = a.AbstractBinderC0006a.asInterface(parcel.readStrongBinder());
                    Uri uri = (Uri) C0009b.d(parcel, Uri.CREATOR);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean zMayLaunchUrl = mayLaunchUrl(aVarAsInterface, uri, (Bundle) C0009b.d(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(zMayLaunchUrl ? 1 : 0);
                    return true;
                case 5:
                    Bundle bundleExtraCommand = extraCommand(parcel.readString(), (Bundle) C0009b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    C0009b.f(parcel2, bundleExtraCommand, 1);
                    return true;
                case 6:
                    boolean zUpdateVisuals = updateVisuals(a.AbstractBinderC0006a.asInterface(parcel.readStrongBinder()), (Bundle) C0009b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdateVisuals ? 1 : 0);
                    return true;
                case 7:
                    boolean zRequestPostMessageChannel = requestPostMessageChannel(a.AbstractBinderC0006a.asInterface(parcel.readStrongBinder()), (Uri) C0009b.d(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestPostMessageChannel ? 1 : 0);
                    return true;
                case 8:
                    int iPostMessage = postMessage(a.AbstractBinderC0006a.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) C0009b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iPostMessage);
                    return true;
                case 9:
                    boolean zValidateRelationship = validateRelationship(a.AbstractBinderC0006a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Uri) C0009b.d(parcel, Uri.CREATOR), (Bundle) C0009b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zValidateRelationship ? 1 : 0);
                    return true;
                case 10:
                    boolean zNewSessionWithExtras = newSessionWithExtras(a.AbstractBinderC0006a.asInterface(parcel.readStrongBinder()), (Bundle) C0009b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zNewSessionWithExtras ? 1 : 0);
                    return true;
                case 11:
                    boolean zRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(a.AbstractBinderC0006a.asInterface(parcel.readStrongBinder()), (Uri) C0009b.d(parcel, Uri.CREATOR), (Bundle) C0009b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestPostMessageChannelWithExtras ? 1 : 0);
                    return true;
                case 12:
                    boolean zReceiveFile = receiveFile(a.AbstractBinderC0006a.asInterface(parcel.readStrongBinder()), (Uri) C0009b.d(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) C0009b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zReceiveFile ? 1 : 0);
                    return true;
                case 13:
                    boolean zIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(a.AbstractBinderC0006a.asInterface(parcel.readStrongBinder()), (Bundle) C0009b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsEngagementSignalsApiAvailable ? 1 : 0);
                    return true;
                case 14:
                    boolean engagementSignalsCallback = setEngagementSignalsCallback(a.AbstractBinderC0006a.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) C0009b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(engagementSignalsCallback ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.customtabs.b$b, reason: collision with other inner class name */
    public static class C0009b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object d(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void e(Parcel parcel, List list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                f(parcel, (Parcelable) list.get(i11), i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void f(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    Bundle extraCommand(String str, Bundle bundle);

    boolean isEngagementSignalsApiAvailable(android.support.customtabs.a aVar, Bundle bundle);

    boolean mayLaunchUrl(android.support.customtabs.a aVar, Uri uri, Bundle bundle, List list);

    boolean newSession(android.support.customtabs.a aVar);

    boolean newSessionWithExtras(android.support.customtabs.a aVar, Bundle bundle);

    int postMessage(android.support.customtabs.a aVar, String str, Bundle bundle);

    boolean receiveFile(android.support.customtabs.a aVar, Uri uri, int i10, Bundle bundle);

    boolean requestPostMessageChannel(android.support.customtabs.a aVar, Uri uri);

    boolean requestPostMessageChannelWithExtras(android.support.customtabs.a aVar, Uri uri, Bundle bundle);

    boolean setEngagementSignalsCallback(android.support.customtabs.a aVar, IBinder iBinder, Bundle bundle);

    boolean updateVisuals(android.support.customtabs.a aVar, Bundle bundle);

    boolean validateRelationship(android.support.customtabs.a aVar, int i10, Uri uri, Bundle bundle);

    boolean warmup(long j10);
}
