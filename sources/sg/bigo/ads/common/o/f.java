package sg.bigo.ads.common.o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.taurusx.tax.g.q0.c.w;

/* JADX INFO: loaded from: classes4.dex */
public interface f extends IInterface {

    public static abstract class a extends Binder implements f {

        /* JADX INFO: renamed from: sg.bigo.ads.common.o.f$a$a, reason: collision with other inner class name */
        static class C1267a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f102603a;

            C1267a(IBinder iBinder) {
                this.f102603a = iBinder;
            }

            @Override // sg.bigo.ads.common.o.f
            public final String a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.AbstractBinderC0801w.f66300z);
                    this.f102603a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f102603a;
            }

            @Override // sg.bigo.ads.common.o.f
            public final boolean b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.AbstractBinderC0801w.f66300z);
                    this.f102603a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static f a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(w.AbstractBinderC0801w.f66300z);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f)) ? new C1267a(iBinder) : (f) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
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

    String a();

    boolean b();
}
