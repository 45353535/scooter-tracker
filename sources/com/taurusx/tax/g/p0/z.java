package com.taurusx.tax.g.p0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.taurusx.tax.log.LogUtil;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes11.dex */
public class z {

    public static final class c implements IInterface {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public IBinder f66273z;

        public c(IBinder iBinder) {
            this.f66273z = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f66273z;
        }

        public String y() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f66273z.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public boolean z(boolean z10) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z10 ? 1 : 0);
                this.f66273z.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public static final class w {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f66274w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final String f66275z;

        public w(String str, boolean z10) {
            this.f66275z = str;
            this.f66274w = z10;
        }

        public boolean w() {
            return this.f66274w;
        }

        public String z() {
            return this.f66275z;
        }
    }

    public static final class y implements ServiceConnection {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f66276w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f66277z;

        public y() {
            this.f66277z = false;
            this.f66276w = new LinkedBlockingQueue<>(1);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f66276w.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public IBinder z() throws InterruptedException {
            if (this.f66277z) {
                throw new IllegalStateException();
            }
            this.f66277z = true;
            return this.f66276w.take();
        }
    }

    public static w z(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread", new Throwable());
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        y yVar = new y();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, yVar, 1)) {
            throw new IOException("Google Play connection failed");
        }
        try {
            try {
                c cVar = new c(yVar.z());
                w wVar = new w(cVar.y(), cVar.z(true));
                LogUtil.d("taurusx", "AdvertisingIdClient get GAID: " + wVar.z() + " is limit: " + wVar.w());
                return wVar;
            } catch (Exception e10) {
                throw e10;
            }
        } finally {
            context.unbindService(yVar);
        }
    }
}
