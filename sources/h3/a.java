package h3;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: h3.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0891a extends Binder implements a {

        /* JADX INFO: renamed from: h3.a$a$a, reason: collision with other inner class name */
        private static class C0892a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f72950b;

            C0892a(IBinder iBinder) {
                this.f72950b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f72950b;
            }

            @Override // h3.a
            public int f(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    b.b(parcelObtain, bundle, 0);
                    this.f72950b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0892a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    int f(Bundle bundle);
}
