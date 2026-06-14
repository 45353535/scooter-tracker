package com.taurusx.tax.g.q0.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes11.dex */
public interface w extends IInterface {

    public static class z implements w {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public IBinder f66295z;

        public z(IBinder iBinder) {
            this.f66295z = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f66295z;
        }

        public final String w() {
            String string;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                this.f66295z.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                th2.printStackTrace();
                string = null;
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return string;
        }
    }
}
