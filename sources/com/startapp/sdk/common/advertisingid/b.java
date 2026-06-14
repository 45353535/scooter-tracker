package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.startapp.sdk.adsbase.remoteconfig.AdvertisingIdResolverMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.l0;
import com.startapp.sdk.internal.m0;
import com.startapp.sdk.internal.m3;
import com.startapp.sdk.internal.q0;
import com.startapp.sdk.internal.v5;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v5 f64165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3 f64166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f64167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Condition f64168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f64169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f64170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile int f64171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f64172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f64173j;

    public b(Context context, v5 v5Var, m3 m3Var) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f64167d = reentrantLock;
        this.f64168e = reentrantLock.newCondition();
        this.f64169f = new AtomicReference();
        this.f64170g = true;
        this.f64171h = 0;
        this.f64172i = Math.random();
        this.f64164a = context;
        this.f64165b = v5Var;
        this.f64166c = m3Var;
    }

    public final boolean a(int i10) {
        this.f64166c.getClass();
        AdvertisingIdResolverMetadata advertisingIdResolverMetadataG = MetaData.E().g();
        if (advertisingIdResolverMetadataG == null || !advertisingIdResolverMetadataG.c()) {
            advertisingIdResolverMetadataG = null;
        }
        return advertisingIdResolverMetadataG != null && this.f64172i < advertisingIdResolverMetadataG.b() && (advertisingIdResolverMetadataG.a() & i10) == i10;
    }

    public final void b(int i10) {
        if (a(i10)) {
            int i11 = this.f64173j;
            if ((i11 & i10) == i10) {
                return;
            }
            this.f64173j = i11 | i10;
            g9 g9Var = new g9(h9.f64610e);
            g9Var.f64553d = "AIR";
            g9Var.f64554e = String.valueOf(i10);
            g9Var.a();
        }
    }

    public final void a(boolean z10) {
        boolean z11 = false;
        try {
            if (this.f64167d.tryLock()) {
                z11 = true;
                this.f64170g = z10;
                if (z10 && this.f64171h == 0) {
                    this.f64165b.newThread(new a(this)).start();
                    this.f64171h = 1;
                }
                this.f64167d.unlock();
            }
        } catch (Throwable th2) {
            try {
                if (a(16)) {
                    g9.a(th2);
                }
            } finally {
                if (z11) {
                    this.f64167d.unlock();
                }
            }
        }
    }

    public static l0 b(Context context) throws Throwable {
        m0 m0Var;
        Intent intent;
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            m0Var = new m0();
        } catch (Throwable th2) {
            th = th2;
            m0Var = null;
        }
        try {
            if (context.bindService(intent, m0Var, 1)) {
                if (!m0Var.f64902b) {
                    IBinder iBinder = (IBinder) m0Var.f64901a.take();
                    if (iBinder != null) {
                        m0Var.f64902b = true;
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            String string = parcelObtain2.readString();
                            if (string != null) {
                                parcelObtain = Parcel.obtain();
                                parcelObtain2 = Parcel.obtain();
                                try {
                                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                    parcelObtain.writeInt(1);
                                    iBinder.transact(2, parcelObtain, parcelObtain2, 0);
                                    parcelObtain2.readException();
                                    boolean z10 = parcelObtain2.readInt() != 0;
                                    parcelObtain2.recycle();
                                    parcelObtain.recycle();
                                    l0 l0Var = new l0(string, "DEVICE", z10);
                                    int i10 = q0.f65128a;
                                    try {
                                        context.unbindService(m0Var);
                                    } catch (Throwable unused) {
                                    }
                                    return l0Var;
                                } finally {
                                }
                            }
                            throw new RemoteException();
                        } finally {
                        }
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
            throw new AdvertisingIdResolver$InternalException(2048);
        } catch (Throwable th3) {
            th = th3;
            int i11 = q0.f65128a;
            if (m0Var != null) {
                try {
                    context.unbindService(m0Var);
                } catch (Throwable unused2) {
                }
            }
            throw th;
        }
    }

    public final l0 a() {
        l0 l0Var;
        ReentrantLock reentrantLock;
        l0 l0Var2 = (l0) this.f64169f.get();
        if (l0Var2 != null) {
            return l0Var2;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            b(1);
            return l0.f64841d;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f64167d.tryLock(1000L, TimeUnit.MILLISECONDS)) {
                try {
                    if (!this.f64170g) {
                        l0Var = l0.f64841d;
                        reentrantLock = this.f64167d;
                    } else {
                        if (this.f64171h == 0) {
                            this.f64165b.newThread(new a(this)).start();
                            this.f64171h = 1;
                        }
                        while (this.f64171h != 2) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (jElapsedRealtime2 > 1000) {
                                b(2);
                                l0Var = l0.f64841d;
                                reentrantLock = this.f64167d;
                            } else {
                                this.f64168e.await(1000 - jElapsedRealtime2, TimeUnit.MILLISECONDS);
                            }
                        }
                        l0 l0Var3 = (l0) this.f64169f.get();
                        if (l0Var3 == null) {
                            b(4);
                            l0Var3 = l0.f64841d;
                        } else if ("00000000-0000-0000-0000-000000000000".equals(l0Var3.f64842a) && Build.VERSION.SDK_INT >= 31) {
                            try {
                            } catch (Throwable th2) {
                                if (a(8192)) {
                                    g9.a(th2);
                                }
                            }
                            if (this.f64164a.checkSelfPermission("com.google.android.gms.permission.AD_ID") != 0) {
                                b(4096);
                            }
                        }
                        this.f64167d.unlock();
                        return l0Var3;
                    }
                    reentrantLock.unlock();
                    return l0Var;
                } catch (Throwable th3) {
                    this.f64167d.unlock();
                    throw th3;
                }
            }
            b(8);
            return l0.f64841d;
        } catch (Throwable th4) {
            if (a(32)) {
                g9.a(th4);
            }
            return l0.f64841d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.startapp.sdk.internal.l0 a(android.content.Context r14) throws java.lang.IllegalAccessException, com.startapp.sdk.common.advertisingid.AdvertisingIdResolver$InternalException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.common.advertisingid.b.a(android.content.Context):com.startapp.sdk.internal.l0");
    }
}
