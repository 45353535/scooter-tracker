package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.ironsource.C4240b4;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0332a f19837f = new C0332a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f19838g = a.class.getCanonicalName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static a f19839h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f19841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f19842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f19843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19844e;

    /* JADX INFO: renamed from: com.facebook.internal.a$a, reason: collision with other inner class name */
    public static final class C0332a {
        public /* synthetic */ C0332a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final a a(a aVar) {
            aVar.f19841b = System.currentTimeMillis();
            a.f19839h = aVar;
            return aVar;
        }

        private final a b(Context context) {
            a aVarC = c(context);
            if (aVarC != null) {
                return aVarC;
            }
            a aVarD = d(context);
            return aVarD == null ? new a() : aVarD;
        }

        private final a c(Context context) {
            Method methodJ;
            Object objR;
            try {
                if (!g(context) || (methodJ = z.J("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (objR = z.R(null, methodJ, context)) == null) {
                    return null;
                }
                Method methodI = z.I(objR.getClass(), "getId", new Class[0]);
                Method methodI2 = z.I(objR.getClass(), C4240b4.j.M, new Class[0]);
                if (methodI != null && methodI2 != null) {
                    a aVar = new a();
                    aVar.f19840a = (String) z.R(objR, methodI, new Object[0]);
                    Boolean bool = (Boolean) z.R(objR, methodI2, new Object[0]);
                    aVar.f19844e = bool != null ? bool.booleanValue() : false;
                    return aVar;
                }
                return null;
            } catch (Exception e10) {
                z.Z("android_id", e10);
                return null;
            }
        }

        private final a d(Context context) {
            if (!g(context)) {
                return null;
            }
            c cVar = new c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, cVar, 1)) {
                        b bVar = new b(cVar.m());
                        a aVar = new a();
                        aVar.f19840a = bVar.c();
                        aVar.f19844e = bVar.d();
                        return aVar;
                    }
                } catch (Exception e10) {
                    z.Z("android_id", e10);
                } finally {
                    context.unbindService(cVar);
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        private final String f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getInstallerPackageName(context.getPackageName());
            }
            return null;
        }

        private final boolean g(Context context) {
            Method methodJ = z.J("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (methodJ == null) {
                return false;
            }
            Object objR = z.R(null, methodJ, context);
            return (objR instanceof Integer) && Intrinsics.areEqual(objR, (Object) 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0089 A[Catch: all -> 0x0033, Exception -> 0x0037, TryCatch #5 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:14:0x003c, B:16:0x0057, B:18:0x0064, B:25:0x0083, B:27:0x0089, B:29:0x008e, B:31:0x0093, B:21:0x006e, B:23:0x007b, B:53:0x00f1, B:54:0x00f8), top: B:66:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[Catch: all -> 0x0033, Exception -> 0x0037, TryCatch #5 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:14:0x003c, B:16:0x0057, B:18:0x0064, B:25:0x0083, B:27:0x0089, B:29:0x008e, B:31:0x0093, B:21:0x006e, B:23:0x007b, B:53:0x00f1, B:54:0x00f8), top: B:66:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[Catch: all -> 0x0033, Exception -> 0x0037, TRY_LEAVE, TryCatch #5 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:14:0x003c, B:16:0x0057, B:18:0x0064, B:25:0x0083, B:27:0x0089, B:29:0x008e, B:31:0x0093, B:21:0x006e, B:23:0x007b, B:53:0x00f1, B:54:0x00f8), top: B:66:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:68:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.facebook.internal.a e(android.content.Context r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 288
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.a.C0332a.e(android.content.Context):com.facebook.internal.a");
        }

        public final boolean h(Context context) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            a aVarE = e(context);
            return aVarE != null && aVarE.k();
        }

        private C0332a() {
        }
    }

    private static final class b implements IInterface {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0333a f19845c = new C0333a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final IBinder f19846b;

        /* JADX INFO: renamed from: com.facebook.internal.a$b$a, reason: collision with other inner class name */
        public static final class C0333a {
            public /* synthetic */ C0333a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0333a() {
            }
        }

        public b(IBinder binder) {
            Intrinsics.checkNotNullParameter(binder, "binder");
            this.f19846b = binder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f19846b;
        }

        public final String c() {
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f19846b.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final boolean d() {
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.f19846b.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    private static final class c implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f19847b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final BlockingQueue f19848c = new LinkedBlockingDeque();

        public final IBinder m() throws InterruptedException {
            if (this.f19847b.compareAndSet(true, true)) {
                throw new IllegalStateException("Binder already consumed");
            }
            Object objTake = this.f19848c.take();
            Intrinsics.checkNotNullExpressionValue(objTake, "queue.take()");
            return (IBinder) objTake;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f19848c.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public final String h() {
        if (com.facebook.s.D() && com.facebook.s.l()) {
            return this.f19840a;
        }
        return null;
    }

    public final String i() {
        return this.f19843d;
    }

    public final String j() {
        return this.f19842c;
    }

    public final boolean k() {
        return this.f19844e;
    }
}
