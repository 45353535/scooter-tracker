package sg.bigo.ads.common.l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class c {

    static final class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f102543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f102544b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final LinkedBlockingQueue<IBinder> f102545c = new LinkedBlockingQueue<>(1);

        public a(long j10) {
            this.f102543a = j10;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f102545c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    static final class b implements IInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IBinder f102546a;

        public b(IBinder iBinder) {
            this.f102546a = iBinder;
        }

        public final String a() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f102546a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f102546a;
        }

        public final Boolean b() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z10 = true;
                parcelObtain.writeInt(1);
                this.f102546a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public static sg.bigo.ads.common.a a(Context context, long j10) throws PackageManager.NameNotFoundException, IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Google Play Services info can't be accessed from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        a aVar = new a(j10);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aVar, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                if (aVar.f102544b) {
                    throw new IllegalStateException();
                }
                aVar.f102544b = true;
                b bVar = new b(aVar.f102545c.poll(aVar.f102543a, TimeUnit.MILLISECONDS));
                String strA = bVar.a();
                Boolean boolB = bVar.b();
                if (strA != null && boolB != null) {
                    return new sg.bigo.ads.common.a(strA, boolB.booleanValue());
                }
                context.unbindService(aVar);
                return null;
            } catch (Exception e10) {
                throw e10;
            }
        } finally {
            context.unbindService(aVar);
        }
    }
}
