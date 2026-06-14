package com.mbridge.msdk.foundation.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f48951b;

        b(String str, boolean z10) {
            this.f48950a = str;
            this.f48951b = z10;
        }

        public String a() {
            return this.f48950a;
        }

        public boolean b() {
            return this.f48951b;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.c$c, reason: collision with other inner class name */
    private final class ServiceConnectionC0523c implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f48953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f48954b;

        private ServiceConnectionC0523c() {
            this.f48953a = new LinkedBlockingQueue<>(1);
            this.f48954b = false;
        }

        public IBinder a() throws InterruptedException {
            if (this.f48954b) {
                throw new IllegalStateException();
            }
            this.f48954b = true;
            return this.f48953a.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f48953a.put(iBinder);
            } catch (InterruptedException e10) {
                q0.b("AdvertisingIdClient", e10.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private final class d implements IInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IBinder f48956a;

        public d(IBinder iBinder) {
            this.f48956a = iBinder;
        }

        public boolean a(boolean z10) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z10 ? 1 : 0);
                this.f48956a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } catch (Throwable th2) {
                try {
                    q0.b("AdvertisingIdClient", th2.getMessage());
                    return false;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f48956a;
        }

        public String getId() throws RemoteException {
            String string;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f48956a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } catch (Throwable th2) {
                try {
                    q0.b("AdvertisingIdClient", th2.getMessage());
                    string = null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
            return string;
        }
    }

    public b a(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        ServiceConnectionC0523c serviceConnectionC0523c = new ServiceConnectionC0523c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, serviceConnectionC0523c, 1)) {
            throw new IOException("Google Play connection failed");
        }
        try {
            try {
                d dVar = new d(serviceConnectionC0523c.a());
                return new b(dVar.getId(), dVar.a(true));
            } catch (Exception e10) {
                throw e10;
            }
        } finally {
            context.unbindService(serviceConnectionC0523c);
        }
    }
}
