package com.taurusx.tax.g.q0.s;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes11.dex */
public interface w extends IInterface {

    public static abstract class z extends Binder implements w {

        /* JADX INFO: renamed from: com.taurusx.tax.g.q0.s.w$z$z, reason: collision with other inner class name */
        public static class C0803z implements w {

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public IBinder f66305z;

            public C0803z(IBinder iBinder) {
                this.f66305z = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f66305z;
            }

            public final String z(String str, String str2, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f66305z.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                    return null;
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            }
        }

        public static w z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
                if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof w)) {
                    return (w) iInterfaceQueryLocalInterface;
                }
                return new C0803z(iBinder);
            } catch (Throwable th2) {
                th2.printStackTrace();
                return null;
            }
        }
    }
}
